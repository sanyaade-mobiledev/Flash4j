/************************************************************************
  Application.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.flex.client.ui.spark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.core.client.net.FileFilter;
import com.emitrom.flash4j.core.client.net.FileReference;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Main Flex container. Flex defines a default, or Application, container that
 * lets you start adding content to your application without explicitly defining
 * another container.
 */
public class Application extends SkinnableContainer {

    private static final String FLASH4J_VERSION = "2.0";
    private static final String FLEX_VERSION = "4.6";
    private static final Application INSTANCE = new Application(Bridge.get().getRoot());

    /**
     * Instantiates a new application.
     */
    Application() {

    }

    Application(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static String getFlash4jVersion() {
        return FLASH4J_VERSION;
    }

    public static String getFlexVersion() {
        return FLEX_VERSION;
    }

    /**
     * Gets the.
     * 
     * @return the application
     */
    public static Application get() {
        return INSTANCE;
    }

    /**
     * Gets the color correction.
     * 
     * @return the color correction
     */
    public final native String getColorCorrection()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcolorCorrection();
    }-*/;

    /**
     * Sets the color correction.
     * 
     * @param value
     *            the new color correction
     */
    public final native void setColorCorrection(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcolorCorrection(value);
    }-*/;

    /**
     * Gets the controlbar content.
     * 
     * @return the controlbar content
     */
    public final List<UIComponent> getControlBarContent() {
        List<UIComponent> content = new ArrayList<UIComponent>();
        JavaScriptObject peers = _getControlbarContent();
        int size = JsoHelper.getArrayLength(peers);
        for (int i = 0; i < size; i++) {
            content.add(new UIComponent(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return content;
    }

    private final native JavaScriptObject _getControlbarContent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontrolbarContent();
    }-*/;

    /**
     * Sets the control bar content.
     * 
     * @param value
     *            the new control bar content
     */
    public final void setControlBarContent(List<UIComponent> value) {
        setControlBarContent(DataConverter.fromList(value));
    }

    /**
     * Sets the control bar content.
     * 
     * @param col
     *            the new control bar content
     */
    private final void setControlBarContent(ArrayCollection col) {
        _setControlBarContent(col.toArray().getJsObj());
    }

    /**
     * Sets the control bar content.
     * 
     * @param value
     *            the new control bar content
     */
    private final native void _setControlBarContent(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcontrolBarContent(value);
    }-*/;

    /**
     * Gets the control bar layout.
     * 
     * @return the control bar layout
     */
    public final native LayoutBase getControlBarLayout()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcontrolBarLayout();
		return @com.emitrom.flash4j.flex.client.spark.layout.supportClasses.LayoutBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the control bar layout.
     * 
     * @param value
     *            the new control bar layout
     */
    public final native void setControlBarLayout(LayoutBase value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setcontrolBarLayout(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Checks if is control bar visible.
     * 
     * @return true, if is control bar visible
     */
    public final native boolean isControlBarVisible()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcontrolBarVisible();
    }-*/;

    /**
     * Sets the control bar visible.
     * 
     * @param value
     *            the new control bar visible
     */
    public final native void setControlBarVisible(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcontrolBarVisible(value);
    }-*/;

    /**
     * Gets the frame rate.
     * 
     * @return the frame rate
     */
    public final native double getFrameRate()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getframeRate();
    }-*/;

    /**
     * Sets the frame rate.
     * 
     * @param value
     *            the new frame rate
     */
    public final native void setFrameRate(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setframeRate(value);
    }-*/;

    /**
     * Gets the page title.
     * 
     * @return the page title
     */
    public final native String getPageTitle()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpageTitle();
    }-*/;

    /**
     * Save file.
     * 
     * @param data
     *            the data
     * @param fileName
     *            the file name
     */
    public final native void saveFile(ByteArray data, String fileName)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.saveFile(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						fileName);
    }-*/;

