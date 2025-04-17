package com.chargebee.android.reactnative

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = ChargebeeReactNativeModule.NAME)
abstract class ChargebeeReactNativeSpec internal constructor(context: ReactApplicationContext) :
  com.chargebee.android.NativeChargebeeReactNativeSpec(context) {
  
  companion object {
    const val NAME = "ChargebeeReactNative"
  }
}