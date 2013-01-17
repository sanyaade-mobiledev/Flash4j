/************************************************************************
  ComboBoxEntry.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls.comboxClasses;

import com.emitrom.flash4j.core.client.data.BaseModel;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class for entries in a ComboBox
 */
public class ComboBoxEntry extends BaseModel {

	public ComboBoxEntry() {
		super();
	}

	protected ComboBoxEntry(JavaScriptObject obj) {
		jsObj = obj;
	}

	public ComboBoxEntry(String label, String data) {
		this();
		setLabel(label);
		setData(data);
	}

	public void setLabel(String value) {
		set("label", value);
	}

	public void setData(String value) {
		set("data", value);
	}

	public String getLabel() {
		return get("label");
	}

	public static ComboBoxEntry from(JavaScriptObject obj) {
		return new ComboBoxEntry(obj);
	}

	public String getData() {
		return get("data");
	}

}
