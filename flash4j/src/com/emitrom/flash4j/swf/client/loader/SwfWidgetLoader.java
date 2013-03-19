/************************************************************************
 * SwfWidgetLoader.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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

import com.emitrom.flash4j.swf.client.StartHandler;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * The SwfWidgetLoader class is responsible of bootstrapping the SwfWidgetLoader
 * framework
 */
public class SwfWidgetLoader {

    private SwfWidgetLoader() {
    }

    /**
     * Initialize the SwfWidgetLoader framework and call the <code>onLoad</code>
     * method on
     * 
     * @param handler
     *            ,the passed handler, the handler to call after the spas
     *            framework was successfully loaded
     */
    public static void init(String path, final StartHandler handler) {
        Document.get().getBody().getStyle().setPadding(0, Unit.PX);
        Document.get().getBody().getStyle().setMargin(0, Unit.PX);
        RootPanel.get().add(initAsWidget(path, handler));
    }

    public static void init(String path, String bridgeName, boolean transparent, final StartHandler handler) {
        Document.get().getBody().getStyle().setPadding(0, Unit.PX);
        Document.get().getBody().getStyle().setMargin(0, Unit.PX);
        RootPanel.get().add(initAsWidget(path, bridgeName, transparent, handler));
    }

    /**
     * Initialize the SwfWidgetLoader framework as a widget. This method should
     * be use when trying to embed the SwfWidgetLoader application into an
     * existing GWT container
     * 
     * @param width
     *            , the width of the widget
     * @param height
     *            , the height of the widget
     * @param handler
     *            , the handler to be called once the SwfWidgetLoader framework
     *            was successfully loaded
     * @return, the SwfWidgetLoader widget to be added
     */
    public static Widget initAsWidget(String path, int width, int height, StartHandler handler) {
        SwfLoader loader = SwfLoaderFactory.getLoader(path);
        return loader.load(width, height, handler);
    }

    public static Widget initAsWidget(String path, int width, int height, String bridgeName, boolean transparent,
                    StartHandler handler) {
        SwfLoader loader = SwfLoaderFactory.getLoader(path);
        return loader.load(width, height, bridgeName, transparent, handler);
    }

    /**
     * Initialize the SwfWidgetLoader framework as a widget filling the entire
     * browser window. This method should be use when trying to embed the
     * SwfWidgetLoader application into an existing GWT container.
     * 
     * @param handler
     *            ,the handler to be called once the SwfWidgetLoader framework
     *            was successfully loaded
     * @return, the SwfWidgetLoader widget to be added
     */
    public static Widget initAsWidget(String path, StartHandler handler) {
        SwfLoader loader = SwfLoaderFactory.getLoader(path);
        return loader.load(Window.getClientWidth(), Window.getClientHeight(), handler);
    }

    public static Widget initAsWidget(String path, String bridgeName, boolean transparent, StartHandler handler) {
        SwfLoader loader = SwfLoaderFactory.getLoader(path);
        return loader.load(Window.getClientWidth(), Window.getClientHeight(), bridgeName, transparent, handler);
    }

}
