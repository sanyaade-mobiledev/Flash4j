/************************************************************************
  Formatter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.formatters;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Formatter.
 */
public class Formatter extends ProxyObject {

    private static final Formatter INSTANCE = new Formatter();

    /**
     * Instantiates a new formatter.
     */
    protected Formatter(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the formatter
     */
    public Formatter() {
        jsObj = Bridge.createObject("mx.formatters.Formatter");
    }

    /**
     * Gets the default invalid format error.
     * 
     * @return the default invalid format error
     */
    public static String getDefaultInvalidFormatError() {
        return INSTANCE._getDefaultInvalidFormatError();
    }

    /**
     * _get default invalid format error.
     * 
     * @return the string
     */
    private final native String _getDefaultInvalidFormatError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdefaultInvalidFormatError();
    }-*/;

    /**
     * Sets the default invalid format error.
     * 
     * @param value the new default invalid format error
     */
    public static void setDefaultInvalidFormatError(String value) {
        INSTANCE._setDefaultInvalidFormatError(value);
    }

    /**
     * _set default invalid format error.
     * 
     * @param value the value
     */
    private final native void _setDefaultInvalidFormatError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdefaultInvalidFormatError(value);
    }-*/;

    /**
     * Gets the default invalid value error.
     * 
     * @return the default invalid value error
     */
    public static String getDefaultInvalidValueError() {
        return INSTANCE._getDefaultInvalidValueError();
    }

    /**
     * _get default invalid value error.
     * 
     * @return the string
     */
    private final native String _getDefaultInvalidValueError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdefaultInvalidValueError();
    }-*/;

    /**
     * Sets the default invalid value error.
     * 
     * @param value the new default invalid value error
     */
    public static void setDefaultInvalidValueError(String value) {
        INSTANCE._setDefaultInvalidValueError(value);
    }

    /**
     * _set default invalid value error.
     * 
     * @param value the value
     */
    private final native void _setDefaultInvalidValueError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdefaultInvalidValueError(value);
    }-*/;

    /**
     * Format.
     * 
     * @param value the value
     * @return the string
     */
    public final native String format(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.format(value);
    }-*/;

}
