/************************************************************************
  FlexLibFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating FlexLib objects.
 */
public class FlexLibFactory extends ProxyObject {

    private static final FlexLibFactory INSTANCE = new FlexLibFactory();

    public static FlexLibFactory getInstance() {
        return INSTANCE;
    }

    /**
     * Instantiates a new flex lib factory.
     */
    private FlexLibFactory() {
        jsObj = createPeer();
    }

    /**
     * Gets the single instance of FlexLibFactory.
     * 
     * @return single instance of FlexLibFactory
     */
    private static JavaScriptObject createPeer() {
        return Bridge.createObject("com.ekambi.flexlib.factories.FlexLibFactory");
    }

    /**
     * Creates a new FlexLib object.
     * 
     * @param <T>
     *            the generic type
     * @return the T
     */
    public final native <T extends JavaScriptObject> T createSliderThumbHighlightSkin()/*-{
		return peer.createSliderThumbHighlightSkin();
    }-*/;

    /**
     * Creates a new FlexLib object.
     * 
     * @param <T>
     *            the generic type
     * @return the T
     */
    public final native <T extends JavaScriptObject> T createSliderHighlightSkin()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createSliderHighlightSkin();
    }-*/;

    /**
     * Creates a new FlexLib object.
     * 
     * @param <T>
     *            the generic type
     * @return the T
     */
    public final native <T extends JavaScriptObject> T createSliderThumbNoGripHighlightSkin()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createSliderThumbNoGripHighlightSkin();
    }-*/;

    /**
     * Creates a new FlexLib object.
     * 
     * @return the h slider
     */
    public final native JavaScriptObject createHSlider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createHSlider();
    }-*/;

    /**
     * Creates a new FlexLib object.
     * 
     * @return the v slider
     */
    public final native JavaScriptObject createVSlider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createVSlider();
    }-*/;

    /**
     * Creates a new FlexLib object.
     * 
     * @return the tree grid
     */
    public final native JavaScriptObject createTreeGrid()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.createTreeGrid();
    }-*/;

}
