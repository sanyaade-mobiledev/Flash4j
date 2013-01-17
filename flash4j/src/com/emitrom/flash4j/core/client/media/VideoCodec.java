/************************************************************************
  VideoCodec.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.media;

/**
 * The VideoCodec class is an enumeration of constant values of supported video
 * codecs.
 */
public enum VideoCodec {

    /** The ACCELERATED. */
    H264AVC("H264Avc"),
    /** The SOFTWARE. */
    SORENSON("Sorenson");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new video status.
     * 
     * @param reference
     *            the reference
     */
    private VideoCodec(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value
     *            the value
     * @return the video status
     */
    public static native VideoCodec fromValue(String value) /*-{
		switch (value) {
		case 'H264Avc':
			return @com.emitrom.flash4j.core.client.media.VideoCodec::H264AVC;
		case 'Sorenson':
			return @com.emitrom.flash4j.core.client.media.VideoCodec::SORENSON;
		}
    }-*/;

}
