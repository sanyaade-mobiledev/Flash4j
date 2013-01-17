/************************************************************************
  VideoFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.utils.factories;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Video objects.
 */
public class VideoFactory extends ProxyObject {

    private final static VideoFactory INSTANCE = new VideoFactory();

    public static VideoFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new video factory.
     */
    private VideoFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of VideoFactory.
     * 
     * @return single instance of VideoFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.VideoFactory");
    }

    /**
     * Creates a new Video object.
     * 
     * @return the video
     */
    public final native JavaScriptObject createVideo()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createVideo();
    }-*/;

    /**
     * Creates a new Video object.
     * 
     * @param width the width
     * @return the video
     */
    public final native JavaScriptObject createVideo(int width)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createVideo(width);
    }-*/;

    /**
     * Creates a new Video object.
     * 
     * @param width the width
     * @param height the height
     * @return the video
     */
    public final native JavaScriptObject createVideo(int width, int height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createVideo(width, height);
    }-*/;

}
