/************************************************************************
 * SwfLoaderWebkitImpl.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
        return create(width, height, Core.BRIDGE_NAME, false, handler);

    }

    public SwfLoaderWebkitImpl(String path) {
        this.path = path;
    }

    @Override
    public Widget load(int width, int height, String bridgeName, boolean transparent, StartHandler handler) {
        return create(width, height, bridgeName, transparent, handler);
    }

    private Widget create(int width, int height, String bridgeName, boolean transparent, final StartHandler handler) {

        SWFParams params = new SWFParams(path, width, height);
        params.addVar("bridgeName", bridgeName);
        params.addVar("allowFullScreen", "true");
        params.addVar("allowFullScreenInteractive", "true");
        if (transparent) {
            params.addVar("wmode", "transparent");
        } else {
            params.addVar("wmode", "opaque");
        }
        params.addVar("id", bridgeName);
        params.addVar("name", bridgeName);
        params.setWidth("100%");
        params.setHeight("100%");

        final SWFABridgeWebkitWidget swfWidget = new SWFABridgeWebkitWidget(params);
        swfWidget.getElement().setAttribute("style", "position:absolute;height:100%;width:100%;top:0:left:0;");
        swfWidget.setHandler(handler, bridgeName);
        swfWidget.show();

        return swfWidget;

    }

}
