/************************************************************************
  SharedObject.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
/*
 *   
 */
package com.emitrom.air4j.core.client.net;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class SharedObject extends EventDispatcher {

	protected SharedObject(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.SharedObject;
	}-*/;

	/** Indicates the object on which callback methods should be invoked. */
	public native JavaScriptObject getClient() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.client;
	}-*/;

	/**
	 * The default object encoding (AMF version) for all local shared objects
	 * created in the SWF file.
	 */
	public ObjectEncoding getDefaultObjectEncoding() {
		return ObjectEncoding.fromValue(_getDefaultObjectEncoding());
	}

	private native int _getDefaultObjectEncoding() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.defaultObjectEncoding;
	}-*/;

	/**
	 * The default object encoding (AMF version) for all local shared objects
	 * created in the SWF file.
	 */
	public native double getFPS() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.fps;
	}-*/;

	/** The object encoding (AMF version) for peer shared object. */
	public ObjectEncoding getObjectEncoding() {
		return ObjectEncoding.fromValue(_getObjectEncoding());
	}

	private native int _getObjectEncoding() /*-{
		return peer.objectEncoding;
	}-*/;

	/** [read-only] The current size of the shared object, in bytes */
	public native int getSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.size;
	}-*/;

	/**
	 * For local shared objects, purges all of the data and deletes the shared
	 * object from the disk.
	 */
	public native void clear() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clear();
	}-*/;

	/** Closes the connection between a remote shared object and the server. */
	public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
	}-*/;

	/**
	 * Connects to a remote shared object on a server through a specified
	 * NetConnection object.
	 */
	public native void connect(String connectionString) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.connect(connectionString);
	}-*/;

	/**
	 * Connects to a remote shared object on a server through a specified
	 * NetConnection object.
	 */
	public native void connect(String connectionString, String param) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.connect(connectionString, param);
	}-*/;

	/** Immediately writes a locally persistent shared object to a local file. */
	public native void flush() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.flush();
	}-*/;

	/** Immediately writes a locally persistent shared object to a local file. */
	public native void flush(int minDiskSpace) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.flush(minDiskSpace);
	}-*/;

	/**
	 * [static] Returns a reference to a locally persistent shared object that
	 * is only available to the current client.
	 */
	public native SharedObject getLocal(String name) /*-{
		var obj = $wnd.runtime.flash.net.SharedObject.getLocal(name);
		return @com.emitrom.air4j.core.client.net.SharedObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * [static] Returns a reference to a locally persistent shared object that
	 * is only available to the current client.
	 */
	public native SharedObject getLocal(String name, String localPath) /*-{
		var obj = $wnd.runtime.flash.net.SharedObject.getLocal(name, localPath);
		return @com.emitrom.air4j.core.client.net.SharedObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * [static] Returns a reference to a locally persistent shared object that
	 * is only available to the current client.
	 */
	public static native SharedObject getLocal(String name, String localPath,
			boolean secure) /*-{
		var obj = $wnd.runtime.flash.net.SharedObject.getLocal(name, localPath,
				secure);
		return @com.emitrom.air4j.core.client.net.SharedObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * [static] Returns a reference to a shared object on Flash Media Server
	 * that multiple clients can access.
	 */
	public static native SharedObject getRemote(String name) /*-{
		var obj = $wnd.runtime.flash.net.SharedObject.getRemote(name);
		return @com.emitrom.air4j.core.client.net.SharedObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * [static] Returns a reference to a shared object on Flash Media Server
	 * that multiple clients can access.
	 */
	public static native SharedObject getRemote(String name, String remotePath) /*-{
		var obj = $wnd.runtime.flash.net.SharedObject.getRemote(name,
				remotePath);
		return @com.emitrom.air4j.core.client.net.SharedObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * [static] Returns a reference to a shared object on Flash Media Server
	 * that multiple clients can access.
	 */
	public static native SharedObject getRemote(String name, String remotePath,
			Object persistence) /*-{
		var obj = $wnd.runtime.flash.net.SharedObject.getRemote(name,
				remotePath, persistence);
		return @com.emitrom.air4j.core.client.net.SharedObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * [static] Returns a reference to a shared object on Flash Media Server
	 * that multiple clients can access.
	 */
	public static native SharedObject getRemote(String name, String remotePath,
			Object persistence, boolean secure) /*-{
		var obj = $wnd.runtime.flash.net.SharedObject.getRemote(name,
				remotePath, persistence, secure);
		return @com.emitrom.air4j.core.client.net.SharedObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Broadcasts a message to all clients connected to a remote shared object,
	 * including the client that sent the message.
	 */
	public native void send(String... arguments) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.send(arguments);
	}-*/;

	/**
	 * Indicates to the server that the value of a property in the shared object
	 * has changed.
	 */
	public native void setDirty(String propertyName) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setDirty(propertyName);
	}-*/;

	/**
	 * Updates the value of a property in a shared object and indicates to the
	 * server that the value of the property has changed.
	 */
	public native void setProperty(String propertyName, Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setProperty(propertyName, value);
	}-*/;

}
