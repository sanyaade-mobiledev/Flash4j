/************************************************************************
  Core.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.toplevel;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.Stage;
import com.emitrom.flash4j.core.client.display.Stage3D;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.media.StageVideo;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Core.
 */
class Core extends ProxyObject {

    static final Core INSTANCE = new Core();

    /**
     * Instantiates a new core.
     */
    private Core() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of Core.
     * 
     * @return single instance of Core
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.core.Core");
    }

    /**
     * Navigate to url.
     * 
     * @param url
     *            the url
     */
    final native void navigateToURL(String url)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.navigateToURL(url);
    }-*/;

    /**
     * Navigate to url.
     * 
     * @param url
     *            the url
     * @param window
     *            the window
     */
    final native void navigateToURL(String url, String window)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.navigateToURL(url, window);
    }-*/;

    final native void xmlIgnoreWhiteSpace(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.xmlIgnoreWhiteSpace(value);
    }-*/;

    final native void xmlIgnoreComments(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.xmlIgnoreComments(value);
    }-*/;

    final native void xmlIgnoreProcessingInstructions(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.xmlIgnoreProcessingInstructions(value);
    }-*/;

    final native Stage3D getStage3DAt(Stage target, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getStage3DAt(
						target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						index);
		return @com.emitrom.flash4j.core.client.display.Stage3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    final native StageVideo getStageVideoAt(Stage target, int index)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.getStageVideosAt(
						target.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						index);
		return @com.emitrom.flash4j.core.client.media.StageVideo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
