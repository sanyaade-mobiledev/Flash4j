/************************************************************************
  Array.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum Array {

    CASEINSENSITIVE("CASEINSENSITIVE"), DESCENDING("DESCENDING"), NUMERIC("NUMERIC"), RETURNINDEXEDARRAY(
                    "RETURNINDEXEDARRAY"), UNIQUESORT("UNIQUESORT");

    public final int value;

    private Array(String reference) {
        value = createPeer(reference);
    }

    private static native int createPeer(String reference) /*-{

		switch (reference) {

		case 'CASEINSENSITIVE':
			return $wnd.runtime.Array.CASEINSENSITIVE;

		case 'DESCENDING':
			return $wnd.runtime.Array.DESCENDING;

		case 'NUMERIC':
			return $wnd.runtime.Array.NUMERIC;

		case 'RETURNINDEXEDARRAY':
			return $wnd.runtime.Array.RETURNINDEXEDARRAY;

		case 'UNIQUESORT':
			return $wnd.runtime.Array.UNIQUESORT;

		}
    }-*/;
}
