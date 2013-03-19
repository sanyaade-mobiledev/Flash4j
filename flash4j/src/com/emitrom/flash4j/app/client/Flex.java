package com.emitrom.flash4j.app.client;

import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.ui.mx.Canvas;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;

public class Flex extends Canvas {

    private static FlexUiBinder uiBinder = GWT.create(FlexUiBinder.class);

    interface FlexUiBinder extends UiBinder<UIComponent, Flex> {
    }

    public Flex() {
        this.strech();
        addElement(uiBinder.createAndBindUi(this));
    }
}
