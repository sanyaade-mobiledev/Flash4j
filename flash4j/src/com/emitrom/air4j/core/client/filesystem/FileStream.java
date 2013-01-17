/************************************************************************
  FileStream.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.filesystem;

import com.emitrom.air4j.core.client.utils.IoClass;
import com.google.gwt.core.client.JavaScriptObject;

public class FileStream extends IoClass {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.filesystem.FileStream;
    }-*/;

    public FileStream() {
        jsObj = newInstance();
    }

    public FileStream(File file, FileMode openMode) {
        this();
        open(file, openMode);
    }

    protected FileStream(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void setPosition(double position) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.position = position;
    }-*/;

    public native double getReadAhead() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.readAhead;
    }-*/;

    public native void setReadAhead(double readAhead) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readAhead = readAhead;
    }-*/;

    public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    public void open(File file, FileMode fileMode) {
        _open(file, fileMode.value);
    }

    private native void _open(File file, String fileMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.open(
				file.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				fileMode);
    }-*/;

    public void openAsync(File file, FileMode fileMode) {
        _openAsync(file, fileMode.value);
    }

    private native void _openAsync(File file, String fileMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.openAsync(
				file.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				fileMode);
    }-*/;

    public native void truncate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.truncate();
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.filesystem.FileStream();
    }-*/;

}
