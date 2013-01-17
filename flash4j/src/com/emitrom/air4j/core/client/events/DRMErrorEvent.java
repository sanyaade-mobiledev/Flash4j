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

package com.emitrom.air4j.core.client.events;

import com.emitrom.air4j.core.client.net.drm.DRMContentData;
import com.google.gwt.core.client.JavaScriptObject;

public class DRMErrorEvent extends ErrorEvent {

    public static final String DRM_ERROR = getConstant("DRM_ERROR");

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.events.DRMErrorEvent;
    }-*/;

    protected DRMErrorEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static native String getConstant(String name) /*-{
		return $wnd.runtime.flash.events.DRMErrorEvent[name];
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

    public final native boolean drmUpdateNeeded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.drmUpdateNeeded;
    }-*/;

    public final native int getSubErrorID() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.subErrorID;
    }-*/;

    public final native boolean systemUpdateNeeded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.systemUpdateNeeded;
    }-*/;

    public static DRMErrorEvent cast(Event e) {
        return new DRMErrorEvent(e.getJsObj());
    }

}
