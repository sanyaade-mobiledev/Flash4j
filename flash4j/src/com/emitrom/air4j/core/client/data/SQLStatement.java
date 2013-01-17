/************************************************************************
  SQLStatement.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.net.Responder;
import com.google.gwt.core.client.JavaScriptObject;

public class SQLStatement extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.data.SQLStatement;
    }-*/;

    public SQLStatement() {
        jsObj = createPeer();
    }

    protected SQLStatement(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native JavaScriptObject createPeer() /*-{
		return new $wnd.runtime.flash.data.SQLStatement();
    }-*/;

    public final native boolean isExecuting() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.executing;
    }-*/;

    public final native Class<?> getItemClass() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.itemClass;
    }-*/;

    public final native void setItemClass(Class<?> itemClass) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.itemClass = itemClass;
    }-*/;

    public final native boolean hasParameter(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return (name in peer.parameters);
    }-*/;

    public final native <T> T getParameter(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.parameters[name];
    }-*/;

    public final native void setParameter(String name, Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.parameters[name] = value;
    }-*/;

    public final native void deleteParameter(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		delete peer.parameters[name];
    }-*/;

    public final native SQLConnection getSQLConnection() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.sqlConnection;
		return @com.emitrom.air4j.core.client.data.SQLConnection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setSQLConnection(SQLConnection sqlConnection) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.sqlConnection = sqlConnection.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native String getText() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.text;
    }-*/;

    public final native void setText(String text) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.text = text;
    }-*/;

    public final native void cancel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.cancel();
    }-*/;

    public final native void clearParameters() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clearParameters();
    }-*/;

    public final native void execute() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.execute();
    }-*/;

    public final native void execute(int prefetch) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.execute(prefetch);
    }-*/;

    public final native void execute(int prefetch, Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.execute(
						prefetch,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public final native SQLResult getResult() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getResult();
		return @com.emitrom.air4j.core.client.data.SQLResult::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void next() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.next();
    }-*/;

    public final native void next(int prefetch) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.next(prefetch);
    }-*/;

    public final native void next(int prefetch, Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.next(
						prefetch,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

}
