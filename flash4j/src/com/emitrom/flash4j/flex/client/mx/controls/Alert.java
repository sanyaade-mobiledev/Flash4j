/************************************************************************
  Alert.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls;

import com.emitrom.flash4j.core.client.display.Sprite;
import com.emitrom.flash4j.core.client.events.handlers.EventHandler;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.containers.Panel;
import com.emitrom.flash4j.flex.client.mx.events.CloseEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Alert.
 */
public class Alert extends Panel {

    private static final Alert INSTANCE = new Alert(Bridge.createObject("mx.controls.Alert"));

    /** The Constant CANCEL. */
    public static final int CANCEL = 0x008;

    /** The Constant NO. */
    public static final int NO = 0x002;

    /** The Constant NONMODAL. */
    public static final int NONMODAL = 0x800;

    /** The Constant OK. */
    public static final int OK = 0x004;

    /** The Constant YES. */
    public static final int YES = 0x001;

    /**
     * Instantiates a new alert.
     */
    Alert(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the single instance of Alert.
     * 
     * @return single instance of Alert
     */
    private static Alert getInstance() {
        return INSTANCE;
    }

    /**
     * Show.
     * 
     * @return the alert
     */
    public static Alert show() {
        return Alert.getInstance().showMessage();
    }

    /**
     * Show message.
     * 
     * @return the alert
     */
    private final native Alert showMessage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.show();
		return @com.emitrom.flash4j.flex.client.mx.controls.Alert::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Show.
     * 
     * @param text
     *            the text
     * @return the alert
     */
    public static Alert show(String text) {
        return Alert.getInstance().showMessage(text);
    }

    /**
     * Show message.
     * 
     * @param text
     *            the text
     * @return the alert
     */
    private final native Alert showMessage(String text)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.show(text);
		return @com.emitrom.flash4j.flex.client.mx.controls.Alert::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Show.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @return the alert
     */
    public static Alert show(String text, String title) {
        return Alert.getInstance().showMessage(text, title);
    }

    /**
     * Show message.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @return the alert
     */
    private final native Alert showMessage(String text, String title)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.show(text, title);
		return @com.emitrom.flash4j.flex.client.mx.controls.Alert::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Show.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @param flags
     *            the flags
     * @return the alert
     */
    public static Alert show(String text, String title, int flags) {
        return Alert.getInstance().showMessage(text, title, flags);
    }

    /**
     * Show message.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @param flags
     *            the flags
     * @return the alert
     */
    private final native Alert showMessage(String text, String title, int flags)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.show(text, title, flags);
		return @com.emitrom.flash4j.flex.client.mx.controls.Alert::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Show.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @param flags
     *            the flags
     * @param parent
     *            the parent
     * @return the alert
     */
    public static Alert show(String text, String title, int flags, Sprite parent) {
        return Alert.getInstance().showMessage(text, title, flags, parent);
    }

    /**
     * Show message.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @param flags
     *            the flags
     * @param parent
     *            the parent
     * @return the alert
     */
    private final native Alert showMessage(String text, String title, int flags, Sprite parent)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.show(
						text,
						title,
						flags,
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.flash4j.flex.client.mx.controls.Alert::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);

    }-*/;

    /**
     * Show.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @param flags
     *            the flags
     * @param parent
     *            the parent
     * @param iconClass
     *            the icon class
     * @return the alert
     */
    public static Alert show(String text, String title, int flags, Sprite parent, JavaScriptObject iconClass) {
        return Alert.getInstance().showMessage(text, title, flags, parent, iconClass);
    }

    /**
     * Shows a confirm message
     * 
     * @param message
     *            , the message to display
     * @return this
     */
    public static Alert confirm(String message) {
        return Alert.show(message, "", Alert.NO | Alert.YES);
    }

    /**
     * Shows a confirm message
     * 
     * @param message
     *            , the message to display
     * @param title
     *            , the title of the message
     * @return
     */
    public static Alert confirm(String message, String title) {
        return Alert.show(message, title, Alert.NO | Alert.YES);
    }

    /**
     * Shows a confirm message
     * 
     * @param message
     *            , the message to display
     * @param title
     *            , the title of the message
     * @param closeHandler
     *            , the handler to execute when the alert dialog is closed
     * @return
     */
    public static Alert confirm(String message, String title, EventHandler closeHandler) {
        Alert alert = Alert.show(message, title, Alert.NO | Alert.YES);
        alert.addEventHandler(CloseEvent.CLOSE, closeHandler);
        return alert;
    }

    /**
     * Show message.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @param flags
     *            the flags
     * @param parent
     *            the parent
     * @param iconClass
     *            the icon class
     * @return the alert
     */
    private final native Alert showMessage(String text, String title, int flags, Sprite parent,
                    JavaScriptObject iconClass)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.show(
						text,
						title,
						flags,
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						null, iconClass);
		return @com.emitrom.flash4j.flex.client.mx.controls.Alert::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Show.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @param flags
     *            the flags
     * @param parent
     *            the parent
     * @param iconClass
     *            the icon class
     * @param defaultButtonFlag
     *            the default button flag
     * @return the alert
     */
    public static Alert show(String text, String title, int flags, Sprite parent, JavaScriptObject iconClass,
                    int defaultButtonFlag) {
        return Alert.getInstance().showMessage(text, title, flags, parent, iconClass, defaultButtonFlag);
    }

