/************************************************************************
  FileUploadEvent.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Class FileUploadEvent.
 */
public class FileUploadEvent extends Event {

    /** The Constant UPLOAD_IO_ERROR. */
    public static final String UPLOAD_IO_ERROR = "uploadIOError";

    /** The Constant UPLOAD_COMPLETE. */
    public static final String UPLOAD_COMPLETE = "uploadComplete";

    /** The Constant UPLOAD_PROGRESS. */
    public static final String UPLOAD_PROGRESS = "uploadProgress";

    /** The Constant UPLOAD_CANCEL. */
    public static final String UPLOAD_CANCEL = "uploadCancel";

    /** The Constant UPLOAD_SECURITY_ERROR. */
    public static final String UPLOAD_SECURITY_ERROR = "uploadSecurityError";

    /**
     * Instantiates a new file upload event.
     */
    protected FileUploadEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static FileUploadEvent cast(Event event) {
        return new FileUploadEvent(event.getJsObj());
    }

}
