/************************************************************************
  Cell.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.excel.client;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Cell.
 */
public class Cell extends ProxyObject {

    Cell(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the cell
     */
    public Cell() {
        jsObj = Bridge.createObject("com.as3xls.xls.Cell");
    }

    /**
     * Gets the value.
     * 
     * @param <T> the generic type
     * @return the value
     */
    public native <T> T getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getValue();
    }-*/;

    /**
     * Sets the value.
     * 
     * @param newValue the new value
     */
    public native void setValue(Object newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setValue(newValue);
    }-*/;

    /**
     * Gets the note.
     * 
     * @return the note
     */
    public native String getNote()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getNote();
    }-*/;

    /**
     * Sets the note.
     * 
     * @param newValue the new note
     */
    public native void setNote(String newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setNote(newValue);
    }-*/;

    /**
     * Gets the format.
     * 
     * @return the format
     */
    public native String getFormat()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getFormat();
    }-*/;

    /**
     * Sets the format.
     * 
     * @param newValue the new format
     */
    public native void setFormat(String newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setFormat(newValue);
    }-*/;

    /**
     * Gets the shared tokens.
     * 
     * @return the shared tokens
     */
    public native ByteArray getSharedTokens()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getSharedTokens();
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the shared tokens.
     * 
     * @param newValue the new shared tokens
     */
    public native void setSharedTokens(ByteArray newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setSharedTokens(newValue.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
