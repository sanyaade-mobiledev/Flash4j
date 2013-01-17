/************************************************************************
  MessageWindow.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.notifications.toast;

import com.emitrom.air4j.core.client.display.Graphics;
import com.emitrom.air4j.core.client.display.NativeWindow;
import com.emitrom.air4j.core.client.display.NativeWindowInitOptions;
import com.emitrom.air4j.core.client.display.NativeWindowSystemChrome;
import com.emitrom.air4j.core.client.display.NativeWindowType;
import com.emitrom.air4j.core.client.display.Sprite;
import com.emitrom.air4j.core.client.display.StageAlign;
import com.emitrom.air4j.core.client.display.StageScaleMode;
import com.emitrom.air4j.core.client.events.Event;
import com.emitrom.air4j.core.client.events.MouseEvent;
import com.emitrom.air4j.core.client.events.handlers.EventHandler;
import com.emitrom.air4j.core.client.geom.Rectangle;
import com.emitrom.air4j.core.client.html.HTMLLoader;
import com.emitrom.air4j.core.client.text.TextField;
import com.emitrom.air4j.core.client.text.TextFieldAutoSize;

class MessageWindow {

    private final HTMLLoader loader;
    private int timeToLive;
    private DisplayManager manager;
    private int lineStyle;
    private int bodyColor;

    public HTMLLoader getLoader() {
        return loader;
    }

    public void setTimeToLive(int time) {
        this.timeToLive = time;
    }

    public void setManager(DisplayManager manager) {
        this.manager = manager;

    }

    private EventHandler onClickListener = new EventHandler() {
        @Override
        public void onEvent(Event event) {
            closeMessageWindowAndRemoveListner(liveTickListener);
        }
    };

    private EventHandler liveTickListener = new EventHandler() {
        @Override
        public void onEvent(Event event) {
            timeToLive--;
            if (timeToLive < 1) {
                closeMessageWindowAndRemoveListner(this);
            }
        }
    };

    public MessageWindow(String message, DisplayManager newManager) {

        this.setManager(newManager);
        NativeWindowInitOptions options = new NativeWindowInitOptions();
        options.setType(NativeWindowType.LIGHTWEIGHT);
        options.setTransparent(true);
        options.setSystemChrome(NativeWindowSystemChrome.NONE);

        loader = HTMLLoader.createRootWindow(false, options, false);
        loader.getStage().getNativeWindow().setWidth(250);
        loader.getStage().addEventHandler(MouseEvent.MOUSE_DOWN, onClickListener);
        loader.getStage().setAlign(StageAlign.TOP_LEFT);
        loader.getStage().setScaleMode(StageScaleMode.NO_SCALE);

        this.manager.getEventDispatcher().addEventHandler(DisplayManager.LIFE_TICK, liveTickListener);

        // TextFormat format = TextFormat.newInstance("Verdana", 14, 0xFF0000);

        TextField text = new TextField();
        text.setText(message);
        text.setWordWrap(true);
        // text.setTextFormat(format);
        text.setAutoSize(TextFieldAutoSize.LEFT);

        loader.getStage().addChild(text);

        text.setX(5);
        text.setY(5);
        text.setWidth(loader.getStage().getNativeWindow().getWidth() - 10);

        loader.getStage().getNativeWindow().setHeight((text.getLength() + 50));

        Sprite backGround = new Sprite();

        Graphics g = backGround.getGraphcis();
        g.clear();
        g.lineStyle(manager.getLineStyle());
        g.beginFill(manager.getColor(), .9);
        g.drawRoundRect(2, 2, (loader.getStage().getNativeWindow().getWidth() - 4), (loader.getStage()
                        .getNativeWindow().getHeight() - 4), 10, 10);
        g.endFill();

        loader.getStage().addChildAt(backGround, 0);
        loader.getStage().getNativeWindow().setAlwaysInFront(true);

    }

    public void animateY(final double endY) {
        final NativeWindow l = MessageWindow.this.getLoader().getStage().getNativeWindow();
        l.getStage().addEventHandler(Event.ENTER_FRAME, new EventHandler() {
            @Override
            public void onEvent(Event event) {
                double dY = 0;
                double wY = l.getY();
                dY = (endY - wY) / 4;
                l.setY(l.getY() + dY);
                if (l.getY() <= endY) {
                    l.setY(endY);
                }

            }
        });

    }

    public void setX(double x) {
        loader.getStage().getNativeWindow().setX(x);
    }

    public void setY(double y) {
        loader.getStage().getNativeWindow().setY(y);
    }

    public Rectangle getBounds() {
        return (loader.getStage().getNativeWindow().getBounds());
    }

    public void setVisible() {
        loader.getStage().getNativeWindow().setVisible(true);
    }

    private void closeMessageWindowAndRemoveListner(EventHandler listnerToRemove) {
        manager.getEventDispatcher().removeEventHandler(DisplayManager.LIFE_TICK, listnerToRemove);
        loader.getStage().getNativeWindow().close();
    }

    public int getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(int lineStyle) {
        this.lineStyle = lineStyle;
    }

    public int getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(int bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getTimeToLive() {
        return timeToLive;
    }

}
