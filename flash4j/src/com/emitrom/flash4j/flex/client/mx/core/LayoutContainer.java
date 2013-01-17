/************************************************************************
  LayoutContainer.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.core;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Flex defines a default, or Application, container that lets you start adding
 * content to your module or Application without explicitly defining another
 * container. Flex creates peer container from the <mx:Application> tag, the
 * first tag in an MXML application file, or from the <mx:Module> tag, the first
 * tag in an MXML module file. While you might find it convenient to use the
 * Application or Module container as the only container in your application, in
 * most cases you explicitly define at least one more container before you add
 * any controls to your application or module.
 */
public class LayoutContainer extends Container {

    /**
     * Instantiates a new layout container.
     */
    LayoutContainer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the layout container
     */
    public LayoutContainer() {
        jsObj = Bridge.createObject("mx.core.LayoutContainer");
    }

    /**
     * Sets the constraint columns.
     * 
     * @param columns the new constraint columns
     */
    public void setConstraintColumns(ArrayCollection columns) {
        _setConstraintColumns(columns.toArray().getJsObj());
    }

    /**
     * Sets the constraint columns.
     * 
     * @param columns the new constraint columns
     */
    private native void _setConstraintColumns(JavaScriptObject columns)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setconstraintColumns(colums);
    }-*/;

    /**
     * Gets the constraint columns.
     * 
     * @param <T> the generic type
     * @return the constraint columns
     */
    public native <T> T getConstraintColumns()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getconstraintColumns();
    }-*/;

    /**
     * Sets the constraint rows.
     * 
     * @param columns the new constraint rows
     */
    public void setConstraintRows(ArrayCollection columns) {
        _setConstraintRows(columns.toArray().getJsObj());
    }

    /**
     * Sets the constraint rows.
     * 
     * @param columns the new constraint rows
     */
    private native void _setConstraintRows(JavaScriptObject columns)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setconstraintRows(colums);
    }-*/;

    /**
     * Sets the layout.
     * 
     * @param value the new layout
     */
    public native void setLayout(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlayout(value);
    }-*/;

    /**
     * Gets the layout.
     * 
     * @return the layout
     */
    public native String getLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlayout();
    }-*/;

}
