/************************************************************************
  IOErrorEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.events;

import com.google.gwt.core.client.JavaScriptObject;

public class IOErrorEvent extends ErrorEvent {

    public static final String IO_ERROR = getConstant("IO_ERROR");
    public static final String STANDARD_ERROR_IO_ERROR = getConstant("STANDARD_ERROR_IO_ERROR");
    public static final String STANDARD_INPUT_IO_ERROR = getConstant("STANDARD_INPUT_IO_ERROR");
    public static final String STANDARD_OUTPUT_IO_ERROR = getConstant("STANDARD_OUTPUT_IO_ERROR");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.IOErrorEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.IOErrorEvent[name];
    }-*/;

    protected IOErrorEvent() {
    }

    private IOErrorEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static IOErrorEvent cast(Event e) {
        return new IOErrorEvent(e.getJsObj());
    }

}
