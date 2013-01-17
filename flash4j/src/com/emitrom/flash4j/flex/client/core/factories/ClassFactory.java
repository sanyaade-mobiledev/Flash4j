/************************************************************************
  ClassFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.flex.client.mx.core.IFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Class objects.
 */
public class ClassFactory extends ProxyObject implements IFactory {

    /**
     * Instantiates a new class factory.
     */
    ClassFactory(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the class factory
     */
    public static ClassFactory create() {
        return new ClassFactory(ClassUtil.getInstance().createClassFactory());
    }

    /**
     * Creates the.
     * 
     * @param obj the obj
     * @return the class factory
     */
    public static ClassFactory create(JavaScriptObject obj) {
        return new ClassFactory(ClassUtil.getInstance().createClassFactory(obj));
    }

    /**
     * New instance.
     * 
     * @param <T> the generic type
     * @return the t
     */
    public final native <T extends JavaScriptObject> T newInstance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.newInstance();
    }-*/;

    /**
     * Sets the properties.
     * 
     * @param obj the new properties
     */
    public final native void setProperties(JavaScriptObject obj)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setProperties(obj);
    }-*/;

    @Override
    public JavaScriptObject asIFactory() {
        return this.jsObj.cast();
    }

}
