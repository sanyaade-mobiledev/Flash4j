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
package com.emitrom.flash4j.starling.client.display;

import java.util.List;

import com.emitrom.flash4j.core.client.media.Sound;
import com.emitrom.flash4j.starling.client.animation.IAnimatable;
import com.emitrom.flash4j.starling.client.core.factories.StarlingObjectFactory;
import com.emitrom.flash4j.starling.client.textures.Texture;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A MovieClip is a simple way to display an animation depicted by a list of
 * textures. Pass the frames of the movie in a vector of textures to the
 * constructor. The movie clip will have the width and height of the first
 * frame. If you group your frames with the help of a texture atlas (which is
 * recommended), use the getTextures-method of the atlas to receive the textures
 * in the correct (alphabetic) order.
 * <p>
 * You can specify the desired framerate via the constructor. You can, however,
 * manually give each frame a custom duration. You can also play a sound
 * whenever a certain frame appears.
 * <p>
 * The methods play and pause control playback of the movie. You will receive an
 * event of type Event.MovieCompleted when the movie finished playback. If the
 * movie is looping, the event is dispatched once per loop.
 * <p>
 * As any animated object, a movie clip has to be added to a juggler (or have
 * its advanceTime method called regularly) to run. The movie will dispatch an
 * event of type "Event.COMPLETE" whenever it has displayed its last frame.
 * 
 */
public class MovieClip extends Image implements IAnimatable {

    MovieClip() {

    }

    public MovieClip(List<Texture> textures) {
        jsObj = StarlingObjectFactory.INSTANCE.createMovieClip(textures);
    }

    public MovieClip(List<Texture> textures, double fps) {
        jsObj = StarlingObjectFactory.INSTANCE.createMovieClip(textures, fps);
    }

    /**
     * The index of the frame that is currently displayed.
     */
    public native int getCurrentFrame()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getcurrentFrame();
    }-*/;

    /**
     * The index of the frame that is currently displayed.
     */
    public native void setCurrentFrame(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setcurrentFrame(value);
    }-*/;

    /**
     * The default number of frames per second.
     */
    public native double getFps()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfps();
    }-*/;

    /**
     * The default number of frames per second.
     */
    public native void setFps(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfps(value);
    }-*/;

    /**
     * Indicates if the clip is still playing.
     */
    public native boolean isPlaying()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisPlaying();
    }-*/;

    /**
     * The default number of frames per second.
     */
    public native boolean loop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getloop();
    }-*/;

    /**
     * Indicates if the clip should loop.
     */
    public native void setLoop(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setloop(value);
    }-*/;

    /**
     * The total number of frames.
     */
    public native int getNumFrames()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getnumFrames();
    }-*/;

    /**
     * The total duration of the clip in seconds.
     */
    public native double getTotalTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gettotalTime();
    }-*/;

    /**
     * Adds an additional frame, optionally with a sound and a custom duration.
     */
    public native void addFrame(Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addFrame(texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds an additional frame, optionally with a sound and a custom duration.
     */
    public native void addFrame(Texture texture, Sound sound)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addFrame(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						sound.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds an additional frame, optionally with a sound and a custom duration.
     */
    public native void addFrame(Texture texture, Sound sound, double duration)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addFrame(
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						sound.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						duration);
    }-*/;

    /**
     * Adds a frame at a certain index, optionally with a sound and a custom
     * duration.
     */
    public native void addFrameAt(int frameID, Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addFrameAt(
						frameID,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds a frame at a certain index, optionally with a sound and a custom
     * duration.
     */
    public native void addFrameAt(int frameID, Texture texture, Sound sound)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addFrameAt(
						frameID,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						sound.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Adds a frame at a certain index, optionally with a sound and a custom
     * duration.
     */
    public native void addFrameAt(int frameID, Texture texture, Sound sound, double duration)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.addFrameAt(
						frameID,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						sound.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						duration);
    }-*/;

    /**
     * Advance the time by a number of seconds.
     * 
     * @param passsedTime
     */
    public native void advanceTime(double passsedTime)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.advanceTime(passedTime);
    }-*/;

    /**
     * Returns the duration of a certain frame (in seconds).
     * 
     */
    public native double getFrameDuration(int frameID)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getFrameDuration(frameID);
    }-*/;

    /**
     * Returns the sound of a certain frame.
     */
    public native Sound getFrameSound(int frameID)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getFrameSound(frameID);
		return @com.emitrom.flash4j.core.client.media.Sound::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the texture of a certain frame.
     * 
     */
    public native Texture getFrameTexture(int frameID)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getFrameTexture(frameID);
		return @com.emitrom.flash4j.starling.client.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Pauses playback.
     * 
     */
    public native void pause()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.pause();
    }-*/;

    /**
     * starts playback.
     * 
     */
    public native void play()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.play();
    }-*/;

    /**
     * Removes the frame at a certain ID.
     * 
     */
    public native void removeFrameAt(int frameID)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.removeFrameAt(frameID);
    }-*/;

    /**
     * Sets the duration of a certain frame (in seconds).
     * 
     */
    public native void setFrameDuration(int frameID, double duration)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setFrameDuration(frameID, duration);
    }-*/;

    /**
     * Sets the sound of a certain frame.
     * 
     */
    public native void setFrameSound(int frameID, Sound sound)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setFrameSound(
						frameID,
						sound.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets the texture of a certain frame.
     * 
     */
    public native void setFrameTexture(int frameID, Texture texture)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.setFrameTexture(
						frameID,
						texture.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Stops playback, resetting "currentFrame" to zero.
     * 
     */
    public native void stop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;

    public JavaScriptObject asIAnimatable() {
        return this.getJsObj().cast();
    }

}
