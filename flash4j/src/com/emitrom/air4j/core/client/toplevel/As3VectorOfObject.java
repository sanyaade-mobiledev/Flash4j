/************************************************************************
  As3VectorOfObject.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.toplevel;

import com.google.gwt.core.client.JavaScriptObject;

public class As3VectorOfObject extends As3Vector {

    protected As3VectorOfObject(JavaScriptObject obj) {
        super(obj);
    }

    public As3VectorOfObject() {
        jsObj = newInstance();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.Vector["<Object>"];
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.Vector["<Object>"]();
    }-*/;

}
