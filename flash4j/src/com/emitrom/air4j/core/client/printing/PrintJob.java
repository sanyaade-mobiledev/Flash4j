/************************************************************************
  PrintJob.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.printing;

import com.emitrom.air4j.core.client.display.Sprite;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class PrintJob extends EventDispatcher {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.printing.PrintJob;
    }-*/;

    public PrintJob() {
        jsObj = newInstance();
    }

    protected PrintJob(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean isActive() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.active;
    }-*/;

    public native int getCopies() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.copies;
    }-*/;

    public native void setCopies(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.copies = value;
    }-*/;

    public native int getFirstPage() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.firstPage;
    }-*/;

    public native boolean isColor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isColor;
    }-*/;

    public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.printing.PrintJob.isSupported;
    }-*/;

    public native String getJobname() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.jobName;
    }-*/;

    public native void setJobName(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.jobName = value;
    }-*/;

    public native int getLastPage() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.lastPage;
    }-*/;

    public native double getMaxPixelsPerInch() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.maxPixelsPerInch;
    }-*/;

    public PrintJobOrientation getOrientation() {
        return PrintJobOrientation.fromValue(_getOrientation());
    }

    private native String _getOrientation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.orientation;
    }-*/;

    public void setOrientation(PrintJobOrientation orientation) {
        _setOrientation(orientation.value);
    }

    private native void _setOrientation(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.orientation = value;
    }-*/;

    public native int getPageHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pageHeight;
    }-*/;

    public native int getPageWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pageWidth;
    }-*/;

    public native int getPaperHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.paperHeight;
    }-*/;

    public native int getPaperWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.paperWidth;
    }-*/;

    public native Rectangle getPrintableArea() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.printableArea;
    }-*/;

    public native String getPrinter() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.printer;
    }-*/;

    public native void setPrinter(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.printer = value;
    }-*/;

    public native JsArrayString getPrinters() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.printers;
    }-*/;

    public static native boolean supportsPageSetupDialog() /*-{
		return $wnd.runtime.flash.printing.PrintJob.supportsPageSetupDialog;
    }-*/;

    public native void addPage(Sprite sprite) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addPage(sprite.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void addPage(Sprite sprite, Rectangle printArea) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addPage(
						sprite.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						printArea.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void addPage(Sprite sprite, Rectangle printArea, PrintJobOptions options) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addPage(
						sprite.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						printArea.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						options.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void addPage(Sprite sprite, Rectangle printArea, PrintJobOptions options, int frameNum) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addPage(
						sprite.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						printArea.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						options.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						frameNum);
    }-*/;

    public void selectPaperSize(PaperSize paperSize) {
        _selectPaperSize(paperSize.value);
    }

    private native void _selectPaperSize(String paperSize) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.selectPaperSize(paperSize);
    }-*/;

    public native void send() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.send();
    }-*/;

    public native boolean showPageSetupDialog() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.showPageSetupDialog();
    }-*/;

    public native boolean start() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.start();
    }-*/;

    public native boolean start2(PrintUIOptions uiOptions) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.start2(uiOptions.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean start2(PrintUIOptions uiOptions, boolean showPrintDialog) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.start2(
						uiOptions.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						showPrintDialog);
    }-*/;

    public native void terminate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.terminate();
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.printing.PrintJob();
    }-*/;

}
