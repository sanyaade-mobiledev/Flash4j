/************************************************************************
  URLLoaderFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.emitrom.flash4j.core.client.net.URLRequest;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating URLLoader objects.
 */
public class URLLoaderFactory extends ProxyObject {

    private static final URLLoaderFactory INSTANCE = new URLLoaderFactory();

    public static URLLoaderFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new uRL loader factory.
     */
    private URLLoaderFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of URLLoaderFactory.
     * 
     * @return single instance of URLLoaderFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.URLLoaderFactory");
    }

    /**
     * Creates a new URLLoader object.
     * 
     * @return the URL loader
     */
    public final native JavaScriptObject createURLLoder()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createURLLoder();
    }-*/;

    /**
     * Creates a new URLLoader object.
     * 
     * @param request the request
     * @return the URL loader
     */
    public final native JavaScriptObject createURLLoder(URLRequest request)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createURLLoder(request.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
