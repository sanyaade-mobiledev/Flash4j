/************************************************************************
  DataConverter.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.utils;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DataConverter.
 */
public class DataConverter {

    /**
     * Instantiates a new js array converter.
     */
    private DataConverter() {

    }

    /**
     * From js array.
     * 
     * @param array
     *            the array
     * @return the array collection
     */
    public static List<? extends ProxyObject> fromJsArray(JavaScriptObject array) {

        int length = JsoHelper.arrayLength(array);
        List<ProxyObject> toReturn = new ArrayList<ProxyObject>();
        for (int i = 0; i < length; i++) {
            toReturn.add(ProxyObject.from(JsoHelper.getValueFromJavaScriptObjectArray(array, i)));
        }
        return toReturn;
    }

    public static JavaScriptObject fromList(List<? extends ProxyObject> values) {
        JavaScriptObject peers = JsoHelper.createJavaScriptArray();
        for (int i = 0; i < values.size(); i++) {
            JsoHelper.arraySet(peers, i, values.get(i).getJsObj());
        }
        return peers;
    }

}
