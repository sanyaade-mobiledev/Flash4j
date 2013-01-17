/************************************************************************
  Keyboard.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.ui;

import com.google.gwt.core.client.JsArrayString;

public class Keyboard {

    public static final int A = getConstant2("A");
    public static final int ALTERNATE = getConstant2("ALTERNATE");
    public static final int B = getConstant2("B");
    public static final int BACK = getConstant2("BACK");
    public static final int BACKSLASH = getConstant2("BACKSLASH");
    public static final int BACKQUOTE = getConstant2("BACKQUOTE");
    public static final int BACKSPACE = getConstant2("BACKSPACE");
    public static final int BLUE = getConstant2("BLUE");
    public static final int C = getConstant2("C");
    public static final int CAPS_LOCK = getConstant2("CAPS_LOCK");
    public static final int CHANNEL_DOWN = getConstant2("CHANNEL_DOWN");
    public static final int CHANNEL_UP = getConstant2("CHANNEL_UP");
    public static final JsArrayString CharCodeStrings = getConstant3("CharCodeStrings");
    public static final int COMMA = getConstant2("COMMA");
    public static final int COMMAND = getConstant2("COMMAND");
    public static final int CONTROL = getConstant2("CONTROL");
    public static final int D = getConstant2("D");
    public static final int DELETE = getConstant2("DELETE");
    public static final int DOWN = getConstant2("DOWN");
    public static final int DWR = getConstant2("DWR");
    public static final int E = getConstant2("E");
    public static final int END = getConstant2("END");
    public static final int ENTER = getConstant2("ENTER");
    public static final int EQUAL = getConstant2("EQUAL");
    public static final int ESCAPE = getConstant2("ESCAPE");
    public static final int EXIT = getConstant2("EXIT");
    public static final int F = getConstant2("F");
    public static final int F1 = getConstant2("F1");
    public static final int F10 = getConstant2("F10");
    public static final int F11 = getConstant2("F11");
    public static final int F12 = getConstant2("F12");
    public static final int F13 = getConstant2("F13");
    public static final int F14 = getConstant2("F14");
    public static final int F15 = getConstant2("F15");
    public static final int F2 = getConstant2("F2");
    public static final int F3 = getConstant2("F3");
    public static final int F4 = getConstant2("F4");
    public static final int F5 = getConstant2("F5");
    public static final int F6 = getConstant2("F6");
    public static final int F7 = getConstant2("F7");
    public static final int F8 = getConstant2("F8");
    public static final int F9 = getConstant2("F9");
    public static final int FAST_FORWARD = getConstant2("FAST_FORWARD");
    public static final int G = getConstant2("G");
    public static final int GREEN = getConstant2("GREEN");
    public static final int GUIDE = getConstant2("GUIDE");
    public static final int H = getConstant2("H");
    public static final int HELP = getConstant2("HELP");
    public static final int HOME = getConstant2("HOME");
    public static final int I = getConstant2("I");
    public static final int INFO = getConstant2("INFO");
    public static final int INSERT = getConstant2("INSERT");
    public static final int J = getConstant2("J");
    public static final int K = getConstant2("K");
    public static final String KEYNAME_BEGIN = getConstant("KEYNAME_BEGIN");
    public static final String KEYNAME_BREAK = getConstant("KEYNAME_BREAK");
    public static final String KEYNAME_CLEARDISPLAY = getConstant("KEYNAME_CLEARDISPLAY");
    public static final String KEYNAME_CLEARLINE = getConstant("KEYNAME_CLEARLINE");
    public static final String KEYNAME_DELETE = getConstant("KEYNAME_DELETE");
    public static final String KEYNAME_DELETECHAR = getConstant("KEYNAME_DELETECHAR");
    public static final String KEYNAME_DELETELINE = getConstant("KEYNAME_DELETELINE");
    public static final String KEYNAME_DOWNARROW = getConstant("KEYNAME_DOWNARROW");
    public static final String KEYNAME_END = getConstant("KEYNAME_END");
    public static final String KEYNAME_EXCECUTE = getConstant("KEYNAME_EXCECUTE");
    public static final String KEYNAME_F1 = getConstant("KEYNAME_F1");
    public static final String KEYNAME_F11 = getConstant("KEYNAME_F11");
    public static final String KEYNAME_F12 = getConstant("KEYNAME_F12");
    public static final String KEYNAME_F13 = getConstant("KEYNAME_F13");
    public static final String KEYNAME_F14 = getConstant("KEYNAME_F14");
    public static final String KEYNAME_F15 = getConstant("KEYNAME_F15");
    public static final String KEYNAME_F16 = getConstant("KEYNAME_F16");
    public static final String KEYNAME_F17 = getConstant("KEYNAME_F17");
    public static final String KEYNAME_F18 = getConstant("KEYNAME_F18");
    public static final String KEYNAME_F19 = getConstant("KEYNAME_F19");
    public static final String KEYNAME_F2 = getConstant("KEYNAME_F2");
    public static final String KEYNAME_F20 = getConstant("KEYNAME_F10");
    public static final String KEYNAME_F21 = getConstant("KEYNAME_F21");
    public static final String KEYNAME_F22 = getConstant("KEYNAME_F22");
    public static final String KEYNAME_F23 = getConstant("KEYNAME_F23");
    public static final String KEYNAME_F24 = getConstant("KEYNAME_F24");
    public static final String KEYNAME_F25 = getConstant("KEYNAME_F25");
    public static final String KEYNAME_F26 = getConstant("KEYNAME_F26");
    public static final String KEYNAME_F27 = getConstant("KEYNAME_F27");
    public static final String KEYNAME_F28 = getConstant("KEYNAME_F28");
    public static final String KEYNAME_F29 = getConstant("KEYNAME_F29");
    public static final String KEYNAME_F30 = getConstant("KEYNAME_F30");
    public static final String KEYNAME_F31 = getConstant("KEYNAME_F31");
    public static final String KEYNAME_F32 = getConstant("KEYNAME_F32");
    public static final String KEYNAME_F33 = getConstant("KEYNAME_F33");
    public static final String KEYNAME_F34 = getConstant("KEYNAME_F34");
    public static final String KEYNAME_F35 = getConstant("KEYNAME_F35");
    public static final String KEYNAME_F4 = getConstant("KEYNAME_F4");
    public static final String KEYNAME_F5 = getConstant("KEYNAME_F5");
    public static final String KEYNAME_F6 = getConstant("KEYNAME_F6");
    public static final String KEYNAME_F7 = getConstant("KEYNAME_F7");
    public static final String KEYNAME_F8 = getConstant("KEYNAME_F8");
    public static final String KEYNAME_F9 = getConstant("KEYNAME_F9");
    public static final String KEYNAME_FIND = getConstant("KEYNAME_FIND");
    public static final String KEYNAME_HELP = getConstant("KEYNAME_HELP");
    public static final String KEYNAME_HOME = getConstant("KEYNAME_HOME");
    public static final String KEYNAME_INSERT = getConstant("KEYNAME_INSERT");
    public static final String KEYNAME_INSERTCHAR = getConstant("KEYNAME_INSERTCHAR");
    public static final String KEYNAME_INSERTLINE = getConstant("KEYNAME_INSERTLINE");
    public static final String KEYNAME_LEFTARROW = getConstant("KEYNAME_LEFTARROW");
    public static final String KEYNAME_MENU = getConstant("KEYNAME_MENU");
    public static final String KEYNAME_MODESWIDTH = getConstant("KEYNAME_MODESWIDTH");
    public static final String KEYNAME_NEXT = getConstant("KEYNAME_NEXT");
    public static final String KEYNAME_PAGEDOWN = getConstant("KEYNAME_PAGEDOWN");
    public static final String KEYNAME_PAGEUP = getConstant("KEYNAME_PAGEUP");
    public static final String KEYNAME_PAUSE = getConstant("KEYNAME_PAUSE");
    public static final String KEYNAME_PREV = getConstant("KEYNAME_PREV");
    public static final String KEYNAME_PRINT = getConstant("KEYNAME_PRINT");
    public static final String KEYNAME_PRINTSCREEN = getConstant("KEYNAME_PRINTSCREEN");
    public static final String KEYNAME_REDO = getConstant("KEYNAME_REDO");
    public static final String KEYNAME_RESET = getConstant("KEYNAME_RESET");
    public static final String KEYNAME_RIGHTARROW = getConstant("KEYNAME_RIGHTARROW");
    public static final String KEYNAME_SCROLLLOCK = getConstant("KEYNAME_SCROLLLOCK");
    public static final String KEYNAME_SELECT = getConstant("KEYNAME_SELECT");
    public static final String KEYNAME_STOP = getConstant("KEYNAME_STOP");
    public static final String KEYNAME_SYSREQ = getConstant("KEYNAME_SYSREQ");
    public static final String KEYNAME_SYSTEM = getConstant("KEYNAME_SYSTEM");
    public static final String KEYNAME_UNDO = getConstant("KEYNAME_UNDO");
    public static final String KEYNAME_UPARROW = getConstant("KEYNAME_UPARROW");
    public static final String KEYNAME_USER = getConstant("KEYNAME_USER");
    public static final int L = getConstant2("L");
    public static final int LAST = getConstant2("LAST");
    public static final int LEFT = getConstant2("LEFT");
    public static final int LEFTBRACKET = getConstant2("LEFTBRACKET");
    public static final int LIVE = getConstant2("LIVE");
    public static final int M = getConstant2("M");
    public static final int MASTER_SHELL = getConstant2("MASTER_SHELL");
    public static final int MENU = getConstant2("MENU");
    public static final int MINUS = getConstant2("MINUS");
    public static final int N = getConstant2("N");
    public static final int NEXT = getConstant2("NEXT");
    public static final int NUMBER_0 = getConstant2("NUMBER_0");
    public static final int NUMBER_1 = getConstant2("NUMBER_1");
    public static final int NUMBER_2 = getConstant2("NUMBER_2");
    public static final int NUMBER_3 = getConstant2("NUMBER_3");
    public static final int NUMBER_4 = getConstant2("NUMBER_4");
    public static final int NUMBER_5 = getConstant2("NUMBER_5");
    public static final int NUMBER_6 = getConstant2("NUMBER_6");
    public static final int NUMBER_7 = getConstant2("NUMBER_7");
    public static final int NUMBER_8 = getConstant2("NUMBER_8");
    public static final int NUMBER_9 = getConstant2("NUMBER_9");
    public static final int NUMPAD = getConstant2("NUMPAD");
    public static final int NUMPAD_0 = getConstant2("NUMPAD_0");
    public static final int NUMPAD_1 = getConstant2("NUMPAD_1");
    public static final int NUMPAD_2 = getConstant2("NUMPAD_2");
    public static final int NUMPAD_3 = getConstant2("NUMPAD_3");
    public static final int NUMPAD_4 = getConstant2("NUMPAD_4");
    public static final int NUMPAD_5 = getConstant2("NUMPAD_5");
    public static final int NUMPAD_6 = getConstant2("NUMPAD_6");
    public static final int NUMPAD_7 = getConstant2("NUMPAD_7");
    public static final int NUMPAD_8 = getConstant2("NUMPAD_8");
    public static final int NUMPAD_9 = getConstant2("NUMPAD_9");
    public static final int NUMPAD_ADD = getConstant2("NUMPAD_ADD");
    public static final int NUMPAD_DECIMAL = getConstant2("NUMPAD_DECIMAL");
    public static final int NUMPAD_DIVIDE = getConstant2("NUMPAD_DIVIDE");
    public static final int NUMPAD_ENTER = getConstant2("NUMPAD_ENTER");
    public static final int NUMPAD_MUTLIPLY = getConstant2("NUMPAD_MUTLIPLY");
    public static final int NUMPAD_SUBSTRACT = getConstant2("NUMPAD_SUBSTRACT");
    public static final int O = getConstant2("O");
    public static final int P = getConstant2("P");
    public static final int PAGE_DOWN = getConstant2("PAGE_DOWN");
    public static final int PAGE_UP = getConstant2("PAGE_UP");
    public static final int PAUSE = getConstant2("PAUSE");
    public static final int PERIOD = getConstant2("PERIOD");
    public static final int PLAY = getConstant2("PLAY");
    public static final int PREVIOUS = getConstant2("PREVIOUS");
    public static final int Q = getConstant2("Q");
    public static final int QUOTE = getConstant2("QUOTE");
    public static final int R = getConstant2("R");
    public static final int RECORD = getConstant2("RECORD");
    public static final int RED = getConstant2("RED");
    public static final int REWIND = getConstant2("REWIND");
    public static final int RIGHTBRACKET = getConstant2("RIGHTBRACKET");
    public static final int S = getConstant2("S");
    public static final int SEMICOLON = getConstant2("SEMICOLON");
    public static final int SETUP = getConstant2("SETUP");
    public static final int SHIFT = getConstant2("SHIFT");
    public static final int SKIP_BACKWARD = getConstant2("SKIP_BACKWARD");
    public static final int SKIP_FORWARD = getConstant2("SKIP_FORWARD");
    public static final int SLASH = getConstant2("SLASH");
    public static final int SPACE = getConstant2("SPACE");
    public static final int STOP = getConstant2("STOP");
    public static final String STRING_BEGIN = getConstant("STRING_BEGIN");
    public static final String STRING_BREAK = getConstant("STRING_BREAK");
    public static final String STRING_CLEARDISPLAY = getConstant("STRING_CLEARDISPLAY");
    public static final String STRING_CLEARLINE = getConstant("STRING_CLEARLINE");
    public static final String STRING_DELETE = getConstant("STRING_DELETE");
    public static final String STRING_DELETECHAR = getConstant("STRING_DELETECHAR");
    public static final String STRING_DELETELINE = getConstant("STRING_DELETELINE");
    public static final String STRING_DOWNARROW = getConstant("STRING_DOWNARROW");
    public static final String STRING_END = getConstant("STRING_END");
    public static final String STRING_EXECUTE = getConstant("STRING_EXECUTE");
    public static final String STRING_F1 = getConstant("STRING_F1");
    public static final String STRING_F10 = getConstant("STRING_F10");
    public static final String STRING_F11 = getConstant("STRING_F11");
    public static final String STRING_F12 = getConstant("STRING_F12");
    public static final String STRING_F13 = getConstant("STRING_F13");
    public static final String STRING_F14 = getConstant("STRING_F14");
    public static final String STRING_F15 = getConstant("STRING_F15");
    public static final String STRING_F16 = getConstant("STRING_F16");
    public static final String STRING_F17 = getConstant("STRING_F17");
    public static final String STRING_F18 = getConstant("STRING_F18");
    public static final String STRING_F19 = getConstant("STRING_F19");
    public static final String STRING_F20 = getConstant("STRING_F20");
    public static final String STRING_F21 = getConstant("STRING_F21");
    public static final String STRING_F22 = getConstant("STRING_F22");
    public static final String STRING_F23 = getConstant("STRING_F23");
    public static final String STRING_F24 = getConstant("STRING_F24");
    public static final String STRING_F25 = getConstant("STRING_F25");
    public static final String STRING_F26 = getConstant("STRING_F26");
    public static final String STRING_F27 = getConstant("STRING_F27");
    public static final String STRING_F28 = getConstant("STRING_F28");
    public static final String STRING_F29 = getConstant("STRING_F29");
    public static final String STRING_F3 = getConstant("STRING_F3");
    public static final String STRING_F30 = getConstant("STRING_F30");
    public static final String STRING_F31 = getConstant("STRING_F31");
    public static final String STRING_F32 = getConstant("STRING_F32");
    public static final String STRING_F33 = getConstant("STRING_F33");
    public static final String STRING_F34 = getConstant("STRING_F34");
    public static final String STRING_F4 = getConstant("STRING_F4");
    public static final String STRING_F5 = getConstant("STRING_F5");
    public static final String STRING_F6 = getConstant("STRING_F6");
    public static final String STRING_F7 = getConstant("STRING_F7");
    public static final String STRING_F8 = getConstant("STRING_F8");
    public static final String STRING_F9 = getConstant("STRING_F9");
    public static final String STRING_FIND = getConstant("STRING_FIND");
    public static final String STRING_HELP = getConstant("STRING_HELP");
    public static final String STRING_HOME = getConstant("STRING_HOME");
    public static final String STRING_INSERT = getConstant("STRING_INSERT");
    public static final String STRING_INSERTCHAR = getConstant("STRING_INSERTCHAR");
    public static final String STRING_INSERTLINE = getConstant("STRING_INSERTLINE");
    public static final String STRING_LEFTARROW = getConstant("STRING_LEFTARROW");
    public static final String STRING_MENU = getConstant("STRING_MENU");
    public static final String STRING_MODESWITCH = getConstant("STRING_MODESWITCH");
    public static final String STRING_NEXT = getConstant("STRING_NEXT");
    public static final String STRING_PAGEDOWN = getConstant("STRING_PAGEDOWN");
    public static final String STRING_PAGEUP = getConstant("STRING_PAGEUP");
    public static final String STRING_PAUSE = getConstant("STRING_PAUSE");
    public static final String STRING_PREV = getConstant("STRING_PREV");
    public static final String STRING_PRINT = getConstant("STRING_PRINT");
    public static final String STRING_PRINTSCREEN = getConstant("STRING_PRINTSCREEN");
    public static final String STRING_REDO = getConstant("STRING_REDO");
    public static final String STRING_RESET = getConstant("STRING_RESET");
    public static final String STRING_RIGHTARROW = getConstant("STRING_RIGHTARROW");
    public static final String STRING_SCROLLLOCK = getConstant("STRING_SCROLLLOCK");
    public static final String STRING_SELECT = getConstant("STRING_SELECT");
    public static final String STRING_STOP = getConstant("STRING_STOP");
    public static final String STRING_SYSREQ = getConstant("STRING_SYSREQ");
    public static final String STRING_SYSTEM = getConstant("STRING_SYSTEM");
    public static final String STRING_UNDO = getConstant("STRING_UNDO");
    public static final String STRING_UPARROW = getConstant("STRING_UPARROW");
    public static final String STRING_USER = getConstant("STRING_USER");
    public static final int SUBTITLE = getConstant2("SUBTITLE");
    public static final int T = getConstant2("T");
    public static final int TAB = getConstant2("TAB");
    public static final int U = getConstant2("U");
    public static final int UP = getConstant2("UP");
    public static final int V = getConstant2("V");
    public static final int W = getConstant2("W");
    public static final int X = getConstant2("X");
    public static final int Y = getConstant2("Y");
    public static final int YELLOW = getConstant2("YELLOW");
    public static final int Z = getConstant2("Z");

    private Keyboard() {
    }

    private static native String getConstant(String reference) /*-{
		return $wnd.runtime.flash.ui.Keyboard[reference];
    }-*/;

    private static native int getConstant2(String reference) /*-{
		return $wnd.runtime.flash.ui.Keyboard[reference];
    }-*/;

    private static native JsArrayString getConstant3(String reference) /*-{
		return $wnd.runtime.flash.ui.Keyboard[reference];
    }-*/;

    public final native boolean isCapsLockActive() /*-{
		return $wnd.runtime.flash.ui.Keyboard.capsLock;
    }-*/;

    public final native boolean isNumLockActive() /*-{
		return $wnd.runtime.flash.ui.Keyboard.numLock;
    }-*/;

    public final native boolean isAccessible() /*-{
		return $wnd.runtime.flash.ui.Keyboard.isAccessible();
    }-*/;

    public final native boolean hasVirtualKeyboard() /*-{
		return $wnd.runtime.flash.ui.Keyboard.hasVirtualKeyboard;
    }-*/;

    public final native String getPhysicalKeyboardType() /*-{
		return $wnd.runtime.flash.ui.Keyboard.physicalKeyboardType;
    }-*/;

}
