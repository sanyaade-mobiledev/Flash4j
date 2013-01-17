/************************************************************************
  SwfLoaderGeckoImpl.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
        final SWFABridgeGeckoWidget swfWidget = new SWFABridgeGeckoWidget(path, width, height);
        swfWidget.addAttribute("bridgeName", Core.BRIDGE_NAME);
        swfWidget.addAttribute("name", "swfID_0");
        swfWidget.addAttribute("vMode", "opaque");
        swfWidget.addParam("bridgeName", Core.BRIDGE_NAME);
        swfWidget.addParam("allowscriptacces", "true");
        swfWidget.addParam("allowsfullscreen", "true");
        swfWidget.addParam("allowsfullscreenInteractive", "true");
        swfWidget.addParam("vMode", "opaque");
        swfWidget.addFlashVar("bridgeName", Core.BRIDGE_NAME);
        swfWidget.setWidth("100%");
        swfWidget.setHeight("100%");
        swfWidget.getElement().setAttribute("style", "position:absolute;height:100%;width:100%");
        swfWidget.setHandler(handler);
        swfWidget.setVisible(true);

        return swfWidget;

    }

    public SwfLoaderGeckoImpl(String path) {
        this.path = path;
    }

}
