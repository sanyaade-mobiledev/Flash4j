/************************************************************************
 * Container.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.ui.mx;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.display.Graphics;
import com.emitrom.flash4j.core.client.display.Sprite;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.flex.client.mx.core.ContainerCreationPolicy;
import com.emitrom.flash4j.flex.client.mx.core.Displayable;
import com.emitrom.flash4j.flex.client.mx.core.EdgeMetrics;
import com.emitrom.flash4j.flex.client.mx.core.IFlexDisplayObject;
import com.emitrom.flash4j.flex.client.mx.core.INavigatorContent;
import com.emitrom.flash4j.flex.client.mx.core.IVisualElement;
import com.emitrom.flash4j.flex.client.mx.core.ScrollPolicy;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.ui.interfaces.HasUIElements;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The Container class is an abstract base class for components that controls
 * the layout characteristics of child components. You do not create an instance
 * of Container in an application. Instead, you create an instance of one of
 * Container's subclasses, such as Canvas or HBox.
 * <p>
 * The Container class contains the logic for scrolling, clipping, and dynamic
 * instantiation. It contains methods for adding and removing children. It also
 * contains the getChildAt() method, and the logic for drawing the background
 * and borders of containers.
 */
public class Container extends UIComponent implements INavigatorContent, HasUIElements {

    /**
     * Instantiates a new container.
     */
    Container(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the container
     */
    public Container() {
        jsObj = Bridge.createObject("mx.core.Container");
    }

    /**
     * Sets the auto layout.
     * 
     * @param value
     *            the new auto layout
     */
    public native void setAutoLayout(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoLayout(value);
    }-*/;

    /**
     * Checks if is auto layout.
     * 
     * @return true, if is auto layout
     */
    public native boolean isAutoLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautolayout();
    }-*/;