    /**
     * Save file.
     * 
     * @param data
     *            the data
     * @param fileName
     *            the file name
     * @param message
     *            the message
     */
    public final native void saveFile(ByteArray data, String fileName, String message)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.saveFile(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						fileName, message);
    }-*/;

    /**
     * Save file.
     * 
     * @param data
     *            the data
     * @param fileName
     *            the file name
     * @param message
     *            the message
     * @param title
     *            the title
     */
    public final native void saveFile(ByteArray data, String fileName, String message, String title)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.saveFile(
						data.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						fileName, message, title);
    }-*/;

    /**
     * Save file.
     * 
     * @param data
     *            the data
     * @param fileName
     *            the file name
     */
    public final native void saveFile(String data, String fileName)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.saveFile(data, fileName);
    }-*/;

    /**
     * Save file.
     * 
     * @param data
     *            the data
     * @param fileName
     *            the file name
     * @param message
     *            the message
     */
    public final native void saveFile(String data, String fileName, String message)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.saveFile(data, fileName, message);
    }-*/;

    /**
     * Save file.
     * 
     * @param data
     *            the data
     * @param fileName
     *            the file name
     * @param message
     *            the message
     * @param title
     *            the title
     */
    public final native void saveFile(String data, String fileName, String message, String title)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.saveFile(data, fileName, message, title);
    }-*/;

    /**
     * Browse file.
     * 
     * @param filters
     *            the filters
     * @return the file reference
     */
    public final FileReference browseFile(List<FileFilter> filters) {
        return _browseFile(DataConverter.fromList(filters).toArray().getJsObj());
    }

    public final FileReference browseFile(FileFilter... filters) {
        return _browseFile(DataConverter.fromList(Arrays.asList(filters)).toArray().getJsObj());
    }

    /**
     * Browse file.
     * 
     * @param filter
     *            the filter
     * @return the file reference
     */
    private final native FileReference _browseFile(JavaScriptObject filter)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.browseFile(filter);
		return @com.emitrom.flash4j.core.client.net.FileReference::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Browse file.
     * 
     * @param filters
     *            the filters
     * @param message
     *            the message
     * @return the file reference
     */
    public final FileReference browseFile(List<FileFilter> filters, String message) {
        return _browseFile(DataConverter.fromList(filters).toArray().getJsObj(), message);
    }

    /**
     * Browse file.
     * 
     * @param filter
     *            the filter
     * @param message
     *            the message
     * @return the file reference
     */
    private final native FileReference _browseFile(JavaScriptObject filter, String message)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.browseFile(filter, message);
		return @com.emitrom.flash4j.core.client.net.FileReference::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Browse file.
     * 
     * @param filters
     *            the filters
     * @param message
     *            the message
     * @param title
     *            the title
     * @return the file reference
     */
    public final FileReference browseFile(List<FileFilter> filters, String message, String title) {
        return _browseFile(DataConverter.fromList(filters).toArray().getJsObj(), message, title);
    }

    /**
     * Browse file.
     * 
     * @param filter
     *            the filter
     * @param message
     *            the message
     * @param title
     *            the title
     * @return the file reference
     */
    private final native FileReference _browseFile(JavaScriptObject filter, String message, String title)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.browseFile(filter, fileName, message, title);
		return @com.emitrom.flash4j.core.client.net.FileReference::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the page title.
     * 
     * @param value
     *            the new page title
     */
    public final native void setpageTitle(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpageTitle(value);
    }-*/;

    /**
     * Gets the preloader chrome color.
     * 
     * @return the preloader chrome color
     */
    public final native int getPreloaderChromeColor()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getpreloaderChromeColor();
    }-*/;

    /**
     * Sets the preloader chrome color.
     * 
     * @param value
     *            the new preloader chrome color
     */
    public final native void setPreloaderChromeColor(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setpreloaderChromeColor(value);
    }-*/;

    /**
     * Gets the script recursion limit.
     * 
     * @return the script recursion limit
     */
    public final native int getScriptRecursionLimit()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscriptRecursionLimit();
    }-*/;

    /**
     * Sets the script recursion limit.
     * 
     * @param value
     *            the new script recursion limit
     */
    public final native void setScriptRecursionLimit(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscriptRecursionLimit(value);
    }-*/;

    /**
     * Gets the script time limit.
     * 
     * @return the script time limit
     */
    public final native int getScriptTimeLimit()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getscriptTimeLimit();
    }-*/;

    /**
     * Sets the script time limit.
     * 
     * @param value
     *            the new script time limit
     */
    public final native void setScriptTimeLimit(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setscriptTimeLimit(value);
    }-*/;

    /**
     * Gets the url.
     * 
     * @return the url
     */
    public final native String getUrl()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.geturl();
    }-*/;

    /**
     * Gets the version.
     * 
     * @return the version
     */
    public static String getVersion() {
        return get()._getVersion();
    }

    /**
     * _get version.
     * 
     * @return the string
     */
    private final native String _getVersion()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getVersion();
    }-*/;

}
