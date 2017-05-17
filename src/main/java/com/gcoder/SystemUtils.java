package com.gcoder;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gcoder on 2017/5/16.
 */
public final class SystemUtils {

    public static final String FILE_SYS_INFO = "sys.info";

    public static String getLocalHost() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }

    public static String getPid() {
        return ManagementFactory.getRuntimeMXBean().getName();
    }

    public static String getSysUser() {
        return System.getProperty("user.name");
    }

    public static void createSysInfoFile(Map<String, String> info) throws IOException {
        Path newFile = Paths.get(".".concat(File.separator).concat(FILE_SYS_INFO));
        if (Files.exists(newFile, LinkOption.NOFOLLOW_LINKS)) {
            Path backFile = Paths.get(".".concat(File.separator).concat(FILE_SYS_INFO).concat(".bak"));
            Files.deleteIfExists(backFile);
            Files.move(newFile, backFile);
        }

        List<String> content = new ArrayList<>();
        content.add("SYS_INFO");
        content.add("start time".concat("\t").concat(":").concat("\t").concat(LocalDateTime.now().toString()));
        content.add("operator".concat("\t").concat(":").concat("\t").concat(getSysUser()));
        content.add("pid".concat("\t").concat(":").concat("\t").concat(getPid()));
        content.add("host address".concat("\t").concat(":").concat("\t").concat(getLocalHost()));
        content.add("\n");
        if (info != null) {
            for (Map.Entry<String, String> entry : info.entrySet()){
                content.add(entry.getKey().concat("\t").concat(":").concat("\t").concat(entry.getValue()));
            }
        }
        Files.write(newFile, content, Charset.defaultCharset(), StandardOpenOption.CREATE);
    }


    public static void main(String[] args) throws UnknownHostException {
        System.out.println(getLocalHost());
        System.out.println(getSysUser());
    }

}
