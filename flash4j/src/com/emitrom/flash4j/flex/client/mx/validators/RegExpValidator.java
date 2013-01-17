/************************************************************************
  RegExpValidator.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.validators;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class RegExpValidator.
 */
public class RegExpValidator extends Validator {

    private static RegExpValidator INSTANCE = new RegExpValidator(Bridge.createObject("mx.validators.RegExpValidator"));

    /**
     * Instantiates a new reg exp validator.
     */
    protected RegExpValidator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the reg exp validator
     */
    public RegExpValidator() {
        jsObj = Bridge.createObject("mx.validators.RegExpValidator");
    }

    /**
     * Gets the expression.
     * 
     * @return the expression
     */
    public native String getExpression()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getexpression();
    }-*/;

    /**
     * Sets the expression.
     * 
     * @param value the new expression
     */
    public native void setExpression(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setexpression(value);
    }-*/;

    /**
     * Gets the flags.
     * 
     * @return the flags
     */
    public native String getFlags()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getflags();
    }-*/;

    /**
     * Sets the flags.
     * 
     * @param value the new flags
     */
    public native void setFlags(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setflags(value);
    }-*/;

    /**
     * Gets the no expression error.
     * 
     * @return the no expression error
     */
    public native String getNoExpressionError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnoExpressionError();
    }-*/;

    /**
     * Sets the no expression error.
     * 
     * @param value the new no expression error
     */
    public native void setNoExpressionError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnoExpressionError(value);
    }-*/;

    /**
     * Gets the no match error.
     * 
     * @return the no match error
     */
    public native String getNoMatchError()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnoMatchError();
    }-*/;

    /**
     * Sets the no match error.
     * 
     * @param value the new no match error
     */
    public native void setNoMatchError(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnoMatchError(value);
    }-*/;

}
