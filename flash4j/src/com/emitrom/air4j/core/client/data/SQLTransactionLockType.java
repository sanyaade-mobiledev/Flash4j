/************************************************************************
  SQLTransactionLockType.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum SQLTransactionLockType {

    DEFERRED("DEFERRED"), EXCLUSIVE("EXCLUSIVE"), IMMEDIATE("IMMEDIATE");

    public final String value;

    private SQLTransactionLockType(String lockType) {
        value = createPeer(lockType);
    }

    private static native String createPeer(String lockType) /*-{
		return $wnd.runtime.flash.data.SQLTransactionLockType[lockType];
    }-*/;

    public static native SQLTransactionLockType fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.data.SQLTransactionLockType.DEFERRED:
			return @com.emitrom.air4j.core.client.data.SQLTransactionLockType::DEFERRED;
		case $wnd.runtime.flash.data.SQLTransactionLockType.EXCLUSIVE:
			return @com.emitrom.air4j.core.client.data.SQLTransactionLockType::EXCLUSIVE;
		case $wnd.runtime.flash.data.SQLTransactionLockType.IMMEDIATE:
			return @com.emitrom.air4j.core.client.data.SQLTransactionLockType::IMMEDIATE;
		}
    }-*/;
}
