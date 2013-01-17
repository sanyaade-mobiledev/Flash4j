/************************************************************************
  VGroup.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.components;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class VGroup.
 */
public class VGroup extends Group {

    /**
     * Instantiates a new v group.
     */
    VGroup(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the v group
     */
    public VGroup() {
        jsObj = Bridge.createObject("spark.components.VGroup");
    }

    /**
     * Gets the first index view.
     * 
     * @return the first index view
     */
    public native int getFirstIndexView()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getFirstIndexView();
    }-*/;

    /**
     * Gets the gap.
     * 
     * @return the gap
     */
    public native int getGap()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgap();
    }-*/;

    /**
     * Sets the gap.
     * 
     * @param value the new gap
     */
    public native void setGap(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgap(value);
    }-*/;

    /**
     * Gets the horizontal align.
     * 
     * @return the horizontal align
     */
    public native String getHorizontalAlign()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalAlign();
    }-*/;

    /**
     * Sets the horizontal align.
     * 
     * @param value the new horizontal align
     */
    public native void setHorizontalAlign(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalAlign(value);
    }-*/;

    /**
     * Gets the last index view.
     * 
     * @return the last index view
     */
    public native int getLastIndexView()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlastIndexView();
    }-*/;

    /**
     * Gets the padding bottom.
     * 
     * @return the padding bottom
     */
    public native double getPaddingBottom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpaddingBottom();
    }-*/;

    /**
     * Sets the padding bottom.
     * 
     * @param value the new padding bottom
     */
    public native void setPaddingBottom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpaddingBottom(value);
    }-*/;

    /**
     * Gets the padding left.
     * 
     * @return the padding left
     */
    public native double getPaddingLeft()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpaddingLeft();
    }-*/;

    /**
     * Sets the padding left.
     * 
     * @param value the new padding left
     */
    public native void setPaddingLeft(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpaddingLeft(value);
    }-*/;

    /**
     * Gets the padding top.
     * 
     * @return the padding top
     */
    public native double getPaddingTop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpaddingTop();
    }-*/;

    /**
     * Sets the padding top.
     * 
     * @param value the new padding top
     */
    public native void setPaddingTop(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpaddingTop(value);
    }-*/;

    /**
     * Gets the padding right.
     * 
     * @return the padding right
     */
    public native double getPaddingRight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpaddingRight();
    }-*/;

    /**
     * Sets the padding right.
     * 
     * @param value the new padding right
     */
    public native void setPaddingRight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpaddingRight(value);
    }-*/;

    /**
     * Gets the requested row count.
     * 
     * @return the requested row count
     */
    public native int getRequestedRowCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrequestedRowCount();
    }-*/;

    /**
     * Sets the requested row count.
     * 
     * @param value the new requested row count
     */
    public native void setRequestedRowCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrequestedRowCount(value);
    }-*/;

    /**
     * Gets the row count.
     * 
     * @return the row count
     */
    public native int getRowCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrowCount();
    }-*/;

    /**
     * Gets the row height.
     * 
     * @return the row height
     */
    public native double getRowHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrowHeight();
    }-*/;

    /**
     * Sets the row height.
     * 
     * @param value the new row height
     */
    public native void setRowHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrowHeight(value);
    }-*/;

    /**
     * Gets the variable row height.
     * 
     * @return the variable row height
     */
    public native double getVariableRowHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvariableRowHeight();
    }-*/;

    /**
     * Sets the variable row height.
     * 
     * @param value the new variable row height
     */
    public native void setVariableRowHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvariableRowHeight(value);
    }-*/;

    /**
     * Gets the vertical align.
     * 
     * @return the vertical align
     */
    public native String getVerticalAlign()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalAlign();
    }-*/;

    /**
     * Sets the vertical align.
     * 
     * @param value the new vertical align
     */
    public native void setVerticalAlign(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalAlign(value);
    }-*/;

}
