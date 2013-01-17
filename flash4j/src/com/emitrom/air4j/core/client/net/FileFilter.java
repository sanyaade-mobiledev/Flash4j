/************************************************************************
  FileFilter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.net;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public final class FileFilter extends ProxyObject {

    protected FileFilter(JavaScriptObject obj) {
        jsObj = obj;
    }

    public FileFilter(String description, String extension) {
        jsObj = newInstance(description, extension);
    }

    public FileFilter(String description, String extension, String macType) {
        jsObj = newInstance(description, extension, macType);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.FileFilter;
    }-*/;

    public final native String getDescription() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.description;
    }-*/;

    public final native void setDescription(String description) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.description = description;
    }-*/;

    public final native String getExtension() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.extension;
    }-*/;

    public final native void setExtension(String extension) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.extension = extension;
    }-*/;

    public final native String getMacType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.macType;
    }-*/;

    public final native void setMacType(String macType) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.macType = macType;
    }-*/;

    private static native JavaScriptObject newInstance(String description, String extensions) /*-{
		return new $wnd.runtime.flash.net.FileFilter(description, extensions);
    }-*/;

    private static native JavaScriptObject newInstance(String description, String extension, String macType) /*-{
		return new $wnd.runtime.flash.net.FileFilter(description, extension,
				macType);
    }-*/;
}
