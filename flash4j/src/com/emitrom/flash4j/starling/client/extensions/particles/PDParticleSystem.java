/************************************************************************
  PDParticleSystem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.toplevel.XML;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.textures.Texture;

public class PDParticleSystem extends ParticleSystem {

    PDParticleSystem() {
    }

    public PDParticleSystem(XML config, Texture texture) {
        jsObj = StarlingObjectFactory.INSTANCE.createPDParticleSystem(config, texture);
    }

    public native int getEmitterType()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitterType();
    }-*/;

    public native void setEmitterType(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitterType(value);
    }-*/;

    public native double getEmitterXVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitterXVariance();
    }-*/;

    public native void setEmitterXVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitterXVariance(value);
    }-*/;

    public native double getEmitterYVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitterYVariance();
    }-*/;

    public native void setEmitterYVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitterYVariance(value);
    }-*/;

    public native double getMaxNumParticles()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxNumParticles();
    }-*/;

    public native void setMaxNumParticles(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxNumParticles(value);
    }-*/;

    public native double getLifeSpan()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlifeSpan();
    }-*/;

    public native void setLifeSpan(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlifeSpan(value);
    }-*/;

    public native double getLifeSpanVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlifeSpanVariance();
    }-*/;

    public native void setLifeSpanVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlifeSpanVariance(value);
    }-*/;

    public native double getStartSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartSize();
    }-*/;

    public native void setStartSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartSize(value);
    }-*/;

    public native double getStartSizeVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartSizeVariance();
    }-*/;

    public native void setStartSizeVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartSizeVariance(value);
    }-*/;

    public native double getEndSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getendSize();
    }-*/;

    public native void setEndSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setendSize(value);
    }-*/;

    public native double getEndSizeVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getendSizeVariance();
    }-*/;

    public native void setEndSizeVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setendSizeVariance(value);
    }-*/;

    public native double getEmitAngle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitAngle();
    }-*/;

    public native void setEmitAngle(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitAngle(value);
    }-*/;

    public native double getEmitAngleVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getemitAngleVariance();
    }-*/;

    public native void setEmitAngleVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setemitAngleVariance(value);
    }-*/;

    public native double getStartRotation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartRotation();
    }-*/;

    public native void setStartRotation(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartRotation(value);
    }-*/;

    public native double getStartRotationVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartRotationVariance();
    }-*/;

    public native void setStartRotationVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartRotationVariance(value);
    }-*/;

    public native double getEndRotation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getendRotation();
    }-*/;

    public native void setEndRotation(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setendRotation(value);
    }-*/;

    public native double getEndRotationVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getendRotationVariance();
    }-*/;

    public native void setEndRotationVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setendRotationVariance(value);
    }-*/;

    public native double getSpeed()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getspeed();
    }-*/;

    public native void setSpeed(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setspeed(value);
    }-*/;

    public native double getSpeedVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getspeedVariance();
    }-*/;

    public native void setSpeedVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setspeedVariance(value);
    }-*/;

    public native double getGravitiyX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgravityX();
    }-*/;

    public native void setGravityX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgravityX(value);
    }-*/;

    public native double getGravitiyY()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getgravityY();
    }-*/;

    public native void setGravityY(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setgravityY(value);
    }-*/;

    public native double getRadialAcceleration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getradialAcceleration();
    }-*/;

    public native void setRadialAcceleration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setradialAcceleration(value);
    }-*/;

    public native double getRadialAccelerationVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getradialAccelerationVariance();
    }-*/;

    public native void setRadialAccelerationVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setradialAccelerationVariance(value);
    }-*/;

    public native double getTangentialAcceleration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettangentialAcceleration();
    }-*/;

    public native void setTangentialAcceleration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settangentialAcceleration(value);
    }-*/;

    public native double getTangentialAccelerationVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettangentialAccelerationVariance();
    }-*/;

    public native void setTangentialAccelerationVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settangentialAccelerationVariance(value);
    }-*/;

    public native double getMaxRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxRadius();
    }-*/;

    public native void setMaxRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxRadius(value);
    }-*/;

    public native double getMaxRadiusVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaxRadiusVariance();
    }-*/;

    public native void setMaxRadiusVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaxRadiusVariance(value);
    }-*/;

    public native double getMinRadius()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminRadius();
    }-*/;

    public native void setMinRadius(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminRadius(value);
    }-*/;

    public native double getMinRadiusVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminRadiusVariance();
    }-*/;

    public native void setMinRadiusVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setminRadiusVariance(value);
    }-*/;

    public native double getRotatePerSecond()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrotatePerSecond();
    }-*/;

    public native void setRotatePerSecond(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrotatePerSecond(value);
    }-*/;

    public native double getRotatePerSecondVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrotatePerSecondVariance();
    }-*/;

    public native void setRotatePerSecondVariance(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrotatePerSecondVariance(value);
    }-*/;

    public native ColorArgb getStartColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getstartColor();
		return @com.emitrom.flash4j.starling.client.extensions.particles.ColorArgb::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setStartColor(ColorArgb value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setstartColor(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native ColorArgb getStartColorVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getstartColorVariance();
		return @com.emitrom.flash4j.starling.client.extensions.particles.ColorArgb::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setStartColorVariance(ColorArgb value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setstartColorVariance(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native ColorArgb getEndColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getendColor();
		return @com.emitrom.flash4j.starling.client.extensions.particles.ColorArgb::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setEndColor(ColorArgb value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setendColor(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native ColorArgb getEndColorVariance()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getendColorVariance();
		return @com.emitrom.flash4j.starling.client.extensions.particles.ColorArgb::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setEndColorVariance(ColorArgb value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setendColorVariance(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
