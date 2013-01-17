/************************************************************************
  CurrencyValidatorAlignSymbol.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.validators;

/**
 * The Enum CurrencyValidatorAlignSymbol.
 */
public enum CurrencyValidatorAlignSymbol {

    /** The ANY. */
    ANY("any"),
    /** The LEFT. */
    LEFT("left"),
    /** The RIGHT. */
    RIGHT("right");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new currency validator align symbol.
     * 
     * @param type the type
     */
    private CurrencyValidatorAlignSymbol(String type) {
        value = type;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the currency validator align symbol
     */
    public static native CurrencyValidatorAlignSymbol fromValue(String value) /*-{
		switch (value) {
		case 'any':
			return @com.emitrom.flash4j.flex.client.mx.validators.CurrencyValidatorAlignSymbol::ANY;
		case 'left':
			return @com.emitrom.flash4j.flex.client.mx.validators.CurrencyValidatorAlignSymbol::LEFT;
		case 'right':
			return @com.emitrom.flash4j.flex.client.mx.validators.CurrencyValidatorAlignSymbol::RIGHT;
		}
    }-*/;
}
