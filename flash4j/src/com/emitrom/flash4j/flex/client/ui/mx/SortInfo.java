/************************************************************************
 * SortInfo.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SortInfo.
 */
public class SortInfo extends ProxyObject {

    /** The Constant ACTUALSORT. */
    public static final String ACTUALSORT = "actualSort";

    /** The Constant PROPOSEDSORT. */
    public static final String PROPOSEDSORT = "proposedSort";

    /**
     * Instantiates a new sort info.
     */
    protected SortInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Checks if is descending.
     * 
     * @return true, if is descending
     */
    public final native boolean isDescending()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdescending();
    }-*/;

    /**
     * Gets the sequence number.
     * 
     * @return the sequence number
     */
    public final native int getSequenceNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsequenceNumber();
    }-*/;

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public final native String getStatus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstatus();
    }-*/;

}
