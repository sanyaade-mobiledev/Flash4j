/************************************************************************
  SwfLoaderWebkitImpl.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.swf.client.webkit.ui.SWFABridgeWebkitWidget;
import com.emitrom.flash4j.swf.client.webkit.ui.SWFParams;
import com.google.gwt.user.client.ui.Widget;

/**
 * SWF loader for browser that are not Chrome, Safari, IE and Adobe AIR
 * 
 * @author Ekambi
 * 
 */
public class SwfLoaderWebkitImpl implements SwfLoader {

    private String path;

    @Override
    public Widget load(int width, int height, final StartHandler handler) {
        SWFParams params = new SWFParams(path, width, height);
        params.addVar("bridgeName", Core.BRIDGE_NAME);
        params.addVar("bridgeName", Core.BRIDGE_NAME);
        params.addVar("allowFullScreen", "true");
        params.addVar("allowFullScreenInteractive", "true");
        params.addVar("id", Core.BRIDGE_NAME);
        params.addVar("name", Core.BRIDGE_NAME);
        params.setWidth("100%");
        params.setHeight("100%");

        final SWFABridgeWebkitWidget swfWidget = new SWFABridgeWebkitWidget(params);
        swfWidget.getElement().setAttribute("style", "position:absolute;height:100%;width:100%");
        swfWidget.setHandler(handler);
        swfWidget.show();

        return swfWidget;

    }

    public SwfLoaderWebkitImpl(String path) {
        this.path = path;
    }

}
