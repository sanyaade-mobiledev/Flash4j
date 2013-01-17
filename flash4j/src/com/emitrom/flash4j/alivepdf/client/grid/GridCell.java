/************************************************************************
  GridCell.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.alivepdf.client.grid;

import com.emitrom.flash4j.alivepdf.client.colors.IColor;
import com.emitrom.flash4j.alivepdf.client.core.AlivePdfFactory;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GridCell.
 */
public class GridCell extends ProxyObject {

    GridCell(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param text the text
     * @param color the color
     * @return the grid cell
     */
    public GridCell(String text, IColor bgColor) {
        jsObj = AlivePdfFactory.INSTANCE.createGridCell(text, bgColor.asIColor());
    }

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public native String getText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value the new text
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Sets the color.
     * 
     * @param value the new color
     */
    public native void setColor(IColor value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setcolor(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
