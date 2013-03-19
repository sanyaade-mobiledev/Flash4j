/************************************************************************
 * Bridge.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/

package com.emitrom.flash4j.core.client.framework;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * Represents the bridge between GWT and the FlashDetect word. Creates
 * FlashDetect Object from GWT
 */
public class Bridge extends JavaScriptObject {

    protected Bridge() {
    }

    /**
     * Gets the bridge instance
     * 
     * @return the FlashDetect bridge
     */
    public static native Bridge get()/*-{
		return ($wnd.FABridge["Flash4j"]);
    }-*/;

    private final native JavaScriptObject create(String id) /*-{
		//preventing from calling the constructor of DisplayObjectContainer
		if (id != "flash.display.DisplayObjectContainer") {
			return this.create(id);
		}
		return null;
    }-*/;

    private final native JavaScriptObject create(String id, JsArrayString args) /*-{
		return this.create(id, args);
    }-*/;

    private final native JavaScriptObject create(String id, JsArray<JavaScriptObject> args) /*-{
		return this.create(id, args);
    }-*/;

    /**
     * gets the class reference of the object with the given id
     * 
     * @param id
     *            the id
     * @return the java script object
     */
    public final native JavaScriptObject classRef(String id) /*-{
		return this.classRef(id);
    }-*/;

    /**
     * Gets the root of the flash application
     * 
     * @return the root
     */
    public final native JavaScriptObject getRoot() /*-{
		return this.root();
    }-*/;

    /**
     * Creates a flash object with the given id
     * 
     * @param <T>
     *            the generic type
     * @param id
     *            the id
     * @return the t
     */
    public static <T extends JavaScriptObject> T createObject(String id) {
        return get().create(id).cast();
    }

    /**
     * Debug.
     * 
     * @param id
     *            the id
     * @return the string
     */
    public final native String debug(String id)/*-{
		$wnd.console.log('creating :  ' + id);
		var o = this.create(id);
		$wnd.console.log(o);
		for ( var v in o) {
			$wnd.console.log('- : ' + v);
		}
    }-*/;

}
