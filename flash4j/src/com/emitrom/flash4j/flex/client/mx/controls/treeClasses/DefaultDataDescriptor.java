/************************************************************************
  DefaultDataDescriptor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls.treeClasses;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DefaultDataDescriptor.
 */
public class DefaultDataDescriptor extends ProxyObject {

    /**
     * Instantiates a new default data descriptor.
     */
    protected DefaultDataDescriptor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the default data descriptor
     */
    public DefaultDataDescriptor() {
        jsObj = Bridge.createObject("mx.controls.treeClasses.DefaultDataDescriptor");
    }

    /**
     * As imenu data descriptor.
     * 
     * @return the i menu data descriptor
     */
    public final JavaScriptObject asImenuDataDescriptor() {
        return this.jsObj.cast();
    }
}
