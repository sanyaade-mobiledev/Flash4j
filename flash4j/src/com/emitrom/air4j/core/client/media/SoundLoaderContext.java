/************************************************************************
  SoundLoaderContext.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class SoundLoaderContext extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.media.SoundLoaderContext;
    }-*/;

    protected SoundLoaderContext(JavaScriptObject obj) {
        jsObj = obj;
    }

    public SoundLoaderContext() {
        jsObj = newInstance();
    }

    public SoundLoaderContext(double bufferTime) {
        jsObj = newInstance(bufferTime);
    }

    public SoundLoaderContext(double bufferTime, boolean checkPolicyFile) {
        jsObj = newInstance(bufferTime, checkPolicyFile);
    }

    public native double getBufferTime() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bufferTime;
    }-*/;

    public native void setBufferTime(double bufferTime) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bufferTime = bufferTime;
    }-*/;

    public native boolean hasCheckPolicyFile() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.checkPolicyFile;
    }-*/;

    public native void setCheckPolicyFile(boolean checkPolicyFile) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.checkPolicyFile = checkPolicyFile;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.media.SoundLoaderContext();
    }-*/;

    private static native JavaScriptObject newInstance(double bufferTime) /*-{
		return new $wnd.runtime.flash.media.SoundLoaderContext(bufferTime);
    }-*/;

    private static native JavaScriptObject newInstance(double bufferTime, boolean checkPolicyFile) /*-{
		return new $wnd.runtime.flash.media.SoundLoaderContext(bufferTime,
				checkPolicyFile);
    }-*/;

}
