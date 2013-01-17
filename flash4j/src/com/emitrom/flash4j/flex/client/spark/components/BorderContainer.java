/************************************************************************
  BorderContainer.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.components;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.graphics.IFill;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The BorderContainer class defines a set of CSS styles that control the
 * appearance of the border and background fill of the container.
 * <p>
 * Note: Because you use CSS styles and class properties to control the
 * appearance of the BorderContainer, you typically do not create a custom skin
 * for it. If you do create a custom skin, your skin class should apply any
 * styles to control the appearance of the container.
 * <p>
 * By default, the stroke of the border is rounded. If you do not want rounded
 * corners, set the joints property of the stroke to JointStyle.MITER.
 */
public class BorderContainer extends SkinnableContainer {

    /**
     * Instantiates a new border container.
     */
    BorderContainer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the border container
     */
    public BorderContainer() {
        jsObj = Bridge.createObject("spark.components.BorderContainer");
    }

    /**
     * Sets the background fill.
     * 
     * @param value the new background fill
     */
    public native void setBackgroundFill(IFill value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setbackgroundFill(value.@com.emitrom.flash4j.flex.client.mx.graphics.IFill::asIFill()());
    }-*/;

}
