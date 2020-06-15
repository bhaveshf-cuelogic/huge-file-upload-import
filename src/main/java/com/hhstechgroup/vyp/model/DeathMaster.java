package com.hhstechgroup.vyp.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord
public class DeathMaster {

    @DataField(pos = 1, length = 1, required = false)
    public String action; // a-add, c-change, d-delete

    @DataField(pos = 2, length = 9, required = false)
    public String ssn;

    @DataField(pos = 3, length = 20, required = false)
    public String last_name;

    @DataField(pos = 4, length = 4, required = false)
    public String name_suffix;

    @DataField(pos = 5, length = 15, required = false)
    public String first_name;

    @DataField(pos = 6, length = 15, required = false)
    public String middle_name;

    @DataField(pos = 7, length = 1, required = false)
    public String verified_or_proof_code;

    @DataField(pos = 8, length = 8, required = false)
    public String dod;

    @DataField(pos = 9, length = 8, required = false)
    public String dob;

    @DataField(pos = 10, length = 2, required = false)
    public String blank_field1;

    @DataField(pos = 11, length = 5, required = false)
    public String blank_field2;

    @DataField(pos = 12, length = 5, required = false)
    public String blank_field3;

    @DataField(pos = 13, length = 7, required = false)
    public String blank_field4;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName_suffix() {
        return name_suffix;
    }

    public void setName_suffix(String name_suffix) {
        this.name_suffix = name_suffix;
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

    public String getVerified_or_proof_code() {
        return verified_or_proof_code;
    }

    public void setVerified_or_proof_code(String verified_or_proof_code) {
        this.verified_or_proof_code = verified_or_proof_code;
    }

    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBlank_field1() {
        return blank_field1;
    }

    public void setBlank_field1(String blank_field1) {
        this.blank_field1 = blank_field1;
    }

    public String getBlank_field2() {
        return blank_field2;
    }

    public void setBlank_field2(String blank_field2) {
        this.blank_field2 = blank_field2;
    }

    public String getBlank_field3() {
        return blank_field3;
    }

    public void setBlank_field3(String blank_field3) {
        this.blank_field3 = blank_field3;
    }

    public String getBlank_field4() {
        return blank_field4;
    }

    public void setBlank_field4(String blank_field4) {
        this.blank_field4 = blank_field4;
    }

}
