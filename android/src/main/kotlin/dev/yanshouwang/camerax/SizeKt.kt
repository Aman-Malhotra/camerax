//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

package dev.yanshouwang.camerax;

@kotlin.jvm.JvmSynthetic
public inline fun size(block: dev.yanshouwang.camerax.SizeKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.Messages.Size =
  dev.yanshouwang.camerax.SizeKt.Dsl._create(dev.yanshouwang.camerax.Messages.Size.newBuilder()).apply { block() }._build()
public object SizeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.yanshouwang.camerax.Messages.Size.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.Messages.Size.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.Messages.Size = _builder.build()

    /**
     * <code>double width = 1;</code>
     */
    public var width: kotlin.Double
      @JvmName("getWidth")
      get() = _builder.getWidth()
      @JvmName("setWidth")
      set(value) {
        _builder.setWidth(value)
      }
    /**
     * <code>double width = 1;</code>
     */
    public fun clearWidth() {
      _builder.clearWidth()
    }

    /**
     * <code>double height = 2;</code>
     */
    public var height: kotlin.Double
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>double height = 2;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.yanshouwang.camerax.Messages.Size.copy(block: dev.yanshouwang.camerax.SizeKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.Messages.Size =
  dev.yanshouwang.camerax.SizeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
