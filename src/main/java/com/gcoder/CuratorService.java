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

    public String registerServer(String group, byte[] data) throws Exception {
        return curator.create().creatingParentsIfNeeded()
                .withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
                .forPath(ZkConst.PATH_SEPARATOR.concat(group).concat(ZkConst.PATH_SEPARATOR).concat(group)
                , data);
    }

    public void unregisterServer(String group) throws Exception {
        curator.delete().deletingChildrenIfNeeded()
                .forPath(ZkConst.PATH_SEPARATOR.concat(group).concat(ZkConst.PATH_SEPARATOR).concat(group));
    }

    public byte[] getNodeData(String path) throws Exception {
        return curator.getData().forPath(path);
    }

    public void setNodeData(String path, byte[] data) throws Exception {
        curator.setData().forPath(path, data);
    }

    public static void main(String[] args) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name);
    }

}
