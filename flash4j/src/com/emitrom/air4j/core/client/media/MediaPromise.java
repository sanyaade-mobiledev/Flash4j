/************************************************************************
  MediaPromise.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.air4j.core.client.filesystem.File;
import com.emitrom.air4j.core.client.utils.IoClass;
import com.google.gwt.core.client.JavaScriptObject;

public class MediaPromise extends ProxyObject {

    protected MediaPromise(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native File getFile()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.file;
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean isAsync()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isAsync;
    }-*/;

    public MediaType getMediaType() {
        return MediaType.fromValue(_getMediaType());
    }

    private native String _getMediaType()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mediaType;
    }-*/;

    public native String getRelativePath()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.relativePath;
    }-*/;

    public native void close()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    public native IoClass open()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.open();
		return @com.emitrom.air4j.core.client.utils.IoClass::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;
}
