/************************************************************************
  SQLSchemaResult.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.List;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

public class SQLSchemaResult extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.data.SQLSchemaResult;
    }-*/;

    protected SQLSchemaResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final List<SQLIndexSchema> getIndices() {
        List<? extends ProxyObject> peers = DataConverter.fromJsArray(_getTables());
        List<SQLIndexSchema> toReturn = new ArrayList<SQLIndexSchema>();
        for (ProxyObject p : peers) {
            toReturn.add(SQLIndexSchema.from(p));
        }
        return toReturn;
    }

    private native JavaScriptObject _getIndices() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.indices;
    }-*/;

    public final List<SQLTableSchema> getTables() {
        List<? extends ProxyObject> peers = DataConverter.fromJsArray(_getTables());
        List<SQLTableSchema> toReturn = new ArrayList<SQLTableSchema>();
        for (ProxyObject p : peers) {
            toReturn.add(SQLTableSchema.from(p));
        }
        return toReturn;
    }

    private native JavaScriptObject _getTables() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tables;
    }-*/;

    public final List<SQLTriggerSchema> getTriggers() {
        List<? extends ProxyObject> peers = DataConverter.fromJsArray(_getTriggers());
        List<SQLTriggerSchema> toReturn = new ArrayList<SQLTriggerSchema>();
        for (ProxyObject p : peers) {
            toReturn.add(SQLTriggerSchema.from(p));
        }
        return toReturn;
    }

    private native JavaScriptObject _getTriggers() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.triggers;
    }-*/;

    public final List<SQLViewSchema> getViews() {
        List<? extends ProxyObject> peers = DataConverter.fromJsArray(_getViews());
        List<SQLViewSchema> toReturn = new ArrayList<SQLViewSchema>();
        for (ProxyObject p : peers) {
            toReturn.add(SQLViewSchema.from(p));
        }
        return toReturn;

    }

    private native JavaScriptObject _getViews() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.views;
    }-*/;
}
