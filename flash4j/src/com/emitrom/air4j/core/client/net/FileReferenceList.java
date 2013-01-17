/************************************************************************
  FileReferenceList.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

public class FileReferenceList extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.FileReferenceList;
    }-*/;

    protected FileReferenceList(JavaScriptObject obj) {
        jsObj = obj;
    }

    public FileReferenceList() {
        jsObj = newInstance();
    }

    public List<FileReference> getFileList() {
        List<FileReference> toReturn = new ArrayList<FileReference>();
        JavaScriptObject peers = _getFileList();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new FileReference(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private final native JavaScriptObject _getFileList() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.fileList;
    }-*/;

    public final native void browse() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.browse();
    }-*/;

    public final boolean browse(FileFilter... typeFilter) {
        return _browse(DataConverter.fromList(Arrays.asList(typeFilter)));
    };

    private final native boolean _browse(JavaScriptObject typeFilter) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.browse(typeFilter);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.net.FileReferenceList();
    }-*/;

}
