/************************************************************************
  TweenConfig.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.tween.client.config;

import com.emitrom.flash4j.core.client.JsoHelper;
import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.tween.client.TweenLite;
import com.emitrom.flash4j.tween.client.easing.Ease;
import com.emitrom.flash4j.tween.client.handler.TweenActivityHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Config object for {@link TweenLite}
 * 
 */
public class TweenConfig extends ProxyObject {

    public TweenConfig() {
        jsObj = JsoHelper.createObject();
    }

    public static TweenConfig create() {
        return new TweenConfig();
    }

    /**
     * Sets the alpha
     * 
     * @param value
     * @return
     */
    public TweenConfig setAlpha(double value) {
        JsoHelper.setAttribute(jsObj, "alpha", value);
        return this;
    }

    public TweenConfig setBevelFilter(Filter value) {
        JsoHelper.setAttribute(jsObj, "bevelFilter", value.getJsObj());
        return this;
    }

    /**
     * Bezier tweening allows you to tween in a non-linear way.
     * 
     * @param values
     * @return
     */
    public TweenConfig setBezier(TweenConfig... values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (TweenConfig config : values) {
            peers.push(config.getJsObj());
        }
        return _setBezier(peers);

    }

    /**
     * Bezier tweening allows you to tween in a non-linear way.
     * 
     * @param values
     * @return
     */
    public TweenConfig setBezierThrough(TweenConfig... values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (TweenConfig config : values) {
            peers.push(config.getJsObj());
        }
        return _setBezierThrough(peers);

    }

    /**
     * Tweens ColorTransform properties of a DisplayObject to do advanced
     * effects like overexposing, altering the brightness or setting the
     * percent/amount of tint.
     * 
     * @param value
     * @return
     */
    public TweenConfig setColorTransform(ColorTransform value) {
        JsoHelper.setAttribute(jsObj, "colorTransform", value.getJsObj());
        return this;
    }

    public TweenConfig setDelay(double value) {
        JsoHelper.setAttribute(jsObj, "delay", value);
        return this;
    }

    public TweenConfig setEase(Ease value) {
        JsoHelper.setAttribute(jsObj, "ease", value.getJsObj());
        return this;
    }

    /**
     * Tweens the "x" and "y" properties of the target
     * 
     * @param x
     * @param y
     */
    public void move(double x, double y) {
        setX(x);
        setY(y);
    }

    /**
     * A handler that should be called when the tween has completed.
     * 
     * @param handler
     * @return
     */
    public native TweenConfig onComplete(TweenActivityHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var func = function() {
			handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
		};
		peer.onComplete = func;
		return this;
    }-*/;

    /**
     * A handler that should be called just before the tween inits (renders for
     * the first time).
     * 
     * @param handler
     * @return
     */
    public native TweenConfig onInit(TweenActivityHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.onInit = function() {
			handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
		};
		return this;
    }-*/;

    /**
     * A function that should be called when the tween has reached its starting
     * point again after having been reversed.
     * 
     * @param handler
     * @return
     */
    public native TweenConfig onReverseComplete(TweenActivityHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.onReverseComplete = function() {
			handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
		};
		return this;
    }-*/;

    /**
     * A function that should be called when the tween begins (when its
     * currentTime is at 0 and changes to some other value which can happen more
     * than once if the tween is restarted multiple times).
     * 
     * @param handler
     * @return
     */
    public native TweenConfig onStart(TweenActivityHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.onStart = function() {
			handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
		};
		return this;
    }-*/;

    /**
     * A function to call whenever the tweening values are updated (on every
     * frame during the time the tween is active).
     * 
     * @param handler
     * @return
     */
    public native TweenConfig onUpdate(TweenActivityHandler handler)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.onUpdate = function() {
			handler.@com.emitrom.flash4j.tween.client.handler.TweenActivityHandler::onActivityComplete()();
		};
		return this;
    }-*/;

    /**
     * Controls the paused state of the tween - if true, the tween will be
     * paused initially.
     * 
     * @param value
     * @return
     */
    public TweenConfig setPaused(boolean value) {
        JsoHelper.setAttribute(jsObj, "paused", value);
        return this;
    }

    /**
     * Controls the paused state of the tween - if true, the tween will be
     * paused initially.
     * 
     * @param value
     * @return
     */
    public TweenConfig setRemoveTint(boolean value) {
        JsoHelper.setAttribute(jsObj, "removeTint", value);
        return this;
    }

    /**
     * Tweens the "rotation" property of the target
     * 
     * @param value
     * @return
     */
    public TweenConfig setRotation(double value) {
        JsoHelper.setAttribute(jsObj, "rotation", value);
        return this;
    }

    /**
     * When true, the tween will flip the start and end values which is exactly
     * what TweenLite.from() does.
     * 
     * @param value
     * @return
     */
    public TweenConfig setRunBackwards(boolean value) {
        JsoHelper.setAttribute(jsObj, "runBackwards", value);
        return this;
    }

    /**
     * Tweens the "scaleX" and "scaleY" properties of the target
     * 
     * @param x
     * @param y
     */
    public void scale(double x, double y) {
        setScaleX(x);
        setScaleY(y);
    }

    /**
     * Tweens the "scaleX" property of the target
     * 
     * @param value
     * @return
     */
    public TweenConfig setScaleX(double value) {
        JsoHelper.setAttribute(jsObj, "scaeleX", value);
        return this;
    }

    /**
     * Tweens the "scaleY" property of the target
     * 
     * @param value
     * @return
     */
    public TweenConfig setScaleY(double value) {
        JsoHelper.setAttribute(jsObj, "sccaleY", value);
        return this;
    }

    public TweenConfig setX(double value) {
        JsoHelper.setAttribute(jsObj, "x", value);
        return this;
    }

    public TweenConfig setY(double value) {
        JsoHelper.setAttribute(jsObj, "y", value);
        return this;
    }

    public TweenConfig setWidth(double value) {
        JsoHelper.setAttribute(jsObj, "width", value);
        return this;

    }

    /**
     * Some components require resizing with setSize() instead of standard
     * tweens of width/height in order to scale properly.
     * 
     * @param width
     * @param height
     */
    public void seSize(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    /**
     * To change a DisplayObject's tint, set this to the hex value of the color
     * you'd like the DisplayObject to end up at (or begin at if you're using
     * TweenLite.from()).
     */
    public TweenConfig setTint(int value) {
        JsoHelper.setAttribute(jsObj, "tint", value);
        return this;
    }

    /**
     * If useFrames is set to true, the tweens's timing mode will be based on
     * frames.
     */
    public TweenConfig setUseFrame(boolean value) {
        JsoHelper.setAttribute(jsObj, "useFrame", value);
        return this;
    }

    /**
     * Sets a DisplayObject's "visible" property at the end of the tween.
     */
    public TweenConfig setVisible(boolean value) {
        JsoHelper.setAttribute(jsObj, "visible", value);
        return this;
    }

    /**
     * Changes the volume of any object that has a soundTransform property
     * (MovieClip, SoundChannel, NetStream, etc.)
     */
    public TweenConfig setVolume(double value) {
        JsoHelper.setAttribute(jsObj, "volume", value);
        return this;
    }

    public TweenConfig setHeight(double value) {
        JsoHelper.setAttribute(jsObj, "height", value);
        return this;
    }

    private native TweenConfig _setBezier(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.bezier = value;
		return this;
    }-*/;

    private native TweenConfig _setBezierThrough(JavaScriptObject value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.bezierThrough = value;
		return this;
    }-*/;

}
