/*
 * Copyright (c) 2019. Kin-Hong Wong. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ==============================================================================
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object_detection/protos/bipartite_matcher.proto

package object_detection.protos;

public final class BipartiteMatcherOuterClass {
  private BipartiteMatcherOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BipartiteMatcherOrBuilder extends
      // @@protoc_insertion_point(interface_extends:object_detection.protos.BipartiteMatcher)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Force constructed match objects to use matrix multiplication based gather
     * instead of standard tf.gather
     * </pre>
     *
     * <code>optional bool use_matmul_gather = 6 [default = false];</code>
     */
    boolean hasUseMatmulGather();
    /**
     * <pre>
     * Force constructed match objects to use matrix multiplication based gather
     * instead of standard tf.gather
     * </pre>
     *
     * <code>optional bool use_matmul_gather = 6 [default = false];</code>
     */
    boolean getUseMatmulGather();
  }
  /**
   * <pre>
   * Configuration proto for bipartite matcher. See
   * matchers/bipartite_matcher.py for details.
   * </pre>
   *
   * Protobuf type {@code object_detection.protos.BipartiteMatcher}
   */
  public  static final class BipartiteMatcher extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:object_detection.protos.BipartiteMatcher)
      BipartiteMatcherOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BipartiteMatcher.newBuilder() to construct.
    private BipartiteMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BipartiteMatcher() {
      useMatmulGather_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BipartiteMatcher(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 48: {
              bitField0_ |= 0x00000001;
              useMatmulGather_ = input.readBool();
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
      return object_detection.protos.BipartiteMatcherOuterClass.internal_static_object_detection_protos_BipartiteMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return object_detection.protos.BipartiteMatcherOuterClass.internal_static_object_detection_protos_BipartiteMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher.class, object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher.Builder.class);
    }

    private int bitField0_;
    public static final int USE_MATMUL_GATHER_FIELD_NUMBER = 6;
    private boolean useMatmulGather_;
    /**
     * <pre>
     * Force constructed match objects to use matrix multiplication based gather
     * instead of standard tf.gather
     * </pre>
     *
     * <code>optional bool use_matmul_gather = 6 [default = false];</code>
     */
    public boolean hasUseMatmulGather() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Force constructed match objects to use matrix multiplication based gather
     * instead of standard tf.gather
     * </pre>
     *
     * <code>optional bool use_matmul_gather = 6 [default = false];</code>
     */
    public boolean getUseMatmulGather() {
      return useMatmulGather_;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(6, useMatmulGather_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, useMatmulGather_);
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
      if (!(obj instanceof object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher)) {
        return super.equals(obj);
      }
      object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher other = (object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher) obj;

      boolean result = true;
      result = result && (hasUseMatmulGather() == other.hasUseMatmulGather());
      if (hasUseMatmulGather()) {
        result = result && (getUseMatmulGather()
            == other.getUseMatmulGather());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasUseMatmulGather()) {
        hash = (37 * hash) + USE_MATMUL_GATHER_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getUseMatmulGather());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parseFrom(
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
    public static Builder newBuilder(object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher prototype) {
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
     * Configuration proto for bipartite matcher. See
     * matchers/bipartite_matcher.py for details.
     * </pre>
     *
     * Protobuf type {@code object_detection.protos.BipartiteMatcher}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:object_detection.protos.BipartiteMatcher)
        object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcherOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return object_detection.protos.BipartiteMatcherOuterClass.internal_static_object_detection_protos_BipartiteMatcher_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return object_detection.protos.BipartiteMatcherOuterClass.internal_static_object_detection_protos_BipartiteMatcher_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher.class, object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher.Builder.class);
      }

      // Construct using object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher.newBuilder()
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
        useMatmulGather_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return object_detection.protos.BipartiteMatcherOuterClass.internal_static_object_detection_protos_BipartiteMatcher_descriptor;
      }

      @java.lang.Override
      public object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher getDefaultInstanceForType() {
        return object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher.getDefaultInstance();
      }

      @java.lang.Override
      public object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher build() {
        object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher buildPartial() {
        object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher result = new object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.useMatmulGather_ = useMatmulGather_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher) {
          return mergeFrom((object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher other) {
        if (other == object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher.getDefaultInstance()) return this;
        if (other.hasUseMatmulGather()) {
          setUseMatmulGather(other.getUseMatmulGather());
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
        object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean useMatmulGather_ ;
      /**
       * <pre>
       * Force constructed match objects to use matrix multiplication based gather
       * instead of standard tf.gather
       * </pre>
       *
       * <code>optional bool use_matmul_gather = 6 [default = false];</code>
       */
      public boolean hasUseMatmulGather() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       * Force constructed match objects to use matrix multiplication based gather
       * instead of standard tf.gather
       * </pre>
       *
       * <code>optional bool use_matmul_gather = 6 [default = false];</code>
       */
      public boolean getUseMatmulGather() {
        return useMatmulGather_;
      }
      /**
       * <pre>
       * Force constructed match objects to use matrix multiplication based gather
       * instead of standard tf.gather
       * </pre>
       *
       * <code>optional bool use_matmul_gather = 6 [default = false];</code>
       */
      public Builder setUseMatmulGather(boolean value) {
        bitField0_ |= 0x00000001;
        useMatmulGather_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Force constructed match objects to use matrix multiplication based gather
       * instead of standard tf.gather
       * </pre>
       *
       * <code>optional bool use_matmul_gather = 6 [default = false];</code>
       */
      public Builder clearUseMatmulGather() {
        bitField0_ = (bitField0_ & ~0x00000001);
        useMatmulGather_ = false;
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


      // @@protoc_insertion_point(builder_scope:object_detection.protos.BipartiteMatcher)
    }

    // @@protoc_insertion_point(class_scope:object_detection.protos.BipartiteMatcher)
    private static final object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher();
    }

    public static object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<BipartiteMatcher>
        PARSER = new com.google.protobuf.AbstractParser<BipartiteMatcher>() {
      @java.lang.Override
      public BipartiteMatcher parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BipartiteMatcher(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BipartiteMatcher> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BipartiteMatcher> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public object_detection.protos.BipartiteMatcherOuterClass.BipartiteMatcher getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_detection_protos_BipartiteMatcher_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_detection_protos_BipartiteMatcher_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/object_detection/protos/bipartite_matc" +
      "her.proto\022\027object_detection.protos\"4\n\020Bi" +
      "partiteMatcher\022 \n\021use_matmul_gather\030\006 \001(" +
      "\010:\005false"
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
    internal_static_object_detection_protos_BipartiteMatcher_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_object_detection_protos_BipartiteMatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_detection_protos_BipartiteMatcher_descriptor,
        new java.lang.String[] { "UseMatmulGather", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
