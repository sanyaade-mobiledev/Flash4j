/************************************************************************
  EffectEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class EffectEvent.
 */
public class EffectEvent extends Event {

    /** The Constant EFFECT_END. */
    public final static String EFFECT_END = "effectEnd";

    /** The Constant EFFECT_REPEAT. */
    public final static String EFFECT_REPEAT = "effectRepeat";

    /** The Constant EFFECT_START. */
    public final static String EFFECT_START = "effectStart";

    /** The Constant EFFECT_STOP. */
    public final static String EFFECT_STOP = "effectStop";

    /** The Constant EFFECT_UPDATE. */
    public final static String EFFECT_UPDATE = "effectUpdate";

    /**
     * Instantiates a new effect event.
     */
    protected EffectEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static EffectEvent cast(Event event) {
        return new EffectEvent(event.getJsObj());
    }

}
