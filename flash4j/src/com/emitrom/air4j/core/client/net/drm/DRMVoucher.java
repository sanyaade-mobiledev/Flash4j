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
 *   
 */
package com.emitrom.air4j.core.client.net.drm;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

public class DRMVoucher extends ProxyObject {

    protected DRMVoucher(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native Date getOfflineLeaseEndDate()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.offlineLeaseEndDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Date getOfflineLeaseStartDate()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.offlineLeaseStartDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native DRMPlaybackTimeWindow getPlaybackTimeWindow()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.playbackTimeWindow;
		return @com.emitrom.air4j.core.client.net.drm.DRMPlaybackTimeWindow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native <T> T getPolicies()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.policies;
    }-*/;

    public native Date getVoucherEndDate()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.voucherEndDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Date getVoucherStartDate()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.voucherStartDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
