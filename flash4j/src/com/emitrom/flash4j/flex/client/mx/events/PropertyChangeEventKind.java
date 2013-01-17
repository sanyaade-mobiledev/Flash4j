/************************************************************************
  PropertyChangeEventKind.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum PropertyChangeEventKind.
 */
public enum PropertyChangeEventKind {

    /** The DELETE. */
    DELETE("delete"),
    /** The UPDATE. */
    UPDATE("update");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new property change event kind.
     * 
     * @param kind the kind
     */
    private PropertyChangeEventKind(String kind) {
        value = kind;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the property change event kind
     */
    public static native PropertyChangeEventKind fromValue(String value) /*-{
		switch (value) {
		case 'delete':
			return @com.emitrom.flash4j.flex.client.mx.events.PropertyChangeEventKind::DELETE;
		case 'update':
			return @com.emitrom.flash4j.flex.client.mx.events.PropertyChangeEventKind::UPDATE;
		}
    }-*/;
}
