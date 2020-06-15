package com.hhstechgroup.vyp.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", skipFirstLine = true)
public class TherapyPhysical {

    @DataField(pos = 1, required = false)
    public String last_name;

    @DataField(pos = 2, required = false)
    public String first_name;

    @DataField(pos = 3, required = false)
    public String initial;

    @DataField(pos = 4, required = false)
    public String business;

    @DataField(pos = 5, required = false)
    public String address;

    @DataField(pos = 6, required = false)
    public String city;

    @DataField(pos = 7, required = false)
    public String state;

    @DataField(pos = 8, required = false)
    public String zip;

    @DataField(pos = 9, required = false)
    public String phone;

    @DataField(pos = 10, required = false)
    public String email;

    @DataField(pos = 11, required = false)
    public String profession;

    @DataField(pos = 12, required = false)
    public String license_certificate;

    @DataField(pos = 13, required = false)
    public String license_number;

    @DataField(pos = 14, required = false)
    public String issue_date;

    @DataField(pos = 15, required = false)
    public String expiry_date;

    @DataField(pos = 16, required = false)
    public String discipline;

    @DataField(pos = 17, required = false)
    public String status;

}
