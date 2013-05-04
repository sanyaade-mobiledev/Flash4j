package com.emitrom.flash4j.app.client;

import com.emitrom.flash4j.core.client.events.ClickEvent;
import com.emitrom.flash4j.flex.client.mx.core.UIComponent;
import com.emitrom.flash4j.flex.client.ui.mx.Alert;
import com.emitrom.flash4j.flex.client.ui.mx.Button;
import com.emitrom.flash4j.flex.client.ui.mx.Canvas;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;

public class Flex extends Canvas {

    private static FlexUiBinder uiBinder = GWT.create(FlexUiBinder.class);

    interface FlexUiBinder extends UiBinder<UIComponent, Flex> {
    }

    @UiField
    Button button;

    public Flex() {
        this.strech();
        addElement(uiBinder.createAndBindUi(this));
    }

    @UiHandler("button")
    void handleClick(ClickEvent e) {
        Alert.show("Hello World");
    }
}
