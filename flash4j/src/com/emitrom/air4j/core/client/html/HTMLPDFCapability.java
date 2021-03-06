/************************************************************************
  HTMLPDFCapability.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.html;

public enum HTMLPDFCapability {

    ERROR_CANNOT_LOAD_READER("ERROR_CANNOT_LOAD_READER"), ERROR_INSTALLED_READER_NOT_FOUND(
                    "ERROR_INSTALLED_READER_NOT_FOUND"), ERROR_INSTALLED_READER_TOO_OLD(
                    "ERROR_INSTALLED_READER_TOO_OLD"), ERROR_PREFERRED_READER_TOO_OLD("ERROR_INSTALLED_READER_TOO_OLD"), STATUS_OK(
                    "STATUS_OK");

    public final int value;

    private HTMLPDFCapability(String capability) {
        value = createPeer(capability);
    }

    private static native int createPeer(String capability) /*-{
		return $wnd.runtime.flash.html.HTMLPDFCapability[capability];
    }-*/;

    public static native HTMLPDFCapability fromValue(int value) /*-{
		switch (value) {

		case $wnd.runtime.flash.html.HTMLPDFCapability.ERROR_CANNOT_LOAD_READER:
			return @com.emitrom.air4j.core.client.html.HTMLPDFCapability::ERROR_CANNOT_LOAD_READER;

		case $wnd.runtime.flash.html.HTMLPDFCapability.ERROR_INSTALLED_READER_NOT_FOUND:
			return @com.emitrom.air4j.core.client.html.HTMLPDFCapability::ERROR_INSTALLED_READER_NOT_FOUND;

		case $wnd.runtime.flash.html.HTMLPDFCapability.ERROR_INSTALLED_READER_TOO_OLD:
			return @com.emitrom.air4j.core.client.html.HTMLPDFCapability::ERROR_INSTALLED_READER_TOO_OLD;

		case $wnd.runtime.flash.html.HTMLPDFCapability.ERROR_PREFERRED_READER_TOO_OLD:
			return @com.emitrom.air4j.core.client.html.HTMLPDFCapability::ERROR_PREFERRED_READER_TOO_OLD;

		case $wnd.runtime.flash.html.HTMLPDFCapability.STATUS_OK:
			return @com.emitrom.air4j.core.client.html.HTMLPDFCapability::STATUS_OK;
		}
    }-*/;
}
