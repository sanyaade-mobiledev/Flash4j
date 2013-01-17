/************************************************************************
  EncryptedLocalStore.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.data;

import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public final class EncryptedLocalStore extends JavaScriptObject {

    protected EncryptedLocalStore() {
    }

    public static native ByteArray getItem(String name) /*-{
		return $wnd.runtime.flash.data.EncrytedLocalStore.getItem(name);
    }-*/;

    public static native void removeItem(String name) /*-{
		$wnd.runtime.flash.data.EncrytedLocalStore.removeItem(name);
    }-*/;

    public static native void reset() /*-{
		$wnd.runtime.flash.data.EncrytedLocalStore.reset();
    }-*/;

    public static native void setItem(String name, ByteArray data) /*-{
		$wnd.runtime.flash.data.EncrytedLocalStore.setItem(name,
				data.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public static native void setItem(String name, ByteArray data, boolean stronglyBound) /*-{
		$wnd.runtime.flash.data.EncrytedLocalStore.setItem(name,
				data.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				stronglyBound);
    }-*/;

    public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.data.EncrytedLocalStore.isSupported;
    }-*/;
}
