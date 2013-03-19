/************************************************************************
 * SWFABridgeWebkitWidget.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom
 * LLC
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

package com.emitrom.flash4j.swf.client.webkit.ui;

import com.emitrom.flash4j.swf.client.StartHandler;

/**
 * 
 * @author Christian Voigt
 * 
 */
public class SWFABridgeWebkitWidget extends SWFWidget {
    private StartHandler handler;
    private String bm;

    public SWFABridgeWebkitWidget(String string, int width, int height) {
        super(string, width, height);
    }

    public SWFABridgeWebkitWidget(SWFParams params) {
        super(params);
    }

    protected void onAfterSWFInjection() {
        this.registerInitializationListener();

    }

    public void setHandler(StartHandler handler) {
        this.handler = handler;
    }

    public void setHandler(StartHandler handler, String bm) {
        this.handler = handler;
        this.bm = bm;
    }

    protected native void registerInitializationListener()/*-{
		if (this.@com.emitrom.flash4j.swf.client.webkit.ui.SWFABridgeWebkitWidget::handler != null) {
			var listener = this.@com.emitrom.flash4j.swf.client.webkit.ui.SWFABridgeWebkitWidget::handler;
			var bn = this.@com.emitrom.flash4j.swf.client.webkit.ui.SWFABridgeWebkitWidget::bm;
			if (!bn) {
				bn = @com.emitrom.flash4j.core.client.framework.Core::BRIDGE_NAME;
			}

			$wnd.FABridge
					.addInitializationCallback(
							bn,
							function(event) {
								listener.@com.emitrom.flash4j.swf.client.StartHandler::onStart()(event);
							});
		}
    }-*/;

}
