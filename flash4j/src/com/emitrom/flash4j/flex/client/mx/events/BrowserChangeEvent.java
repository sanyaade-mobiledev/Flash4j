/************************************************************************
  BrowserChangeEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class BrowserChangeEvent.
 */
public class BrowserChangeEvent extends Event {

    /** The Constant APPLICATION_URL_CHANGE. */
    public static final String APPLICATION_URL_CHANGE = "applicationURLChange";

    /** The Constant BROWSER_URL_CHANGE. */
    public static final String BROWSER_URL_CHANGE = "browserURLChange";

    /** The Constant URL_CHANGE. */
    public static final String URL_CHANGE = "URLChange";

    /**
     * Instantiates a new browser change event.
     */
    protected BrowserChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the last url.
     * 
     * @return the last url
     */
    public final native String getLastURL()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLastURL();
    }-*/;

    /**
     * Gets the url.
     * 
     * @return the url
     */
    public final native String getUrl()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geturl();
    }-*/;

    public static BrowserChangeEvent cast(Event event) {
        return new BrowserChangeEvent(event.getJsObj());
    }

}
