/************************************************************************
  DRMPlaybackTimeWindow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.net.drm;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The DRMPlaybackTimeWindow class represents the period of time during which a
 * DRM voucher is valid.
 * <p>
 * The startDate and endDate properties are null until the first time that the
 * user views the content.
 */
public class DRMPlaybackTimeWindow extends ProxyObject {

    /**
     * Instantiates a new dRM playback time window.
     */
    protected DRMPlaybackTimeWindow() {

    }

    DRMPlaybackTimeWindow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the end date for the period of time during which a DRM voucher is
     * valid (the playback window).
     * 
     * @return the end date
     */
    public final native Date getEndDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getendDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the period of time during which a DRM voucher is valid (the playback
     * window), in seconds.
     * 
     * @return the period
     */
    public final native int getPeriod()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getperiod();
    }-*/;

    /**
     * The start date for the period of time during which a DRM voucher is valid
     * (the playback window).
     * 
     * @return the start date
     */
    public final native Date getStartDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getstartDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;
}
