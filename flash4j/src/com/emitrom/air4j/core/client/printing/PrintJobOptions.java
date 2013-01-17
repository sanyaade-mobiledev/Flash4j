/************************************************************************
  PrintJobOptions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.printing;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class PrintJobOptions extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.printing.PrintJobOptions;
    }-*/;

    protected PrintJobOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    public PrintJobOptions() {
        jsObj = newInstance();
    }

    public PrintJobOptions(boolean printAsBitmap) {
        jsObj = newInstance(printAsBitmap);
    }

    public native double getPixelsPerInch() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pixelsPerInch;
    }-*/;

    public native void setPixelsPerInch(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.pixelsPerInch = value;
    }-*/;

    public native boolean isPrintAsBitmap() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.printAsBitmap;
    }-*/;

    public native void setPrintAsBitmap(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.printAsBitmap = value;
    }-*/;

    public PrintMethod getPrintMethod() {
        return PrintMethod.fromValue(_getPrintMethod());
    }

    private native String _getPrintMethod() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.printMethod;
    }-*/;

    public void setPrintMethod(PrintMethod method) {
        _setPrintMethod(method.value);
    }

    private native void _setPrintMethod(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.printMethod = value;
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.printing.PrintJobOptions();
    }-*/;

    private static native JavaScriptObject newInstance(boolean printAsBitmap) /*-{
		return new $wnd.runtime.flash.printing.PrintJobOptions(printAsBitmap);
    }-*/;

}
