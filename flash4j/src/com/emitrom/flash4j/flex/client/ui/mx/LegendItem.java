/************************************************************************
  LegendItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.mx;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.core.IFlexDisplayObject;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class LegendItem.
 */

public class LegendItem extends UIComponent {

    /**
     * Instantiates a new legend item.
     */
    protected LegendItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the legend item
     */
    public LegendItem() {
        jsObj = Bridge.createObject("mx.charts.LegendItem");
    }

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public native String getLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlabel();
    }-*/;

    /**
     * Sets the label.
     * 
     * @param value the new label
     */
    public native void setLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabel(value);
    }-*/;

    /**
     * Sets the legend data.
     * 
     * @param value the new legend data
     */
    public native void setLegendData(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlegendData(value);
    }-*/;

    /**
     * Gets the marker.
     * 
     * @return the marker
     */
    public native UIComponent getMarker()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getmarker();
		return @com.emitrom.flash4j.flex.client.mx.core.UIComponent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the marker.
     * 
     * @param value the new marker
     */
    public native void setMarker(IFlexDisplayObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setmarker(value.@com.emitrom.flash4j.flex.client.mx.core.IFlexDisplayObject::asIFlexDisplayObject()());
    }-*/;

    /**
     * Gets the marker aspect ratio.
     * 
     * @return the marker aspect ratio
     */
    public native double getMarkerAspectRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmarkerAspectRatio();
    }-*/;

    /**
     * Sets the marker aspect ratio.
     * 
     * @param value the new marker aspect ratio
     */
    public native void setMarkerAspectRatio(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmarkerAspectRatio(value);
    }-*/;

    /**
     * Gets the source.
     * 
     * @param <T> the generic type
     * @return the source
     */
    public native <T> T getSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsource();
    }-*/;

}
