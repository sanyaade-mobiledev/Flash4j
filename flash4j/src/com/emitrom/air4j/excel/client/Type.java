/************************************************************************
  Type.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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

package com.emitrom.air4j.excel.client;


public class Type {

    private Type() {

    }

    public static final int DIMENSIONS = getConstant("DIMENSIONS");
    public static final int BLANK = getConstant("BLANK");
    public static final int INTEGER = getConstant("INTEGER");
    public static final int NUMBER = getConstant("NUMBER");
    public static final int LABEL = getConstant("LABEL");
    public static final int BOOLERR = getConstant("BOOLERR");
    public static final int FORMULA = getConstant("FORMULA");
    public static final int STRING = getConstant("STRING");
    public static final int ROW = getConstant("ROW");
    public static final int BOF = getConstant("BOF");
    public static final int EOF = getConstant("EOF");
    public static final int INDEX = getConstant("INDEX");
    public static final int CALCCOUNT = getConstant("CALCCOUNT");
    public static final int CALCMODE = getConstant("CALCMODE");
    public static final int PRECISION = getConstant("PRECISION");
    public static final int REFMODE = getConstant("REFMODE");
    public static final int DELTA = getConstant("DELTA");
    public static final int ITERATION = getConstant("ITERATION");
    public static final int PROTECT = getConstant("PROTECT");
    public static final int PASSWORD = getConstant("PASSWORD");
    public static final int HEADER = getConstant(" HEADER");
    public static final int FOOTER = getConstant("FOOTER");
    public static final int EXTERNCOUNT = getConstant("EXTERNCOUNT");
    public static final int EXTERNSHEET = getConstant("EXTERNSHEET");
    public static final int NAME = getConstant("NAME");
    public static final int WINDOWPROTECT = getConstant("WINDOWPROTECT");
    public static final int VERTICALPAGEBREAKS = getConstant("VERTICALPAGEBREAKS");
    public static final int HORIZONTALPAGEBREAKSEndSheet = getConstant("HORIZONTALPAGEBREAKS");
    public static final int NOTE = getConstant("NOTE");
    public static final int SELECTION = getConstant("SELECTION");
    public static final int FORMAT = getConstant("FORMAT");
    public static final int BUILTINFMTCOUNT = getConstant("BUILTINFMTCOUNT");
    public static final int COLUMNDEFAULT = getConstant("COLUMNDEFAULT");
    public static final int ARRAY = getConstant("ARRAY");
    public static final int DATEMODE = getConstant("DATEMODE");
    public static final int EXTERNNAME = getConstant("EXTERNNAME");
    public static final int COLWIDTH = getConstant("COLWIDTH");
    public static final int DEFAULTROWHEIGHT = getConstant("DEFAULTROWHEIGHT");
    public static final int LEFTMARGIN = getConstant("LEFTMARGIN");
    public static final int RIGHTMARGIN = getConstant("RIGHTMARGIN");
    public static final int TOPMARGIN = getConstant("TOPMARGIN");
    public static final int BOTTOMMARGIN = getConstant("BOTTOMMARGIN");
    public static final int PRINTHEADERS = getConstant("PRINTHEADERS");
    public static final int FILEPASS = getConstant("FILEPASS");
    public static final int FONT = getConstant("FONT");
    public static final int FONT2 = getConstant("FONT2");
    public static final int TABLEOP = getConstant("TABLEOP");
    public static final int TABLEOP2 = getConstant(" TABLEOP2");
    public static final int CONTINUE = getConstant("CONTINUE");
    public static final int WINDOW1 = getConstant("WINDOW1");
    public static final int WINDOW2 = getConstant("WINDOW2");
    public static final int BACKUP = getConstant("BACKUP");
    public static final int PANE = getConstant("PANE");
    public static final int CODEPAGE = getConstant("CODEPAGE");
    public static final int XF = getConstant("XF");
    public static final int IXFE = getConstant("IXFE");
    public static final int EFONT = getConstant("EFONT");
    public static final int DCONREF = getConstant("DCONREF");
    public static final int DEFCOLWIDTH = getConstant("DEFCOLWIDTH");
    public static final int XCT = getConstant("XCT");
    public static final int CRN = getConstant("CRN");
    public static final int FILESHARING = getConstant("FILESHARING");
    public static final int WRITEACCESS = getConstant("WRITEACCESS");
    public static final int UNCALCED = getConstant("UNCALCED");
    public static final int SAVERCALC = getConstant("SAVERCALC");
    public static final int OBJECTPROTECT = getConstant("OBJECTPROTECT");
    public static final int COLINFO = getConstant("COLINFO");
    public static final int GUTS = getConstant("GUTS");
    public static final int WSBOOL = getConstant("WSBOOL");
    public static final int GRIDSET = getConstant("GRIDSET");
    public static final int HCENTER = getConstant("HCENTER");
    public static final int VCENTER = getConstant("VCENTER");
    public static final int WRITEPROT = getConstant("WRITEPROT");
    public static final int COUNTRY = getConstant("COUNTRY");
    public static final int HIDEOBJ = getConstant("HIDEOBJ");
    public static final int PALETTE = getConstant("PALETTE");
    public static final int SETUP = getConstant("SETUP");
    public static final int MULRK = getConstant("MULRK");
    public static final int MULBLANK = getConstant("MULBLANK");
    public static final int DBCELL = getConstant("DBCELL");
    public static final int BOOKBOOL = getConstant("BOOKBOOL");
    public static final int MERGEDCELLS = getConstant("MERGEDCELLS");
    public static final int PHONETIC = getConstant("PHONETIC");
    public static final int SST = getConstant("SST");
    public static final int LABELSST = getConstant("LABELSST");
    public static final int EXTSST = getConstant("EXTSST");
    public static final int USELFS = getConstant("USELFS");
    public static final int DSF = getConstant("DSF");
    public static final int DV = getConstant("DV");
    public static final int RK = getConstant("RK");
    public static final int STYLE = getConstant("STYLE");
    public static final int SHRFMLA = getConstant("SHRFMLA");

    public static final int SHEETPROTECTION = getConstant("SHEETPROTECTION");
    public static final int RANGEPROTECTION = getConstant("RANGEPROTECTION");

    private static native int getConstant(String name) /*-{
		return $wnd.runtime.com.as3xls.xls.Type[name];
    }-*/;

}
