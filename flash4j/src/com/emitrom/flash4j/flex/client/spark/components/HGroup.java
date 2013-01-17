/************************************************************************
  HGroup.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class HGroup.
 */
public class HGroup extends Group {

    /**
     * Instantiates a new h group.
     */
    protected HGroup(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the h group
     */
    public HGroup() {
        jsObj = Bridge.createObject("spark.components.HGroup");
    }

    /**
     * Gets the column count.
     * 
     * @return the column count
     */
    public native int getColumnCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolumnCount();
    }-*/;

    /**
     * Gets the column width.
     * 
     * @return the column width
     */
    public native double getColumnWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolumnWidth();
    }-*/;

    /**
     * Sets the column width.
     * 
     * @param value the new column width
     */
    public native void setColumnWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolumnWidth(value);
    }-*/;

    /**
     * Gets the first index view.
     * 
     * @return the first index view
     */
    public native int getFirstIndexView()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfirstIndexView();
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
     * Sets the horitzontal align.
     * 
     * @param value the new horitzontal align
     */
    public native void setHoritzontalAlign(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethoritzontalAlign(value);
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
     * Gets the requested column count.
     * 
     * @return the requested column count
     */
    public native int getRequestedColumnCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getRequestedColumnCount();
    }-*/;

    /**
     * Sets the requested column count.
     * 
     * @param value the new requested column count
     */
    public native void setRequestedColumnCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrequestedColumnCount(value);
    }-*/;

    /**
     * Gets the variable column width.
     * 
     * @return the variable column width
     */
    public native int getVariableColumnWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvariableColumnWidth();
    }-*/;

    /**
     * Sets the variable column width.
     * 
     * @param value the new variable column width
     */
    public native void setVariableColumnWidth(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvariableColumnWidth(value);
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
