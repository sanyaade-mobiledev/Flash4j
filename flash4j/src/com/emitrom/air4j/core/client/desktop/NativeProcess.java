/************************************************************************
  NativeProcess.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.emitrom.air4j.core.client.events.Event;
import com.emitrom.air4j.core.client.events.EventDispatcher;
import com.emitrom.air4j.core.client.events.IOErrorEvent;
import com.emitrom.air4j.core.client.events.ProgressEvent;
import com.emitrom.air4j.core.client.events.handlers.EventHandler;
import com.emitrom.air4j.core.client.events.handlers.IOErrorHandler;
import com.emitrom.air4j.core.client.events.handlers.NativeProcessExitHandler;
import com.emitrom.air4j.core.client.events.handlers.ProgressHandler;
import com.emitrom.air4j.core.client.utils.IoClass;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The NativeProcess class provides command line integration and general
 * launching capabilities. The NativeProcess class lets an AIR application
 * execute native processes on the host operating system. The AIR applcation can
 * monitor the standard input (stdin) and standard output (stdout) stream of the
 * process as well as the process's standard error (stderr) stream.
 * <p>
 * The NativeProcess class and its capabilities are only available to AIR
 * applications installed with a native installer (extended desktop profile
 * applications). When debugging, you can pass the -profile extendedDesktop
 * argument to ADL to enable the NativeProcess functionality. At runtime, you
 * can check the NativeProcess.isSupported property to to determine whether
 * native process communication is supported.
 * <p>
 * <b>AIR profile support:</b> peer feature is supported on applications that
 * are deployed to desktop operating systems via native installers. The feature
 * is not supported on mobile devices or on AIR for TV devices. You can test for
 * support at run time using the NativeProcess.isSupported property. See AIR
 * Profile Support for more information regarding API support across multiple
 * profiles.
 * <p>
 * AIR applications installed with a native installer (extended desktop profile
 * applications) can also use the File.openWithDefaultApplication to open an
 * application. However, the NativeProcess class provides direct access to the
 * standard input, standard output, and standard error pipes.
 * 
 * <b>Note:</b> AIR for TV applications using the extendedTV profile can use
 * native extensions to execute native processes. Similarly, mobile devices can
 * use native extensions.
 * 
 * 
 */
public class NativeProcess extends EventDispatcher {

    public NativeProcess() {
        jsObj = createNativePeer();
    }

    private NativeProcess(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Indicates if running native processes is supported in the current
     * profile.
     * 
     * @return
     */
    public static native boolean isSupported() /*-{
		return $wnd.runtime.flash.desktop.NativeProcess.isSupported;
    }-*/;

    /**
     * Indicates if peer native process is currently running.
     * 
     * @return
     */
    public native boolean isRunning() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.running;
    }-*/;

