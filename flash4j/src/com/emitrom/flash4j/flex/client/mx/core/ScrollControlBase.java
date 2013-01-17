/************************************************************************
  ScrollControlBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ScrollControlBase class is the base class for controls with scroll bars.
 * The user interacts with the scroll bar or the developer accesses methods and
 * properties that alter the viewable area. The ScrollControlBase takes a single
 * child object and positions and masks or sizes that object to display the
 * viewable content. All items to be scrolled must be children of that content
 * object
 */
public class ScrollControlBase extends UIComponent {

    /**
     * Instantiates a new scroll control base.
     */
    ScrollControlBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the scroll control base
     */
    protected ScrollControlBase() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Gets the border metrics.
     * 
     * @return the border metrics
     */
    public native EdgeMetrics getBorderMetrics()/*-{
		var peer = peer.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getBorderMetrics();
		return @com.emitrom.flash4j.flex.client.mx.core.EdgeMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the horizontal scroll policy.
     * 
     * @return the horizontal scroll policy
     */
    public ScrollPolicy getHorizontalScrollPolicy() {
        return ScrollPolicy.fromValue(_getHorizontalScrollPolicy());
    }

    /**
     * _get horizontal scroll policy.
     * 
     * @return the string
     */
    private native String _getHorizontalScrollPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalScrollPolicy();
    }-*/;

    /**
     * Sets the horizontal scroll policy.
     * 
     * @param policy
     *            the new horizontal scroll policy
     */
    public void setHorizontalScrollPolicy(ScrollPolicy policy) {
        _setHorizontalScrollPolicy(policy.value);
    }

    /**
     * _set horizontal scroll policy.
     * 
     * @param value
     *            the value
     */
    private native void _setHorizontalScrollPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalScrollPolicy(value);
    }-*/;

    /**
     * Checks if is live scoring.
     * 
     * @return true, if is live scoring
     */
    public native boolean isLiveScoring()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getliveScoring();
    }-*/;

    /**
     * Sets the live scoring.
     * 
     * @param value
     *            the new live scoring
     */
    public native void setLiveScoring(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setliveScroring(value);
    }-*/;

    /**
     * Sets the horizontal scroll position.
     * 
     * @param value
     *            the new horizontal scroll position
     */
    public native void setHorizontalScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalScrollPosition(value);
    }-*/;

    /**
     * Gets the horizontal scroll position.
     * 
     * @return the horizontal scroll position
     */
    public native double getHorizontalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalScrollPosition();
    }-*/;

    /**
     * Gets the max horizontal scroll position.
     * 
     * @return the max horizontal scroll position
     */
    public native double getMaxHorizontalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxHorizontalScrollPosition();
    }-*/;

    /**
     * Sets the max horizontal scroll position.
     * 
     * @param value
     *            the value
     * @return the double
     */
    public native double setMaxHorizontalScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setmaxHorizontalScrollPosition(value);
    }-*/;

    /**
     * Show scroll tips.
     * 
     * @return true, if successful
     */
    public native boolean showScrollTips()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowScrollTips();
    }-*/;

    /**
     * Sets the show scroll tips.
     * 
     * @param value
     *            the new show scroll tips
     */
    public native void setShowScrollTips(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscrollTips(value);
    }-*/;

    /**
     * Gets the vertical scroll policy.
     * 
     * @return the vertical scroll policy
     */
    public ScrollPolicy getVerticalScrollPolicy() {
        return ScrollPolicy.fromValue(_getVerticalScrollPolicy());
    }

    /**
     * _get vertical scroll policy.
     * 
     * @return the string
     */
    private native String _getVerticalScrollPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalScrollPolicy();
    }-*/;

    /**
     * Sets the vertical scroll policy.
     * 
     * @param policy
     *            the new vertical scroll policy
     */
    public void setVerticalScrollPolicy(ScrollPolicy policy) {
        _setVerticalScrollPolicy(policy.value);
    }

    /**
     * _set vertical scroll policy.
     * 
     * @param value
     *            the value
     */
    private native void _setVerticalScrollPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalScrollPolicy(value);
    }-*/;

    /**
     * Gets the vertical scroll position.
     * 
     * @return the vertical scroll position
     */
    public native double getVerticalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getVerticalScrollPosition();
    }-*/;

    /**
     * Sets the vertical scroll position.
     * 
     * @param value
     *            the new vertical scroll position
     */
    public native void setVerticalScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalScrollPosition(value);
    }-*/;

    /**
     * Gets the max vertical scroll position.
     * 
     * @return the max vertical scroll position
     */
    public native double getMaxVerticalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxVerticalScrollPosition();
    }-*/;

    /**
     * Sets the max vertical scroll position.
     * 
     * @param value
     *            the new max vertical scroll position
     */
    public native void setMaxVerticalScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxVerticalScrollPosition(value);
    }-*/;

    /**
     * Gets the view metrics.
     * 
     * @return the view metrics
     */
    public native EdgeMetrics getViewMetrics()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getviewMetrics();
		return @com.emitrom.flash4j.flex.client.mx.core.EdgeMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
