package com.hhstechgroup.vyp.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", skipFirstLine = false)
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense_type() {
        return license_type;
    }

    public void setLicense_type(String license_type) {
        this.license_type = license_type;
    }

    public String getProfession_type() {
        return profession_type;
    }

    public void setProfession_type(String profession_type) {
        this.profession_type = profession_type;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

}