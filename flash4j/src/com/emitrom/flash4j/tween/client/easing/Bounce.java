/************************************************************************
  Bounce.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.tween.client.easing;

import com.emitrom.flash4j.tween.client.core.EaseBridge;
import com.google.gwt.core.client.JavaScriptObject;

public class Bounce extends Ease {

    protected Bounce(JavaScriptObject obj) {
        super(obj);
    }

    public static final Bounce EASE_OUT = new Bounce(EaseBridge.get().getBounceEaseOut());
    public static final Bounce EASE_IN = new Bounce(EaseBridge.get().getBounceEaseIn());
    public static final Bounce EASE_IN_OUT = new Bounce(EaseBridge.get().getBounceEaseInOut());
}
