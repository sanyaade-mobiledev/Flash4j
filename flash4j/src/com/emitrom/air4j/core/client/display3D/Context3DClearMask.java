/************************************************************************
  Context3DClearMask.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Context3DClearMask class defines the values for specifying which
 * components of the Context3D buffer to clear.
 * 
 */
public enum Context3DClearMask {

    ALL("ALL"), COLOR("COLOR"), DEPTH("DEPTH"), STENCIL("STENCIL");

    public final int value;

    private Context3DClearMask(String reference) {
        value = createPeer(reference);
    }

    private static native int createPeer(String reference) /*-{
		return $wnd.runtime.flash.display3D.Context3DClearMask[reference];
    }-*/;

    public static native Context3DClearMask fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.display.Context3DClearMask.ALL:
			return @com.emitrom.air4j.core.client.display3D.Context3DClearMask::ALL;

		case $wnd.runtime.flash.display.Context3DClearMask.COLOR:
			return @com.emitrom.air4j.core.client.display3D.Context3DClearMask::COLOR;

		case $wnd.runtime.flash.display.Context3DClearMask.DEPTH:
			return @com.emitrom.air4j.core.client.display3D.Context3DClearMask::DEPTH;

		case $wnd.runtime.flash.display.Context3DClearMask.STENCIL:
			return @com.emitrom.air4j.core.client.display3D.Context3DClearMask::STENCIL;

		}
    }-*/;
}
