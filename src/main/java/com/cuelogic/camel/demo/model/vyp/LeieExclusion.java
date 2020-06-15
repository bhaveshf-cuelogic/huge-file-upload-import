package com.cuelogic.camel.demo.model.vyp;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", skipFirstLine = true)
public class LeieExclusion {

    @DataField(pos = 1, required = false)
    public String last_name;

    @DataField(pos = 2, required = false)
    public String first_name;

    @DataField(pos = 3, required = false)
    public String middle_name;

    @DataField(pos = 4, required = false)
    public String business_name;

    @DataField(pos = 5, required = false)
    public String general;

    @DataField(pos = 6, required = false)
    public String speciality;

    @DataField(pos = 7, required = false)
    public String upin;

    @DataField(pos = 8, required = false)
    public String npi;

    @DataField(pos = 9, required = false)
    public String dob;

    @DataField(pos = 10, required = false)
    public String address;

    @DataField(pos = 11, required = false)
    public String city;

    @DataField(pos = 12, required = false)
    public String state;

    @DataField(pos = 13, required = false)
    public String zip;

    @DataField(pos = 14, required = false)
    public String exclusion_type;

    @DataField(pos = 15, required = false)
    public String exclusion_date;

    @DataField(pos = 16, required = false)
    public String reinstatement_date;

    @DataField(pos = 17, required = false)
    public String waiver_date;

    @DataField(pos = 18, required = false)
    public String waiver_state;

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getUpin() {
        return upin;
    }

    public void setUpin(String upin) {
        this.upin = upin;
    }

    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getExclusion_type() {
        return exclusion_type;
    }

    public void setExclusion_type(String exclusion_type) {
        this.exclusion_type = exclusion_type;
    }

    public String getExclusion_date() {
        return exclusion_date;
    }

    public void setExclusion_date(String exclusion_date) {
        this.exclusion_date = exclusion_date;
    }

    public String getReinstatement_date() {
        return reinstatement_date;
    }

    public void setReinstatement_date(String reinstatement_date) {
        this.reinstatement_date = reinstatement_date;
    }

    public String getWaiver_date() {
        return waiver_date;
    }

    public void setWaiver_date(String waiver_date) {
        this.waiver_date = waiver_date;
    }

    public String getWaiver_state() {
        return waiver_state;
    }

    public void setWaiver_state(String waiver_state) {
        this.waiver_state = waiver_state;
    }

}
