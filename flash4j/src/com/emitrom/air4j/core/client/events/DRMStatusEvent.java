/************************************************************************
  DRMStatusEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.events;

import com.emitrom.air4j.core.client.net.drm.DRMContentData;
import com.emitrom.air4j.core.client.net.drm.DRMVoucher;
import com.emitrom.air4j.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

public class DRMStatusEvent extends Event {

    public static final String DRM_STATUS = getConstant("DRM_STATUS");

    protected DRMStatusEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.DRMStatusEvent;
    }-*/;

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.DRMStatusEvent[name];
    }-*/;

    public final native DRMContentData getContentData() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.contenData;
		return @com.emitrom.air4j.core.client.net.drm.DRMContentData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native void setContentData(DRMContentData value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.contentData = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native String getDetail() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.detail;
    }-*/;

    public final native boolean getIsAnonymous() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isAnonymous;
    }-*/;

    public final native boolean getIsAvailableOffline() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isAvailableOffline;
    }-*/;

    public final native boolean getIsLocal() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isLocal;
    }-*/;

    public final native int getOfflineLeasePeriod() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.offlineLeasePeriod;
    }-*/;

    public final native <T> T getPolicies() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.policies;
    }-*/;

    public final native DRMVoucher getVoucher() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.voucher;
    }-*/;

    public final native Date getVoucherEndDate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.voucherEndDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static DRMStatusEvent cast(Event e) {
        return new DRMStatusEvent(e.getJsObj());
    }

}
