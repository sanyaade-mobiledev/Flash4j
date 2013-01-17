/************************************************************************
  NativeProcessStartupInfo.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.List;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.filesystem.File;
import com.emitrom.air4j.core.client.toplevel.StringVector;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * This class provides the basic information used to start a process on the host
 * operating system. It is constructed and passed to the start() method of a
 * NativeProcess object.
 * <p>
 * Native process access is only available to AIR applications installed with
 * native installers (applications in the extended desktop profile).
 * 
 */
public class NativeProcessStartupInfo extends ProxyObject {

    public NativeProcessStartupInfo() {
        jsObj = createNativePeer();
    }

    private NativeProcessStartupInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The File object that references an executable on the host operating
     * system.
     * 
     * @param file
     */
    public native void setExecutable(File file) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.executable = file.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * The File object that references an executable on the host operating
     * system.
     * 
     * @return
     */
    public native File getExecutable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.executable;
		var toReturn = @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The File object that references the initial working directory for the new
     * native process.
     * 
     * @param file
     */
    public native void setWorkingDirectory(File file) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.workingDirectory = file.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * The File object that references the initial working directory for the new
     * native process.
     * 
     * @return
     */
    public native File getWorkingDirectory() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.workingDirectory;
		var toReturn = @com.emitrom.air4j.core.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The command line arguments that will be passed to the process on startup
     * 
     * @param args
     */
    public void setArguments(List<String> args) {
        StringVector v = new StringVector();
        for (String s : args) {
            v.push(s);
        }
        _setArguments(v);
    }

    /**
     * The command line arguments that will be passed to the process on startup
     * 
     * @param args
     */
    public void setArguments(String... args) {
        StringVector v = new StringVector();
        for (String s : args) {
            v.push(s);
        }
        _setArguments(v);
    }

    private native JavaScriptObject createNativePeer()/*-{
		return new $wnd.runtime.flash.desktop.NativeProcessStartupInfo();
    }-*/;

    private native void _setArguments(StringVector args) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.arguments = args.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;
}
