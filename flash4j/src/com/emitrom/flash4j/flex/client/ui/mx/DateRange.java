/************************************************************************
 * DateRange.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DateRange.
 */
public class DateRange extends ProxyObject {

    /**
     * Instantiates a new date range.
     */
    DateRange(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instace.
     * 
     * @return the date range
     */
    public DateRange() {
        jsObj = JsoHelper.createObject();
    }

    public DateRange(Date from, Date to) {
        this();
        setRangeStart(from);
        setRangeEnd(to);
    }

    /**
     * Sets the range end.
     * 
     * @param date
     *            the new range end
     */
    public final native void setRangeEnd(Date date)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.rangeEnd = date.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * Sets the range start.
     * 
     * @param date
     *            the new range start
     */
    public final native void setRangeStart(Date date)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.rangeStart = date.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
    }-*/;

}
