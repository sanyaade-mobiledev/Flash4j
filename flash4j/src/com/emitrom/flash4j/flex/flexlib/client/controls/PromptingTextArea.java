/************************************************************************
  PromptingTextArea.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.flexlib.client.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.controls.TextArea;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PromptingTextArea.
 */
public class PromptingTextArea extends TextArea {

    /**
     * Instantiates a new prompting text area.
     */
    protected PromptingTextArea(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param prompt
     *            the prompt
     * @return the prompting text area
     */
    public PromptingTextArea(String prompt) {
        this();
        setPrompt(prompt);
    }

    /**
     * New instance.
     * 
     * @return the prompting text area
     */
    public PromptingTextArea() {
        jsObj = Bridge.createObject("flexlib.controls.PromptingTextArea");
    }

    /**
     * Gets the prompt.
     * 
     * @return the prompt
     */
    public native String getPrompt()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getprompt();
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
     * Gets the prompt format.
     * 
     * @return the prompt format
     */
    public native String getPromptFormat()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpromptFormat();
    }-*/;

    /**
     * Sets the prompt format.
     * 
     * @param value
     *            the new prompt format
     */
    public native void setPromptFormat(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpromptFormat(value);
    }-*/;
}
