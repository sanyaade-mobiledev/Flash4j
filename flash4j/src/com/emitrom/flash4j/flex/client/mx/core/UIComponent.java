/************************************************************************
 * UIComponent.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

package com.emitrom.flash4j.flex.client.mx.core;

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.display.DisplayObjectContainer;
import com.emitrom.flash4j.core.client.display.InteractiveObject;
import com.emitrom.flash4j.core.client.display.Sprite;
import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Matrix;
import com.emitrom.flash4j.core.client.geom.Matrix3D;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.core.client.text.TextLineMetrics;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.states.State;
import com.emitrom.flash4j.flex.client.mx.states.Transition;
import com.emitrom.flash4j.flex.client.mx.validators.IValidatorListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * The UIComponent class is the base class for all visual components, both
 * interactive and noninteractive. An interactive component can participate in
 * tabbing and other kinds of keyboard focus manipulation, accept low-level
 * events like keyboard and mouse input, and be disabled so that it does not
 * receive keyboard and mouse input. peer is in contrast to noninteractive
 * components, like Label and ProgressBar, which simply display contents and are
 * not manipulated by the user.
 * <p>
 * The UIComponent class is not to be used directly, but is used as a base class
 * for other classes.
 */
public class UIComponent extends FlexSprite implements IFlexDisplayObject, IVisualElement, IUIComponent,
                IValidatorListener {

    private static final UIComponent STATIC = new UIComponent();

    /**
     * Instantiates a new uI component.
     */
    public UIComponent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the uI component
     */
    public UIComponent() {
        jsObj = Bridge.createObject("mx.core.UIComponent");
    }

    /**
     * Sets the accessibility description.
     * 
     * @param value
     *            the new accessibility description
     */
    public native void setAccessibilityDescription(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setaccessibilityDescription(value);
    }-*/;

    /**
     * Gets the accessibility description.
     * 
     * @return the accessibility description
     */
    public native String getAccessibilityDescription()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getaccessibilityDescription();
    }-*/;

    /**
     * Checks for accessibility enabled.
     * 
     * @return true, if successful
     */
    public native boolean hasAccessibilityEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getaccessibilityEnabled();
    }-*/;

    /**
     * Sets the accessibility name.
     * 
     * @param value
     *            the new accessibility name
     */
    public native void setAccessibilityName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setaccessibilityName(value);
    }-*/;

    /**
     * Gets the accessibility name.
     * 
     * @return the accessibility name
     */
    public native String getAccessibilityName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getaccessibilityName();
    }-*/;

    /**
     * Sets the accessibility shortcut.
     * 
     * @param value
     *            the new accessibility shortcut
     */
    public native void setAccessibilityShortcut(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setaccessibilityShortcut(value);
    }-*/;

    /**
     * Gets the accessibility shortcut.
     * 
     * @return the accessibility shortcut
     */
    public native String getAccessibilityShortcut()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getaccessibilityShortcut();
    }-*/;

    /**
     * Checks if is automation enabled.
     * 
     * @return true, if is automation enabled
     */
    public native boolean isAutomationEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautomationEnabled();
    }-*/;

    /**
     * Sets the automation name.
     * 
     * @param value
     *            the new automation name
     */
    public native void setAutomationName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautomationName(value);
    }-*/;

    /**
     * Gets the automation name.
     * 
     * @return the automation name
     */
    public native String getAutomationName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautomationName();
    }-*/;

    /**
     * Gets the automation tabular data.
     * 
     * @param <T>
     *            the generic type
     * @return the automation tabular data
     */
    public native <T> T getAutomationTabularData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautomationTabularData();
    }-*/;

    /**
     * Gets the automation value.
     * 
     * @return the automation value
     */
    public native JsArray<JavaScriptObject> getAutomationValue()/*-{
		return peer.getautomationValue();
    }-*/;

    /**
     * Checks if is automation visible.
     * 
     * @return true, if is automation visible
     */
    public native boolean isAutomationVisible()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautomationVisible();
    }-*/;

    /**
     * Sets the base line.
     * 
     * @param value
     *            the new base line
     */
    public void setBaseLine(double value) {
        _setBaseline(Double.toString(value));
    }

    /**
     * _set baseline.
     * 
     * @param value
     *            the value
     */
    private native void _setBaseline(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbaseLine(value);
    }-*/;

    /**
     * Gets the base line.
     * 
     * @return the base line
     */
    public double getBaseLine() {
        return Double.parseDouble(_getBaseLine());
    }

    /**
     * _get base line.
     * 
     * @return the string
     */
    private native String _getBaseLine()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbaseLine();
    }-*/;

    /**
     * Gets the baseline position.
     * 
     * @return the baseline position
     */
    public native double getBaselinePosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbaselinePosition();
    }-*/;

    /**
     * Sets the bottom.
     * 
     * @param value
     *            the new bottom
     */
    public void setBottom(double value) {
        _setBottom(Double.toString(value));
    }

    /**
     * _set bottom.
     * 
     * @param value
     *            the value
     */
    private native void _setBottom(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbottom(value);
    }-*/;

    /**
     * Gets the bottom.
     * 
     * @return the bottom
     */
    public double getBottom() {
        return Double.parseDouble(_getBottom());
    }

    /**
     * _get bottom.
     * 
     * @return the string
     */
    private native String _getBottom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbottom();
    }-*/;

    /**
     * Sets the cache heuristic.
     * 
     * @param value
     *            the new cache heuristic
     */
    public native void setCacheHeuristic(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcacheHeuristic(value);
    }-*/;

    /**
     * Sets the cache policy.
     * 
     * @param policy
     *            the new cache policy
     */
    public void setCachePolicy(UIComponentCachePolicy policy) {
        _setCachePolicy(policy.value);
    }

    /**
     * _set cache policy.
     * 
     * @param value
     *            the value
     */
    private native void _setCachePolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcachePolicy(value);
    }-*/;

    /**
     * Gets the cache policy.
     * 
     * @return the cache policy
     */
    public UIComponentCachePolicy getCachePolicy() {
        return UIComponentCachePolicy.fromValue(_getCachePolicy());
    }

    /**
     * _get cache policy.
     * 
     * @return the string
     */
    private native String _getCachePolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcachePolicy();
    }-*/;

    /**
     * Gets the class name.
     * 
     * @return the class name
     */
    public native String getClassName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclassName();
    }-*/;

    /**
     * Gets the content mouse x.
     * 
     * @return the content mouse x
     */
    public native double getContentMouseX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontentMouseX();
    }-*/;

    /**
     * Gets the content mouse y.
     * 
     * @return the content mouse y
     */
    public native double getContentMouseY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontentMouseY();
    }-*/;

    /**
     * Gets the current css state.
     * 
     * @return the current css state
     */
    public native String getCurrentCSSState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentCSSState();
    }-*/;

    /**
     * Gets the current state.
     * 
     * @return the current state
     */
    public native String getCurrentState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentState();
    }-*/;

    /**
     * Sets the current state property.
     * 
     * @param value
     *            the new current state property
     */
    public native void setCurrentStateProperty(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcurrentState(value);
    }-*/;

    /**
     * Gets the cursor manager.
     * 
     * @return the cursor manager
     */
    public native CursorManager getCursorManager()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcursorManager();
		return @com.emitrom.flash4j.flex.client.mx.core.CursorManager::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the depth.
     * 
     * @return the depth
     */
    public native double getDepth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdepth();
    }-*/;

    /**
     * Sets the depth.
     * 
     * @param value
     *            the new depth
     */
    public native void setDepth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdepth(value);
    }-*/;

    /**
     * Checks if is enabled.
     * 
     * @return true, if is enabled
     */
    public native boolean isEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getenabled();
    }-*/;

    /**
     * Sets the enabled.
     * 
     * @param value
     *            the new enabled
     */
    public native void setEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenabled(value);
    }-*/;

    /**
     * Gets the error string.
     * 
     * @return the error string
     */
    public native String getErrorString()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geterrorString();
    }-*/;

    /**
     * Sets the error string.
     * 
     * @param value
     *            the new error string
     */
    public native void setErrorString(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seterrorString(value);
    }-*/;

    /**
     * Gets the explicit height.
     * 
     * @return the explicit height
     */
    public native double getExplicitHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitHeight();
    }-*/;

    /**
     * Sets the explicit height.
     * 
     * @param value
     *            the new explicit height
     */
    public native void setExplicitHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplicitHeight(value);
    }-*/;

    /**
     * Gets the explicit max height.
     * 
     * @return the explicit max height
     */
    public native double getExplicitMaxHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitMaxHeight();
    }-*/;

    /**
     * Sets the explicit max height.
     * 
     * @param value
     *            the new explicit max height
     */
    public native void setExplicitMaxHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplicitMaxHeight(value);
    }-*/;

    /**
     * Gets the explicit max width.
     * 
     * @return the explicit max width
     */
    public native double getExplicitMaxWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitMaxWidth();
    }-*/;

    /**
     * Sets the explicit max width.
     * 
     * @param value
     *            the new explicit max width
     */
    public native void setExplicitMaxWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplicitMaxWidth(value);
    }-*/;

    /**
     * Gets the explicit min height.
     * 
     * @return the explicit min height
     */
    public native double getExplicitMinHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitMinHeight();
    }-*/;

    /**
     * Sets the explicit min height.
     * 
     * @param value
     *            the new explicit min height
     */
    public native void setExplicitMinHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplicitMinHeight(value);
    }-*/;

    /**
     * Gets the explicit min width.
     * 
     * @return the explicit min width
     */
    public native double getExplicitMinWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitMinWidth();
    }-*/;

    /**
     * Sets the explicit min width.
     * 
     * @param value
     *            the new explicit min width
     */
    public native void setExplicitMinWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplicitMinWidth(value);
    }-*/;

    /**
     * Gets the explicit width.
     * 
     * @return the explicit width
     */
    public native double getExplicitWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitWidth();
    }-*/;

    /**
     * Sets the explicit width.
     * 
     * @param value
     *            the new explicit width
     */
    public native void setExplicitWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexplicitWidth(value);
    }-*/;

    /**
     * Sets the focus enalbled.
     * 
     * @param value
     *            the new focus enalbled
     */
    public native void setFocusEnalbled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfocusEnable(value);
    }-*/;

    /**
     * Gets the focus enabled.
     * 
     * @return the focus enabled
     */
    public native boolean getFocusEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfocusEnabled();
    }-*/;

    /**
     * Sets the focus pane.
     * 
     * @param value
     *            the new focus pane
     */
    public native void setFocusPane(Sprite value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setfocusPane(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the focus pane.
     * 
     * @return the focus pane
     */
    public native Sprite getFocusPane()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getfocusPane();
		return @com.emitrom.flash4j.core.client.display.Sprite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the checks for focusable children.
     * 
     * @param value
     *            the new checks for focusable children
     */
    public native void setHasFocusableChildren(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethasFocusableChildren(value);
    }-*/;

    /**
     * Checks for focusable children.
     * 
     * @return true, if successful
     */
    public native boolean hasFocusableChildren()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasFocusableChildren();
    }-*/;

    /**
     * Checks for layout matrix3 d.
     * 
     * @return true, if successful
     */
    public native boolean hasLayoutMatrix3D()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethasLayoutMatrix3D();
    }-*/;

    /**
     * Sets the horizontal center.
     * 
     * @param value
     *            the new horizontal center
     */
    public void setHorizontalCenter(double value) {
        _setHorizontalCenter(Double.toString(value));
    }

    /**
     * _set horizontal center.
     * 
     * @param value
     *            the value
     */
    private native void _setHorizontalCenter(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalCenter(value);
    }-*/;

    /**
     * Gets the horizontal center.
     * 
     * @param <T>
     *            the generic type
     * @return the horizontal center
     */
    public native <T> T getHorizontalCenter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalCenter();
    }-*/;

    /**
     * Sets the id.
     * 
     * @param value
     *            the new id
     */
    public native void setId(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setid(value);
    }-*/;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public native String getId()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getid();
    }-*/;

    /**
     * Sets the include in layout.
     * 
     * @param value
     *            the new include in layout
     */
    public native void setIncludeInLayout(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setincludeInLayout(value);
    }-*/;

    /**
     * Checks if is include in layout.
     * 
     * @return true, if is include in layout
     */
    public native boolean isIncludeInLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getincludeInLayout();
    }-*/;

    /**
     * Sets the initialized.
     * 
     * @param value
     *            the new initialized
     */
    public native void setInitialized(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinitialized(value);
    }-*/;

    /**
     * Checks if is initialized.
     * 
     * @return true, if is initialized
     */
    public native boolean isInitialized()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinitialized();
    }-*/;

    /**
     * Gets the instance index.
     * 
     * @return the instance index
     */
    public native int getInstanceIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinstanceIndex();
    }-*/;

    /**
     * Sets the instance indices.
     * 
     * @param values
     *            the new instance indices
     */
    public native void setInstanceIndices(JsArrayInteger values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setinstanceIndices(values);
    }-*/;

    /**
     * Gets the instance indices.
     * 
     * @return the instance indices
     */
    public native JsArrayInteger getInstanceIndices()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getinstanceIndices();
    }-*/;

    /**
     * Checks if is 3 d.
     * 
     * @return true, if is 3 d
     */
    public native boolean is3D()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getis3D();
    }-*/;

    /**
     * Checks if is document.
     * 
     * @return true, if is document
     */
    public native boolean isDocument()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisDocument();
    }-*/;

    /**
     * Sets the checks if is pop up.
     * 
     * @param value
     *            the new checks if is pop up
     */
    public native void setIsPopUp(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setisPopUp(value);
    }-*/;

    /**
     * Checks if is pop up.
     * 
     * @return true, if is pop up
     */
    public native boolean isPopUp()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisPopUp();
    }-*/;

    /**
     * Sets the layout matrix3 d property.
     * 
     * @param value
     *            the new layout matrix3 d property
     */
    public native void setLayoutMatrix3DProperty(Matrix3D value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlayoutMatrix3D(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the left.
     * 
     * @param value
     *            the new left
     */
    public void setLeft(double value) {
        _setLeft(Double.toString(value));
    }

    /**
     * _set left.
     * 
     * @param value
     *            the value
     */
    private native void _setLeft(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setleft(value);
    }-*/;

    /**
     * Gets the left.
     * 
     * @return the left
     */
    public double getLeft() {
        return Double.parseDouble(_getLeft());
    }

    /**
     * _get left.
     * 
     * @return the string
     */
    private native String _getLeft()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getleft();
    }-*/;

    /**
     * Sets the maintain projection center.
     * 
     * @param value
     *            the new maintain projection center
     */
    public native void setMaintainProjectionCenter(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaintainProjectionCenter(value);
    }-*/;

    /**
     * Maintain projection center.
     * 
     * @return true, if successful
     */
    public native boolean maintainProjectionCenter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaintainProjectionCenter();
    }-*/;

    /**
     * Sets the max height.
     * 
     * @param value
     *            the new max height
     */
    public native void setMaxHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxHeight(value);
    }-*/;

    /**
     * Gets the max height.
     * 
     * @return the max height
     */
    public native double getMaxHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxHeight();
    }-*/;

    /**
     * Sets the max width.
     * 
     * @param value
     *            the new max width
     */
    public native void setMaxWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxWidth(value);
    }-*/;

    /**
     * Gets the max width.
     * 
     * @return the max width
     */
    public native double getMaxWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxWidth();
    }-*/;

    /**
     * Sets the measured height.
     * 
     * @param value
     *            the new measured height
     */
    public native void setmeasuredHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmeasuredHeight(value);
    }-*/;

    /**
     * Gets the measured height.
     * 
     * @return the measured height
     */
    public native double getMeasuredHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmeasuredHeight();
    }-*/;

    /**
     * Sets the measured min height.
     * 
     * @param value
     *            the new measured min height
     */
    public native void setMeasuredMinHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.getmeasuredMinHeight(value);
    }-*/;

    /**
     * Gets the measured min height.
     * 
     * @return the measured min height
     */
    public native double getMeasuredMinHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmeasuredMinHeight();
    }-*/;

    /**
     * Sets the measured min width.
     * 
     * @param value
     *            the new measured min width
     */
    public native void setMeasuredMinWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmeasuredMinWidth(value);
    }-*/;

    /**
     * Gets the measured min width.
     * 
     * @return the measured min width
     */
    public native double getMeasuredMinWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmeasuredMinWidth();
    }-*/;

    /**
     * Sets the measured width.
     * 
     * @param value
     *            the new measured width
     */
    public native void setMeasuredWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmeasuredWidth(value);
    }-*/;

    /**
     * Gets the measured width.
     * 
     * @return the measured width
     */
    public native double getMeasuredWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmeasuredWidth();
    }-*/;

    /**
     * Sets the min width.
     * 
     * @param value
     *            the new min width
     */
    public native void setMinWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminWidth(value);
    }-*/;

    /**
     * Gets the min width.
     * 
     * @return the min width
     */
    public native double getMinWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminWidth();
    }-*/;

    /**
     * Sets the min height.
     * 
     * @param value
     *            the new min height
     */
    public native void setMinHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminHeight(value);
    }-*/;

    /**
     * Gets the min height.
     * 
     * @return the min height
     */
    public native double getMinHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminHeight();
    }-*/;

    /**
     * Sets the mouse focus enabled.
     * 
     * @param value
     *            the new mouse focus enabled
     */
    public native void setMouseFocusEnabled(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmouseFocusEnabled(value);
    }-*/;

    /**
     * Checks if is mouse focus enabled.
     * 
     * @return true, if is mouse focus enabled
     */
    public native boolean isMouseFocusEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmouseFocusEnabled();
    }-*/;

    /**
     * Sets the nest level.
     * 
     * @param value
     *            the new nest level
     */
    public native void setNestLevel(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnestLevel(value);
    }-*/;

    /**
     * Gets the nest level.
     * 
     * @return the nest level
     */
    public native int getNestLevel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnestLevel();
    }-*/;

    /**
     * Gets the num automation children.
     * 
     * @return the num automation children
     */
    public native int getNumAutomationChildren()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumAutomationChildren();
    }-*/;

    /**
     * Sets the owner.
     * 
     * @param value
     *            the new owner
     */
    public native void setOwner(DisplayObjectContainer value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setowner(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the owner.
     * 
     * @return the owner
     */
    public native DisplayObjectContainer getOwner()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getowner();
		return @com.emitrom.flash4j.core.client.display.DisplayObjectContainer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the percent height.
     * 
     * @param value
     *            the new percent height
     */
    public native void setPercentHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpercentHeight(value);
    }-*/;

    public void setPercentSize(double percentWidth, double percentHeight) {
        setPercentWidth(percentWidth);
        setPercentHeight(percentHeight);
    }

    public void setCenter(double verticalCenter, double horizontalCenter) {
        setVerticalCenter(verticalCenter);
        setHorizontalCenter(horizontalCenter);
    }

    /**
     * Gets the percent height.
     * 
     * @return the percent height
     */
    public native double getPercentHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpercentHeight();
    }-*/;

    /**
     * Sets the percent width.
     * 
     * @param value
     *            the new percent width
     */
    public native void setPercentWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpercentWidth(value);
    }-*/;

    /**
     * Gets the percent width.
     * 
     * @return the percent width
     */
    public native double getPercentWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpercentWidth();
    }-*/;

    /**
     * Sets the processed descriptors.
     * 
     * @param value
     *            the new processed descriptors
     */
    public native void setProcessedDescriptors(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprocessedDescriptors(value);
    }-*/;

    /**
     * Gets the processed descriptors.
     * 
     * @return the processed descriptors
     */
    public native boolean getProcessedDescriptors()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getprocessedDescriptors();
    }-*/;

    /**
     * Gets the repeater index.
     * 
     * @return the repeater index
     */
    public native int getRepeaterIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrepeaterIndex();
    }-*/;

    /**
     * Gets the right.
     * 
     * @return the right
     */
    public double getRight() {
        return Double.parseDouble(_getRight());
    }

    /**
     * _get right.
     * 
     * @return the string
     */
    private native String _getRight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getright();
    }-*/;

    /**
     * Sets the right.
     * 
     * @param value
     *            the new right
     */
    public void setRight(double value) {
        _setRight(Double.toString(value));
    }

    /**
     * _set right.
     * 
     * @param value
     *            the value
     */
    private native void _setRight(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setright(value);
    }-*/;

    /**
     * Show in automation hierarchie.
     * 
     * @return true, if successful
     */
    public native boolean showInAutomationHierarchie()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowInAutomationHierarchie();
    }-*/;

    /**
     * Sets the show in automation hierharchie.
     * 
     * @param value
     *            the new show in automation hierharchie
     */
    public native void setShowInAutomationHierharchie(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowInAutomationHierarchie(value);
    }-*/;

    /**
     * Sets the states.
     * 
     * @param states
     *            the new states
     */
    public void setStates(List<State> states) {
        _setStates(DataConverter.fromList(states));
    }

    /**
     * Sets the states.
     * 
     * @param col
     *            the new states
     */
    private void _setStates(ArrayCollection col) {
        _setStates(col.toArray().getJsObj());
    }

    /**
     * _set states.
     * 
     * @param value
     *            the value
     */
    private native void _setStates(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstates(value);
    }-*/;

    /**
     * Gets the style name.
     * 
     * @param <T>
     *            the generic type
     * @return the style name
     */
    public native <T> T getStyleName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstyleName();
    }-*/;

    /**
     * Sets the style name.
     * 
     * @param value
     *            the new style name
     */
    public native void setStyleName(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstyleName(value);
    }-*/;

    /**
     * Checks for tab focus enabled.
     * 
     * @return true, if successful
     */
    public native boolean hasTabFocusEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettabFocusEnabled();
    }-*/;

    /**
     * Sets the tab focus enabled.
     * 
     * @param value
     *            the new tab focus enabled
     */
    public native void setTabFocusEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settabFocusEnabled(value);
    }-*/;

    /**
     * Gets the tool tip.
     * 
     * @return the tool tip
     */
    public native String getToolTip()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettoolTip();
    }-*/;

    /**
     * Sets the tool tip.
     * 
     * @param value
     *            the new tool tip
     */
    public native void setToolTip(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settoolTip(value);
    }-*/;

    /**
     * Gets the top.
     * 
     * @return the top
     */
    public double getTop() {
        return Double.parseDouble(_getTop());
    }

    /**
     * _get top.
     * 
     * @return the string
     */
    private native String _getTop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettop();
    }-*/;

    /**
     * Sets the top.
     * 
     * @param value
     *            the new top
     */
    public void setTop(double value) {
        _setTop(Double.toString(value));
    }

    /**
     * Set the position of this element relative to his parent The top, left,
     * bottom and right position will be set
     * 
     * @param value
     */
    public void setRelativePosition(double value) {
        setTop(value);
        setLeft(value);
        setBottom(value);
        setRight(value);
    }

    /**
     * Set the position of this element relative to his parent.
     * 
     * @param topBottom
     *            , top and bottom position
     * @param leftRight
     *            , left and right position
     */
    public void setRelativePosition(double topBottom, double leftRight) {
        setTop(topBottom);
        setLeft(leftRight);
        setBottom(topBottom);
        setRight(leftRight);
    }

    /**
     * Set the position of this element relative to his parent The top, left,
     * bottom and right position will be set
     * 
     */
    public void setRelativePosition(double top, double left, double bottom, double right) {
        setTop(top);
        setLeft(left);
        setBottom(bottom);
        setRight(right);
    }

    /**
     * _set top.
     * 
     * @param value
     *            the value
     */
    private native void _setTop(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settop(value);
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
     * @param value
     *            the new transform x
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
     * @param value
     *            the new transform y
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
     * @param value
     *            the new transform z
     */
    public native void setTransformZ(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settransformZ(value);
    }-*/;

    /**
     * Sets the transitions.
     * 
     * @param values
     *            the new transitions
     */
    public void setTransitions(List<Transition> values) {
        _setTransitions(DataConverter.fromList(values));
    }

    /**
     * Sets the transitions.
     * 
     * @param col
     *            the new transitions
     */
    private void _setTransitions(ArrayCollection col) {
        _setTransitions(col.toArray().getJsObj());
    }

    /**
     * Sets the transitions.
     * 
     * @param value
     *            the new transitions
     */
    private native void _setTransitions(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settransitions(value);
    }-*/;

    /**
     * Gets the uID.
     * 
     * @return the uID
     */
    public native String getUID()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getuid();
    }-*/;

    /**
     * Sets the uID.
     * 
     * @param value
     *            the new uID
     */
    public native void setUID(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setuid(value);
    }-*/;

    /**
     * Gets the validation sub field.
     * 
     * @return the validation sub field
     */
    public native String getValidationSubField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalidationSubField();
    }-*/;

    /**
     * Sets the validation sub field.
     * 
     * @param value
     *            the new validation sub field
     */
    public native void setValidationSubField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalidationSubField(value);
    }-*/;

    /**
     * Gets the vertical center.
     * 
     * @param <T>
     *            the generic type
     * @return the vertical center
     */
    public native <T> T getVerticalCenter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalCenter();
    }-*/;

    /**
     * Sets the vertical center.
     * 
     * @param value
     *            the new vertical center
     */
    public void setVerticalCenter(double value) {
        _setVerticalCenter(Double.toString(value));
    }

    /**
     * _set vertical center.
     * 
     * @param value
     *            the value
     */
    private native void _setVerticalCenter(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalCenter(value);
    }-*/;

    /**
     * Clear style.
     * 
     * @param styleProperity
     *            the style properity
     */
    public native void clearStyle(String styleProperity)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.claerStyle(styleProperty);
    }-*/;

    /**
     * Content to global.
     * 
     * @param point
     *            the point
     * @return the point
     */
    public native Point contentToGlobal(Point point)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.contentToGlobal(point.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Content to local.
     * 
     * @param point
     *            the point
     * @return the point
     */
    public native Point contentToLocal(Point point)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.contentToLocal(point.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param w
     *            the w
     * @param h
     *            the h
     */
    public native void drawRoundRect(double x, double y, double w, double h)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRect(x, y, w, h);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param w
     *            the w
     * @param h
     *            the h
     * @param r
     *            the r
     */
    public native void drawRoundRect(double x, double y, double w, double h, Object r)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRect(x, y, w, h, r);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param w
     *            the w
     * @param h
     *            the h
     * @param r
     *            the r
     * @param c
     *            the c
     */
    public native void drawRoundRect(double x, double y, double w, double h, Object r, Object c)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRect(x, y, w, h, r, c);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param w
     *            the w
     * @param h
     *            the h
     * @param r
     *            the r
     * @param c
     *            the c
     * @param alpha
     *            the alpha
     */
    public native void drawRoundRect(double x, double y, double w, double h, Object r, Object c, Object alpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRect(x, y, w, h, r, c, alpha);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param w
     *            the w
     * @param h
     *            the h
     * @param r
     *            the r
     * @param c
     *            the c
     * @param alpha
     *            the alpha
     * @param rot
     *            the rot
     */
    public native void drawRoundRect(double x, double y, double w, double h, Object r, Object c, Object alpha,
                    Object rot)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRect(x, y, w, h, r, c, alpha, rot);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param w
     *            the w
     * @param h
     *            the h
     * @param r
     *            the r
     * @param c
     *            the c
     * @param alpha
     *            the alpha
     * @param rot
     *            the rot
     * @param gradient
     *            the gradient
     */
    public native void drawRoundRect(double x, double y, double w, double h, Object r, Object c, Object alpha,
                    Object rot, String gradient)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRect(x, y, w, h, r, c, alpha, rot, gradient);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param w
     *            the w
     * @param h
     *            the h
     * @param r
     *            the r
     * @param c
     *            the c
     * @param alpha
     *            the alpha
     * @param rot
     *            the rot
     * @param gradient
     *            the gradient
     * @param ratios
     *            the ratios
     */
    public native void drawRoundRect(double x, double y, double w, double h, Object r, Object c, Object alpha,
                    Object rot, String gradient, JsArrayNumber ratios)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.drawRoundRect(x, y, w, h, r, c, alpha, rot, gradient, ratios);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param w
     *            the w
     * @param h
     *            the h
     * @param r
     *            the r
     * @param c
     *            the c
     * @param alpha
     *            the alpha
     * @param rot
     *            the rot
     * @param gradient
     *            the gradient
     * @param ratios
     *            the ratios
     * @param hole
     *            the hole
     */
    public native void drawRoundRect(double x, double y, double w, double h, Object r, Object c, Object alpha,
                    Object rot, String gradient, JsArrayNumber ratios, Object hole)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawRoundRect(x, y, w, h, r, c, alpha, rot, gradient, ratios,
						hole);
    }-*/;

    /**
     * Executed bindings.
     */
    public native void executedBindings()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.executeBindings();
    }-*/;

    /**
     * Executed bindings.
     * 
     * @param recurse
     *            the recurse
     */
    public native void executedBindings(boolean recurse)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.executeBndings(recurse);
    }-*/;

    /**
     * Gets the bounds x at size.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     * @return the bounds x at size
     */
    public native double getBoundsXAtSize(double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getboundsXAtSize(width, height);
    }-*/;

    /**
     * Gets the bounds x at size.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     * @param postLayoutTransform
     *            the post layout transform
     * @return the bounds x at size
     */
    public native double getBoundsXAtSize(double width, double height, boolean postLayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getboundsXAtSize(width, height, postLayoutTransform);
    }-*/;

    /**
     * Gets the bounds y at size.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     * @return the bounds y at size
     */
    public native double getBoundsYAtSize(double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getboundsYAtSize(width, height);
    }-*/;

    /**
     * Gets the bounds y at size.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     * @param postLayoutTransform
     *            the post layout transform
     * @return the bounds y at size
     */
    public native double getBoundsYAtSize(double width, double height, boolean postLayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getboundsYAtSize(width, height, postLayoutTransform);
    }-*/;

    /**
     * Gets the class style declaration.
     * 
     * @return the class style declaration
     */
    public native JsArray<JavaScriptObject> getClassStyleDeclaration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclassStyleDeclaration();
    }-*/;

    /**
     * Gets the constraint value.
     * 
     * @param <T>
     *            the generic type
     * @param constraintName
     *            the constraint name
     * @return the constraint value
     */
    public native <T> T getConstraintValue(String constraintName)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontraintValue(constraintName);
    }-*/;

    /**
     * Gets the explixit or measured height.
     * 
     * @return the explixit or measured height
     */
    public native double getExplixitOrMeasuredHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitOrMeasuredHeight();
    }-*/;

    /**
     * Gets the explixit or measured width.
     * 
     * @return the explixit or measured width
     */
    public native double getExplixitOrMeasuredWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexplicitOrMeasuredWidth();
    }-*/;

    /**
     * Gets the focus.
     * 
     * @return the focus
     */
    public native InteractiveObject getFocus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getfocus();
		return @com.emitrom.flash4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the layout bounds height.
     * 
     * @return the layout bounds height
     */
    public native double getLayoutBoundsHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlayoutBoundsHeight();
    }-*/;

    /**
     * Gets the layout bounds height.
     * 
     * @param postLayoutTransform
     *            the post layout transform
     * @return the layout bounds height
     */
    public native double getLayoutBoundsHeight(boolean postLayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlayoutBoundsHeight(postLayoutTransform);
    }-*/;

    /**
     * Gets the layout bounds width.
     * 
     * @return the layout bounds width
     */
    public native double getLayoutBoundsWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlayoutBoundsWidth();
    }-*/;

    /**
     * Gets the layout bounds width.
     * 
     * @param postLayoutTransform
     *            the post layout transform
     * @return the layout bounds width
     */
    public native double getLayoutBoundsWidth(boolean postLayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlayoutBoundsWidth(postLayoutTransform);
    }-*/;

    /**
     * Gets the layout matrix.
     * 
     * @return the layout matrix
     */
    public native Matrix getLayoutMatrix()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getLayoutMatrix();
		return @com.emitrom.flash4j.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the layout matrix3 d.
     * 
     * @return the layout matrix3 d
     */
    public native Matrix3D getLayoutMatrix3D()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getLayoutMatrix3D();
		return @com.emitrom.flash4j.core.client.geom.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the max bounds height.
     * 
     * @return the max bounds height
     */
    public native double getMaxBoundsHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMaxBoundsHeight();
    }-*/;

    /**
     * Gets the max bounds height.
     * 
     * @param postlayoutTransform
     *            the postlayout transform
     * @return the max bounds height
     */
    public native double getMaxBoundsHeight(double postlayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMaxBoundsHeight(postlayoutTransform);
    }-*/;

    /**
     * Gets the max bounds width.
     * 
     * @return the max bounds width
     */
    public native double getMaxBoundsWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMaxBoundsWidth();
    }-*/;

    /**
     * Gets the max bounds width.
     * 
     * @param postlayoutTransform
     *            the postlayout transform
     * @return the max bounds width
     */
    public native double getMaxBoundsWidth(double postlayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMaxBoundsWidth(postlayoutTransform);
    }-*/;

    /**
     * Gets the min bounds height.
     * 
     * @return the min bounds height
     */
    public native double getMinBoundsHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMinBoundsHeight();
    }-*/;

    /**
     * Gets the min bounds height.
     * 
     * @param postlayoutTransform
     *            the postlayout transform
     * @return the min bounds height
     */
    public native double getMinBoundsHeight(double postlayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMinBoundsHeight(postlayoutTransform);
    }-*/;

    /**
     * Gets the min bounds width.
     * 
     * @return the min bounds width
     */
    public native double getMinBoundsWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMinBoundsWidth();
    }-*/;

    /**
     * Gets the min bounds width.
     * 
     * @param postlayoutTransform
     *            the postlayout transform
     * @return the min bounds width
     */
    public native double getMinBoundsWidth(double postlayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMinBoundsWidth(postlayoutTransform);
    }-*/;

    /**
     * Gets the preferred bounds height.
     * 
     * @return the preferred bounds height
     */
    public native double getPreferredBoundsHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getPreferredBoundsHeight();
    }-*/;

    /**
     * Gets the preferred bounds height.
     * 
     * @param postlayoutTransform
     *            the postlayout transform
     * @return the preferred bounds height
     */
    public native double getPreferredBoundsHeight(double postlayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getPreferredBoundsHeight(postlayoutTransform);
    }-*/;

    /**
     * Gets the preferred bounds width.
     * 
     * @return the preferred bounds width
     */
    public native double getPreferredBoundsWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getPreferredBoundsWidth();
    }-*/;

    /**
     * Gets the preferred bounds width.
     * 
     * @param postlayoutTransform
     *            the postlayout transform
     * @return the preferred bounds width
     */
    public native double getPreferredBoundsWidth(double postlayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getPreferredBoundsWidth(postlayoutTransform);
    }-*/;

    /**
     * Gets the repeater item.
     * 
     * @param <T>
     *            the generic type
     * @return the repeater item
     */
    public native <T> T getRepeaterItem()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getRepeaterItem();
    }-*/;

    /**
     * Gets the repeater item.
     * 
     * @param <T>
     *            the generic type
     * @param wichRepeater
     *            the wich repeater
     * @return the repeater item
     */
    public native <T> T getRepeaterItem(int wichRepeater)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getRepeaterItem(wichRepeater);
    }-*/;

    /**
     * Gets the style.
     * 
     * @param <T>
     *            the generic type
     * @param styleProp
     *            the style prop
     * @return the style
     */
    public native <T> T getStyle(String styleProp)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getStyle(styleProp);
    }-*/;

    /**
     * Global to content.
     * 
     * @param point
     *            the point
     * @return the point
     */
    public native Point globalToContent(Point point)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.globalToContent(point.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Checks for state.
     * 
     * @param stateName
     *            the state name
     * @return true, if successful
     */
    public native boolean hasState(String stateName)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.hasState(stateName);
    }-*/;

    /**
     * Horizontal gradient matrix.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param height
     *            the height
     * @param width
     *            the width
     * @return the point
     */
    public native Point horizontalGradientMatrix(double x, double y, double height, double width)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.horizontalGradientMatrix(x, y, height, width);
    }-*/;

    /**
     * Initialize.
     */
    public native void initialize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.initialize();
    }-*/;

    /**
     * Initialize repeater arrays.
     * 
     * @param parent
     *            the parent
     */
    public native void initializeRepeaterArrays(IRepeaterClient parent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.initializeRepeaterArrays(parent.@com.emitrom.flash4j.flex.client.mx.core.IRepeaterClient::asIRepeaterClient()());
    }-*/;

    /**
     * Invalidate display list.
     */
    public native void invalidateDisplayList()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateDisplayList();
    }-*/;

    /**
     * Invalidate layering.
     */
    public native void invalidateLayering()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateLayering();
    }-*/;

    /**
     * Invalidate layout direction.
     */
    public native void invalidateLayoutDirection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateLayoutDirection();
    }-*/;

    /**
     * Invalidate properties.
     */
    public native void invalidateProperties()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateProperties();
    }-*/;

    /**
     * Invalidate size.
     */
    public native void invalidateSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.invalidateSize();
    }-*/;

    /**
     * Local to content.
     * 
     * @param point
     *            the point
     * @return the point
     */
    public native Point localToContent(Point point)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.localToContent(point.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Matches css state.
     * 
     * @return true, if successful
     */
    public native boolean matchesCSSState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.matchesCSSState();
    }-*/;

    /**
     * Measure html text.
     * 
     * @param html
     *            the html
     * @return the text line metrics
     */
    public native TextLineMetrics measureHTMLText(String html)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.measureHTMLText(html);
		return @com.emitrom.flash4j.core.client.text.TextLineMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Measure text.
     * 
     * @param html
     *            the html
     * @return the text line metrics
     */
    public native TextLineMetrics measureText(String html)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.measureText(html);
		return @com.emitrom.flash4j.core.client.text.TextLineMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Move.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public native void move(double x, double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.move(x, y);
    }-*/;

    /**
     * Notify style change in children.
     * 
     * @param styleProp
     *            the style prop
     * @param recursive
     *            the recursive
     */
    public native void notifyStyleChangeInChildren(String styleProp, boolean recursive)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.notifyStyleChangeInChildren(styleProp, recursive);
    }-*/;

    /**
     * Owns.
     * 
     * @param child
     *            the child
     * @return true, if successful
     */
    public native boolean owns(DisplayObject child)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.owns(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Parent changed.
     * 
     * @param p
     *            the p
     */
    public native void parentChanged(DisplayObjectContainer p)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.parentChanged(p.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Prepare to print.
     * 
     * @param <T>
     *            the generic type
     * @param target
     *            the target
     * @return the t
     */
    public native <T> T prepareToPrint(IFlexDisplayObject target)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.prepareToPrint(target.@com.emitrom.flash4j.flex.client.mx.core.IFlexDisplayObject::asIFlexDisplayObject()());
    }-*/;

    /**
     * Regenerate style cache.
     */
    public native void regenerateStyleCache()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.regenerateStyleCache();
    }-*/;

    /**
     * Regenerate style cache.
     * 
     * @param recursive
     *            the recursive
     */
    public native void regenerateStyleCache(boolean recursive)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.regenerateStyleCache(recursive);
    }-*/;

    /**
     * Replay automatable event.
     * 
     * @param event
     *            the event
     */
    public native void replayAutomatableEvent(Event event)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.replayAutomatableEvent(event.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Resume background processing.
     */
    public static void resumeBackgroundProcessing() {
        STATIC._resumeBackgroundProcessing();
    }

    /**
     * _resume background processing.
     */
    private native void _resumeBackgroundProcessing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.resumeBackgroundProcessing();
    }-*/;

    /**
     * Sets the actual size.
     * 
     * @param w
     *            the w
     * @param h
     *            the h
     */
    public native void setActualSize(double w, double h)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setActualSize(w, h);
    }-*/;

    /**
     * Sets the current state.
     * 
     * @param stateName
     *            the new current state
     */
    public native void setCurrentState(String stateName)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setCurrentState(stateName);
    }-*/;

    /**
     * Sets the current state.
     * 
     * @param stateName
     *            the state name
     * @param playTransition
     *            the play transition
     */
    public native void setCurrentState(String stateName, boolean playTransition)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setCurrentState(stateName, playTransition);
    }-*/;

    /**
     * Sets the focus.
     */
    public native void setFocus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setFocus();
    }-*/;

    /**
     * Sets the layout bounds position.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public native void setLayoutBoundsPosition(double x, double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setLayoutBoundsPosition(x, y);
    }-*/;

    /**
     * Sets the layout bounds position.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param postLayoutTransform
     *            the post layout transform
     */
    public native void setLayoutBoundsPosition(double x, double y, boolean postLayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setLayoutBoundsPosition(x, y, postLayoutTransform);
    }-*/;

    /**
     * Sets the layout bounds size.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public native void setLayoutBoundsSize(double x, double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setLayoutBoundsSize(x, y);
    }-*/;

    /**
     * Sets the layout bounds size.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param postLayoutTransform
     *            the post layout transform
     */
    public native void setLayoutBoundsSize(double x, double y, boolean postLayoutTransform)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setLayoutBoundsSize(x, y, postLayoutTransform);
    }-*/;

    /**
     * Sets the layout matrix.
     * 
     * @param value
     *            the new layout matrix
     */
    public native void setLayoutMatrix(Matrix value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setLayoutMatrix(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the layout matrix.
     * 
     * @param value
     *            the value
     * @param invalidateLayout
     *            the invalidate layout
     */
    public native void setLayoutMatrix(Matrix value, boolean invalidateLayout)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setLayoutMatrix(
						value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						invalidateLayout);
    }-*/;

    /**
     * Sets the layout matrix3 d.
     * 
     * @param value
     *            the new layout matrix3 d
     */
    public native void setLayoutMatrix3D(Matrix3D value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setLayoutMatrix3D(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the layout matrix3 d.
     * 
     * @param value
     *            the value
     * @param invalidateLayout
     *            the invalidate layout
     */
    public native void setLayoutMatrix3D(Matrix3D value, boolean invalidateLayout)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setLayoutMatrix3D(
						value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						invalidateLayout);
    }-*/;

    /**
     * Sets the style.
     * 
     * @param styleProp
     *            the style prop
     * @param newValue
     *            the new value
     */
    public native void setStyle(String styleProp, Object newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setStyle(styleProp, newValue);
    }-*/;

    /**
     * Sets the style.
     * 
     * @param styleProp
     *            the style prop
     * @param newValue
     *            the new value
     */
    public void setStyle(String styleProp, ProxyObject newValue) {
        this.setStyle(styleProp, newValue.getJsObj());
    }

    /**
     * Sets the visible2.
     * 
     * @param value
     *            the new visible2
     */
    public native void setVisible2(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setVisible(value);
    }-*/;

    /**
     * Sets the visible2.
     * 
     * @param value
     *            the value
     * @param noEvent
     *            the no event
     */
    public native void setVisible2(boolean value, boolean noEvent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setVisible(value, noEvent);
    }-*/;

    /**
     * Style changed.
     * 
     * @param stypeProp
     *            the stype prop
     */
    public native void styleChanged(String stypeProp)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.styleChanged(styleProp);
    }-*/;

    /**
     * As i visual element.
     * 
     * @return the i visual element
     */
    public JavaScriptObject asIVisualElement() {
        return this.jsObj.cast();
    }

    /**
     * As i flex display object.
     * 
     * @return the i flex display object
     */
    public JavaScriptObject asIFlexDisplayObject() {
        return this.jsObj.cast();
    }

    /**
     * As iui component.
     * 
     * @return the iUI component
     */
    public JavaScriptObject asIUIComponent() {
        return this.jsObj.cast();
    }

    /**
     * As i validator listener.
     * 
     * @return the i validator listener
     */
    public JavaScriptObject asIValidatorListener() {
        return this.jsObj.cast();
    }

    /**
     * Places this component at the center of his container. The container
     * should have an absolute layout
     */
    public void setCentered() {
        this.setVerticalCenter(0);
        this.setHorizontalCenter(0);
    }

    /**
     * Stretch this component to fill his parent container. The container should
     * have an absolute layout
     */
    public void strech() {
        this.setPercentHeight(100);
        this.setPercentWidth(100);
    }

    public static UIComponent cast(ProxyObject obj) {
        return new UIComponent(obj.getJsObj());
    }

}
