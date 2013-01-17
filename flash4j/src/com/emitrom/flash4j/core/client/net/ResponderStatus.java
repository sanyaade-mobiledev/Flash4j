/************************************************************************
  ResponderStatus.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.core.client.net;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ResponderStatus.
 */
public abstract class ResponderStatus {

    /** The jso peer. */
    final JavaScriptObject jsoPeer = createPeer(this);

    /**
     * Creates the peer.
     * 
     * @param s the s
     * @return the java script object
     */
    private static native JavaScriptObject createPeer(ResponderStatus s)/*-{
		return function() {
			listener.@com.emitrom.flash4j.core.client.net.ResponderStatus::onStatus()();
		};
    }-*/;

    /**
     * On status.
     */
    public abstract void onStatus();

}
