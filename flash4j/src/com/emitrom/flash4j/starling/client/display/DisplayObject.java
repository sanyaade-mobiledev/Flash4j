/************************************************************************
  DisplayObject.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.display;

import com.emitrom.flash4j.core.client.geom.Matrix;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.starling.client.core.RenderSupport;
import com.emitrom.flash4j.starling.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * The DisplayObject class is the base class for all objects that are rendered
 * on the screen.
 * <p>
 * <b>The Display Tree</b>
 * </p>
 * <p>
 * In Starling, all displayable objects are organized in a display tree. Only
 * objects that are part of the display tree will be displayed (rendered).
 * </p>
 * <p>
 * The display tree consists of leaf nodes (Image, Quad) that will be rendered
 * directly to the screen, and of container nodes (subclasses of
 * "DisplayObjectContainer", like "Sprite"). A container is simply a display
 * object that has child nodes - which can, again, be either leaf nodes or other
 * containers.
 * </p>
 * <p>
 * At the root of the display tree, there is the Stage, which is a container,
 * too. To create a Starling application, you create a custom Sprite subclass,
 * and Starling will add an instance of peer class to the stage.
 * </p>
 * <p>
 * A display object has properties that define its position in relation to its
 * parent (x, y), as well as its rotation and scaling factors (scaleX, scaleY).
 * Use the alpha and visible properties to make an object translucent or
 * invisible.
 * </p>
 * <p>
 * Every display object may be the target of touch events. If you don't want an
 * object to be touchable, you can disable the "touchable" property. When it's
 * disabled, neither the object nor its children will receive any more touch
 * events.
 * </p>
 * <p>
 * <b>Transforming coordinates</b>
 * </p>
 * <p>
 * Within the display tree, each object has its own local coordinate system. If
 * you rotate a container, you rotate that coordinate system - and thus all the
 * children of the container.
 * </p>
 * <p>
 * Sometimes you need to know where a certain point lies relative to another
 * coordinate system. That's the purpose of the method getTransformationMatrix.
 * It will create a matrix that represents the transformation of a point in one
 * coordinate system to another.
 * </p>
 * <p>
 * 
 * <b>Subclassing</b>
 * </p>
 * <p>
 * Since DisplayObject is an abstract class, you cannot instantiate it directly,
 * but have to use one of its subclasses instead. There are already a lot of
 * them available, and most of the time they will suffice.
 * </p>
 * 
 * 
 */
public class DisplayObject extends EventDispatcher {

    protected DisplayObject() {

    }

    DisplayObject(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The opacity of the object.
     * 
     * @param value
     */
    public native void setAlpha(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalpha(value);
    }-*/;

    public native double getAlpha()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalpha();
    }-*/;

