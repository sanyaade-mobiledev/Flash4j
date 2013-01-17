/************************************************************************
  AxisLabelSet.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.charts.AxisLabel;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * The Class AxisLabelSet.
 */
public class AxisLabelSet extends ProxyObject {

    /**
     * Instantiates a new axis label set.
     */
    protected AxisLabelSet(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the axis label set
     */
    public AxisLabelSet() {
        jsObj = Bridge.createObject("mx.charts.chartClasses.AxisLabelSet");
    }

    /**
     * Checks if is accurate.
     * 
     * @return true, if is accurate
     */
    public native boolean isAccurate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getaccurate();
    }-*/;

    /**
     * Sets the accurate.
     * 
     * @param value the new accurate
     */
    public native void setAccurate(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setaccurate(value);
    }-*/;

    /**
     * Sets the labels.
     * 
     * @param labels the new labels
     */
    public void setLabels(List<AxisLabel> labels) {
        setLabels(DataConverter.fromList(labels));
    }

    /**
     * Sets the labels.
     * 
     * @param collection the new labels
     */
    private void setLabels(ArrayCollection collection) {
        _setLabels(collection.toArray().getJsObj());
    }

    /**
     * Sets the labels.
     * 
     * @param labels the new labels
     */
    private native void _setLabels(JavaScriptObject labels)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlabels(labels);
    }-*/;

    /**
     * Gets the labels.
     * 
     * @return the labels
     */
    public List<AxisLabel> getLabels() {
        List<AxisLabel> toReturn = new ArrayList<AxisLabel>();
        JavaScriptObject peers = _getLabels();
        int size = JsoHelper.getAs3ArrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(AxisLabel.from(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getLabels()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getLlabels();
    }-*/;

    /**
     * Gets the minor ticks.
     * 
     * @return the minor ticks
     */
    public native JsArrayNumber getMinorTicks()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getminorTicks();
    }-*/;

    /**
     * Sets the minor ticks.
     * 
     * @param values the new minor ticks
     */
    public native void setMinorTicks(JsArrayNumber values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setminorTicks(values);
    }-*/;

    /**
     * Gets the ticks.
     * 
     * @return the ticks
     */
    public native JsArrayNumber getTicks()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getticks();
    }-*/;

    /**
     * Sets the ticks.
     * 
     * @param values the new ticks
     */
    public native void setTicks(JsArrayNumber values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.setticks(values);
    }-*/;

}
