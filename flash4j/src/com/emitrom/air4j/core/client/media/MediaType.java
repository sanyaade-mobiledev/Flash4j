/************************************************************************
  MediaType.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.media;

public enum MediaType {

    IMAGE("IMAGE"), VIDEO("VIDEO");

    public String value;

    private MediaType(String openMode) {
        value = createPeer(openMode);
    }

    private static native String createPeer(String argument) /*-{
		return $wnd.runtime.flash.media.MediaType[argument];
    }-*/;

    public static native MediaType fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.media.MediaType.IMAGE:
			return @com.emitrom.air4j.core.client.media.MediaType::IMAGE;

		case $wnd.runtime.flash.media.MediaType.VIDEO:
			return @com.emitrom.air4j.core.client.media.MediaType::VIDEO;

		}
    }-*/;
}
