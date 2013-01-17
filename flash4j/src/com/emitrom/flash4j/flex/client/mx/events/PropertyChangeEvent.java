/************************************************************************
  PropertyChangeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class PropertyChangeEvent.
 */
public class PropertyChangeEvent extends Event {

    /** The Constant PROPERTY_CHANGE. */
    public static final String PROPERTY_CHANGE = "propertyChange";

    /**
     * Instantiates a new property change event.
     */
    protected PropertyChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the kind.
     * 
     * @return the kind
     */
    public final PropertyChangeEventKind getKind() {
        return PropertyChangeEventKind.fromValue(_getKind());
    }

    /**
     * _get kind.
     * 
     * @return the string
     */
    private final native String _getKind()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getkind();
    }-*/;

    /**
     * Gets the new value.
     * 
     * @param <T> the generic type
     * @return the new value
     */
    public final native <T> T getNewValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnewValue();
    }-*/;

    /**
     * Gets the old value.
     * 
     * @param <T> the generic type
     * @return the old value
     */
    public final native <T> T getOldValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getoldValue();
    }-*/;

    /**
     * Gets the property.
     * 
     * @param <T> the generic type
     * @return the property
     */
    public final native <T> T getProperty()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getproperty();
    }-*/;

    /**
     * Gets the source.
     * 
     * @param <T> the generic type
     * @return the source
     */
    public final native <T> T getSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsource();
    }-*/;

    public static PropertyChangeEvent cast(Event event) {
        return new PropertyChangeEvent(event.getJsObj());
    }

}
