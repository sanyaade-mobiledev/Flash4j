/************************************************************************
  PDParticle.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class PDParticle extends Particle {

    public PDParticle() {
        jsObj = StarlingObjectFactory.INSTANCE.createPDParticle();
    }

    PDParticle(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native ColorArgb getColorArgb()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcolorArgb();
		return @com.emitrom.flash4j.starling.client.extensions.particles.ColorArgb::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setColorArgb(ColorArgb value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setcolorArgb(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native ColorArgb getColorArgbDelta()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcolorArgbDelta();
		return @com.emitrom.flash4j.starling.client.extensions.particles.ColorArgb::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setColorArgbDelta(ColorArgb value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setcolorArgbDelta(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native double getStartX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartX();
    }-*/;

    public native void setStartX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartX(value);
    }-*/;

    public native double getVelocityX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvelocityX();
    }-*/;

    public native void setVelocityX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvelocityX(value);
    }-*/;

    public native double getRadialAcceleration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getradialAcceleration();
    }-*/;

    public native void setRadialAcceleration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setradialAcceleration(value);
    }-*/;

    public native double getTangentialAcceleration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettangentialAcceleration();
    }-*/;

    public native void setTangentialAcceleration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settangentialAcceleration(value);
    }-*/;

    public native double getEmitRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitRadius();
    }-*/;

    public native void setEmitRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitRadius(value);
    }-*/;

    public native double getEmitRadiusDelta()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitRadiusDelta();
    }-*/;

    public native void setEmitRadiusDelta(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitRadiusDelta(value);
    }-*/;

    public native double getEmitRotation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitRotation();
    }-*/;

    public native void setEmitRotation(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitRotation(value);
    }-*/;

    public native double getEmitRotationDelta()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitRotationDelta();
    }-*/;

    public native void setEmitRotationDelta(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitRotationDelta(value);
    }-*/;

    public native double getRotationDelta()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrotationDelta();
    }-*/;

    public native void setRotationDelta(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrotationDelta(value);
    }-*/;

    public native double getScaleDelta()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleDelta();
    }-*/;

    public native void setScaleDelta(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleDelta(value);
    }-*/;

}
