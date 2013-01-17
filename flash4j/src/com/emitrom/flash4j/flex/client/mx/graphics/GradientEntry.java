/************************************************************************
  GradientEntry.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.graphics;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GradientEntry.
 */
public class GradientEntry extends EventDispatcher {

    /**
     * Instantiates a new gradient entry.
     */
    protected GradientEntry(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the gradient entry
     */
    public GradientEntry() {
        jsObj = Bridge.createObject("mx.graphics.GradientEntry");
    }

    /**
     * Gets the alpha.
     * 
     * @return the alpha
     */
    public native double getAlpha()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalpha();
    }-*/;

    /**
     * Sets the alpha.
     * 
     * @param value the new alpha
     */
    public native void setAlpha(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setalpha(value);
    }-*/;

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public native int getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * Sets the color.
     * 
     * @param value the new color
     */
    public native void setColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    /**
     * Gets the ratio.
     * 
     * @return the ratio
     */
    public native double getRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getratio();
    }-*/;

    /**
     * Sets the ratio.
     * 
     * @param value the new ratio
     */
    public native void setRatio(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setratio(value);
    }-*/;

}
