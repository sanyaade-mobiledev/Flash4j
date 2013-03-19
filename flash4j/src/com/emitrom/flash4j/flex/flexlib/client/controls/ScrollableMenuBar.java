/************************************************************************
  ScrollableMenuBar.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.ScrollPolicy;
import com.emitrom.flash4j.flex.client.ui.mx.MenuBar;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ScrollableMenuBar.
 */
public class ScrollableMenuBar extends MenuBar {

    /**
     * Instantiates a new scrollable menu bar.
     */
    protected ScrollableMenuBar(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the scrollable menu bar
     */
    public ScrollableMenuBar() {
        jsObj = Bridge.createObject("flexlib.controls.ScrollableMenuBar");
    }

    /**
     * Gets the arrow scroll policy.
     * 
     * @return the arrow scroll policy
     */
    public ScrollPolicy getArrowScrollPolicy() {
        return ScrollPolicy.fromValue(_getArrowScrollPolicy());
    }

    /**
     * _get arrow scroll policy.
     * 
     * @return the string
     */
    private native String _getArrowScrollPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getarrowScrollPolicy();
    }-*/;

    /**
     * Sets the arrow scroll policy.
     * 
     * @param policy
     *            the new arrow scroll policy
     */
    public void setArrowScrollPolicy(ScrollPolicy policy) {
        _setArrowScrollPolicy(policy.value);
    }

    /**
     * _set arrow scroll policy.
     * 
     * @param value
     *            the value
     */
    private native void _setArrowScrollPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setarrowScrollPolicy(value);
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

}
