/************************************************************************
  Socket.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.air4j.core.client.utils.ByteArray;
import com.emitrom.air4j.core.client.utils.Endian;
import com.google.gwt.core.client.JavaScriptObject;

public class Socket extends EventDispatcher {

	protected Socket(JavaScriptObject obj) {
		jsObj = obj;
	}

	public Socket() {
		jsObj = newInstance();
	}

	public Socket(String host) {
		jsObj = newInstance(host);
	}

	public Socket(String host, int port) {
		jsObj = newInstance(host, port);
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.Socket;
	}-*/;

	/**
	 * [read-only] The number of bytes of data available for reading in the
	 * input buffer.
	 */
	public native int getBytesAvailable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bytesAvailable;
	}-*/;

	/** [read-only] Indicates whether peer Socket object is currently connected. */
	public native boolean isConnected() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.connected;
	}-*/;

	/**
	 * Indicates the byte order for the data; possible values are constants from
	 * the flash.utils.Endian class, Endian.BIG_ENDIAN or Endian.LITTLE_ENDIAN
	 */
	public Endian getEndian() {
		return Endian.fromValue(_getEndian());
	}

	private native String _getEndian() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.endian;
	}-*/;

	/** Controls the version of AMF used when writing or reading an object. */
	public ObjectEncoding getObjectEncoding() {
		return ObjectEncoding.fromValue(_getObjectEncoding());
	}

	private native int _getObjectEncoding() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.objectEncoding;
	}-*/;

	/** Indicates the number of milliseconds to wait for a connection. */
	public native int getTimeout() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.timeout;
	}-*/;

	/** Closes the socket */
	public native void close() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
	}-*/;

	/** Connects the socket to the specified host and port. */
	public native void connect(String host, int port) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.connect(host, port);
	}-*/;

	/** Flushes any accumulated data in the socket's output buffer */
	public native void flush() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.flush();
	}-*/;

	/** Reads a Boolean value from the socket. */
	public native boolean readBoolean() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readBoolean();
	}-*/;

	/** Reads a signe byte from the socket. */
	public native byte readByte() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readByte();
	}-*/;

	/**
	 * Reads the number of data bytes specified by the length parameter from the
	 * socket.
	 */
	public native void readBytes(ByteArray bytes) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.reabBytesArray(
				bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				0, 0);
	}-*/;

	/**
	 * Reads the number of data bytes specified by the length parameter from the
	 * socket.
	 */
	public native void readBytes(ByteArray bytes, int offset) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.reabBytesArray(
				bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				offset);
	}-*/;

	/**
	 * Reads the number of data bytes specified by the length parameter from the
	 * socket.
	 */
	public native void readBytes(ByteArray bytes, int offset, int length) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.reabBytesArray(
				bytes.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				offset, length);
	}-*/;

	/**
	 * Reads an IEEE 754 double-precision floating-point number from the socket.
	 */
	public native double readDouble() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readDouble();
	}-*/;

	/**
	 * Reads an IEEE 754 single-precision floating-point number from the socket.
	 */
	public native float readFloat() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readFloat();
	}-*/;

	/**
	 * Reads an IEEE 754 single-precision floating-point number from the socket.
	 */
	public native int readInt() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readInt();
	}-*/;

	/**
	 * Reads a multibyte string from the byte stream, using the specified
	 * character set.
	 */
	public native String readMultiByte(int length, String chartSet) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readMultiByte(length, charSet);
	}-*/;

	/** Reads an object from the socket, encoded in AMF serialized format. */
	public native Object readObject() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readOject();
	}-*/;

	/** Reads a signed 16-bit integer from the socket. */
	public native short readShort() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readShort();
	}-*/;

	/** Reads an unsigned byte from the socket. */
	public native int readUnsignedByte() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readUnsignedByte();
	}-*/;

	/** Reads an unsigned 32-bit integer from the socket. */
	public native int readUnsignedInt() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readUnsignedInt();
	}-*/;

	/** Reads an unsigned 16-bit integer from the socket. */
	public native int readUnsignedShort() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readUnsignedShort();
	}-*/;

	/** Reads a UTF-8 string from the socket. */
	public native String readUTF() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readUTF();
	}-*/;

	/**
	 * Reads the number of UTF-8 data bytes specified by the length parameter
	 * from the socket, and returns a string
	 * 
	 * @param length
	 *            , must be >= 0
	 * */
	public native String readUTFBytes(int length) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.readUTFBytes(length);
	}-*/;

	/** Writes a boolean to the socket. */
	public native void writeBoolean(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeBoolean(value);
	}-*/;

	/** Writes a byte to the sockett. */
	public native void writeByte(byte value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeByte(value);
	}-*/;

	/** Writes a sequence of bytes from the specified byte array. */
	public native void writeBytes(ByteArray bytes) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeBytes(bytes);
	}-*/;

	/** Writes a sequence of bytes from the specified byte array. */
	public native void writeBytes(ByteArray bytes, int offset) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeBytes(bytes, offset);
	}-*/;

	/** Writes a sequence of bytes from the specified byte array. */
	public native void writeBytes(ByteArray bytes, int offset, int length) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeBytes(bytes, offeset, length);
	}-*/;

	/** Writes an IEEE 754 double-precision floating-point number to the socket */
	public native void writeDouble(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeDouble(value);
	}-*/;

	/** Writes an IEEE 754 double-precision floating-point number to the socket */
	public native void writeFloat(float value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeFloat(value);
	}-*/;

	/** Writes a 32-bit signed integer to the socket. */
	public native void writeInt(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeInt(value);
	}-*/;

	/**
	 * Writes a multibyte string from the byte stream, using the specified
	 * character set.
	 */
	public native void writeMultyByte(String value, String charSet) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeMultyByte(value, charSet);
	}-*/;

	/** Write an object to the socket in AMF serialized format. */
	public native void writeObject(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeObject(value);
	}-*/;

	/** Write an object to the socket in AMF serialized format. */
	public native void writeShort(short value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeShort(value);
	}-*/;

	/** Write an object to the socket in AMF serialized format. */
	public native void writeUndsignedInt(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeUnsignedInt(value);
	}-*/;

	/**
	 * Writes the following data to the socket: a 16-bit unsigned integer, which
	 * indicates the length of the specified UTF-8 string in bytes, followed by
	 * the string itself.
	 */
	public native void writeUTF(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeUTF(value);
	}-*/;

	/** Writes a UTF-8 string to the socket. */
	public native void writeUTFBytes(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeUTFBytes(value);
	}-*/;

	/** Creates a new Socket object. */
	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.Socket();
	}-*/;

	/** Creates a new Socket object. */
	private static native JavaScriptObject newInstance(String host) /*-{
		return new $wnd.runtime.flash.net.Socket(host);
	}-*/;

	/** Creates a new Socket object. */
	private static native JavaScriptObject newInstance(String host, int port) /*-{
		return new $wnd.runtime.flash.net.Socket(host, port);
	}-*/;

}
