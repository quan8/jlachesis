// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/flagTableWrapper.proto

package poset.proto;

public final class PFlagTableWrapper {
  private PFlagTableWrapper() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FlagTableWrapperOrBuilder extends
      // @@protoc_insertion_point(interface_extends:poset.proto.FlagTableWrapper)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */
    int getBodyCount();
    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */
    boolean containsBody(
        java.lang.String key);
    /**
     * Use {@link #getBodyMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.Long>
    getBody();
    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */
    java.util.Map<java.lang.String, java.lang.Long>
    getBodyMap();
    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */

    long getBodyOrDefault(
        java.lang.String key,
        long defaultValue);
    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */

    long getBodyOrThrow(
        java.lang.String key);
  }
  /**
   * Protobuf type {@code poset.proto.FlagTableWrapper}
   */
  public  static final class FlagTableWrapper extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:poset.proto.FlagTableWrapper)
      FlagTableWrapperOrBuilder {
    // Use FlagTableWrapper.newBuilder() to construct.
    private FlagTableWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FlagTableWrapper() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private FlagTableWrapper(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                body_ = com.google.protobuf.MapField.newMapField(
                    BodyDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
              body__ = input.readMessage(
                  BodyDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              body_.getMutableMap().put(
                  body__.getKey(), body__.getValue());
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return poset.proto.PFlagTableWrapper.internal_static_poset_proto_FlagTableWrapper_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetBody();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return poset.proto.PFlagTableWrapper.internal_static_poset_proto_FlagTableWrapper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              poset.proto.PFlagTableWrapper.FlagTableWrapper.class, poset.proto.PFlagTableWrapper.FlagTableWrapper.Builder.class);
    }

    public static final int BODY_FIELD_NUMBER = 1;
    private static final class BodyDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, java.lang.Long> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, java.lang.Long>newDefaultInstance(
                  poset.proto.PFlagTableWrapper.internal_static_poset_proto_FlagTableWrapper_BodyEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.INT64,
                  0L);
    }
    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> body_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetBody() {
      if (body_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BodyDefaultEntryHolder.defaultEntry);
      }
      return body_;
    }

    public int getBodyCount() {
      return internalGetBody().getMap().size();
    }
    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */

    public boolean containsBody(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetBody().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBodyMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getBody() {
      return getBodyMap();
    }
    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Long> getBodyMap() {
      return internalGetBody().getMap();
    }
    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */

    public long getBodyOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetBody().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int64&gt; Body = 1;</code>
     */

    public long getBodyOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetBody().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .serializeStringMapTo(
          output,
          internalGetBody(),
          BodyDefaultEntryHolder.defaultEntry,
          1);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
           : internalGetBody().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
        body__ = BodyDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, body__);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof poset.proto.PFlagTableWrapper.FlagTableWrapper)) {
        return super.equals(obj);
      }
      poset.proto.PFlagTableWrapper.FlagTableWrapper other = (poset.proto.PFlagTableWrapper.FlagTableWrapper) obj;

      boolean result = true;
      result = result && internalGetBody().equals(
          other.internalGetBody());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (!internalGetBody().getMap().isEmpty()) {
        hash = (37 * hash) + BODY_FIELD_NUMBER;
        hash = (53 * hash) + internalGetBody().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static poset.proto.PFlagTableWrapper.FlagTableWrapper parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(poset.proto.PFlagTableWrapper.FlagTableWrapper prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code poset.proto.FlagTableWrapper}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:poset.proto.FlagTableWrapper)
        poset.proto.PFlagTableWrapper.FlagTableWrapperOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return poset.proto.PFlagTableWrapper.internal_static_poset_proto_FlagTableWrapper_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetBody();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableBody();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return poset.proto.PFlagTableWrapper.internal_static_poset_proto_FlagTableWrapper_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                poset.proto.PFlagTableWrapper.FlagTableWrapper.class, poset.proto.PFlagTableWrapper.FlagTableWrapper.Builder.class);
      }

      // Construct using poset.proto.PFlagTableWrapper.FlagTableWrapper.newBuilder()
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
      public Builder clear() {
        super.clear();
        internalGetMutableBody().clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return poset.proto.PFlagTableWrapper.internal_static_poset_proto_FlagTableWrapper_descriptor;
      }

      public poset.proto.PFlagTableWrapper.FlagTableWrapper getDefaultInstanceForType() {
        return poset.proto.PFlagTableWrapper.FlagTableWrapper.getDefaultInstance();
      }

      public poset.proto.PFlagTableWrapper.FlagTableWrapper build() {
        poset.proto.PFlagTableWrapper.FlagTableWrapper result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public poset.proto.PFlagTableWrapper.FlagTableWrapper buildPartial() {
        poset.proto.PFlagTableWrapper.FlagTableWrapper result = new poset.proto.PFlagTableWrapper.FlagTableWrapper(this);
        int from_bitField0_ = bitField0_;
        result.body_ = internalGetBody();
        result.body_.makeImmutable();
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof poset.proto.PFlagTableWrapper.FlagTableWrapper) {
          return mergeFrom((poset.proto.PFlagTableWrapper.FlagTableWrapper)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(poset.proto.PFlagTableWrapper.FlagTableWrapper other) {
        if (other == poset.proto.PFlagTableWrapper.FlagTableWrapper.getDefaultInstance()) return this;
        internalGetMutableBody().mergeFrom(
            other.internalGetBody());
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        poset.proto.PFlagTableWrapper.FlagTableWrapper parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (poset.proto.PFlagTableWrapper.FlagTableWrapper) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.String, java.lang.Long> body_;
      private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
      internalGetBody() {
        if (body_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              BodyDefaultEntryHolder.defaultEntry);
        }
        return body_;
      }
      private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
      internalGetMutableBody() {
        onChanged();;
        if (body_ == null) {
          body_ = com.google.protobuf.MapField.newMapField(
              BodyDefaultEntryHolder.defaultEntry);
        }
        if (!body_.isMutable()) {
          body_ = body_.copy();
        }
        return body_;
      }

      public int getBodyCount() {
        return internalGetBody().getMap().size();
      }
      /**
       * <code>map&lt;string, int64&gt; Body = 1;</code>
       */

      public boolean containsBody(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetBody().getMap().containsKey(key);
      }
      /**
       * Use {@link #getBodyMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Long> getBody() {
        return getBodyMap();
      }
      /**
       * <code>map&lt;string, int64&gt; Body = 1;</code>
       */

      public java.util.Map<java.lang.String, java.lang.Long> getBodyMap() {
        return internalGetBody().getMap();
      }
      /**
       * <code>map&lt;string, int64&gt; Body = 1;</code>
       */

      public long getBodyOrDefault(
          java.lang.String key,
          long defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.Long> map =
            internalGetBody().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, int64&gt; Body = 1;</code>
       */

      public long getBodyOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.Long> map =
            internalGetBody().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearBody() {
        internalGetMutableBody().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, int64&gt; Body = 1;</code>
       */

      public Builder removeBody(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableBody().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Long>
      getMutableBody() {
        return internalGetMutableBody().getMutableMap();
      }
      /**
       * <code>map&lt;string, int64&gt; Body = 1;</code>
       */
      public Builder putBody(
          java.lang.String key,
          long value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        
        internalGetMutableBody().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, int64&gt; Body = 1;</code>
       */

      public Builder putAllBody(
          java.util.Map<java.lang.String, java.lang.Long> values) {
        internalGetMutableBody().getMutableMap()
            .putAll(values);
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:poset.proto.FlagTableWrapper)
    }

    // @@protoc_insertion_point(class_scope:poset.proto.FlagTableWrapper)
    private static final poset.proto.PFlagTableWrapper.FlagTableWrapper DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new poset.proto.PFlagTableWrapper.FlagTableWrapper();
    }

    public static poset.proto.PFlagTableWrapper.FlagTableWrapper getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FlagTableWrapper>
        PARSER = new com.google.protobuf.AbstractParser<FlagTableWrapper>() {
      public FlagTableWrapper parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new FlagTableWrapper(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FlagTableWrapper> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FlagTableWrapper> getParserForType() {
      return PARSER;
    }

    public poset.proto.PFlagTableWrapper.FlagTableWrapper getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_FlagTableWrapper_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_FlagTableWrapper_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_FlagTableWrapper_BodyEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_FlagTableWrapper_BodyEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034poset/flagTableWrapper.proto\022\013poset.pr" +
      "oto\"v\n\020FlagTableWrapper\0225\n\004Body\030\001 \003(\0132\'." +
      "poset.proto.FlagTableWrapper.BodyEntry\032+" +
      "\n\tBodyEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\003:" +
      "\0028\001B\023B\021PFlagTableWrapperb\006proto3"
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
    internal_static_poset_proto_FlagTableWrapper_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_poset_proto_FlagTableWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_FlagTableWrapper_descriptor,
        new java.lang.String[] { "Body", });
    internal_static_poset_proto_FlagTableWrapper_BodyEntry_descriptor =
      internal_static_poset_proto_FlagTableWrapper_descriptor.getNestedTypes().get(0);
    internal_static_poset_proto_FlagTableWrapper_BodyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_FlagTableWrapper_BodyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
