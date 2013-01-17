/************************************************************************
  SwitchSymbolFormatterFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.core.factories;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating SwitchSymbolFormatter objects.
 */
public class SwitchSymbolFormatterFactory extends ProxyObject {

    private static final SwitchSymbolFormatterFactory INSTANCE = new SwitchSymbolFormatterFactory(
                    Bridge.createObject("com.ekambi.gwt.flex.factories.SwitchSymbolFormatterFactory"));

    /**
     * Instantiates a new switch symbol formatter factory.
     */
    SwitchSymbolFormatterFactory(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the single instance of SwitchSymbolFormatterFactory.
     * 
     * @return single instance of SwitchSymbolFormatterFactory
     */
    public static SwitchSymbolFormatterFactory getInstance() {
        return INSTANCE;
    }

    /**
     * Creates a new SwitchSymbolFormatter object.
     * 
     * @return the switch symbol formatter
     */
    public final native JavaScriptObject createFormatter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createFormatter();
    }-*/;

    /**
     * Creates a new SwitchSymbolFormatter object.
     * 
     * @param numberSymbol the number symbol
     * @return the switch symbol formatter
     */
    public final native JavaScriptObject createFormatter(String numberSymbol)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createFormatter(numberSymbol);
    }-*/;

}
