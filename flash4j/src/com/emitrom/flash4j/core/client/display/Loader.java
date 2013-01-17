/************************************************************************
  Loader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.display;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.net.URLRequest;
import com.emitrom.flash4j.core.client.system.LoaderContext;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Loader class is used to load SWF files or image (JPG, PNG, or GIF) files.
 * Use the load() method to initiate loading. The loaded display object is added
 * as a child of the Loader object. Use the URLLoader class to load text or
 * binary data.
 * 
 * <p>
 * The Loader class overrides the following methods that it inherits, because a
 * Loader object can only have one child display object the display object that
 * it loads. Calling the following methods throws an exception: addChild(),
 * addChildAt(), removeChild(), removeChildAt(), and setChildIndex(). To remove
 * a loaded display object, you must remove the Loader object from its parent
 * DisplayObjectContainer child array.
 */
public class Loader extends DisplayObjectContainer {

    /**
     * Instantiates a new loader.
     */
    public Loader() {
        jsObj = createNativePeer();
    }

    private Loader(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the content loader info.
     * 
     * @return the content loader info
     */
    public native LoaderInfo getContentLoaderInfo() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcontentLoaderInfo();
		return @com.emitrom.flash4j.core.client.display.LoaderInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public native DisplayObject getContent() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcontent();
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Close.
     */
    public native void close() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Load.
     * 
     * @param request
     *            the request
     */
    public native void load(URLRequest request) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(request.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Load.
     * 
     * @param request
     *            the request
     * @param context
     *            the context
     */
    public native void load(URLRequest request, LoaderContext context) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.load(
						request,
						context.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Load bytes.
     * 
     * @param bytes
     *            the bytes
     */
    public native void loadBytes(ByteArray bytes) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadBytes(bytes.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Load bytes.
     * 
     * @param bytes
     *            the bytes
     * @param loaderContext
     *            the loader context
     */
    public native void loadBytes(ByteArray bytes, LoaderContext loaderContext) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadBytes(
						bytes,
						loaderContext.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Unload.
     */
    public native void unload() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.unload();
    }-*/;

    /**
     * Unload and stop.
     */
    public native void unloadAndStop() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.unloadAndStop();
    }-*/;

    /**
     * Unload and stop.
     * 
     * @param gc
     *            the gc
     */
    public native void unloadAndStop(boolean gc) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.unloadAndStop(gc);
    }-*/;

    /**
     * New instance.
     * 
     * @return the loader
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.Loader");
    }

}
