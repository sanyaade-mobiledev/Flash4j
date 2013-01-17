/************************************************************************
  GroupBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.core.IVisualElement;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.spark.core.MaskType;
import com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GroupBase.
 */
public class GroupBase extends UIComponent {

    /**
     * Instantiates a new group base.
     */
    GroupBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the group base
     */
    public GroupBase() {
        jsObj = Bridge.createObject("spark.components.GroupBase");
    }

    /**
     * Auto layout.
     * 
     * @return true, if successful
     */
    public native boolean autoLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoLayout();
    }-*/;

    /**
     * Sets the auto layout.
     * 
     * @param value the new auto layout
     */
    public native void setAutoLayout(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoLayout(value);
    }-*/;

    /**
     * Clip and enable scrolling.
     * 
     * @return true, if successful
     */
    public native boolean clipAndEnableScrolling()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclipAndEnableScrolling();
    }-*/;

    /**
     * Sets the clip and enable scrolling.
     * 
     * @param value the new clip and enable scrolling
     */
    public native void setClipAndEnableScrolling(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setclipAndEnableScrolling(value);
    }-*/;

    /**
     * Gets the content height.
     * 
     * @return the content height
     */
    public native double getContentHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontentHeight();
    }-*/;

    /**
     * Gets the content width.
     * 
     * @return the content width
     */
    public native double getContentWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontentWidth();
    }-*/;

    /**
     * Gets the horizonzal scroll position.
     * 
     * @return the horizonzal scroll position
     */
    public native double getHorizonzalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizonzalScrollPosition();
    }-*/;

    /**
     * Sets the horizontal scroll position.
     * 
     * @param value the new horizontal scroll position
     */
    public native void setHorizontalScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalScrollPosition(value);
    }-*/;

    /**
     * Gets the layout.
     * 
     * @return the layout
     */
    public native LayoutBase getLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getlayout();
		return @com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the layout.
     * 
     * @param value the new layout
     */
    public native void setLayout(LayoutBase value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlayout(value);
    }-*/;

    /**
     * Luminosity clip.
     * 
     * @return true, if successful
     */
    public native boolean luminosityClip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getluminosityClip();
    }-*/;

    /**
     * Sets the luminosity clip.
     * 
     * @param value the new luminosity clip
     */
    public native void setLuminosityClip(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setluminosityClip(value);
    }-*/;

    /**
     * Luminosity invert.
     * 
     * @return true, if successful
     */
    public native boolean luminosityInvert()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getluminosityInvert();
    }-*/;

    /**
     * Sets the luminosity invert.
     * 
     * @param value the new luminosity invert
     */
    public native void setLuminosityInvert(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setluminosityInvert(value);
    }-*/;

    /**
     * Gets the mask type.
     * 
     * @return the mask type
     */
    public MaskType getMaskType() {
        return MaskType.fromValue(_getMaskType());
    }

    /**
     * _get mask type.
     * 
     * @return the string
     */
    private native String _getMaskType()/*-{
		return peer.getmaskType();
    }-*/;

    /**
     * Sets the mask type.
     * 
     * @param type the new mask type
     */
    public void setMaskType(MaskType type) {
        _setMaskType(type.value);
    }

    /**
     * _set mask type.
     * 
     * @param value the value
     */
    private native void _setMaskType(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaskType(value);
    }-*/;

    /**
     * Mouse enabled where transparent.
     * 
     * @return true, if successful
     */
    public native boolean mouseEnabledWhereTransparent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmouseEnabledWhereTransparent();
    }-*/;

    /**
     * Sets the mouse enabled where transparent.
     * 
     * @param value the new mouse enabled where transparent
     */
    public native void setMouseEnabledWhereTransparent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmouseEnabledWhereTransparent(value);
    }-*/;

    /**
     * Gets the num elements.
     * 
     * @return the num elements
     */
    public native int getNumElements()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumElements();
    }-*/;

    /**
     * Gets the resize mode.
     * 
     * @return the resize mode
     */
    public ResizeMode getResizeMode() {
        return ResizeMode.fromValue(_getResizeMode());
    }

    /**
     * _get resize mode.
     * 
     * @return the string
     */
    private native String _getResizeMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getresizeMode();
    }-*/;

    /**
     * Sets the resize mode.
     * 
     * @param mode the new resize mode
     */
    public void setResizeMode(ResizeMode mode) {
        _setResizeMode(mode.value);
    }

    /**
     * _set resize mode.
     * 
     * @param value the value
     */
    private native void _setResizeMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setresizeMode(value);
    }-*/;

    /**
     * Gets the vertical scroll position.
     * 
     * @return the vertical scroll position
     */
    public native double getVerticalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalScrollPosition();
    }-*/;

    /**
     * Sets the vertical scroll position.
     * 
     * @param value the new vertical scroll position
     */
    public native void setVerticalScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalScrollPosition(value);
    }-*/;

    /**
     * Gets the element at.
     * 
     * @param index the index
     * @return the element at
     */
    public native UIComponent getElementAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getElementAt(index);
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the element index.
     * 
     * @param element the element
     * @return the element index
     */

    public native int getElementIndex(IVisualElement element)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getElementIndex(element.@com.emitrom.flash4j.flex.client.mx.core.IVisualElement::asIVisualElement()());
    }-*/;

    /**
     * Sets the content size.
     * 
     * @param width the width
     * @param height the height
     */
    public native void setContentSize(double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setContentSize(width, height);
    }-*/;

}
