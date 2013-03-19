/************************************************************************
 * SuperTabNavigator.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.flexlib.client.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.ui.mx.TabNavigator;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SuperTabNavigator.
 */
public class SuperTabNavigator extends TabNavigator {

    /** The Constant POPUPPOLICY_AUTO. */
    public static String POPUPPOLICY_AUTO = "auto";

    /** The Constant POPUPPOLICY_OFF. */
    public static String POPUPPOLICY_OFF = "off";

    /** The Constant POPUPPOLICY_ON. */
    public static String POPUPPOLICY_ON = "on";

    /**
     * Instantiates a new super tab navigator.
     */
    protected SuperTabNavigator(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the super tab navigator
     */
    public SuperTabNavigator() {
        jsObj = Bridge.createObject("flexlib.containers.SuperTabNavigator");
    }

    /**
     * Allow tab squeezing.
     * 
     * @return true, if successful
     */
    public native boolean allowTabSqueezing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getallowTabSqueezing();
    }-*/;

    /**
     * Sets the allow tab squeezing.
     * 
     * @param value
     *            the new allow tab squeezing
     */
    public native void setAllowTabSqueezing(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setallowTabSqueezing(value);
    }-*/;

    /**
     * Gets the close policy.
     * 
     * @return the close policy
     */
    public native String getClosePolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclosePolicy();
    }-*/;

    /**
     * Sets the close policy.
     * 
     * @param value
     *            the new close policy
     */
    public native void setClosePolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setclosePolicy(value);
    }-*/;

    /**
     * Drag enabled.
     * 
     * @return true, if successful
     */
    public native boolean dragEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdragEnabled();
    }-*/;

    /**
     * Sets the drag enabled.
     * 
     * @param value
     *            the new drag enabled
     */
    public native void setDragEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdragEnabled(value);
    }-*/;

    /**
     * Drop enabled.
     * 
     * @return true, if successful
     */
    public native boolean dropEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdropEnabled();
    }-*/;

    /**
     * Sets the drop enabled.
     * 
     * @param value
     *            the new drop enabled
     */
    public native void setDropEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdropEnabled(value);
    }-*/;

    /**
     * Editable tab labels.
     * 
     * @return true, if successful
     */
    public native boolean editableTabLabels()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteditableTabLabels();
    }-*/;

    /**
     * Sets the editable tab labels.
     * 
     * @param value
     *            the new editable tab labels
     */
    public native void setEditableTabLabels(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seteditableTabLabels(value);
    }-*/;

    /**
     * Gets the min tab width.
     * 
     * @return the min tab width
     */
    public native double getMinTabWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminTabWidth();
    }-*/;

    /**
     * Sets the min tab width.
     * 
     * @param value
     *            the new min tab width
     */
    public native void setMinTabWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminTabWidth(value);
    }-*/;

    /**
     * Gets the pop up button policy.
     * 
     * @return the pop up button policy
     */
    public native String getPopUpButtonPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpopUpButtonPolicy();
    }-*/;

    /**
     * Sets the pop up button policy.
     * 
     * @param value
     *            the new pop up button policy
     */
    public native void setPopUpButtonPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpopUpButtonPolicy(value);
    }-*/;

    /**
     * Gets the scroll speed.
     * 
     * @return the scroll speed
     */
    public native double getScrollSpeed()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscrollSpeed();
    }-*/;

    /**
     * Sets the scroll speed.
     * 
     * @param value
     *            the new scroll speed
     */
    public native void setScrollSpeed(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscrollSpeed(value);
    }-*/;

    /**
     * Gets the start scrolling event.
     * 
     * @return the start scrolling event
     */
    public native String getStartScrollingEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartScrollingEvent();
    }-*/;

    /**
     * Sets the start scrolling event.
     * 
     * @param value
     *            the new start scrolling event
     */
    public native void setStartScrollingEvent(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartScrollingEvent(value);
    }-*/;

    /**
     * Gets the stop scrolling event.
     * 
     * @return the stop scrolling event
     */
    public native String getStopScrollingEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstopScrollingEvent();
    }-*/;

    /**
     * Sets the stop scrolling event.
     * 
     * @param value
     *            the new stop scrolling event
     */
    public native void setStopScrollingEvent(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstopScrollingEvent(value);
    }-*/;

    /**
     * Sets the close tab policy for.
     * 
     * @param index
     *            the index
     * @param value
     *            the value
     */
    public native void setCloseTabPolicyFor(int index, String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setCloseTabPolicyFor(index, value);
    }-*/;

}
