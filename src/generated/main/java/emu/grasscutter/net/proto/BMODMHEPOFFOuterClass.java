// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BMODMHEPOFF.proto

package emu.grasscutter.net.proto;

public final class BMODMHEPOFFOuterClass {
  private BMODMHEPOFFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BMODMHEPOFFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BMODMHEPOFF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 HJMMAOMEHOL = 10;</code>
     * @return The hJMMAOMEHOL.
     */
    int getHJMMAOMEHOL();
  }
  /**
   * <pre>
   * CmdId: 2225
   * </pre>
   *
   * Protobuf type {@code BMODMHEPOFF}
   */
  public static final class BMODMHEPOFF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BMODMHEPOFF)
      BMODMHEPOFFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BMODMHEPOFF.newBuilder() to construct.
    private BMODMHEPOFF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BMODMHEPOFF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BMODMHEPOFF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BMODMHEPOFF(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 80: {

              hJMMAOMEHOL_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.internal_static_BMODMHEPOFF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.internal_static_BMODMHEPOFF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF.class, emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF.Builder.class);
    }

    public static final int HJMMAOMEHOL_FIELD_NUMBER = 10;
    private int hJMMAOMEHOL_;
    /**
     * <code>uint32 HJMMAOMEHOL = 10;</code>
     * @return The hJMMAOMEHOL.
     */
    @java.lang.Override
    public int getHJMMAOMEHOL() {
      return hJMMAOMEHOL_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hJMMAOMEHOL_ != 0) {
        output.writeUInt32(10, hJMMAOMEHOL_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hJMMAOMEHOL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, hJMMAOMEHOL_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF other = (emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF) obj;

      if (getHJMMAOMEHOL()
          != other.getHJMMAOMEHOL()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HJMMAOMEHOL_FIELD_NUMBER;
      hash = (53 * hash) + getHJMMAOMEHOL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 2225
     * </pre>
     *
     * Protobuf type {@code BMODMHEPOFF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BMODMHEPOFF)
        emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.internal_static_BMODMHEPOFF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.internal_static_BMODMHEPOFF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF.class, emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hJMMAOMEHOL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.internal_static_BMODMHEPOFF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF build() {
        emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF buildPartial() {
        emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF result = new emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF(this);
        result.hJMMAOMEHOL_ = hJMMAOMEHOL_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF) {
          return mergeFrom((emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF other) {
        if (other == emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF.getDefaultInstance()) return this;
        if (other.getHJMMAOMEHOL() != 0) {
          setHJMMAOMEHOL(other.getHJMMAOMEHOL());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hJMMAOMEHOL_ ;
      /**
       * <code>uint32 HJMMAOMEHOL = 10;</code>
       * @return The hJMMAOMEHOL.
       */
      @java.lang.Override
      public int getHJMMAOMEHOL() {
        return hJMMAOMEHOL_;
      }
      /**
       * <code>uint32 HJMMAOMEHOL = 10;</code>
       * @param value The hJMMAOMEHOL to set.
       * @return This builder for chaining.
       */
      public Builder setHJMMAOMEHOL(int value) {
        
        hJMMAOMEHOL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HJMMAOMEHOL = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearHJMMAOMEHOL() {
        
        hJMMAOMEHOL_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BMODMHEPOFF)
    }

    // @@protoc_insertion_point(class_scope:BMODMHEPOFF)
    private static final emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF();
    }

    public static emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BMODMHEPOFF>
        PARSER = new com.google.protobuf.AbstractParser<BMODMHEPOFF>() {
      @java.lang.Override
      public BMODMHEPOFF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BMODMHEPOFF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BMODMHEPOFF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BMODMHEPOFF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BMODMHEPOFFOuterClass.BMODMHEPOFF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BMODMHEPOFF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BMODMHEPOFF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BMODMHEPOFF.proto\"\"\n\013BMODMHEPOFF\022\023\n\013HJ" +
      "MMAOMEHOL\030\n \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BMODMHEPOFF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BMODMHEPOFF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BMODMHEPOFF_descriptor,
        new java.lang.String[] { "HJMMAOMEHOL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}