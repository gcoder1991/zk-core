// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package com.gcoder.protobuf;

public final class metadataProto {
  private metadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zookeeper_protobuf_GsInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zookeeper_protobuf_GsInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zookeeper_protobuf_RoleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zookeeper_protobuf_RoleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016metadata.proto\022\022zookeeper.protobuf\"\225\001\n" +
      "\006GsInfo\022\021\n\tstartTime\030\001 \001(\003\022\020\n\010operator\030\002" +
      " \001(\t\022\013\n\003pid\030\003 \001(\t\022\023\n\013hostAddress\030\004 \001(\t\022\016" +
      "\n\006enable\030\005 \001(\010\022\020\n\010numLimit\030\006 \001(\005\022\021\n\tnumO" +
      "nline\030\007 \001(\005\022\017\n\007version\030\010 \001(\t\">\n\010RoleInfo" +
      "\022\020\n\010serverId\030\001 \001(\t\022\021\n\tloginTime\030\002 \001(\003\022\r\n" +
      "\005state\030\003 \001(\005B&\n\023com.gcoder.protobufB\rmet" +
      "adataProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_zookeeper_protobuf_GsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zookeeper_protobuf_GsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zookeeper_protobuf_GsInfo_descriptor,
        new java.lang.String[] { "StartTime", "Operator", "Pid", "HostAddress", "Enable", "NumLimit", "NumOnline", "Version", });
    internal_static_zookeeper_protobuf_RoleInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_zookeeper_protobuf_RoleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zookeeper_protobuf_RoleInfo_descriptor,
        new java.lang.String[] { "ServerId", "LoginTime", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
