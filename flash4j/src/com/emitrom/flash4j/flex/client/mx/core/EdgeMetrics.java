/************************************************************************
  EdgeMetrics.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.core;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class EdgeMetrics.
 */
public class EdgeMetrics extends ProxyObject {

    /**
     * Instantiates a new edge metrics.
     */
    EdgeMetrics(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the edge metrics
     */
    public EdgeMetrics() {
        jsObj = Bridge.createObject("mx.core.EdgeMetrics");
        setBottom(0);
        setTop(0);
        setLeft(0);
        setRight(0);
    }

    /**
     * Gets the bottom.
     * 
     * @return the bottom
     */
    public final native double getBottom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbottom();
    }-*/;

    /**
     * Sets the bottom.
     * 
     * @param value the new bottom
     */
    public final native void setBottom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbottom(value);
    }-*/;

    /**
     * Gets the left.
     * 
     * @return the left
     */
    public final native double getLeft()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getleft();
    }-*/;

    /**
     * Sets the left.
     * 
     * @param value the new left
     */
    public final native void setLeft(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setleft(value);
    }-*/;

    /**
     * Gets the right.
     * 
     * @return the right
     */
    public final native double getRight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getright();
    }-*/;

    /**
     * Sets the right.
     * 
     * @param value the new right
     */
    public final native void setRight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setright(value);
    }-*/;

    /**
     * Gets the top.
     * 
     * @return the top
     */
    public final native double getTop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettop();
    }-*/;

    /**
     * Sets the top.
     * 
     * @param value the new top
     */
    public final native void setTop(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settop(value);
    }-*/;
}
