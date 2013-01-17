/************************************************************************
  TextureAtlas.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.textures;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.core.client.toplevel.XML;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A texture atlas is a collection of many smaller textures in one big image.
 * This class is used to access textures from such an atlas.
 * 
 * @author Ekambi
 * 
 */
public class TextureAtlas extends ProxyObject {

    TextureAtlas(JavaScriptObject obj) {
        jsObj = obj;
    }

    public TextureAtlas(Texture texture) {
        jsObj = StarlingObjectFactory.INSTANCE.createTextureAtlas(texture);
    }

    public TextureAtlas(Texture texture, XML atlasXML) {
        jsObj = StarlingObjectFactory.INSTANCE.createTextureAtlas(texture, atlasXML);
    }

    /**
     * Creates a region for a subtexture and gives it a name.
     * 
     * @return
     */
    public native void addRegion(String name, Rectangle region)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addRegion(
						name,
						region.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Creates a region for a subtexture and gives it a name.
     * 
     * @return
     */
    public native void addRegion(String name, Rectangle region, Rectangle frame)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addRegion(
						name,
						region.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						frame.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Disposes the atlas texture.
     */
    public native void dispose()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.dispose();
    }-*/;

    /**
     * Retrieves a subtexture by name
     */
    public native Texture getTexture(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getTexture(name);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns all textures that start with a certain string, sorted
     * alphabetically (especially useful for "MovieClip").
     * 
     * @param prefix
     * @return
     */
    public List<Texture> getTextures(String prefix) {
        List<Texture> textures = new ArrayList<Texture>();
        JavaScriptObject nativePeer = StarlingStaticBridge.INSTANCE.getTexturesFrom(this, prefix);
        int size = JsoHelper.getAs3ArrayLength(nativePeer);
        for (int i = 0; i < size; i++) {
            textures.add(new Texture(JsoHelper.getValueFromJavaScriptObjectArray(nativePeer, i)));
        }
        return textures;
    }

    /**
     * Disposes the atlas texture.
     */
    public native void removeRegion(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeRegion(name);
    }-*/;

}
