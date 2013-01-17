/************************************************************************
  Responder.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.net;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.utils.factories.NetFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Responder class provides an object that is used in NetConnection.call()
 * to handle return values from the server related to the success or failure of
 * specific operations. When working with NetConnection.call(), you may
 * encounter a network operation fault specific to the current operation or a
 * fault related to the current connection status. Operation errors target the
 * Responder object instead of the NetConnection object for easier error
 * handling.
 */
public class Responder extends ProxyObject {

    Responder(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param result the result
     * @param status the status
     * @return the responder
     */
    public Responder(ResponderResult result, ResponderStatus status) {
        jsObj = NetFactory.INSTANCE.createResponder(result.jsoPeer, status.jsoPeer);
    }
}
