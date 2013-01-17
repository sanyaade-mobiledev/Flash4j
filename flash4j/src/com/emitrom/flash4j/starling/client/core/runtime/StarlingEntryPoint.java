/************************************************************************
 * StarlingEntryPoint.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.starling.client.core.runtime;

import com.emitrom.flash4j.core.client.toplevel.Flash;
import com.emitrom.flash4j.starling.client.Starling;
import com.emitrom.flash4j.swf.client.StartHandler;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public abstract class StarlingEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        if (Flash.isInstalled() && Flash.isMinorAtLeast(StarlingPlatform.MINOR_REQUIRED_FLASH_VERSION)) {
            StarlingPlatform.init(new StartHandler() {
                @Override
                public void onStart() {
                    Starling.start();
                    onLoad();
                }
            });
        } else if (Flash.isInstalled() && !Flash.isMinorAtLeast(StarlingPlatform.MINOR_REQUIRED_FLASH_VERSION)) {
            Window.alert(StarlingPlatform.FLASH_INSTALLED_BUT_WRONG_VERSION);
        } else if (!Flash.isInstalled()) {
            Window.alert(Flash.FLASH_NOT_INSTALLED);
        }
    }

    public abstract void onLoad();
}
