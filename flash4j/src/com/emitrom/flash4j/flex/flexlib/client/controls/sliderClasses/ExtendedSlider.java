/************************************************************************
  ExtendedSlider.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls.sliderClasses;

import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.flexlib.client.baseClasses.SliderBase;
import com.emitrom.flash4j.flex.flexlib.client.core.FlexLibFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ExtendedSlider.
 */
public class ExtendedSlider extends SliderBase {

    /** The Constant SLIDER_HIGHLIGHT_SKIN. */
    public static JavaScriptObject SLIDER_HIGHLIGHT_SKIN = FlexLibFactory.getInstance().createSliderHighlightSkin();

    /** The Constant SLIDER_THUMB_HIGHLIGHT_SKIN. */
    public static JavaScriptObject SLIDER_THUMB_HIGHLIGHT_SKIN = FlexLibFactory.getInstance()
                    .createSliderThumbHighlightSkin();

    /** The Constant SLIDER_THUMB_NOGRIP_HIGHLIGHT_SKIN. */
    public static JavaScriptObject SLIDER_THUMB_NOGRIP_HIGHLIGHT_SKIN = FlexLibFactory.getInstance()
                    .createSliderThumbNoGripHighlightSkin();

    /**
     * Instantiates a new extended slider.
     */
    protected ExtendedSlider(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected ExtendedSlider() {
        super();
    }

    /**
     * Gets the drag hit area.
     * 
     * @return the drag hit area
     */
    public native UIComponent getDragHitArea()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdragHitArea();
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the lock regions while dragging.
     * 
     * @param value
     *            the new lock regions while dragging
     */
    public native void setLockRegionsWhileDragging(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlockRegionsWhileDragging(value);
    }-*/;

    /**
     * Lock regions while dragging.
     * 
     * @return true, if successful
     */
    public native boolean lockRegionsWhileDragging()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlockRegionsWhileDragging();
    }-*/;

}
