/************************************************************************
  ValidationResult.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ValidationResult.
 */
public class ValidationResult extends ProxyObject {

    /**
     * Instantiates a new validation result.
     */
    public ValidationResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the error code.
     * 
     * @return the error code
     */
    public final native String getErrorCode()/*-{
		return this.geterrorCode();
    }-*/;

    /**
     * Gets the error messsage.
     * 
     * @return the error messsage
     */
    public final native String getErrorMesssage()/*-{
		return this.geterrorMesssage();
    }-*/;

    /**
     * Checks if is error.
     * 
     * @return true, if is error
     */
    public final native boolean isError()/*-{
		return this.getisError();
    }-*/;

    /**
     * Gets the sub field.
     * 
     * @return the sub field
     */
    public final native String getSubField()/*-{
		return this.getsubField();
    }-*/;
}
