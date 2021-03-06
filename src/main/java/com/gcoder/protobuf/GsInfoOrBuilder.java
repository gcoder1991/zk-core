// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package com.gcoder.protobuf;

public interface GsInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zookeeper.protobuf.GsInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 启动时间
   * </pre>
   *
   * <code>int64 startTime = 1;</code>
   */
  long getStartTime();

  /**
   * <pre>
   * 操作人
   * </pre>
   *
   * <code>string operator = 2;</code>
   */
  java.lang.String getOperator();
  /**
   * <pre>
   * 操作人
   * </pre>
   *
   * <code>string operator = 2;</code>
   */
  com.google.protobuf.ByteString
      getOperatorBytes();

  /**
   * <pre>
   * 进程号
   * </pre>
   *
   * <code>string pid = 3;</code>
   */
  java.lang.String getPid();
  /**
   * <pre>
   * 进程号
   * </pre>
   *
   * <code>string pid = 3;</code>
   */
  com.google.protobuf.ByteString
      getPidBytes();

  /**
   * <pre>
   * 主机地址
   * </pre>
   *
   * <code>string hostAddress = 4;</code>
   */
  java.lang.String getHostAddress();
  /**
   * <pre>
   * 主机地址
   * </pre>
   *
   * <code>string hostAddress = 4;</code>
   */
  com.google.protobuf.ByteString
      getHostAddressBytes();

  /**
   * <pre>
   * 是否可用
   * </pre>
   *
   * <code>bool enable = 5;</code>
   */
  boolean getEnable();

  /**
   * <pre>
   * 人数上限
   * </pre>
   *
   * <code>int32 numLimit = 6;</code>
   */
  int getNumLimit();

  /**
   * <pre>
   * 在线人数
   * </pre>
   *
   * <code>int32 numOnline = 7;</code>
   */
  int getNumOnline();

  /**
   * <pre>
   * 服务器版本
   * </pre>
   *
   * <code>string version = 8;</code>
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * 服务器版本
   * </pre>
   *
   * <code>string version = 8;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
