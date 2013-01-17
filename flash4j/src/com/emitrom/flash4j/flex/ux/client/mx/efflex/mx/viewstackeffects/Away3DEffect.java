/************************************************************************
  Away3DEffect.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.efflex.mx.viewstackeffects;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Away3DEffect.
 */
public class Away3DEffect extends ViewStackEffect {

    /**
     * Instantiates a new away3 d effect.
     */
    protected Away3DEffect(JavaScriptObject obj) {
        jsObj = obj;
    }

    protected Away3DEffect() {

    }

    /**
     * Gets the zoom.
     * 
     * @return the zoom
     */
    public native double getZoom()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getZoom();
    }-*/;

    /**
     * Sets the zoom.
     * 
     * @param value
     *            the new zoom
     */
    public native void setZoom(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setzoom(value);
    }-*/;

    /**
     * Gets the focus.
     * 
     * @return the focus
     */
    public native double getFocus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfocus();
    }-*/;

    /**
     * Sets the focus.
     * 
     * @param value
     *            the new focus
     */
    public native void setFocus(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfocus(value);
    }-*/;

}
