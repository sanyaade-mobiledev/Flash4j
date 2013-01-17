/************************************************************************
  ViewStackTweenEffect.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.efflex.mx.viewstackeffects;

import com.emitrom.flash4j.flex.client.mx.effects.TweenEffect;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ViewStackTweenEffect.
 */
public class ViewStackTweenEffect extends TweenEffect {

    /**
     * Instantiates a new view stack tween effect.
     */
    protected ViewStackTweenEffect() {

    }

    protected ViewStackTweenEffect(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Hide target.
     * 
     * @return true, if successful
     */
    public native boolean hideTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethideTarget();
    }-*/;

    /**
     * Sets the hide target.
     * 
     * @param value
     *            the new hide target
     */
    public native void setHideTarget(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethideTarget(value);
    }-*/;

    /**
     * Checks if is transparent.
     * 
     * @return true, if is transparent
     */
    public native boolean isTransparent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettransparent();
    }-*/;

    /**
     * Sets the transparent.
     * 
     * @param value
     *            the new transparent
     */
    public native void setTransparent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settransparent(value);
    }-*/;

    /**
     * Checks if is pop up.
     * 
     * @return true, if is pop up
     */
    public native boolean isPopUp()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpopUp();
    }-*/;

    /**
     * Sets the pop up.
     * 
     * @param value
     *            the new pop up
     */
    public native void setPopUp(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpopUp(value);
    }-*/;

    /**
     * Checks if is modal.
     * 
     * @return true, if is modal
     */
    public native boolean isModal()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodal();
    }-*/;

    /**
     * Sets the modal.
     * 
     * @param value
     *            the new modal
     */
    public native void setModal(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodal(value);
    }-*/;

    /**
     * Gets the modal transparency color.
     * 
     * @return the modal transparency color
     */
    public native double getModalTransparencyColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodalTransparencyColor();
    }-*/;

    /**
     * Sets the modal transparency color.
     * 
     * @param value
     *            the new modal transparency color
     */
    public native void setModalTransparencyColor(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodalTransparencyColor(value);
    }-*/;

    /**
     * Gets the modal transparency.
     * 
     * @return the modal transparency
     */
    public native double getModalTransparency()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodalTransparency();
    }-*/;

    /**
     * Sets the modal transparency.
     * 
     * @param value
     *            the new modal transparency
     */
    public native void setModalTransparency(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodalTransparency(value);
    }-*/;

    /**
     * Gets the modal transparency blur.
     * 
     * @return the modal transparency blur
     */
    public native double getModalTransparencyBlur()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodalTransparencyBlur();
    }-*/;

    /**
     * Sets the modal transparency blur.
     * 
     * @param value
     *            the new modal transparency blur
     */
    public native void setModalTransparencyBlur(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodalTransparencyBlur(value);
    }-*/;

    /**
     * Gets the modal transparency durartion.
     * 
     * @return the modal transparency durartion
     */
    public native double getModalTransparencyDurartion()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodalTransparencyDurartion();
    }-*/;

    /**
     * Sets the modal transparency durartion.
     * 
     * @param value
     *            the new modal transparency durartion
     */
    public native void setModalTransparencyDurartion(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodalTransparencyDurartion(value);
    }-*/;

}
