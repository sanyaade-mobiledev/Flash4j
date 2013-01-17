/************************************************************************
 * StarlingRootPanel.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.starling.client.core.runtime;

import com.emitrom.flash4j.core.client.framework.Application;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

public class StarlingRootPanel extends Application {

    public static final StarlingRootPanel INSTANCE = new StarlingRootPanel();
    private JavaScriptObject ROOT_PANEL = null;

    private StarlingRootPanel() {
        jsObj = Bridge.get().getRoot();
    }

    public JavaScriptObject getRootPanel() {
        if (ROOT_PANEL == null) {
            ROOT_PANEL = _getRootPanel();
        }
        return ROOT_PANEL;
    }

    private native JavaScriptObject _getRootPanel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var o = peer.getStarling();
		return o;
    }-*/;

    public final native void setMetalWorksMobileTheme()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setMetalWorksMobileTheme();
    }-*/;

    public final native void setAeonDesktopTheme()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		$wnd.console.log(peer);
		peer.setAeonDesktopTheme();
    }-*/;

    public final native void setAzureMobileTheme()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setAzureMobileTheme();
    }-*/;

    public final native void setMinimalMobileTheme()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setMinimalMobileTheme();
    }-*/;
}
