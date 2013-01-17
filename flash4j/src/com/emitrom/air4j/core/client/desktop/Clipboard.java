/************************************************************************
  Clipboard.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.desktop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.display.BitmapData;
import com.emitrom.air4j.core.client.filesystem.File;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Clipboard class provides a container for transferring data and objects
 * through the clipboard. The operating system clipboard can be accessed through
 * the static generalClipboard property.
 * <p>
 * A Clipboard object can contain the same information in more than one format.
 * By supplying information in multiple formats, you increase the chances that
 * another application will be able to use that information. Add data to a
 * Clipboard object with the setData() or setDataHandler() method.
 * </p>
 * 
 */
public class Clipboard extends ProxyObject {

    /**
     * Creates an empty Clipboard object.
     * 
     * Create Clipboard objects to hold the data of a native drag-and-drop
     * gesture in Adobe AIR. Clipboard objects can be used for only one
     * drag-and-drop gesture; they cannot be reused.
     * <p>
     * Do not create a Clipboard object for copy-and-paste operations. Use the
     * single Clipboard.getGeneralClipboard() object instead.
     * <p>
     * new Clipboard() is not supported in Flash Player, since only the
     * operating system clipboard can be used in Flash Player. For
     * copy-and-paste operations involving the operating system clipboard, use
     * the Clipboard.getGeneralClipboard() object rather than creating a new
     * Clipboard object. Does not throw an error in an AIR application.
     */
    private Clipboard() {
        jsObj = createNativePeer();
    }

    private Clipboard(JavaScriptObject peer) {
        jsObj = peer;
    }

    /**
     * @return, The operating system clipboard.
     */
    public static native Clipboard getGeneralClipboard() /*-{
		var obj = $wnd.runtime.flash.desktop.Clipboard.generalClipboard;
		return @com.emitrom.air4j.core.client.desktop.Clipboard::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Indicates whether the file promise clipboard format is supported on the
     * client system.
     * 
     * @return
     */
    public static native boolean supportsFilePromise() /*-{
		return $wnd.runtime.flash.desktop.Clipboard.supportsFilePromise;
    }-*/;

    /**
     * An array of strings containing the names of the data formats available in
     * this Clipboard object.
     * 
     * @return
     */
    public List<ClipboardFormats> getFormats() {
        List<ClipboardFormats> toReturn = new ArrayList<ClipboardFormats>();
        JsArrayString formats = _getFormats();
        for (int i = 0; i < formats.length(); i++) {
            toReturn.add(ClipboardFormats.fromValue(formats.get(i)));
        }
        return toReturn;
    }

