/************************************************************************
  DRMVoucher.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
/*
 * Copyright 2010 Alain Ekambi
 */
package com.emitrom.flash4j.core.client.net.drm;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The DRMVoucher class is a handle to the license token that allows a user to
 * view DRM-protected content.
 * <p>
 * The DRMVoucher properties describe the viewing rights conferred by the
 * voucher. You can get a voucher using the loadVoucher() method of the
 * DRMManager object. This method requires a DRMContentData object, obtained
 * with the preloadEmbeddedMetadata() method of the NetStream class (AIR only)
 * or by using the DRMContentData() constructor. When using a media rights
 * server such as FlashDetect Access, you can get a DRMContentData object from the
 * metadata generated by the media packager tool.
 */
public class DRMVoucher extends ProxyObject {

    /**
     * Instantiates a new dRM voucher.
     */
    protected DRMVoucher() {

    }

    DRMVoucher(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the date and time at which this voucher expires for offline
     * playback.
     * 
     * @return the offline lease end date
     */
    public final native Date getOfflineLeaseEndDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getofflineLeaseEndDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the date and time at which this voucher becomes valid for offline
     * playback.
     * 
     * @return the offline lease start date
     */
    public final native Date getOfflineLeaseStartDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getofflineLeaseStartDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The time period, after the first viewing, during which the associated
     * content can be viewed or reviewed.
     * 
     * @return the playback time window
     */
    public final native DRMPlaybackTimeWindow getPlaybackTimeWindow()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getplaybackTimeWindow();
		return @com.emitrom.flash4j.core.client.net.drm.DRMPlaybackTimeWindow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the custom application-defined rights, if any, defined by the
     * customer when packaging the content.
     * 
     * @param <T> the generic type
     * @return the policies
     */
    public final native <T> T getPolicies()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpolicies();
    }-*/;

    /**
     * Gets the date on which this voucher expires.
     * 
     * @return the voucher end date
     */
    public final native Date getVoucherEndDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getvoucherEndDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The beginning of this voucher's validity period.
     * 
     * @return the voucher start date
     */
    public final native Date getVoucherStartDate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getvoucherStartDate();
		return @com.emitrom.flash4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
