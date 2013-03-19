/************************************************************************
  Grid.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.ui.spark;

import com.emitrom.flash4j.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Grid control displays a list of data items called its data provider in a
 * scrollable table or "grid", one item per row. Each of the grid's columns,
 * defined by a GridColumn object, displays a value based on the item for the
 * corresponding row. The grid's data provider is mutable, meaning its items can
 * be added or removed, or changed. Similarly, the list of columns is mutable.
 * The Grid component is intended to be used as a DataGrid skin part, or as an
 * element of other custom composite components. Therefore, it is not skinnable,
 * it does not include a scroller or scrollbars, and it does not provide default
 * mouse or keyboard event handling.
 * 
 * <p>
 * Each visible Grid cell is displayed by a GridItemRenderer instance created by
 * using the itemRenderer property. specify an item renderer for each column.
 * Before it is displayed, each item renderer instance is configured with the
 * value of the data provider item for that row. Item renderers are created as
 * needed and then, to keep creation overhead to a minimum, pooled and recycled.
 * <p>
 * The Grid control supports selection, according the selectionMode property.
 * The set of selected row or cell indices can be modified or queried
 * programatically using the selection methods, such as setSelectedIndex or
 * selectionContainsIndex().
 * <p>
 * The Grid control displays hover, caret, and selection indicators based on the
 * selectionMode property and the corresponding row index and column index
 * properties, such as hoverRowIndex and columnRowIndex. An indicator can be any
 * visual element. Indicators that implement IGridVisualElement can configure
 * themselves according to the row and column in which they are used.
 * <p>
 * The Grid control supports smooth scrolling. Their vertical and horizontal
 * scroll positions define the pixel origin of the visible part of the grid and
 * the grid's layout only displays as many cell item renderers as are needed to
 * fill the available space.
 * <p>
 * The Grid control supports variable height rows that automatically compute
 * their height based on the item renderers' contents. This support is called
 * grid virtualization because the mapping from (pixel) scroll positions to row
 * and column indices is typically based on incomplete information about the
 * preferred sizes for grid cells. The Grid caches the computed heights of rows
 * that have been scrolled into view and estimates the rest based on a single
 * typicalItem.
 * <p>
 * Transitions in DataGrid item renderers aren't supported. The GridItemRenderer
 * class has disabled its transitions property so setting it will have no
 * effect.
 */
public class Grid extends Group {

    /**
     * Instantiates a new group.
     */
    Grid(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the group
     */
    public Grid() {
        jsObj = Bridge.createObject("spark.components.Grid");
    }

    // TODO Finish me

}
