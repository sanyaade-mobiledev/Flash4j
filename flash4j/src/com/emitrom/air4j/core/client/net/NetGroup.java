/************************************************************************
  NetGroup.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class NetGroup extends EventDispatcher {

	protected NetGroup(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.net.NetGroup;
	}-*/;

	public NetGroup(NetConnection connection, String groupSpec) {
		jsObj = newInstance(connection, groupSpec);
	}

	public native double getEstimatedMemberCount()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.estimatedMemberCount;
	}-*/;

	public native NetGroupInfo getInfo()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.info;
		return @com.emitrom.air4j.core.client.net.NetGroupInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native String getLocalCoverageFrom()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localCoverageFrom;
	}-*/;

	public native String getLocalCoverageTo()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.localCoverageTo;
	}-*/;

	public native int getNeighborCount()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.neighborCount;
	}-*/;

	private native String _getReceiveMode()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.receiveMode;
	}-*/;

	public native void setReceiveMode(String value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.receiveMode = value;
	}-*/;

	public native String getReplicationStrategy()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.replicationStrategy;
	}-*/;

	public native void setReplicationStrategy(String value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.replicationStrategy = value;
	}-*/;

	public native void addHaveObjects(int startIndex, int endIndex)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addHaveObjects(startIndex, endIndex);
	}-*/;

	public native boolean addMemberHint(String peerID)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.addMemberHint(peerID);
	}-*/;

	public native boolean addNeighbor(String peerID)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.addNeighbor(peerID);
	}-*/;

	public native void addWantObjects(int startIndex, int endIndex)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.addWantObjects(startIndex, endIndex);
	}-*/;

	public native void close()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.close();
	}-*/;

	public native String convertPeerIDToGroupAddress(String peerID)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.convertPeerIDToGroupAddress(peerID);
	}-*/;

	public native void denyRequestedObject(int requestID)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.denyRequestedObject(requestID);
	}-*/;

	public native String post(Object value)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.post(value);
	}-*/;

	public native void removeHaveObjects(int startIndex, int endIndex)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.removeHaveObjects(startIndex, endIndex);
	}-*/;

	public native void removeWantObjects(int startIndex, int endIndex)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.removeWantObjects(startIndex, endIndex);
	}-*/;

	public native String sendToAllNeighbors(Object message)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sendToAllNeighbors(message);
	}-*/;

	public native String sentToNearest(Object message, String groupAddress)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sentToNearest(message, groupAddress);
	}-*/;

	public native String sentToNeighbor(Object message, String groupAddress)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sentToNeighbor(message, groupAddress);
	}-*/;

	public native void writeRequestObject(int requestID, Object object)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.writeRequestObject(requestID, object);
	}-*/;

	private static native JavaScriptObject newInstance(
			NetConnection connection, String groupSpec)/*-{
		return new $wnd.$wnd.runtime.flash.net.NetGroup(
				connection.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
				groupSpec);
	}-*/;
}
