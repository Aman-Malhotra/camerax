//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: communication.proto

package dev.yanshouwang.camerax.communication;

@kotlin.jvm.JvmSynthetic
inline fun textureInfo(block: dev.yanshouwang.camerax.communication.TextureInfoKt.Dsl.() -> Unit): dev.yanshouwang.camerax.communication.Communication.TextureInfo =
  dev.yanshouwang.camerax.communication.TextureInfoKt.Dsl._create(dev.yanshouwang.camerax.communication.Communication.TextureInfo.newBuilder()).apply { block() }._build()
object TextureInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: dev.yanshouwang.camerax.communication.Communication.TextureInfo.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.communication.Communication.TextureInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.communication.Communication.TextureInfo = _builder.build()

    /**
     * <code>int32 id = 1;</code>
     */
    var id: kotlin.Int
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>int32 id = 1;</code>
     */
    fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>.communication.TextureSize size = 2;</code>
     */
    var size: dev.yanshouwang.camerax.communication.Communication.TextureSize
      @JvmName("getSize")
      get() = _builder.getSize()
      @JvmName("setSize")
      set(value) {
        _builder.setSize(value)
      }
    /**
     * <code>.communication.TextureSize size = 2;</code>
     */
    fun clearSize() {
      _builder.clearSize()
    }
    /**
     * <code>.communication.TextureSize size = 2;</code>
     * @return Whether the size field is set.
     */
    fun hasSize(): kotlin.Boolean {
      return _builder.hasSize()
    }

    /**
     * <code>int32 quarterTurns = 3;</code>
     */
    var quarterTurns: kotlin.Int
      @JvmName("getQuarterTurns")
      get() = _builder.getQuarterTurns()
      @JvmName("setQuarterTurns")
      set(value) {
        _builder.setQuarterTurns(value)
      }
    /**
     * <code>int32 quarterTurns = 3;</code>
     */
    fun clearQuarterTurns() {
      _builder.clearQuarterTurns()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun dev.yanshouwang.camerax.communication.Communication.TextureInfo.copy(block: dev.yanshouwang.camerax.communication.TextureInfoKt.Dsl.() -> Unit): dev.yanshouwang.camerax.communication.Communication.TextureInfo =
  dev.yanshouwang.camerax.communication.TextureInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()