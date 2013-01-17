/************************************************************************
  Transitions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.animation;

/**
 * The Transitions class contains static methods that define easing functions.
 * Those functions will be used by the
 * {@link com.emitrom.gwt4.flash.starling.client.animation.Tween} class to
 * execute animations
 */
public enum Transitions {

    EASE_IN("easeIn"), LINEAR("linear"), EASE_IN_BACK("easeInBack"), EASE_IN_BOUNCE("easeInBounce"), EASE_IN_ELASTIC(
                    "easeInElastic"), EASE_IN_OUT("easeInOut"), EASE_IN_OUT_BACK("easeInOutBack"), EASE_IN_OUT_BOUNCE(
                    "easeInOutBounce"), EASE_IN_OUT_ELASTIC("easeInOutElastic"), EASE_OUT("easeOut"), EASE_OUT_BACK(
                    "easeOutBack"), EASE_OUT_BOUNCE("easeOutBounce"), EASE_OUT_ELASTIC("easeOutElastic"), EASE_OUT_IN(
                    "easeOutIn"), EASE_OUT_IN_BACK("easeOutInBack"), EASE_OUT_IN_BOUNCE("easeOutInBounce"), EASE_OUT_IN_ELASTIC(
                    "easeOutInElastic");

    private String value;

    Transitions(String transition) {
        value = transition;
    }

    public String getValue() {
        return this.value;
    }

    public static Transitions fromValue(String value) {
        if (value.equalsIgnoreCase("easeIn")) {
            return Transitions.EASE_IN;
        } else if (value.equalsIgnoreCase("easeInBack")) {
            return Transitions.EASE_IN_BACK;
        } else if (value.equalsIgnoreCase("easeInElastic")) {
            return Transitions.EASE_IN_ELASTIC;
        } else if (value.equalsIgnoreCase("easeInOut")) {
            return Transitions.EASE_IN_OUT;
        } else if (value.equalsIgnoreCase("easeInOutBack")) {
            return Transitions.EASE_IN_OUT_BACK;
        } else if (value.equalsIgnoreCase("easeInOutBounce")) {
            return Transitions.EASE_IN_OUT_BOUNCE;
        } else if (value.equalsIgnoreCase("easeInOutElastic")) {
            return Transitions.EASE_IN_OUT_ELASTIC;
        } else if (value.equalsIgnoreCase("easeOut")) {
            return Transitions.EASE_OUT;
        } else if (value.equalsIgnoreCase("easeOutBack")) {
            return Transitions.EASE_OUT_BACK;
        } else if (value.equalsIgnoreCase("easeOutBounce")) {
            return Transitions.EASE_OUT_BOUNCE;
        } else if (value.equalsIgnoreCase("easeOutElastic")) {
            return Transitions.EASE_OUT_ELASTIC;
        } else if (value.equalsIgnoreCase("easeOutIn")) {
            return Transitions.EASE_OUT_IN;
        } else if (value.equalsIgnoreCase("easeOutInBack")) {
            return Transitions.EASE_OUT_IN_BACK;
        } else if (value.equalsIgnoreCase("easeOutInBounce")) {
            return Transitions.EASE_OUT_IN_BOUNCE;
        } else if (value.equalsIgnoreCase("easeOutInElastic")) {
            return Transitions.EASE_OUT_IN_ELASTIC;
        }
        return Transitions.LINEAR;
    }
}
