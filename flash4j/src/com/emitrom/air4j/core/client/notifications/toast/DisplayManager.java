/************************************************************************
  DisplayManager.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
/*
 *   
 */
package com.emitrom.air4j.core.client.notifications.toast;

import java.util.List;

import com.emitrom.air4j.core.client.desktop.NativeApplication;
import com.emitrom.air4j.core.client.display.NativeWindow;
import com.emitrom.air4j.core.client.display.Screen;
import com.emitrom.air4j.core.client.events.Event;
import com.emitrom.air4j.core.client.events.TimerEvent;
import com.emitrom.air4j.core.client.events.handlers.EventHandler;
import com.emitrom.air4j.core.client.geom.Point;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.emitrom.air4j.core.client.html.HTMLLoader;
import com.emitrom.air4j.core.client.utils.Timer;

public class DisplayManager {

    private Screen currentScreen;
    private HTMLLoader dispatcher;
    public static final String LIFE_TICK = "LIFE_TICK";
    private int timeTolive = 5;
    private Timer lifeTimer = new Timer(1000);
    private int lineStyle;
    private int color;

    private static DisplayManager instance = null;

    private EventHandler addTickListner = new EventHandler() {
        @Override
        public void onEvent(Event event) {
            Event tickerEvent = new Event(LIFE_TICK, false, false);
            dispatcher.dispatchEvent(tickerEvent);
        }
    };;

    protected DisplayManager() {
        dispatcher = new HTMLLoader();
        currentScreen = Screen.getScreens().get(0);
        lifeTimer = new Timer(1000);
        lifeTimer.addEventHandler(TimerEvent.TIMER, addTickListner);
        lifeTimer.start();
        this.setLineStyle(2);
        this.setColor(0xC2D8F0);
    }

    public static DisplayManager get() {
        if (instance == null) {
            instance = new DisplayManager();
        }
        return instance;
    }

    public void pauseExpiration() {
        lifeTimer.stop();
    }

    public void resumeExpiration() {
        lifeTimer.start();
    }

    private Point findSpotForMessage(Rectangle size) {
        Point p = new Point();
        boolean done = false;
        List<Screen> screens = Screen.getScreens();
        for (int i = 0; i < screens.size(); i++) {
            currentScreen = screens.get(i);
            for (int x = (int) (currentScreen.getVisibleBounds().getX() + currentScreen.getVisibleBounds().getWidth()
                            - size.getWidth() - 10); x >= currentScreen.getVisibleBounds().getX(); x -= 260) {

                for (int y = (int) (currentScreen.getVisibleBounds().getY()
                                + currentScreen.getVisibleBounds().getHeight() - size.getHeight() - 10); y >= currentScreen
                                .getVisibleBounds().getY(); y -= 10) {

                    Rectangle testRect = new Rectangle(x, y, size.getWidth() + 10, size.getHeight() + 10);

                    if (!isOccupied(testRect)) {
                        p.setX(x);
                        p.setY(y);
                        done = true;
                        break;
                    }
                }

                if (done) {
                    break;
                }
            }

            if (done) {
                break;
            }
        }

        return p;

    }

    private boolean isOccupied(Rectangle testRect) {
        boolean occupied = false;
        List<NativeWindow> openWindows = NativeApplication.get().getOpenedWindows();
        // i starts at one to skip the initial window
        for (int i = 1; i < openWindows.size(); i++) {
            occupied = openWindows.get(i).getBounds().intersects(testRect);
            if (occupied) {
                break;
            }

        }
        return occupied;

    }

    public void displayMessage(String message) {
        MessageWindow messageWindow = new MessageWindow(message, this);
        Point p = findSpotForMessage(messageWindow.getBounds());
        messageWindow.setTimeToLive(timeTolive);
        messageWindow.setX(p.getX());
        messageWindow.setY(currentScreen.getBounds().getHeight());
        messageWindow.setVisible();
        messageWindow.animateY(p.getY());
    }

    public int getTimeTolive() {
        return timeTolive;
    }

    public void setTimeTolive(int timeTolive) {
        this.timeTolive = timeTolive;
    }

    public int getLineStyle() {
        return this.lineStyle;
    }

    public void setLineStyle(int lineStyle) {
        this.lineStyle = lineStyle;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public HTMLLoader getEventDispatcher() {
        return dispatcher;
    }

}
