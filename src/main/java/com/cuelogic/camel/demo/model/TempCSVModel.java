package com.cuelogic.camel.demo.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = ",", skipFirstLine = false)
public class TempCSVModel {

    @DataField(pos = 1, required = false)
    String Col1;

    @DataField(pos = 2, required = false)
    String Col2;

    @DataField(pos = 3, required = false)
    String Col3;
    
    @DataField(pos = 4, required = false)
    String Col4;
    
    public String getCol1() {
        return Col1;
    }

    public void setCol1(String col1) {
        Col1 = col1;
    }

    public String getCol2() {
        return Col2;
    }

    public void setCol2(String col2) {
        Col2 = col2;
    }

    public String getCol3() {
        return Col3;
    }

    public void setCol3(String col3) {
        Col3 = col3;
    }
    
    @Override
    public String toString() {
        return "TempCSVModel [Col1=" + Col1 + ", Col2=" + Col2 + ", Col3=" + Col3 + "]";
    }
}
