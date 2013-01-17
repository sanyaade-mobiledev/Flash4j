/************************************************************************
  SampleDataEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.events;

import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SampleDataEvent.
 */
public class SampleDataEvent extends Event {

    /** The Constant SAMPLE_DATA. */
    public static String SAMPLE_DATA = "sampleData";

    /**
     * Instantiates a new sample data event.
     */
    protected SampleDataEvent() {
    }

    SampleDataEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public native ByteArray getData() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdata();
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value the new data
     */
    private native void setData(ByteArray value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setdata(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the position.
     * 
     * @return the position
     */
    public native double getPosition() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getposition();
    }-*/;

    /**
     * Sets the position.
     * 
     * @param value the new position
     */
    private native void setPosition(double value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setposition(value);
    }-*/;

    public static SampleDataEvent cast(Event event) {
        return new SampleDataEvent(event.getJsObj());
    }
}
