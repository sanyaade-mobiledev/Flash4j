/************************************************************************
  AxisLabel.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class AxisLabel.
 */
public class AxisLabel extends ProxyObject {

    /**
     * Instantiates a new axis label.
     */
    protected AxisLabel(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the axis label
     */
    public AxisLabel() {
        jsObj = Bridge.createObject("mx.charts.AxisLabel");
        setPosition(0);
        setValue(null);
        setText(null);
    }

    /**
     * Gets the position.
     * 
     * @return the position
     */
    public native double getPosition()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getposition();
    }-*/;

    /**
     * Sets the position.
     * 
     * @param value the new position
     */
    public native void setPosition(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setposition(value);
    }-*/;

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
     * Gets the value.
     * 
     * @param <T> the generic type
     * @return the value
     */
    public native <T> T getValue()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getvalue();
    }-*/;

    /**
     * Sets the value.
     * 
     * @param newValue the new value
     */
    public native void setValue(Object newValue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setvalue(newValue);
    }-*/;

    public static AxisLabel from(JavaScriptObject peer) {
        return new AxisLabel(peer);
    }

}
