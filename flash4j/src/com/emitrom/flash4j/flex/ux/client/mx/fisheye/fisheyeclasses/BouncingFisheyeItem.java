/************************************************************************
  BouncingFisheyeItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.fisheye.fisheyeclasses;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;

/**
 * The Class BouncingFisheyeItem.
 */
public class BouncingFisheyeItem extends ProxyObject {

    /**
     * Instantiates a new bouncing fisheye item.
     */
    public BouncingFisheyeItem() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public native String getLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.label;
    }-*/;

    /**
     * Sets the label.
     * 
     * @param value
     *            the new label
     */
    public native void setLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.label = value;
    }-*/;

    /**
     * Gets the thumb.
     * 
     * @return the thumb
     */
    public native String getThumb()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.thumb;
    }-*/;

    /**
     * Sets the thumb.
     * 
     * @param value
     *            the new thumb
     */
    public native void setThumb(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.thumb = value;
    }-*/;

}
