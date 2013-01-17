/************************************************************************
  BaseModel.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Base class for all data to be displayed in data driven components
 */

public class BaseModel extends ProxyObject {

    protected Map<String, Object> map = new HashMap<String, Object>();

    public BaseModel() {
        jsObj = JsoHelper.createObject();
    }

    protected BaseModel(JavaScriptObject obj) {
        super(obj);
    }

    public <X> void set(String property, X value) {
        map.put(property, value);
        _setNative(property, value);
    }

    public void set(String property, double value) {
        map.put(property, value);
        _setNative(property, value);
    }

    public void set(String property, List<BaseModel> values) {
        map.put(property, values);
        JsArray<JavaScriptObject> rawValues = JsArray.createArray().cast();
        for (BaseModel model : values) {
            rawValues.push(model.getJsObj());
        }
        _setNative(property, rawValues);
    }

    public native String get(String property)/*-{
		var jso = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return jso[property];
    }-*/;

    public Set<String> getFields() {
        return map.keySet();
    }

    private native <X> X _setNative(String property, X value)/*-{
		var jso = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		jso[property] = value;
    }-*/;

    private native void _setNative(String property, double value)/*-{
		var jso = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		jso[property] = value;
    }-*/;

    static JsArray<JavaScriptObject> fromList(List<BaseModel> models) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (BaseModel model : models) {
            values.push(model.getJsObj());
        }
        return values;
    }

    public void update(JavaScriptObject obj) {
        jsObj = obj;
    }

    @SuppressWarnings("unchecked")
    public <X> X getFromCache(String property) {
        return (X) map.get(property);
    }

}
