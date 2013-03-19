/************************************************************************
  FLEX.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.flex.client.core.runtime;

import com.emitrom.flash4j.core.client.toplevel.Flash;
import com.emitrom.flash4j.flex.client.ui.spark.Application;
import com.emitrom.flash4j.swf.client.StartHandler;
import com.emitrom.flash4j.swf.client.loader.SwfWidgetLoader;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;

/**
 * Flexframework loader
 */
public class FLEX {

    private static final String CURRENT_VERSION = "4.6";
    private static final String PATH = GWT.getModuleBaseURL() + CURRENT_VERSION + "/FlexGWT.swf";

    /**
     * Instantiates a new fLEX.
     */
    private FLEX() {
    }

    /**
     * Inits the.
     * 
     * @param handler
     *            the handler
     */
    public final static void init(final StartHandler handler) {
        SwfWidgetLoader.init(PATH, handler);
    }

    /**
     * Inits the as widget.
     * 
     * @param handler
     *            the handler
     * @return the widget
     */
    public final static Widget initAsWidget(final StartHandler handler) {
        return SwfWidgetLoader.initAsWidget(PATH, handler);
    }

    /**
     * Inits the as widget.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     * @param handler
     *            the handler
     * @return the widget
     */
    public final static Widget initAsWidget(int width, int height, final StartHandler handler) {
        return SwfWidgetLoader.initAsWidget(PATH, width, height, handler);
    }

    /**
     * Navigate to url.
     * 
     * @param url
     *            the url
     */
    public static void navigateToURL(String url) {
        Flash.get().navigateToURL(url);
    }

    /**
     * Navigate to url.
     * 
     * @param url
     *            the url
     * @param window
     *            the window
     */
    public static void navigateToURL(String url, String window) {
        Flash.get().navigateToURL(url, window);
    }

    public static Application getRootPanel() {
        return Application.get();
    }

}
