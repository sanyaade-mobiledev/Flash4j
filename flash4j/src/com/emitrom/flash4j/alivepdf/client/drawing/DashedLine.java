/************************************************************************
  DashedLine.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.drawing;

import java.util.ArrayList;

import com.emitrom.flash4j.alivepdf.client.core.AlivePdfFactory;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class DashedLine.
 */
public class DashedLine extends ProxyObject {

    /**
     * Instantiates a new dashed line.
     */
    DashedLine(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param pDashedPattern the dashed pattern
     * @return the dashed line
     */
    public DashedLine(ArrayList<String> pattern) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : pattern) {
            values.push(s);
        }
        jsObj = AlivePdfFactory.INSTANCE.createDashLine(values);
    }

    public DashedLine(JsArrayString pattern) {
        jsObj = AlivePdfFactory.INSTANCE.createDashLine(pattern);
    }

    /**
     * Gets the pattern.
     * 
     * @return the pattern
     */
    public final native JsArrayString getPattern() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpattern();
    }-*/;

}
