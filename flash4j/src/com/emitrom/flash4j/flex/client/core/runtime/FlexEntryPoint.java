/************************************************************************
 * FlexEntryPoint.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.flex.client.core.runtime;

import com.emitrom.flash4j.core.client.toplevel.Flash;
import com.emitrom.flash4j.swf.client.StartHandler;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.FontWeight;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Base class for bootstrapping a Flex application. It is recommended to extend
 * and implement the {@link #onLoad()} method.
 * 
 */
public abstract class FlexEntryPoint implements EntryPoint {

    private String loadingLabel = "Flex4j is loading ...";
    protected Label label;

    @Override
    public void onModuleLoad() {
        createLabel();
        if (Flash.isInstalled()) {
            FLEX.init(new StartHandler() {
                @Override
                public void onStart() {
                    RootPanel.get().remove(label);
                    onLoad();
                }
            });
        } else if (!Flash.isInstalled()) {
            Window.alert(Flash.FLASH_NOT_INSTALLED);
            RootPanel.get().remove(label);
        }

    }

    public abstract void onLoad();

    protected String getLoadingLabel() {
        return loadingLabel;
    }

    protected void createLabel() {
        label = new Label(getLoadingLabel());
        label.getElement().getStyle().setFontWeight(FontWeight.BOLD);
        label.getElement().getStyle().setColor("green");
        label.getElement().getStyle().setFontSize(20, Unit.PX);
        label.getElement().getStyle().setPosition(Position.RELATIVE);
        label.getElement().getStyle().setLeft(Window.getClientWidth() / 2 - 100, Unit.PX);
        RootPanel.get().add(label);
    }
}
