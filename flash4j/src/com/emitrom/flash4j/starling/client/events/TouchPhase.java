/************************************************************************
  TouchPhase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.events;

/**
 * A enum that provides constant values for the phases of a touch object. A
 * touch moves through at least the following phases in its life:
 * <p>
 * BEGAN -> MOVED -> ENDED Furthermore, a touch can enter a STATIONARY phase.
 * That phase will not trigger an event itself, but you might receive it when
 * another touch does so.
 * <p>
 * Finally, there's the HOVER phase, which is exclusive to mouse input. It is
 * the equivalent of a MouseOver event in FlashDetect when the mouse button is not
 * pressed.
 * 
 * 
 * 
 */
public enum TouchPhase {

    BEGAN("began"), ENDED("ended"), HOVER("hover"), MOVED("moved"), STATIONARY("stationary");

    private String value;

    private TouchPhase(String phase) {
        this.value = phase;
    }

    public String getValue() {
        return value;
    }

    public static TouchPhase froValue(String value) {
        if (value.equalsIgnoreCase(TouchPhase.BEGAN.value)) {
            return TouchPhase.BEGAN;
        } else if (value.equalsIgnoreCase(TouchPhase.ENDED.value)) {
            return TouchPhase.ENDED;
        } else if (value.equalsIgnoreCase(TouchPhase.HOVER.value)) {
            return TouchPhase.HOVER;
        } else if (value.equalsIgnoreCase(TouchPhase.MOVED.value)) {
            return TouchPhase.MOVED;
        } else if (value.equalsIgnoreCase(TouchPhase.STATIONARY.value)) {
            return TouchPhase.STATIONARY;
        }
        return null;
    }

}
