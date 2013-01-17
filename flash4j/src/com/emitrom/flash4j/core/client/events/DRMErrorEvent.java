/************************************************************************
  DRMErrorEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.net.drm.DRMContentData;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DRMErrorEvent.
 */
public class DRMErrorEvent extends ErrorEvent {

    /** The Constant DRM_ERROR. */
    public static String DRM_ERROR = "drmError";

    /**
     * Instantiates a new dRM error event.
     */
    protected DRMErrorEvent() {

    }

    DRMErrorEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the content data.
     * 
     * @return the content data
     */
    public native DRMContentData getContentData() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcontenData();
		return @com.emitrom.flash4j.core.client.net.drm.DRMContentData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the content data.
     * 
     * @param value the new content data
     */
    private native void setContentData(DRMContentData value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setcontentData(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Drm update needed.
     * 
     * @return true, if successful
     */
    public native boolean isDrmUpdateNeeded() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdrmUpdateNeeded();
    }-*/;

    /**
     * Gets the sub error id.
     * 
     * @return the sub error id
     */
    public native int getSubErrorID() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsubErrorID();
    }-*/;

    /**
     * System update needed.
     * 
     * @return true, if successful
     */
    public native boolean systemUpdateNeeded() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsystemUpdateNeeded();
    }-*/;

    public static DRMErrorEvent cast(Event event) {
        return new DRMErrorEvent(event.getJsObj());
    }

}
