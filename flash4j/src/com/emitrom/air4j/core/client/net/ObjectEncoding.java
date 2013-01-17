/************************************************************************
  ObjectEncoding.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.net;

public enum ObjectEncoding {

    AMF0("AMF0"), AMF3("AMF3"), DEFAULT("DEFAULT");

    public final int value;

    private ObjectEncoding(String format) {
        value = createPeer(format);
    }

    private static native int createPeer(String format) /*-{
		return $wnd.runtime.flash.net.ObjectEncoding[format];
    }-*/;

    public static native ObjectEncoding fromValue(int value) /*-{
		switch (value) {
		case $wnd.runtime.flash.net.ObjectEncoding.AMF0:
			return @com.emitrom.air4j.core.client.net.ObjectEncoding::AMF0;
		case $wnd.runtime.flash.net.ObjectEncoding.AMF3:
			return @com.emitrom.air4j.core.client.net.ObjectEncoding::AMF3;
		case $wnd.runtime.flash.net.ObjectEncoding.DEFAULT:
			return @com.emitrom.air4j.core.client.net.ObjectEncoding::DEFAULT;
		}
    }-*/;

    // TODO: dynamicPropertyWriter
}
