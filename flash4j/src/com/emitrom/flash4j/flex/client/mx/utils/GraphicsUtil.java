/************************************************************************
  GraphicsUtil.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.utils;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.display.Graphics;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GraphicsUtil.
 */
public class GraphicsUtil extends ProxyObject {

    private static final GraphicsUtil INSTANCE = new GraphicsUtil(Bridge.createObject("mx.utils.GraphicsUtil"));

    /**
     * Instantiates a new graphics util.
     */
    protected GraphicsUtil(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the graphics util
     */
    private static GraphicsUtil get() {
        return INSTANCE;
    }

    /**
     * Draw round rect complex.
     * 
     * @param graphics the graphics
     * @param x the x
     * @param y the y
     * @param width the width
     * @param height the height
     * @param topLeftRadius the top left radius
     * @param topRightRadius the top right radius
     * @param bottomLeftRadius the bottom left radius
     * @param bottomRightRadius the bottom right radius
     */
    public static void drawRoundRectComplex(Graphics graphics, double x, double y, double width, double height,
                    double topLeftRadius, double topRightRadius, double bottomLeftRadius, double bottomRightRadius) {
        get()._drawRoundRectComplex(graphics, x, y, width, height, topLeftRadius, topRightRadius,
                        bottomLeftRadius, bottomRightRadius);
    }

    /**
     * _draw round rect complex.
     * 
     * @param graphics the graphics
     * @param x the x
     * @param y the y
     * @param width the width
     * @param height the height
     * @param topLeftRadius the top left radius
     * @param topRightRadius the top right radius
     * @param bottomLeftRadius the bottom left radius
     * @param bottomRightRadius the bottom right radius
     */
    private final native void _drawRoundRectComplex(Graphics graphics, double x, double y, double width, double height,
                    double topLeftRadius, double topRightRadius, double bottomLeftRadius, double bottomRightRadius)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.drawRoundRectComplex(
						graphics.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						x, y, width, height, topLeftRadius, topRightRadius,
						bottomLeftRadius, bottomRightRadius);
    }-*/;

    /**
     * Draw round rect complex2.
     * 
     * @param graphics the graphics
     * @param x the x
     * @param y the y
     * @param width the width
     * @param height the height
     * @param radiusX the radius x
     * @param radiusY the radius y
     * @param topLeftRadiusX the top left radius x
     * @param topLeftRadiusY the top left radius y
     * @param topRightRadiusY the top right radius y
     * @param bottomLeftRadiusX the bottom left radius x
     * @param bottomLeftRadiusY the bottom left radius y
     * @param bottomRightRadiusX the bottom right radius x
     * @param bottomRightRadiusY the bottom right radius y
     */
    public static void drawRoundRectComplex2(Graphics graphics, double x, double y, double width, double height,
                    double radiusX, double radiusY, double topLeftRadiusX, double topLeftRadiusY,
                    double topRightRadiusY, double bottomLeftRadiusX, double bottomLeftRadiusY,
                    double bottomRightRadiusX, double bottomRightRadiusY) {
        get()._drawRoundRectComplex2(graphics, x, y, width, height, radiusX, radiusY, topLeftRadiusX,
                        topLeftRadiusY, topRightRadiusY, bottomLeftRadiusX, bottomLeftRadiusY, bottomRightRadiusX,
                        bottomRightRadiusY);
    }

    /**
     * _draw round rect complex2.
     * 
     * @param graphics the graphics
     * @param x the x
     * @param y the y
     * @param width the width
     * @param height the height
     * @param radiusX the radius x
     * @param radiusY the radius y
     * @param topLeftRadiusX the top left radius x
     * @param topLeftRadiusY the top left radius y
     * @param topRightRadiusY the top right radius y
     * @param bottomLeftRadiusX the bottom left radius x
     * @param bottomLeftRadiusY the bottom left radius y
     * @param bottomRightRadiusX the bottom right radius x
     * @param bottomRightRadiusY the bottom right radius y
     */
    private final native void _drawRoundRectComplex2(Graphics graphics, double x, double y, double width,
                    double height, double radiusX, double radiusY, double topLeftRadiusX, double topLeftRadiusY,
                    double topRightRadiusY, double bottomLeftRadiusX, double bottomLeftRadiusY,
                    double bottomRightRadiusX, double bottomRightRadiusY)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				._drawRoundRectComplex2(
						graphics.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						x, y, width, height, radiusX, radiusY, topLeftRadiusX,
						topLeftRadiusY, topRightRadiusY, bottomLeftRadiusX,
						bottomLeftRadiusY, bottomRightRadiusX,
						bottomRightRadiusY);
    }-*/;

}
