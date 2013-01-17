/************************************************************************
  AS3ArrayFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.utils.factories;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating AS3Array objects.
 */
public class AS3ArrayFactory extends ProxyObject {

    private static final AS3ArrayFactory INSTANCE = new AS3ArrayFactory();

    public static AS3ArrayFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new a s3 array factory.
     */
    private AS3ArrayFactory() {
        jsObj = createNativePeer();
    }

    public final native As3Array create()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.create();
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native As3Array create(int size)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.create(size);
		return @com.emitrom.flash4j.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the single instance of AS3ArrayFactory.
     * 
     * @return single instance of AS3ArrayFactory
     */
    private static JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.maps.factories.AS3ArrayFactory");
    }
}
