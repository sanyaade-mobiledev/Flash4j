/************************************************************************
  PrintJobOptions.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.core.client.printing;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.utils.factories.NetFactory;

/**
 * The PrintJobOptions class contains properties to use with the options
 * parameter of the PrintJob.addPage() method. For more information about
 * addPage(), see the PrintJob class.
 */
public class PrintJobOptions extends ProxyObject {

    /**
     * New instance.
     * 
     * @return the prints the job options
     */
    public PrintJobOptions() {
        jsObj = NetFactory.INSTANCE.createPrintJobOptions();
    }

    /**
     * New instance.
     * 
     * @param printAsBitmap the print as bitmap
     * @return the prints the job options
     */
    public PrintJobOptions(boolean printAsBitmap) {
        jsObj = NetFactory.INSTANCE.createPrintJobOptions(printAsBitmap);
    }

    /**
     * Checks if is print as bitmap.
     * 
     * @return true, if successful
     */
    public native boolean IsPrintAsBitmap() /*-{
		var peer = peer.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getprintAsBitmap();
    }-*/;

    /**
     * Sets the prints the as bitmap.
     * 
     * @param value the new prints the as bitmap
     */
    public native void setPrintAsBitmap(boolean value) /*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setprintAsBitmap(value);
    }-*/;

}
