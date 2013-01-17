/************************************************************************
  FlexEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.events;

import com.emitrom.flash4j.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FlexEvent.
 */
public class FlexEvent extends Event {

    /** The Constant ADD. */
    public static final String ADD = "add";

    /** The Constant ADD_FOCUS_MANAGER. */
    public static final String ADD_FOCUS_MANAGER = "addFocusManager";

    /** The Constant APPLICATION_COMPLETE. */
    public static final String APPLICATION_COMPLETE = "applicationComplete";

    /** The Constant BUTTON_DOWN. */
    public static final String BUTTON_DOWN = "buttonDown";

    /** The Constant CHANGE_END. */
    public static final String CHANGE_END = "changeEnd";

    /** The Constant CHANGE_START. */
    public static final String CHANGE_START = "changeStart";

    /** The Constant CHANGING. */
    public static final String CHANGING = "changing";

    /** The Constant CONTENT_CREATION_COMPLETE. */
    public static final String CONTENT_CREATION_COMPLETE = "contentCreationComplete";

    /** The Constant CREATION_COMPLETE. */
    public static final String CREATION_COMPLETE = "creationComplete";

    /** The Constant CURSOR_UPDATE. */
    public static final String CURSOR_UPDATE = "cursorUpdate";

    /** The Constant DATA_CHANGE. */
    public static final String DATA_CHANGE = "dataChange";

    /** The Constant ENTER. */
    public static final String ENTER = "enter";

    /** The Constant ENTER_FRAME. */
    public static final String ENTER_FRAME = "enterFrame";

    /** The Constant ENTER_STATE. */
    public static final String ENTER_STATE = "enterState";

    /** The Constant EXIT_STATE. */
    public static final String EXIT_STATE = "exitState";

    /** The Constant FLEX_WINDOW_ACTIVATE. */
    public static final String FLEX_WINDOW_ACTIVATE = "flexWindowActivate";

    /** The Constant FLEX_WINDOW_DEACTIVATE. */
    public static final String FLEX_WINDOW_DEACTIVATE = "flexWindowDeactivate";

    /** The Constant HIDE. */
    public static final String HIDE = "hide";

    /** The Constant INIT_COMPLETE. */
    public static final String INIT_COMPLETE = "initComplete";

    /** The Constant INITIALIZE. */
    public static final String INITIALIZE = "initialize";

    /** The Constant INIT_PROGRESS. */
    public static final String INIT_PROGRESS = "intProgress";

    /** The Constant INVALID. */
    public static final String INVALID = "invalid";

    /** The Constant LOADING. */
    public static final String LOADING = "loading";

    /** The Constant MUTED_CHANGE. */
    public static final String MUTED_CHANGE = "mutedChange";

    /** The Constant PREINITIALIZE. */
    public static final String PREINITIALIZE = "preinitialize";

    /** The Constant REMOVE. */
    public static final String REMOVE = "remove";

    /** The Constant RENDER. */
    public static final String RENDER = "render";

    /** The Constant REPEAT. */
    public static final String REPEAT = "repeat";

    /** The Constant REPEAT_END. */
    public static final String REPEAT_END = "repeatEnd";

    /** The Constant REPEAT_START. */
    public static final String REPEAT_START = "repeatStart";

    /** The Constant SELECTION_CHANGE. */
    public static final String SELECTION_CHANGE = "selectionChange";

    /** The Constant SHOW. */
    public static final String SHOW = "show";

    /** The Constant TRANSFORM_CHANGE. */
    public static final String TRANSFORM_CHANGE = "transformChange";

    /** The Constant UPDATE_CHANGE. */
    public static final String UPDATE_CHANGE = "updateChange";

    /** The Constant UPDATE_COMPLETE. */
    public static final String UPDATE_COMPLETE = "updateComplete";

    /** The Constant URL_CHANGED. */
    public static final String URL_CHANGED = "urlChanged";

    /** The Constant VALID. */
    public static final String VALID = "valid";

    /** The Constant VALUE_COMMIT. */
    public static final String VALUE_COMMIT = "valueCommit";

    /**
     * Instantiates a new flex event.
     */
    protected FlexEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static FlexEvent cast(Event event) {
        return new FlexEvent(event.getJsObj());
    }

}
