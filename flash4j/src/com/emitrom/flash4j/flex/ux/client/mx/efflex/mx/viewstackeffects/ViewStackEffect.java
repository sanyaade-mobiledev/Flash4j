/************************************************************************
 * ViewStackEffect.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.efflex.mx.viewstackeffects;

import com.emitrom.flash4j.flex.client.mx.effects.Effect;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ViewStackEffect.
 */
public class ViewStackEffect extends Effect {

    /**
     * Instantiates a new view stack effect.
     */
    protected ViewStackEffect() {

    }

    /**
     * Instantiates a new view stack effect.
     */
    protected ViewStackEffect(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Hide target.
     * 
     * @return true, if successful
     */
    public native boolean hideTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getHideTarget();
    }-*/;

    /**
     * Sets the hide target.
     * 
     * @param value
     *            the new hide target
     */
    public final native void setHideTarget(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethideTarget(value);
    }-*/;

    /**
     * Checks if is transparent.
     * 
     * @return true, if is transparent
     */
    public final native boolean isTransparent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettransparent();
    }-*/;

    /**
     * Sets the transparent.
     * 
     * @param value
     *            the new transparent
     */
    public final native void setTransparent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settransparent(value);
    }-*/;

    /**
     * Checks if is pop up.
     * 
     * @return true, if is pop up
     */
    public final native boolean isPopUp()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpopUp();
    }-*/;

    /**
     * Sets the pop up.
     * 
     * @param value
     *            the new pop up
     */
    public final native void setPopUp(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpopUp(value);
    }-*/;

    /**
     * Checks if is modal.
     * 
     * @return true, if is modal
     */
    public final native boolean isModal()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodal();
    }-*/;

    /**
     * Sets the modal.
     * 
     * @param value
     *            the new modal
     */
    public final native void setModal(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodal(value);
    }-*/;

    /**
     * Gets the modal transparency color.
     * 
     * @return the modal transparency color
     */
    public final native double getModalTransparencyColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodalTransparencyColor();
    }-*/;

    /**
     * Sets the modal transparency color.
     * 
     * @param value
     *            the new modal transparency color
     */
    public final native void setModalTransparencyColor(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodalTransparencyColor(value);
    }-*/;

    /**
     * Gets the modal transparency.
     * 
     * @return the modal transparency
     */
    public final native double getModalTransparency()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodalTransparency();
    }-*/;

    /**
     * Sets the modal transparency.
     * 
     * @param value
     *            the new modal transparency
     */
    public final native void setModalTransparency(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodalTransparency(value);
    }-*/;

    /**
     * Gets the modal transparency blur.
     * 
     * @return the modal transparency blur
     */
    public final native double getModalTransparencyBlur()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmodalTransparencyBlur();
    }-*/;

    /**
     * Sets the modal transparency blur.
     * 
     * @param value
     *            the new modal transparency blur
     */
    public final native void setModalTransparencyBlur(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodalTransparencyBlur(value);
    }-*/;

    /**
     * Gets the modal transparency durartion.
     * 
     * @return the modal transparency durartion
     */
    public final native double getModalTransparencyDurartion()/*-{
		return peer.getmodalTransparencyDurartion();
    }-*/;

    /**
     * Sets the modal transparency durartion.
     * 
     * @param value
     *            the new modal transparency durartion
     */
    public final native void setModalTransparencyDurartion(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmodalTransparencyDurartion(value);
    }-*/;

    /**
     * Update bitmaps.
     * 
     * @return true, if successful
     */
    public final native boolean updateBitmaps()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getupdateBitmaps();
    }-*/;

    /**
     * Sets the update bitmaps.
     * 
     * @param value
     *            the new update bitmaps
     */
    public final native void setUpdateBitmaps(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setupdateBitmaps(value);
    }-*/;

}
