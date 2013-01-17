/************************************************************************
  GroupingField.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class GroupingField.
 */
public class GroupingField extends ProxyObject {

    /**
     * Instantiates a new grouping field.
     */
    GroupingField(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the grouping field
     */
    public GroupingField() {
        jsObj = Bridge.createObject("mx.collections.GroupingField");
    }

    /**
     * Checks if is case insensitive.
     * 
     * @return true, if is case insensitive
     */
    public final native boolean isCaseInsensitive()/*-{
		return peer.getcaseInsensitive();
    }-*/;

    /**
     * Sets the case insensitive.
     * 
     * @param value the new case insensitive
     */
    public final native void setCaseInsensitive(boolean value)/*-{
		peer.setcaseInsensitive(value);
    }-*/;

    /**
     * Checks if is descending.
     * 
     * @return true, if is descending
     */
    public final native boolean isDescending()/*-{
		return peer.getdescending();
    }-*/;

    /**
     * Sets the descending.
     * 
     * @param value the new descending
     */
    public final native void setDescending(boolean value)/*-{
		peer.setdescending(value);
    }-*/;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public final native String getName()/*-{
		return peer.getname();
    }-*/;

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public final native void setName(String value)/*-{
		peer.setname(value);
    }-*/;

    /**
     * Checks if is numeric.
     * 
     * @return true, if is numeric
     */
    public final native boolean isNumeric()/*-{
		return peer.getnumeric();
    }-*/;

    /**
     * Sets the numeric.
     * 
     * @param value the new numeric
     */
    public final native void setNumeric(boolean value)/*-{
		peer.setnumeric(value);
    }-*/;

    /**
     * Sets the summaries.
     * 
     * @param summaries the new summaries
     */
    public final void setSummaries(List<SummaryField2> summaries) {
        setSummaries(DataConverter.fromList(summaries));
    }

    /**
     * Sets the summaries.
     * 
     * @param collectionOfSummaries the new summaries
     */
    private final void setSummaries(ArrayCollection collectionOfSummaries) {
        _setSummaries(collectionOfSummaries.toArray().getJsObj());
    }

    /**
     * Sets the summaries.
     * 
     * @param value the new summaries
     */
    private final native void _setSummaries(JavaScriptObject value)/*-{
		peer.setsummaries(value);
    }-*/;

}
