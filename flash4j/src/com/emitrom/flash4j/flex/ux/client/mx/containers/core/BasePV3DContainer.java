/************************************************************************
  BasePV3DContainer.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers.core;

import com.emitrom.flash4j.flex.client.mx.containers.ViewStack;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class BasePV3DContainer.
 */
public class BasePV3DContainer extends ViewStack {

    /**
     * Instantiates a new base p v3 d container.
     */
    protected BasePV3DContainer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the tween duration.
     * 
     * @return the tween duration
     */
    public native int getTweenDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettweenDuration();
    }-*/;

    /**
     * Sets the tween duration.
     * 
     * @param value the new tween duration
     */
    public native void setTweenDuration(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settweenDuration(value);
    }-*/;

    /**
     * Reflection enabled.
     * 
     * @return true, if successful
     */
    public native boolean reflectionEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getreflectionEnabled();
    }-*/;

    /**
     * Sets the reflection enabled.
     * 
     * @param value the new reflection enabled
     */
    public native void setReflectionEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setreflectionEnabled(value);
    }-*/;

    /**
     * Gets the segments.
     * 
     * @return the segments
     */
    public native int getSegments()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsegments();
    }-*/;

    /**
     * Sets the segments.
     * 
     * @param value the new segments
     */
    public native void setSegments(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsegments(value);
    }-*/;

}
