/************************************************************************
  Clock.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.spark.components;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.emitrom.flash4j.flex.client.spark.components.supportClasses.SkinnableComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Clock.
 */
public class Clock extends SkinnableComponent {

    /**
     * Instantiates a new clock.
     */
    protected Clock(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the clock
     */
    public Clock() {
        jsObj = Bridge.createObject("com.clock.components.Clock");
    }

    /**
     * Start clock.
     */
    public native void start()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.startClock();
    }-*/;

    /**
     * Stop clock.
     */
    public native void stop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stopClock();
    }-*/;

    /**
     * Gets the time.
     * 
     * @return the time
     */
    public native Date getTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getTime();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj)
    }-*/;

}
