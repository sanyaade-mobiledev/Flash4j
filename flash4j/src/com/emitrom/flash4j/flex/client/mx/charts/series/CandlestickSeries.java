/************************************************************************
  CandlestickSeries.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.charts.series;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.mx.charts.chartClasses.HLOCSeriesBase;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CandlestickSeries.
 */
public class CandlestickSeries extends HLOCSeriesBase {

    /**
     * Instantiates a new candlestick series.
     */
    protected CandlestickSeries(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the candlestick series
     */
    public CandlestickSeries() {
        jsObj = Bridge.createObject("mx.charts.series.CandlestickSeries");
    }
}
