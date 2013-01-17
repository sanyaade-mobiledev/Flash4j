/************************************************************************
  CharacterEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CharacterEvent.
 */
public class CharacterEvent extends Event {

    /** The Constant CHARACTER_MISSING. */
    public static final String CHARACTER_MISSING = "missingCharacter";

    /**
     * Instantiates a new character event.
     */
    CharacterEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the missing character.
     * 
     * @return the missing character
     */
    public final native String getMissingCharacter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmissingCharacter();
    }-*/;

    /**
     * Gets the font name.
     * 
     * @return the font name
     */
    public final native String getFontName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontName();
    }-*/;

    public static CharacterEvent cast(Event event) {
        return new CharacterEvent(event.getJsObj());
    }

}
