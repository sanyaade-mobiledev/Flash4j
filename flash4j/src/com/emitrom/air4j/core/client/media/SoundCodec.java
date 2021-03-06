/************************************************************************
  SoundCodec.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public enum SoundCodec {

    NELLYMOSER("NELLYMOSER"), SPEEX("SPEEX");

    public final String value;

    private SoundCodec(String codec) {
        value = createPeer(codec);
    }

    private static native String createPeer(String codec) /*-{
		return $wnd.runtime.flash.media.SoundCodec[codec];
    }-*/;

    public static native SoundCodec fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.media.SoundCodec.NELLYMOSER:
			return @com.emitrom.air4j.core.client.media.SoundCodec::NELLYMOSER;

		case $wnd.runtime.flash.media.SoundCodec.SPEEX:
			return @com.emitrom.air4j.core.client.media.SoundCodec::SPEEX;
		}
    }-*/;
}
