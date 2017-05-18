package com.gcoder;

import com.gcoder.protobuf.GsInfo;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ZkCoreApplication {

	private final static String ZK = "127.0.0.1:2181";

	private final static String NAMESPACE = "namespace";

	public static void main(String[] args) throws Exception {

		SpringApplication.run(ZkCoreApplication.class, args);

        Map<String, String> systemInfo = new HashMap<>();

		CuratorFramework curator = SpringUtils.getBean(CuratorFramework.class);
		curator.start();
		curator.usingNamespace(NAMESPACE);

		CuratorService curatorService = SpringUtils.getBean(CuratorService.class);
		ServerConfig serverConfig = SpringUtils.getBean(ServerConfig.class);

		GsInfo.Builder gsInfo = GsInfo.newBuilder()
				.setEnable(false)
				.setHostAddress(SystemUtils.getLocalHost())
				.setNumLimit(serverConfig.getNumLimit())
				.setNumOnline(0)
				.setOperator(SystemUtils.getSysUser())
				.setPid(SystemUtils.getPid())
				.setStartTime(System.currentTimeMillis())
                .setVersion(serverConfig.getVersion());

        String path = curatorService.registerServer("gameServer", gsInfo.build().toByteArray());

        byte[] nodeData = curatorService.getNodeData(path);
        System.out.println(GsInfo.parseFrom(nodeData).toString());

        systemInfo.put("zkPath", path);
        SystemUtils.createSysInfoFile(systemInfo);

		Thread.sleep(Integer.MAX_VALUE);
	}

	@Bean
	public CuratorFramework curatorFramework() {
		return CuratorFrameworkFactory.newClient(ZK, new ExponentialBackoffRetry(1000, 3));
	}

}
