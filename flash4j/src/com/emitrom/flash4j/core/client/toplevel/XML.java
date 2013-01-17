/************************************************************************
  XML.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.toplevel;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.utils.factories.ObjectFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class XML.
 */
public class XML extends ProxyObject {

    /**
     * Instantiates a new xML.
     */
    public XML(Object value) {
        jsObj = ObjectFactory.INSTANCE.createXML(value);
    }

    XML(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Sets the format.
     * 
     * @param value the new format
     */
    public final native void setFormat(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setformat(value);
    }-*/;

    public static void setIgnoreComments(boolean value) {
        Flash.INSTANCE.xmlIgnoreComments(value);
    }

    public static void setIgnoreWhiteSpace(boolean value) {
        Flash.INSTANCE.xmlIgnoreWhiteSpace(true);

    }

    public static void setIgnoreProcessingInstructions(boolean value) {
        Flash.INSTANCE.xmlIgnoreProcessingInstructions(value);
    }

}
