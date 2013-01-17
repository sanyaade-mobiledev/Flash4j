/************************************************************************
  SQLTableSchema.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class SQLTableSchema extends SQLSchema {
    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.data.SQLTableSchema;
    }-*/;

    protected SQLTableSchema(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected SQLTableSchema() {
    }

    public final List<SQLColumnSchema> getColumns() {
        List<? extends ProxyObject> peers = DataConverter.fromJsArray(_getColumns());
        List<SQLColumnSchema> toReturn = new ArrayList<SQLColumnSchema>();
        for (ProxyObject p : peers) {
            toReturn.add(SQLColumnSchema.from(p));
        }
        return toReturn;
    }

    private native JavaScriptObject _getColumns() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.columns;
    }-*/;

    public static SQLTableSchema from(ProxyObject peer) {
        return new SQLTableSchema(peer.getJsObj());
    }
}
