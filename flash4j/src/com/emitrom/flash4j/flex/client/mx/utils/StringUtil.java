/************************************************************************
  StringUtil.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.utils;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class StringUtil.
 */
public class StringUtil extends ProxyObject {

    private static final StringUtil INSTANCE = new StringUtil(Bridge.createObject("mx.utils.StringUtil"));

    /**
     * Instantiates a new string util.
     */
    protected StringUtil(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the string util
     */
    private static StringUtil get() {
        return INSTANCE;
    }

    /**
     * Checks if is white space.
     * 
     * @param characters the characters
     * @return true, if is white space
     */
    public static boolean isWhiteSpace(String characters) {
        return get()._isWhiteSpace(characters);
    }

    /**
     * _is white space.
     * 
     * @param characters the characters
     * @return true, if successful
     */
    private final native boolean _isWhiteSpace(String characters)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.isWhiteSpace(characters);
    }-*/;

    /**
     * Repeat.
     * 
     * @param str the str
     * @param n the n
     * @return the string
     */
    public static String repeat(String str, int n) {
        return get()._repeat(str, n);
    }

    /**
     * _repeat.
     * 
     * @param str the str
     * @param n the n
     * @return the string
     */
    private final native String _repeat(String str, int n)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.repeat(str, n);
    }-*/;

    /**
     * Restrict.
     * 
     * @param str the str
     * @param restrict the restrict
     * @return the string
     */
    public static String restrict(String str, String restrict) {
        return get()._restrict(str, restrict);
    }

    /**
     * _restrict.
     * 
     * @param str the str
     * @param restrict the restrict
     * @return the string
     */
    private final native String _restrict(String str, String restrict)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.restrict(str, restrict);
    }-*/;

    /**
     * Trim.
     * 
     * @param str the str
     * @return the string
     */
    public static String trim(String str) {
        return get()._trim(str);
    }

    /**
     * _trim.
     * 
     * @param str the str
     * @return the string
     */
    private final native String _trim(String str)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.trim(str);
    }-*/;

    /**
     * Trim array elements.
     * 
     * @param value the value
     * @param delimiter the delimiter
     * @return the string
     */
    public static String trimArrayElements(String value, String delimiter) {
        return get()._trimArrayElements(value, delimiter);
    }

    /**
     * _trim array elements.
     * 
     * @param value the value
     * @param delimiter the delimiter
     * @return the string
     */
    private final native String _trimArrayElements(String value, String delimiter)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.trimArrayElements(value, delimiter);
    }-*/;

    /**
     * Substitute.
     * 
     * @param str the str
     * @param rest the rest
     * @return the string
     */
    public static String substitute(String str, String... rest) {
        return get()._substitute(str, rest);
    }

    /**
     * _substitute.
     * 
     * @param str the str
     * @param rest the rest
     * @return the string
     */
    private final native String _substitute(String str, String... rest)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.substitute.apply(str, rest);
    }-*/;

}
