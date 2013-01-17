/************************************************************************
  FileReference.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.net;

import java.util.List;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The FileReference class provides a means to upload and download files between
 * a user's computer and a server. An operating-system dialog box prompts the
 * user to select a file to upload or a location for download. Each
 * FileReference object refers to a single file on the user's disk and has
 * properties that contain information about the file's size, type, name,
 * creation date, modification date, and creator type (Macintosh only).
 */
public class FileReference extends EventDispatcher {

    public FileReference() {
        jsObj = createNativePeer();
    }

    FileReference(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the file reference
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.net.FileReference");
    }

    /**
     * Gets the creation date of the file on the local disk.
     * 
     * @return the creation date
     */
    public native Date getCreationDate() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcreationDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the Macintosh creator type of the file, which is only used in Mac OS
     * versions prior to Mac OS X.
     * 
     * @return the creator
     */
    public native String getCreator()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcreator();
    }-*/;

    /**
     * Gets the ByteArray object representing the data from the loaded file
     * after a successful call to the load() method
     * 
     * @return the data
     */
    public native ByteArray getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdata();
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the date that the file on the local disk was last modified.
     * 
     * @return the modification date
     */
    public native Date getModificationDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmodificationDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the name of the file on the local disk.
     * 
     * @return the name
     */
    public native String getName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getname();
    }-*/;

    /**
     * Gets the size of the file on the local disk in bytes.
     * 
     * @return the size
     */
    public native double getSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsize();
    }-*/;

    /**
     * Gets the file type.
     * 
     * @return the type
     */
    public native String getType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettype();
    }-*/;

    /**
     * Displays a file-browsing dialog box that lets the user select a file to
     * upload.
     * 
     * @return true, if successful
     */
    public native boolean browse() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.browse();
    }-*/;

    /**
     * Displays a file-browsing dialog box that lets the user select a file to
     * upload.
     * 
     * @return true, if successful
     */
    public boolean browse(List<FileFilter> filters) {
        JsArray<JavaScriptObject> nativePeers = JsArray.createArray().cast();
        for (FileFilter filter : filters) {
            nativePeers.push(filter.getJsObj());
        }
        return _browse(nativePeers);
    }

    /**
     * Displays a file-browsing dialog box that lets the user select a file to
     * upload.
     * 
     * @return true, if successful
     */
    public boolean browse(FileFilter... filters) {
        JsArray<JavaScriptObject> nativePeers = JsArray.createArray().cast();
        for (FileFilter filter : filters) {
            nativePeers.push(filter.getJsObj());
        }
        return _browse(nativePeers);
    }

    private native boolean _browse(JavaScriptObject filters) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.browse(filters);
    }-*/;

    /**
     * Cancels any ongoing upload or download operation on this FileReference
     * object.
     */
    public native void cancel() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.cancel();
    }-*/;

    /**
     * Opens a dialog box that lets the user download a file from a remote
     * server.
     * 
     * @param request the request
     */
    public native void download(URLRequest request) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.download(request.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Opens a dialog box that lets the user download a file from a remote
     * server.
     * 
     * @param request the request
     * @param defaultFileName the default file name
     */
    public native void download(URLRequest request, String defaultFileName) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.download(
						request.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						defaultFileName);
    }-*/;

    /**
     * Starts the load of a local file selected by a user
     */
    public native void load() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.load();
    }-*/;

    /**
     * Opens a dialog box that lets the user save a file to the local
     * filesystem.
     * 
     * @param data the data
     */
    public native void save(String data) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.save(data);
    }-*/;

    /**
     * Opens a dialog box that lets the user save a file to the local
     * filesystem.
     * 
     * @param data the data
     * @param defaultFileName the default file name
     */
    public native void save(String data, String defaultFileName) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.save(data, defaultFileName);
    }-*/;

    /**
     * Opens a dialog box that lets the user save a file to the local
     * filesystem.
     * 
     * @param data the data
     */
    public native void save(ByteArray data) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.save(data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Opens a dialog box that lets the user save a file to the local
     * filesystem.
     * 
     * @param data the data
     * @param defaultFileName the default file name
     */
    public native void save(ByteArray data, String defaultFileName) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.save(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						defaultFileName);
    }-*/;

    /**
     * Starts the upload of the file to a remote server.
     * 
     * @param request the request
     */
    public native void upload(URLRequest request) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.upload(request.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Starts the upload of the file to a remote server.
     * 
     * @param request the request
     * @param uploadDataFieldName the upload data field name
     */
    public native void upload(URLRequest request, String uploadDataFieldName) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.upload(
						request.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						uploadDataFieldName);
    }-*/;

    /**
     * Starts the upload of the file to a remote server.
     * 
     * @param request the request
     * @param uploadDataFieldName the upload data field name
     * @param testUpload the test upload
     */
    public native void upload(URLRequest request, String uploadDataFieldName, boolean testUpload) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.upload(
						request.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						uploadDataFieldName, testUpload);
    }-*/;

}