    /**
     * Provides access to the standard error output from this native process.
     * 
     * @return
     */
    public native IoClass getStandardError() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.standardError;
		return @com.emitrom.air4j.core.client.utils.IoClass::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides access to the standard input of this native process.
     * 
     * @return
     */
    public native IoClass getStandardInput() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.standardInput;
		return @com.emitrom.air4j.core.client.utils.IoClass::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides access to the standard output pipe of this native process.
     * 
     * @return
     */
    public native IoClass getStandardOutput() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.standardOutput;
		return @com.emitrom.air4j.core.client.utils.IoClass::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Closes the input stream on this process.
     */
    public native void closeInput() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.closeInput();
    }-*/;

    /**
     * Attempts to exit the native process.
     */
    public native void exit() /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.exit(false);
    }-*/;

    /**
     * Attempts to exit the native process.
     * 
     * @param force
     */
    public native void exit(boolean force) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer.exit(force);
    }-*/;

    /**
     * Starts the native process identified by the start up info specified.
     * 
     * @param info
     */
    public native void start(NativeProcessStartupInfo info) /*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		return peer
				.start(info.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Signals the native process has exited. The exitCode property contains the
     * value the process returns to the host operating system on exit. If the
     * AIR application terminates the process by calling the exit() method of
     * the NativeProcess object, the exitCode property is set to NaN.
     * 
     * @param handler
     */
    public native void addExitHandler(NativeProcessExitHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						@com.emitrom.air4j.core.client.events.NativeProcessExitEvent::EXIT,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.NativeProcessExitEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.NativeProcessExitHandler::onEvent(Lcom/emitrom/air4j/core/client/events/NativeProcessExitEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Signals that the native process has data available to read on the
     * standard error (stderror) stream. The NativeProcess object dispatches
     * this event when the child process flushes its standard error stream or
     * when the internal buffer used to communicate between the processes is
     * full. Do not write code that depend on the size of this internal buffer;
     * it varies between versions and operating systems.
     * 
     * @param handler
     */
    public void addStandardErrorDataHandler(ProgressHandler handler) {
        this.addProgressHandler(ProgressEvent.STANDARD_ERROR_DATA, handler);
    }

    /**
     * Signals that the NativeProcess has written data to the input stream for
     * the child process. The NativeProcess object dispatches this event when
     * data is written to the stream. This event does not indicate whether or
     * not the child process has read any of the data.
     * 
     * @param handler
     */
    public void addStandardInputProgressHandler(ProgressHandler handler) {
        this.addProgressHandler(ProgressEvent.STANDARD_INPUT_PROGRESS, handler);
    }

    /**
     * Signals that reading from the standard error (stderror) stream has
     * failed. The NativeProcess object can dispatch this event when the runtime
     * cannot read data from the native process's standard error pipe.
     * 
     * @param handler
     */
    public void addStandardErrorIOErrorHandler(IOErrorHandler handler) {
        this.addIOErrorHandler(IOErrorEvent.STANDARD_ERROR_IO_ERROR, handler);
    }

    /**
     * Signals that the NativeProcess object has closed its input stream by
     * calling the closeInput() method. The NativeProcess object does not
     * dispatch this event when the actual native process itself closes the
     * input stream.
     * 
     * @param handler
     */
    public void addStandardInputCloseHandler(EventHandler handler) {
        this.addEventHandler(Event.STANDARD_INPUT_CLOSE, handler);
    }

    /**
     * Signals that the NativeProcess has closed its output stream.
     * 
     * @param handler
     */
    public void addStandardOutputCloseHandler(EventHandler handler) {
        this.addEventHandler(Event.STANDARD_OUTPUT_CLOSE, handler);
    }

    /**
     * Signals that the native process has data available to read on the output
     * stream. The NativeProcess object dispatches this event when the child
     * process flushes its stdout stream or when the internal buffer used to
     * communicate between the processes is full. Do not write code that depend
     * on the size of this internal buffer; it varies between versions and
     * operating systems.
     * 
     * @param handler
     */
    public void addStandardOutputDataHandler(EventHandler handler) {
        this.addEventHandler(ProgressEvent.STANDARD_OUTPUT_DATA, handler);
    }

    /**
     * Signals that reading from the stdout stream has failed. The NativeProcess
     * object can dispatch this event when the runtime cannot read data from the
     * native process's standard output pipe.
     * 
     * @param handler
     */
    public void addStandardOutputIOErrorHandler(IOErrorHandler handler) {
        this.addIOErrorHandler(IOErrorEvent.STANDARD_OUTPUT_IO_ERROR, handler);
    }

    /**
     * Signals that writing to the standard input (stdin) stream has failed. The
     * NativeProcess object dispatches this event when the closeInput() method
     * fails or when the runtime cannot write data to the native process's
     * standard input pipe.
     * 
     * @param handler
     */
    public void addStandardInputIOErrorHandler(IOErrorHandler handler) {
        this.addIOErrorHandler(IOErrorEvent.STANDARD_INPUT_IO_ERROR, handler);
    }

    /**
     * Signals that the NativeProcess has closed its error stream.
     * 
     * @param handler
     */
    public void addStandardErrorCloseHandler(EventHandler handler) {
        this.addEventHandler(Event.STANDARD_ERROR_CLOSE, handler);
    }

    private native JavaScriptObject createNativePeer() /*-{
		return new $wnd.runtime.flash.desktop.NativeProcess();
    }-*/;

    private native void addProgressHandler(String event, ProgressHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						event,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.ProgressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.ProgressHandler::onEvent(Lcom/emitrom/air4j/core/client/events/ProgressEvent;)(eventObject);
						}));
    }-*/;

    public native void addIOErrorHandler(String event, IOErrorHandler handler)/*-{
		var peer = this.@com.emitrom.air4j.core.client.ProxyObject::getJsObj()();
		peer
				.addEventListener(
						event,
						$entry(function(e) {
							var eventObject = @com.emitrom.air4j.core.client.events.IOErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.air4j.core.client.events.handlers.IOErrorHandler::onEvent(Lcom/emitrom/air4j/core/client/events/IOErrorEvent;)(eventObject);
						}));
    }-*/;

}
