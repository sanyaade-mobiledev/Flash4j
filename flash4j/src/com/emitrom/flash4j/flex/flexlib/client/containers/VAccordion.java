/************************************************************************
  VAccordion.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.flexlib.client.baseClasses.AccordionBase;
import com.emitrom.flash4j.flex.flexlib.client.containers.accordionClasses.AccordionHeaderLocation;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class VAccordion.
 */
public class VAccordion extends AccordionBase {

    /**
     * Instantiates a new v accordion.
     */
    protected VAccordion(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the v accordion
     */
    public VAccordion() {
        jsObj = Bridge.createObject("flexlib.containers.VAccordion");
    }

    /**
     * Gets the header location.
     * 
     * @return the header location
     */
    public AccordionHeaderLocation getHeaderLocation() {
        return AccordionHeaderLocation.fromValue(_getHeaderLocation());
    }

    /**
     * _get header location.
     * 
     * @return the string
     */
    private native String _getHeaderLocation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getheaderLocation();
    }-*/;

    /**
     * Sets the header location.
     * 
     * @param location
     *            the new header location
     */
    public void setHeaderLocation(AccordionHeaderLocation location) {
        _setHeaderLocation(location.value);
    }

    /**
     * _set header location.
     * 
     * @param value
     *            the value
     */
    private native void _setHeaderLocation(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setheaderLocation(value);
    }-*/;

}
