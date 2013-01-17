/************************************************************************
  MotionDirection.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.transitions;

/**
 * The Enum MotionDirection.
 */
public enum MotionDirection {

    /** The INWARD. */
    INWARD("I"),
    /** The OUTWARD. */
    OUTWARD("O");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new motion direction.
     * 
     * @param reference the reference
     */
    private MotionDirection(String reference) {
        value = createPeer(reference);
    }

    /**
     * Creates the peer.
     * 
     * @param reference the reference
     * @return the string
     */
    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.org.alivepdf.transitions.MotionDirection[reference];
    }-*/;

    /**
     * From value.
     * 
     * @param value the value
     * @return the motion direction
     */
    public static native MotionDirection fromValue(String value) /*-{
		switch (value) {
		case 'I':
			return @com.emitrom.flash4j.alivepdf.client.transitions.MotionDirection::INWARD;
		case 'O':
			return @com.emitrom.flash4j.alivepdf.client.transitions.MotionDirection::OUTWARD
		}
    }-*/;

}
