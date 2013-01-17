/************************************************************************
  RegExpValidationResult.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class RegExpValidationResult.
 */
public class RegExpValidationResult extends ValidationResult {

    /**
     * Instantiates a new reg exp validation result.
     */
    protected RegExpValidationResult(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Gets the matched index.
     * 
     * @return the matched index
     */
    public final native int getMatchedIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmatchedIndex();
    }-*/;

    /**
     * Gets the matched string.
     * 
     * @return the matched string
     */
    public final native String getMatchedString()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmatchedString();
    }-*/;

    /**
     * Gets the matched substrings.
     * 
     * @return the matched substrings
     */
    public final native JsArrayString getMatchedSubstrings()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmatchedSubstrings();
    }-*/;

}
