/************************************************************************
 * Starling.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
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
package com.emitrom.flash4j.starling.client;

import com.emitrom.flash4j.core.client.display.Stage3D;
import com.emitrom.flash4j.core.client.display.StageAlign;
import com.emitrom.flash4j.core.client.display.StageScaleMode;
import com.emitrom.flash4j.core.client.display3D.Context3D;
import com.emitrom.flash4j.core.client.display3D.Program3D;
import com.emitrom.flash4j.core.client.geom.Rectangle;
import com.emitrom.flash4j.core.client.utils.ByteArray;
import com.emitrom.flash4j.starling.client.animation.Juggler;
import com.emitrom.flash4j.starling.client.core.runtime.StarlingRootPanel;
import com.emitrom.flash4j.starling.client.display.Stage;
import com.emitrom.flash4j.starling.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Starling class represents the core of the Starling framework.
 * 
 * <p>
 * The Starling framework makes it possible to create 2D applications and games
 * that make use of the <b>Stage3D</b> architecture introduced in <b>FlashDetect
 * Player 11</b>. It implements a display tree system that is very similar to
 * that of conventional FlashDetect, while leveraging modern GPUs to speed up
 * rendering.
 * </p>
 * <p>
 * The Starling class represents the link between the conventional FlashDetect
 * display tree and the Starling display tree.
 * </p>
 * <p>
 * It s not possible to instantiate peer class.
 * </p>
 * <p>
 * You have to start it up like peer: <br/>
 * 
 * </code>Starling.start(); </code> It will now render the contents of the
 * "Game" class in the frame rate that is set up for the application (as defined
 * in the FlashDetect stage).
 * </p>
 * 
 * <b>Viewport</b>
 * <p>
 * The area the Starling content is rendered into is, per default, the complete
 * size of the stage. You can, however, use the "viewPort" property to change
 * it. peer can be useful when you want to render only into a part of the
 * screen, or if the player size changes. For the latter, you can listen to the
 * RESIZE-event dispatched by the Starling stage.
 * </p>
 * 
 * <b>Native overlay</b>
 * <p>
 * Sometimes you will want to display native FlashDetect content on top of
 * Starling. That's what the <b>nativeOverlay</b> property is for. It returns a
 * FlashDetect Sprite lying directly on top of the Starling content. You can add
 * conventional FlashDetect objects to that overlay.
 * </p>
 * <p>
 * Beware, though, that conventional FlashDetect content on top of 3D content
 * can lead to performance penalties on some (mobile) platforms. For that
 * reason, always remove all child objects from the overlay when you don't need
 * them any longer. Starling will remove the overlay from the display list when
 * it's empty.
 * </p>
 * 
 * <b>Multitouch</b>
 * <p>
 * Starling supports multitouch input on devices that provide it. During
 * development, where most of us are working with a conventional mouse and
 * keyboard, Starling can simulate multitouch events with the help of the
 * "Shift" and "Ctrl" (Mac: "Cmd") keys. Activate peer feature by enabling the
 * simulateMultitouch property.
 * </p>
 * 
 * 
 */
public class Starling extends EventDispatcher {

    private static final Starling INSTANCE = new Starling(StarlingRootPanel.INSTANCE.getRootPanel());

    protected Starling() {

    }

