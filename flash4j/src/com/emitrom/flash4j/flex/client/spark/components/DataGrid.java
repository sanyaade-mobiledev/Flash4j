/************************************************************************
  DataGrid.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.spark.components;

import com.emitrom.flash4j.flex.client.spark.components.supportClasses.SkinnableContainerBase;

/**
 * The DataGrid displays a row of column headings above a scrollable grid. The
 * grid is arranged as a collection of individual cells arranged in rows and
 * columns. The DataGrid control is designed to support smooth scrolling through
 * large numbers of rows and columns. The Spark DataGrid control is implemented
 * as a skinnable wrapper around the Spark Grid control. The Grid control
 * defines the columns of the data grid, and much of the functionality of the
 * DataGrid control itself.
 * <p>
 * The DataGrid skin is responsible for laying out the grid, column header, and
 * scroller. The skin also configures the graphic elements used to render visual
 * elements used as indicators, separators, and backgrounds. The DataGrid skin
 * also defines a default item renderer, used to display the contents of each
 * cell. Please see the documentation for the renderer class for the list of
 * supported styles.
 * <p>
 * Transitions in DataGrid item renderers aren't supported. The GridItemRenderer
 * class has disabled its transitions property so setting it will have no
 * effect.
 * 
 * 
 */
public class DataGrid extends SkinnableContainerBase {

    protected DataGrid() {

    }
}
