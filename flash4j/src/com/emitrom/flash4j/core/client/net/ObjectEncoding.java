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

package com.emitrom.flash4j.core.client.net;

/**
 * The Enum ObjectEncoding.
 */
public enum ObjectEncoding {

    /** The AM f0. */
    AMF0(0),
    /** The AM f3. */
    AMF3(3),
    /** The DEFAULT. */
    DEFAULT(3);

    /** The value. */
    public final int value;

    /**
     * Instantiates a new object encoding.
     * 
     * @param format the format
     */
    private ObjectEncoding(int format) {
        value = format;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the object encoding
     */
    public static native ObjectEncoding fromValue(int value) /*-{
		switch (value) {
		case 0:
			return @com.emitrom.flash4j.core.client.net.ObjectEncoding::AMF0;
		case 3:
			return @com.emitrom.flash4j.core.client.net.ObjectEncoding::AMF3;
		}
    }-*/;

}
