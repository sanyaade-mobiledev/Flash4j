/************************************************************************
  ButtonBase.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.components.supportClasses;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ButtonBase.
 */
public class ButtonBase extends SkinnableComponent {

    /**
     * Instantiates a new button base.
     */
    ButtonBase(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the button base
     */
    public ButtonBase() {
        jsObj = Bridge.createObject("spark.components.supportClasses.ButtonBase");
    }

    /**
     * Auto repeat.
     * 
     * @return true, if successful
     */
    public native boolean autoRepeat()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoRepeat();
    }-*/;

    /**
     * Sets the auto repeat.
     * 
     * @param value the new auto repeat
     */
    public native void setAutoRepeat(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoRepeat(value);
    }-*/;

    /**
     * Gets the content.
     * 
     * @param <T> the generic type
     * @return the content
     */
    public native <T> T getContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontent();
    }-*/;

    /**
     * Sets the content.
     * 
     * @param value the new content
     */
    public native void setContent(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcontent(value);
    }-*/;

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
     * Sticky highlighting.
     * 
     * @return true, if successful
     */
    public native boolean stickyHighlighting()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstickyHighlighting();
    }-*/;

    /**
     * Sets the sticky highlighting.
     * 
     * @param value the new sticky highlighting
     */
    public native void setStickyHighlighting(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstickyHighlighting(value);
    }-*/;

}
