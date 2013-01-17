/************************************************************************
  IPVersion.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum IPVersion {

	IPV4("IPV4"), IPV6("IPV6");

	public final String value;

	private IPVersion(String reference) {
		value = createPeer(reference);
	}

	private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.net.IPVersion[reference];
	}-*/;

	public static native IPVersion fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.net.IPVersion.IPV4:
			return @com.emitrom.air4j.core.client.net.IPVersion::IPV4;

		case $wnd.runtime.flash.net.IPVersion.IPV6:
			return @com.emitrom.air4j.core.client.net.IPVersion::IPV6;
		}
	}-*/;

}
