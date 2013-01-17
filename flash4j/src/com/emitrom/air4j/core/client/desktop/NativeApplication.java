/************************************************************************
  NativeApplication.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.desktop;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.air4j.core.client.display.NativeMenu;
import com.emitrom.air4j.core.client.display.NativeWindow;
import com.emitrom.air4j.core.client.events.Event;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.events.handlers.BrowserInvokeHandler;
import com.emitrom.air4j.core.client.events.handlers.EventHandler;
import com.emitrom.air4j.core.client.events.handlers.InvokeHandler;
import com.emitrom.air4j.core.client.events.handlers.KeyBoardHandler;
import com.emitrom.air4j.core.client.toplevel.XML;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The NativeApplication class represents peer AIR application. The
 * NativeApplication class provides application information, application-wide
 * functions, and dispatches application-level events.
 * <p>
 * The NativeApplication object is a singleton object, created automatically at
 * startup. Get the NativeApplication instance of an application with the static
 * method NativeApplication.get().
 * 
 * 
 */
public class NativeApplication extends EventDispatcher {

    private static NativeApplication INSTANCE = null;

    public static NativeApplication get() {
        if (INSTANCE == null) {
            INSTANCE = new NativeApplication(getNativeInstance());
        }
        return INSTANCE;
    }

    private NativeApplication(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Indicates whether AIR supports dock-style application icons on the
     * current operating system.
     * 
     * @return
     */
    public static native boolean supportsDockIcon() /*-{
		return $wnd.runtime.flash.desktop.NativeApplication.supportsDockIcon;
    }-*/;

    /**
     * Specifies whether the current operating system supports a global
     * application menu bar.
     * 
     * @return
     */
    public static native boolean supportsMenu() /*-{
		return $wnd.runtime.flash.desktop.NativeApplication.supportsMenu;
    }-*/;

    /**
     * Specifies whether AIR supports system tray icons on the current operating
     * system.
     */
    public static native boolean supportsSystemTrayIcon() /*-{
		return $wnd.runtime.flash.desktop.NativeApplication.supportsSystemTrayIcon;
    }-*/;

    private NativeApplication() {
    }

    /**
     * The active application window.
     * 
     * @return
     */
    public native NativeWindow getActiveWindow() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.activeWindow;
		var toReturn = @com.emitrom.air4j.core.client.display.NativeWindow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The contents of the application descriptor file for peer AIR application.
     * 
     * @return
     */
    public native XML getApplicationDescriptor() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.applicationDescriptor;
		var toReturn = @com.emitrom.air4j.core.client.toplevel.XML::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Provides a way for applications to prevent the user interface from going
     * into "idle" mode.
     * 
     * @return
     */
    public native String getSystemIdleMode() /*-{
		var peer = peer.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.systemIdleMode;
    }-*/;

    /**
     * The application ID of peer application.
     * 
     * @return
     */
    public native String getApplicationID() /*-{
		return peer.applicationID;
    }-*/;

    /**
     * Specifies whether the application should automatically terminate when all
     * windows have been closed.
     * 
     * @return
     */
    public native boolean isAutoExit() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.autoExit;
    }-*/;

