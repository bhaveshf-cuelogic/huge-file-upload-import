package com.hhstechgroup.vyp.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", skipFirstLine = true)
public class TherapySpeech {

    @DataField(pos = 1, required = false)
    public String name;

    @DataField(pos = 2, required = false)
    public String license_type;

    @DataField(pos = 3, required = false)
    public String profession_type;

    @DataField(pos = 4, required = false)
    public String license_number;

    @DataField(pos = 5, required = false)
    public String issue_date;

    @DataField(pos = 6, required = false)
    public String expiry_date;

    @DataField(pos = 7, required = false)
    public String status;

    @DataField(pos = 8, required = false)
    public String discipline;

}