/************************************************************************
  Move.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.effects;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Move.
 */
public class Move extends TweenEffect {

    /**
     * Instantiates a new move.
     */
    protected Move(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the move
     */
    public Move() {
        jsObj = Bridge.createObject("mx.effects.Move");
    }

    /**
     * New instance.
     * 
     * @param value the value
     * @return the move
     */
    public Move(Object value) {
        this();
        setTarget(jsObj);
    }

    /**
     * Sets the x by.
     * 
     * @param value the new x by
     */
    public native void setXBy(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxBy(value);
    }-*/;

    /**
     * Gets the x by.
     * 
     * @return the x by
     */
    public native double getXBy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxBy();
    }-*/;

    /**
     * Sets the x from.
     * 
     * @param value the new x from
     */
    public native void setXFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxFrom(value);
    }-*/;

    /**
     * Gets the x from.
     * 
     * @return the x from
     */
    public native double getXFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxFrom();
    }-*/;

    /**
     * Sets the x to.
     * 
     * @param value the new x to
     */
    public native void setXTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxTo(value);
    }-*/;

    /**
     * Gets the x to.
     * 
     * @return the x to
     */
    public native double getXTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxTo();
    }-*/;

    /**
     * Sets the y by.
     * 
     * @param value the new y by
     */
    public native void setYBy(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyBy(value);
    }-*/;

    /**
     * Gets the y by.
     * 
     * @return the y by
     */
    public native double getYBy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyBy();
    }-*/;

    /**
     * Sets the y from.
     * 
     * @param value the new y from
     */
    public native void setYFrom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyFrom(value);
    }-*/;

    /**
     * Gets the y from.
     * 
     * @return the y from
     */
    public native double getYFrom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyFrom();
    }-*/;

    /**
     * Sets the y to.
     * 
     * @param value the new y to
     */
    public native void setYTo(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyTo(value);
    }-*/;

    /**
     * Gets the y to.
     * 
     * @return the y to
     */
    public native double getYTo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getyTo();
    }-*/;

}
