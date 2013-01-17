/************************************************************************
  ParticleSystem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.starling.client.animation.IAnimatable;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.display.DisplayObject;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.google.gwt.core.client.JavaScriptObject;

public class ParticleSystem extends DisplayObject implements IAnimatable {

    public ParticleSystem() {
    }

    public ParticleSystem(Texture texture, double emissionRate) {
        jsObj = StarlingObjectFactory.INSTANCE.createParticleSystem(texture, emissionRate);
    }

    public ParticleSystem(Texture texture, double emissionRate, int inialCapacity) {
        jsObj = StarlingObjectFactory.INSTANCE.createParticleSystem(texture, emissionRate, inialCapacity);
    }

    public ParticleSystem(Texture texture, double emissionRate, int inialCapacity, int maxCapacity) {
        jsObj = StarlingObjectFactory.INSTANCE.createParticleSystem(texture, emissionRate, inialCapacity, maxCapacity);
    }

    public ParticleSystem(Texture texture, double emissionRate, int inialCapacity, int maxCapacity,
                    String blendFactorSource, String blendFactorDest) {
        jsObj = StarlingObjectFactory.INSTANCE.createParticleSystem(texture, emissionRate, inialCapacity, maxCapacity,
                        blendFactorSource, blendFactorDest);
    }

    public native int getCapacity()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcapacity();
    }-*/;

    public native int getNumparticles()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumParticles();
    }-*/;

    public native int getMaxCapacity()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxCapacity();
    }-*/;

    public native void setMaxCapacity(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxCapacity(value);
    }-*/;

    public native double getEmissionRate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemissionRate();
    }-*/;

    public native void setEmissionRate(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemissionRate(value);
    }-*/;

    public native double getEmitterY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitterY();
    }-*/;

    public native void setEmitterY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitterY(value);
    }-*/;

    public native double getEmitterX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitterX();
    }-*/;

    public native void setEmitterX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitterX(value);
    }-*/;

    public native String getBlendFactorSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getblendFacotrSource();
    }-*/;

    public native void setBlendFactorSource(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setblendFactorSource(value);
    }-*/;

    public native String getBlendFactorDestination()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getblendFacotrDestination();
    }-*/;

    public native void setBlendFactorDestination(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setblendFactorDestination(value);
    }-*/;

    public native Texture getTexture()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettexture();
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void start()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.start();
    }-*/;

    public native void start(double duration)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.start(duration);
    }-*/;

    public native void stop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;

    public native void stop(boolean clear)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stop(clear);
    }-*/;

    public native void advanceTime(double passedTime)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.advanceTime(passedTime);
    }-*/;

    @Override
    public JavaScriptObject asIAnimatable() {
        return getJsObj().cast();
    }

}
