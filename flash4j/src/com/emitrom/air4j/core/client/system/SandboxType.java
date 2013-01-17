/************************************************************************
  SandboxType.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.system;

public enum SandboxType {

    REMOTE("REMOTE"), LOCAL_WITH_FILE("LOCAL_WITH_FILE"), LOCAL_WITH_NETWORK("LOCAL_WITH_NETWORK"), LOCAL_TRUSTED(
                    "LOCAL_TRUSTED"), APPLICATION("APPLICATION");

    public final String value;

    private SandboxType(String format) {
        value = createPeer(format);
    }

    private static native String createPeer(String format) /*-{
		return $wnd.runtime.flash.system.Security[format];
    }-*/;

    public static native SandboxType fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.system.Security.REMOTE:
			return @com.emitrom.air4j.core.client.system.SandboxType::REMOTE;
		case $wnd.runtime.flash.system.Security.LOCAL_WITH_FILE:
			return @com.emitrom.air4j.core.client.system.SandboxType::LOCAL_WITH_FILE;
		case $wnd.runtime.flash.system.Security.LOCAL_WITH_NETWORK:
			return @com.emitrom.air4j.core.client.system.SandboxType::LOCAL_WITH_NETWORK;
		case $wnd.runtime.flash.system.Security.LOCAL_TRUSTED:
			return @com.emitrom.air4j.core.client.system.SandboxType::LOCAL_TRUSTED;
		case $wnd.runtime.flash.system.Security.APPLICATION:
			return @com.emitrom.air4j.core.client.system.SandboxType::APPLICATION;
		}
    }-*/;
}