    /**
     * Show message.
     * 
     * @param text
     *            the text
     * @param title
     *            the title
     * @param flags
     *            the flags
     * @param parent
     *            the parent
     * @param iconClass
     *            the icon class
     * @param defaultButtonFlag
     *            the default button flag
     * @return the alert
     */
    private final native Alert showMessage(String text, String title, int flags, Sprite parent,
                    JavaScriptObject iconClass, int defaultButtonFlag)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.show(
						text,
						title,
						flags,
						parent.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						null, iconClass, defaultButtonFlag);
		return @com.emitrom.flash4j.flex.client.mx.controls.Alert::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the button flags.
     * 
     * @return the button flags
     */
    public final native int getButtonFlags()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbuttonFlags();
    }-*/;

    /**
     * Sets the button flags.
     * 
     * @param value
     *            the new button flags
     */
    public final native void setButtonFlags(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbuttonFlags(value);
    }-*/;

    /**
     * Gets the button width.
     * 
     * @return the button width
     */
    public static double getButtonWidth() {
        return Alert.getInstance()._getButtonWidth();
    }

    /**
     * _get button width.
     * 
     * @return the double
     */
    private final native double _getButtonWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbuttonWidth();
    }-*/;

    /**
     * Sets the button width.
     * 
     * @param value
     *            the new button width
     */
    public static void setButtonWidth(double value) {
        Alert.getInstance()._setButtonWidth(value);
    }

    /**
     * _set button width.
     * 
     * @param value
     *            the value
     */
    private final native void _setButtonWidth(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbuttonWidth(value);
    }-*/;

    /**
     * Gets the button height.
     * 
     * @return the button height
     */
    public static double getButtonHeight() {
        return Alert.getInstance()._getButtonHeight();
    }

    /**
     * _get button height.
     * 
     * @return the double
     */
    private final native double _getButtonHeight()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbuttonHeight();
    }-*/;

    /**
     * Sets the button height.
     * 
     * @param value
     *            the new button height
     */
    public static void setButtonHeight(double value) {
        Alert.getInstance()._setButtonHeight(value);
    }

    /**
     * _set button height.
     * 
     * @param value
     *            the value
     */
    private final native void _setButtonHeight(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setbuttonHeight(value);
    }-*/;

    /**
     * Gets the cancel label.
     * 
     * @return the cancel label
     */
    public static String getCancelLabel() {
        return Alert.getInstance()._getCancelLabel();
    }

    /**
     * _get cancel label.
     * 
     * @return the string
     */

    private final native String _getCancelLabel()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcancelLabel();
    }-*/;

    /**
     * Sets the cancel label.
     * 
     * @param value
     *            the new cancel label
     */
    public static void setCancelLabel(String value) {
        Alert.getInstance()._setCancelLabel(value);
    }

    /**
     * _set cancel label.
     * 
     * @param value
     *            the value
     */
    private final native void _setCancelLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcancelLabel(value);
    }-*/;

    /**
     * Gets the default button flag.
     * 
     * @return the default button flag
     */
    public final native int getDefaultButtonFlag()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getdefaultButtonFlag();
    }-*/;

    /**
     * Sets the default button flag.
     * 
     * @param value
     *            the new default button flag
     */
    public final native void setDefaultButtonFlag(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setdefaultButtonFlag(value);
    }-*/;

    /**
     * Sets the icon class.
     * 
     * @param value
     *            the new icon class
     */
    public final native void setIconClass(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.seticonClass(value);
    }-*/;

    /**
     * Gets the no label.
     * 
     * @return the no label
     */
    public static String getNoLabel() {
        return Alert.getInstance()._getNoLabel();
    }

    /**
     * _get no label.
     * 
     * @return the string
     */
    private final native String _getNoLabel()/*-{
		return peer.getnoLabel();
    }-*/;

    /**
     * Sets the no label.
     * 
     * @param value
     *            the new no label
     */
    public static void setNoLabel(String value) {
        Alert.getInstance()._setNoLabel(value);
    }

    /**
     * _set no label.
     * 
     * @param value
     *            the value
     */
    private final native void _setNoLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setnoLabel(value);
    }-*/;

    /**
     * Gets the ok label.
     * 
     * @return the ok label
     */
    public static String getOkLabel() {
        return Alert.getInstance()._getOkLabel();
    }

    /**
     * _get ok label.
     * 
     * @return the string
     */
    private final native String _getOkLabel()/*-{
		return peer.getokLabel();
    }-*/;

    /**
     * Sets the ok label.
     * 
     * @param value
     *            the new ok label
     */
    public static void setOkLabel(String value) {
        Alert.getInstance()._setOklabel(value);
    }

    /**
     * _set oklabel.
     * 
     * @param value
     *            the value
     */
    private final native void _setOklabel(String value)/*-{
		peer.setokLabel(value);
    }-*/;

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public final native String getText()/*-{
		return peer.gettext();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value
     *            the new text
     */
    public final native void setText(String value)/*-{
		peer.settext(value);
    }-*/;

    /**
     * Gets the yes label.
     * 
     * @return the yes label
     */
    public static String getYesLabel() {
        return Alert.getInstance()._getYesLabel();
    }

    /**
     * _get yes label.
     * 
     * @return the string
     */
    private final native String _getYesLabel()/*-{
		return peer.getyesLabel();
    }-*/;

    /**
     * Sets the yes label.
     * 
     * @param value
     *            the new yes label
     */
    public static void setYesLabel(String value) {
        Alert.getInstance()._setYesLabel(value);
    }

    /**
     * _set yes label.
     * 
     * @param value
     *            the value
     */
    private final native void _setYesLabel(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setyesLabel(value);
    }-*/;

}
