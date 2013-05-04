/************************************************************************
  SQLIndexSchema.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class SQLIndexSchema extends SQLSchema {

    protected SQLIndexSchema() {
    }

    protected SQLIndexSchema(JavaScriptObject obj) {
        jsObj = obj;
    }

    public SQLIndexSchema(String database, String name, String sql, String table) {
        jsObj = createPeer(database, name, sql, table);
    }

    private static native JavaScriptObject createPeer(String database, String name, String sql, String table) /*-{
		return new $wnd.runtime.flash.data.SQLIndexSchema(database, name, sql,
				table);
    }-*/;

    public final native String getTable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.table;
    }-*/;

    public static SQLIndexSchema from(ProxyObject peer) {
        return new SQLIndexSchema(peer.getJsObj());
    }
}