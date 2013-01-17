/************************************************************************
  RemoveItemAction.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.effects;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class RemoveItemAction.
 */
public class RemoveItemAction extends Effect {

    /**
     * Instantiates a new removes the item action.
     */
    protected RemoveItemAction(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the removes the item action
     */
    public RemoveItemAction() {
        jsObj = Bridge.createObject("mx.effects.RemoveItemAction");
    }

    public RemoveItemAction(ProxyObject target) {
        this();
        setTarget(target);
    }
}
