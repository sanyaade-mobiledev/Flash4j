/************************************************************************
 * Effect.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.flash4j.flex.client.mx.effects;

import java.util.List;

import com.emitrom.flash4j.core.client.ProxyObject;
import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.events.EventDispatcher;
import com.emitrom.flash4j.core.client.framework.Bridge;
import com.emitrom.flash4j.flex.client.core.utils.DataConverter;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class Effect.
 */
public class Effect extends EventDispatcher implements IEffect {

    /**
     * Instantiates a new effect.
     */
    protected Effect(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the effect
     */
    public Effect() {
        jsObj = Bridge.createObject("mx.effects.Effect");
    }

    /**
     * Gets the class name.
     * 
     * @return the class name
     */
    public native String getClassName()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getclassName();
    }-*/;

    /**
     * Gets the duration.
     * 
     * @return the duration
     */
    public native double getDuration()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getduration();
    }-*/;

    /**
     * Sets the duration.
     * 
     * @param value
     *            the new duration
     */
    public native void setDuration(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setduration(value);
    }-*/;

    /**
     * Gets the filter.
     * 
     * @return the filter
     */
    public native String getFilter()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getfilter();
    }-*/;

    /**
     * Sets the filter.
     * 
     * @param value
     *            the new filter
     */
    public native void setFilter(String value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setfilter(value);
    }-*/;

    /**
     * Hide focus ring.
     * 
     * @return true, if successful
     */
    public native boolean hideFocusRing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethideFocusRing();
    }-*/;

    /**
     * Sets the hide focus ring.
     * 
     * @param value
     *            the new hide focus ring
     */
    public native void setHideFocusRing(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethideFocusRing(value);
    }-*/;

    /**
     * Checks if is playing.
     * 
     * @return true, if is playing
     */
    public native boolean isPlaying()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisPlaying();
    }-*/;

    /**
     * Gets the per element offset.
     * 
     * @return the per element offset
     */
    public native double getPerElementOffset()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getperElementOffset();
    }-*/;

    /**
     * Sets the per element offset.
     * 
     * @param value
     *            the new per element offset
     */
    public native void setPerElementOffset(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setperElementOffset(value);
    }-*/;

    /**
     * Gets the playhead time.
     * 
     * @return the playhead time
     */
    public native double getPlayheadTime()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getplayheadTime();
    }-*/;

    /**
     * Sets the playhead time.
     * 
     * @param value
     *            the new playhead time
     */
    public native void setPlayheadTime(double value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setplayheadTime(value);
    }-*/;

    /**
     * Gets the relevant properties.
     * 
     * @return the relevant properties
     */
    public native JsArrayString getRelevantProperties()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrelevantProperties();
    }-*/;

    /**
     * Sets the relevant properties.
     * 
     * @param values
     *            the new relevant properties
     */
    public void setRelevantProperties(JsArrayString values) {
        ArrayCollection c = new ArrayCollection();
        for (int i = 0; i < 0; i++) {
            c.addItem(values.get(i));
        }
        setRelevantProperties(c);
    }

    /**
     * Sets the relevant properties.
     * 
     * @param col
     *            the new relevant properties
     */
    private void setRelevantProperties(ArrayCollection col) {
        _setRelevantProperties(col.toArray().getJsObj());
    }

    /**
     * Sets the relevant properties.
     * 
     * @param values
     *            the new relevant properties
     */
    private native void _setRelevantProperties(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrelevantProperties(values);
    }-*/;

    /**
     * Gets the relevant styles.
     * 
     * @return the relevant styles
     */
    public native JsArrayString getRelevantStyles()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrelevantStyles();
    }-*/;

    /**
     * Sets the relevant styles.
     * 
     * @param values
     *            the new relevant styles
     */
    public void setRelevantStyles(JsArrayString values) {
        ArrayCollection c = new ArrayCollection();
        for (int i = 0; i < 0; i++) {
            c.addItem(values.get(i));
        }
        setRelevantStyles(c);
    }

    /**
     * Sets the relevant styles.
     * 
     * @param col
     *            the new relevant styles
     */
    private void setRelevantStyles(ArrayCollection col) {
        _setRelevantStyles(col.toArray().getJsObj());
    }

    /**
     * Sets the relevant styles.
     * 
     * @param values
     *            the new relevant styles
     */
    private native void _setRelevantStyles(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrelevantStyles(values);
    }-*/;

    /**
     * Gets the repeat count.
     * 
     * @return the repeat count
     */
    public native int getRepeatCount()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrepeatCount();
    }-*/;

    /**
     * Sets the repeat count.
     * 
     * @param value
     *            the new repeat count
     */
    public native void setRepeatCount(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrepeatCount(value);
    }-*/;

    /**
     * Gets the repeat delay.
     * 
     * @return the repeat delay
     */
    public native int getRepeatDelay()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getrepeatDelay();
    }-*/;

    /**
     * Sets the repeat delay.
     * 
     * @param value
     *            the new repeat delay
     */
    public native void setRepeatDelay(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setrepeatDelay(value);
    }-*/;

    /**
     * Gets the start delay.
     * 
     * @return the start delay
     */
    public native int getStartDelay()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getstartDelay();
    }-*/;

    /**
     * Sets the start delay.
     * 
     * @param value
     *            the new start delay
     */
    public native void setStartDelay(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setstartDelay(value);
    }-*/;

    /**
     * Suspend background processing.
     * 
     * @return true, if successful
     */
    public native boolean suspendBackgroundProcessing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsuspendBackgroundProcessing();
    }-*/;

    /**
     * Sets the suspend background processing.
     * 
     * @param value
     *            the new suspend background processing
     */
    public native void setSuspendBackgroundProcessing(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsuspendBackgroundProcessing(value);
    }-*/;

    /**
     * Sets the target.
     * 
     * @param value
     *            the new target
     */
    public native void setTarget(Object value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();

		peer.settarget(value);
    }-*/;

    public void setTarget(ProxyObject obj) {
        setTarget(obj.getJsObj());
    }

    /**
     * Sets the targets.
     * 
     * @param values
     *            the new targets
     */
    public void setTargets(List<ProxyObject> values) {
        setTargets(DataConverter.fromList(values));
    }

    /**
     * Sets the targets.
     * 
     * @param col
     *            the new targets
     */
    public void setTargets(ArrayCollection col) {
        _setTargets(col.toArray().getJsObj());
    }

    /**
     * Sets the targets.
     * 
     * @param values
     *            the new targets
     */
    private native void _setTargets(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.settargets(values);
    }-*/;

    /**
     * Gets the trigger event.
     * 
     * @return the trigger event
     */
    public native Event getTriggerEvent()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.gettriggerEvent();
		return @com.emitrom.flash4j.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
    }-*/;

    /**
     * Sets the trigger event.
     * 
     * @param value
     *            the new trigger event
     */
    public native void setTriggerEvent(Event value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.settriggerEvent(value.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * End.
     */
    public native void end()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.end();
    }-*/;

    /**
     * Pause.
     */
    public native void pause()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.pause();
    }-*/;

    /**
     * Play.
     * 
     * @return the js array
     */
    public native void play()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.play();
    }-*/;

    /**
     * Play.
     * 
     * @param values
     *            the values
     * @return the js array
     */
    public void play(List<ProxyObject> values) {
        play(DataConverter.fromList(values));
    }

    /**
     * Play.
     * 
     * @param values
     *            the values
     * @return the js array
     */
    public void play(ArrayCollection values) {
        _play(values.toArray().getJsObj());
    }

    /**
     * Play.
     * 
     * @param values
     *            the values
     * @return the js array
     */
    private native void _play(JavaScriptObject values)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.play(values);
    }-*/;

    /**
     * Play.
     * 
     * @param values
     *            the values
     * @param playReversedFromEnd
     *            the play reversed from end
     * @return the js array
     */
    public void play(List<ProxyObject> values, boolean playReversedFromEnd) {
        play(DataConverter.fromList(values), playReversedFromEnd);
    }

    /**
     * Play.
     * 
     * @param values
     *            the values
     * @param playreversedFromEnd
     *            the playreversed from end
     * @return the js array
     */
    public void play(ArrayCollection values, boolean playreversedFromEnd) {
        _play(values.toArray().getJsObj(), playreversedFromEnd);
    }

    /**
     * Play.
     * 
     * @param values
     *            the values
     * @param playReversedFromEnd
     *            the play reversed from end
     * @return the js array
     */
    private native void _play(JavaScriptObject values, boolean playReversedFromEnd)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.play(values, playReversedFromEnd);
    }-*/;

    /**
     * Resume.
     */
    public native void resume()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.resume();
    }-*/;

    /**
     * Stop.
     */
    public native void stop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;

    @Override
    public JavaScriptObject asIEffect() {
        return jsObj.cast();
    }

}
