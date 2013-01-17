/************************************************************************
  GradientBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.List;

import com.emitrom.flash4j.core.client.display.InterpolationMethod;
import com.emitrom.flash4j.core.client.display.SpreadMethod;
import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Matrix;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GradientBase.
 */
public class GradientBase extends EventDispatcher {

    public static final double GRADIENT_DIMENSION = 1638.4;

    /**
     * Instantiates a new gradient base.
     */
    protected GradientBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instace.
     * 
     * @return the gradient base
     */
    public GradientBase() {
        jsObj = Bridge.createObject("mx.graphics.GradientBase");
    }

    /**
     * Sets the entries.
     * 
     * @param value the new entries
     */
    public void setEntries(List<GradientEntry> value) {
        this.setEntries(DataConverter.fromList(value));
    }

    /**
     * Sets the entries.
     * 
     * @param value the new entries
     */
    private void setEntries(ArrayCollection value) {
        _setEntries(value.toArray().getJsObj());
    }

    /**
     * Sets the entries.
     * 
     * @param value the new entries
     */
    private native void _setEntries(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		this.setentries(value);
    }-*/;

    /**
     * Gets the interpolation method.
     * 
     * @return the interpolation method
     */
    public InterpolationMethod getInterpolationMethod() {
        return InterpolationMethod.fromValue(_getInterpolationMethod());
    }

    /**
     * _get interpolation method.
     * 
     * @return the string
     */
    private native String _getInterpolationMethod()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinterpolationMethod();
    }-*/;

    /**
     * Sets the interpolation method.
     * 
     * @param method the new interpolation method
     */
    public void setInterpolationMethod(InterpolationMethod method) {
        _setInterpolationMethod(method.value);
    }

    /**
     * _set interpolation method.
     * 
     * @param value the value
     */
    private native void _setInterpolationMethod(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinterpolationMethod(value);
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
     * Gets the spread method.
     * 
     * @return the spread method
     */
    public SpreadMethod getSpreadMethod() {
        return SpreadMethod.fromValue(_getSpreadMethod());
    }

    /**
     * _get spread method.
     * 
     * @return the string
     */
    private native String _getSpreadMethod()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getspreadMethod();
    }-*/;

    /**
     * Sets the spread method.
     * 
     * @param method the new spread method
     */
    public void setSpreadMethod(SpreadMethod method) {
        _setInterpolationMethod(method.value);
    }

    /**
     * _set spread method.
     * 
     * @param value the value
     */
    public native void _setSpreadMethod(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setspreadMethod(value);
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
