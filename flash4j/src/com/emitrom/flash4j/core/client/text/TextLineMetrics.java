/************************************************************************
  TextLineMetrics.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * Copyright 2010 Alain Ekambi
 */
package com.emitrom.flash4j.core.client.text;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TextLineMetrics.
 */
public class TextLineMetrics extends ProxyObject {

    /**
     * Creates the.
     * 
     * @return the text line metrics
     */
    public TextLineMetrics() {
        jsObj = Bridge.createObject("flash.text.TextLineMetrics");
    }

    TextLineMetrics(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the ascent.
     * 
     * @return the ascent
     */
    public native double getAscent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getascent();
    }-*/;

    /**
     * Sets the ascent.
     * 
     * @param value the new ascent
     */
    public native void setAscent(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setascent(value);
    }-*/;

    /**
     * Gets the descent.
     * 
     * @return the descent
     */
    public native double getDescent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdescent();
    }-*/;

    /**
     * Sets the descent.
     * 
     * @param value the new descent
     */
    public native void setDescent(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdescent(value);
    }-*/;

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public native double getHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Sets the height.
     * 
     * @param value the new height
     */
    public native void setHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheight(value);
    }-*/;

    /**
     * Gets the leading.
     * 
     * @return the leading
     */
    public native double getLeading()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getleading();
    }-*/;

    /**
     * Sets the leading.
     * 
     * @param value the new leading
     */
    public native void setLeading(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setleading(value);
    }-*/;

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public native double getWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Sets the width.
     * 
     * @param value the new width
     */
    public native void setWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwidth(value);
    }-*/;

    /**
     * Gets the x.
     * 
     * @return the x
     */
    public native double getX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getx();
    }-*/;

    /**
     * Sets the x.
     * 
     * @param value the new x
     */
    public native void setX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setx(value);
    }-*/;

}
