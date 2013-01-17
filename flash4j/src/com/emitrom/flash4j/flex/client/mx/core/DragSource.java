/************************************************************************
  DragSource.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class DragSource.
 */
public class DragSource extends ProxyObject {

    /**
     * Instantiates a new drag source.
     */
    DragSource(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the drag source
     */
    public DragSource() {
        jsObj = Bridge.createObject("mx.core.DragSource");
    }

    /**
     * Gets the formats.
     * 
     * @return the formats
     */
    public final native JsArrayString getFormats()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getFormats();
    }-*/;

    /**
     * Adds the data.
     * 
     * @param data the data
     * @param format the format
     */
    public final native void addData(Object data, String format)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.addData(data, format);
    }-*/;

    // TODO implements addHandler()
    /**
     * Data format.
     * 
     * @param <T> the generic type
     * @param format the format
     * @return the t
     */
    public final native <T> T dataFormat(String format)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.dataFormat(format);
    }-*/;

    /**
     * Checks for format.
     * 
     * @param format the format
     * @return true, if successful
     */
    public final native boolean hasFormat(String format)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.hasFormat(format);
    }-*/;
}
