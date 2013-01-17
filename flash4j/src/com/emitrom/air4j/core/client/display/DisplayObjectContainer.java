/************************************************************************
  DisplayObjectContainer.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.geom.Point;
import com.emitrom.air4j.core.client.text.TextSnapshot;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class DisplayObjectContainer extends InteractiveObject {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.DisplayContainer;
    }-*/;

    protected DisplayObjectContainer() {

    }

    protected DisplayObjectContainer(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean hasMouseChildren() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mouseChildren;
    }-*/;

    public native void mouseChildren(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.mouseChildren = value;
    }-*/;

    public native int getNumChildren() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.numChildren;
    }-*/;

    public native boolean hasTabChildren() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.tabChildren;
    }-*/;

    public native void tabChildren(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.tabChildren = value;
    }-*/;

    public native DisplayObject addChild(DisplayObject child) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.addChild(child.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native DisplayObject addChildAt(DisplayObject child, int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.addChildAt(
				child.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				index);
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean areInaccessibleObjectsUnderPoint(Point point) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.areInaccessibleObjectsUnderPoint(point.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native boolean contains(DisplayObject chlid) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.contains(child.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native DisplayObject getChildAt(int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildAt(index);
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native DisplayObject getChildByName(String name) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getChildByName(name);
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getChildIndex(DisplayObject child) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getChildIndex(child.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native JsArray<JavaScriptObject> getObjectsUnderPoint(Point point) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.getObjectsUnderPoint(point.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native DisplayObject removeChild(DisplayObject child) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer
				.removeChild(child.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native DisplayObject removeChildAt(int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.removeChildAt(index);
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setChildIndex(DisplayObject child, int index) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setChildIndex(
				child.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				index);
    }-*/;

    public native void swapChildren(DisplayObject child1, DisplayObject child2) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.swapChildren(
						child1.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						child2.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void swapChildrenAt(int index1, int index2) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.swapChildrenAt(index1, index2);
    }-*/;

    public native TextSnapshot getTextSnapshot() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.textSnapshot;
		return @com.emitrom.air4j.core.client.text.TextSnapshot::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
