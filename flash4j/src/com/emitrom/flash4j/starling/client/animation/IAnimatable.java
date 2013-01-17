/************************************************************************
  IAnimatable.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.starling.client.animation;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The IAnimatable interface describes objects that are animated depending on
 * the passed time. Any object that implements this interface can be added to a
 * juggler.
 * <p>
 * When an object should no longer be animated, it has to be removed from the
 * juggler. To do this, you can manually remove it via the method
 * juggler.remove(object), or the object can request to be removed by
 * dispatching a Starling event with the type Event.REMOVE_FROM_JUGGLER. The
 * "Tween" class is an example of a class that dispatches such an event; you
 * don't have to remove tweens manually from the juggler.
 * 
 * @author Ekambi
 * 
 */
public interface IAnimatable {
    public JavaScriptObject asIAnimatable();
}
