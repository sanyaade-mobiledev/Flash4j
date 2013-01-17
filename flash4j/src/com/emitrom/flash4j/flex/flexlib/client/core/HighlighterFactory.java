/************************************************************************
  HighlighterFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.core;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.text.TextField;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Highlighter objects.
 */
public class HighlighterFactory extends JavaScriptObject {

    /**
     * Instantiates a new highlighter factory.
     */
    protected HighlighterFactory() {

    }

    /**
     * Gets the single instance of HighlighterFactory.
     * 
     * @return single instance of HighlighterFactory
     */
    public static HighlighterFactory getInstance() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.HighLighterFactory");
    }

    /**
     * Creates a new Highlighter object.
     * 
     * @param textField
     *            the text field
     * @return the high lighter
     */
    public final native JavaScriptObject createHighLighter(TextField textField)/*-{
		return this
				.createHighLighter(textField.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Creates a new Highlighter object.
     * 
     * @param textField
     *            the text field
     * @param color
     *            the color
     * @return the high lighter
     */
    public final native JavaScriptObject createHighLighter(TextField textField, int color)/*-{
		return this
				.createHighLighter(
						textField.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						color);
    }-*/;

    /**
     * Creates a new Highlighter object.
     * 
     * @param textField
     *            the text field
     * @param color
     *            the color
     * @param xOffset
     *            the x offset
     * @return the high lighter
     */
    public final native JavaScriptObject createHighLighter(TextField textField, int color, double xOffset)/*-{
		return this
				.createHighLighter(
						textField.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						color, xOffset);
    }-*/;

    /**
     * Creates a new Highlighter object.
     * 
     * @param textField
     *            the text field
     * @param color
     *            the color
     * @param xOffset
     *            the x offset
     * @param yOffset
     *            the y offset
     * @return the high lighter
     */
    public final native JavaScriptObject createHighLighter(TextField textField, int color, double xOffset,
                    double yOffset)/*-{
		return this
				.createHighLighter(
						textField.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						color, xOffset, yOffset);
    }-*/;

}
