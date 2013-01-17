/************************************************************************
  ImageMap.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls;

import java.util.Arrays;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.controls.Image;
import com.emitrom.flash4j.flex.flexlib.client.controls.imageMapClasses.Area;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ImageMap.
 */
public class ImageMap extends Image {

    /**
     * Instantiates a new image map.
     */
    protected ImageMap(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the image map
     */
    public ImageMap() {
        jsObj = Bridge.createObject("flexlib.controls.ImageMap");
    }

    /**
     * New instance.
     * 
     * @param src
     *            the src
     * @return the image map
     */
    public ImageMap(Object src) {
        this();
        setSource(src);
    }

    /**
     * Sets the map.
     * 
     * @param areas
     *            the new map
     */

    public void setMap(java.util.List<Area> areas) {
        _setMap(DataConverter.fromList(areas).toArray().getJsObj());
    }

    public void setMap(Area... areas) {
        setMap(Arrays.asList(areas));
    }

    /**
     * _set map.
     * 
     * @param value
     *            the value
     */
    private native void _setMap(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmap(value);
    }-*/;

    /**
     * Sets the show tool tips.
     * 
     * @param value
     *            the new show tool tips
     */
    public native void setShowToolTips(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowToolTips(value);
    }-*/;

    /**
     * Show tool tips.
     * 
     * @return true, if successful
     */
    public native boolean showToolTips()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowToolTips();
    }-*/;

    /**
     * Sets the tool tip field.
     * 
     * @param value
     *            the new tool tip field
     */
    public native void setToolTipField(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settoolTipField(value);
    }-*/;

    /**
     * Gets the tool tip field.
     * 
     * @return the tool tip field
     */
    public native String getToolTipField()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettoolTipField();
    }-*/;
}
