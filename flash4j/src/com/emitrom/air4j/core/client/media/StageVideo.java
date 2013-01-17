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
package com.emitrom.air4j.core.client.media;

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.geom.Point;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.emitrom.air4j.core.client.net.NetStream;
import com.google.gwt.core.client.JavaScriptObject;

public class StageVideo extends EventDispatcher {

    public StageVideo(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getDepth()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.depth;
    }-*/;

    public native void setDepth(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.depth = value;
    }-*/;

    public native int getPan()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pan;
    }-*/;

    public native void setPan(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.pan = value;
    }-*/;

    public native int getVideoHeight()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.videoHeight;
    }-*/;

    public native int getVideoWidth()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.videoWidth;
    }-*/;

    public native Rectangle getViewPort()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.viewPort;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setViewPort(Rectangle value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.viewPort = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native Point getZoom()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.zoom;
		return @com.emitrom.air4j.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setZoom(Point value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.zoom = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void attachNetStream(NetStream value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.attachNetStream(value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
