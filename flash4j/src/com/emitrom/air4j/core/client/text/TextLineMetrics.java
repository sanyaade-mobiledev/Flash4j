/************************************************************************
  TextLineMetrics.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.text;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class TextLineMetrics extends ProxyObject {

    protected TextLineMetrics(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.text.TextLineMetrics;
    }-*/;

    public TextLineMetrics(double x, double width, double height, double ascent, double descent, double leading) {
        jsObj = newInstance(x, width, height, ascent, descent, leading);

    }

    private static native JavaScriptObject newInstance(double x, double width, double height, double ascent,
                    double descent, double leading) /*-{
		return new $wnd.runtime.flash.text.TextLineMetrics(x, width, height,
				ascent, descent, leading);
    }-*/;

    public native double getAscent()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.ascent;
    }-*/;

    public native void setAscent(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.ascent = value;
    }-*/;

    public native double getDescent()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.descent;
    }-*/;

    public native void setDescent(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.descent = value;
    }-*/;

    public native double getHeight()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.height;
    }-*/;

    public native void setHeight(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.height = value;
    }-*/;

    public native double getLeading()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.leading;
    }-*/;

    public native void setLeading(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.leading = value;
    }-*/;

    public native double getWidth()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.width;
    }-*/;

    public native void setWidth(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.width = value;
    }-*/;

    public native double getX()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.x;
    }-*/;

    public native void setX(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.x = value;
    }-*/;

}
