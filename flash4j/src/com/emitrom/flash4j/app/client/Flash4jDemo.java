package com.emitrom.flash4j.app.client;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.flash4j.alivepdf.client.colors.RGBColor;
import com.emitrom.flash4j.alivepdf.client.data.DataCollection;
import com.emitrom.flash4j.alivepdf.client.fonts.CoreFont;
import com.emitrom.flash4j.alivepdf.client.grid.Grid;
import com.emitrom.flash4j.alivepdf.client.grid.GridColumn;
import com.emitrom.flash4j.alivepdf.client.layout.Align;
import com.emitrom.flash4j.alivepdf.client.pdf.PDF;
import com.emitrom.flash4j.core.client.data.BaseModel;
import com.emitrom.flash4j.core.client.utils.Color;
import com.emitrom.flash4j.excel.client.ExcelFile;
import com.emitrom.flash4j.excel.client.Sheet;
import com.emitrom.flash4j.flex.client.core.runtime.FLEX;
import com.emitrom.flash4j.flex.client.core.runtime.FlexEntryPoint;
import com.emitrom.flash4j.flex.client.mx.collections.ArrayCollection;
import com.emitrom.flash4j.flex.client.ui.mx.Panel;
import com.emitrom.flash4j.flex.client.ui.spark.Application;
import com.emitrom.flash4j.flex.maps.client.MapLoadHandler;
import com.emitrom.flash4j.flex.maps.client.MapWidget;
import com.emitrom.pilot.maps.client.GMap;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.overlays.InfoWindow;
import com.emitrom.pilot.maps.client.overlays.Marker;
import com.google.gwt.core.client.JavaScriptObject;

public class Flash4jDemo extends FlexEntryPoint {

    private ArrayCollection dataProvider;

    @Override
    public void onLoad() {

        FLEX.getRootPanel().setStyle("backgroundColor", Color.CADETBLUE.getValue());

        Panel panel = new Panel("Google Map");
        panel.setPercentSize(70, 90);
        panel.setCentered();

        final MapWidget w = new MapWidget();
        w.addMapLoadHandler(new MapLoadHandler() {
            @Override
            public void onMapLoad() {

                GMap googleMap = new GMap(w.getMap());

                LatLng position = googleMap.getCenter();
                Marker marker = new Marker(googleMap, position);

                InfoWindow info = new InfoWindow();
                info.setContent("Flash4j 3.1 and Google Maps");
                info.open(googleMap, marker);

            }
        });
        panel.addElement(w);

        FLEX.getRootPanel().addElement(panel);

    }

    private void exportToXls() {
        Sheet excelSheet = new Sheet();
        excelSheet.setCell(0, 0, "Real Name");
        excelSheet.setCell(0, 1, "Nick Name");
        for (int i = 0; i < dataProvider.getLength(); i++) {
            SuperHero heroe = SuperHero.from((JavaScriptObject) dataProvider.getItemAt(i));
            excelSheet.setCell(i + 1, 0, heroe.getNickName());
            excelSheet.setCell(i + 1, 1, heroe.getRealName());
        }

        ExcelFile file = new ExcelFile();
        file.addSheet(excelSheet);
        Application.get().saveFile(file.saveToByteArray(), "file.xls");
    }

    private void exportToPdf() {
        DataCollection data = DataCollection.newInstance();
        for (int i = 0; i < dataProvider.getLength(); i++) {
            SuperHero heroe = SuperHero.from((JavaScriptObject) dataProvider.getItemAt(i));
            data.addItem(heroe);
        }

        Grid grid = new Grid(data, // data
                        500, // width
                        300, // height
                        new RGBColor(0xE6E6FA), // headerColor
                        new RGBColor(0xF5FFFA), // cellColor
                        true, // useAlternateRowColor
                        new RGBColor(0x00FA9A), // alternateRowColor
                        new RGBColor(0x1E90FF), // borderColor
                        1, // borderAlpha
                        7 // headerHeight
        );

        GridColumn realName = new GridColumn("Real Name", SuperHero.NICK_NAME, 100, Align.CENTER);
        GridColumn nickName = new GridColumn("Real Name", SuperHero.REAL_NAME, 100, Align.CENTER);

        List<GridColumn> cols = new ArrayList<GridColumn>();
        cols.add(realName);
        cols.add(nickName);
        grid.setColumns(cols);

        PDF pdf = new PDF();
        pdf.addPage();
        pdf.setTextStyle(new RGBColor(0x000000));
        pdf.setFont(new CoreFont(), 10);
        pdf.addGrid(grid);
        Application.get().saveFile(pdf.save(), "File.pdf");

    }

    private static class SuperHero extends BaseModel {
        public static final String REAL_NAME = "realName";
        public static final String NICK_NAME = "nickName";

        public SuperHero(String realName, String nickName) {
            this.set(NICK_NAME, nickName);
            this.set(REAL_NAME, realName);
        }

        private SuperHero(JavaScriptObject obj) {
            this.jsObj = obj;
        }

        public static SuperHero from(JavaScriptObject obj) {
            return new SuperHero(obj);
        }

        public String getNickName() {
            return this.get(NICK_NAME);
        }

        public String getRealName() {
            return this.get(REAL_NAME);
        }
    }

}
