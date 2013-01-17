/************************************************************************
  SQLConnection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.air4j.core.client.filesystem.File;
import com.emitrom.air4j.core.client.net.Responder;
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

public class SQLConnection extends EventDispatcher {

    private static native JavaScriptObject _createPeer() /*-{
		return new $wnd.runtime.flash.data.SQLConnection();
    }-*/;

    public SQLConnection() {
        jsObj = _createPeer();
    }

    SQLConnection(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean getAutoCompact() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.autoCompact;
    }-*/;

    public native int getCacheSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.cacheSize;
    }-*/;

    public native void setCacheSize(int size) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.cacheSize = size;
    }-*/;

    public SQLColumnNameStyle getColumnNameStyle() {
        return SQLColumnNameStyle.valueOf(nativeGetColumnNameStyle());
    }

    private native String nativeGetColumnNameStyle() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.columnNameStyle;
    }-*/;

    public void setColumnNameStyle(SQLColumnNameStyle style) {
        nativeSetColumnNameStyle(style.value);
    }

    private native void nativeSetColumnNameStyle(String style) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.columnNameStyle = style;
    }-*/;

    public native boolean isConnected() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.connected;
    }-*/;

    public native boolean isInTransaction() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.inTransaction;
    }-*/;

    public native int getLastInsertRowId() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.lastInsertRowID;
    }-*/;

    public native int getPageSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pageSize;
    }-*/;

    public native int getTotalChanges() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.totalChanges;
    }-*/;

    public native void analyze() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.analyze();
    }-*/;

    public native void analyze(String resourceName) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.analyze(resourceName);
    }-*/;

    public native void analyze(String resourceName, Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.analyze(
						resourceName,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void attach(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.attach(name);
    }-*/;

    public native void attach(String name, File reference) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.attach(
						name,
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void attach(String name, File reference, Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.attach(
						name,
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void attach(String name, File reference, Responder responder, ByteArray encryptionKey) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.attach(
						name,
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer,
						encryptionKey);
    }-*/;

    public native void begin() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.begin();
    }-*/;

    public void begin(SQLTransactionLockType option) {
        begin0(option != null ? option.value : null);
    }

    private native void begin0(String option) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.begin(option);
    }-*/;

    public native void begin(SQLTransactionLockType option, Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.begin(
						option.@com.emitrom.air4j.core.client.data.SQLTransactionLockType::value,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void cancel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.cancel();
    }-*/;

    public native void cancel(Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.cancel(responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    public native void close(Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.close(responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void commit() /*-{
		peer.commit();
    }-*/;

    public native void commit(Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.commit(responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void compact() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.compact();
    }-*/;

    public native void compact(Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.compact(responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void deanalyze() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.deanalyze();
    }-*/;

    public native void deanalyze(Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.deanalyze(responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void detach(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.detach(name);
    }-*/;

    public native void detach(String name, Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.detach(
						name,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native SQLSchemaResult getSchemaResult() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getSchemaResult();
    }-*/;

    public native void loadSchema() /*-{
		peer.loadSchema();
    }-*/;

    public native void loadSchema(SQLSchemaType type) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadSchema(type.@com.emitrom.air4j.core.client.data.SQLSchemaType::value);
    }-*/;

    public native void loadSchema(SQLSchemaType type, String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.loadSchema(
				type.@com.emitrom.air4j.core.client.data.SQLSchemaType::value,
				name);
    }-*/;

    public native void loadSchema(SQLSchemaType type, String name, String database) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.loadSchema(
				type.@com.emitrom.air4j.core.client.data.SQLSchemaType::value,
				name, database);
    }-*/;

    public native void loadSchema(SQLSchemaType type, String name, String database, boolean includeColumnSchema) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.loadSchema(
				type.@com.emitrom.air4j.core.client.data.SQLSchemaType::value,
				name, database, includeColumnSchema);
    }-*/;

    public native void loadSchema(SQLSchemaType type, String name, String database, boolean includeColumnSchema,
                    Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadSchema(
						type.@com.emitrom.air4j.core.client.data.SQLSchemaType::value,
						name,
						database,
						includeColumnSchema,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void open() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.open();
    }-*/;

    public native void open(File reference) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.open(reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public void open(File reference, SQLMode openMode) {
        open0(reference, openMode.value);
    }

    private native void open0(File reference, String openMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.open(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode);
    }-*/;

    public void open(File reference, SQLMode openMode, boolean autoCompact) {
        open0(reference, openMode.value, autoCompact);
    }

    private native void open0(File reference, String openMode, boolean autoCompact) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.open(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode, autoCompact);
    }-*/;

    public void open(File reference, SQLMode openMode, boolean autoCompact, int pageSize) {
        open0(reference, openMode.value, autoCompact, pageSize);
    }

    private native void open0(File reference, String openMode, boolean autoCompact, int pageSize) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.open(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode, autoCompact, pageSize);

    }-*/;

    public void open(File reference, SQLMode openMode, boolean autoCompact, int pageSize, ByteArray encryptionKey) {
        open0(reference, openMode.value, autoCompact, pageSize, encryptionKey);
    }

    private native void open0(File reference, String openMode, boolean autoCompact, int pageSize,
                    ByteArray encryptionKey) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.open(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode, autoCompact, pageSize, encryptionKey);
    }-*/;

    public native void openAsync() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.openAsync();
    }-*/;

    public native void openAsync(File reference) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.openAsync(reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public void openAsync(File reference, SQLMode openMode) {
        openAsync0(reference, openMode.value);
    }

    private native void openAsync0(File reference, String openMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.openAsync(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode);
    }-*/;

    public void openAsync(File reference, SQLMode openMode, Responder responder) {
        openAsync0(reference, openMode.value, responder);
    }

    private native void openAsync0(File reference, String openMode, Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.openAsync(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public void openAsync(File reference, SQLMode openMode, Responder responder, boolean autoCompact) {
        openAsync0(reference, openMode.value, responder, autoCompact);
    }

    private native void openAsync0(File reference, String openMode, Responder responder, boolean autoCompact) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.openAsync(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer,
						autoCompact);
    }-*/;

    public void openAsync(File reference, SQLMode openMode, Responder responder, boolean autoCompact, int pageSize) {
        openAsync0(reference, openMode.value, responder, autoCompact, pageSize);
    }

    private native void openAsync0(File reference, String openMode, Responder responder, boolean autoCompact,
                    int pageSize) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.openAsync(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer,
						autoCompact, pageSize);
    }-*/;

    public void openAsync(File reference, SQLMode openMode, Responder responder, boolean autoCompact, int pageSize,
                    ByteArray encryptionKey) {
        openAsync0(reference, openMode.value, responder, autoCompact, pageSize, encryptionKey);
    }

    private native void openAsync0(File reference, String openMode, Responder responder, boolean autoCompact,
                    int pageSize, ByteArray encryptionKey) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.openAsync(
						reference.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						openMode,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer,
						autoCompact, pageSize, encryptionKey);
    }-*/;

    public native void reencrypt(ByteArray newEncryptionKey) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.reencrypt(newEncryptionKey.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void reencrypt(ByteArray newEncryptionKey, Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.reencrypt(
						newEncryptionKey,
						responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

    public native void rollback() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.rollback();
    }-*/;

    public native void rollback(Responder responder) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.rollback(responder.@com.emitrom.air4j.core.client.net.Responder::jsoPeer);
    }-*/;

}