    private native JsArrayString _getFormats() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.formats;
    }-*/;

    /**
     * Deletes all data representations from this Clipboard object.
     */
    public native void clear() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Deletes the data representation for the specified format.
     * 
     * @param format
     */
    public void clearData(ClipboardFormats format) {
        clearData(format.value);
    }

    /**
     * Deletes the data representation for the specified format.
     * 
     * @param format
     */
    public native void clearData(String format) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.clearData(format);
    }-*/;

    /**
     * Gets the clipboard data if data in the specified format is present.
     * 
     * @param <T>
     * @param format
     * @return
     */
    public <T> T getData(ClipboardFormats format) {
        return this.<T> _getData(format.value, ClipboardTransferMode.ORIGINAL_PREFERRED.value);
    }

    /**
     * Gets the clipboard data if data in the specified format is present.
     * 
     * @param <T>
     * @param format
     * @param transferMode
     * @return
     */
    public <T> T getData(ClipboardFormats format, ClipboardTransferMode transferMode) {
        return this.<T> _getData(format.value, transferMode.value);
    }

    /**
     * Gets the clipboard data if data in the specified format is present.
     * 
     * @param <T>
     * @param format
     * @param transferMode
     * @return
     */
    public <T> T getData(String format, ClipboardTransferMode transferMode) {
        return this.<T> _getData(format, transferMode.value);
    }

    private native <T> T _getData(String format, String transferMode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getData(format, transferMode);
    }-*/;

    /**
     * Checks whether data in the specified format exists in this Clipboard
     * object.
     * 
     * @param format
     * @return
     */
    public boolean hasFormat(ClipboardFormats format) {
        return this.hasFormat(format.value);
    }

    /**
     * Checks whether data in the specified format exists in this Clipboard
     * object.
     * 
     * @param format
     * @return
     */
    public native boolean hasFormat(String format) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.hasFormat(format);
    }-*/;

    /**
     * Adds a representation of the information to be transferred in the
     * specified data format.
     * 
     * @param format
     * @param data
     * @return
     */
    public boolean setData(ClipboardFormats format, Object data) {
        return this.setData(format.value, data);
    }

    public boolean setData(ClipboardFormats format, ProxyObject data) {
        return this.setData(format, data.getJsObj());
    }

    /**
     * Adds a representation of the information to be transferred in the
     * specified data format.
     * 
     * @param format
     * @param data
     * @return
     */
    private native boolean setData(String format, Object data) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.setData(format, data);
    }-*/;

    /**
     * Adds a representation of the information to be transferred in the
     * specified data format.
     * 
     * @param format
     * @param data
     * @param serializable
     * @return
     */
    public boolean setData(ClipboardFormats format, Object data, boolean serializable) {
        return this.setData(format.value, data, serializable);
    }

    public boolean setData(ClipboardFormats format, ProxyObject data, boolean serializable) {
        return this.setData(format, data.getJsObj(), serializable);
    }

    /**
     * Adds a representation of the information to be transferred in the
     * specified data format.
     * 
     * @param format
     * @param data
     * @param serializable
     * @return
     */
    private native boolean setData(String format, Object data, boolean serializable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.setData(format, data, serializable);
    }-*/;

    /**
     * Adds a reference to a handler function that produces the data to be
     * transfered.
     * 
     * @param format
     * @param handler
     * @return
     */
    public boolean setDataHandler(ClipboardFormats format, ClipboardDataHandler handler) {
        return this.setDataHandler(format.value, createNativeDataHandler(handler));
    }

    /**
     * Adds a reference to a handler function that produces the data to be
     * transfered.
     * 
     * @param format
     * @param handler
     * @return
     */
    public boolean setDataHandler(String format, ClipboardDataHandler handler) {
        return this.setDataHandler(format, createNativeDataHandler(handler));
    }

    private boolean setDataHandler(ClipboardFormats format, JavaScriptObject handler) {
        return this.setDataHandler(format.value, handler);
    }

    public void setData(String data) {
        setData(ClipboardFormats.TEXT, data);
    }

    public void setData(File... files) {
        setData(ClipboardFormats.FILE_LIST, DataConverter.fromList(Arrays.asList(files)));
    }

    public void setData(List<File> files) {
        setData(ClipboardFormats.FILE_LIST, DataConverter.fromList(files));
    }

    public void setData(BitmapData data) {
        setData(ClipboardFormats.BITMAP, data);
    }

    public String getStringContent() {
        return getData(ClipboardFormats.TEXT);
    }

    public String getStringContent(ClipboardTransferMode transferMode) {
        return getData(ClipboardFormats.TEXT, transferMode);
    }

    public List<File> getFileListContent() {
        JavaScriptObject obj = getData(ClipboardFormats.FILE_LIST);
        if (obj == null) {
            return null;
        }
        List<File> files = new ArrayList<File>();
        int size = JsoHelper.getJavaScriptObjectArraySize(obj);
        for (int i = 0; i < size; i++) {
            files.add(File.from(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return files;
    }

    public List<File> getFileListContent(ClipboardTransferMode transferMode) {
        JavaScriptObject obj = getData(ClipboardFormats.FILE_LIST, transferMode);
        if (obj == null) {
            return null;
        }
        List<File> files = new ArrayList<File>();
        int size = JsoHelper.getJavaScriptObjectArraySize(obj);
        for (int i = 0; i < size; i++) {
            files.add(File.from(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return files;
    }

    public BitmapData getBitmapContent() {
        JavaScriptObject obj = getData(ClipboardFormats.BITMAP);
        if (obj == null) {
            return null;
        }
        return BitmapData.cast(obj);
    }

    public BitmapData getBitmapContent(ClipboardTransferMode transferMode) {
        JavaScriptObject obj = getData(ClipboardFormats.BITMAP, transferMode);
        if (obj == null) {
            return null;
        }
        return BitmapData.cast(obj);
    }

    private native boolean setDataHandler(String format, JavaScriptObject handler) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.setDataHandler(format, handler);
    }-*/;

    public boolean setDataHandler(ClipboardFormats format, ClipboardDataHandler handler, boolean serializable) {
        return this.setDataHandler(format.value, createNativeDataHandler(handler), serializable);
    }

    public boolean setDataHandler(String format, ClipboardDataHandler handler, boolean serializable) {
        return this.setDataHandler(format, createNativeDataHandler(handler), serializable);
    }

    public boolean setDataHandler(ClipboardFormats format, JavaScriptObject handler, boolean serializable) {
        return this.setDataHandler(format.value, handler, serializable);
    }

    public native boolean setDataHandler(String format, JavaScriptObject handler, boolean serializable) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.setDataHandler(format, handler, serializable);
    }-*/;

    private native JavaScriptObject createNativeDataHandler(ClipboardDataHandler handler) /*-{
		return function() {
			return handler.@com.emitrom.air4j.core.client.desktop.ClipboardDataHandler::getData()();
		}
    }-*/;

    private native JavaScriptObject createNativePeer() /*-{
		return new $wnd.runtime.flash.desktop.Clipboard();
    }-*/;

    private void updateWith(JavaScriptObject obj) {
        jsObj = obj;
    }
}
