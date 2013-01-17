/************************************************************************
  SQLEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class SQLEvent extends Event {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.SQLEvent;
    }-*/;

    public static final String ANALYZE = getConstant("ANALYZE");
    public static final String ATTACH = getConstant("ATTACH");
    public static final String BEGIN = getConstant("BEGIN");
    public static final String CANCEL = getConstant("CANCEL");
    public static final String CLOSE = getConstant("CLOSE");
    public static final String COMMIT = getConstant("COMMIT");
    public static final String COMPACT = getConstant("COMPACT");
    public static final String DEANALYZE = getConstant("DEANALYZE");
    public static final String DETACH = getConstant("DETACH");
    public static final String OPEN = getConstant("OPEN");
    public static final String REENCRYPT = getConstant("REENCRYPT");
    public static final String RESULT = getConstant("RESULT");
    public static final String ROLLBACK = getConstant("ROLLBACK");
    public static final String SCHEMA = getConstant("SCHEMA");
    public static final String RELEASE_SAVEPOINT = getConstant("RELEASE_SAVEPOINT");
    public static final String ROLLBACK_TO_SAVEPOINT = getConstant("ROLLBACK_TO_SAVEPOINT");
    public static final String SET_SAVEPOINT = getConstant("SET_SAVEPOINT");

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.SQLEvent[name];
    }-*/;

    protected SQLEvent(JavaScriptObject obj) {
        super(obj);
    }

    public static SQLEvent cast(Event e) {
        return new SQLEvent(e.getJsObj());
    }
}
