/************************************************************************
  TextFormat.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class TextFormat extends ProxyObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.text.TextFormat;
    }-*/;

    protected TextFormat(JavaScriptObject obj) {
        jsObj = obj;
    }

    public TextFormat(String font) {
        jsObj = newInstance(font);
    }

    private static native JavaScriptObject newInstance(String font) /*-{
		return new $wnd.runtime.flash.text.TextFormat(font);
    }-*/;

    public native String getAlign() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.align;
    }-*/;

    public native void setAlign(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.align = value;
    }-*/;

    public native Object getBlockIndent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.blockIndent;
    }-*/;

    public native void setBlockIndent(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.blockIndent = value;
    }-*/;

    public native Object getBold() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bold;
    }-*/;

    public native void setBold(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bold = value;
    }-*/;

    public native Object getBullet() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bullet;
    }-*/;

    public native void setBullet(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.bullet = value;
    }-*/;

    public native Object getColor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.color;
    }-*/;

    public native void setColor(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.color = value;
    }-*/;

    public native String getFont() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.font;
    }-*/;

    public native void setFont(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.font = value;
    }-*/;

    public native Object getIndent() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.indent;
    }-*/;

    public native void setIndent(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.indent = value;
    }-*/;

    public native Object getItalic() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.italic;
    }-*/;

    public native void setItalic(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.italic = value;
    }-*/;

    public native Object getKerning() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.kerning;
    }-*/;

    public native void setKerning(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.kerning = value;
    }-*/;

    public native Object getLeftMargin() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.leftMargin;
    }-*/;

    public native void setLeftMargin(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.leftMargin = value;
    }-*/;

    public native Object getLetterSpacing() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.letterSpacing;
    }-*/;

    public native void setLetterSpacing(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.letterSpacing = value;
    }-*/;

    public native Object getRightargin() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rightMargin;
    }-*/;

    public native void setRightMargin(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.rightMargin = value;
    }-*/;

    public native Object getSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.size;
    }-*/;

    public native void setSize(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.size = value;
    }-*/;

    public native int[] getTabStops() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tabStops;
    }-*/;

    public native void setTabStops(int[] value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.tabStops = value;
    }-*/;

    public native String getTarget() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.target;
    }-*/;

    public native void setTarget(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.target = value;
    }-*/;

    public native String getUnderline() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.underline;
    }-*/;

    public native void setUnderline(Object value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.underline = value;
    }-*/;

    public native String getURL() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.url;
    }-*/;

    public native void setURL(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.url = value;
    }-*/;

}
