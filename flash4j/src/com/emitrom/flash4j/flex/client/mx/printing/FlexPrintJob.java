/************************************************************************
  FlexPrintJob.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.printing;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.IUIComponent;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The FlexPrintJob class is a wrapper for the flash.printing.PrintJob class. It
 * supports automatically slicing and paginating the output on multilple pages,
 * and scaling the grid contents to fit the printer's page size.
 */
public class FlexPrintJob extends ProxyObject {

    /**
     * Instantiates a new flex print job.
     */
    protected FlexPrintJob(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the flex print job
     */
    public FlexPrintJob() {
        jsObj = Bridge.createObject("mx.printing.FlexPrintJob");
    }

    /**
     * Gets the page height.
     * 
     * @return the page height
     */
    public final native double getPageHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpageHeight();
    }-*/;

    /**
     * Gets the page width.
     * 
     * @return the page width
     */
    public final native double getPageWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpageWidth();
    }-*/;

    /**
     * Prints the as bitmap.
     * 
     * @return true, if successful
     */
    public final native boolean printAsBitmap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getprintAsBitmap();
    }-*/;

    /**
     * Sets the prints the as bitmap.
     * 
     * @param value the new prints the as bitmap
     */
    public final native void setPrintAsBitmap(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprintAsBitmap(value);
    }-*/;

    /**
     * Adds the object.
     * 
     * @param object the object
     */
    public final void addObject(UIComponent object) {
        _addObject(object.asIUIComponent());
    }

    /**
     * _add object.
     * 
     * @param object the object
     */
    private final native void _addObject(JavaScriptObject object)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addObject(object);
    }-*/;

    /**
     * Adds the object.
     * 
     * @param object the object
     * @param scaleType the scale type
     */
    public final void addObject(IUIComponent object, FlexPrintJobScaleType scaleType) {
        _addObject(object.asIUIComponent(), scaleType.value);
    }

    /**
     * _add object.
     * 
     * @param object the object
     * @param scaleType the scale type
     */
    private final native void _addObject(JavaScriptObject object, String scaleType)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addObject(object, scaleType);
    }-*/;

    /**
     * Send.
     */
    public final native void send()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.send();
    }-*/;

    /**
     * Start.
     * 
     * @return true, if successful
     */
    public final native boolean start()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.start();
    }-*/;
}