    /**
     * Specifies whether the application should automatically terminate when all
     * windows have been closed.
     * 
     * @param autoExit
     */
    public native void setAutoExit(boolean autoExit) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.autoExit = autoExit;
    }-*/;

    /**
     * The application icon.
     * 
     * @return
     */
    public native InteractiveIcon getIcon() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.icon;
		var toReturn = @com.emitrom.air4j.core.client.desktop.InteractiveIcon::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The number of seconds that must elapse without user input before a
     * userIdle event is dispatched.
     * 
     * @return
     */
    public native int getIdleThreshold() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.idleThreshold;
    }-*/;

    /**
     * The number of seconds that must elapse without user input before a
     * userIdle event is dispatched.
     * 
     * @param idleThreshold
     */
    public native void setIdleThreshold(int idleThreshold) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.idleThreshold = idleThreshold;
    }-*/;

    /**
     * The application menu
     * 
     * @return
     */
    public native NativeMenu getMenu() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.menu;
		var toReturn = @com.emitrom.air4j.core.client.display.NativeMenu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The application menu
     * 
     * @param menu
     */
    public native void setMenu(NativeMenu menu) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.menu = menu.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * An array containing all the open native windows of this application.
     * 
     * @return
     */
    public List<NativeWindow> getOpenedWindows() {
        List<NativeWindow> windows = new ArrayList<NativeWindow>();
        JsArray<JavaScriptObject> nativePeers = _getOpenedWindows();
        for (int i = 0; i < nativePeers.length(); i++) {
            windows.add(new NativeWindow(nativePeers.get(i)));
        }
        return windows;
    }

    private native JsArray<JavaScriptObject> _getOpenedWindows() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.openedWindows;
    }-*/;

    /**
     * The publisher ID of this application.
     * 
     * @return
     */
    public native String getPublisherID() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.publisherID;
    }-*/;

    /**
     * The patch level of the runtime hosting this application.
     * 
     * @return
     */
    public native int getRuntimePatchLevel() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.runtimePatchLevel;
    }-*/;

    /**
     * The version number of the runtime hosting this application.
     * 
     * @return
     */
    public native String getRuntimeVersion() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.runtimeVersion;
    }-*/;

    /**
     * Specifies whether this application is automatically launched whenever the
     * current user logs in.
     * 
     * @return
     */
    public native boolean startAtLogin() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.startAtLogin;
    }-*/;

    /**
     * Specifies whether this application is automatically launched whenever the
     * current user logs in.
     * 
     * @param startAtLogin
     */
    public native void setStartAtLogin(boolean startAtLogin) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.startAtLogin = startAtLogin;
    }-*/;

    /**
     * The time, in seconds, since the last user input.
     * 
     * @return
     */
    public native int getTimeSinceLastUserInput() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.timeSinceLastUserInput;
    }-*/;

    /**
     * Activates this application.
     */
    public native void activate() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.activate;
    }-*/;

    /**
     * Activates this application.
     * 
     * @param window
     */
    public native void activate(NativeWindow window) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.activate(window.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Invokes an internal delete command on the focused display object.
     * 
     * @return
     */
    public native boolean clear() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.clear();
    }-*/;

    /**
     * Invokes an internal copy command on the focused display object.
     * 
     * @return
     */
    public native boolean copy() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.copy();
    }-*/;

    /**
     * Invokes an internal cut command on the focused display object.
     * 
     * @return
     */
    public native boolean cut() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.cut();
    }-*/;

    /**
     * Terminates this application.
     */
    public native void exit() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.exit();
    }-*/;

    /**
     * Terminates this application.
     * 
     * @param errorCode
     */
    public native void exit(int errorCode) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.exit(errorCode);
    }-*/;

    /**
     * Gets the default application for opening files with the specified
     * extension.
     * 
     * @param extension
     * @return
     */
    public native String getDefaultApplication(String extension) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.getDefaultApplication(extension);
    }-*/;

    /**
     * Specifies whether this application is currently the default application
     * for opening files with the specified extension.
     * 
     * @param extension
     * @return
     */
    public native boolean isSetAsDefaultApplication(String extension) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.isSetAsDefaultApplication(extension);
    }-*/;

    /**
     * Invokes an internal paste command on the focused display object.
     * 
     * @return
     */
    public native boolean paste() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.paste();
    }-*/;

    /**
     * Removes this application as the default for opening files with the
     * specified extension.
     * 
     * @param extension
     */
    public native void removeAsDefaultApplication(String extension) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.removeAsDefaultApplication(extension);
    }-*/;

    /**
     * Invokes an internal selectAll command on the focused display object.
     * 
     * @return
     */
    public native boolean selectAll() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.selectAll();
    }-*/;

    /**
     * Sets this application as the default application for opening files with
     * the specified extension.
     * 
     * @param extension
     */
    public native void setAsDefaultApplication(String extension) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer.setAsDefaultApplication(extension);
    }-*/;

    /**
     * Dispatched when this application becomes the active desktop application. <br/>
     * <b>Note: </b>This event has neither a "capture phase" nor a
     * "bubble phase", which means that event listeners must be added directly
     * to any potential targets, whether the target is on the display list or
     * not.
     * <p>
     * AIR for TV devices never automatically dispatch this event. You can,
     * however, dispatch it manually.
     * 
     * @param handler
     */
    public void addActivateHandler(EventHandler handler) {
        this.addEventHandler(Event.ACTIVATE, handler);
    }

    /**
     * Dispatched when an application is invoked by a SWF file running in the
     * user's browser.
     * <p>
     * Browser invocation is permitted only if an application specifies the
     * following in the application descriptor file:
     * <p>
     * <allowBrowserInvocation>true</allowBrowserInvocation>
     * 
     * @param handler
     */
    public native void addBrowserInvokeHandler(BrowserInvokeHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						@com.emitrom.air4j.core.client.events.BrowserInvokeEvent::BROWSER_INVOKE,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.BrowserInvokeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.BrowserInvokeHandler::onEvent(Lcom/emitrom/air4j/core/client/events/BrowserInvokeEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when an application is invoked.
     * <p>
     * When an application is invoked a second time, another instance of the
     * application is not started. Instead, the first instance receives an
     * additional invoke event. It is the responsibility of the application to
     * handle subsequent invoke events appropriately.
     * <p>
     * <b>Note:</b> All invoke events are queued. When a listener for this event
     * is registered, it receives all events in the queue as well as any new
     * events. Queued events may be delivered before or after any new invoke
     * events.
     * 
     * @param handler
     */
    public native void addInvokeHandler(InvokeHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventHandler(
						@com.emitrom.air4j.core.client.events.InvokeEvent::INVOKE,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.InvokeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.InvokeHandler::onEvent(Lcom/emitrom/air4j/core/client/events/InvokeEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when the user presses a key. The NativeApplication instance
     * provides this event to support keyboard accelerators. This keyboard event
     * is dispatched first to the NativeApplication. Canceling this event also
     * cancels NativeWindow menu accelerators. This event occurs before the
     * keyDown event.
     * 
     * @param handler
     */
    public native void addKeyDownHandler(KeyBoardHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						@com.emitrom.air4j.core.client.events.KeyboardEvent::KEY_DOWN,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.KeyboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.KeyBoardHandler::onEvent(Lcom/emitrom/air4j/core/client/events/KeyboardEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when the user presses a key. The NativeApplication instance
     * provides this event to support keyboard accelerators. This keyboard event
     * is dispatched first to the NativeApplication. Canceling this event also
     * cancels NativeWindow menu accelerators. This event occurs before the
     * keyUp event.
     * 
     * @param handler
     */
    public native void addKeyUpHandler(KeyBoardHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						@com.emitrom.air4j.core.client.events.KeyboardEvent::KEY_UP,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.KeyboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.KeyBoardHandler::onEvent(Lcom/emitrom/air4j/core/client/events/KeyboardEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when the desktop focus is switched to a different application. <br/>
     * <b>Note: </b>This event has neither a "capture phase" nor a
     * "bubble phase", which means that event listeners must be added directly
     * to any potential targets, whether the target is on the display list or
     * not.
     * <p>
     * AIR for TV devices never automatically dispatch this event. You can,
     * however, dispatch it manually.
     * 
     * @param handler
     */
    public void addDeactivateHandler(EventHandler handler) {
        this.addEventHandler(Event.DEACTIVATE, handler);
    }

    /**
     * Dispatched when the application exit sequence is started.
     * <p>
     * The exiting event is dispatched when application exit is initiated by the
     * operating system; for example, when a user issues the Cmd-Q key sequence
     * on Mac OS X, or when the autoExit property of the NativeApplication
     * object is true and the last application window is closed. Canceling this
     * event prevents the application from exiting.
     * <p>
     * <b>Note:</b>Calling the NativeApplication exit() method does not cause an
     * exiting event to be dispatched. To warn components of an impending exit,
     * dispatch the exiting event before calling exit().
     * 
     * @param handler
     */
    public void addExitingHandler(EventHandler handler) {
        this.addEventHandler(Event.EXITING, handler);
    }

    /**
     * Dispatched when either a new network connection becomes available or an
     * existing network connection is lost.
     * <p>
     * A networkChange event does not necessarily mean that the host computer
     * has gone online or offline; it may just be transitioning from one type of
     * connection to another. Applications can use this event to help optimize
     * the task of monitoring remote resource availability. The dispatch of a
     * networkChange event is often a good time to verify the availability of
     * any remote resources.
     * <p>
     * <b>Notes:<b>
     * <p>
     * <ul>
     * <li>There may be a short delay between a network change and the delivery
     * of this event.</li>
     * <li>On Android, the NativeApplication object may dispatch more than one
     * networkChange event for each change in a network connection.</li>
     * </ul>
     * 
     * @param handler
     */
    public void addNetworkChangeHandler(EventHandler handler) {
        this.addEventHandler(Event.NETWORK_CHANGE, handler);
    }

    /**
     * Dispatched when the user has been idle.
     * <p>
     * Specify the period of time for which a user must be idle before this
     * event is dispatched using the idleThreshold property. The amount of time
     * that the user has been idle can be determined from the
     * timeSinceLastUserInput property.
     * <p>
     * This event is not dispatched on mobile devices or AIR for TV devices.
     * 
     * @param handler
     */
    public void addUserIdleHandler(EventHandler handler) {
        this.addEventHandler(Event.USER_IDLE, handler);
    }

    /**
     * Dispatched when the operating system detects mouse or keyboard activity
     * after an idle period.
     * <p>
     * The period of time that is considered idle is configurable with the
     * idleThreshold property. The amount of time that the user has been idle
     * can be determined from the timeSinceLastUserInput property.
     * <p>
     * This event is not dispatched on mobile devices or AIR for TV devices.
     * 
     * @param handler
     */
    public void addUserPresentHandler(EventHandler handler) {
        this.addEventHandler(Event.USER_PRESENT, handler);
    }

    private static native JavaScriptObject getNativeInstance() /*-{
		return $wnd.runtime.flash.desktop.NativeApplication.nativeApplication;
    }-*/;
}
