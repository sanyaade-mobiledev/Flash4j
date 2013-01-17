/************************************************************************
  InternalLink.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.links;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class InternalLink.
 */
public class InternalLink extends ProxyObject implements ILink {

    /**
     * Instantiates a new internal link.
     */
    InternalLink(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the internal link
     */
    public InternalLink() {
        jsObj = Bridge.createObject("org.alivepdf.links.InternalLink");
    }

    /**
     * New instance.
     * 
     * @param page the page
     * @return the internal link
     */
    public InternalLink(int page) {
        setPage(page);
    }

    /**
     * New instance.
     * 
     * @param page the page
     * @param y the y
     * @return the internal link
     */
    public InternalLink(int page, double y) {
        this(page);
        setY(y);
    }

    /**
     * New instance.
     * 
     * @param page the page
     * @param y the y
     * @param fit the fit
     * @return the internal link
     */
    public InternalLink(int page, double y, boolean fit) {
        this(page, y);
        setFit(fit);

    }

    /**
     * New instance.
     * 
     * @param page the page
     * @param y the y
     * @param fit the fit
     * @param rectangle the rectangle
     * @return the internal link
     */
    public InternalLink(int page, double y, boolean fit, Rectangle rectangle) {
        this(page, y, fit);
        setRectangle(rectangle);
    }

    /**
     * Gets the page.
     * 
     * @return the page
     */
    public native int getPage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpage();
    }-*/;

    /**
     * Sets the page.
     * 
     * @param value the new page
     */
    public native void setPage(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpage(value);
    }-*/;

    /**
     * Gets the y.
     * 
     * @return the y
     */
    public native int getY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gety();
    }-*/;

    /**
     * Sets the y.
     * 
     * @param y the new y
     */
    public native void setY(double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sety(y);
    }-*/;

    /**
     * Checks if is fit.
     * 
     * @return true, if is fit
     */
    public native boolean isFit() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfit;
    }-*/;

    /**
     * Sets the fit.
     * 
     * @param newValue the new fit
     */
    public final native void setFit(boolean newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfit(newValue);
    }-*/;

    /**
     * Gets the rectangle.
     * 
     * @return the rectangle
     */
    public final native Rectangle getRectangle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getrectangle();
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the rectangle.
     * 
     * @param newValue the new rectangle
     */
    public final native void setRectangle(Rectangle newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setrectangle(newValue.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    @Override
    public JavaScriptObject asILink() {
        return this.jsObj.cast();
    }

}
