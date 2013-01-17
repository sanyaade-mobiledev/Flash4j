/************************************************************************
  VideoEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class VideoEvent.
 */
public class VideoEvent extends Event {

    /** The Constant BUFFERING. */
    public static final String BUFFERING = "buffering";

    /** The Constant CLOSE. */
    public static final String CLOSE = "close";

    /** The Constant COMPLETE. */
    public static final String COMPLETE = "complete";

    /** The Constant CONNECTION_ERROR. */
    public static final String CONNECTION_ERROR = "connectionError";

    /** The Constant DISCONNECTED. */
    public static final String DISCONNECTED = "disconnected";

    /** The Constant EXEC_QUEUED_CMD. */
    public static final String EXEC_QUEUED_CMD = "execQueuedCmd";

    /** The Constant LOADING. */
    public static final String LOADING = "loading";

    /** The Constant PAUSED. */
    public static final String PAUSED = "paused";

    /** The Constant PLAYHEAD_UPDATE. */
    public static final String PLAYHEAD_UPDATE = "playheadUpdate";

    /** The Constant PLAYING. */
    public static final String PLAYING = "playing";

    /** The Constant READY. */
    public static final String READY = "ready";

    /** The Constant RESIZING. */
    public static final String RESIZING = "resizing";

    /** The Constant REWIND. */
    public static final String REWIND = "rewind";

    /** The Constant REWINDING. */
    public static final String REWINDING = "rewinding";

    /** The Constant SEEKING. */
    public static final String SEEKING = "seeking";

    /** The Constant STATE_CHANGE. */
    public static final String STATE_CHANGE = "change";

    /** The Constant STOPPED. */
    public static final String STOPPED = "stopped";

    /**
     * Instantiates a new video event.
     */
    protected VideoEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the playhead time.
     * 
     * @return the playhead time
     */
    public final native double getPlayheadTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getplayheadTime();
    }-*/;

    /**
     * Gets the state.
     * 
     * @return the state
     */
    public final native String getState()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstate();
    }-*/;

    /**
     * Checks if is state responsive.
     * 
     * @return true, if is state responsive
     */
    public final native boolean isStateResponsive()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstateResponsive();
    }-*/;
}
