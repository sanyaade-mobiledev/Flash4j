/************************************************************************
  Orientation3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.core.client.geom;

public enum Orientation3D {

    AXIS_ANGLE("AXIS_ANGLE"), EULER_ANGLES("EULER_ANGLES"), QUATERNION("QUATERNION");

    public final String value;

    private Orientation3D(String reference) {
        value = createPeer(reference);
    }

    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.flash.geom.Orientation3D[reference];
    }-*/;

    public static native Orientation3D fromValue(String value) /*-{
		switch (value) {
		case $wnd.runtime.flash.geom.Orientation3D.AXIS_ANGLE:
			return @com.emitrom.air4j.core.client.geom.Orientation3D::AXIS_ANGLE;

		case $wnd.runtime.flash.geom.Orientation3D.EULER_ANGLES:
			return @com.emitrom.air4j.core.client.geom.Orientation3D::EULER_ANGLES;

		case $wnd.runtime.flash.geom.Orientation3D.QUATERNION:
			return @com.emitrom.air4j.core.client.geom.Orientation3D::QUATERNION;
			s
		}
    }-*/;

}