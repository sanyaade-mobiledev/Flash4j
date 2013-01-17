/************************************************************************
  Utils3D.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class Utils3D extends JavaScriptObject {

    protected Utils3D() {

    }

    public static native boolean isInstance(JavaScriptObject o) /*-{
		return o instanceof $wnd.runtime.flash.geom.Utils3D;
    }-*/;

    public static native Matrix3D pointTowards(double percent, Matrix3D mat, Vector3D pos) /*-{
		return $wnd.runtime.flash.geom.Utils3D.pointTowards(percent, mat, pot);
    }-*/;

    public static native Matrix3D pointTowards(double percent, Matrix3D mat, Vector3D pos, Vector3D at) /*-{
		return $wnd.runtime.flash.geom.Utils3D.pointTowards(percent, mat, pos,
				at);
    }-*/;

    public static native Matrix3D pointTowards(double percent, Matrix3D mat, Vector3D pos, Vector3D at, Vector3D up) /*-{
		return $wnd.runtime.flash.geom.Utils3D.pointTowards(percent, mat, pos,
				at, up);
    }-*/;

    public static native Vector3D projectVector(Matrix3D m, Vector3D v) /*-{
		return $wnd.runtime.flash.geom.Utils3D.projectVector(m, v);
    }-*/;

    public static native void projectVectors(Matrix3D m, JsArrayNumber verts, JsArrayNumber projectedVerts,
                    JsArrayNumber uvts) /*-{
		$wnd.runtime.flash.geom.Utils3D.projectVectors(m, verts,
				projectedVerts, uvts);
    }-*/;
}
