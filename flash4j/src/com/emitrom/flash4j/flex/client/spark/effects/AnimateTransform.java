/************************************************************************
  AnimateTransform.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class AnimateTransform.
 */
public class AnimateTransform extends Animate {

    /**
     * Instantiates a new animate transform.
     */
    protected AnimateTransform(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the animate transform
     */
    public AnimateTransform() {
        jsObj = Bridge.createObject("spark.effects.AnimateTransform");
    }

    /**
     * New instance.
     * 
     * @param target the target
     * @return the animate transform
     */
    public AnimateTransform(ProxyObject target) {
        this();
        setTarget(target.getJsObj());
    }

    /**
     * Apply changes post layout.
     * 
     * @return true, if successful
     */
    public native boolean applyChangesPostLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getapplyChangesPostLayout();
    }-*/;

    /**
     * Sets the apply changes post layout.
     * 
     * @param value the new apply changes post layout
     */
    public native void setApplyChangesPostLayout(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setapplyChangesPostLayout(value);
    }-*/;

    /**
     * Auto center transform.
     * 
     * @return true, if successful
     */
    public native boolean autoCenterTransform()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoCenterTransform();
    }-*/;

    /**
     * Sets the auto center transform.
     * 
     * @param value the new auto center transform
     */
    public native void setAutoCenterTransform(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoCenterTransform(value);
    }-*/;

    /**
     * Gets the transform x.
     * 
     * @return the transform x
     */
    public native double getTransformX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettransformX();
    }-*/;

    /**
     * Sets the transform x.
     * 
     * @param value the new transform x
     */
    public native void setTransformX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settransformX(value);
    }-*/;

    /**
     * Gets the transform y.
     * 
     * @return the transform y
     */
    public native double getTransformY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettransformY();
    }-*/;

    /**
     * Sets the transform y.
     * 
     * @param value the new transform y
     */
    public native void setTransformY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settransformY(value);
    }-*/;

    /**
     * Gets the transform z.
     * 
     * @return the transform z
     */
    public native double getTransformZ()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettransformZ();
    }-*/;

    /**
     * Sets the transform z.
     * 
     * @param value the new transform z
     */
    public native void setTransformZ(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settransformZ(value);
    }-*/;

}
