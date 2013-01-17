/************************************************************************
  GroupingCollection2.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.collections;

import java.util.List;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GroupingCollection2.
 */
public class GroupingCollection2 extends HierarchicalData {

    /**
     * Instantiates a new grouping collection2.
     */
    protected GroupingCollection2(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the grouping collection2
     */
    public GroupingCollection2() {
        jsObj = Bridge.createObject("mx.collections.GroupingCollection2");
    }

    /**
     * Gets the grouping.
     * 
     * @return the grouping
     */
    public final native Grouping getGrouping()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getgrouping();
		return @com.emitrom.flash4j.flex.client.mx.collections.Grouping::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the grouping.
     * 
     * @param value the new grouping
     */
    public final native void setGrouping(Grouping value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setgrouping(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the summaries.
     * 
     * @param summaries the new summaries
     */
    public final void setSummaries(List<SummaryRow> summaries) {
        this.setSummaries(DataConverter.fromList(summaries));
    }

    /**
     * Sets the summaries.
     * 
     * @param collectionOfSummaries the new summaries
     */
    private final void setSummaries(ArrayCollection collectionOfSummaries) {
        this.setSummaries(collectionOfSummaries.toArray().getJsObj());
    }

    /**
     * Sets the summaries.
     * 
     * @param value the new summaries
     */
    private final native void setSummaries(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsummaries(value);
    }-*/;

    /**
     * Cancel refresh.
     */
    public final native void cancelRefresh()/*-{
		this.cancelRefresh();
    }-*/;

    /**
     * Refresh.
     */
    public final native void refresh()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.refresh();
    }-*/;

    /**
     * Refresh.
     * 
     * @param async the async
     */
    public final native void refresh(boolean async)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.refresh(async);
    }-*/;

    /**
     * Refresh.
     * 
     * @param async the async
     * @param dispatchCollectionEvents the dispatch collection events
     */
    public final native void refresh(boolean async, boolean dispatchCollectionEvents)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.refresh(async, dispatchCollectionEvents);
    }-*/;

}
