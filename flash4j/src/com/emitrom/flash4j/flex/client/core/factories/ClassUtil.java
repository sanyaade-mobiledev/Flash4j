/************************************************************************
  ClassUtil.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class ClassUtil.
 */
public class ClassUtil extends ProxyObject {

    private static final ClassUtil INSTANCE = new ClassUtil(
                    Bridge.createObject("com.ekambi.gwt.flash.factories.ClassUtil"));

    /**
     * Instantiates a new class util.
     */
    ClassUtil(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the single instance of ClassUtil.
     * 
     * @return single instance of ClassUtil
     */
    public static ClassUtil getInstance() {
        return INSTANCE;
    }

    /**
     * Gets the class.
     * 
     * @param <T> the generic type
     * @param obj the obj
     * @return the class
     */
    public final native <T extends JavaScriptObject> T getClass(JavaScriptObject obj)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getClass(obj);
    }-*/;

    /**
     * Creates the class factory.
     * 
     * @return the class factory
     */
    public final native JavaScriptObject createClassFactory()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createClassFactory();
    }-*/;

    /**
     * Creates the class factory.
     * 
     * @param obj the obj
     * @return the class factory
     */
    public final native JavaScriptObject createClassFactory(JavaScriptObject obj)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createClassFactory(obj);
    }-*/;

}
