/************************************************************************
  HTTPLink.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.links;

import com.emitrom.flash4j.alivepdf.client.core.HTTPLinkFactory;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class HTTPLink.
 */
public class HTTPLink extends ProxyObject implements ILink {

    /**
     * Instantiates a new hTTP link.
     */
    HTTPLink(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the hTTP link
     */
    public HTTPLink() {
        jsObj = HTTPLinkFactory.INSTANCE.createHTTPLink();
    }

    /**
     * New instance.
     * 
     * @param url the url
     * @return the hTTP link
     */
    public HTTPLink(String url) {
        jsObj = HTTPLinkFactory.INSTANCE.createHTTPLink(url);
    }

    /**
     * Gets the link.
     * 
     * @return the link
     */
    public final native String getLink() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlink();
    }-*/;

    @Override
    public JavaScriptObject asILink() {
        return this.jsObj.cast();
    }

}
