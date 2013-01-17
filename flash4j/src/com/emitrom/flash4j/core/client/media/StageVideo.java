/************************************************************************
  StageVideo.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.media;

import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.events.handlers.RenderStateHandler;
import com.emitrom.flash4j.core.client.geom.Point;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.core.client.net.NetStream;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The StageVideo object uses the device's hardware acceleration capabilities,
 * if available, to display live or recorded video in an application. Hardware
 * acceleration capabilities are available on most devices. See the
 * flash.net.NetStream class for more information about supported formats.
 */
public class StageVideo extends EventDispatcher {

    /**
     * Instantiates a new stage video.
     */
    protected StageVideo() {

    }

    protected StageVideo(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the depth level of a StageVideo object relative to other StageVideo
     * objects.
     * 
     * @return the depth
     */
    public native int getDepth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdepth();
    }-*/;

    /**
     * Sets the depth level of a StageVideo object relative to other StageVideo
     * objects.
     * 
     * @param value the new depth
     */
    public native void setDepth(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdepth(value);
    }-*/;

    /**
     * Gets the pan setting for displaying the video, specified as a Point
     * object.
     * 
     * @return the pan
     */
    public native int getPan()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpan();
    }-*/;

    /**
     * Sets the pan setting for displaying the video, specified as a Point
     * object.
     * 
     * @param value the new pan
     */
    public native void setPan(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpan(value);
    }-*/;

    /**
     * Gets the height of the video stream, in pixels.
     * 
     * @return the video height
     */
    public native int getVideoHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvideoHeight();
    }-*/;

    /**
     * Gets the width of the video stream, in pixels.
     * 
     * @return the video width
     */
    public native int getVideoWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvideoWidth();
    }-*/;

    /**
     * Gets the absolute position and size of the video surface in pixels.
     * 
     * @return the view port
     */
    public native Rectangle getViewPort()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getviewPort();
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the absolute position and size of the video surface in pixels.
     * 
     * @param value the new view port
     */
    public native void setViewPort(Rectangle value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setviewPort(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the zoom setting of the video, specified as a Point object.
     * 
     * @return the zoom
     */
    public native Point getZoom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getzoom();
		return @com.emitrom.flash4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the zoom setting of the video, specified as a Point object.
     * 
     * @param value the new zoom
     */
    public native void setZoom(Point value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setzoom(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Specifies a video stream to be displayed within the boundaries of the
     * StageVideo object in the application.
     * 
     * @param value the value
     */
    public native void attachNetStream(NetStream value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.attachNetStream(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Dispatched by the StageVideo object when the render state of the
     * StageVideo object changes.
     * 
     * @param handler
     */
    public native void addRenderStateHandler(RenderStateHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						@com.emitrom.flash4j.core.client.events.StageVideoEvent::RENDER_STATE,
						$entry(function(e) {
							var eventObject = @com.emitrom.flash4j.core.client.events.StageVideoEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.flash4j.core.client.events.handlers.RenderStateHandler::onEvent(Lcom/emitrom/flash4j/core/client/events/StageVideoEvent;)(eventObject);
						}));
    }-*/;

}
