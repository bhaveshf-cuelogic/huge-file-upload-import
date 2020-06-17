package com.hhstechgroup.vyp.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", skipFirstLine = false)
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

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLicense_certificate() {
        return license_certificate;
    }

    public void setLicense_certificate(String license_certificate) {
        this.license_certificate = license_certificate;
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

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
