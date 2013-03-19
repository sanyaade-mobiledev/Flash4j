/************************************************************************
 * SwfLoaderGeckoImpl.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.swf.client.loader;

import com.emitrom.flash4j.core.client.framework.Core;
import com.emitrom.flash4j.swf.client.StartHandler;
import com.emitrom.flash4j.swf.client.gecko.ui.SWFABridgeGeckoWidget;
import com.google.gwt.user.client.ui.Widget;

/**
 * SWF loader for Chrome, Safari, IE and Adobe AIR
 * 
 * @author Ekambi
 * 
 */
public class SwfLoaderGeckoImpl implements SwfLoader {

    private String path;

    @Override
    public Widget load(int width, int height, StartHandler handler) {
        return create(width, height, Core.BRIDGE_NAME, false, handler);
    }

    public SwfLoaderGeckoImpl(String path) {
        this.path = path;
    }

    @Override
    public Widget load(int width, int height, String bridgeName, boolean transparent, StartHandler handler) {
        return create(width, height, bridgeName, transparent, handler);
    }

    private Widget create(int width, int height, String bridgeName, boolean transparent, final StartHandler handler) {
        final SWFABridgeGeckoWidget swfWidget = new SWFABridgeGeckoWidget(path, width, height);
        swfWidget.addAttribute("bridgeName", bridgeName);
        swfWidget.addAttribute("name", "swfID_0");
        if (transparent) {
            swfWidget.addAttribute("wmode", "transparent");
        } else {
            swfWidget.addAttribute("wmode", "opaque");
        }
        swfWidget.addParam("bridgeName", bridgeName);
        swfWidget.addParam("allowscriptacces", "true");
        swfWidget.addParam("allowsfullscreen", "true");
        swfWidget.addParam("allowsfullscreenInteractive", "true");
        if (transparent) {
            swfWidget.addParam("wmode", "transparent");
        } else {
            swfWidget.addParam("wmode", "opaque");
        }
        swfWidget.addFlashVar("bridgeName", bridgeName);
        swfWidget.setWidth("100%");
        swfWidget.setHeight("100%");
        swfWidget.getElement().setAttribute("style", "position:absolute;height:100%;width:100%;top:0;left:0;");
        swfWidget.setHandler(handler, bridgeName);
        swfWidget.setVisible(true);

        return swfWidget;

    }

}
