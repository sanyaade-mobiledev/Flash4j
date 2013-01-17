/************************************************************************
  Notification.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

public class Notification {

  private static Notification instance = null;
  private static DisplayManager manager;

  private Notification() {
  }

  public static Notification get() {
    if (instance == null) {
      instance = new Notification();
      manager = DisplayManager.get();
    }
    return instance;
  }

  public void displayMessage(String message) {
    manager.displayMessage(message);
  }

  public int getTimeToLive() {
    return manager.getTimeTolive();
  }

  public void setTimeToLive(int timeTolive) {
    manager.setTimeTolive(timeTolive);
  }

  public int getLineStyle() {
    return manager.getLineStyle();
  }

  public void setLineStyle(int lineStyle) {
    manager.setLineStyle(lineStyle);
  }

  public int getMessageColor() {
    return manager.getColor();
  }

  public void setBodyColor(int rgb) {
    manager.setColor(rgb);
  }

}
