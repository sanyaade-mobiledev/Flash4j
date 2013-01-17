/************************************************************************
  Group.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.components;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.IVisualElement;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.spark.core.SpriteVisualElement;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Group.
 */
public class Group extends GroupBase {

    /**
     * Instantiates a new group.
     */
    Group(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the group
     */
    public Group() {
        jsObj = Bridge.createObject("spark.components.Group");
    }

    /**
     * Gets the scale grid bottom.
     * 
     * @return the scale grid bottom
     */
    public native double getScaleGridBottom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleGridBottom();
    }-*/;

    /**
     * Sets the scale grid bottom.
     * 
     * @param value the new scale grid bottom
     */
    public native void setScaleGridBottom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleGridBottom(value);
    }-*/;

    /**
     * Gets the scale grid left.
     * 
     * @return the scale grid left
     */
    public native double getScaleGridLeft()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleGridLeft();
    }-*/;

    /**
     * Sets the scale grid left.
     * 
     * @param value the new scale grid left
     */
    public native void setScaleGridLeft(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleGridLeft(value);
    }-*/;

    /**
     * Gets the scale grid right.
     * 
     * @return the scale grid right
     */
    public native double getScaleGridRight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleGridRight();
    }-*/;

    /**
     * Sets the scale grid right.
     * 
     * @param value the new scale grid right
     */
    public native void setScaleGridRight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleGridRight(value);
    }-*/;

    /**
     * Gets the scale grid top.
     * 
     * @return the scale grid top
     */
    public native double getScaleGridTop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleGridTop();
    }-*/;

    /**
     * Sets the scale grid top.
     * 
     * @param value the new scale grid top
     */
    public native void setScaleGridTop(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleGridTop(value);
    }-*/;

    /**
     * Adds the element.
     * 
     * @param element the element
     * @return the i visual element
     */
    public void addElement(SpriteVisualElement element) {
        _addElement(element.asIVisualElement());
    }

    /**
     * Adds the element.
     * 
     * @param element the element
     * @return the i visual element
     */
    public void addElement(UIComponent element) {
        _addElement(element.asIVisualElement());
    }

    /**
     * Adds the element.
     * 
     * @param element the element
     * @return the i visual element
     */
    private native void _addElement(JavaScriptObject element)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addElement(element);
    }-*/;

    /**
     * Adds the element at.
     * 
     * @param element the element
     * @param index the index
     * @return the i visual element
     */
    public void addElementAt(SpriteVisualElement element, int index) {
        _addElementAt(element.asIVisualElement(), index);
    }

    /**
     * Adds the element.
     * 
     * @param element the element
     * @param index the index
     * @return the i visual element
     */
    public void addElement(UIComponent element, int index) {
        _addElementAt(element.asIVisualElement(), index);
    }

    /**
     * Adds the element at.
     * 
     * @param element the element
     * @param index the index
     * @return the i visual element
     */
    private native void _addElementAt(JavaScriptObject element, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addElementAt(element, index);
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
     * @param element the element
     * @return the i visual element
     */
    public UIComponent removeElement(SpriteVisualElement element) {
        return _removeElement(element.asIVisualElement());
    }

    /**
     * Removes the element.
     * 
     * @param element the element
     * @return the i visual element
     */
    public IVisualElement removeElement(IVisualElement element) {
        return _removeElement(element.asIVisualElement());
    }

    /**
     * Removes the element.
     * 
     * @param element the element
     * @return the i visual element
     */
    public native UIComponent _removeElement(JavaScriptObject element)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.removeElement(element);
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Removes the element at.
     * 
     * @param element the element
     * @param index the index
     * @return the i visual element
     */
    public UIComponent removeElementAt(SpriteVisualElement element, int index) {
        return _removeElementAt(element.asIVisualElement(), index);
    }

    /**
     * Removes the element at.
     * 
     * @param element the element
     * @param index the index
     * @return the i visual element
     */
    public UIComponent removeElementAt(UIComponent element, int index) {
        return _removeElementAt(element.asIVisualElement(), index);
    }

    /**
     * Removes the element at.
     * 
     * @param element the element
     * @param index the index
     * @return the i visual element
     */
    public native UIComponent _removeElementAt(JavaScriptObject element, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.removeElementAt(element, index);
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the element index.
     * 
     * @param element the element
     * @param index the index
     */
    public void setElementIndex(UIComponent element, int index) {
        _setElementIndex(element.asIVisualElement(), index);
    }

    /**
     * Sets the element index.
     * 
     * @param element the element
     * @param index the index
     */
    private native void _setElementIndex(JavaScriptObject element, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setElementIndex(element, index);
    }-*/;

    /**
     * Swap elements.
     * 
     * @param element1 the element1
     * @param element2 the element2
     */
    public void swapElements(UIComponent element1, UIComponent element2) {
        _swapElements(element1.asIVisualElement(), element2.asIVisualElement());
    }

    /**
     * Swap elements.
     * 
     * @param element1 the element1
     * @param element2 the element2
     */
    private native void _swapElements(JavaScriptObject element1, JavaScriptObject element2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.swapElements(element1, element2);
    }-*/;

    /**
     * Swap elements at.
     * 
     * @param index1 the index1
     * @param index2 the index2
     */
    public native void swapElementsAt(int index1, int index2)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.swapElementsAt(index1, index2);
    }-*/;

}
