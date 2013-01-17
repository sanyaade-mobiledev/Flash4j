/************************************************************************
  SQLResult.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class SQLResult extends ProxyObject {

    protected SQLResult() {
    }

    SQLResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native boolean isComplete() /*-{
		return peer.complete;
    }-*/;

    /**
     * use this function if the result returns an array of primitives like
     * integer, string...
     * 
     * @return data as array of primitives
     */
    public final native <T extends Object> T[] getPrimitiveData() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.data;
    }-*/;

    public native <T extends JavaScriptObject> JsArray<T> getData() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.data;
    }-*/;

    public final native int getLastInsertRowId() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.lastInsertRowID;
    }-*/;

    public final native int getRowsAffected() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rowsAffected;
    }-*/;
}
