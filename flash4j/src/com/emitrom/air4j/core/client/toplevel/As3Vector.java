/************************************************************************
  As3Vector.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.toplevel;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class As3Vector extends ProxyObject {

    protected As3Vector() {

    }

    protected As3Vector(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native int getLength()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.length;
    }-*/;

    public final native void setLength(int value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.length = value;
    }-*/;

    public final native boolean getFixed()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.fixed;
    }-*/;

    public final native void setFixed(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.fixed = value;
    }-*/;

    public final native int indexOf(Object element)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.indexOf(element);
    }-*/;

    public final native int indexOf(Object element, int fromIndex)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.indexOf(element, fromIndex);
    }-*/;

    public final native String join()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.join();
    }-*/;

    public final native String join(String sep)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.join(sep);
    }-*/;

    public final native int lastIndexOf(Object element)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.lastIndexOf(element);
    }-*/;

    public final native int lastIndexOf(Object element, int fromIndex)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.lastIndexOf(element, fromIndex);
    }-*/;

    public final native <T> T pop()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.pop();
    }-*/;

    public final native <T> T shift()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.shift();
    }-*/;

}
