/************************************************************************
  TextField.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.text;

import com.emitrom.air4j.core.client.display.DisplayObject;
import com.emitrom.air4j.core.client.display.InteractiveObject;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

public class TextField extends InteractiveObject {

    public TextField() {
        jsObj = newInstance();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.text.TextField;
    }-*/;

    protected TextField(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void alwaysShowSelection(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.alwaysShowSelection = value;
    }-*/;

    public native boolean isAlwaysShowingSelection() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.alwaysShowSelection;
    }-*/;

    public native String getAntialiasType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.antiAliasType;
    }-*/;

    public native void setAntialiasType(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.antiAliasType = value;
    }-*/;

    public TextFieldAutoSize getAutoSize() {
        return TextFieldAutoSize.fromValue(_getAutoSize());
    }

    private native String _getAutoSize() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.autoSize;
    }-*/;

    public void setAutoSize(TextFieldAutoSize size) {
        _setAutoSize(size.value);
    }

    private native void _setAutoSize(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.autoSize = value;
    }-*/;

    public native boolean hasBackground() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.background;
    }-*/;

    public native void background(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.background = value;
    }-*/;

    public native int getBackgroundColor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.backgroundColor;
    }-*/;

    public native void setBackgroundColor(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.backgroundColor = value;
    }-*/;

    public native boolean hasBorder() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.border;
    }-*/;

    public native void setBorder(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.border = value;
    }-*/;

    public native int getBorderColor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.borderColor;
    }-*/;

    public native void setBorderColor(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.borderColor = value;
    }-*/;

    public native int getBottomScrollV() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.bottomScrollV;
    }-*/;

    public native int getCaretIndex() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.caretIndex;
    }-*/;

    public native TextFormat getDefaultTextFormat() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.defaultTextFormat;
    }-*/;

    public native void setDefaultTextFormat(TextFormat value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.defaultTextFormat = value;
    }-*/;

    public native boolean isDisplayedAsPassword() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.displayAsPassowrd;
    }-*/;

    public native void displayAsPassword(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.displayAsPassowrd = value;
    }-*/;

    public native boolean isUsingEmbedFonts() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.embedFonts;
    }-*/;

    public native void embedFonts(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.embedFonts = value;
    }-*/;

    public native boolean hasCondenseWhite() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.condenseWhite;
    }-*/;

    public native void condenseWhite(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.condenseWhite = value;
    }-*/;

    public native String getGridFitType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.gridFitType;
    }-*/;

    public native void setGridFitType(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.gridFitType = value;
    }-*/;

    public native String getHTMLText() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.htmlText;
    }-*/;

    public native void setHTMLText(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.htmlText = value;
    }-*/;

    public native int getLength() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.length;
    }-*/;

    public native String getMaxChars() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.maxChars;
    }-*/;

    public native void setMaxChars(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.maxChars = value;
    }-*/;

    public native int getMaxScrollV() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.maxScrollV;
    }-*/;

    public native int getMaxScrollH() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.maxScrollH;
    }-*/;

    public native boolean hasMouseWheelEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.mouseWheelEnabled;
    }-*/;

    public native void mouseWheelEnabled(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.mouseWheelEnabled = value;
    }-*/;

    public native boolean isMultiline() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.multiline;
    }-*/;

    public native void multiline(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.multiline = value;
    }-*/;

    public native int getNumLines() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.numLines;
    }-*/;

    public native String getRestrict() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.restrict;
    }-*/;

    public native void restrict(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.restrict = value;
    }-*/;

    public native int getScrollH() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scrollH;
    }-*/;

    public native void setScrollH(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scrollH = value;
    }-*/;

    public native int getScrollV() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scrollV;
    }-*/;

    public native void setScrollV(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scrollV = value;
    }-*/;

    public native boolean isSelectable() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.selectable;
    }-*/;

    public native void setSelectable(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.selectable = value;
    }-*/;

    public native void getSelectionBeginIndex() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.selectionBeginIndex;
    }-*/;

    public native void getSelectionEndIndex() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.selectionEndIndex;
    }-*/;

    public native double getSharpness() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.sharpness;
    }-*/;

    public native void setSharpness(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.sharpness = value;
    }-*/;

    public native String getText() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.text;
    }-*/;

    public native void setText(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.text = value;
    }-*/;

    public native int getTextColor() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.textColor;
    }-*/;

    public native void setTextColor(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.textColor = value;
    }-*/;

    public native double getTextHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.textHeight;
    }-*/;

    public native double getTextWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.textWidth;
    }-*/;

    public native double getThickness() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.thickness;
    }-*/;

    public native void setThickness(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.thickness = value;
    }-*/;

    public native String getType() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.type;
    }-*/;

    public native void setType(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.type = value;
    }-*/;

    public native boolean isUsingRichTextClipboard() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.useRichTextClipboard;
    }-*/;

    public native void useRichTextClipboard(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.useRichTextClipboard = value;
    }-*/;

    public native boolean isWordWrap() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.wordWrap;
    }-*/;

    public native void setWordWrap(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.wordWrap = value;
    }-*/;

    public native void appendText(String newText) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.appendText(newText);
    }-*/;

    public native Rectangle getCharBoundaries(int charIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getCharBoundaries(charIndex);
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getCharIndexAtPoint(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getCharIndexAtPoint(x, y);
    }-*/;

    public native int getFirstCharInParagraph(int charIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getFirstCharInParagraph(charIndex);
    }-*/;

    public native DisplayObject getImageReference(String id) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getImageReference(charIndex);
		return @com.emitrom.air4j.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getLineIndexAtPoint(double x, double y) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getLineIndexAtPoint(x, y);
    }-*/;

    public native int getLineIndexOfChar(int charIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getLineIndexOfChar(charIndex);
    }-*/;

    public native int getLineLength(int lineIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getLineLength(lineIndex);
    }-*/;

    public native TextLineMetrics getLineMetrics(int lineIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getLineMetrics(lineIndex);
		return @com.emitrom.air4j.core.client.text.TextLineMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getLineOffset(int lineIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getLineOffset(lineIndex);
    }-*/;

    public native int getLineText(int lineIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getLineText(lineIndex);
    }-*/;

    public native int getParagraphLength(int charIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getParagraphLength(charIndex);
    }-*/;

    public native TextFormat getTextFormat() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getTextFormat();
		return @com.emitrom.air4j.core.client.text.TextFormat::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native TextFormat getTextFormat(int beginIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getTextFormat(beginIndex);
		return @com.emitrom.air4j.core.client.text.TextFormat::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native TextFormat getTextFormat(int beginIndex, int endIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getTextFormat(beginIndex, endIndex);
		return @com.emitrom.air4j.core.client.text.TextFormat::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean isFontCompatible(String fontName, String fontStyle) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isFontCompatible(fontName, fontStyle);
    }-*/;

    public native void replaceSelectedText(String newText) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.replaceSelectedText(newText);
    }-*/;

    public native void replaceText(int beginIndex, int endIndex, String newText) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.replaceText(beginIndex, endIndex, newText);
    }-*/;

    public native void setSelection(int beginIndex, int endIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setSelection(beginIndex, endIndex);
    }-*/;

    public native void setTextFormat(TextFormat format) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.setTextFormat(format.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void setTextFormat(TextFormat format, int beginIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.setTextFormat(
						format.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						beginIndex);
    }-*/;

    public native void setTextFormat(TextFormat format, int beginIndex, int endIndex) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.setTextFormat(
						format.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						beginIndex, endIndex);
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.text.TextField();
    }-*/;

}
