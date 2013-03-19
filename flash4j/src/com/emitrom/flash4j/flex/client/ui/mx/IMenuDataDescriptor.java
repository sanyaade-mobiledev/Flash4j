/************************************************************************
 * IMenuDataDescriptor.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import com.emitrom.flash4j.flex.client.mx.collections.ICollectionView;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class IMenuDataDescriptor.
 */
public class IMenuDataDescriptor extends JavaScriptObject {

    /**
     * Instantiates a new i menu data descriptor.
     */
    protected IMenuDataDescriptor() {

    }

    /**
     * Adds the child at.
     * 
     * @param parent
     *            the parent
     * @param newObject
     *            the new object
     * @param index
     *            the index
     * @return true, if successful
     */
    public final native boolean addChildAt(JavaScriptObject parent, JavaScriptObject newObject, int index)/*-{
		return this.addChildAt(parent, newObject, index);
    }-*/;

    /**
     * Adds the child at.
     * 
     * @param parent
     *            the parent
     * @param newObject
     *            the new object
     * @param index
     *            the index
     * @param model
     *            the model
     * @return true, if successful
     */
    public final native boolean addChildAt(JavaScriptObject parent, JavaScriptObject newObject, int index,
                    JavaScriptObject model)/*-{
		return this.addChildAt(parent, newObject, index, model);
    }-*/;

    /**
     * Gets the children.
     * 
     * @param node
     *            the node
     * @return the children
     */
    public final native ICollectionView getChildren(JavaScriptObject node)/*-{
		return this.getChildren(node);
    }-*/;

    /**
     * Gets the children.
     * 
     * @param node
     *            the node
     * @param model
     *            the model
     * @return the children
     */
    public final native ICollectionView getChildren(JavaScriptObject node, JavaScriptObject model)/*-{
		return this.getChildren(node, model);
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T>
     *            the generic type
     * @param node
     *            the node
     * @return the data
     */
    public final native <T> T getData(JavaScriptObject node)/*-{
		return this.getData(node);
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T>
     *            the generic type
     * @param node
     *            the node
     * @param model
     *            the model
     * @return the data
     */
    public final native <T> T getData(JavaScriptObject node, JavaScriptObject model)/*-{
		return this.getData(node, model);
    }-*/;

    /**
     * Gets the group name.
     * 
     * @param node
     *            the node
     * @return the group name
     */
    public final native String getGroupName(JavaScriptObject node)/*-{
		return this.getGroupName(node);
    }-*/;

    /**
     * Gets the type.
     * 
     * @param node
     *            the node
     * @return the type
     */
    public final native String getType(JavaScriptObject node)/*-{
		return this.getType(node);
    }-*/;

    /**
     * Checks for children.
     * 
     * @param node
     *            the node
     * @return true, if successful
     */
    public final native boolean hasChildren(JavaScriptObject node)/*-{
		return this.hasChildren(node);
    }-*/;

    /**
     * Checks for children.
     * 
     * @param node
     *            the node
     * @param model
     *            the model
     * @return true, if successful
     */
    public final native boolean hasChildren(JavaScriptObject node, JavaScriptObject model)/*-{
		return this.hasChildren(node, model);
    }-*/;

    /**
     * Checks if is branch.
     * 
     * @param node
     *            the node
     * @return true, if is branch
     */
    public final native boolean isBranch(JavaScriptObject node)/*-{
		return this.isBranch(node);
    }-*/;

    /**
     * Checks if is branch.
     * 
     * @param node
     *            the node
     * @param model
     *            the model
     * @return true, if is branch
     */
    public final native boolean isBranch(JavaScriptObject node, JavaScriptObject model)/*-{
		return this.isBranch(node, model);
    }-*/;

    /**
     * Checks if is enabled.
     * 
     * @param node
     *            the node
     * @return true, if is enabled
     */
    public final native boolean isEnabled(JavaScriptObject node)/*-{
		return this.isEnabled(node);
    }-*/;

    /**
     * Checks if is toggled.
     * 
     * @param node
     *            the node
     * @return true, if is toggled
     */
    public final native boolean isToggled(JavaScriptObject node)/*-{
		return this.isToggled(node);
    }-*/;

    /**
     * Removes the child at.
     * 
     * @param parent
     *            the parent
     * @param newObject
     *            the new object
     * @param index
     *            the index
     * @return true, if successful
     */
    public final native boolean removeChildAt(JavaScriptObject parent, JavaScriptObject newObject, int index)/*-{
		return this.removeChildAt(parent, newObject, index);
    }-*/;

    /**
     * Removes the child at.
     * 
     * @param parent
     *            the parent
     * @param newObject
     *            the new object
     * @param index
     *            the index
     * @param model
     *            the model
     * @return true, if successful
     */
    public final native boolean removeChildAt(JavaScriptObject parent, JavaScriptObject newObject, int index,
                    JavaScriptObject model)/*-{
		return this.removeChildAt(parent, newObject, index, model);
    }-*/;

    /**
     * Sets the enabled.
     * 
     * @param node
     *            the node
     * @param value
     *            the value
     */
    public final native void setEnabled(JavaScriptObject node, boolean value)/*-{
		this.setEnabled(node, value);
    }-*/;

    /**
     * Sets the toggled.
     * 
     * @param node
     *            the node
     * @param value
     *            the value
     */
    public final native void setToggled(JavaScriptObject node, boolean value)/*-{
		this.setToggled(node, value);
    }-*/;

}
