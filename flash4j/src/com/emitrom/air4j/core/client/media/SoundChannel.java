/************************************************************************
  SoundChannel.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
**************************************************************************/

package com.emitrom.air4j.core.client.media;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public final class SoundChannel extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.media.SoundChannel;

    }-*/;

    protected SoundChannel(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native double getLeftPeak() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.leftPeak;
    }-*/;

    public native double getPosition() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.position;
    }-*/;

    public native double getRightPeak() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rightPeak;
    }-*/;

    public native SoundTransform getSoundTransform() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.soundTransform;
		return @com.emitrom.air4j.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void stop() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;
}
