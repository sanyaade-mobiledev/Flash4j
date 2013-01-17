/************************************************************************
  StorageVolumeInfo.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class StorageVolumeInfo extends EventDispatcher {

	private static final StorageVolumeInfo INSTANCE = new StorageVolumeInfo(
			getInstance());

	public static StorageVolumeInfo get() {
		return INSTANCE;
	}

	protected StorageVolumeInfo(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.filesystem.StorageVolumeInfo;
	}-*/;

	public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.filesystem.StorageVolumeInfo.storageVolumeInfo.isSupported;
	}-*/;

	public List<StorageVolumeInfo> getStorageVolumes() {
		List<StorageVolumeInfo> toReturn = new ArrayList<StorageVolumeInfo>();
		JavaScriptObject peers = _getStorageVolumes();
		int size = JsoHelper.arrayLength(peers);
		for (int i = 0; i < size; i++) {
			toReturn.add(new StorageVolumeInfo(JsoHelper
					.getValueFromJavaScriptObjectArray(peers, i)));
		}
		return toReturn;
	}

	private native JavaScriptObject _getStorageVolumes() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getStorageVolumes();
	}-*/;

	private static native JavaScriptObject getInstance() /*-{
		return $wnd.runtime.flash.filesystem.StorageVolumeInfo.storageVolumeInfo;
	}-*/;

}
