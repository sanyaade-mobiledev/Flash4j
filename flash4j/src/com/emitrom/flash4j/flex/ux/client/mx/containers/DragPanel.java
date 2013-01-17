/************************************************************************
  DragPanel.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.ux.client.mx.containers;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.containers.Panel;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DragPanel.
 */
public class DragPanel extends Panel {

    /**
     * Instantiates a new drag panel.
     */
    protected DragPanel(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the drag panel
     */
    public DragPanel() {
        jsObj = Bridge.createObject("com.rictus.dragpanel.DragPanel");
        setWidth(300);
        setHeight(300);
    }

    /**
     * New instance.
     * 
     * @param title the title
     * @return the drag panel
     */
    public DragPanel(String title) {
        this();
        setTitle(title);
    }

}
