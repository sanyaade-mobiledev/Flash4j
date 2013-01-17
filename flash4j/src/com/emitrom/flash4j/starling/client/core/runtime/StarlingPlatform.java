/************************************************************************
 * StarlingPlatform.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import com.emitrom.flash4j.core.client.toplevel.Flash;
import com.emitrom.flash4j.swf.client.StartHandler;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class StarlingPlatform {
    public static final double MINOR_REQUIRED_FLASH_VERSION = 11.2;
    public static final String FLASH_INSTALLED_BUT_WRONG_VERSION = "You are using Flashplayer version : "
                    + Flash.getRawVersion() + ". You need atleast " + MINOR_REQUIRED_FLASH_VERSION;

    private StarlingPlatform() {

    }

    public static void init(final StartHandler handler) {
        Document.get().getBody().getStyle().setPadding(0, Unit.PX);
        Document.get().getBody().getStyle().setMargin(0, Unit.PX);
        RootPanel.get().add(initAsWidget(handler));
    }

    public static Widget initAsWidget(int width, int height, StartHandler handler) {
        StarlingLoader loader = StarlingLoaderFactory.getLoader();
        return loader.load(width, height, handler);
    }

    public static Widget initAsWidget(StartHandler handler) {
        StarlingLoader loader = StarlingLoaderFactory.getLoader();
        return loader.load(Window.getClientWidth(), Window.getClientHeight(), handler);
    }

}
