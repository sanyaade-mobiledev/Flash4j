/************************************************************************
 * Button.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.starling.client.display;

import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A simple button composed of an image and, optionally, text. You can pass a
 * texture for up- and downstate of the button. If you do not provide a down
 * state, the button is simply scaled a little when it is touched. In addition,
 * you can overlay a text on the button. To customize the text, almost the same
 * options as those of text fields are provided. In addition, you can move the
 * text to a certain position with the help of the textBounds property.
 * 
 * <p>
 * To react on touches on a button, there is special triggered-event type. Use
 * this event instead of normal touch events - that way, users can cancel button
 * activation by moving the mouse/finger away from the button before releasing.
 * </p>
 * 
 * 
 */
public class Button extends DisplayObjectContainer {

    public Button(Texture upState) {
        jsObj = StarlingObjectFactory.INSTANCE.createButton(upState, "");
    }

    public Button(Texture upState, String text) {
        jsObj = StarlingObjectFactory.INSTANCE.createButton(upState, text);
    }

    public Button(Texture upState, String text, Texture downState) {
        jsObj = StarlingObjectFactory.INSTANCE.createButton(upState, text, downState);
    }

    Button(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The alpha value of the button when it is disabled.
     * 
     * @param value
     */
    public native void setAlphaWhenDisabled(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setalphaWhenDisabled(value);
    }-*/;

    public native double getAlphaWhenDisabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getalphaWhenDisabled();
    }-*/;

    /**
     * The texture that is displayed while the button is touched.
     * 
     * @param value
     * @return
     */
    public native void setDownState(Texture value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setdownState(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native Texture getDownState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getdownState();
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Indicates if the button can be triggered.
     * 
     * @return
     */
    public native boolean isEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getenabled();
    }-*/;

    public native void setEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenabled(value);
    }-*/;

    /**
     * Indicates if the font should be bold.
     * 
     * @return
     */
    public native boolean isFontBold()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontBold();
    }-*/;

    public native void setFontBold(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontBold(value);
    }-*/;

    /**
     * The color of the font.
     * 
     * @param value
     */
    public native void setFontColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontColor(value);
    }-*/;

    public native int getFontColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontColor();
    }-*/;

    /**
     * The name of the font displayed on the button.
     * 
     * @param value
     */
    public native void setFontName(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontName(value);
    }-*/;

    public native String getFontName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontName();
    }-*/;

    /**
     * The size of the font.
     * 
     * @param value
     */
    public native void setFontSize(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfontSize(value);
    }-*/;

    public native double getFontSize()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfontSize();
    }-*/;

    /**
     * The scale factor of the button on touch.
     * 
     * @param value
     */
    public native void setScaleWhenDown(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleWhenDown(value);
    }-*/;

    public native double getScaleWhenDown()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleWhenDown();
    }-*/;

    /**
     * The text that is displayed on the button.
     * 
     * @param value
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    public native String getText()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * The bounds of the textfield on the button.
     * 
     * @param value
     */
    public native void setTextBounds(Rectangle value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settextBounds(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native Rectangle getTextBounds()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettextBounds();
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The texture that is displayed when the button is not being touched.
     * 
     * @param value
     */
    public native void setUpState(Texture value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setupState(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native Texture getUpState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getupState();
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static Button cast(DisplayObject obj) {
        return new Button(obj.getJsObj());
    }

}
