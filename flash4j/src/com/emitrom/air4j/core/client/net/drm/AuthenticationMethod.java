/************************************************************************
  AuthenticationMethod.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.net.drm;

public enum AuthenticationMethod {

    ANONYMUS("ANONYMUS"), USERNAME_AND_PASSWORD("USERNAME_AND_PASSWORD");

    public final String value;

    private AuthenticationMethod(String openMode) {
        value = createPeer(openMode);
    }

    private static native String createPeer(String method) /*-{
		return $wnd.runtime.flash.net.drm.AuthenticationMethod[method];
    }-*/;

    public static native AuthenticationMethod fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.display.AuthenticationMethod.ANONYMUS:
			return @com.emitrom.air4j.core.client.net.drm.AuthenticationMethod::ANONYMUS;

		case $wnd.runtime.flash.display.AuthenticationMethod.USERNAME_AND_PASSWORD:
			return @com.emitrom.air4j.core.client.net.drm.AuthenticationMethod::USERNAME_AND_PASSWORD;
		}
    }-*/;
}
