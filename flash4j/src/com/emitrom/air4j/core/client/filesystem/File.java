/************************************************************************
  File.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.filesystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.desktop.Icon;
import com.emitrom.air4j.core.client.net.FileFilter;
import com.emitrom.air4j.core.client.net.FileReference;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

public class File extends FileReference {

    public File(JavaScriptObject obj) {
        jsObj = obj;
    }

    public File() {
        jsObj = newInstance();
    }

    public File(String path) {
        jsObj = newInstance(path);
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.filesystem.File;
    }-*/;

    public static native File getApplicationDirectory() /*-{
		var obj = $wnd.runtime.flash.filesystem.File.applicationDirectory;
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native File getApplicationStorageDirectory() /*-{
		var obj = $wnd.runtime.flash.filesystem.File.applicationStorageDirectory;
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native File getDesktopDirectory() /*-{
		var obj = $wnd.runtime.flash.filesystem.File.desktopDirectory;
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native File getDocumentsDirectory() /*-{
		var obj = $wnd.runtime.flash.filesystem.File.documentsDirectory;
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native File getUserDirectory() /*-{
		var obj = $wnd.runtime.flash.filesystem.File.userDirectory;
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native String getLineEnding() /*-{
		return $wnd.runtime.flash.filesystem.File.lineEnding;
    }-*/;

    public static native String getSeparator() /*-{
		return $wnd.runtime.flash.filesystem.File.separator;
    }-*/;

    public static native String getSystemCharset() /*-{
		return $wnd.runtime.flash.filesystem.File.systemCharset;
    }-*/;

    public static native File createTempDirectory() /*-{
		var obj = $wnd.runtime.flash.filesystem.File.createTempDirectory();
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native File createTempFile() /*-{
		var obj = $wnd.runtime.flash.filesystem.File.createTempFile();
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static List<File> getRootDirectories() {
        List<File> toReturn = new ArrayList<File>();
        JavaScriptObject peers = _getRootDirectories();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new File(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private static native JavaScriptObject _getRootDirectories() /*-{
		return $wnd.runtime.flash.filesystem.File.getRootDirectories();
    }-*/;

    public native boolean exists() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.exists;
    }-*/;

    public native Icon getIcon() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.icon;
		return @com.emitrom.air4j.core.client.desktop.Icon::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean isDirectory() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isDirectory;
    }-*/;

    public native boolean isDownloaded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.downloaded;
    }-*/;

    public native void setDownloaded(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.downloaded = value;
    }-*/;

    public native boolean isHidden() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isHidden;
    }-*/;

    public native boolean isPackage() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isPackage;
    }-*/;

    public native boolean isSymbolicLink() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isSymbolicLink();
    }-*/;

    public native String getNativePath() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.nativePath;
    }-*/;

    public native void setNativePath(String nativePath) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.nativePath = nativePath;
    }-*/;

    public native File getParent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.parent;
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native String getURL() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.url;
    }-*/;

    public native void setURL(String url) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.url = url;
    }-*/;

    public native double getSpaceAvailable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.spaceAvailable;
    }-*/;

    public native void browseForDirectory(String title) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.browseForDirectory(title);
    }-*/;

    public native void browseForOpen(String title) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.browseForOpen(title);
    }-*/;

    public void browseForOpen(String title, FileFilter... filters) {
        _browseForOpen(title, DataConverter.fromList(Arrays.asList(filters)));
    }

    private native void _browseForOpen(String title, JavaScriptObject typeFilter) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.browseForOpen(title, typeFilter);
    }-*/;

    public native void browseForOpenMultiple(String title) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.browseForOpenMultiple(title);
    }-*/;

    public void browseForOpenMultiple(String title, FileFilter... filters) {
        _browseForOpenMultiple(title, DataConverter.fromList(Arrays.asList(filters)));
    }

    private native void _browseForOpenMultiple(String title, JavaScriptObject typeFilter) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.browseForOpenMultiple(title, typeFilter);
    }-*/;

    public native void browseForSave(String title) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.browseForSave(title);
    }-*/;

    public native void canonicalize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.canonicalize();
    }-*/;

    public native File clone() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void copyTo(FileReference newLocation) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyTo(newLocation.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void copyTo(FileReference newLocation, boolean overwrite) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyTo(
						newLocation.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						overwrite);
    }-*/;

    public native void copyToAsync(FileReference newLocation) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyToAsync(newLocation.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void copyToAsync(FileReference newLocation, boolean overwrite) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.copyToAsync(
						newLocation.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						overwrite);
    }-*/;

    public native void createDirectory() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.createDirectory();
    }-*/;

    public native void deleteDirectory() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		try {
			peer.deleteDirectory();
		} catch (e) {
			var msg = "Error while trying to delete directory : "
					+ peer.nativePath
					+ ". Make sure the directory is empty or call deleteDirectory(true) ";
			$wnd.runtime.trace(msg);
		}
    }-*/;

    public native void deleteDirectory(boolean deleteDirectoryContents) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.deleteDirectory(deleteDirectoryContents);
    }-*/;

    public native void deleteDirectoryAsync() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.deleteDirectoryAsync();
    }-*/;

    public native void deleteDirectoryAsync(boolean deleteDirectoryContents) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.deleteDirectoryAsync(deleteDirectoryContents);
    }-*/;

    public native void deleteFile() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.deleteFile();
    }-*/;

    public native void deleteFileAsync() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.deleteFileAsync();
    }-*/;

    public native void openWithDefaultApplication() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.openWithDefaultApplication();
    }-*/;

    public List<File> getDirectoryListing() {
        List<File> toReturn = new ArrayList<File>();
        JavaScriptObject peers = _getDirectoryListing();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new File(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getDirectoryListing() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getDirectoryListing();
    }-*/;

    public native void getDirectoryListingAsync() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.getDirectoryListingAsync();
    }-*/;

    public native String getRelativePath(FileReference ref) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getRelativePath(ref.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native String getRelativePath(FileReference ref, boolean useDotDot) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getRelativePath(
						ref,
						useDotDot.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void moveTo(FileReference newLocation) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.moveTo(newLocation.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void moveTo(FileReference newLocation, boolean overwrite) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.moveTo(
						newLocation.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						overwrite);
    }-*/;

    public native void moveToAsync(FileReference newLocation) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.moveToAsync(newLocation.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void moveToAsync(FileReference newLocation, boolean overwrite) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.moveToAsync(
						newLocation.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						overwrite);
    }-*/;

    public native void moveToTrash() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.moveToTrash();
    }-*/;

    public native void moveToTrashAsync() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.moveToTrashAsync();
    }-*/;

    public native File resolvePath(String path) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.resolvePath(path);
		return @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static File from(JavaScriptObject obj) {
        return new File(obj);
    }

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.filesystem.File();
    }-*/;

    private static native JavaScriptObject newInstance(String path) /*-{
		return new $wnd.runtime.flash.filesystem.File(path);
    }-*/;

}
