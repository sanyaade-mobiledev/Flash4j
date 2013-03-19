/************************************************************************
 * IFrame.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.iframe;

import java.util.Random;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.framework.ClassUtil;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.ui.mx.Container;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class IFrame.
 */
public class IFrame extends Container {

    private String iFrameId;
    private static int count = 0;
    /** The Constant SCROLL_POLICY_AUTO. */
    public static String SCROLL_POLICY_AUTO = "auto";

    /** The Constant SCROLL_POLICY_OFF. */
    public static String SCROLL_POLICY_OFF = "no";

    /** The Constant SCROLL_POLICY_ON. */
    public static String SCROLL_POLICY_ON = "yes";

    /**
     * Instantiates a new i frame.
     */
    protected IFrame(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the i frame
     */
    public IFrame() {
        jsObj = Bridge.createObject("com.google.code.flexiframe.IFrame");
        iFrameId = "Flex4jIFrame" + generateId();
        setId(iFrameId);
        iFrameId += count++;
        strech();
    }

    public String getIframeId() {
        return iFrameId;
    }

    public void setUseLoadIndicator(boolean useLoadIndicator) {
        if (useLoadIndicator) {
            setLoadIndicatorClass(new IFrameLoadIndicator());
        }
    }

    /**
     * New instance.
     * 
     * @param source
     *            the source
     * @return the i frame
     */
    public IFrame(String source) {
        this();
        setSource(source);
    }

    /**
     * Gets the application id.
     * 
     * @return the application id
     */
    public native String getApplicationId()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getapplicationId();
    }-*/;

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public native String getContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontent();
    }-*/;

    /**
     * Sets the content.
     * 
     * @param value
     *            the new content
     */
    public native void setContent(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcontent(value);
    }-*/;

    /**
     * Checks if is debug.
     * 
     * @return true, if is debug
     */
    public native boolean isDebug()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdebug();
    }-*/;

    /**
     * Sets the debug.
     * 
     * @param value
     *            the new debug
     */
    public native void setDebug(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdebug(value);
    }-*/;

    /**
     * Gets the scroll policy.
     * 
     * @return the scroll policy
     */
    public native String getScrollPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscrollPolicy();
    }-*/;

    /**
     * Sets the scroll policy.
     * 
     * @param value
     *            the new scroll policy
     */
    public native void setScrollPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscrollPolicy(value);
    }-*/;

    /**
     * Gets the source.
     * 
     * @return the source
     */
    public native String getSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsource();
    }-*/;

    /**
     * Sets the source.
     * 
     * @param value
     *            the new source
     */
    public native void setSource(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsource(value);
    }-*/;

    /**
     * Gets the visibility notification function.
     * 
     * @return the visibility notification function
     */
    public native String getVisibilityNotificationFunction()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvisibilityNotificationFunction();
    }-*/;

    /**
     * Sets the visibility notification function.
     * 
     * @param value
     *            the new visibility notification function
     */
    public native void setVisibilityNotificationFunction(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvisibilityNotificationFunction(value);
    }-*/;

    /**
     * Sets the i frame visible.
     * 
     * @param value
     *            the new i frame visible
     */
    public native void setIFrameVisible(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setIFrameVisible(value);
    }-*/;

    /**
     * Bring i frame to front.
     */
    public native void bringIFrameToFront()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.bringIFrameToFront();
    }-*/;

    /**
     * History back.
     */
    public native void historyBack()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.historyBack();
    }-*/;

    /**
     * History forward.
     */
    public native void historyForward()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.historyForward();
    }-*/;

    /**
     * Lookup index.
     * 
     * @param target
     *            the target
     * @return the double
     */
    public native double lookupIndex(Container target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.lookupIndex(target);
    }-*/;

    /**
     * Lookup setting.
     * 
     * @param target
     *            the target
     * @return the double
     */
    public native double lookupSetting(Container target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.lookupSetting(target);
    }-*/;

    /**
     * Prints the i frame.
     */
    public native void printIFrame()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.printIFrame();
    }-*/;

    /**
     * Removes the i frame.
     */
    public native void removeIFrame()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeIFrame();
    }-*/;

    /**
     * Sets the i frame actual size.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     */
    public native void setIFrameActualSize(double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setActualSize(width, height);
    }-*/;

    /**
     * Sets the load indicator class.
     * 
     * @param component
     *            the new load indicator class
     */
    public void setLoadIndicatorClass(UIComponent component) {
        this._setLoadIndicatorClass(ClassUtil.getInstance().getClass(component.getJsObj()));
    }

    /**
     * _set load indicator class.
     * 
     * @param value
     *            the value
     */
    private native void _setLoadIndicatorClass(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setloadIndicatorClass(value);
    }-*/;

    /**
     * Generate and randon id
     * 
     * @return the string
     */
    private static String generateId() {
        Random random = new Random();
        return Long.toString(Math.abs(random.nextLong()), 36);
    }

}
