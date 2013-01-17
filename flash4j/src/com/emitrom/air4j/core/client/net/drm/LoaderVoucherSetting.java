/************************************************************************
  LoaderVoucherSetting.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.air4j.core.client.net.drm;

public enum LoaderVoucherSetting {

    ALLOW_SERVER("ALLOW_SERVER"), LOCAL_ONLY("LOCAL_ONLY"), FORCE_REFRESH("FORCE_REFRESH");

    public final String value;

    private LoaderVoucherSetting(String openMode) {
        value = createPeer(openMode);
    }

    private static native String createPeer(String method) /*-{
		return $wnd.runtime.flash.net.drm.LoaderVoucherSetting[method];
    }-*/;

    public static native LoaderVoucherSetting fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.display.LoaderVoucherSetting.ALLOW_SERVER:
			return @com.emitrom.air4j.core.client.net.drm.LoaderVoucherSetting::ALLOW_SERVER;

		case $wnd.runtime.flash.display.LoaderVoucherSetting.FORCE_REFRESH:
			return @com.emitrom.air4j.core.client.net.drm.LoaderVoucherSetting::FORCE_REFRESH;

		case $wnd.runtime.flash.display.LoaderVoucherSetting.LOCAL_ONLY:
			return @com.emitrom.air4j.core.client.net.drm.LoaderVoucherSetting::LOCAL_ONLY;

		}
    }-*/;
}
