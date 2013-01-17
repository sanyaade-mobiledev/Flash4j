/************************************************************************
  BitmapFill.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.graphics;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Matrix;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class BitmapFill.
 */
public class BitmapFill extends EventDispatcher {

    /**
     * Instantiates a new bitmap fill.
     */
    protected BitmapFill(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the bitmap fill
     */
    public BitmapFill() {
        jsObj = Bridge.createObject("mx.graphics.BitmapFill");
    }

    /**
     * Gets the alpha.
     * 
     * @return the alpha
     */
    public native double getAlpha()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalpha();
    }-*/;

    /**
     * Sets the alpha.
     * 
     * @param value the new alpha
     */
    public native void setAlpha(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalpha(value);
    }-*/;

    /**
     * Gets the fill mode.
     * 
     * @return the fill mode
     */
    public BitmapFillMode getFillMode() {
        return BitmapFillMode.fromValue(_getFillMode());
    }

    /**
     * _get fill mode.
     * 
     * @return the string
     */
    private native String _getFillMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfillMode();
    }-*/;

    /**
     * Sets the fill mode.
     * 
     * @param mode the new fill mode
     */
    public void setFillMode(BitmapFillMode mode) {
        _setFillMode(mode.value);
    }

    /**
     * _set fill mode.
     * 
     * @param value the value
     */
    private native void _setFillMode(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfillMode(value);
    }-*/;

    /**
     * Gets the matrix.
     * 
     * @return the matrix
     */
    public native Matrix getMatrix()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmatrix();
		return @com.emitrom.flash4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the matrix.
     * 
     * @param value the new matrix
     */
    public native void setMatrix(Matrix value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setmatrix(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the rotation.
     * 
     * @return the rotation
     */
    public native double getRotation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrotation();
    }-*/;

    /**
     * Sets the rotation.
     * 
     * @param value the new rotation
     */
    public native void setRotation(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrotation(value);
    }-*/;

    /**
     * Gets the scale x.
     * 
     * @return the scale x
     */
    public native double getScaleX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleX();
    }-*/;

    /**
     * Sets the scale x.
     * 
     * @param value the new scale x
     */
    public native void setScaleX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleX(value);
    }-*/;

    /**
     * Gets the scale y.
     * 
     * @return the scale y
     */
    public native double getScaleY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleY();
    }-*/;

    /**
     * Sets the scale y.
     * 
     * @param value the new scale y
     */
    public native void setScaleY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleY(value);
    }-*/;

    /**
     * Checks if is smooth.
     * 
     * @return true, if is smooth
     */
    public native boolean isSmooth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsmooth();
    }-*/;

    /**
     * Sets the smooth.
     * 
     * @param value the new smooth
     */
    public native void setSmooth(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsmooth(value);
    }-*/;

    /**
     * Gets the source.
     * 
     * @param <T> the generic type
     * @return the source
     */
    public native <T> T getSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsource();
    }-*/;

    /**
     * Sets the source.
     * 
     * @param value the new source
     */
    public native void setSource(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsource(value);
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
     * Gets the x.
     * 
     * @return the x
     */
    public native double getX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getx();
    }-*/;

    /**
     * Sets the x.
     * 
     * @param value the new x
     */
    public native void setX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setx(value);
    }-*/;

    /**
     * Gets the y.
     * 
     * @return the y
     */
    public native double getY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gety();
    }-*/;

    /**
     * Sets the y.
     * 
     * @param value the new y
     */
    public native void setY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sety(value);
    }-*/;

}
