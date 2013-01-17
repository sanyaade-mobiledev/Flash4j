/************************************************************************
  BitmapEncodingColorSpace.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display;

/**
 * The BitmapEncodingColorSpace class defines the constants that specify how
 * color channels are sampled by the flash.display.BitmapData.encode() method
 * when specifying the compressor as flash.display.JPEGXREncoderOptions.
 * 
 */
public final class BitmapEncodingColorSpace {

    public static final String COLORSPACE_4_2_0 = getConstant("COLORSPACE_4_2_0");
    public static final String COLORSPACE_4_2_2 = getConstant("COLORSPACE_4_2_2");
    public static final String COLORSPACE_4_4_4 = getConstant("COLORSPACE_4_4_4");
    public static final String COLORSPACE_AUTO = getConstant("COLORSPACE_AUTO");

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.display.BitmapEncodingColorSpace[name];
    }-*/;

    protected BitmapEncodingColorSpace() {
    }

}
