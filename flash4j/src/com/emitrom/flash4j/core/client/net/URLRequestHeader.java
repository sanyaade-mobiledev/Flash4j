/************************************************************************
  URLRequestHeader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.net;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.utils.factories.NetFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A URLRequestHeader object encapsulates a single HTTP request header and
 * consists of a name/value pair. URLRequestHeader objects are used in the
 * requestHeaders property of the URLRequest class.
 */
public class URLRequestHeader extends ProxyObject {

    /**
     * New instance.
     * 
     * @return the uRL request header
     */
    public URLRequestHeader() {
        jsObj = NetFactory.INSTANCE.createURLRequestHeader();
    }

    URLRequestHeader(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param name the name
     * @return the uRL request header
     */
    public URLRequestHeader(String name) {
        jsObj = NetFactory.INSTANCE.createURLRequestHeader(name);
    }

    /**
     * New instance.
     * 
     * @param name the name
     * @param value the value
     * @return the uRL request header
     */
    public URLRequestHeader(String name, String value) {
        jsObj = NetFactory.INSTANCE.createURLRequestHeader(name, value);
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public native String getName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getname();
    }-*/;

    /**
     * Sets the name.
     * 
     * @param name the new name
     */
    public native void setName(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setname(name);
    }-*/;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public native String getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnalue();
    }-*/;

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public native void setValue(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(value);
    }-*/;

}
