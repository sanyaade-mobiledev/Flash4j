/************************************************************************
  ShaderEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
/*
 * Copyright 2010 Alain Ekambi
 */
package com.emitrom.flash4j.core.client.events;

import com.emitrom.flash4j.core.client.display.BitmapData;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ShaderEvent.
 */
public class ShaderEvent extends Event {

    /**
     * Instantiates a new shader event.
     */
    protected ShaderEvent() {

    }

    public native BitmapData getBitmapData()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbitmapData();
		return @com.emitrom.flash4j.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native ByteArray getByteArray()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getbyteArray();
		return @com.emitrom.flash4j.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    ShaderEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static ShaderEvent cast(Event event) {
        return new ShaderEvent(event.getJsObj());
    }

}