    Starling(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The antialiasing level.
     * 
     * @return
     */

    public static final int getAntiAliasing() {
        return get()._getAntiAliasing();
    }

    /**
     * The antialiasing level.
     * 
     * @return
     */
    public static final void setAntiAliasing(int value) {
        get()._setAntiAliasing(value);
    }

    /**
     * Indicates if Stage3D render methods will report errors.
     * 
     * @return
     */
    public static final boolean enableErrorChecking() {
        return get()._enableErrorChecking();
    }

    /**
     * Indicates if Stage3D render methods will report errors.
     * 
     * @param value
     */
    public static final void setEnableErrorChecking(boolean value) {
        get()._setEnableErrorChecking(value);
    }

    /**
     * Indicates if Starling should automatically recover from a lost device
     * context.
     * 
     * @return
     */
    public static final boolean handleLostContext() {
        return get()._handleLostContext();
    }

    /**
     * Indicates if Starling should automatically recover from a lost device
     * context.
     * 
     * @param value
     */
    public static final void setHandleLostContext(boolean value) {
        get()._setHandleLostContext(value);
    }

    /**
     * Indicates if multitouch input should be supported.
     * 
     * @return
     */
    public static boolean isMultiTouchEnable() {
        return get()._multiTouchEnabled();
    }

    /**
     * Indicates if multitouch input should be supported.
     * 
     * @param value
     */
    public static void setMultiTouchEnabled(boolean value) {
        get()._setMultiTouchEnabled(value);
    }

    public static Stage3D getStage3D() {
        return get()._getStage3D();
    }

    public static String getVersion() {
        return get()._getVersion();
    }

    /**
     * [read-only] The render context of peer instance.
     * 
     * @return
     */
    public static final Context3D getContext() {
        return get()._getContext();
    }

    /**
     * [read-only] Indicates if peer Starling instance is started.
     * 
     * @return
     */
    public static final boolean isStarted() {
        return get()._isStarted();
    }

    /**
     * Starts rendering and dispatching of ENTER_FRAME events.
     */
    public static final void start() {
        get()._start();
    }

    /**
     * The FlashDetect Sprite placed directly on top of the Starling content.
     * 
     * @return
     */
    public static final com.emitrom.flash4j.core.client.display.Sprite getNativeOverlay() {
        return get()._getNativeOverLay();
    }

    /**
     * The FlashDetect (2D) stage object Starling renders beneath.
     * 
     * @return
     */
    public static final com.emitrom.flash4j.core.client.display.Stage getNativeStage() {
        return get()._getNativeStage();
    }

    /**
     * Indicates if multitouch simulation with "Shift" and "Ctrl"/"Cmd"-keys is
     * enabled.
     * 
     * @return
     */
    public static final boolean simulateMultiTouch() {
        return get()._simulateMultiTouch();
    }

    /**
     * Indicates if multitouch simulation with "Shift" and "Ctrl"/"Cmd"-keys is
     * enabled.
     * 
     * @param value
     */
    public static final void setSimulateMultiTouch(boolean value) {
        get()._setSimulateMultiTouch(value);
    }

    /**
     * The Starling stage object, which is the root of the display tree that is
     * rendered.
     * 
     * @return
     */
    public static final Stage getStage() {
        return get()._getStage();
    }

    /**
     * The viewport into which Starling contents will be rendered.
     * 
     * @return
     */
    public static final Rectangle getViewport() {
        return get()._getViewPort();
    }

    /**
     * [read-only] The default juggler of peer instance.
     * 
     * @return
     */
    public static Juggler getJuggler() {
        return get()._getJuggler();
    }

    /**
     * Deletes the vertex- and fragment-programs of a certain name.
     * 
     * @param name
     */
    public final static void deleteProgramm(String name) {
        get()._deleteProgramm(name);
    }

    /**
     * Disposes Shader programs and render context.
     * 
     * @param name
     */
    public final static void dispose() {
        get()._dispose();
    }

    /**
     * Returns the vertex- and fragment-programs registered under a certain
     * name.
     * 
     * @param name
     */
    public final static Program3D getProgramm(String name) {
        return get()._getProgramm(name);
    }

    /**
     * Indicates if a set of vertex- and fragment-programs is registered under a
     * certain name.
     * 
     * @param name
     */
    public final static boolean hasProgramm(String name) {
        return get()._hasProgramm(name);
    }

    /**
     * Registers a vertex- and fragment-program under a certain name.
     * 
     * @param name
     * @param vertexProgramm
     * @param fragmentProgramm
     */
    public final static void registerProgramm(String name, ByteArray vertexProgramm, ByteArray fragmentProgramm) {
        get()._registerProgramm(name, vertexProgramm, fragmentProgramm);
    }

    /**
     * Stops rendering.
     */
    public final static void stop() {
        get()._stop();
    }

    /**
     * sets the stage scale mode
     * 
     * @param stageScaleMode
     */
    public static void setStageScaleMode(StageScaleMode stageScaleMode) {
        Starling.getNativeStage().setScaleMode(stageScaleMode);
    }

    /**
     * sets the stage align
     * 
     * @param stageAlign
     */
    public static void setStageAlign(StageAlign stageAlign) {
        Starling.getNativeStage().setAlign(stageAlign);
    }

    private final native void _start()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.start();
    }-*/;

    private final native void _setEnableErrorChecking(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setenableErrorChecking(value);
    }-*/;

    private final native boolean _enableErrorChecking()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getenableErrorChecking();
    }-*/;

    private final native boolean _isStarted()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getisStarted();
    }-*/;

    private final native Juggler _getJuggler()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getjuggler();
		return @com.emitrom.flash4j.starling.client.animation.Juggler::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private final native com.emitrom.flash4j.core.client.display.Sprite _getNativeOverLay()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getnativeOverLay();
		return @com.emitrom.flash4j.core.client.display.Sprite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private final native com.emitrom.flash4j.core.client.display.Stage _getNativeStage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getnativeStage();
		return @com.emitrom.flash4j.core.client.display.Stage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private final native Rectangle _getViewPort()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getviewPort();
		return @com.emitrom.flash4j.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private final native Stage3D _getStage3D()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getStage3D();
		return @com.emitrom.flash4j.core.client.display.Stage3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private final native String _getVersion()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getVERSION();
    }-*/;

    private final native int _getAntiAliasing()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getantiAliasing();
    }-*/;

    private final native void _setAntiAliasing(int value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setantiAliasing(value);
    }-*/;

    private static Starling get() {
        return INSTANCE;
    }

    private final native Context3D _getContext()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getcontext();
		return @com.emitrom.flash4j.core.client.display3D.Context3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private final native boolean _handleLostContext()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.gethandleLostContext();
    }-*/;

    private final native void _setHandleLostContext(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.sethandleLostContext(value);
    }-*/;

    private final native boolean _multiTouchEnabled()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return false;
		//return peer.getmultitouchEnabled();
    }-*/;

    private final native void _setMultiTouchEnabled(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		//peer.setmultitouchEnabled(value);
    }-*/;

    private final native boolean _simulateMultiTouch()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		return peer.getsimulateMultitouch();
    }-*/;

    private final native void _setSimulateMultiTouch(boolean value)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.setsimulateMultitouch(value);
    }-*/;

    private final native Stage _getStage()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getstage();
		return @com.emitrom.flash4j.starling.client.display.Stage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private final native void _deleteProgramm(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.deleteProgramm(name);
    }-*/;

    private final native void _dispose()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.dispose();
    }-*/;

    private final native Program3D _getProgramm(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.getProgramm(name);
		return @com.emitrom.flash4j.core.client.display3D.Program3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private final native boolean _hasProgramm(String name)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.hasProgramm(name);
    }-*/;

    private final native boolean _registerProgramm(String name, ByteArray vertexProgramm, ByteArray fragmentProgramm)/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer
				.registerProgramm(
						name,
						vertexProgramm.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()(),
						fragmentProgramm.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private final native void _stop()/*-{
		var peer = this.@com.emitrom.flash4j.core.client.ProxyObject::getJsObj()();
		peer.stop();
    }-*/;

}
