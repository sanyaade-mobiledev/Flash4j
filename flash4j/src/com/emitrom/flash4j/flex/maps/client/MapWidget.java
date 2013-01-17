package com.emitrom.flash4j.flex.maps.client;

import com.emitrom.flash4j.core.client.events.Event;
import com.emitrom.flash4j.core.client.events.handlers.EventHandler;
import com.emitrom.flash4j.flex.client.mx.core.Displayable;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.ux.client.mx.iframe.IFrame;
import com.emitrom.flash4j.flex.ux.client.mx.iframe.IFrameEvent;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Implements a Google Maps widget for Flex application Since Google is
 * deprecating the Google Maps API for Flash we are exposing maps through the JS
 * API.
 * 
 */
public class MapWidget implements Displayable {

    private IFrame iframe;
    private final String URL = GWT.getModuleBaseURL() + "map/map.html";

    public MapWidget() {
        iframe = new IFrame(URL);
    }

    @Override
    public UIComponent asUIComponent() {
        return iframe;
    }

    public void addMapLoadHandler(final MapLoadHandler handler) {
        iframe.addEventHandler(IFrameEvent.FRAME_LOAD, new EventHandler() {
            @Override
            public void onEvent(Event event) {
                JavaScriptObject map = MapWidget.this.getMap();
                MapWidget.this.handleMapLoadedEvent(map, handler);
            }
        });
    }

    public JavaScriptObject getMap() {
        return _getMap("iframe_" + iframe.getIframeId());
    }

    private native JavaScriptObject _getMap(String id)/*-{
		var el = $doc.getElementById(id);
		var iFrameDoc = el.contentDocument || el.contentWindow.document
		var div = iFrameDoc.getElementById('flash4j_map_canvas');
		$wnd.google = div.mapsApi;
		//$wnd.console.log(div.mapWidget);
		return div.mapWidget;
    }-*/;

    private native void handleMapLoadedEvent(JavaScriptObject map, MapLoadHandler handler)/*-{
		$wnd.google.maps.event
				.addListenerOnce(
						map,
						'tilesloaded',
						$entry(function() {
							handler.@com.emitrom.flash4j.flex.maps.client.MapLoadHandler::onMapLoad()();
						}));
    }-*/;

}
