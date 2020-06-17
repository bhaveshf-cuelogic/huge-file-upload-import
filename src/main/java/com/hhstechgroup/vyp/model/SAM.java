package com.hhstechgroup.vyp.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|", skipFirstLine = false)
public class SAM {

    @DataField(pos = 1, length = 9, required = false)
    String duns;

    @DataField(pos = 2, length = 4, required = false)
    String duns_plus_4;

    @DataField(pos = 3, length = 5, required = false)
    String cage_code;

    @DataField(pos = 4, length = 9, required = false)
    String dodaac;

    @DataField(pos = 5, length = 1, required = false)
    String sam_extract_code;

    @DataField(pos = 6, length = 2, required = false)
    String purpose_of_registration;

    @DataField(pos = 7, length =  8, required = false)
    String initial_registration_date;

    @DataField(pos = 8, length = 8, required = false)
    String expiration_date;

    @DataField(pos = 9, length = 8, required = false)
    String last_update_date;

    @DataField(pos = 10, length = 8, required = false)
    String activation_date;

    @DataField(pos = 11, length = 120, required = false)
    String legal_business_name;

    @DataField(pos = 12, length = 120, required = false)
    String dba_name;

    @DataField(pos = 13, length = 60, required = false)
    String company_division;

    @DataField(pos = 14, length = 10, required = false)
    String division_number;

    @DataField(pos = 15, length = 150, required = false)
    String physical_address_line_1;

    @DataField(pos = 16, length = 150, required = false)
    String physical_address_line_2;

    @DataField(pos = 17, length = 40, required = false)
    String physical_address_city;

    @DataField(pos = 18, length = 55, required = false)
    String physical_address_state;

    @DataField(pos = 19, length = 50, required = false)
    String physical_address_zip;

    @DataField(pos = 20, length = 4, required = false)
    String physical_address_zip_plus_4;

    @DataField(pos = 21, length = 3, required = false)
    String physical_address_country_code;

    @DataField(pos = 22, length = 10, required = false)
    String entity_congressional_district;

    @DataField(pos = 23, length = 8, required = false)
    String business_start_date;

    @DataField(pos = 24, length = 4, required = false)
    String fiscal_year_close_date;

    @DataField(pos = 25, length = 200, required = false)
    String corporate_url;

    @DataField(pos = 26, length = 2, required = false)
    String entity_structure;

    @DataField(pos = 27, length = 2, required = false)
    String state_of_incorporation;

    @DataField(pos = 28, length = 3, required = false)
    String country_of_incorporation;

    @DataField(pos = 29, length = 4, required = false)
    String business_type_counter;

    @DataField(pos = 30, length = 220, required = false)
    String business_type_string;

    @DataField(pos = 31, length = 6, required = false)
    String primary_naics;

    @DataField(pos = 32, length = 4, required = false)
    String naics_code_counter;

    @DataField(pos = 33, length = 12000, required = false)
    String naics_code_string;

    @DataField(pos = 34, length = 4, required = false)
    String psc_code_counter;

    @DataField(pos = 35, length = 2500, required = false)
    String psc_code_string;

    @DataField(pos = 36, length = 1, required = false)
    String credit_card_usage;

    @DataField(pos = 37, length = 1, required = false)
    String correspondence_flag;

    @DataField(pos = 38, length = 150, required = false)
    String mailing_address_line_1;

    @DataField(pos = 39, length = 150, required = false)
    String mailing_address_line_2;

    @DataField(pos = 40, length = 40, required = false)
    String mailing_address_city;

    @DataField(pos = 41, length = 50, required = false)
    String mailing_address_zip_postal_code;

    @DataField(pos = 42, length = 4, required = false)
    String mailing_address_zip_code_4;

    @DataField(pos = 43, length = 3, required = false)
    String mailing_address_country;

    @DataField(pos = 44, length = 55, required = false)
    String mailing_address_state_or_province;

    @DataField(pos = 45, length = 65, required = false)
    String govt_bus_poc_first_name;

    @DataField(pos = 46, length = 3, required = false)
    String govt_bus_poc_middle_initial;

    @DataField(pos = 47, length = 65, required = false)
    String govt_bus_poc_last_name;

    @DataField(pos = 48, length = 50, required = false)
    String govt_bus_poc_title;

    @DataField(pos = 49, length = 150, required = false)
    String govt_bus_poc_st_add_1;

    @DataField(pos = 50, length = 150, required = false)
    String govt_bus_poc_st_add_2;

    @DataField(pos = 51, length = 40, required = false)
    String govt_bus_poc_city;

    @DataField(pos = 52, length = 50, required = false)
    String govt_bus_poc_zip_postal_code;

    @DataField(pos = 53, length = 4, required = false)
    String govt_bus_poc_zip_code_4;

    @DataField(pos = 54, length = 3, required = false)
    String govt_bus_poc_country_code;

    @DataField(pos = 55, length = 55, required = false)
    String govt_bus_poc_state_or_province;

    @DataField(pos = 56, length = 30, required = false)
    String govt_bus_poc_us_phone;

    @DataField(pos = 57, length = 25, required = false)
    String govt_bus_poc_us_phone_ext;

    @DataField(pos = 58, length = 30, required = false)
    String govt_bus_poc_non_us_phone;

    @DataField(pos = 59, length = 30, required = false)
    String govt_bus_poc_fax_us_only;

    @DataField(pos = 60, length = 80, required = false)
    String govt_bus_poc_email;

    @DataField(pos = 61, length = 65, required = false)
    String alt_govt_bus_poc_first_name;

    @DataField(pos = 62, length = 3, required = false)
    String alt_govt_bus_poc_middle_initial;

    @DataField(pos = 63, length = 65, required = false)
    String alt_govt_bus_poc_last_name;

    @DataField(pos = 64, length = 50, required = false)
    String alt_govt_bus_poc_title;

    @DataField(pos = 65, length = 150, required = false)
    String alt_govt_bus_poc_st_add_1;

    @DataField(pos = 66, length = 150, required = false)
    String alt_govt_bus_poc_st_add_2;

    @DataField(pos = 67, length = 40, required = false)
    String alt_govt_bus_poc_city;

    @DataField(pos = 68, length = 50, required = false)
    String alt_govt_bus_poc_zip_postal_code;

    @DataField(pos = 69, length = 4, required = false)
    String alt_govt_bus_poc_zip_code_4;

    @DataField(pos = 70, length = 3, required = false)
    String alt_govt_bus_poc_country_code;

    @DataField(pos = 71, length = 55, required = false)
    String alt_govt_bus_poc_state_or_province;

    @DataField(pos = 72, length = 30, required = false)
    String alt_govt_bus_poc_us_phone;

