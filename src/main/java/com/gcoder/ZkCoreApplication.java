package com.gcoder;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZkCoreApplication {

	private final static String ZK = "127.0.0.1:2181";

	private final static String NAMESPACE = "namespace";

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(ZkCoreApplication.class, args);
		CuratorFramework curator = ctx.getBean(CuratorFramework.class);
		curator.start();
		curator.usingNamespace(NAMESPACE);


		CuratorService curatorService = ctx.getBean(CuratorService.class);
		curatorService.registerServer("gameServer");

		SystemUtils.createSysInfoFile(null);

		Thread.sleep(Integer.MAX_VALUE);
	}

	@Bean
	public CuratorFramework curatorFramework() {
		return CuratorFrameworkFactory.newClient(ZK, new ExponentialBackoffRetry(1000, 3));
	}

}
