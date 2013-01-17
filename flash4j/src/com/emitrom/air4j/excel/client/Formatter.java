/************************************************************************
  Formatter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.excel.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class Formatter {

    private Formatter() {

    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.com.as3xls.xls.Formatter;

    }-*/;

    public static native JsArrayString getBuilInFormat() /*-{
		return $wnd.runtime.com.as3xls.xls.Formatter.builtInFormats;
    }-*/;

    public static native boolean isDate(String fmt) /*-{
		return $wnd.runtime.com.as3xls.xls.Formatter.isDate(fmt);
    }-*/;

    public static native <T> T format(Object value, String fmt) /*-{
		return $wnd.runtime.com.as3xls.xls.Formatter.format(value, fmt);
    }-*/;

    public static native <T> T format(Object value, String fmt, int base) /*-{
		return $wnd.runtime.com.as3xls.xls.Formatter.format(value, fmt, base);
    }-*/;

}