    @DataField(pos = 73, length = 25, required = false)
    String alt_govt_bus_poc_us_phone_ext;

    @DataField(pos = 74, length = 30, required = false)
    String alt_govt_bus_poc_non_us_phone;

    @DataField(pos = 75, length = 30, required = false)
    String alt_govt_bus_poc_fax_us_only;

    @DataField(pos = 76, length = 80, required = false)
    String alt_govt_bus_poc_email;

    @DataField(pos = 77, length = 65, required = false)
    String past_perf_poc_poc_first_name;

    @DataField(pos = 78, length = 3, required = false)
    String past_perf_poc_poc_middle_initial;

    @DataField(pos = 79, length = 65, required = false)
    String past_perf_poc_poc_last_name;

    @DataField(pos = 80, length = 50, required = false)
    String past_perf_poc_poc_title;

    @DataField(pos = 81, length = 150, required = false)
    String past_perf_poc_st_add_1;

    @DataField(pos = 82, length = 150, required = false)
    String past_perf_poc_st_add_2;

    @DataField(pos = 83, length = 40, required = false)
    String past_perf_poc_city;

    @DataField(pos = 84, length = 50, required = false)
    String past_perf_poc_zip_postal_code;

    @DataField(pos = 85, length = 4, required = false)
    String past_perf_poc_zip_code_4;

    @DataField(pos = 86, length = 3, required = false)
    String past_perf_poc_country_code;

    @DataField(pos = 87, length = 55, required = false)
    String past_perf_poc_state_or_province;

    @DataField(pos = 88, length = 30, required = false)
    String past_perf_poc_us_phone;

    @DataField(pos = 89, length = 25, required = false)
    String past_perf_poc_us_phone_ext;

    @DataField(pos = 90, length = 30, required = false)
    String past_perf_poc_non_us_phone;

    @DataField(pos = 91, length = 30, required = false)
    String past_perf_poc_fax_us_only;

    @DataField(pos = 92, length = 80, required = false)
    String past_perf_poc_email;

    @DataField(pos = 93, length = 65, required = false)
    String alt_past_perf_poc_first_name;

    @DataField(pos = 94, length = 3, required = false)
    String alt_past_perf_poc_middle_initial;

    @DataField(pos = 95, length = 65, required = false)
    String alt_past_perf_poc_last_name;

    @DataField(pos = 96, length = 50, required = false)
    String alt_past_perf_poc_title;

    @DataField(pos = 97, length = 150, required = false)
    String alt_past_perf_poc_st_add_1;

    @DataField(pos = 98, length = 150, required = false)
    String alt_past_perf_poc_st_add_2;

    @DataField(pos = 99, length = 40, required = false)
    String alt_past_perf_poc_city;

    @DataField(pos = 100, length = 50, required = false)
    String alt_past_perf_poc_zip_postal_code;

    @DataField(pos = 101, length = 4, required = false)
    String alt_past_perf_poc_zip_code_4;

    @DataField(pos = 102, length = 3, required = false)
    String alt_past_perf_poc_country_code;

    @DataField(pos = 103, length = 55, required = false)
    String alt_past_perf_poc_state_or_province;

    @DataField(pos = 104, length = 30, required = false)
    String alt_past_perf_poc_us_phone;

    @DataField(pos = 105, length = 25, required = false)
    String alt_past_perf_poc_us_phone_ext;

    @DataField(pos = 106, length = 30, required = false)
    String alt_past_perf_poc_non_us_phone;

    @DataField(pos = 107, length = 30, required = false)
    String alt_past_perf_poc_fax_us_only;

    @DataField(pos = 108, length = 80, required = false)
    String alt_past_perf_poc_email;

    @DataField(pos = 109, length = 65, required = false)
    String elec_bus_poc_first_name;

    @DataField(pos = 110, length = 3, required = false)
    String elec_bus_poc_middle_initial;

    @DataField(pos = 111, length = 65, required = false)
    String elec_bus_poc_last_name;

    @DataField(pos = 112, length = 50, required = false)
    String elec_bus_poc_title;

    @DataField(pos = 113, length = 150, required = false)
    String elec_bus_poc_st_add_1;

    @DataField(pos = 114, length = 150, required = false)
    String elec_bus_poc_st_add_2;

    @DataField(pos = 115, length = 40, required = false)
    String elec_bus_poc_city;

    @DataField(pos = 116, length = 50, required = false)
    String elec_bus_poc_zip_postal_code;

    @DataField(pos = 117, length = 4, required = false)
    String elec_bus_poc_zip_code_4;

    @DataField(pos = 118, length = 3, required = false)
    String elec_bus_poc_country_code;

    @DataField(pos = 119, length = 55, required = false)
    String elec_bus_poc_state_or_province;

    @DataField(pos = 120, length = 30, required = false)
    String elec_bus_poc_us_phone;

    @DataField(pos = 121, length = 25, required = false)
    String elec_bus_poc_us_phone_ext;

    @DataField(pos = 122, length = 30, required = false)
    String elec_bus_poc_non_us_phone;

    @DataField(pos = 123, length = 30, required = false)
    String elec_bus_poc_fax_us_only;

    @DataField(pos = 124, length = 80, required = false)
    String elec_bus_poc_email;

    @DataField(pos = 125, length = 65, required = false)
    String alt_elec_poc_bus_poc_first_name;

    @DataField(pos = 126, length = 3, required = false)
    String alt_elec_poc_bus_poc_middle_initial;

    @DataField(pos = 127, length = 65, required = false)
    String alt_elec_poc_bus_poc_last_name;

    @DataField(pos = 128, length = 50, required = false)
    String alt_elec_poc_bus_poc_title;

    @DataField(pos = 129, length = 150, required = false)
    String alt_elec_poc_bus_st_add_1;

    @DataField(pos = 130, length = 150, required = false)
    String alt_elec_poc_bus_st_add_2;

    @DataField(pos = 131, length = 40, required = false)
    String alt_elec_poc_bus_city;

    @DataField(pos = 132, length = 50, required = false)
    String alt_elec_poc_bus_zip_postal_code;

    @DataField(pos = 133, length = 4, required = false)
    String alt_elec_poc_bus_zip_code_4;

    @DataField(pos = 134, length = 3, required = false)
    String alt_elec_poc_bus_country_code;

    @DataField(pos = 135, length = 55, required = false)
    String alt_elec_poc_bus_state_or_province;

    @DataField(pos = 136, length = 30, required = false)
    String alt_elec_poc_bus_us_phone;

    @DataField(pos = 137, length = 25, required = false)
    String alt_elec_poc_bus_us_phone_ext;

    @DataField(pos = 138, length = 30, required = false)
    String alt_elec_poc_bus_non_us_phone;

