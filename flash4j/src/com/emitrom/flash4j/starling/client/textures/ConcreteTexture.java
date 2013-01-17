/************************************************************************
  ConcreteTexture.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.display3D.textures.TextureBase;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A ConcreteTexture wraps a Stage3D texture object, storing the properties of
 * the texture.
 */
public class ConcreteTexture extends Texture {

    public ConcreteTexture(TextureBase base, int width, int height, boolean mipMapping, boolean premultipliedAlpha) {
        jsObj = StarlingObjectFactory.INSTANCE.createConcreteTexture(base, width, height, mipMapping,
                        premultipliedAlpha);
    }

    public ConcreteTexture(TextureBase base, int width, int height, boolean mipMapping, boolean premultipliedAlpha,
                    boolean optimizedForRenderTexture) {
        jsObj = StarlingObjectFactory.INSTANCE.createConcreteTexture(base, width, height, mipMapping,
                        premultipliedAlpha, optimizedForRenderTexture);
    }

    public ConcreteTexture(TextureBase base, int width, int height, boolean mipMapping, boolean premultipliedAlpha,
                    boolean optimizedForRenderTexture, double scale) {
        jsObj = StarlingObjectFactory.INSTANCE.createConcreteTexture(base, width, height, mipMapping,
                        premultipliedAlpha, optimizedForRenderTexture, scale);
    }

    ConcreteTexture(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Instructs this instance to restore its base texture when the context is
     * lost.
     * 
     * @return
     */
    public native void restoreLostContext(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.restoreLostContext(value);
    }-*/;

    public static ConcreteTexture cast(Texture texture) {
        return new ConcreteTexture(texture.getJsObj());
    }

}
