/************************************************************************
  GroupSpecifier.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.net;

import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class GroupSpecifier extends ProxyObject {

	public GroupSpecifier(String name) {
		jsObj = newInstance(name);
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.GroupSpecifier;
	}-*/;

	protected GroupSpecifier(JavaScriptObject obj) {
		jsObj = obj;
	}

	public native boolean hasIpMulticastMemberUpdatesEnabled()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.ipMulticastMemberUpdatesEnabled;
	}-*/;

	public native void setIpMulticastMemberUpdatesEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.ipMulticastMemberUpdatesEnabled = value;
	}-*/;

	public native boolean isMulticastEnabled()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.multicastEnabled;
	}-*/;

	public native void setMulticastEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.multicastEnabled = value;
	}-*/;

	public native boolean isObejctReplicationEnabled()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.objectReplicationEnabled;
	}-*/;

	public native void setObjectReplicationEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.objectReplicationEnabled = value;
	}-*/;

	public native boolean isPeerToPeerDisabled()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.peerToPeerDisabled;
	}-*/;

	public native void setPeerToPeerDisabled(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.peerToPeerDisabled = value;
	}-*/;

	public native boolean isPostingEnabled()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.postingEnabled;
	}-*/;

	public native void setPostingEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.postingEnabled = value;
	}-*/;

	public native boolean isRootEnabled()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.rootingEnabled;
	}-*/;

	public native void setRootingEnabled(boolean value)/*-{
		peer.rootingEnabled = value;
	}-*/;

	public native boolean isServerChannelEnabled()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.serverChannelEnabled;
	}-*/;

	public native void setServerChannelEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.serverChannelEnabled = value;
	}-*/;

	public native void addBootStrapPeer(String peerID)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addBootstrapPeer(peerID);
		;
	}-*/;

	public native void addIPMulticastAddress(String address)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addIPMulticastAddress(address);
	}-*/;

	public native void addIPMulticastAddress(String address, Object port)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addIPMulticastAddress(address, port)
	}-*/;

	public native void addIPMulticastAddrees(String address, Object port,
			String source)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addIPMulticastAddrees(address, port, source);
	}-*/;

	public native String getAuthorizations()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.authorizations();
	}-*/;

	public static native String encodeBootStrapPeerIDSpec(String peerID)/*-{
		return $wnd.runtime.flash.net.GroupSpecifier
				.encodeBootStrapPeerSpec(peerID)
	}-*/;

	public static native String encodeIPMulticasAdressSpec(String address)/*-{
		return $wnd.runtime.flash.net.GroupSpecifier
				.encodeBootstrapPeerSpec(address)
	}-*/;

	public static native String encodeIPMulticasAdressSpec(String address,
			Object port)/*-{
		return $wnd.runtime.flash.net.GroupSpecifier.encodeBootstrapPeerSpec(
				address, port)
	}-*/;

	public static native String encodeIPMulticasAdressSpec(String address,
			Object port, String source)/*-{
		return $wnd.runtime.flash.net.GroupSpecifier.encodeBootstrapPeerSpec(
				address, port, source)
	}-*/;

	public static native String encodePostingAuthorization(String password)/*-{
		return $wnd.runtime.flash.net.GroupSpecifier
				.encodePostingAuthorization(password)
	}-*/;

	public static native String encodePublishAuthorization(String password)/*-{
		return $wnd.runtime.flash.net.GroupSpecifier
				.encodePublishAuthorization(password)
	}-*/;

	public native String groupSpecWithAuthorizations()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.groupspecWithAuthorizations()
	}-*/;

	public native String groupSpecWithoutAuthorizations()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.groupspecWithoutAuthorizations()
	}-*/;

	public native void makeUnique()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.makeUnique()
	}-*/;

	public native void setPostingPassword()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setPostingPassword()
	}-*/;

	public native void setPostingPassword(String password)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setPostingPassword(password)
	}-*/;

	public native void setPostingPassword(String passwordn, String salt)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setPostingPassword(password, salt)
	}-*/;

	public native void setPublishPassword()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setPublishPassword()
	}-*/;

	public native void setPublishPassword(String password)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setPublishPassword(password)
	}-*/;

	public native void setPublishPassword(String passwordn, String salt)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setPublishPassword(password, salt)
	}-*/;

	private static native JavaScriptObject newInstance(String name) /*-{
		return new $wnd.runtime.flash.net.GroupSpecifier(name);
	}-*/;
}
