/************************************************************************
 * PositionedTabNavigator.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom
 * LLC
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
package com.emitrom.flash4j.flex.ux.client.mx.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.containers.ViewStack;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PositionedTabNavigator.
 */
public class PositionedTabNavigator extends ViewStack {

    /** The Constant TOP_LEFT. */
    public static final String TOP_LEFT = "topLeft";

    /** The Constant TOP_RIGHT. */
    public static final String TOP_RIGHT = "topRight";

    /** The Constant BOTTOM_LEFT. */
    public static final String BOTTOM_LEFT = "bottomLeft";

    /** The Constant BOTTOM_RIGHT. */
    public static final String BOTTOM_RIGHT = "bottomRight";

    /**
     * Instantiates a new positioned tab navigator.
     */
    protected PositionedTabNavigator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the positioned tab navigator
     */
    public PositionedTabNavigator() {
        jsObj = Bridge.createObject("ws.tink.mx.containers.PositionedTabNavigator");

    }

    /**
     * Sets the horizontal gap.
     * 
     * @param value
     *            the new horizontal gap
     */
    public final void setHorizontalGap(double value) {
        this.setStyle("horizontalGap", Double.toString(value));
    }

    /**
     * Gets the horizontap gap.
     * 
     * @return the horizontap gap
     */
    public final double getHorizontapGap() {
        Double d = this.getStyle("horizontalGap");
        return d.doubleValue();
    }

    /**
     * Sets the tag height.
     * 
     * @param value
     *            the new tag height
     */
    public final void setTagHeight(double value) {
        this.setStyle("tabHeight", Double.toString(value));
    }

    /**
     * Gets the tab height.
     * 
     * @return the tab height
     */
    public final double getTabHeight() {
        Double d = this.getStyle("tabHeight");
        return d.doubleValue();
    }

    /**
     * Sets the tag width.
     * 
     * @param value
     *            the new tag width
     */
    public final void setTabWidth(double value) {
        this.setStyle("tabWidth", Double.toString(value));
    }

    /**
     * Gets the tab width.
     * 
     * @return the tab width
     */
    public final double getTabWidth() {
        Double d = this.getStyle("tabWidth");
        return d.doubleValue();
    }

    /**
     * Sets the tag offsett.
     * 
     * @param value
     *            the new tag offsett
     */
    public final void setTagOffsett(double value) {
        this.setStyle("tabOffsett", Double.toString(value));
    }

    /**
     * Gets the tab offsett.
     * 
     * @return the tab offsett
     */
    public final double getTabOffsett() {
        Double d = this.getStyle("tabOffset");
        return d.doubleValue();
    }

    /**
     * Sets the tab position.
     * 
     * @param value
     *            the new tab position
     */
    public final void setTabPosition(String value) {
        this.setStyle("tabPosition", value);
    }

    /**
     * Gets the tab position.
     * 
     * @return the tab position
     */
    public final String getTabPosition() {
        return this.getStyle("tabPosition");
    }

}
