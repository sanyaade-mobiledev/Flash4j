/************************************************************************
  QuadBatch.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.display;

import java.util.List;

import com.emitrom.flash4j.core.client.display.BlendMode;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Matrix3D;
import com.emitrom.flash4j.starling.client.core.factories.StarlingStaticBridge;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.emitrom.flash4j.starling.client.textures.TextureSmoothing;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Optimizes rendering of a number of quads with an identical state. The
 * majority of all rendered objects in Starling are quads. In fact, all the
 * default leaf nodes of Starling are quads (the Image and Quad classes). The
 * rendering of those quads can be accelerated by a big factor if all quads with
 * an identical state are sent to the GPU in just one call. That's what the
 * QuadBatch class can do.
 * <p>
 * The 'flatten' method of the Sprite class uses this class internally to
 * optimize its rendering performance. In most situations, it is recommended to
 * stick with flattened sprites, because they are easier to use. Sometimes,
 * however, it makes sense to use the QuadBatch class directly: e.g. you can add
 * one quad multiple times to a quad batch, whereas you can only add it once to
 * a sprite. Furthermore, this class does not dispatch ADDED or ADDED_TO_STAGE
 * events when a quad is added, which makes it more lightweight.
 * <p>
 * One QuadBatch object is bound to a specific render state. The first object
 * you add to a batch will decide on the QuadBatch's state, that is: its
 * texture, its settings for smoothing and blending, and if it's tinted (colored
 * vertices and/or transparency). When you reset the batch, it will accept a new
 * state on the next added quad.
 * <p>
 * The class extends DisplayObject, but you can use it even without adding it to
 * the display tree. Just call the 'renderCustom' method from within another
 * render method, and pass appropriate values for transformation matrix, alpha
 * and blend mode.
 */
public class QuadBatch extends DisplayObject {

    /**
     * Creates a new QuadBatch instance with empty batch data.
     */
    QuadBatch() {
        jsObj = Bridge.createObject("starling.display.QuadBatch");
    }

    QuadBatch(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native int getNumQuads()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumQuads();
    }-*/;

    /**
     * Adds an image to the batch.
     */
    public native void addImage(Image image)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addImage(image.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds an image to the batch.
     */
    public native void addImage(Image image, double parentAlpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addImage(
						image.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha);
    }-*/;

    /**
     * Adds an image to the batch.
     */
    public native void addImage(Image image, double parentAlpha, Matrix3D modelViewMatrix)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addImage(
						image.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha, modelViewMatrix);
    }-*/;

    /**
     * Adds an image to the batch.
     */
    public void addImage(Image image, double parentAlpha, Matrix3D modelViewMatrix, BlendMode blendMode) {
        _addImage(image, parentAlpha, modelViewMatrix, blendMode.value);
    }

    private native void _addImage(Image image, double parentAlpha, Matrix3D modelViewMatrix, String blendMode)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addImage(
						image.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha, modelViewMatrix, blendMode);
    }-*/;

    /**
     * Adds a quad to the batch.
     */
    public native void addQuad(Quad quad)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addQuad(quad.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds a quad to the batch.
     */
    public native void addQuad(Quad quad, double parentAlpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addQuad(
						quad.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha);
    }-*/;

    /**
     * Adds a quad to the batch.
     */
    public native void addQuad(Quad quad, double parentAlpha, Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addQuad(
						quad.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds a quad to the batch.
     */
    public void addQuad(Quad quad, double parentAlpha, Texture texture, TextureSmoothing smoothing) {
        _addQuad(quad, parentAlpha, texture, smoothing.getValue());
    }

    private native void _addQuad(Quad quad, double parentAlpha, Texture texture, String smoothing)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addQuad(
						quad.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						smoothing);
    }-*/;

    /**
     * Adds a quad to the batch.
     */
    public void addQuad(Quad quad, double parentAlpha, Texture texture, TextureSmoothing smoothing,
                    Matrix3D modelViewMatrix) {
        _addQuad(quad, parentAlpha, texture, smoothing.getValue(), modelViewMatrix);
    }

    private native void _addQuad(Quad quad, double parentAlpha, Texture texture, String smoothing,
                    Matrix3D modelViewMatrix)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addQuad(
						quad.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						smoothing, modelViewMatrix);
    }-*/;

    /**
     * Adds a quad to the batch.
     */
    public void addQuad(Quad quad, double parentAlpha, Texture texture, TextureSmoothing smoothing,
                    Matrix3D modelViewMatrix, BlendMode blendMode) {
        _addQuad(quad, parentAlpha, texture, smoothing.getValue(), modelViewMatrix, blendMode.value);
    }

    private native void _addQuad(Quad quad, double parentAlpha, Texture texture, String smoothing,
                    Matrix3D modelViewMatrix, String blendMode)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addQuad(
						quad.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						smoothing, modelViewMatrix, blendMode);
    }-*/;

    /**
     * Creates a duplicate of the QuadBatch object.
     * 
     * @return
     */
    public native QuadBatch doClone()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.clone();
		return @com.emitrom.flash4j.starling.client.display.QuadBatch::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Analyses a container object that is made up exclusively of quads (or
     * other containers) and creates a vector of QuadBatch objects representing
     * the container.
     * 
     * @param container
     * @param quadbatches
     */
    public static void compile(DisplayObjectContainer container, List<QuadBatch> quadbatches) {
        StarlingStaticBridge.INSTANCE.doQuaBatchCompile(container, quadbatches);
    }

    /**
     * Indicates if a quad can be added to the batch without causing a state
     * change.
     * 
     * @param quad
     * @param parentAlpha
     * @param texture
     * @param smoothing
     * @return
     */
    public boolean isStateChange(Quad quad, double parentAlpha, Texture texture, TextureSmoothing smoothing) {
        return _isStateChange(quad, parentAlpha, texture, smoothing.getValue());
    }

    private native boolean _isStateChange(Quad quad, double parentAlpha, Texture texture, String smoothing)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.isStateChange(
						quad.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						smoothing);
    }-*/;

    /**
     * Renders the current batch with custom settings for model-view-projection
     * matrix, alpha and blend mode.
     * 
     * @param mvpMatrix
     * @param parentAlpha
     */
    public void renderCustom(Matrix3D mvpMatrix) {
        _renderCustom(mvpMatrix);
    }

    private native void _renderCustom(Matrix3D mvpMatrix)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.renderCustom(mvpMatrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Renders the current batch with custom settings for model-view-projection
     * matrix, alpha and blend mode.
     * 
     * @param mvpMatrix
     * @param parentAlpha
     */
    public void renderCustom(Matrix3D mvpMatrix, double parentAlpha) {
        _renderCustom(mvpMatrix, parentAlpha);
    }

    private native void _renderCustom(Matrix3D mvpMatrix, double parentAlpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.renderCustom(
						mvpMatrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha);
    }-*/;

    /**
     * Renders the current batch with custom settings for model-view-projection
     * matrix, alpha and blend mode.
     * 
     * @param mvpMatrix
     * @param parentAlpha
     * @param blendMode
     */
    public void renderCustom(Matrix3D mvpMatrix, double parentAlpha, BlendMode blendMode) {
        _renderCustom(mvpMatrix, parentAlpha, blendMode.value);
    }

    private native void _renderCustom(Matrix3D mvpMatrix, double parentAlpha, String blendMode)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.renderCustom(
						mvpMatrix.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						parentAlpha, blenMode);
    }-*/;

    /**
     * Resets the batch.
     */
    public native void reset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.reset();
    }-*/;

}