    @DataField(pos = 139, length = 30, required = false)
    String alt_elec_poc_bus_fax_us_only;

    @DataField(pos = 140, length = 80, required = false)
    String alt_elec_poc_bus_email;

    @DataField(pos = 141, length = 4, required = false)
    String naics_exception_counter;

    @DataField(pos = 142, length = 1100, required = false)
    String naics_exception_string;

    @DataField(pos = 143, length = 1, required = false)
    String debt_subject_to_offset_flag;

    @DataField(pos = 144, length = 1, required = false)
    String exclusion_status_flag;

    @DataField(pos = 145, length = 4, required = false)
    String sba_business_types_counter;

    @DataField(pos = 146, length = 125, required = false)
    String sba_business_types_string;

    @DataField(pos = 147, length = 4, required = false)
    String no_public_display_flag;

    @DataField(pos = 148, length = 4, required = false)
    String disaster_response_counter;

    @DataField(pos = 149, length = 75, required = false)
    String disaster_response_string;

    @DataField(pos = 150, length = 4, required = false)
    String end_of_record_indicator;

    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns;
    }

    public String getDuns_plus_4() {
        return duns_plus_4;
    }

    public void setDuns_plus_4(String duns_plus_4) {
        this.duns_plus_4 = duns_plus_4;
    }

    public String getCage_code() {
        return cage_code;
    }

    public void setCage_code(String cage_code) {
        this.cage_code = cage_code;
    }

    public String getDodaac() {
        return dodaac;
    }

    public void setDodaac(String dodaac) {
        this.dodaac = dodaac;
    }

    public String getSam_extract_code() {
        return sam_extract_code;
    }

    public void setSam_extract_code(String sam_extract_code) {
        this.sam_extract_code = sam_extract_code;
    }

    public String getPurpose_of_registration() {
        return purpose_of_registration;
    }

    public void setPurpose_of_registration(String purpose_of_registration) {
        this.purpose_of_registration = purpose_of_registration;
    }

    public String getInitial_registration_date() {
        return initial_registration_date;
    }

    public void setInitial_registration_date(String initial_registration_date) {
        this.initial_registration_date = initial_registration_date;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public String getActivation_date() {
        return activation_date;
    }

    public void setActivation_date(String activation_date) {
        this.activation_date = activation_date;
    }

    public String getLegal_business_name() {
        return legal_business_name;
    }

    public void setLegal_business_name(String legal_business_name) {
        this.legal_business_name = legal_business_name;
    }

    public String getDba_name() {
        return dba_name;
    }

    public void setDba_name(String dba_name) {
        this.dba_name = dba_name;
    }

    public String getCompany_division() {
        return company_division;
    }

    public void setCompany_division(String company_division) {
        this.company_division = company_division;
    }

    public String getDivision_number() {
        return division_number;
    }

    public void setDivision_number(String division_number) {
        this.division_number = division_number;
    }

    public String getPhysical_address_line_1() {
        return physical_address_line_1;
    }

    public void setPhysical_address_line_1(String physical_address_line_1) {
        this.physical_address_line_1 = physical_address_line_1;
    }

    public String getPhysical_address_line_2() {
        return physical_address_line_2;
    }

    public void setPhysical_address_line_2(String physical_address_line_2) {
        this.physical_address_line_2 = physical_address_line_2;
    }

    public String getPhysical_address_city() {
        return physical_address_city;
    }

    public void setPhysical_address_city(String physical_address_city) {
        this.physical_address_city = physical_address_city;
    }

    public String getPhysical_address_state() {
        return physical_address_state;
    }

    public void setPhysical_address_state(String physical_address_state) {
        this.physical_address_state = physical_address_state;
    }

    public String getPhysical_address_zip() {
        return physical_address_zip;
    }

    public void setPhysical_address_zip(String physical_address_zip) {
        this.physical_address_zip = physical_address_zip;
    }

    public String getPhysical_address_zip_plus_4() {
        return physical_address_zip_plus_4;
    }

    public void setPhysical_address_zip_plus_4(String physical_address_zip_plus_4) {
        this.physical_address_zip_plus_4 = physical_address_zip_plus_4;
    }

    public String getPhysical_address_country_code() {
        return physical_address_country_code;
    }

    public void setPhysical_address_country_code(String physical_address_country_code) {
        this.physical_address_country_code = physical_address_country_code;
    }

    public String getEntity_congressional_district() {
        return entity_congressional_district;
    }

    public void setEntity_congressional_district(String entity_congressional_district) {
        this.entity_congressional_district = entity_congressional_district;
    }

    public String getBusiness_start_date() {
        return business_start_date;
    }

    public void setBusiness_start_date(String business_start_date) {
        this.business_start_date = business_start_date;
    }

    public String getFiscal_year_close_date() {
        return fiscal_year_close_date;
    }

    public void setFiscal_year_close_date(String fiscal_year_close_date) {
        this.fiscal_year_close_date = fiscal_year_close_date;
    }

    public String getCorporate_url() {
        return corporate_url;
    }

    public void setCorporate_url(String corporate_url) {
        this.corporate_url = corporate_url;
    }

    public String getEntity_structure() {
        return entity_structure;
    }

    public void setEntity_structure(String entity_structure) {
        this.entity_structure = entity_structure;
    }

    public String getState_of_incorporation() {
        return state_of_incorporation;
    }

    public void setState_of_incorporation(String state_of_incorporation) {
        this.state_of_incorporation = state_of_incorporation;
    }

    public String getCountry_of_incorporation() {
        return country_of_incorporation;
    }

    public void setCountry_of_incorporation(String country_of_incorporation) {
        this.country_of_incorporation = country_of_incorporation;
    }

    public String getBusiness_type_counter() {
        return business_type_counter;
    }

    public void setBusiness_type_counter(String business_type_counter) {
        this.business_type_counter = business_type_counter;
    }

    public String getBusiness_type_string() {
        return business_type_string;
    }

    public void setBusiness_type_string(String business_type_string) {
        this.business_type_string = business_type_string;
    }

    public String getPrimary_naics() {
        return primary_naics;
    }

    public void setPrimary_naics(String primary_naics) {
        this.primary_naics = primary_naics;
    }

    public String getNaics_code_counter() {
        return naics_code_counter;
    }

    public void setNaics_code_counter(String naics_code_counter) {
        this.naics_code_counter = naics_code_counter;
    }

    public String getNaics_code_string() {
        return naics_code_string;
    }

    public void setNaics_code_string(String naics_code_string) {
        this.naics_code_string = naics_code_string;
    }

    public String getPsc_code_counter() {
        return psc_code_counter;
    }

    public void setPsc_code_counter(String psc_code_counter) {
        this.psc_code_counter = psc_code_counter;
    }

    public String getPsc_code_string() {
        return psc_code_string;
    }

    public void setPsc_code_string(String psc_code_string) {
        this.psc_code_string = psc_code_string;
    }

    public String getCredit_card_usage() {
        return credit_card_usage;
    }

    public void setCredit_card_usage(String credit_card_usage) {
        this.credit_card_usage = credit_card_usage;
    }

    public String getCorrespondence_flag() {
        return correspondence_flag;
    }

    public void setCorrespondence_flag(String correspondence_flag) {
        this.correspondence_flag = correspondence_flag;
    }

    public String getMailing_address_line_1() {
        return mailing_address_line_1;
    }

    public void setMailing_address_line_1(String mailing_address_line_1) {
        this.mailing_address_line_1 = mailing_address_line_1;
    }

    public String getMailing_address_line_2() {
        return mailing_address_line_2;
    }

    public void setMailing_address_line_2(String mailing_address_line_2) {
        this.mailing_address_line_2 = mailing_address_line_2;
    }

    public String getMailing_address_city() {
        return mailing_address_city;
    }

    public void setMailing_address_city(String mailing_address_city) {
        this.mailing_address_city = mailing_address_city;
    }

    public String getMailing_address_zip_postal_code() {
        return mailing_address_zip_postal_code;
    }

    public void setMailing_address_zip_postal_code(String mailing_address_zip_postal_code) {
        this.mailing_address_zip_postal_code = mailing_address_zip_postal_code;
    }

    public String getMailing_address_zip_code_4() {
        return mailing_address_zip_code_4;
    }

    public void setMailing_address_zip_code_4(String mailing_address_zip_code_4) {
        this.mailing_address_zip_code_4 = mailing_address_zip_code_4;
    }

    public String getMailing_address_country() {
        return mailing_address_country;
    }

    public void setMailing_address_country(String mailing_address_country) {
        this.mailing_address_country = mailing_address_country;
    }

    public String getMailing_address_state_or_province() {
        return mailing_address_state_or_province;
    }

    public void setMailing_address_state_or_province(String mailing_address_state_or_province) {
        this.mailing_address_state_or_province = mailing_address_state_or_province;
    }

    public String getGovt_bus_poc_first_name() {
        return govt_bus_poc_first_name;
    }

    public void setGovt_bus_poc_first_name(String govt_bus_poc_first_name) {
        this.govt_bus_poc_first_name = govt_bus_poc_first_name;
    }

    public String getGovt_bus_poc_middle_initial() {
        return govt_bus_poc_middle_initial;
    }

    public void setGovt_bus_poc_middle_initial(String govt_bus_poc_middle_initial) {
        this.govt_bus_poc_middle_initial = govt_bus_poc_middle_initial;
    }

    public String getGovt_bus_poc_last_name() {
        return govt_bus_poc_last_name;
    }

    public void setGovt_bus_poc_last_name(String govt_bus_poc_last_name) {
        this.govt_bus_poc_last_name = govt_bus_poc_last_name;
    }

    public String getGovt_bus_poc_title() {
        return govt_bus_poc_title;
    }

    public void setGovt_bus_poc_title(String govt_bus_poc_title) {
        this.govt_bus_poc_title = govt_bus_poc_title;
    }

    public String getGovt_bus_poc_st_add_1() {
        return govt_bus_poc_st_add_1;
    }

    public void setGovt_bus_poc_st_add_1(String govt_bus_poc_st_add_1) {
        this.govt_bus_poc_st_add_1 = govt_bus_poc_st_add_1;
    }

    public String getGovt_bus_poc_st_add_2() {
        return govt_bus_poc_st_add_2;
    }

    public void setGovt_bus_poc_st_add_2(String govt_bus_poc_st_add_2) {
        this.govt_bus_poc_st_add_2 = govt_bus_poc_st_add_2;
    }

    public String getGovt_bus_poc_city() {
        return govt_bus_poc_city;
    }

    public void setGovt_bus_poc_city(String govt_bus_poc_city) {
        this.govt_bus_poc_city = govt_bus_poc_city;
    }

    public String getGovt_bus_poc_zip_postal_code() {
        return govt_bus_poc_zip_postal_code;
    }

    public void setGovt_bus_poc_zip_postal_code(String govt_bus_poc_zip_postal_code) {
        this.govt_bus_poc_zip_postal_code = govt_bus_poc_zip_postal_code;
    }

    public String getGovt_bus_poc_zip_code_4() {
        return govt_bus_poc_zip_code_4;
    }

    public void setGovt_bus_poc_zip_code_4(String govt_bus_poc_zip_code_4) {
        this.govt_bus_poc_zip_code_4 = govt_bus_poc_zip_code_4;
    }

    public String getGovt_bus_poc_country_code() {
        return govt_bus_poc_country_code;
    }

    public void setGovt_bus_poc_country_code(String govt_bus_poc_country_code) {
        this.govt_bus_poc_country_code = govt_bus_poc_country_code;
    }

    public String getGovt_bus_poc_state_or_province() {
        return govt_bus_poc_state_or_province;
    }

    public void setGovt_bus_poc_state_or_province(String govt_bus_poc_state_or_province) {
        this.govt_bus_poc_state_or_province = govt_bus_poc_state_or_province;
    }

    public String getGovt_bus_poc_us_phone() {
        return govt_bus_poc_us_phone;
    }

    public void setGovt_bus_poc_us_phone(String govt_bus_poc_us_phone) {
        this.govt_bus_poc_us_phone = govt_bus_poc_us_phone;
    }

    public String getGovt_bus_poc_us_phone_ext() {
        return govt_bus_poc_us_phone_ext;
    }

    public void setGovt_bus_poc_us_phone_ext(String govt_bus_poc_us_phone_ext) {
        this.govt_bus_poc_us_phone_ext = govt_bus_poc_us_phone_ext;
    }

    public String getGovt_bus_poc_non_us_phone() {
        return govt_bus_poc_non_us_phone;
    }

    public void setGovt_bus_poc_non_us_phone(String govt_bus_poc_non_us_phone) {
        this.govt_bus_poc_non_us_phone = govt_bus_poc_non_us_phone;
    }

    public String getGovt_bus_poc_fax_us_only() {
        return govt_bus_poc_fax_us_only;
    }

    public void setGovt_bus_poc_fax_us_only(String govt_bus_poc_fax_us_only) {
        this.govt_bus_poc_fax_us_only = govt_bus_poc_fax_us_only;
    }

    public String getGovt_bus_poc_email() {
        return govt_bus_poc_email;
    }

    public void setGovt_bus_poc_email(String govt_bus_poc_email) {
        this.govt_bus_poc_email = govt_bus_poc_email;
    }

    public String getAlt_govt_bus_poc_first_name() {
        return alt_govt_bus_poc_first_name;
    }

    public void setAlt_govt_bus_poc_first_name(String alt_govt_bus_poc_first_name) {
        this.alt_govt_bus_poc_first_name = alt_govt_bus_poc_first_name;
    }

    public String getAlt_govt_bus_poc_middle_initial() {
        return alt_govt_bus_poc_middle_initial;
    }

    public void setAlt_govt_bus_poc_middle_initial(String alt_govt_bus_poc_middle_initial) {
        this.alt_govt_bus_poc_middle_initial = alt_govt_bus_poc_middle_initial;
    }

    public String getAlt_govt_bus_poc_last_name() {
        return alt_govt_bus_poc_last_name;
    }

    public void setAlt_govt_bus_poc_last_name(String alt_govt_bus_poc_last_name) {
        this.alt_govt_bus_poc_last_name = alt_govt_bus_poc_last_name;
    }

    public String getAlt_govt_bus_poc_title() {
        return alt_govt_bus_poc_title;
    }

    public void setAlt_govt_bus_poc_title(String alt_govt_bus_poc_title) {
        this.alt_govt_bus_poc_title = alt_govt_bus_poc_title;
    }

    public String getAlt_govt_bus_poc_st_add_1() {
        return alt_govt_bus_poc_st_add_1;
    }

    public void setAlt_govt_bus_poc_st_add_1(String alt_govt_bus_poc_st_add_1) {
        this.alt_govt_bus_poc_st_add_1 = alt_govt_bus_poc_st_add_1;
    }

    public String getAlt_govt_bus_poc_st_add_2() {
        return alt_govt_bus_poc_st_add_2;
    }

    public void setAlt_govt_bus_poc_st_add_2(String alt_govt_bus_poc_st_add_2) {
        this.alt_govt_bus_poc_st_add_2 = alt_govt_bus_poc_st_add_2;
    }

    public String getAlt_govt_bus_poc_city() {
        return alt_govt_bus_poc_city;
    }

    public void setAlt_govt_bus_poc_city(String alt_govt_bus_poc_city) {
        this.alt_govt_bus_poc_city = alt_govt_bus_poc_city;
    }

    public String getAlt_govt_bus_poc_zip_postal_code() {
        return alt_govt_bus_poc_zip_postal_code;
    }

    public void setAlt_govt_bus_poc_zip_postal_code(String alt_govt_bus_poc_zip_postal_code) {
        this.alt_govt_bus_poc_zip_postal_code = alt_govt_bus_poc_zip_postal_code;
    }

    public String getAlt_govt_bus_poc_zip_code_4() {
        return alt_govt_bus_poc_zip_code_4;
    }

    public void setAlt_govt_bus_poc_zip_code_4(String alt_govt_bus_poc_zip_code_4) {
        this.alt_govt_bus_poc_zip_code_4 = alt_govt_bus_poc_zip_code_4;
    }

    public String getAlt_govt_bus_poc_country_code() {
        return alt_govt_bus_poc_country_code;
    }

    public void setAlt_govt_bus_poc_country_code(String alt_govt_bus_poc_country_code) {
        this.alt_govt_bus_poc_country_code = alt_govt_bus_poc_country_code;
    }

    public String getAlt_govt_bus_poc_state_or_province() {
        return alt_govt_bus_poc_state_or_province;
    }

    public void setAlt_govt_bus_poc_state_or_province(String alt_govt_bus_poc_state_or_province) {
        this.alt_govt_bus_poc_state_or_province = alt_govt_bus_poc_state_or_province;
    }

    public String getAlt_govt_bus_poc_us_phone() {
        return alt_govt_bus_poc_us_phone;
    }

    public void setAlt_govt_bus_poc_us_phone(String alt_govt_bus_poc_us_phone) {
        this.alt_govt_bus_poc_us_phone = alt_govt_bus_poc_us_phone;
    }

    public String getAlt_govt_bus_poc_us_phone_ext() {
        return alt_govt_bus_poc_us_phone_ext;
    }

    public void setAlt_govt_bus_poc_us_phone_ext(String alt_govt_bus_poc_us_phone_ext) {
        this.alt_govt_bus_poc_us_phone_ext = alt_govt_bus_poc_us_phone_ext;
    }

    public String getAlt_govt_bus_poc_non_us_phone() {
        return alt_govt_bus_poc_non_us_phone;
    }

    public void setAlt_govt_bus_poc_non_us_phone(String alt_govt_bus_poc_non_us_phone) {
        this.alt_govt_bus_poc_non_us_phone = alt_govt_bus_poc_non_us_phone;
    }

    public String getAlt_govt_bus_poc_fax_us_only() {
        return alt_govt_bus_poc_fax_us_only;
    }

    public void setAlt_govt_bus_poc_fax_us_only(String alt_govt_bus_poc_fax_us_only) {
        this.alt_govt_bus_poc_fax_us_only = alt_govt_bus_poc_fax_us_only;
    }

    public String getAlt_govt_bus_poc_email() {
        return alt_govt_bus_poc_email;
    }

    public void setAlt_govt_bus_poc_email(String alt_govt_bus_poc_email) {
        this.alt_govt_bus_poc_email = alt_govt_bus_poc_email;
    }

    public String getPast_perf_poc_poc_first_name() {
        return past_perf_poc_poc_first_name;
    }

    public void setPast_perf_poc_poc_first_name(String past_perf_poc_poc_first_name) {
        this.past_perf_poc_poc_first_name = past_perf_poc_poc_first_name;
    }

    public String getPast_perf_poc_poc_middle_initial() {
        return past_perf_poc_poc_middle_initial;
    }

    public void setPast_perf_poc_poc_middle_initial(String past_perf_poc_poc_middle_initial) {
        this.past_perf_poc_poc_middle_initial = past_perf_poc_poc_middle_initial;
    }

    public String getPast_perf_poc_poc_last_name() {
        return past_perf_poc_poc_last_name;
    }

    public void setPast_perf_poc_poc_last_name(String past_perf_poc_poc_last_name) {
        this.past_perf_poc_poc_last_name = past_perf_poc_poc_last_name;
    }

    public String getPast_perf_poc_poc_title() {
        return past_perf_poc_poc_title;
    }

    public void setPast_perf_poc_poc_title(String past_perf_poc_poc_title) {
        this.past_perf_poc_poc_title = past_perf_poc_poc_title;
    }

    public String getPast_perf_poc_st_add_1() {
        return past_perf_poc_st_add_1;
    }

    public void setPast_perf_poc_st_add_1(String past_perf_poc_st_add_1) {
        this.past_perf_poc_st_add_1 = past_perf_poc_st_add_1;
    }

    public String getPast_perf_poc_st_add_2() {
        return past_perf_poc_st_add_2;
    }

    public void setPast_perf_poc_st_add_2(String past_perf_poc_st_add_2) {
        this.past_perf_poc_st_add_2 = past_perf_poc_st_add_2;
    }

    public String getPast_perf_poc_city() {
        return past_perf_poc_city;
    }

    public void setPast_perf_poc_city(String past_perf_poc_city) {
        this.past_perf_poc_city = past_perf_poc_city;
    }

    public String getPast_perf_poc_zip_postal_code() {
        return past_perf_poc_zip_postal_code;
    }

    public void setPast_perf_poc_zip_postal_code(String past_perf_poc_zip_postal_code) {
        this.past_perf_poc_zip_postal_code = past_perf_poc_zip_postal_code;
    }

    public String getPast_perf_poc_zip_code_4() {
        return past_perf_poc_zip_code_4;
    }

    public void setPast_perf_poc_zip_code_4(String past_perf_poc_zip_code_4) {
        this.past_perf_poc_zip_code_4 = past_perf_poc_zip_code_4;
    }

    public String getPast_perf_poc_country_code() {
        return past_perf_poc_country_code;
    }

    public void setPast_perf_poc_country_code(String past_perf_poc_country_code) {
        this.past_perf_poc_country_code = past_perf_poc_country_code;
    }

    public String getPast_perf_poc_state_or_province() {
        return past_perf_poc_state_or_province;
    }

    public void setPast_perf_poc_state_or_province(String past_perf_poc_state_or_province) {
        this.past_perf_poc_state_or_province = past_perf_poc_state_or_province;
    }

    public String getPast_perf_poc_us_phone() {
        return past_perf_poc_us_phone;
    }

    public void setPast_perf_poc_us_phone(String past_perf_poc_us_phone) {
        this.past_perf_poc_us_phone = past_perf_poc_us_phone;
    }

    public String getPast_perf_poc_us_phone_ext() {
        return past_perf_poc_us_phone_ext;
    }

    public void setPast_perf_poc_us_phone_ext(String past_perf_poc_us_phone_ext) {
        this.past_perf_poc_us_phone_ext = past_perf_poc_us_phone_ext;
    }

    public String getPast_perf_poc_non_us_phone() {
        return past_perf_poc_non_us_phone;
    }

    public void setPast_perf_poc_non_us_phone(String past_perf_poc_non_us_phone) {
        this.past_perf_poc_non_us_phone = past_perf_poc_non_us_phone;
    }

    public String getPast_perf_poc_fax_us_only() {
        return past_perf_poc_fax_us_only;
    }

    public void setPast_perf_poc_fax_us_only(String past_perf_poc_fax_us_only) {
        this.past_perf_poc_fax_us_only = past_perf_poc_fax_us_only;
    }

    public String getPast_perf_poc_email() {
        return past_perf_poc_email;
    }

    public void setPast_perf_poc_email(String past_perf_poc_email) {
        this.past_perf_poc_email = past_perf_poc_email;
    }

    public String getAlt_past_perf_poc_first_name() {
        return alt_past_perf_poc_first_name;
    }

    public void setAlt_past_perf_poc_first_name(String alt_past_perf_poc_first_name) {
        this.alt_past_perf_poc_first_name = alt_past_perf_poc_first_name;
    }

    public String getAlt_past_perf_poc_middle_initial() {
        return alt_past_perf_poc_middle_initial;
    }

    public void setAlt_past_perf_poc_middle_initial(String alt_past_perf_poc_middle_initial) {
        this.alt_past_perf_poc_middle_initial = alt_past_perf_poc_middle_initial;
    }

    public String getAlt_past_perf_poc_last_name() {
        return alt_past_perf_poc_last_name;
    }

    public void setAlt_past_perf_poc_last_name(String alt_past_perf_poc_last_name) {
        this.alt_past_perf_poc_last_name = alt_past_perf_poc_last_name;
    }

    public String getAlt_past_perf_poc_title() {
        return alt_past_perf_poc_title;
    }

    public void setAlt_past_perf_poc_title(String alt_past_perf_poc_title) {
        this.alt_past_perf_poc_title = alt_past_perf_poc_title;
    }

    public String getAlt_past_perf_poc_st_add_1() {
        return alt_past_perf_poc_st_add_1;
    }

    public void setAlt_past_perf_poc_st_add_1(String alt_past_perf_poc_st_add_1) {
        this.alt_past_perf_poc_st_add_1 = alt_past_perf_poc_st_add_1;
    }

    public String getAlt_past_perf_poc_st_add_2() {
        return alt_past_perf_poc_st_add_2;
    }

    public void setAlt_past_perf_poc_st_add_2(String alt_past_perf_poc_st_add_2) {
        this.alt_past_perf_poc_st_add_2 = alt_past_perf_poc_st_add_2;
    }

    public String getAlt_past_perf_poc_city() {
        return alt_past_perf_poc_city;
    }

    public void setAlt_past_perf_poc_city(String alt_past_perf_poc_city) {
        this.alt_past_perf_poc_city = alt_past_perf_poc_city;
    }

    public String getAlt_past_perf_poc_zip_postal_code() {
        return alt_past_perf_poc_zip_postal_code;
    }

    public void setAlt_past_perf_poc_zip_postal_code(String alt_past_perf_poc_zip_postal_code) {
        this.alt_past_perf_poc_zip_postal_code = alt_past_perf_poc_zip_postal_code;
    }

    public String getAlt_past_perf_poc_zip_code_4() {
        return alt_past_perf_poc_zip_code_4;
    }

    public void setAlt_past_perf_poc_zip_code_4(String alt_past_perf_poc_zip_code_4) {
        this.alt_past_perf_poc_zip_code_4 = alt_past_perf_poc_zip_code_4;
    }

    public String getAlt_past_perf_poc_country_code() {
        return alt_past_perf_poc_country_code;
    }

    public void setAlt_past_perf_poc_country_code(String alt_past_perf_poc_country_code) {
        this.alt_past_perf_poc_country_code = alt_past_perf_poc_country_code;
    }

    public String getAlt_past_perf_poc_state_or_province() {
        return alt_past_perf_poc_state_or_province;
    }

    public void setAlt_past_perf_poc_state_or_province(String alt_past_perf_poc_state_or_province) {
        this.alt_past_perf_poc_state_or_province = alt_past_perf_poc_state_or_province;
    }

    public String getAlt_past_perf_poc_us_phone() {
        return alt_past_perf_poc_us_phone;
    }

    public void setAlt_past_perf_poc_us_phone(String alt_past_perf_poc_us_phone) {
        this.alt_past_perf_poc_us_phone = alt_past_perf_poc_us_phone;
    }

    public String getAlt_past_perf_poc_us_phone_ext() {
        return alt_past_perf_poc_us_phone_ext;
    }

    public void setAlt_past_perf_poc_us_phone_ext(String alt_past_perf_poc_us_phone_ext) {
        this.alt_past_perf_poc_us_phone_ext = alt_past_perf_poc_us_phone_ext;
    }

    public String getAlt_past_perf_poc_non_us_phone() {
        return alt_past_perf_poc_non_us_phone;
    }

    public void setAlt_past_perf_poc_non_us_phone(String alt_past_perf_poc_non_us_phone) {
        this.alt_past_perf_poc_non_us_phone = alt_past_perf_poc_non_us_phone;
    }

    public String getAlt_past_perf_poc_fax_us_only() {
        return alt_past_perf_poc_fax_us_only;
    }

    public void setAlt_past_perf_poc_fax_us_only(String alt_past_perf_poc_fax_us_only) {
        this.alt_past_perf_poc_fax_us_only = alt_past_perf_poc_fax_us_only;
    }

    public String getAlt_past_perf_poc_email() {
        return alt_past_perf_poc_email;
    }

    public void setAlt_past_perf_poc_email(String alt_past_perf_poc_email) {
        this.alt_past_perf_poc_email = alt_past_perf_poc_email;
    }

    public String getElec_bus_poc_first_name() {
        return elec_bus_poc_first_name;
    }

    public void setElec_bus_poc_first_name(String elec_bus_poc_first_name) {
        this.elec_bus_poc_first_name = elec_bus_poc_first_name;
    }

    public String getElec_bus_poc_middle_initial() {
        return elec_bus_poc_middle_initial;
    }

    public void setElec_bus_poc_middle_initial(String elec_bus_poc_middle_initial) {
        this.elec_bus_poc_middle_initial = elec_bus_poc_middle_initial;
    }

    public String getElec_bus_poc_last_name() {
        return elec_bus_poc_last_name;
    }

    public void setElec_bus_poc_last_name(String elec_bus_poc_last_name) {
        this.elec_bus_poc_last_name = elec_bus_poc_last_name;
    }

    public String getElec_bus_poc_title() {
        return elec_bus_poc_title;
    }

    public void setElec_bus_poc_title(String elec_bus_poc_title) {
        this.elec_bus_poc_title = elec_bus_poc_title;
    }

    public String getElec_bus_poc_st_add_1() {
        return elec_bus_poc_st_add_1;
    }

    public void setElec_bus_poc_st_add_1(String elec_bus_poc_st_add_1) {
        this.elec_bus_poc_st_add_1 = elec_bus_poc_st_add_1;
    }

    public String getElec_bus_poc_st_add_2() {
        return elec_bus_poc_st_add_2;
    }

    public void setElec_bus_poc_st_add_2(String elec_bus_poc_st_add_2) {
        this.elec_bus_poc_st_add_2 = elec_bus_poc_st_add_2;
    }

    public String getElec_bus_poc_city() {
        return elec_bus_poc_city;
    }

    public void setElec_bus_poc_city(String elec_bus_poc_city) {
        this.elec_bus_poc_city = elec_bus_poc_city;
    }

    public String getElec_bus_poc_zip_postal_code() {
        return elec_bus_poc_zip_postal_code;
    }

    public void setElec_bus_poc_zip_postal_code(String elec_bus_poc_zip_postal_code) {
        this.elec_bus_poc_zip_postal_code = elec_bus_poc_zip_postal_code;
    }

    public String getElec_bus_poc_zip_code_4() {
        return elec_bus_poc_zip_code_4;
    }

    public void setElec_bus_poc_zip_code_4(String elec_bus_poc_zip_code_4) {
        this.elec_bus_poc_zip_code_4 = elec_bus_poc_zip_code_4;
    }

    public String getElec_bus_poc_country_code() {
        return elec_bus_poc_country_code;
    }

    public void setElec_bus_poc_country_code(String elec_bus_poc_country_code) {
        this.elec_bus_poc_country_code = elec_bus_poc_country_code;
    }

    public String getElec_bus_poc_state_or_province() {
        return elec_bus_poc_state_or_province;
    }

    public void setElec_bus_poc_state_or_province(String elec_bus_poc_state_or_province) {
        this.elec_bus_poc_state_or_province = elec_bus_poc_state_or_province;
    }

    public String getElec_bus_poc_us_phone() {
        return elec_bus_poc_us_phone;
    }

    public void setElec_bus_poc_us_phone(String elec_bus_poc_us_phone) {
        this.elec_bus_poc_us_phone = elec_bus_poc_us_phone;
    }

    public String getElec_bus_poc_us_phone_ext() {
        return elec_bus_poc_us_phone_ext;
    }

    public void setElec_bus_poc_us_phone_ext(String elec_bus_poc_us_phone_ext) {
        this.elec_bus_poc_us_phone_ext = elec_bus_poc_us_phone_ext;
    }

    public String getElec_bus_poc_non_us_phone() {
        return elec_bus_poc_non_us_phone;
    }

    public void setElec_bus_poc_non_us_phone(String elec_bus_poc_non_us_phone) {
        this.elec_bus_poc_non_us_phone = elec_bus_poc_non_us_phone;
    }

    public String getElec_bus_poc_fax_us_only() {
        return elec_bus_poc_fax_us_only;
    }

    public void setElec_bus_poc_fax_us_only(String elec_bus_poc_fax_us_only) {
        this.elec_bus_poc_fax_us_only = elec_bus_poc_fax_us_only;
    }

    public String getElec_bus_poc_email() {
        return elec_bus_poc_email;
    }

    public void setElec_bus_poc_email(String elec_bus_poc_email) {
        this.elec_bus_poc_email = elec_bus_poc_email;
    }

    public String getAlt_elec_poc_bus_poc_first_name() {
        return alt_elec_poc_bus_poc_first_name;
    }

    public void setAlt_elec_poc_bus_poc_first_name(String alt_elec_poc_bus_poc_first_name) {
        this.alt_elec_poc_bus_poc_first_name = alt_elec_poc_bus_poc_first_name;
    }

    public String getAlt_elec_poc_bus_poc_middle_initial() {
        return alt_elec_poc_bus_poc_middle_initial;
    }

    public void setAlt_elec_poc_bus_poc_middle_initial(String alt_elec_poc_bus_poc_middle_initial) {
        this.alt_elec_poc_bus_poc_middle_initial = alt_elec_poc_bus_poc_middle_initial;
    }

    public String getAlt_elec_poc_bus_poc_last_name() {
        return alt_elec_poc_bus_poc_last_name;
    }

    public void setAlt_elec_poc_bus_poc_last_name(String alt_elec_poc_bus_poc_last_name) {
        this.alt_elec_poc_bus_poc_last_name = alt_elec_poc_bus_poc_last_name;
    }

    public String getAlt_elec_poc_bus_poc_title() {
        return alt_elec_poc_bus_poc_title;
    }

    public void setAlt_elec_poc_bus_poc_title(String alt_elec_poc_bus_poc_title) {
        this.alt_elec_poc_bus_poc_title = alt_elec_poc_bus_poc_title;
    }

    public String getAlt_elec_poc_bus_st_add_1() {
        return alt_elec_poc_bus_st_add_1;
    }

    public void setAlt_elec_poc_bus_st_add_1(String alt_elec_poc_bus_st_add_1) {
        this.alt_elec_poc_bus_st_add_1 = alt_elec_poc_bus_st_add_1;
    }

    public String getAlt_elec_poc_bus_st_add_2() {
        return alt_elec_poc_bus_st_add_2;
    }

    public void setAlt_elec_poc_bus_st_add_2(String alt_elec_poc_bus_st_add_2) {
        this.alt_elec_poc_bus_st_add_2 = alt_elec_poc_bus_st_add_2;
    }

    public String getAlt_elec_poc_bus_city() {
        return alt_elec_poc_bus_city;
    }

    public void setAlt_elec_poc_bus_city(String alt_elec_poc_bus_city) {
        this.alt_elec_poc_bus_city = alt_elec_poc_bus_city;
    }

    public String getAlt_elec_poc_bus_zip_postal_code() {
        return alt_elec_poc_bus_zip_postal_code;
    }

    public void setAlt_elec_poc_bus_zip_postal_code(String alt_elec_poc_bus_zip_postal_code) {
        this.alt_elec_poc_bus_zip_postal_code = alt_elec_poc_bus_zip_postal_code;
    }

    public String getAlt_elec_poc_bus_zip_code_4() {
        return alt_elec_poc_bus_zip_code_4;
    }

    public void setAlt_elec_poc_bus_zip_code_4(String alt_elec_poc_bus_zip_code_4) {
        this.alt_elec_poc_bus_zip_code_4 = alt_elec_poc_bus_zip_code_4;
    }

    public String getAlt_elec_poc_bus_country_code() {
        return alt_elec_poc_bus_country_code;
    }

    public void setAlt_elec_poc_bus_country_code(String alt_elec_poc_bus_country_code) {
        this.alt_elec_poc_bus_country_code = alt_elec_poc_bus_country_code;
    }

    public String getAlt_elec_poc_bus_state_or_province() {
        return alt_elec_poc_bus_state_or_province;
    }

    public void setAlt_elec_poc_bus_state_or_province(String alt_elec_poc_bus_state_or_province) {
        this.alt_elec_poc_bus_state_or_province = alt_elec_poc_bus_state_or_province;
    }

    public String getAlt_elec_poc_bus_us_phone() {
        return alt_elec_poc_bus_us_phone;
    }

    public void setAlt_elec_poc_bus_us_phone(String alt_elec_poc_bus_us_phone) {
        this.alt_elec_poc_bus_us_phone = alt_elec_poc_bus_us_phone;
    }

    public String getAlt_elec_poc_bus_us_phone_ext() {
        return alt_elec_poc_bus_us_phone_ext;
    }

    public void setAlt_elec_poc_bus_us_phone_ext(String alt_elec_poc_bus_us_phone_ext) {
        this.alt_elec_poc_bus_us_phone_ext = alt_elec_poc_bus_us_phone_ext;
    }

    public String getAlt_elec_poc_bus_non_us_phone() {
        return alt_elec_poc_bus_non_us_phone;
    }

    public void setAlt_elec_poc_bus_non_us_phone(String alt_elec_poc_bus_non_us_phone) {
        this.alt_elec_poc_bus_non_us_phone = alt_elec_poc_bus_non_us_phone;
    }

    public String getAlt_elec_poc_bus_fax_us_only() {
        return alt_elec_poc_bus_fax_us_only;
    }

    public void setAlt_elec_poc_bus_fax_us_only(String alt_elec_poc_bus_fax_us_only) {
        this.alt_elec_poc_bus_fax_us_only = alt_elec_poc_bus_fax_us_only;
    }

    public String getAlt_elec_poc_bus_email() {
        return alt_elec_poc_bus_email;
    }

    public void setAlt_elec_poc_bus_email(String alt_elec_poc_bus_email) {
        this.alt_elec_poc_bus_email = alt_elec_poc_bus_email;
    }

    public String getNaics_exception_counter() {
        return naics_exception_counter;
    }

    public void setNaics_exception_counter(String naics_exception_counter) {
        this.naics_exception_counter = naics_exception_counter;
    }

    public String getNaics_exception_string() {
        return naics_exception_string;
    }

    public void setNaics_exception_string(String naics_exception_string) {
        this.naics_exception_string = naics_exception_string;
    }

    public String getDebt_subject_to_offset_flag() {
        return debt_subject_to_offset_flag;
    }

    public void setDebt_subject_to_offset_flag(String debt_subject_to_offset_flag) {
        this.debt_subject_to_offset_flag = debt_subject_to_offset_flag;
    }

    public String getExclusion_status_flag() {
        return exclusion_status_flag;
    }

    public void setExclusion_status_flag(String exclusion_status_flag) {
        this.exclusion_status_flag = exclusion_status_flag;
    }

    public String getSba_business_types_counter() {
        return sba_business_types_counter;
    }

    public void setSba_business_types_counter(String sba_business_types_counter) {
        this.sba_business_types_counter = sba_business_types_counter;
    }

    public String getSba_business_types_string() {
        return sba_business_types_string;
    }

    public void setSba_business_types_string(String sba_business_types_string) {
        this.sba_business_types_string = sba_business_types_string;
    }

    public String getNo_public_display_flag() {
        return no_public_display_flag;
    }

    public void setNo_public_display_flag(String no_public_display_flag) {
        this.no_public_display_flag = no_public_display_flag;
    }

    public String getDisaster_response_counter() {
        return disaster_response_counter;
    }

    public void setDisaster_response_counter(String disaster_response_counter) {
        this.disaster_response_counter = disaster_response_counter;
    }

    public String getDisaster_response_string() {
        return disaster_response_string;
    }

    public void setDisaster_response_string(String disaster_response_string) {
        this.disaster_response_string = disaster_response_string;
    }

    public String getEnd_of_record_indicator() {
        return end_of_record_indicator;
    }

    public void setEnd_of_record_indicator(String end_of_record_indicator) {
        this.end_of_record_indicator = end_of_record_indicator;
    }
    
    
}
