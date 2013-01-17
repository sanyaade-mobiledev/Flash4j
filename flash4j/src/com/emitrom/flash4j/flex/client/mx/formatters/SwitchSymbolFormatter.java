/************************************************************************
  SwitchSymbolFormatter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.core.factories.SwitchSymbolFormatterFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SwitchSymbolFormatter.
 */
public class SwitchSymbolFormatter extends ProxyObject {

    /**
     * Instantiates a new switch symbol formatter.
     */
    protected SwitchSymbolFormatter(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the switch symbol formatter
     */
    public SwitchSymbolFormatter() {
        jsObj = SwitchSymbolFormatterFactory.getInstance().createFormatter();
    }

    /**
     * New instance.
     * 
     * @param numberSymbol the number symbol
     * @return the switch symbol formatter
     */
    public SwitchSymbolFormatter(String numberSymbol) {
        jsObj = SwitchSymbolFormatterFactory.getInstance().createFormatter(numberSymbol);
    }

    /**
     * Format value.
     * 
     * @param format the format
     * @param source the source
     * @return the string
     */
    public native String formatValue(String format, Object source)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.formatValue(format, source);
    }-*/;

}
