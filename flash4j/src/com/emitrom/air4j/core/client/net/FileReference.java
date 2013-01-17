/************************************************************************
  FileReference.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.Arrays;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.toplevel.Date;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

public class FileReference extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.FileReference;
    }-*/;

    protected FileReference(JavaScriptObject obj) {
        jsObj = obj;
    }

    public FileReference() {
        jsObj = newInstance();
    }

    public native Date getCreationDate()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.creationDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native String getCreator() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.creator;
    }-*/;

    public native ByteArray getData() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.data;
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native String getExtension() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.extension;
    }-*/;

    public native Date getDateOfModification()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.modificationDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native double getModificationDate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.modificationDate.getTime();
    }-*/;

    public native String getName() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.name;
    }-*/;

    public native double getSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.size;
    }-*/;

    public native String getType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.type;
    }-*/;

    public native boolean browse() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.browse();
    }-*/;

    public boolean browse(FileFilter... typeFilter) {
        return _browse(DataConverter.fromList(Arrays.asList(typeFilter)));
    }

    private native boolean _browse(JavaScriptObject typeFilter) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.browse(typeFilter);
    }-*/;

    public native void cancel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.cancel();
    }-*/;

    public native void download(URLRequest request) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.download(request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void download(URLRequest request, String defaultFileName) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.download(
						request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						defaultFileName);
    }-*/;

    public native void load() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.load();
    }-*/;

    public native void save(String data) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.save(data);
    }-*/;

    public native void save(String data, String defaultFileName) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.save(data, defaultFileName);
    }-*/;

    public native void save(ByteArray data) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.save(data.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void save(ByteArray data, String defaultFileName) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.save(
				data.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				defaultFileName);
    }-*/;

    public native void upload(URLRequest request) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.upload(request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void upload(URLRequest request, String uploadDataFieldName) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.upload(
						request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						uploadDataFieldName);
    }-*/;

    public native void upload(URLRequest request, String uploadDataFieldName, boolean testUpload) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.upload(
						request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						uploadDataFieldName, testUpload);
    }-*/;

    public native void uploadUnencoded(URLRequest request) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.uploadUnencoded(request.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.FileReference();
    }-*/;

}
