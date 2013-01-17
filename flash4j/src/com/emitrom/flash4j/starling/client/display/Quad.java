/************************************************************************
  Quad.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.starling.client.core.factories.QuadFactory;
import com.emitrom.flash4j.starling.client.display.utils.VertextData;

/**
 * A Quad represents a rectangle with a uniform color or a color gradient. You
 * can set one color per vertex. The colors will smoothly fade into each other
 * over the area of the quad. To display a simple linear color gradient, assign
 * one color to vertices 0 and 1 and another color to vertices 2 and 3.
 * 
 * 
 */
public class Quad extends DisplayObject {

    Quad() {

    }

    public Quad(int width, int height) {
        jsObj = QuadFactory.INSTANCE.createQuad(width, height);
    }

    public Quad(int width, int height, int color) {
        jsObj = QuadFactory.INSTANCE.createQuad(width, height, color);
    }

    /**
     * Returns the color of the quad, or of vertex 0 if vertices have different
     * colors.
     * 
     * @param value
     */
    public native void setColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    public native int getColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * [read-only] Returns a clone of the raw vertex data.
     * 
     * @return
     */
    public native VertextData getVertexData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getvertexData();
		return @com.emitrom.flash4j.starling.client.display.utils.VertextData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the alpha value of a vertex at a certain index.
     * 
     * @return
     */
    public native double getVertexAlpha()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getVertexAlpha();
    }-*/;

    /**
     * Returns the color of a vertex at a certain index.
     * 
     * @param vertexID
     * @return
     */
    public native int getVertexColor(int vertexID)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getVertexColor(vertexID);
    }-*/;

    /**
     * Sets the alpha value of a vertex at a certain index.
     * 
     * @param vertexId
     * @param alpha
     */
    public native void setVertexAlpha(int vertexId, double alpha)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setVertexAlpha(vertexId, alpha);
    }-*/;

    /**
     * Sets the color of a vertex at a certain index.
     * 
     * @param vertexId
     * @param color
     */
    public native void setVertexColor(int vertexId, int color)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setVertexColor(vertexId, color);
    }-*/;

}
