/************************************************************************
 * SWFWidget.java is part of Flash4j 3.0.0 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/

package com.emitrom.flash4j.swf.client.webkit.ui;

import java.util.Map;

import com.emitrom.flash4j.swf.client.webkit.ui.exceptions.UnsupportedFlashPlayerVersionException;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * The Class SWFWidget.
 */
public class SWFWidget extends Widget {

    /** The swf params. */
    private final SWFParams swfParams;

    /** The count. */
    private static int count = 0;

    /** The Constant divPrefix. */
    private final static String divPrefix = "swfDivID_";

    /** The swf div id. */
    private final String swfDivId;

    /** The Constant idPrefix. */
    private final static String idPrefix = "swfID_";

    /** The swf id. */
    private final String swfId;

    /** The is swf injected. */
    private boolean isSWFInjected = false;

    /**
     * Instantiates a new sWF widget.
     */
    public SWFWidget() {
        this(new SWFParams());
    }

    // var desc = this.@pl.rmalinowski.gwtswf.client.ui::swfParams;
    // alert($doc.getElementById(divId).innerHTML);
    /**
     * Inject swf.
     * 
     * @param divId
     *            the div id
     * @param swf
     *            the swf
     * @param id
     *            the id
     * @param w
     *            the w
     * @param h
     *            the h
     * @param ver
     *            the ver
     * @param c
     *            the c
     * @param vars
     *            the vars
     * @return true, if successful
     */
    @SuppressWarnings("rawtypes")
    protected native boolean injectSWF(String divId, String swf, String id, String w, String h, String ver, String c,
                    Map/*
                        * < String , String >
                        */vars) /*-{
		var so = new $wnd.SWFObject(swf, id, w, h, ver, c);
		if (vars != null) {
			iterator = vars.@java.util.Map::keySet()().@java.util.Set::iterator()();
			var key, value;
			while (iterator.@java.util.Iterator::hasNext()()) {
				key = iterator.@java.util.Iterator::next()();
				value = vars.@java.util.Map::get(Ljava/lang/Object;)(key);
				so.addVariable(key, value);
			}
		}
		so.addParam("allowScriptAccess", "always");
		so.addParam("swLiveConnect", "true");
		so.addParam("id", "Flash4j");
		so.addParam("name", "Flash4j");
		so.addParam("wmode", "transparent");

		return so.write(divId);
    }-*/;

    /**
     * Instantiates a new sWF widget.
     * 
     * @param src
     *            the src
     * @param width
     *            the width
     * @param height
     *            the height
     */
    public SWFWidget(String src, Integer width, Integer height) {
        this(new SWFParams(src, width, height));
    }

    /**
     * Instantiates a new sWF widget.
     * 
     * @param src
     *            the src
     * @param width
     *            the width
     * @param height
     *            the height
     * @param bgcolor
     *            the bgcolor
     */
    public SWFWidget(String src, Integer width, Integer height, String bgcolor) {
        this(new SWFParams(src, width, height, bgcolor));
    }

    /**
     * Instantiates a new sWF widget.
     * 
     * @param src
     *            the src
     * @param width
     *            the width
     * @param height
     *            the height
     */
    public SWFWidget(String src, int width, int height) {
        this(new SWFParams(src, width, height));
    }

    /**
     * Instantiates a new sWF widget.
     * 
     * @param src
     *            the src
     * @param width
     *            the width
     * @param height
     *            the height
     */
    public SWFWidget(String src, String width, String height) {
        this(new SWFParams(src, width, height));
    }

    /**
     * Instantiates a new sWF widget.
     * 
     * @param src
     *            the src
     * @param width
     *            the width
     * @param height
     *            the height
     * @param bgcolor
     *            the bgcolor
     */
    public SWFWidget(String src, int width, int height, String bgcolor) {
        this(new SWFParams(src, width, height, bgcolor));
    }

    /**
     * Instantiates a new sWF widget.
     * 
     * @param src
     *            the src
     * @param width
     *            the width
     * @param height
     *            the height
     * @param bgcolor
     *            the bgcolor
     */
    public SWFWidget(String src, String width, String height, String bgcolor) {
        this(new SWFParams(src, width, height, bgcolor));
    }

    /**
     * Instantiates a new sWF widget.
     * 
     * @param params
     *            the params
     */
    public SWFWidget(SWFParams params) {
        swfParams = params;
        swfId = idPrefix + count + "_Flash4j";
        swfDivId = divPrefix + count + "_Flash4j";
        ++count;
        Element element = DOM.createElement("div");
        DOM.setElementProperty(element, "id", swfDivId);
        DOM.setInnerText(
                        element,
                        swfParams.getInnerTextDivForFlashPlayerNotFound().replaceAll("\\$flashPlayer.version",
                                        params.getVersion().toString()));
        setElement(element);
        // GWT.log("Created with id " + swfId, null);

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.Widget#onLoad()
     */
    protected void onLoad() {
        if (!isSWFInjected) {
            onBeforeSWFInjection();
            if (!injectSWF(getSwfDivId(), swfParams.getSrc(), getSwfId(), swfParams.getWidth(), swfParams.getHeight(),
                            swfParams.getVersion().toString(), swfParams.getBgcolor(), swfParams.getVars()))
                throw new UnsupportedFlashPlayerVersionException();
            isSWFInjected = true;
            onAfterSWFInjection();
        }
        super.onLoad();
    }

    /**
     * On after swf injection.
     */
    protected void onAfterSWFInjection() {

    }

    /**
     * On before swf injection.
     */
    protected void onBeforeSWFInjection() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.Widget#onUnload()
     */
    protected void onUnload() {
        super.onUnload();
    }

    /**
     * Show.
     * 
     * @throws UnsupportedFlashPlayerVersionException
     *             the unsupported flash player version exception
     */
    public void show() throws UnsupportedFlashPlayerVersionException {
        setVisible(true);
    }

    /**
     * Hide.
     */
    public void hide() {
        setVisible(false);
    }

    /**
     * Gets the swf div id.
     * 
     * @return the swf div id
     */
    protected String getSwfDivId() {
        return swfDivId;
    }

    /**
     * Gets the swf id.
     * 
     * @return the swf id
     */
    protected String getSwfId() {
        return swfId;
    }

    /**
     * Gets the swf params.
     * 
     * @return the swf params
     */
    public SWFParams getSwfParams() {
        return swfParams;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.UIObject#setHeight(java.lang.String)
     */
    public void setHeight(String height) {
        if (isSWFInjected)
            throw getUnspportedSizeChangingException("height");
        super.setHeight(height);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.UIObject#setPixelSize(int, int)
     */
    public void setPixelSize(int width, int height) {
        if (isSWFInjected)
            throw getUnspportedSizeChangingException("size");
        super.setPixelSize(width, height);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.UIObject#setSize(java.lang.String,
     * java.lang.String)
     */
    public void setSize(String width, String height) {
        if (isSWFInjected)
            throw getUnspportedSizeChangingException("size");
        super.setSize(width, height);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.UIObject#setWidth(java.lang.String)
     */
    public void setWidth(String width) {
        if (isSWFInjected)
            throw getUnspportedSizeChangingException("width");
        super.setWidth(width);
    }

    /**
     * Gets the unspported size changing exception.
     * 
     * @param msg
     *            the msg
     * @return the unspported size changing exception
     */
    private UnsupportedOperationException getUnspportedSizeChangingException(String msg) {
        return new UnsupportedOperationException("Seting " + msg + " of SWFWidget after it was generated"
                        + " is not implemented yet. Please change it"
                        + " before SWFWidget will be attached to RootPanel.");

    }

}
