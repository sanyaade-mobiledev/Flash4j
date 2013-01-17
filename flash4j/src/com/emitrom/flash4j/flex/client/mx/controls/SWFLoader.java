/************************************************************************
  SWFLoader.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.controls;

import com.emitrom.flash4j.core.client.display.DisplayObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.core.client.system.LoaderContext;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SWFLoader.
 */
public class SWFLoader extends UIComponent {

    /**
     * Instantiates a new sWF loader.
     */
    protected SWFLoader(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the sWF loader
     */
    public SWFLoader() {
        jsObj = Bridge.createObject("mx.controls.SWFLoader");
    }

    /**
     * Auto load.
     * 
     * @return true, if successful
     */
    public native boolean autoLoad()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getautoLoad();
    }-*/;

    /**
     * Sets the auto load.
     * 
     * @param vaue the new auto load
     */
    public native void setAutoLoad(boolean vaue)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setautoLoad(vaue);
    }-*/;

    /**
     * Gets the bytes loaded.
     * 
     * @return the bytes loaded
     */
    public native double getBytesLoaded()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    /**
     * Gets the bytes total.
     * 
     * @return the bytes total
     */
    public native double getBytesTotal()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getbytesTotal();
    }-*/;

    /**
     * Child allows parent.
     * 
     * @return true, if successful
     */
    public native boolean childAllowsParent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getchildAllowsParent();
    }-*/;

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public native DisplayObject getContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcontent();
		return @com.emitrom.flash4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the content width.
     * 
     * @return the content width
     */
    public native double getContentWidth()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontentWidth();
    }-*/;

    /**
     * Gets the loader context.
     * 
     * @return the loader context
     */
    public native LoaderContext getLoaderContext()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getloaderContext();
		return @com.emitrom.flash4j.core.client.system.LoaderContext::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the loader context.
     * 
     * @param value the new loader context
     */
    public native void setLoaderContext(LoaderContext value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setloaderContext(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Load for compability.
     * 
     * @return true, if successful
     */
    public native boolean loadForCompability()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getloadForCompability();
    }-*/;

    /**
     * Sets the load for compability.
     * 
     * @param value the new load for compability
     */
    public native void setLoadForCompability(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setloadForCompability(value);
    }-*/;

    /**
     * Maintain aspect ratio.
     * 
     * @return true, if successful
     */
    public native boolean maintainAspectRatio()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getmaintainAspectRatio();
    }-*/;

    /**
     * Sets the maintain aspect ratio.
     * 
     * @param value the new maintain aspect ratio
     */
    public native void setMaintainAspectRatio(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setmaintainAspectRatio(value);
    }-*/;

    /**
     * Parent allows child.
     * 
     * @return true, if successful
     */
    public native boolean parentAllowsChild()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getparentAllowsChild();
    }-*/;

    /**
     * Gets the percent loaded.
     * 
     * @return the percent loaded
     */
    public native double getPercentLoaded()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpercentLoaded();
    }-*/;

    /**
     * Scale content.
     * 
     * @return true, if successful
     */
    public native boolean scaleContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscaleContent();
    }-*/;

    /**
     * Sets the scale content.
     * 
     * @param value the new scale content
     */
    public native void setScaleContent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscaleContent(value);
    }-*/;

    /**
     * Show busy cursor.
     * 
     * @return true, if successful
     */
    public native boolean showBusyCursor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getshowBusyCursor();
    }-*/;

    /**
     * Sets the show busy cursor.
     * 
     * @param value the new show busy cursor
     */
    public native void setShowBusyCursor(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setshowBusyCursor(value);
    }-*/;

    /**
     * Smooth bitmap content.
     * 
     * @return true, if successful
     */
    public native boolean smoothBitmapContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsmoothBitmapContent();
    }-*/;

    /**
     * Sets the smooth bitmap content.
     * 
     * @param value the new smooth bitmap content
     */
    public native void setSmoothBitmapContent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsmoothBitmapContent(value);
    }-*/;

    /**
     * Gets the source.
     * 
     * @param <T> the generic type
     * @return the source
     */
    public native <T> T getSource()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsource();
    }-*/;

    /**
     * Sets the source.
     * 
     * @param value the new source
     */
    public native void setSource(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsource(value);
    }-*/;

    /**
     * Trust content.
     * 
     * @return true, if successful
     */
    public native boolean trustContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettrustContent();
    }-*/;

    /**
     * Sets the trust conent.
     * 
     * @param value the new trust conent
     */
    public native void setTrustConent(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settrustConent(value);
    }-*/;

    /**
     * Gets the visible application rect.
     * 
     * @return the visible application rect
     */
    public native Rectangle getVisibleApplicationRect()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getVisibleApplicationRect();
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the visible application rect.
     * 
     * @param allApplications the all applications
     * @return the visible application rect
     */
    public native Rectangle getVisibleApplicationRect(boolean allApplications)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getVisibleApplicationRect(allApplications);
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Load.
     */
    public native void load()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.load();
    }-*/;

    /**
     * Load.
     * 
     * @param source the source
     */
    public native void load(Object source)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.load(source);
    }-*/;

    /**
     * Unload and stop.
     */
    public native void unloadAndStop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.unloadAndStop();
    }-*/;

    /**
     * Unload and stop.
     * 
     * @param invokeGarbageCollector the invoke garbage collector
     */
    public native void unloadAndStop(boolean invokeGarbageCollector)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.unloadAndStop(invokeGarbageCollector);
    }-*/;

}
