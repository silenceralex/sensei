// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensei-generic-res.proto

package com.sensei.search.req.protobuf;

public final class SenseiGenericResultBPO {
  private SenseiGenericResultBPO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GenericResult extends
      com.google.protobuf.GeneratedMessage {
    // Use GenericResult.newBuilder() to construct.
    private GenericResult() {
      initFields();
    }
    private GenericResult(boolean noInit) {}
    
    private static final GenericResult defaultInstance;
    public static GenericResult getDefaultInstance() {
      return defaultInstance;
    }
    
    public GenericResult getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sensei.search.req.protobuf.SenseiGenericResultBPO.internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sensei.search.req.protobuf.SenseiGenericResultBPO.internal_static_com_sensei_search_req_protobuf_GenericResult_fieldAccessorTable;
    }
    
    // required string classname = 1;
    public static final int CLASSNAME_FIELD_NUMBER = 1;
    private boolean hasClassname;
    private java.lang.String classname_ = "";
    public boolean hasClassname() { return hasClassname; }
    public java.lang.String getClassname() { return classname_; }
    
    // required bytes val = 2;
    public static final int VAL_FIELD_NUMBER = 2;
    private boolean hasVal;
    private com.google.protobuf.ByteString val_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasVal() { return hasVal; }
    public com.google.protobuf.ByteString getVal() { return val_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasClassname) return false;
      if (!hasVal) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasClassname()) {
        output.writeString(1, getClassname());
      }
      if (hasVal()) {
        output.writeBytes(2, getVal());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasClassname()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getClassname());
      }
      if (hasVal()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getVal());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult result;
      
      // Construct using com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult();
        return builder;
      }
      
      protected com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.getDescriptor();
      }
      
      public com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult getDefaultInstanceForType() {
        return com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult) {
          return mergeFrom((com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult other) {
        if (other == com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.getDefaultInstance()) return this;
        if (other.hasClassname()) {
          setClassname(other.getClassname());
        }
        if (other.hasVal()) {
          setVal(other.getVal());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setClassname(input.readString());
              break;
            }
            case 18: {
              setVal(input.readBytes());
              break;
            }
          }
        }
      }
      
      
      // required string classname = 1;
      public boolean hasClassname() {
        return result.hasClassname();
      }
      public java.lang.String getClassname() {
        return result.getClassname();
      }
      public Builder setClassname(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasClassname = true;
        result.classname_ = value;
        return this;
      }
      public Builder clearClassname() {
        result.hasClassname = false;
        result.classname_ = getDefaultInstance().getClassname();
        return this;
      }
      
      // required bytes val = 2;
      public boolean hasVal() {
        return result.hasVal();
      }
      public com.google.protobuf.ByteString getVal() {
        return result.getVal();
      }
      public Builder setVal(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasVal = true;
        result.val_ = value;
        return this;
      }
      public Builder clearVal() {
        result.hasVal = false;
        result.val_ = getDefaultInstance().getVal();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.sensei.search.req.protobuf.GenericResult)
    }
    
    static {
      defaultInstance = new GenericResult(true);
      com.sensei.search.req.protobuf.SenseiGenericResultBPO.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.sensei.search.req.protobuf.GenericResult)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_sensei_search_req_protobuf_GenericResult_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030sensei-generic-res.proto\022\036com.sensei.s" +
      "earch.req.protobuf\"/\n\rGenericResult\022\021\n\tc" +
      "lassname\030\001 \002(\t\022\013\n\003val\030\002 \002(\014B:\n\036com.sense" +
      "i.search.req.protobufB\026SenseiGenericResu" +
      "ltBPOH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_sensei_search_req_protobuf_GenericResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor,
              new java.lang.String[] { "Classname", "Val", },
              com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.class,
              com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}