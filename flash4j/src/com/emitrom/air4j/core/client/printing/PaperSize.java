/************************************************************************
  PaperSize.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.printing;

public enum PaperSize {

    A4("A4"), A5("A5"), A6("A6"), CHOUKEI3GOU("CHOUKEI3GOU"), CHOUKEI4GOU("CHOUKEI4GOU"), ENV_10("ENV_10"), ENV_B5(
                    "ENV_B5"), ENV_C5("ENV_C5"), ENV_DL("ENV_DL"), ENV_MONARCH("ENV_MONARCH"), ENV_PERSONAL(
                    "ENV_PERSONAL"), EXECUTIVE("EXECUTIVE"), FOLIO("FOLIO"), JIS_B5("JIS_B5"), LEGAL("LEGAL"), LETTER(
                    "LETTER"), STATEMENT("STATEMENT");

    public final String value;

    private PaperSize(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.printing.PaperSize[reference];
    }-*/;

    public static native PaperSize fromValue(String value) /*-{
		switch (value) {

		case $wnd.runtime.flash.printing.PaperSize.A4:
			return @com.emitrom.air4j.core.client.printing.PaperSize::A4;

		case $wnd.runtime.flash.printing.PaperSize.A5:
			return @com.emitrom.air4j.core.client.printing.PaperSize::A5;

		case $wnd.runtime.flash.printing.PaperSize.A6:
			return @com.emitrom.air4j.core.client.printing.PaperSize::A6;

		case $wnd.runtime.flash.printing.PaperSize.CHOUKEI3GOU:
			return @com.emitrom.air4j.core.client.printing.PaperSize::CHOUKEI3GOU;

		case $wnd.runtime.flash.printing.PaperSize.CHOUKEI4GOU:
			return @com.emitrom.air4j.core.client.printing.PaperSize::CHOUKEI4GOU;

		case $wnd.runtime.flash.printing.PaperSize.ENV_10:
			return @com.emitrom.air4j.core.client.printing.PaperSize::ENV_10;

		case $wnd.runtime.flash.printing.PaperSize.ENV_B5:
			return @com.emitrom.air4j.core.client.printing.PaperSize::ENV_B5;

		case $wnd.runtime.flash.printing.PaperSize.ENV_C5:
			return @com.emitrom.air4j.core.client.printing.PaperSize::ENV_C5;

		case $wnd.runtime.flash.printing.PaperSize.END_DL:
			return @com.emitrom.air4j.core.client.printing.PaperSize::ENV_DL;

		case $wnd.runtime.flash.printing.PaperSize.ENV_MONARCH:
			return @com.emitrom.air4j.core.client.printing.PaperSize::ENV_MONARCH;

		case $wnd.runtime.flash.printing.PaperSize.ENV_PERSONAL:
			return @com.emitrom.air4j.core.client.printing.PaperSize::ENV_PERSONAL;

		case $wnd.runtime.flash.printing.PaperSize.EXECUTIVE:
			return @com.emitrom.air4j.core.client.printing.PaperSize::EXECUTIVE;

		case $wnd.runtime.flash.printing.PaperSize.FOLIO:
			return @com.emitrom.air4j.core.client.printing.PaperSize::FOLIO;

		case $wnd.runtime.flash.printing.PaperSize.JIS_B5:
			return @com.emitrom.air4j.core.client.printing.PaperSize::JIS_B5;

		case $wnd.runtime.flash.printing.PaperSize.LEGAL:
			return @com.emitrom.air4j.core.client.printing.PaperSize::LEGAL;

		case $wnd.runtime.flash.printing.PaperSize.LETTER:
			return @com.emitrom.air4j.core.client.printing.PaperSize::LETTER;

		case $wnd.runtime.flash.printing.PaperSize.STATEMENT:
			return @com.emitrom.air4j.core.client.printing.PaperSize::STATEMENT;

		}
    }-*/;

}
