/************************************************************************
  ColorArgb.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.extensions.particles;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class ColorArgb extends ProxyObject {

    public ColorArgb() {
        jsObj = StarlingObjectFactory.INSTANCE.createColorArgb();
    }

    public ColorArgb(double red, double green, double blue, double alpha) {
        jsObj = StarlingObjectFactory.INSTANCE.createColorArgb(red, green, blue, alpha);
    }

    ColorArgb(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native double getRed()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getred();
    }-*/;

    public final native void setRed(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setred(value);
    }-*/;

    public final native double getGreen()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgreen();
    }-*/;

    public final native void setGreen(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgreen(value);
    }-*/;

    public final native double getBlue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getred();
    }-*/;

    public final native void setBlue(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setblue(value);
    }-*/;

    public final native double getAlpha()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalpha();
    }-*/;

    public final native void setAlpha(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalpha(value);
    }-*/;

}
