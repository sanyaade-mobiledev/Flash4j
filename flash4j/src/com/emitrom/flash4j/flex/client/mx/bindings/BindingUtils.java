/************************************************************************
  BindingUtils.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.bindings;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The BindingUtils class defines utility methods for performing data binding
 * from ActionScript. You can use the methods defined in this class to configure
 * data bindings.
 */
public class BindingUtils extends ProxyObject {

    private static final BindingUtils INSTANCE = new BindingUtils();

    /**
     * New instance.
     * 
     * @return the binding utils
     */
    private BindingUtils() {
        jsObj = Bridge.createObject("mx.binding.utils.BindingUtils");
    }

    /**
     * Bind property.
     * 
     * @param site
     *            the site
     * @param property
     *            the property
     * @param host
     *            the host
     * @param chain
     *            the chain
     * @return the change wather
     */
    public static ChangeWather bindProperty(JavaScriptObject site, String property, JavaScriptObject host, Object chain) {
        return INSTANCE._bindProperty(site, property, host, chain);
    }

    public static ChangeWather bindProperty(ProxyObject site, String property, ProxyObject host, Object chain) {
        return INSTANCE._bindProperty(site.getJsObj(), property, host.getJsObj(), chain);
    }

    /**
     * _bind property.
     * 
     * @param site
     *            the site
     * @param property
     *            the property
     * @param host
     *            the host
     * @param chain
     *            the chain
     * @return the change wather
     */
    public final native ChangeWather _bindProperty(JavaScriptObject site, String property, JavaScriptObject host,
                    Object chain)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bindProperty(site, property, host, chain);
		return @com.emitrom.flash4j.flex.client.mx.bindings.ChangeWather::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Bind property.
     * 
     * @param site
     *            the site
     * @param property
     *            the property
     * @param host
     *            the host
     * @param chain
     *            the chain
     * @param commitOnly
     *            the commit only
     * @return the change wather
     */
    public static ChangeWather bindProperty(JavaScriptObject site, String property, JavaScriptObject host,
                    Object chain, boolean commitOnly) {
        return INSTANCE._bindProperty(site, property, host, chain, commitOnly);
    }

    public static ChangeWather bindProperty(ProxyObject site, String property, ProxyObject host, Object chain,
                    boolean commitOnly) {
        return INSTANCE._bindProperty(site.getJsObj(), property, host.getJsObj(), chain, commitOnly);
    }

    /**
     * _bind property.
     * 
     * @param site
     *            the site
     * @param property
     *            the property
     * @param host
     *            the host
     * @param chain
     *            the chain
     * @param commitOnly
     *            the commit only
     * @return the change wather
     */
    public final native ChangeWather _bindProperty(JavaScriptObject site, String property, JavaScriptObject host,
                    Object chain, boolean commitOnly)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bindProperty(site, property, host, chain, commitOnly);
		return @com.emitrom.flash4j.flex.client.mx.bindings.ChangeWather::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Bind property.
     * 
     * @param site
     *            the site
     * @param property
     *            the property
     * @param host
     *            the host
     * @param chain
     *            the chain
     * @param commitOnly
     *            the commit only
     * @param useWeakReference
     *            the use weak reference
     * @return the change wather
     */
    public static ChangeWather bindProperty(JavaScriptObject site, String property, JavaScriptObject host,
                    Object chain, boolean commitOnly, boolean useWeakReference) {
        return INSTANCE._bindProperty(site, property, host, chain, commitOnly, useWeakReference);
    }

    /**
     * _bind property.
     * 
     * @param site
     *            the site
     * @param property
     *            the property
     * @param host
     *            the host
     * @param chain
     *            the chain
     * @param commitOnly
     *            the commit only
     * @param useWeakReference
     *            the use weak reference
     * @return the change wather
     */
    public final native ChangeWather _bindProperty(JavaScriptObject site, String property, JavaScriptObject host,
                    Object chain, boolean commitOnly, boolean useWeakReference)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.bindProperty(site, property, host, chain, commitOnly,
				useWeakReference);
		return @com.emitrom.flash4j.flex.client.mx.bindings.ChangeWather::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
