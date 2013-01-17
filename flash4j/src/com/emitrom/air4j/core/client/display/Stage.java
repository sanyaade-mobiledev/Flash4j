/************************************************************************
  Stage.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.display;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.air4j.core.client.JsoHelper;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.emitrom.air4j.core.client.media.StageVideo;
import com.google.gwt.core.client.JavaScriptObject;

public class Stage extends DisplayObjectContainer {

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.Stage;
    }-*/;

    protected Stage() {
    }

    protected Stage(JavaScriptObject obj) {
        jsObj = obj;
    }

    public ColorCorrection getColorCorrection() {
        return ColorCorrection.fromValue(_getColorCorrection());
    }

    private native String _getColorCorrection() /*-{
		return peer.colorCorrection;
    }-*/;

    public void setColorCorrection(ColorCorrection colorCorrection) {
        _setColorCorrection(colorCorrection.value);
    }

    private native void _setColorCorrection(String colorCorrection) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.colorCorrection = colorCorrection;
    }-*/;

    public ColorCorrectionSupport getColorCorrectionSupport() {
        return ColorCorrectionSupport.fromValue(_getColorCorrectionSupport());
    }

    private native String _getColorCorrectionSupport() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.colorCorrectionSupport;
    }-*/;

    public native String getDeviceOrientation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.deviceOrientation;
    }-*/;

    public StageDisplayState getDisplayState() {
        return StageDisplayState.fromValue(_getDisplayState());
    }

    private native String _getDisplayState() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.displayState;
    }-*/;

    public void setDisplayState(StageDisplayState displayState) {
        _setDisplayState(displayState.value);
    }

    private native void _setDisplayState(String displayState) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.displayState = displayState;
    }-*/;

    public StageQuality getQuality() {
        return StageQuality.fromValue(_getQuality());
    }

    private native String _getQuality() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.quality;
    }-*/;

    public void setQuality(StageQuality quality) {
        _setQuality(quality.value);
    }

    private native void _setQuality(String quality) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.quality = quality;
    }-*/;

    public StageAlign getAlign() {
        return StageAlign.fromValue(_getAlign());
    }

    private native String _getAlign() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.align;
    }-*/;

    public void setAlign(StageAlign align) {
        _setAlign(align.value);
    }

    private native void _setAlign(String value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.align = value;
    }-*/;

    public native boolean autoOrients() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.autoOrients;
    }-*/;

    public native InteractiveObject getFocus() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.focus;
		return @com.emitrom.air4j.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setFocus(InteractiveObject value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.focus = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		;
    }-*/;

    public native double getFrameRate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.frameRate;
    }-*/;

    public native void setFrameRate(double value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.frameRate = value;
    }-*/;

    public native int getFullScreenHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.fullScreenHeight;
    }-*/;

    public native Rectangle getFullScreenSourceRect() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.fullScreenSourceRect;
		return @com.emitrom.air4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setFullScreenSourceRect(Rectangle value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.fullScreenSourceRect = value.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native int getFullScreenWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.fullScreenWidth;
    }-*/;

    public native NativeWindow getNativeWindow() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.nativeWindow;
		return @com.emitrom.air4j.core.client.display.NativeWindow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public StageOrientation getOrientation() {
        return StageOrientation.fromValue(_getOrientation());
    }

    private native String _getOrientation() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.orientation;
    }-*/;

    public StageScaleMode getScaleMode() {
        return StageScaleMode.fromValue(_getScaleMode());
    }

    private native String _getScaleMode() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scaleMode;
    }-*/;

    public void setScaleMode(StageScaleMode mode) {
        _setScaleMode(mode.value);
    };

    private native void _setScaleMode(String mode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.scaleMode = mode;
    }-*/;

    public native boolean showDefaulContextMenu() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.showDefaultContextMenu;
    }-*/;

    public native void setShowDefaulContextMenu(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.showDefaultContextMenu = value;
    }-*/;

    public native boolean stageFocusRect() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageFocusRect;
    }-*/;

    public native void setStageFocusRect(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stageFocusRect = value;
    }-*/;

    public native int getStageHeight() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageHeight;
    }-*/;

    public native void setStageHeight(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stageHeight = value;
    }-*/;

    public native int getStageWidth() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageWidth;
    }-*/;

    public native void setStageWidth(int value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stageWidth = value;
    }-*/;

    public native boolean supportsOrientationChange() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.supportsOrientationChange;
    }-*/;

    public native boolean wmodeGPU() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.wmodeGPU;
    }-*/;

    public native void assignFocus(InteractiveObject objectToFocus, String direction) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.assignFocus(
						objectToFocus.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()(),
						direction);
    }-*/;

    public native void invalidate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.invalidate();
    }-*/;

    public native boolean isFocusInaccessible() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isFocusInaccessible();
    }-*/;

    public void setAspectRatio(StageAspectRatio ratio) {
        _setAspectRatio(ratio.value);
    }

    private native void _setAspectRatio(String newAspectRatio) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setAspectRatio(newAspectRatio);
    }-*/;

    public void setOrientation(StageOrientation orientation) {
        _setOrientation(orientation.value);
    }

    private native void _setOrientation(String newOrientation) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setOrientation(newOrientation);
    }-*/;

    public List<StageVideo> getStageVideos() {
        List<StageVideo> toReturn = new ArrayList<StageVideo>();
        JavaScriptObject peers = _getStageVideos();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new StageVideo(JsoHelper.getElementValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getStageVideos()/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.stageVideos;
    }-*/;

}
