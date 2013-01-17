/************************************************************************
 * Flash4j.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.app.client;

import com.emitrom.flash4j.core.client.utils.Color;
import com.emitrom.flash4j.flex.client.core.runtime.FLEX;
import com.emitrom.flash4j.flex.client.mx.containers.Panel;
import com.emitrom.flash4j.flex.client.mx.controls.DateChooser;
import com.emitrom.flash4j.swf.client.StartHandler;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.Style.HideMode;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.CenterLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;

public class Flash4j implements EntryPoint {

    @Override
    public void onModuleLoad() {

        CenterLayoutContainer con = new CenterLayoutContainer();

        ContentPanel panel = new ContentPanel();
        panel.setHeadingText("GXT and Flex");
        panel.setCollapsible(true);
        panel.setHideMode(HideMode.OFFSETS);
        panel.setPixelSize(600, 600);

        HorizontalLayoutContainer c = new HorizontalLayoutContainer();
        c.add(getContentPanel(), new HorizontalLayoutData(-1, 1, new Margins(4)));
        c.add(getFlexContainer(), new HorizontalLayoutData(1, 1, new Margins(4, 0, 4, 0)));

        panel.setWidget(c);
        con.add(panel);

        RootPanel.get().add(con);
    }

    private ContentPanel getFlexContainer() {
        ContentPanel panel = new ContentPanel();
        panel.setHeaderVisible(false);
        panel.add(FLEX.initAsWidget(new StartHandler() {
            @Override
            public void onStart() {
                FLEX.getRootPanel().setStyle("backgroundColor", Color.GREEN.getValue());
                Panel flexPanel = new Panel("Flex Panel");
                flexPanel.setPercentSize(60, 60);
                flexPanel.setCentered();

                DateChooser dc = new DateChooser();
                dc.setCentered();
                flexPanel.addElement(dc);

                FLEX.getRootPanel().addElement(flexPanel);
            }
        }));
        return panel;
    }

    private ContentPanel getContentPanel() {
        ContentPanel panel = new ContentPanel();
        panel.setHeadingText("Left panel");
        return panel;

    }
}