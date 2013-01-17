/************************************************************************
  NetGroupSendResult.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

/**
 * The Enum NetGroupSendResult.
 */
public enum NetGroupSendResult {

    /** The ERROR. */
    ERROR("error"),
    /** The N o_ route. */
    NO_ROUTE("no route"),
    /** The SENT. */
    SENT("sent");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new net group send result.
     * 
     * @param result the result
     */
    private NetGroupSendResult(String result) {
        value = result;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the net group send result
     */
    public static native NetGroupSendResult fromValue(String value) /*-{
		switch (value) {
		case 'error':
			return @com.emitrom.flash4j.core.client.net.NetGroupSendResult::ERROR;
		case 'no route':
			return @com.emitrom.flash4j.core.client.net.NetGroupSendResult::NO_ROUTE;
		case 'sent':
			return @com.emitrom.flash4j.core.client.net.NetGroupSendResult::SENT;
		}
    }-*/;
}
