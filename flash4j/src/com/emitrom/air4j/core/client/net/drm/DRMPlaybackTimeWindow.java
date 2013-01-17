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
package com.emitrom.air4j.core.client.net.drm;

import com.emitrom.air4j.core.client.ProxyObject;
import com.emitrom.air4j.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

public class DRMPlaybackTimeWindow extends ProxyObject {

    protected DRMPlaybackTimeWindow(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native Date getEndDate()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.endDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getPeriod()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.period;
    }-*/;

    public native Date getStartDate()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.startDate;
		return @com.emitrom.air4j.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;
}
