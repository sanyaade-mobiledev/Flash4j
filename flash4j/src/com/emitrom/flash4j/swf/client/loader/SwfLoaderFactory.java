/************************************************************************
  SwfLoaderFactory.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.swf.client.loader;

import com.emitrom.flash4j.core.client.utils.useragent.UserAgent;

/**
 * 
 * Loads the SwfWidgetLoader framework based on the user browser.<br/>
 * For internal use only
 * 
 */
public class SwfLoaderFactory {

    private SwfLoaderFactory() {

    }

    /**
     * get the framework loader based on the user agent.<br/>
     * Chrome, Safari, IE and Adobe AIR will will the
     * <code>FlexLoaderGeckoImpl</code> loader while the other browser will get
     * the <code>FlexLoaderWebkitImpl</code>
     * 
     * @return the browser defined frameworkloader
     */
    public static SwfLoader getLoader(String path) {
        if (UserAgent.isChrome() || UserAgent.isSafari() || UserAgent.isIE() || UserAgent.isAdobeAIR()) {
            return new SwfLoaderGeckoImpl(path);
        }
        return new SwfLoaderWebkitImpl(path);

    }

}
