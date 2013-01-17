/************************************************************************
  RenderTexture.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A RenderTexture is a dynamic texture onto which you can draw any display
 * object. After creating a render texture, just call the drawObject method to
 * render an object directly onto the texture. The object will be drawn onto the
 * texture at its current position, adhering its current rotation, scale and
 * alpha properties.
 * <p>
 * Drawing is done very efficiently, as it is happening directly in graphics
 * memory. After you have drawn objects onto the texture, the performance will
 * be just like that of a normal texture - no matter how many objects you have
 * drawn.
 * <p>
 * If you draw lots of objects at once, it is recommended to bundle the drawing
 * calls in a block via the drawBundled method, like shown below. That will
 * speed it up immensely, allowing you to draw hundreds of objects very quickly.
 * <p>
 * To erase parts of a render texture, you can use any display object like a
 * "rubber" by setting its blending mode to "BlendMode.ERASE".
 * <p>
 * Beware that render textures can't be restored when the Starling's render
 * context is lost.
 */
public class RenderTexture extends Texture {

    RenderTexture(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Indicates if the texture is persistent over multiple draw calls.
     * 
     * @return
     */
    public native boolean isPersistent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisPersistent();
    }-*/;

    public static RenderTexture cast(Texture texture) {
        return new RenderTexture(texture.getJsObj());
    }

}
