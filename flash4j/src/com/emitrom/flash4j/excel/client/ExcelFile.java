/************************************************************************
  ExcelFile.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.excel.client;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.emitrom.flash4j.flex.client.spark.components.Application;

/**
 * The Class ExcelFile.
 */
public class ExcelFile extends ProxyObject {

    /**
     * New instance.
     * 
     * @return the excel file
     */
    public ExcelFile() {
        jsObj = Bridge.createObject("com.as3xls.xls.ExcelFile");
    }

    /**
     * Adds the sheet.
     * 
     * @param s
     *            the s
     */
    public native void addSheet(Sheet sheet) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getsheets()
				.addItem(
						sheet.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Gets the sheet at.
     * 
     * @param index
     *            the index
     * @return the sheet at
     */
    public native Sheet getSheetAt(int index) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsheets().getItemAt(index);
    }-*/;

    /**
     * Gets the main sheet.
     * 
     * @return the main sheet
     */
    public Sheet getMainSheet() {
        return getSheetAt(0);
    }

    /**
     * Gets the sheet count.
     * 
     * @return the sheet count
     */
    public native int getSheetCount() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsheets().getLenght();
    }-*/;

    /**
     * Save to byte array.
     * 
     * @return the byte array
     */
    public native ByteArray saveToByteArray() /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.saveToByteArray();
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Load from byte array.
     * 
     * @param xls
     *            the xls
     */
    public native void loadFromByteArray(ByteArray xls) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.loadFromByteArray(xls.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Saves the PDF file
     */
    public void save() {
        Application.get().saveFile(this.saveToByteArray(), "File.xls");
    }

    /**
     * Saves the PDF file
     * 
     * @param fileName
     *            , the name of the file to save
     */
    public void save(String fileName) {
        Application.get().saveFile(this.saveToByteArray(), fileName);
    }

}