    /**
     * Gets the border metrics.
     * 
     * @return the border metrics
     */
    public native EdgeMetrics getBorderMetrics()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getborderMetrics();
		return @com.emitrom.flash4j.flex.client.mx.core.EdgeMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Clip content.
     * 
     * @return true, if successful
     */
    public native boolean clipContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclipContent();
    }-*/;

    /**
     * Sets the clip content.
     * 
     * @param value
     *            the new clip content
     */
    public native void setClipContent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setclipContent(value);
    }-*/;

    /**
     * Creating content pane.
     * 
     * @return true, if successful
     */
    public native boolean creatingContentPane()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcreatingContentPane();
    }-*/;

    /**
     * Gets the creation policy.
     * 
     * @return the creation policy
     */
    public ContainerCreationPolicy getCreationPolicy() {
        return ContainerCreationPolicy.fromValue(_getCreationPolicy());
    }

    /**
     * _get creation policy.
     * 
     * @return the string
     */
    private native String _getCreationPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcreationPolicy();
    }-*/;

    /**
     * Sets the creation policy.
     * 
     * @param policy
     *            the new creation policy
     */
    public void setCreationPolicy(ContainerCreationPolicy policy) {
        _setCreationPolicy(policy.value);
    }

    /**
     * _set creation policy.
     * 
     * @param value
     *            the value
     */
    private native void _setCreationPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setcreationPolicy(value);
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T>
     *            the generic type
     * @return the data
     */
    public native <T> T getData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value
     *            the new data
     */
    public native void setData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    /**
     * Deferred content created.
     * 
     * @return true, if successful
     */
    public native boolean deferredContentCreated()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdeferredContentCreated();
    }-*/;

    /**
     * Gets the horizontal line scroll size.
     * 
     * @return the horizontal line scroll size
     */
    public native double getHorizontalLineScrollSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalLineScrollSize();
    }-*/;

    /**
     * Sets the horizontal line scroll size.
     * 
     * @param value
     *            the new horizontal line scroll size
     */
    public native void setHorizontalLineScrollSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalLineScrollSize(value);
    }-*/;

    /**
     * Gets the horizontal page scroll size.
     * 
     * @return the horizontal page scroll size
     */
    public native double getHorizontalPageScrollSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalPageScrollSize();
    }-*/;

    /**
     * Sets the horizontal page scroll size.
     * 
     * @param value
     *            the new horizontal page scroll size
     */
    public native void setHorizontalPageScrollSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalPageScrollSize(value);
    }-*/;

    /**
     * Gets the horizontal scroll bar.
     * 
     * @return the horizontal scroll bar
     */
    public native ScrollBar getHorizontalScrollBar()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gethorizontalScrollBar();
		return @com.emitrom.flash4j.flex.client.ui.mx.ScrollBar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the horizontal scroll bar.
     * 
     * @param value
     *            the new horizontal scroll bar
     */
    public native void setHorizontalScrollBar(ScrollBar value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.sethorizontalScrollBar(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the icon.
     * 
     * @param <T>
     *            the generic type
     * @return the icon
     */
    public native <T> T getIcon()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geticon();
    }-*/;

    /**
     * Sets the icon.
     * 
     * @param value
     *            the new icon
     */
    public native void setIcon(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seticon(value);
    }-*/;

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public native String getLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabel();
    }-*/;

    /**
     * Sets the label.
     * 
     * @param value
     *            the new label
     */
    public native void setLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabel(value);
    }-*/;

    /**
     * Gets the horizontal scroll policy.
     * 
     * @return the horizontal scroll policy
     */
    public ScrollPolicy getHorizontalScrollPolicy() {
        return ScrollPolicy.fromValue(_getHorizontalScrollPolicy());
    }

    /**
     * _get horizontal scroll policy.
     * 
     * @return the string
     */
    private native String _getHorizontalScrollPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethorizontalScrollPolicy();
    }-*/;

    /**
     * Sets the horizontal scroll policy.
     * 
     * @param policy
     *            the new horizontal scroll policy
     */
    public void setHorizontalScrollPolicy(ScrollPolicy policy) {
        _setHorizontalScrollPolicy(policy.value);
    }

    /**
     * _set horizontal scroll policy.
     * 
     * @param value
     *            the value
     */
    private native void _setHorizontalScrollPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethorizontalScrollPolicy(value);
    }-*/;

    /**
     * Gets the max horizontal scroll position.
     * 
     * @return the max horizontal scroll position
     */
    public native double getMaxHorizontalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxHorizontalScrollPosition();
    }-*/;

    /**
     * Gets the max vertical scroll position.
     * 
     * @return the max vertical scroll position
     */
    public native double getMaxVerticalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxVerticalScrollPosition();
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
     * Gets the vertical line scroll size.
     * 
     * @return the vertical line scroll size
     */
    public native double getVerticalLineScrollSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalLineScrollSize();
    }-*/;

    /**
     * Sets the vertical line scroll size.
     * 
     * @param value
     *            the new vertical line scroll size
     */
    public native void setVerticalLineScrollSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalLineScrollSize(value);
    }-*/;

    /**
     * Gets the vertical page scroll size.
     * 
     * @return the vertical page scroll size
     */
    public native double getVerticalPageScrollSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalPageScrollSize();
    }-*/;

    /**
     * Sets the vertical page scroll size.
     * 
     * @param value
     *            the new vertical page scroll size
     */
    public native void setVerticalPageScrollSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalPageScrollSize(value);
    }-*/;

    /**
     * Gets the vertical scroll bar.
     * 
     * @return the vertical scroll bar
     */
    public native ScrollBar getVerticalScrollBar()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getverticalScrollBar();
		return @com.emitrom.flash4j.flex.client.ui.mx.ScrollBar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the vertical scroll bar.
     * 
     * @param value
     *            the new vertical scroll bar
     */
    public native void setVerticalScrollBar(ScrollBar value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.setverticalScrollBar(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the vertical scroll policy.
     * 
     * @return the vertical scroll policy
     */
    public ScrollPolicy getVerticalScrollPolicy() {
        return ScrollPolicy.fromValue(_getVerticalScrollPolicy());
    }

    /**
     * _get vertical scroll policy.
     * 
     * @return the string
     */
    private native String _getVerticalScrollPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getverticalScrollPolicy();
    }-*/;

    /**
     * Sets the vertical scroll policy.
     * 
     * @param policy
     *            the new vertical scroll policy
     */
    public void setVerticalScrollPolicy(ScrollPolicy policy) {
        _setVerticalScrollPolicy(policy.value);
    }

    /**
     * _set vertical scroll policy.
     * 
     * @param value
     *            the value
     */
    private native void _setVerticalScrollPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalScrollPolicy(value);
    }-*/;

    /**
     * Gets the view metrics and padding.
     * 
     * @return the view metrics and padding
     */
    public native EdgeMetrics getViewMetricsAndPadding()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getviewMetricsAndPadding();
		return @com.emitrom.flash4j.flex.client.mx.core.EdgeMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Adds the element.
     * 
     * @param element
     *            the element
     */
    public void addElement(UIComponent element) {
        _addElement(element.asIVisualElement());
    }

    /**
     * Add a child element to this container
     * 
     * @param element
     *            , the element to add
     */
    public void addElement(Displayable element) {
        addElement(element.asUIComponent());
    }

    /**
     * Adds the element.
     * 
     * @param element
     *            the element
     * @return the i visual element
     */
    private native void _addElement(JavaScriptObject element)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addElement(element);
    }-*/;

    /**
     * Adds the element at.
     * 
     * @param element
     *            the element
     * @param index
     *            the index
     * @return the i visual element
     */
    public void addElementAt(IVisualElement element, int index) {
        _addElementAt(element.asIVisualElement(), index);
    }

    /**
     * Adds the element at.
     * 
     * @param element
     *            the element
     * @param index
     *            the index
     * @return the i visual element
     */
    private native void _addElementAt(JavaScriptObject element, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addElementAt(element, index);
    }-*/;

    /**
     * Creates the deferred content.
     */
    public native void createDeferredContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.createDeferredContent();
    }-*/;

    /**
     * Execute child bindings.
     */
    public native void executeChildBindings()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.executeChildBindings();
    }-*/;

    /**
     * Execute child bindings.
     * 
     * @param recurse
     *            the recurse
     */
    public native void executeChildBindings(boolean recurse)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.executeChildBindings(recurse);
    }-*/;

    /**
     * Gets the children.
     * 
     * @return the children
     */
    public List<UIComponent> getChildren() {
        List<UIComponent> toReturn = new ArrayList<UIComponent>();
        JavaScriptObject children = _getChildren();
        int length = JsoHelper.getAs3ArrayLength(children);
        for (int i = 0; i < length; i++) {
            toReturn.add(new UIComponent(JsoHelper.getValueFromJavaScriptObjectArray(children, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getChildren()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getChildren();
    }-*/;

    /**
     * Gets the element at.
     * 
     * @param index
     *            the index
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
     * @param element
     *            the element
     * @return the element index
     */
    private native int getElementIndex(JavaScriptObject element)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getElementIndex(element);
    }-*/;

    /**
     * Gets the element index.
     * 
     * @param element
     *            the element
     * @return the element index
     */
    public int getElementIndex(IVisualElement element) {
        return getElementIndex(element.asIVisualElement());
    }

    /**
     * Removes the all children.
     */
    public native void removeAllChildren()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeAllChildren();
    }-*/;

    /**
     * Removes the all elements.
     */
    public native void removeAllElements()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeAllElements();
    }-*/;

    /**
     * Removes the element.
     * 
     * @param element
     *            the element
     * @return the i visual element
     */
    public void removeElement(IVisualElement element) {
        _removeElement(element.asIVisualElement());
    }

    public void removeElement(UIComponent element) {
        _removeElement(element.asIVisualElement());
    }

    /**
     * Removes the element.
     * 
     * @param element
     *            the element
     * @return the i visual element
     */
    private native void _removeElement(JavaScriptObject element)/*-{
		peer.removeElement(element);
    }-*/;

    /**
     * Removes the element at.
     * 
     * @param index
     *            the index
     * @return the i visual element
     */
    public native void removeElementAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		per.removellElementAt(index);
    }-*/;

    /**
     * Sets the element index.
     * 
     * @param element
     *            the element
     * @param index
     *            the index
     */
    public void setElementIndex(IVisualElement element, int index) {
        _setElementIndex(element.asIVisualElement(), index);
    }

    /**
     * Sets the element index.
     * 
     * @param element
     *            the element
     * @param index
     *            the index
     */
    private native void _setElementIndex(JavaScriptObject element, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setElementIndex(element, index);
    }-*/;

    /**
     * Swap elements.
     * 
     * @param element1
     *            the element1
     * @param element2
     *            the element2
     */
    public void swapElements(IVisualElement element1, IVisualElement element2) {
        _swapElements(element1.asIVisualElement(), element2.asIVisualElement());
    }

    /**
     * Swap elements.
     * 
     * @param element1
     *            the element1
     * @param element2
     *            the element2
     */
    private native void _swapElements(JavaScriptObject element1, JavaScriptObject element2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.swapElements(element1, element2);
    }-*/;

    /**
     * Swap elements at.
     * 
     * @param index1
     *            the index1
     * @param index2
     *            the index2
     */
    public native void swapElementsAt(int index1, int index2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.swapElementsAt(index1, index2);
    }-*/;

    /**
     * Checks if is button mode.
     * 
     * @return true, if is button mode
     */
    public native boolean isButtonMode()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getButtonMode();
    }-*/;

    /**
     * Sets the button mode.
     * 
     * @param value
     *            the new button mode
     */
    public native void setButtonMode(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setButtonMode(value);
    }-*/;

    /**
     * Checks if is creating content pane.
     * 
     * @return true, if is creating content pane
     */
    public native boolean isCreatingContentPane()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geCreatingContentPane();
    }-*/;

    /**
     * Sets the creating content pane.
     * 
     * @param value
     *            the new creating content pane
     */
    public native void setCreatingContentPane(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setCreatingContentPane(value);
    }-*/;

    /**
     * Sets the default button.
     * 
     * @param value
     *            the new default button
     */
    public native void setDefaultButton(IFlexDisplayObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setDefaultButton(value.@com.emitrom.flash4j.flex.client.mx.core.IFlexDisplayObject::asIFlexDisplayObject()());
    }-*/;

    /**
     * Gets the drop target.
     * 
     * @return the drop target
     */
    public native DisplayObject getDropTarget()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getDropTraget();
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the focus rect.
     * 
     * @param <T>
     *            the generic type
     * @return the focus rect
     */
    public native <T> T getFocusRect() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getFocusRect();
    }-*/;

    /**
     * Sets the focus rect.
     * 
     * @param focus
     *            the new focus rect
     */
    public native void setFocusRect(Object focus) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setFocusRect(focus);
    }-*/;

    /**
     * Gets the graphics.
     * 
     * @return the graphics
     */
    public native Graphics getGraphics() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getGraphics();
		return @com.emitrom.flash4j.core.client.display.Graphics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the hit area.
     * 
     * @param area
     *            the new hit area
     */
    public native void setHitArea(Sprite area) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setHitArea(area.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the hit area.
     * 
     * @return the hit area
     */
    public native Sprite getHitArea() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getHitArea();
		return @com.emitrom.flash4j.core.client.display.Sprite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the horizontal scroll position.
     * 
     * @return the horizontal scroll position
     */
    public native double getHorizontalScrollPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getHorizontalScrollPosition();
    }-*/;

    /**
     * Sets the horizontal scroll position.
     * 
     * @param value
     *            the new horizontal scroll position
     */
    public native void setHorizontalScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setHorizontalScrollPosition(value);
    }-*/;

    /**
     * Checks for mouse children.
     * 
     * @return true, if successful
     */
    public native boolean hasMouseChildren() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMouseChildren();
    }-*/;

    /**
     * Sets the mouse children.
     * 
     * @param value
     *            the new mouse children
     */
    public native void setMouseChildren(boolean value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setMouseChildren(value);
    }-*/;

    /**
     * Checks if is mouse enabled.
     * 
     * @return true, if is mouse enabled
     */
    public native boolean isMouseEnabled() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getMouseEnabled();
    }-*/;

    /**
     * Sets the mouse enabled.
     * 
     * @param enable
     *            the new mouse enabled
     */
    public native void setMouseEnabled(boolean enable) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setMouseEnabled(enable);
    }-*/;

    /**
     * Gets the num children.
     * 
     * @return the num children
     */
    public native int getNumChildren() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumChildren();
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
     * @param value
     *            the new vertical scroll position
     */
    public native void setVerticalScrollPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setverticalScrollPosition(value);
    }-*/;

    /**
     * Gets the view metrics.
     * 
     * @return the view metrics
     */
    public native EdgeMetrics getViewMetrics()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getviewMetrics();
		return @com.emitrom.flash4j.flex.client.mx.core.EdgeMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Adds the child.
     * 
     * @param child
     *            the child
     * @return the display object
     */
    public native DisplayObject addChild(DisplayObject child) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.addChild(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Adds the child at.
     * 
     * @param child
     *            the child
     * @param index
     *            the index
     * @return the display object
     */
    public native DisplayObject addChildAt(DisplayObject child, int index) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.addChildAt(
						child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						index);
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Are inaccessible objects under point.
     * 
     * @param point
     *            the point
     * @return true, if successful
     */
    public native boolean areInaccessibleObjectsUnderPoint(Point point) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.areInaccessibleObjectsUnderPoint(point.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Contains.
     * 
     * @param chlid
     *            the chlid
     * @return true, if successful
     */
    public native boolean contains(DisplayObject chlid) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.contains(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the child at.
     * 
     * @param index
     *            the index
     * @return the child at
     */
    public native DisplayObject getChildAt(int index) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildAt(index);
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the child by name.
     * 
     * @param name
     *            the name
     * @return the child by name
     */
    public native DisplayObject getChildByName(String name) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildByName(name);
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the child index.
     * 
     * @param child
     *            the child
     * @return the child index
     */
    public native int getChildIndex(DisplayObject child) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getChildIndex(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the objects under point.
     * 
     * @param point
     *            the point
     * @return the objects under point
     */
    public native JsArray<JavaScriptObject> getObjectsUnderPoint(Point point) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getObjectsUnderPoint(point.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Removes the child.
     * 
     * @param child
     *            the child
     * @return the display object
     */
    public native DisplayObject removeChild(DisplayObject child) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.removeChild(child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Removes the child at.
     * 
     * @param index
     *            the index
     * @return the display object
     */
    public native DisplayObject removeChildAt(int index) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.removeChildAt(index);
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the child index.
     * 
     * @param child
     *            the child
     * @param index
     *            the index
     */
    public native void setChildIndex(DisplayObject child, int index) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setChildIndex(
						child.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						index);
    }-*/;

    /**
     * Start drag.
     */
    public native void startDrag() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.startDrag();
    }-*/;

    /**
     * Start drag.
     * 
     * @param lockCenter
     *            the lock center
     */
    public native void startDrag(boolean lockCenter) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.startDrag(lockCenter);
    }-*/;

    /**
     * Start drag.
     * 
     * @param lockCenter
     *            the lock center
     * @param bounds
     *            the bounds
     */
    public native void startDrag(boolean lockCenter, Rectangle bounds) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.startDrag(
						lockCenter,
						bounds.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Stop drag.
     */
    public native void stopDrag() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stopDrag();
    }-*/;

    /**
     * Swap children.
     * 
     * @param child1
     *            the child1
     * @param child2
     *            the child2
     */
    public native void swapChildren(DisplayObject child1, DisplayObject child2) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.swapChildren(
						child1.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						child2.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Swap children at.
     * 
     * @param index1
     *            the index1
     * @param index2
     *            the index2
     */
    public native void swapChildrenAt(int index1, int index2) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.swapChildrenAt(index1, index2);
    }-*/;

    @Override
    public JavaScriptObject asINavigatorContent() {
        return jsObj.cast();
    }

    public static Container cast(ProxyObject target) {
        return new Container(target.getJsObj());
    }

}
