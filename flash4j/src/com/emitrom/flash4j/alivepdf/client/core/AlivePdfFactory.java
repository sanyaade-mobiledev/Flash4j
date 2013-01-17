/************************************************************************
 * AlivePdfFactory.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.alivepdf.client.core;

import com.emitrom.flash4j.alivepdf.client.colors.CMYKColor;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class AlivePdfFactory extends ProxyObject {

    public static final AlivePdfFactory INSTANCE = new AlivePdfFactory();

    private AlivePdfFactory() {
        jsObj = Bridge.createObject("com.emitrom.flash.factories.AlivePdfFactory");
    }

    public final native JavaScriptObject createAnnotation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createAnnotation();
    }-*/;

    public final native JavaScriptObject createAnnotation(String type)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createAnnotation(type);
    }-*/;

    public final native JavaScriptObject createAnnotation(String type, String text)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createAnnotation(type, text);
    }-*/;

    public final native JavaScriptObject createAnnotation(String type, String text, double x)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createAnnotation(type, text, x);
    }-*/;

    public final native JavaScriptObject createGridCell(String text, JavaScriptObject bgColor)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createGridCell(text, bgColor);
    }-*/;

    public final native JavaScriptObject createAnnotation(String type, String text, double x, double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createAnnotation(type, text, x, y);
    }-*/;

    public final native JavaScriptObject createAnnotation(String type, String text, double x, double y, double width)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createAnnotation(type, text, x, y, width);
    }-*/;

    public final native JavaScriptObject createAnnotation(String type, String text, double x, double y, double width,
                    double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createAnnotation(type, text, x, y, width, height);
    }-*/;

    public final native JavaScriptObject createMovieAnnotation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createMovieAnnotation();
    }-*/;

    public final native JavaScriptObject createMovieAnnotation(String type)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createMovieAnnotation(type);
    }-*/;

    public final native JavaScriptObject createMovieAnnotation(String type, String text)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createMovieAnnotation(type, text);
    }-*/;

    public final native JavaScriptObject createMovieAnnotation(String type, String text, double x)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createMovieAnnotation(type, text, x);
    }-*/;

    public final native JavaScriptObject createMovieAnnotation(String type, String text, double x, double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createMovieAnnotation(type, text, x, y);
    }-*/;

    public final native JavaScriptObject createMovieAnnotation(String type, String text, double x, double y,
                    double width)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createMovieAnnotation(type, text, x, y, width);
    }-*/;

    public final native JavaScriptObject createMovieAnnotation(String type, String text, double x, double y,
                    double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createMovieAnnotation(type, text, x, y, width, height);
    }-*/;

    public final native JavaScriptObject createTextAnnotation()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextAnnotation();
    }-*/;

    public final native JavaScriptObject createTextAnnotation(String type)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextAnnotation(type);
    }-*/;

    public final native JavaScriptObject createTextAnnotation(String type, String text)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextAnnotation(type, text);
    }-*/;

    public final native JavaScriptObject createTextAnnotation(String type, String text, double x)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextAnnotation(type, text, x);
    }-*/;

    public final native JavaScriptObject createTextAnnotation(String type, String text, double x, double y)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextAnnotation(type, text, x, y);
    }-*/;

    public final native JavaScriptObject createTextAnnotation(String type, String text, double x, double y, double width)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextAnnotation(type, text, x, y, width);
    }-*/;

    public final native JavaScriptObject createTextAnnotation(String type, String text, double x, double y,
                    double width, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTextAnnotation(type, text, x, y, width, height);
    }-*/;

    public final native JavaScriptObject createCodaBar(double x, double y, String code)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createCodaBar(x, y, code);
    }-*/;

    public final native JavaScriptObject createCodaBar(double x, double y, String code, String start)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createCodaBar(x, y, code, start);
    }-*/;

    public final native JavaScriptObject createCodaBar(double x, double y, String code, String start, String end)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createCodaBar(x, y, code, start, end);
    }-*/;

    public final native JavaScriptObject createCodaBar(double x, double y, String code, String start, String end,
                    double baseWidth)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createCodaBar(x, y, code, start, end, baseWidth);
    }-*/;

    public final native JavaScriptObject createCodaBar(double x, double y, String code, String start, String end,
                    double baseWidth, double height)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createCodaBar(x, y, code, start, end, baseWidth, height);
    }-*/;

    public final native JavaScriptObject createCMYKColor(double cyan, double magenta, double yellow, double black)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createCMYKColor(cyan, magenta, yellow, black);
    }-*/;

    public final native JavaScriptObject createGrayColor(double gray)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createGrayColor(gray);
    }-*/;

    public final native JavaScriptObject createRGBColor(double color)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createRGBColor(color);
    }-*/;

    public final native JavaScriptObject doRGBColorHexStringToRGBColor(String hex)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.doRGBColorHexStringToRGBColor(hex);
    }-*/;

    public final native JavaScriptObject createSpotColor(String name, CMYKColor color)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.createSpotColor(
						name,
						color.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createDashLine(JsArrayString pattern)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createDashLine(pattern);
    }-*/;

    // public final native JavaScriptObject createGridCell(String text, IColor
    // bgColor)/*-{
    // return peer.createGridCell(text, bgColor);
    // }-*/;

    public final native JavaScriptObject createOutline(String text, int level, int pages, double y,
                    double redMultiplier, double greenMultiplier, double blueMultiplier)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createOutline(text, level, pages, y, redMultiplier,
				greenMultiplier, blueMultiplier);
    }-*/;

    public final native JavaScriptObject createPage(String orientation)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createPage(orientation);
    }-*/;

}
