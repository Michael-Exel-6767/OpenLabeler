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
// source: object_detection/protos/model.proto

package object_detection.protos;

public final class Model {
  private Model() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DetectionModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:object_detection.protos.DetectionModel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
     */
    boolean hasFasterRcnn();
    /**
     * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
     */
    object_detection.protos.FasterRcnnOuterClass.FasterRcnn getFasterRcnn();
    /**
     * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
     */
    object_detection.protos.FasterRcnnOuterClass.FasterRcnnOrBuilder getFasterRcnnOrBuilder();

    /**
     * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
     */
    boolean hasSsd();
    /**
     * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
     */
    object_detection.protos.SsdOuterClass.Ssd getSsd();
    /**
     * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
     */
    object_detection.protos.SsdOuterClass.SsdOrBuilder getSsdOrBuilder();

    public object_detection.protos.Model.DetectionModel.ModelCase getModelCase();
  }
  /**
   * <pre>
   * Top level configuration for DetectionModels.
   * </pre>
   *
   * Protobuf type {@code object_detection.protos.DetectionModel}
   */
  public  static final class DetectionModel extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:object_detection.protos.DetectionModel)
      DetectionModelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DetectionModel.newBuilder() to construct.
    private DetectionModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DetectionModel() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DetectionModel(
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
            case 10: {
              object_detection.protos.FasterRcnnOuterClass.FasterRcnn.Builder subBuilder = null;
              if (modelCase_ == 1) {
                subBuilder = ((object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_).toBuilder();
              }
              model_ =
                  input.readMessage(object_detection.protos.FasterRcnnOuterClass.FasterRcnn.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_);
                model_ = subBuilder.buildPartial();
              }
              modelCase_ = 1;
              break;
            }
            case 18: {
              object_detection.protos.SsdOuterClass.Ssd.Builder subBuilder = null;
              if (modelCase_ == 2) {
                subBuilder = ((object_detection.protos.SsdOuterClass.Ssd) model_).toBuilder();
              }
              model_ =
                  input.readMessage(object_detection.protos.SsdOuterClass.Ssd.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((object_detection.protos.SsdOuterClass.Ssd) model_);
                model_ = subBuilder.buildPartial();
              }
              modelCase_ = 2;
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
      return object_detection.protos.Model.internal_static_object_detection_protos_DetectionModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return object_detection.protos.Model.internal_static_object_detection_protos_DetectionModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              object_detection.protos.Model.DetectionModel.class, object_detection.protos.Model.DetectionModel.Builder.class);
    }

    private int bitField0_;
    private int modelCase_ = 0;
    private java.lang.Object model_;
    public enum ModelCase
        implements com.google.protobuf.Internal.EnumLite {
      FASTER_RCNN(1),
      SSD(2),
      MODEL_NOT_SET(0);
      private final int value;
      private ModelCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ModelCase valueOf(int value) {
        return forNumber(value);
      }

      public static ModelCase forNumber(int value) {
        switch (value) {
          case 1: return FASTER_RCNN;
          case 2: return SSD;
          case 0: return MODEL_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ModelCase
    getModelCase() {
      return ModelCase.forNumber(
          modelCase_);
    }

    public static final int FASTER_RCNN_FIELD_NUMBER = 1;
    /**
     * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
     */
    public boolean hasFasterRcnn() {
      return modelCase_ == 1;
    }
    /**
     * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
     */
    public object_detection.protos.FasterRcnnOuterClass.FasterRcnn getFasterRcnn() {
      if (modelCase_ == 1) {
         return (object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_;
      }
      return object_detection.protos.FasterRcnnOuterClass.FasterRcnn.getDefaultInstance();
    }
    /**
     * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
     */
    public object_detection.protos.FasterRcnnOuterClass.FasterRcnnOrBuilder getFasterRcnnOrBuilder() {
      if (modelCase_ == 1) {
         return (object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_;
      }
      return object_detection.protos.FasterRcnnOuterClass.FasterRcnn.getDefaultInstance();
    }

    public static final int SSD_FIELD_NUMBER = 2;
    /**
     * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
     */
    public boolean hasSsd() {
      return modelCase_ == 2;
    }
    /**
     * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
     */
    public object_detection.protos.SsdOuterClass.Ssd getSsd() {
      if (modelCase_ == 2) {
         return (object_detection.protos.SsdOuterClass.Ssd) model_;
      }
      return object_detection.protos.SsdOuterClass.Ssd.getDefaultInstance();
    }
    /**
     * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
     */
    public object_detection.protos.SsdOuterClass.SsdOrBuilder getSsdOrBuilder() {
      if (modelCase_ == 2) {
         return (object_detection.protos.SsdOuterClass.Ssd) model_;
      }
      return object_detection.protos.SsdOuterClass.Ssd.getDefaultInstance();
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
      if (modelCase_ == 1) {
        output.writeMessage(1, (object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_);
      }
      if (modelCase_ == 2) {
        output.writeMessage(2, (object_detection.protos.SsdOuterClass.Ssd) model_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (modelCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_);
      }
      if (modelCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (object_detection.protos.SsdOuterClass.Ssd) model_);
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
      if (!(obj instanceof object_detection.protos.Model.DetectionModel)) {
        return super.equals(obj);
      }
      object_detection.protos.Model.DetectionModel other = (object_detection.protos.Model.DetectionModel) obj;

      boolean result = true;
      result = result && getModelCase().equals(
          other.getModelCase());
      if (!result) return false;
      switch (modelCase_) {
        case 1:
          result = result && getFasterRcnn()
              .equals(other.getFasterRcnn());
          break;
        case 2:
          result = result && getSsd()
              .equals(other.getSsd());
          break;
        case 0:
        default:
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
      switch (modelCase_) {
        case 1:
          hash = (37 * hash) + FASTER_RCNN_FIELD_NUMBER;
          hash = (53 * hash) + getFasterRcnn().hashCode();
          break;
        case 2:
          hash = (37 * hash) + SSD_FIELD_NUMBER;
          hash = (53 * hash) + getSsd().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static object_detection.protos.Model.DetectionModel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static object_detection.protos.Model.DetectionModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static object_detection.protos.Model.DetectionModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static object_detection.protos.Model.DetectionModel parseFrom(
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
    public static Builder newBuilder(object_detection.protos.Model.DetectionModel prototype) {
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
     * Top level configuration for DetectionModels.
     * </pre>
     *
     * Protobuf type {@code object_detection.protos.DetectionModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:object_detection.protos.DetectionModel)
        object_detection.protos.Model.DetectionModelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return object_detection.protos.Model.internal_static_object_detection_protos_DetectionModel_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return object_detection.protos.Model.internal_static_object_detection_protos_DetectionModel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                object_detection.protos.Model.DetectionModel.class, object_detection.protos.Model.DetectionModel.Builder.class);
      }

      // Construct using object_detection.protos.Model.DetectionModel.newBuilder()
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
        modelCase_ = 0;
        model_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return object_detection.protos.Model.internal_static_object_detection_protos_DetectionModel_descriptor;
      }

      @java.lang.Override
      public object_detection.protos.Model.DetectionModel getDefaultInstanceForType() {
        return object_detection.protos.Model.DetectionModel.getDefaultInstance();
      }

      @java.lang.Override
      public object_detection.protos.Model.DetectionModel build() {
        object_detection.protos.Model.DetectionModel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public object_detection.protos.Model.DetectionModel buildPartial() {
        object_detection.protos.Model.DetectionModel result = new object_detection.protos.Model.DetectionModel(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (modelCase_ == 1) {
          if (fasterRcnnBuilder_ == null) {
            result.model_ = model_;
          } else {
            result.model_ = fasterRcnnBuilder_.build();
          }
        }
        if (modelCase_ == 2) {
          if (ssdBuilder_ == null) {
            result.model_ = model_;
          } else {
            result.model_ = ssdBuilder_.build();
          }
        }
        result.bitField0_ = to_bitField0_;
        result.modelCase_ = modelCase_;
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
        if (other instanceof object_detection.protos.Model.DetectionModel) {
          return mergeFrom((object_detection.protos.Model.DetectionModel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(object_detection.protos.Model.DetectionModel other) {
        if (other == object_detection.protos.Model.DetectionModel.getDefaultInstance()) return this;
        switch (other.getModelCase()) {
          case FASTER_RCNN: {
            mergeFasterRcnn(other.getFasterRcnn());
            break;
          }
          case SSD: {
            mergeSsd(other.getSsd());
            break;
          }
          case MODEL_NOT_SET: {
            break;
          }
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
        object_detection.protos.Model.DetectionModel parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (object_detection.protos.Model.DetectionModel) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int modelCase_ = 0;
      private java.lang.Object model_;
      public ModelCase
          getModelCase() {
        return ModelCase.forNumber(
            modelCase_);
      }

      public Builder clearModel() {
        modelCase_ = 0;
        model_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.SingleFieldBuilderV3<
          object_detection.protos.FasterRcnnOuterClass.FasterRcnn, object_detection.protos.FasterRcnnOuterClass.FasterRcnn.Builder, object_detection.protos.FasterRcnnOuterClass.FasterRcnnOrBuilder> fasterRcnnBuilder_;
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      public boolean hasFasterRcnn() {
        return modelCase_ == 1;
      }
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      public object_detection.protos.FasterRcnnOuterClass.FasterRcnn getFasterRcnn() {
        if (fasterRcnnBuilder_ == null) {
          if (modelCase_ == 1) {
            return (object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_;
          }
          return object_detection.protos.FasterRcnnOuterClass.FasterRcnn.getDefaultInstance();
        } else {
          if (modelCase_ == 1) {
            return fasterRcnnBuilder_.getMessage();
          }
          return object_detection.protos.FasterRcnnOuterClass.FasterRcnn.getDefaultInstance();
        }
      }
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      public Builder setFasterRcnn(object_detection.protos.FasterRcnnOuterClass.FasterRcnn value) {
        if (fasterRcnnBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          model_ = value;
          onChanged();
        } else {
          fasterRcnnBuilder_.setMessage(value);
        }
        modelCase_ = 1;
        return this;
      }
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      public Builder setFasterRcnn(
          object_detection.protos.FasterRcnnOuterClass.FasterRcnn.Builder builderForValue) {
        if (fasterRcnnBuilder_ == null) {
          model_ = builderForValue.build();
          onChanged();
        } else {
          fasterRcnnBuilder_.setMessage(builderForValue.build());
        }
        modelCase_ = 1;
        return this;
      }
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      public Builder mergeFasterRcnn(object_detection.protos.FasterRcnnOuterClass.FasterRcnn value) {
        if (fasterRcnnBuilder_ == null) {
          if (modelCase_ == 1 &&
              model_ != object_detection.protos.FasterRcnnOuterClass.FasterRcnn.getDefaultInstance()) {
            model_ = object_detection.protos.FasterRcnnOuterClass.FasterRcnn.newBuilder((object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_)
                .mergeFrom(value).buildPartial();
          } else {
            model_ = value;
          }
          onChanged();
        } else {
          if (modelCase_ == 1) {
            fasterRcnnBuilder_.mergeFrom(value);
          }
          fasterRcnnBuilder_.setMessage(value);
        }
        modelCase_ = 1;
        return this;
      }
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      public Builder clearFasterRcnn() {
        if (fasterRcnnBuilder_ == null) {
          if (modelCase_ == 1) {
            modelCase_ = 0;
            model_ = null;
            onChanged();
          }
        } else {
          if (modelCase_ == 1) {
            modelCase_ = 0;
            model_ = null;
          }
          fasterRcnnBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      public object_detection.protos.FasterRcnnOuterClass.FasterRcnn.Builder getFasterRcnnBuilder() {
        return getFasterRcnnFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      public object_detection.protos.FasterRcnnOuterClass.FasterRcnnOrBuilder getFasterRcnnOrBuilder() {
        if ((modelCase_ == 1) && (fasterRcnnBuilder_ != null)) {
          return fasterRcnnBuilder_.getMessageOrBuilder();
        } else {
          if (modelCase_ == 1) {
            return (object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_;
          }
          return object_detection.protos.FasterRcnnOuterClass.FasterRcnn.getDefaultInstance();
        }
      }
      /**
       * <code>optional .object_detection.protos.FasterRcnn faster_rcnn = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          object_detection.protos.FasterRcnnOuterClass.FasterRcnn, object_detection.protos.FasterRcnnOuterClass.FasterRcnn.Builder, object_detection.protos.FasterRcnnOuterClass.FasterRcnnOrBuilder>
          getFasterRcnnFieldBuilder() {
        if (fasterRcnnBuilder_ == null) {
          if (!(modelCase_ == 1)) {
            model_ = object_detection.protos.FasterRcnnOuterClass.FasterRcnn.getDefaultInstance();
          }
          fasterRcnnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              object_detection.protos.FasterRcnnOuterClass.FasterRcnn, object_detection.protos.FasterRcnnOuterClass.FasterRcnn.Builder, object_detection.protos.FasterRcnnOuterClass.FasterRcnnOrBuilder>(
                  (object_detection.protos.FasterRcnnOuterClass.FasterRcnn) model_,
                  getParentForChildren(),
                  isClean());
          model_ = null;
        }
        modelCase_ = 1;
        onChanged();;
        return fasterRcnnBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          object_detection.protos.SsdOuterClass.Ssd, object_detection.protos.SsdOuterClass.Ssd.Builder, object_detection.protos.SsdOuterClass.SsdOrBuilder> ssdBuilder_;
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      public boolean hasSsd() {
        return modelCase_ == 2;
      }
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      public object_detection.protos.SsdOuterClass.Ssd getSsd() {
        if (ssdBuilder_ == null) {
          if (modelCase_ == 2) {
            return (object_detection.protos.SsdOuterClass.Ssd) model_;
          }
          return object_detection.protos.SsdOuterClass.Ssd.getDefaultInstance();
        } else {
          if (modelCase_ == 2) {
            return ssdBuilder_.getMessage();
          }
          return object_detection.protos.SsdOuterClass.Ssd.getDefaultInstance();
        }
      }
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      public Builder setSsd(object_detection.protos.SsdOuterClass.Ssd value) {
        if (ssdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          model_ = value;
          onChanged();
        } else {
          ssdBuilder_.setMessage(value);
        }
        modelCase_ = 2;
        return this;
      }
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      public Builder setSsd(
          object_detection.protos.SsdOuterClass.Ssd.Builder builderForValue) {
        if (ssdBuilder_ == null) {
          model_ = builderForValue.build();
          onChanged();
        } else {
          ssdBuilder_.setMessage(builderForValue.build());
        }
        modelCase_ = 2;
        return this;
      }
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      public Builder mergeSsd(object_detection.protos.SsdOuterClass.Ssd value) {
        if (ssdBuilder_ == null) {
          if (modelCase_ == 2 &&
              model_ != object_detection.protos.SsdOuterClass.Ssd.getDefaultInstance()) {
            model_ = object_detection.protos.SsdOuterClass.Ssd.newBuilder((object_detection.protos.SsdOuterClass.Ssd) model_)
                .mergeFrom(value).buildPartial();
          } else {
            model_ = value;
          }
          onChanged();
        } else {
          if (modelCase_ == 2) {
            ssdBuilder_.mergeFrom(value);
          }
          ssdBuilder_.setMessage(value);
        }
        modelCase_ = 2;
        return this;
      }
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      public Builder clearSsd() {
        if (ssdBuilder_ == null) {
          if (modelCase_ == 2) {
            modelCase_ = 0;
            model_ = null;
            onChanged();
          }
        } else {
          if (modelCase_ == 2) {
            modelCase_ = 0;
            model_ = null;
          }
          ssdBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      public object_detection.protos.SsdOuterClass.Ssd.Builder getSsdBuilder() {
        return getSsdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      public object_detection.protos.SsdOuterClass.SsdOrBuilder getSsdOrBuilder() {
        if ((modelCase_ == 2) && (ssdBuilder_ != null)) {
          return ssdBuilder_.getMessageOrBuilder();
        } else {
          if (modelCase_ == 2) {
            return (object_detection.protos.SsdOuterClass.Ssd) model_;
          }
          return object_detection.protos.SsdOuterClass.Ssd.getDefaultInstance();
        }
      }
      /**
       * <code>optional .object_detection.protos.Ssd ssd = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          object_detection.protos.SsdOuterClass.Ssd, object_detection.protos.SsdOuterClass.Ssd.Builder, object_detection.protos.SsdOuterClass.SsdOrBuilder>
          getSsdFieldBuilder() {
        if (ssdBuilder_ == null) {
          if (!(modelCase_ == 2)) {
            model_ = object_detection.protos.SsdOuterClass.Ssd.getDefaultInstance();
          }
          ssdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              object_detection.protos.SsdOuterClass.Ssd, object_detection.protos.SsdOuterClass.Ssd.Builder, object_detection.protos.SsdOuterClass.SsdOrBuilder>(
                  (object_detection.protos.SsdOuterClass.Ssd) model_,
                  getParentForChildren(),
                  isClean());
          model_ = null;
        }
        modelCase_ = 2;
        onChanged();;
        return ssdBuilder_;
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


      // @@protoc_insertion_point(builder_scope:object_detection.protos.DetectionModel)
    }

    // @@protoc_insertion_point(class_scope:object_detection.protos.DetectionModel)
    private static final object_detection.protos.Model.DetectionModel DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new object_detection.protos.Model.DetectionModel();
    }

    public static object_detection.protos.Model.DetectionModel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<DetectionModel>
        PARSER = new com.google.protobuf.AbstractParser<DetectionModel>() {
      @java.lang.Override
      public DetectionModel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DetectionModel(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DetectionModel> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DetectionModel> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public object_detection.protos.Model.DetectionModel getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_detection_protos_DetectionModel_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_detection_protos_DetectionModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#object_detection/protos/model.proto\022\027o" +
      "bject_detection.protos\032)object_detection" +
      "/protos/faster_rcnn.proto\032!object_detect" +
      "ion/protos/ssd.proto\"\202\001\n\016DetectionModel\022" +
      ":\n\013faster_rcnn\030\001 \001(\0132#.object_detection." +
      "protos.FasterRcnnH\000\022+\n\003ssd\030\002 \001(\0132\034.objec" +
      "t_detection.protos.SsdH\000B\007\n\005model"
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
          object_detection.protos.FasterRcnnOuterClass.getDescriptor(),
          object_detection.protos.SsdOuterClass.getDescriptor(),
        }, assigner);
    internal_static_object_detection_protos_DetectionModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_object_detection_protos_DetectionModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_detection_protos_DetectionModel_descriptor,
        new java.lang.String[] { "FasterRcnn", "Ssd", "Model", });
    object_detection.protos.FasterRcnnOuterClass.getDescriptor();
    object_detection.protos.SsdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
