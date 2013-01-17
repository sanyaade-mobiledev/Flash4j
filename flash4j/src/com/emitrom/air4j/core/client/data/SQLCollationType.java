/************************************************************************
  SQLCollationType.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.data;

public enum SQLCollationType {

    BINARY("BINARY"), NO_CASE("NO_CASE");

    public final String value;

    private SQLCollationType(String collationType) {
        value = createPeer(collationType);
    }

    private native String createPeer(String collationType) /*-{
		return $wnd.runtime.flash.data.SQLCollationType[collationType];
    }-*/;

    public static native SQLCollationType fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.data.SQLCollationType.BINARY:
			return @com.emitrom.air4j.core.client.data.SQLCollationType::BINARY;
		case $wnd.runtime.flash.data.SQLCollationType.NO_CASE:
			return @com.emitrom.air4j.core.client.data.SQLCollationType::NO_CASE;
		}
    }-*/;
}
