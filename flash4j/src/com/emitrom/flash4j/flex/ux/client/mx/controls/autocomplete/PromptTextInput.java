/************************************************************************
 * PromptTextInput.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.controls.autocomplete;

import com.emitrom.flash4j.flex.client.ui.mx.HBox;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PromptTextInput.
 */
public class PromptTextInput extends HBox {

    /**
     * Instantiates a new prompt text input.
     */
    protected PromptTextInput(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Sets the text padding.
     * 
     * @param value
     *            the new text padding
     */
    public native void setTextPadding(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settextPadding(value);
    }-*/;

    /**
     * Sets the prompt.
     * 
     * @param value
     *            the new prompt
     */
    public native void setPrompt(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprompt(value);
    }-*/;

    /**
     * Sets the enable clear action.
     * 
     * @param value
     *            the new enable clear action
     */
    public native void setEnableClearAction(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenableClearAction(value);
    }-*/;

    /**
     * Sets the enable prompt.
     * 
     * @param value
     *            the new enable prompt
     */
    public native void setEnablePrompt(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenablePrompt(value);
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
     * Gets the selection begin index.
     * 
     * @return the selection begin index
     */
    public native int getSelectionBeginIndex()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getselectionBeginIndex();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value
     *            the new text
     */
    public native void setText(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Sets the text selected.
     * 
     * @param value
     *            the new text selected
     */
    public native void setTextSelected(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settextSelected(value);
    }-*/;

    /**
     * Sets the draw focus border.
     * 
     * @param value
     *            the new draw focus border
     */
    public native void setDrawFocusBorder(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setDrawFocusBorder(value);
    }-*/;

    /**
     * Sets the text focus.
     */
    public native void setTextFocus()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setTextFocus();
    }-*/;

    /**
     * Checks if is cursor at beginning.
     * 
     * @return true, if is cursor at beginning
     */
    public native boolean isCursorAtBeginning()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isCursorAtBeginning();
    }-*/;

    /**
     * Checks if is cursor at end.
     * 
     * @return true, if is cursor at end
     */
    public native boolean isCursorAtEnd()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isCursorAtEnd();
    }-*/;

    /**
     * Sets the cursor position.
     * 
     * @param value
     *            the new cursor position
     */
    public native void setCursorPosition(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setCursorPosition(value);
    }-*/;

}
