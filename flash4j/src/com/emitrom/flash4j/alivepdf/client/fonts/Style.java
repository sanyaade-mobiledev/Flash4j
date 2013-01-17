/************************************************************************
  Style.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.flash4j.alivepdf.client.fonts;

/**
 * The Enum Style.
 */
public enum Style {

    /** The BOLD. */
    BOLD("B"),
    /** The ITALIC. */
    ITALIC("I"),
    /** The BOL d_ italic. */
    BOLD_ITALIC("BI"),
    /** The NORMAL. */
    NORMAL("");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new style.
     * 
     * @param reference the reference
     */
    private Style(String reference) {
        value = reference;
    }

}
