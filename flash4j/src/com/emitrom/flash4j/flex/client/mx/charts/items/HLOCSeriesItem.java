/************************************************************************
  HLOCSeriesItem.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.items;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.charts.ChartItem;
import com.emitrom.flash4j.flex.client.mx.graphics.IFill;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class HLOCSeriesItem.
 */
public class HLOCSeriesItem extends ChartItem {

    /**
     * Instantiates a new hLOC series item.
     */
    protected HLOCSeriesItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the hLOC series item
     */
    public HLOCSeriesItem() {
        jsObj = Bridge.createObject("mx.charts.items.HLOCSeriesItem");
        setElement(null);
        setIndex(0);
        setItem(null);
    }

    /**
     * Gets the close.
     * 
     * @return the close
     */
    public native double getClose()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclose();
    }-*/;

    /**
     * Sets the close.
     * 
     * @param value the new close
     */
    public native void setClose(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setclose(value);
    }-*/;

    /**
     * Gets the close filter.
     * 
     * @return the close filter
     */
    public native double getCloseFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcloseFilter();
    }-*/;

    /**
     * Sets the close filter.
     * 
     * @param value the new close filter
     */
    public native void setCloseFilter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcloseFilter(value);
    }-*/;

    /**
     * Gets the close number.
     * 
     * @return the close number
     */
    public native double getCloseNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcloseNumber();
    }-*/;

    /**
     * Sets the close number.
     * 
     * @param value the new close number
     */
    public native void setCloseNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcloseNumber(value);
    }-*/;

    /**
     * Gets the close value.
     * 
     * @param <T> the generic type
     * @return the close value
     */
    public native <T> T getCloseValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcloseValue();
    }-*/;

    /**
     * Sets the close value.
     * 
     * @param value the new close value
     */
    public native void setCloseValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcloseValue(value);
    }-*/;

    /**
     * Sets the fill.
     * 
     * @param value the new fill
     */
    public native void setFill(IFill value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setfill(value.@com.emitrom.flash4j.flex.client.mx.graphics.IFill::asIFill()());
    }-*/;

    /**
     * Gets the high.
     * 
     * @return the high
     */
    public native double getHigh()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfigh();
    }-*/;

    /**
     * Sets the high.
     * 
     * @param value the new high
     */
    public native void setHigh(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethigh(value);
    }-*/;

    /**
     * Gets the high filter.
     * 
     * @return the high filter
     */
    public native double getHighFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethighFilter();
    }-*/;

    /**
     * Sets the high filter.
     * 
     * @param value the new high filter
     */
    public native void setHighFilter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethighFilter(value);
    }-*/;

    /**
     * Gets the high number.
     * 
     * @return the high number
     */
    public native double getHighNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethighNumber();
    }-*/;

    /**
     * Sets the high number.
     * 
     * @param value the new high number
     */
    public native void setHighNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethighNumber(value);
    }-*/;

    /**
     * Gets the high value.
     * 
     * @param <T> the generic type
     * @return the high value
     */
    public native <T> T getHighValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethighValue();
    }-*/;

    /**
     * Sets the high value.
     * 
     * @param value the new high value
     */
    public native void setHighValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethighValue(value);
    }-*/;

    /**
     * Gets the low.
     * 
     * @return the low
     */
    public native double getLow()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlow();
    }-*/;

    /**
     * Sets the low.
     * 
     * @param value the new low
     */
    public native void setLow(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlow(value);
    }-*/;

    /**
     * Gets the low filter.
     * 
     * @return the low filter
     */
    public native double getLowFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlowFilter();
    }-*/;

    /**
     * Sets the low filter.
     * 
     * @param value the new low filter
     */
    public native void setLowFilter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlowFilter(value);
    }-*/;

    /**
     * Gets the low number.
     * 
     * @return the low number
     */
    public native double getLowNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlowNumber();
    }-*/;

    /**
     * Sets the low number.
     * 
     * @param value the new low number
     */
    public native void setLowNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlowNumber(value);
    }-*/;

    /**
     * Sets the low value.
     * 
     * @param value the new low value
     */
    public native void setLowValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setlowValue(value);
    }-*/;

    /**
     * Gets the low value.
     * 
     * @param <T> the generic type
     * @return the low value
     */
    public native <T> T getLowValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getlowValue();
    }-*/;

    /**
     * Gets the open.
     * 
     * @return the open
     */
    public native double getOpen()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopen();
    }-*/;

    /**
     * Sets the open.
     * 
     * @param value the new open
     */
    public native void setOpen(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setopen(value);
    }-*/;

    /**
     * Gets the open filter.
     * 
     * @return the open filter
     */
    public native double getOpenFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopenFilter();
    }-*/;

    /**
     * Sets the open filter.
     * 
     * @param value the new open filter
     */
    public native void setOpenFilter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setopenFilter(value);
    }-*/;

    /**
     * Gets the open number.
     * 
     * @return the open number
     */
    public native double getOpenNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopenNumber();
    }-*/;

    /**
     * Sets the open number.
     * 
     * @param value the new open number
     */
    public native void setOpenNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setopenNumber(value);
    }-*/;

    /**
     * Sets the open value.
     * 
     * @param value the new open value
     */
    public native void setOpenValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setopenValue(value);
    }-*/;

    /**
     * Ge open value.
     * 
     * @param <T> the generic type
     * @return the t
     */
    public native <T> T geOpenValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getopenValue();
    }-*/;

    /**
     * Gets the x.
     * 
     * @return the x
     */
    public native double getX()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getx();
    }-*/;

    /**
     * Sets the x.
     * 
     * @param value the new x
     */
    public native void setX(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setx(value);
    }-*/;

    /**
     * Gets the x filter.
     * 
     * @return the x filter
     */
    public native double getXFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxFilter();
    }-*/;

    /**
     * Sets the x filter.
     * 
     * @param value the new x filter
     */
    public native void setXFilter(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxFilter(value);
    }-*/;

    /**
     * Gets the x number.
     * 
     * @return the x number
     */
    public native double getXNumber()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxNumber();
    }-*/;

    /**
     * Sets the x number.
     * 
     * @param value the new x number
     */
    public native void setXNumber(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxNumber(value);
    }-*/;

    /**
     * Sets the x value.
     * 
     * @param value the new x value
     */
    public native void setXValue(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setxValue(value);
    }-*/;

    /**
     * Gets the x value.
     * 
     * @param <T> the generic type
     * @return the x value
     */
    public native <T> T getXValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getxValue();
    }-*/;

}
