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

package com.emitrom.air4j.core.client.net;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class Responder {

    // Called from JSNI in methods expecting a flash.net.Responder argument
    private final JavaScriptObject jsoPeer = createNativeResponder(this);

    private static native JavaScriptObject createNativeResponder(Responder responder) /*-{
		return new $wnd.runtime.flash.net.Responder(

		$entry(function() {
			responder.@com.emitrom.air4j.core.client.net.Responder::result()();
		}), $entry(function() {
			responder.@com.emitrom.air4j.core.client.net.Responder::status()();
		}));
    }-*/;

    public abstract void result();

    public abstract void status();
}
