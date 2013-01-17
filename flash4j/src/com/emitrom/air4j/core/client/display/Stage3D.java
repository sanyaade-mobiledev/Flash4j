/************************************************************************
  Stage3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display;

import com.emitrom.air4j.core.client.display3D.Context3D;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class Stage3D extends EventDispatcher {

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.Stage3D;
	}-*/;

	protected Stage3D(JavaScriptObject obj) {
		jsObj = obj;
	}

	public Stage3D() {
		jsObj = newInstance();
	}

	/**
	 * The Context3D object associated with peer Stage3D instance.
	 * 
	 * @return
	 */
	public native Context3D getContext3D()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.context3D;
		return @com.emitrom.air4j.core.client.display3D.Context3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Specifies whether peer Stage3D object is visible.
	 * 
	 * @return
	 */
	public native boolean isVisible()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.visible;
	}-*/;

	public native void setVisible(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.visible = value;
	}-*/;

	/**
	 * The horizontal coordinate of the Stage3D display on the stage, in pixels.
	 * 
	 * @return
	 */
	public native double getX()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.x;
	}-*/;

	public native void setX(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.x = value;
	}-*/;

	/**
	 * The vertical coordinate of the Stage3D display on the stage, in pixels.
	 * 
	 * @return
	 */
	public native double getY()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.y;
	}-*/;

	public native void setY(double value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.y = value;
	}-*/;

	public native void requestContext3D()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.requestContext3D();
	}-*/;

	/**
	 * Request the creation of a Context3D object for peer Stage3D instance.
	 * 
	 * @param context3DRenderMode
	 */
	public native void requestContext3D(String context3DRenderMode)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.requestContext3D(context3DRenderMode);
	}-*/;

	private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.Stage3D();
	}-*/;

}
