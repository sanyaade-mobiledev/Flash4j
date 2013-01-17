/************************************************************************
  ChartElement.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.chartClasses;

import com.emitrom.flash4j.core.client.display.Sprite;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.toplevel.As3Array;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ChartElement.
 */
public class ChartElement extends DualStyleObject {

    /**
     * Instantiates a new chart element.
     */
    protected ChartElement(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the chart element
     */
    public ChartElement() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.ChartElement");
    }

    /**
     * Sets the chart data provider.
     * 
     * @param value
     *            the new chart data provider
     */

    public void setChartDataProvider(ArrayCollection provider) {
        setChartDataProvider(provider.toArray().getJsObj());
    }

    public void setChartDataProvider(As3Array provider) {
        setChartDataProvider(provider.getJsObj());
    }

    public final native void setChartDataProvider(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setchartDataProvider(value);
    }-*/;

    /**
     * Gets the data provider.
     * 
     * @param <T>
     *            the generic type
     * @return the data provider
     */
    public final native JavaScriptObject getDataProvider()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdataProvider();
    }-*/;

    /**
     * Sets the data provider.
     * 
     * @param value
     *            the new data provider
     */
    public final native void setDataProvider(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdataProvider(value);
    }-*/;

    /**
     * Gets the data transform.
     * 
     * @return the data transform
     */
    public final native DataTransform getDataTransform()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdataTransform();
		return @com.emitrom.flash4j.flex.client.mx.charts.chartClasses.DataTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the data transform.
     * 
     * @param value
     *            the new data transform
     */
    public final native void setDataTransform(DataTransform value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setdataTransform(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the label container.
     * 
     * @return the label container
     */
    public final native Sprite getLabelContainer()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getlabelContainer();
		return @com.emitrom.flash4j.core.client.display.Sprite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
