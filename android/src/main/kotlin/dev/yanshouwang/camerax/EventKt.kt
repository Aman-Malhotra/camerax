//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

package dev.yanshouwang.camerax;

@kotlin.jvm.JvmSynthetic
public inline fun event(block: dev.yanshouwang.camerax.EventKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.Messages.Event =
  dev.yanshouwang.camerax.EventKt.Dsl._create(dev.yanshouwang.camerax.Messages.Event.newBuilder()).apply { block() }._build()
public object EventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.yanshouwang.camerax.Messages.Event.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.Messages.Event.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.Messages.Event = _builder.build()

    /**
     * <code>.messages.EventCategory category = 1;</code>
     */
    public var category: dev.yanshouwang.camerax.Messages.EventCategory
      @JvmName("getCategory")
      get() = _builder.getCategory()
      @JvmName("setCategory")
      set(value) {
        _builder.setCategory(value)
      }
    /**
     * <code>.messages.EventCategory category = 1;</code>
     */
    public fun clearCategory() {
      _builder.clearCategory()
    }

    /**
     * <code>int32 quarter_turns = 2;</code>
     */
    public var quarterTurns: kotlin.Int
      @JvmName("getQuarterTurns")
      get() = _builder.getQuarterTurns()
      @JvmName("setQuarterTurns")
      set(value) {
        _builder.setQuarterTurns(value)
      }
    /**
     * <code>int32 quarter_turns = 2;</code>
     */
    public fun clearQuarterTurns() {
      _builder.clearQuarterTurns()
    }

    /**
     * <code>string uuid = 3;</code>
     */
    public var uuid: kotlin.String
      @JvmName("getUuid")
      get() = _builder.getUuid()
      @JvmName("setUuid")
      set(value) {
        _builder.setUuid(value)
      }
    /**
     * <code>string uuid = 3;</code>
     */
    public fun clearUuid() {
      _builder.clearUuid()
    }

    /**
     * <code>bool torch_state = 4;</code>
     */
    public var torchState: kotlin.Boolean
      @JvmName("getTorchState")
      get() = _builder.getTorchState()
      @JvmName("setTorchState")
      set(value) {
        _builder.setTorchState(value)
      }
    /**
     * <code>bool torch_state = 4;</code>
     */
    public fun clearTorchState() {
      _builder.clearTorchState()
    }

    /**
     * <code>double zoom_value = 5;</code>
     */
    public var zoomValue: kotlin.Double
      @JvmName("getZoomValue")
      get() = _builder.getZoomValue()
      @JvmName("setZoomValue")
      set(value) {
        _builder.setZoomValue(value)
      }
    /**
     * <code>double zoom_value = 5;</code>
     */
    public fun clearZoomValue() {
      _builder.clearZoomValue()
    }

    /**
     * <code>.messages.ImageProxy image_proxy = 6;</code>
     */
    public var imageProxy: dev.yanshouwang.camerax.Messages.ImageProxy
      @JvmName("getImageProxy")
      get() = _builder.getImageProxy()
      @JvmName("setImageProxy")
      set(value) {
        _builder.setImageProxy(value)
      }
    /**
     * <code>.messages.ImageProxy image_proxy = 6;</code>
     */
    public fun clearImageProxy() {
      _builder.clearImageProxy()
    }
    /**
     * <code>.messages.ImageProxy image_proxy = 6;</code>
     * @return Whether the imageProxy field is set.
     */
    public fun hasImageProxy(): kotlin.Boolean {
      return _builder.hasImageProxy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.yanshouwang.camerax.Messages.Event.copy(block: dev.yanshouwang.camerax.EventKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.Messages.Event =
  dev.yanshouwang.camerax.EventKt.Dsl._create(this.toBuilder()).apply { block() }._build()