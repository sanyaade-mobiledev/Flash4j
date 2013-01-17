/************************************************************************
 * SkinnableContainer.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.spark.components;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.Displayable;
import com.emitrom.flash4j.flex.client.mx.core.IVisualElement;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.spark.components.supportClasses.SkinnableContainerBase;
import com.emitrom.flash4j.flex.client.spark.core.SpriteVisualElement;
import com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SkinnableContainer.
 */
public class SkinnableContainer extends SkinnableContainerBase {

    /**
     * Instantiates a new skinnable container.
     */
    SkinnableContainer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the skinnable container
     */
    public SkinnableContainer() {
        jsObj = Bridge.createObject("spark.components.SkinnableContainer");
    }

    /**
     * Auto layout.
     * 
     * @return true, if successful
     */
    public native boolean autoLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoLayout();
    }-*/;

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
     * Gets the creation policy.
     * 
     * @return the creation policy
     */
    public native String getCreationPolicy()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcreationPolicy();
    }-*/;

    /**
     * Sets the creation policy.
     * 
     * @param value
     *            the new creation policy
     */
    public native void setCreationPolicy(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcreationPolicy(value);
    }-*/;

    /**
     * Checks if is deferred content created.
     * 
     * @return true, if is deferred content created
     */
    public native boolean isDeferredContentCreated()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdeferredContentCreated();
    }-*/;

    /**
     * Gets the layout.
     * 
     * @return the layout
     */
    public native LayoutBase getLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getlayout();
		return @com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the layout.
     * 
     * @param value
     *            the new layout
     */
    public native void setLayout(LayoutBase value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setlayout(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
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
     * Adds the element.
     * 
     * @param element
     *            the element
     * @return the i visual element
     */
    public void addElement(SpriteVisualElement element) {
        _addElement(element.asIVisualElement());
    }

    /**
     * Adds the element.
     * 
     * @param element
     *            the element
     * @return the i visual element
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
    public void addElementAt(SpriteVisualElement element, int index) {
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
    public void addElementAt(UIComponent element, int index) {
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
    private native UIComponent _getElementIndex(JavaScriptObject element)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getElementIndex(element);
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the element index.
     * 
     * @param element
     *            the element
     * @return the element index
     */
    public UIComponent getElementIndex(UIComponent element) {
        return _getElementIndex(element.asIVisualElement());
    }

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
    public UIComponent removeElement(UIComponent element) {
        return _removeElement(element.asIVisualElement());
    }

    /**
     * Removes the element.
     * 
     * @param element
     *            the element
     * @return the i visual element
     */
    private native UIComponent _removeElement(JavaScriptObject element)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.removeElement(element);
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Removes the element at.
     * 
     * @param index
     *            the index
     * @return the i visual element
     */
    public native UIComponent removeElementAt(int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.removellElementAt(index);
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the element index.
     * 
     * @param element
     *            the element
     * @param index
     *            the index
     */
    public native void setElementIndex(IVisualElement element, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setElementIndex(
						element.@com.emitrom.flash4j.flex.client.mx.core.IVisualElement::asIVisualElement()(),
						index);
    }-*/;

    /**
     * Swap elements.
     * 
     * @param element1
     *            the element1
     * @param element2
     *            the element2
     */
    public void swapElements(UIComponent element1, UIComponent element2) {
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
}
