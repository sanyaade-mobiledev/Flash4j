/************************************************************************
  CollectionEventKind.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

/**
 * The Enum CollectionEventKind.
 */
public enum CollectionEventKind {

    /** The ADD. */
    ADD("add"),
    /** The MOVE. */
    MOVE("move"),
    /** The REFRESH. */
    REFRESH("refresh"),
    /** The REMOVE. */
    REMOVE("remove"),
    /** The REPLACE. */
    REPLACE("replace"),
    /** The RESET. */
    RESET("reset"),
    /** The UPDATE. */
    UPDATE("update");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new collection event kind.
     * 
     * @param direction the direction
     */
    private CollectionEventKind(String direction) {
        value = direction;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the collection event kind
     */
    public static native CollectionEventKind fromValue(String value) /*-{
		switch (value) {
		case 'add':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::ADD;
		case 'remove':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::REMOVE;
		case 'move':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::MOVE;
		case 'refresh':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::REFRESH;
		case 'move':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::MOVE;
		case 'refresh':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::REFRESH;
		case 'replace':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::REPLACE;
		case 'update':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::UPDATE;
		case 'reset':
			return @com.emitrom.flash4j.flex.client.mx.events.CollectionEventKind::RESET;
		}
    }-*/;

}
