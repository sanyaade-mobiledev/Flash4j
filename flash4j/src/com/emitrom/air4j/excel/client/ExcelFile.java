/************************************************************************
  ExcelFile.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.excel.client;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class ExcelFile extends ProxyObject {

    /** Creates an ExcelSheet File object. */

    public ExcelFile() {
        jsObj = newInstance();
    }

    protected ExcelFile(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.com.as3xls.xls.ExcelFile;
    }-*/;

    public native void addSheet(Sheet s) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.sheets
				.addItem(s.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native Sheet getSheetAt(int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.sheets[index];
		return @com.emitrom.air4j.excel.client.Sheet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Sheet getMainSheet() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.sheets[0];
		return @com.emitrom.air4j.excel.client.Sheet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getSheetCount() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sheets.lenght;
    }-*/;

    public native ByteArray saveToByteArray() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.saveToByteArray();
		if (!obj) {
			return null;
		}
		return @com.emitrom.air4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void loadFromByteArray(ByteArray xls) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadFromByteArray(xls.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.com.as3xls.xls.ExcelFile();
    }-*/;
}
