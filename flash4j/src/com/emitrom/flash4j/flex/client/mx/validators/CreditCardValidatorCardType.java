/************************************************************************
  CreditCardValidatorCardType.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
 * The Enum CreditCardValidatorCardType.
 */
public enum CreditCardValidatorCardType {

    /** The AMERICA n_ express. */
    AMERICAN_EXPRESS("American Express"),
    /** The DINER s_ club. */
    DINERS_CLUB("Diners Club"),
    /** The DISCOVER. */
    DISCOVER("Discover"),
    /** The MASTE r_ card. */
    MASTER_CARD("MASTER_CARD"),
    /** The VISA. */
    VISA("visa");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new credit card validator card type.
     * 
     * @param type the type
     */
    private CreditCardValidatorCardType(String type) {
        value = type;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the credit card validator card type
     */
    public static native CreditCardValidatorCardType fromValue(String value) /*-{
		switch (value) {
		case 'American Express':
			return @com.emitrom.flash4j.flex.client.mx.validators.CreditCardValidatorCardType::AMERICAN_EXPRESS;
		case 'Diners Club':
			return @com.emitrom.flash4j.flex.client.mx.validators.CreditCardValidatorCardType::DINERS_CLUB;
		case 'Discover':
			return @com.emitrom.flash4j.flex.client.mx.validators.CreditCardValidatorCardType::DISCOVER;
		case 'MasterCard':
			return @com.emitrom.flash4j.flex.client.mx.validators.CreditCardValidatorCardType::MASTER_CARD;
		case 'visa':
			return @com.emitrom.flash4j.flex.client.mx.validators.CreditCardValidatorCardType::VISA;
		}
    }-*/;
}
