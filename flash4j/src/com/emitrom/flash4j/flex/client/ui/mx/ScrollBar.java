/************************************************************************
 * ScrollBar.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ScrollBar.
 */
public class ScrollBar extends UIComponent {

    /**
     * Instantiates a new scroll bar.
     */
    protected ScrollBar(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the scroll bar
     */
    public ScrollBar() {
        jsObj = Bridge.createObject("mx.controls.scrollClasses.ScrollBar");
    }

    /**
     * Gets the direction.
     * 
     * @return the direction
     */
    public ScrollBarDirection getDirection() {
        return ScrollBarDirection.fromValue(_getDirection());
    }

    /**
     * _get direction.
     * 
     * @return the string
     */
    private native String _getDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdirection();
    }-*/;

    /**
     * Sets the direction.
     * 
     * @param direction
     *            the new direction
     */
    public void setDirection(ScrollBarDirection direction) {
        _setDirection(direction.value);
    }

    /**
     * _set direction.
     * 
     * @param value
     *            the value
     */
    private native void _setDirection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdirection(value);
    }-*/;

    /**
     * Gets the line scroll size.
     * 
     * @return the line scroll size
     */
    public native double getLineScrollSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlineScrollSize();
    }-*/;

    /**
     * Sets the line scroll size.
     * 
     * @param value
     *            the new line scroll size
     */
    public native void setLineScrollSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlineScrollSize(value);
    }-*/;

    /**
     * Gets the max scroll position.
     * 
     * @return the max scroll position
     */
    public native double getMaxScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxScrollPosition();
    }-*/;

    /**
     * Sets the max scroll position.
     * 
     * @param value
     *            the new max scroll position
     */
    public native void setMaxScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxScrollPosition(value);
    }-*/;

    /**
     * Gets the min scroll position.
     * 
     * @return the min scroll position
     */
    public native double getMinScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminScrollPosition();
    }-*/;

    /**
     * Sets the min scroll position.
     * 
     * @param value
     *            the new min scroll position
     */
    public native void setMinScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminScrollPosition(value);
    }-*/;

    /**
     * Gets the page scroll size.
     * 
     * @return the page scroll size
     */
    public native double getPageScrollSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpageScrollSize();
    }-*/;

    /**
     * Sets the page scroll size.
     * 
     * @param value
     *            the new page scroll size
     */
    public native void setPageScrollSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpageScrollSize(value);
    }-*/;

    /**
     * Gets the scroll position.
     * 
     * @return the scroll position
     */
    public native double getScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscrollPosition();
    }-*/;

    /**
     * Sets the scroll position.
     * 
     * @param value
     *            the new scroll position
     */
    public native void setScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscrollPosition(value);
    }-*/;

    /**
     * Sets the scroll properties.
     * 
     * @param pageSize
     *            the page size
     * @param minScrollPosition
     *            the min scroll position
     * @param maxScrollPosition
     *            the max scroll position
     */
    public native void setScrollProperties(double pageSize, double minScrollPosition, double maxScrollPosition)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setscrollProperties(pageSize, minScrollPosition,
						maxScrollPosition);
    }-*/;

    /**
     * Sets the scroll properties.
     * 
     * @param pageSize
     *            the page size
     * @param minScrollPosition
     *            the min scroll position
     * @param maxScrollPosition
     *            the max scroll position
     * @param pageScrollSize
     *            the page scroll size
     */
    public native void setScrollProperties(double pageSize, double minScrollPosition, double maxScrollPosition,
                    double pageScrollSize)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscrollProperties(pageSize, minScrollPosition,
				maxScrollPosition, pageScrollSize);
    }-*/;

}
