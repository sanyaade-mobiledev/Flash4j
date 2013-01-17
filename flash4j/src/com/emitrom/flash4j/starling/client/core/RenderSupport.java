/************************************************************************
  RenderSupport.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.core;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Matrix3D;
import com.emitrom.flash4j.core.client.geom.Vector3D;
import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;

/**
 * A class that contains helper methods simplifying Stage3D rendering. A
 * RenderSupport instance is passed to any "render" method of display objects.
 * It allows manipulation of the current transformation matrix (similar to the
 * matrix manipulation methods of OpenGL 1.x) and other helper methods.
 * 
 */
public class RenderSupport extends ProxyObject {

    /**
     * Creates a new RenderSupport object with an empty matrix stack.
     * 
     * @return
     */
    public RenderSupport() {
        jsObj = Bridge.createObject("starling.core.RenderSupport");
    }

    /**
     * [read-only] Calculates the product of modelview and projection matrix.
     * 
     * @return
     */
    public native Matrix3D getMvpMatrix()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmvpMatrix();
		return @com.emitrom.flash4j.core.client.geom.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Clears the render context with a certain color and alpha value.
     */
    public native void clear()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clear();
    }-*/;

    public native void clear(int rgb)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clear(rgb);
    }-*/;

    public native void clear(int rgb, double alpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.clear(rgb, alpha);
    }-*/;

    /**
     * Changes the modelview matrix to the identity matrix.
     */
    public native void loadIdentity()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.loadIdentity();
    }-*/;

    /**
     * Restores the modelview matrix that was last pushed to the stack.
     */
    public native void popMatrix()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.popMatrix();
    }-*/;

    /**
     * Pushes the current modelview matrix to a stack from which it can be
     * restored later.
     */
    public native void pushMatrix()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.pushMatrix();
    }-*/;

    /**
     * Empties the matrix stack, resets the modelview matrox to the identity
     * matrix.
     */
    public native void resetMatrix()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.resetMatrix();
    }-*/;

    /**
     * Prepends a rotation (angle in radians) to the modelview matrix.
     * 
     * @param angle
     */
    public native void rotateMatrix(double angle)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.rotateMatrix(angle);
    }-*/;

    /**
     * Prepends a rotation (angle in radians) to the modelview matrix.
     * 
     * @param angle
     */
    public native void rotateMatrix(double angle, Vector3D vector)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.rotateMatrix(
						angle,
						vector.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Prepends an incremental scale change to the modelview matrix.
     * 
     * @param sx
     * @param sy
     */
    public native void scaleMatrix(double sx, double sy)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.scaleMatrix(sx, sy);
    }-*/;

    /**
     * Prepends an incremental scale change to the modelview matrix.
     * 
     * @param sx
     * @param sy
     * @param sz
     */
    public native void scaleMatrix(double sx, double sy, double sz)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.scaleMatrix(sx, sy, sz);
    }-*/;

    /**
     * Sets up the default blending factors, depending on the premultiplied
     * alpha status.
     * 
     * @param premultipliedAlpha
     */
    public native void setDefaultBlendFactors(boolean premultipliedAlpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setDefaultBlendFactors(premultipliedAlpha);
    }-*/;

    /**
     * Sets up the projection matrix for ortographic 2D rendering.
     * 
     * @param width
     * @param height
     */
    public native void setOrthographicProjection(double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setOrthographicProjection(width, height);
    }-*/;

    /**
     * Sets up the projection matrix for ortographic 2D rendering.
     * 
     * @param width
     * @param height
     */
    public native void setOrthographicProjection(double width, double height, double near)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setOrthographicProjection(width, height, near);
    }-*/;

    /**
     * Sets up the projection matrix for ortographic 2D rendering.
     * 
     * @param width
     * @param height
     */
    public native void setOrthographicProjection(double width, double height, double near, double far)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setOrthographicProjection(width, height, near, far);
    }-*/;

    /**
     * Prepends translation, scale and rotation of an object to the modelview
     * matrix.
     * 
     * @param matrix
     * @param object
     */
    public native void transformMatrix(DisplayObject object)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.transformMatrix(object.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Prepends a translation to the modelview matrix.
     * 
     * @param dx
     * @param dy
     */
    public native void translateMatrix(double dx, double dy)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.translateMatrix(dx, dy);
    }-*/;

    /**
     * Prepends a translation to the modelview matrix.
     * 
     * @param dx
     * @param dy
     */
    public native void translateMatrix(double dx, double dy, double dz)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.translateMatrix(dx, dy, dz);
    }-*/;

    /**
     * Prepends translation, scale and rotation of an object to a custom matrix.
     * 
     * @param matrix
     * @param object
     */
    public static void transformMatrixForObject(Matrix3D matrix, DisplayObject object) {
        StarlingStaticBridge.INSTANCE.transformMatrixForObject(matrix, object);
    }

}
