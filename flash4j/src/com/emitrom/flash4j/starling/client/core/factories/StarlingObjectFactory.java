/************************************************************************
  StarlingObjectFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.core.factories;

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.Bitmap;
import com.emitrom.flash4j.core.client.display3D.textures.TextureBase;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.core.client.toplevel.XML;
import com.emitrom.flash4j.core.client.utils.factories.AS3ArrayFactory;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Factory class to create Starling objects. For internal use only.
 * 
 */
public class StarlingObjectFactory extends ProxyObject {

    public static final StarlingObjectFactory INSTANCE = new StarlingObjectFactory();

    private StarlingObjectFactory() {
        jsObj = Bridge.createObject("com.emitrom.gwt4.flash.factories.StarlingObjectFactory");
    }

    public final native JavaScriptObject createTextureAtlas(Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createTextureAtlas(texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createTextureAtlas(Texture texture, XML atlasXML)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createTextureAtlas(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						atlasXML.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final JavaScriptObject createMovieClip(List<Texture> textures, double fps) {
        As3Array values = AS3ArrayFactory.get().create();
        for (Texture texture : textures) {
            values.push(texture.getJsObj());
        }
        return _createMovieClip(values, fps);
    }

    public final JavaScriptObject createMovieClip(List<Texture> textures) {
        As3Array values = AS3ArrayFactory.get().create();
        for (Texture texture : textures) {
            values.push(texture.getJsObj());
        }
        return _createMovieClip(values);
    }

    private final native JavaScriptObject _createMovieClip(As3Array values, double fps)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createMovieClip(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						fps);
    }-*/;

    private final native JavaScriptObject _createMovieClip(As3Array values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createMovieClip(texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createMovieClip(Texture texture, double fps)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createMovieClip(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						fps);
    }-*/;

    public final native JavaScriptObject createParticleDesignerPS(XML xml, Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		for ( var p in peer) {
			$wnd.console.log(p);
		}
		return peer
				.createParticleDesignerPS(
						xml.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createImageFromBitmap(Bitmap bitmap)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createImageFromBitmap(bitmap.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createButton(Texture upState, String text)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createButton(
						upState.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						text);
		return obj;
    }-*/;

    public final native JavaScriptObject createButton(Texture upState, String text, Texture downState)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createButton(
						upState.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						text,
						downState.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createTween(Object target, double time)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTween(target, time);
    }-*/;

    public final native JavaScriptObject createTween(Object target, double time, String transition)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTween(target, time, transition);
    }-*/;

    public final native JavaScriptObject createImage(Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createImage(texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createStarlingEvent(String type)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createStarlingEvent(type);
    }-*/;

    public final native JavaScriptObject createStarlingEvent(String type, boolean bubble)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createStarlingEvent(type, bubble);
    }-*/;

    public final native JavaScriptObject createConcreteTexture(TextureBase base, int width, int height,
                    boolean mipMapping, boolean premultipliedAlpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createConcreteTexture(
						base.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, mipMapping, premultipliedAlpha);
    }-*/;

    public final native JavaScriptObject createConcreteTexture(TextureBase base, int width, int height,
                    boolean mipMapping, boolean premultipliedAlpha, boolean optimizedForRenderTexture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createConcreteTexture(
						base.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, mipMapping, premultipliedAlpha,
						optimizedForRenderTexture);
    }-*/;

    public final native JavaScriptObject createConcreteTexture(TextureBase base, int width, int height,
                    boolean mipMapping, boolean premultipliedAlpha, boolean optimizedForRenderTexture, double scale)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createConcreteTexture(
						base.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						width, height, mipMapping, premultipliedAlpha,
						optimizedForRenderTexture, scale);
    }-*/;

    public final native JavaScriptObject createBitmapChar(int id, Texture texture, double xOffset, double yOffset,
                    double xAdvance)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createBitmapChar(
						id,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						xOffset, yOffset, xAdvance);
    }-*/;

    public final native JavaScriptObject createBitmapFont()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createBitmapFont();
    }-*/;

    public final native JavaScriptObject createBitmapFont(Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createBitmapFont(texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createBitmapFont(Texture texture, XML fontXML)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createBitmapFont(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						fontXML.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createTextField(int width, int height, String text)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextField(width, height, text);
    }-*/;

    public final native JavaScriptObject createTextField(int width, int height, String text, String fontName)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextField(width, height, text, fontName);
    }-*/;

    public final native JavaScriptObject createTextField(int width, int height, String text, String fontName,
                    double fontSize)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextField(width, height, text, fontName, fontSize);
    }-*/;

    public final native JavaScriptObject createTextField(int width, int height, String text, String fontName,
                    double fontSize, int color)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextField(width, height, text, fontName, fontSize,
				color);
    }-*/;

    public final native JavaScriptObject createTextField(int width, int height, String text, String fontName,
                    double fontSize, int color, boolean bold)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextField(width, height, text, fontName, fontSize,
				color, bold);
    }-*/;

    public final native JavaScriptObject createColorArgb()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createColorArgb();
    }-*/;

    public final native JavaScriptObject createColorArgb(double red, double green, double blue, double alpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createColorArgb(red, green, blue, alpha);
    }-*/;

    public final native JavaScriptObject createParticle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createParticle();
    }-*/;

    public final native JavaScriptObject createParticleSystem(Texture texture, double emissionRate)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createParticleSystem(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						emissionRate);
    }-*/;

    public final native JavaScriptObject createParticleSystem(Texture texture, double emissionRate, int initialCapacity)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createParticleSystem(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						emissionRate, initialCapacity);
    }-*/;

    public final native JavaScriptObject createParticleSystem(Texture texture, double emissionRate,
                    int initialCapacity, int maxCapacity)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createParticleSystem(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						emissionRate, initialCapacity, maxCapacity);
    }-*/;

    public final native JavaScriptObject createParticleSystem(Texture texture, double emissionRate,
                    int initialCapacity, int maxCapacity, String blendFactorSource)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createParticleSystem(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						emissionRate, initialCapacity, maxCapacity,
						blendFactorSource);
    }-*/;

    public final native JavaScriptObject createParticleSystem(Texture texture, double emissionRate,
                    int initialCapacity, int maxCapacity, String blendFactorSource, String blendFactorDest)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createParticleSystem(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						emissionRate, initialCapacity, maxCapacity,
						blendFactorSource, blendFactorDest);
    }-*/;

    public final native JavaScriptObject createPDParticleSystem(XML xml, Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.createPDParticleSystem(
						xml.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return obj;
    }-*/;

    public final native JavaScriptObject createPDParticle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createPDParticle();
    }-*/;

}
