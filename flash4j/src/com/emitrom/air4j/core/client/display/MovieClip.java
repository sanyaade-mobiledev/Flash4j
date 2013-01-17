/************************************************************************
  MovieClip.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class MovieClip extends Sprite {

    protected MovieClip(JavaScriptObject obj) {
        jsObj = obj;
    }

    public MovieClip() {
        jsObj = newInstance();
    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.display.MovieClip;
    }-*/;

    public native int getCurrentFrame() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.currentFrame;
    }-*/;

    public native String getCurrentFrameLabel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.currentFrameLabel;
    }-*/;

    public native String getCurrentLabel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.currentLabel;
    }-*/;

    public native JsArray<JavaScriptObject> getCurrentLabels() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.currentLabels;
    }-*/;

    public native Scene getCurrentScene() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.currentScene;
    }-*/;

    public native boolean isEnabled() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.enabled;
    }-*/;

    public native void setEnabled(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.enabled = value;
    }-*/;

    public native int getFramesLoaded() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.framesLoaded;
    }-*/;

    public List<Scene> getScenes() {
        List<Scene> scenes = new ArrayList<Scene>();
        JavaScriptObject nativPeers = _getScenes();
        int size = JsoHelper.arrayLength(nativPeers);
        for (int i = 0; i < size; i++) {
            scenes.add(new Scene(JsoHelper.getValueFromJavaScriptObjectArray(nativPeers, i)));
        }
        return scenes;
    }

    private native JavaScriptObject _getScenes() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.scenes;
    }-*/;

    public native int getTotalFrames() /*-{
		return peer.totalFrames;
    }-*/;

    public native boolean isTrackAsMenu() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.trackAsMenu;
    }-*/;

    public native void setTrackAsMenu(boolean value) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.trackAsMenu = value;
    }-*/;

    public native void gotoAndPlay(JavaScriptObject frame) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndPlay(frame);
    }-*/;

    public native void gotoAndPlay(JavaScriptObject frame, String scene) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndPlay(frame, scene);
    }-*/;

    public native void gotoAndStop(JavaScriptObject frame) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndPStop(frame);
    }-*/;

    public native void gotoAndStop(JavaScriptObject frame, String scene) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.gotoAndStop(frame, scene);
    }-*/;

    public native void nextFrame() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.nextFrame();
    }-*/;

    public native void nextScene() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.nextScene();
    }-*/;

    public native void prevFrame() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.prevFrame();
    }-*/;

    public native void play() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.play();
    }-*/;

    public native void stop() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;

    private static native JavaScriptObject newInstance() /*-{
		return new $wnd.runtime.flash.display.MovieClip();
    }-*/;

}