    /**
     * [read-only] The bounds of the object relative to the local coordinates of
     * the parent.
     * 
     * @return
     */
    public native Rectangle getBounds()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbounds();
    }-*/;

    /**
     * The height of the object in pixels.
     * 
     * @param value
     */
    public native void setHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheight(value);
    }-*/;

    public native double getHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * The name of the display object (default: null).
     * 
     * @param value
     */
    public native void setName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setname(value);
    }-*/;

    public native String getName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getname();
    }-*/;

    /**
     * [read-only] The display object container that contains peer display
     * object.
     * 
     * @return
     */
    public native DisplayObjectContainer getParent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getparent();
    }-*/;

    /**
     * The x coordinate of the object's origin in its own coordinate space
     * (default: 0).
     * 
     * @param value
     */
    public native void setPivotX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpivotX(value);
    }-*/;

    public native double getPivotX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpivotX();
    }-*/;

    /**
     * The y coordinate of the object's origin in its own coordinate space
     * (default: 0).
     * 
     * @param value
     */
    public native void setPivotY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpivotY(value);
    }-*/;

    public native double getPivotY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpivotY();
    }-*/;

    /**
     * [read-only] The topmost object in the display tree the object is part of.
     * 
     * @return
     */
    public native DisplayObject getRoot()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getroot();
		return @com.emitrom.flash4j.starling.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The rotation of the object in radians.
     * 
     * @param value
     */
    public native void setRotation(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrotation(value);
    }-*/;

    public native double getRotation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geteotation();
    }-*/;

    /**
     * The horizontal scale factor.
     * 
     * @param value
     */
    public native void setScaleX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleX(value);
    }-*/;

    public native double getScaleX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleX();
    }-*/;

    /**
     * The vertical scale factor.
     * 
     * @param value
     */
    public native void setScaleY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleY(value);
    }-*/;

    public native double getScaleY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleY();
    }-*/;

    /**
     * [read-only] The stage the display object is connected to, or null if it
     * is not connected to a stage.
     * 
     * @return
     */
    public native Stage getStage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getstage();
		return @com.emitrom.flash4j.starling.client.display.Stage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Indicates if peer object (and its children) will receive touch events.
     * 
     * @return
     */
    public native boolean isTouchable()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettouchable();
    }-*/;

    public native void setTouchable(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settouchable(value);
    }-*/;

    /**
     * [read-only] The transformation matrix of the object relative to its
     * parent.
     * 
     * @return
     */
    public native Matrix getTransformationMatrix()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettransformationMatrix();
		return @com.emitrom.flash4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The visibility of the object.
     * 
     * @return
     */
    public native boolean isVisible()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvisible();
    }-*/;

    public native void setVisible(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvisible(value);
    }-*/;

    /**
     * The width of the object in pixels.
     * 
     * @param value
     */
    public native void setWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setwidth(value);
    }-*/;

    public native double getWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * The x coordinate of the object relative to the local coordinates of the
     * parent.
     * 
     * @param value
     */
    public native void setX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setx(value);
    }-*/;

    public native void setY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sety(value);
    }-*/;

    /**
     * The y coordinate of the object relative to the local coordinates of the
     * parent.
     * 
     * @return
     */
    public native double getX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getx();
    }-*/;

    public native double getY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gety();
    }-*/;

    /**
     * The y coordinate of the object relative to the local coordinates of the
     * parent.
     */
    public native void dispose()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.dispose();
    }-*/;

    /**
     * Returns a rectangle that completely encloses the object as it appears in
     * another coordinate system.
     * 
     * @param targetSpace
     * @return
     */
    public native Rectangle getBounds(DisplayObject targetSpace)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getBounds(targetSpace.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates a matrix that represents the transformation from the local
     * coordinate system to another.
     * 
     * @param targetSpace
     * @return
     */
    public native Matrix getTransformationMatrix(DisplayObject targetSpace)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getTransformationMatrix(targetSpace.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Transforms a point from global (stage) coordinates to the local
     * coordinate system.
     * 
     * @param globalPoint
     * @return
     */
    public native Point globalToLocal(Point globalPoint)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.globalToLocal(globalPoint.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the object that is found topmost beneath a point in local
     * coordinates, or nil if the test fails.
     * 
     * @param localPoint
     * @return
     */
    public native DisplayObject hitTestPoint(Point localPoint)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.hitTestPoint(localPoint.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.starling.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the object that is found topmost beneath a point in local
     * coordinates, or nil if the test fails.
     * 
     * @param localPoint
     * @param forTouch
     * @return
     */
    public native DisplayObject hitTestPoint(Point localPoint, boolean forTouch)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.hitTestPoint(
						localPoint.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						forTouch);
		return @com.emitrom.flash4j.starling.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Transforms a point from the local coordinate system to global (stage)
     * coordinates.
     * 
     * @param localPoint
     * @return
     */
    public native Point localToGlobal(Point localPoint)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.localToGlobal(localPoint.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Removes the object from its parent, if it has one.
     */
    public native void removeFromParent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeFromParent();
    }-*/;

    /**
     * Removes the object from its parent, if it has one.
     * 
     * @param dispose
     */
    public native void removeFromParent(boolean dispose)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeFromParent(dispose);
    }-*/;

    /**
     * Renders the display object with the help of a support object.
     * 
     * @param support
     * @param alpha
     */
    public native void render(RenderSupport support, double alpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.render(
						support.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						alpha);
    }-*/;

}
