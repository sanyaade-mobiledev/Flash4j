/************************************************************************
  Context3DBlendFactor.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display3D;

/**
 * Defines the values to use for specifying the source and destination blend
 * factors.
 * 
 */
public enum Context3DBlendFactor {

    DESTINATION_ALPHA("DESTINATION_ALPHA"), DESTINATION_COLOR("DESTINATION_COLOR"), ONE_MINUS_DESTINATION_ALPHA(
                    "ONE_MINUS_DESTINATION_ALPHA"), ONE_MINUS_DESTINATION_COLOR("ONE_MINUS_DESTINATION_COLOR"), ONE_MINUS_SOURCE_ALPHA(
                    "ONE_MINUS_SOURCE_ALPHA"), ONE_MINUS_SOURCE_COLOR("ONE_MINUS_SOURCE_COLOR"), SOURCE_COLOR(
                    "SOURCE_COLOR"), SOURCE_ALPHA("SOURCE_ALPHA"), ZERO("ZERO");

    public final String value;

    private Context3DBlendFactor(String reference) {
        value = createPeer(reference);

    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.display3D.Context3DBlendFactor[reference];
    }-*/;

    public static native Context3DBlendFactor fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.display.Context3DBlendFactor.DESTINATION_ALPHA:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::DESTINATION_ALPHA;

		case $wnd.runtime.flash.display.Context3DBlendFactor.DESTINATION_COLOR:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::DESTINATION_COLOR;

		case $wnd.runtime.flash.display.Context3DBlendFactor.ONE_MINUS_DESTINATION_ALPHA:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::ONE_MINUS_DESTINATION_ALPHA;

		case $wnd.runtime.flash.display.Context3DBlendFactor.ONE_MINUS_DESTINATION_COLOR:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::ONE_MINUS_DESTINATION_COLOR;

		case $wnd.runtime.flash.display.Context3DBlendFactor.ONE_MINUS_SOURCE_ALPHA:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::ONE_MINUS_SOURCE_ALPHA;

		case $wnd.runtime.flash.display.Context3DBlendFactor.ONE_MINUS_SOURCE_COLOR:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::ONE_MINUS_SOURCE_COLOR;

		case $wnd.runtime.flash.display.Context3DBlendFactor.SOURCE_ALPHA:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::SOURCE_ALPHA;

		case $wnd.runtime.flash.display.Context3DBlendFactor.SOURCE_COLOR:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::SOURCE_COLOR;

		case $wnd.runtime.flash.display.Context3DBlendFactor.ZERO:
			return @com.emitrom.air4j.core.client.display3D.Context3DBlendFactor::ZERO;

		}
    }-*/;
}
