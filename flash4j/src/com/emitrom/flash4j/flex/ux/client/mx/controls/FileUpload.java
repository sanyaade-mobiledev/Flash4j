/************************************************************************
  FileUpload.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.controls;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.containers.Panel;
import com.emitrom.flash4j.flex.client.mx.controls.Button;
import com.emitrom.flash4j.flex.client.mx.controls.DataGrid;
import com.emitrom.flash4j.flex.client.mx.controls.ProgressBar;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FileUpload.
 */
public class FileUpload extends Panel {

    /**
     * Instantiates a new file upload.
     */
    protected FileUpload(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the file upload
     */
    public FileUpload() {
        jsObj = Bridge.createObject("com.flashdev.file.FileUpload");
    }

    /**
     * Gets the file grid.
     * 
     * @return the file grid
     */
    public native DataGrid getFileGrid()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getlistFiles();
		return @com.emitrom.flash4j.flex.client.mx.controls.DataGrid::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the adds the button.
     * 
     * @return the adds the button
     */
    public native Button getAddButton()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbtnAdd();
		return @com.emitrom.flash4j.flex.client.mx.controls.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the removes the button.
     * 
     * @return the removes the button
     */
    public native Button getRemoveButton()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbtnRemove();
		return @com.emitrom.flash4j.flex.client.mx.controls.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the progress bar.
     * 
     * @return the progress bar
     */
    public native ProgressBar getProgressBar()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getprogBar();
		return @com.emitrom.flash4j.flex.client.mx.controls.ProgressBar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the cancel button.
     * 
     * @return the cancel button
     */
    public native Button getCancelButton()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbtnCancel();
		return @com.emitrom.flash4j.flex.client.mx.controls.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the upload button.
     * 
     * @return the upload button
     */
    public native Button getUploadButton()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbtnUpload();
		return @com.emitrom.flash4j.flex.client.mx.controls.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the view button.
     * 
     * @return the view button
     */
    public native Button getViewButton()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbtnView();
		return @com.emitrom.flash4j.flex.client.mx.controls.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the upload url.
     * 
     * @param value
     *            the new upload url
     */
    public native void setUploadUrl(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setuploadUrl(value);
    }-*/;

}
