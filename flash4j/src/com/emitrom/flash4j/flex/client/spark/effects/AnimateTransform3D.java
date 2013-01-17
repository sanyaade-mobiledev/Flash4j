/************************************************************************
  AnimateTransform3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AnimateTransform3D.
 */
public class AnimateTransform3D extends AnimateTransform {

    /**
     * Instantiates a new animate transform3 d.
     */
    protected AnimateTransform3D(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the animate transform3 d
     */
    public AnimateTransform3D() {
        jsObj = Bridge.createObject("spark.effects.AnimateTransform3D");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the animate transform3 d
     */
    public AnimateTransform3D(ProxyObject target) {
        super(target);
    }

    /**
     * Apply local projection.
     * 
     * @return true, if successful
     */
    public native boolean applyLocalProjection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getApplyLocalProjection();
    }-*/;

    /**
     * Sets the apply local projection.
     * 
     * @param value the new apply local projection
     */
    public native void setApplyLocalProjection(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setApplyLocalProjection(value);
    }-*/;

    /**
     * Auto center projection.
     * 
     * @return true, if successful
     */
    public native boolean autoCenterProjection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getAutoCenterProjection();
    }-*/;

    /**
     * Sets the auto center projection.
     * 
     * @param value the new auto center projection
     */
    public native void setAutoCenterProjection(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoCenterProjection(value);
    }-*/;

    /**
     * Gets the field of view.
     * 
     * @return the field of view
     */
    public native double getFieldOfView()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfieldOfView();
    }-*/;

    /**
     * Sets the field of view.
     * 
     * @param value the new field of view
     */
    public native void setFieldOfView(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfieldOfView(value);
    }-*/;

    /**
     * Gets the focal length.
     * 
     * @return the focal length
     */
    public native double getFocalLength()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfocalLength();
    }-*/;

    /**
     * Sets the focal length.
     * 
     * @param value the new focal length
     */
    public native void setFocalLength(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfocalLength(value);
    }-*/;

    /**
     * Gets the projection x.
     * 
     * @return the projection x
     */
    public native double getProjectionX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getprojectionX();
    }-*/;

    /**
     * Sets the projection x.
     * 
     * @param value the new projection x
     */
    public native void setProjectionX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprojectionX(value);
    }-*/;

    /**
     * Gets the projection y.
     * 
     * @return the projection y
     */
    public native double getProjectionY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getPprojectionY();
    }-*/;

    /**
     * Sets the projection y.
     * 
     * @param value the new projection y
     */
    public native void setProjectionY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprojectionY(value);
    }-*/;

    /**
     * Removes the local projection when complete.
     * 
     * @return true, if successful
     */
    public native boolean removeLocalProjectionWhenComplete()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getremoveLocalProjectionWhenComplete();
    }-*/;

    /**
     * Sets the removes the local projection when complete.
     * 
     * @param value the new removes the local projection when complete
     */
    public native void setRemoveLocalProjectionWhenComplete(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setremoveLocalProjectionWhenComplete(value);
    }-*/;

}
