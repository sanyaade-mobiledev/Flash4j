/************************************************************************
  FileListEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.events;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.filesystem.File;
import com.google.gwt.core.client.JavaScriptObject;

public class FileListEvent extends Event {

    public static final String DIRECTORY_LISTING = getConstant("DIRECTORY_LISTING");
    public static final String SELECT_MULTIPLE = getConstant("SELECT_MULTIPLE");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.FileListEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.FileListEvent[name];
    }-*/;

    protected FileListEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public List<File> getFiles() {
        List<File> toReturn = new ArrayList<File>();
        JavaScriptObject peers = _getFiles();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new File(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private final native JavaScriptObject _getFiles() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.files;
    }-*/;

    public static FileListEvent cast(Event e) {
        return new FileListEvent(e.getJsObj());
    }

}
