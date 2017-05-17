package com.gcoder;

import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.management.ManagementFactory;

/**
 * Created by gcoder on 2017/5/12.
 */
@Service
public final class CuratorService {

    @Resource
    private CuratorFramework curator;

    public void registerServer(String group) throws Exception {
        String path = curator.create().creatingParentsIfNeeded()
                .withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
                .forPath(ZkConst.PATH_SEPARATOR.concat(group).concat(ZkConst.PATH_SEPARATOR).concat(group));
//        curator.setData().forPath(path).write();
        System.out.println("path : ".concat(path));
    }

    public void unregisterServer(String group) throws Exception {

    }

    public static void main(String[] args) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name);
    }

}
