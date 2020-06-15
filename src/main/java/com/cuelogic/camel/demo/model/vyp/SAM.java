package com.cuelogic.camel.demo.model.vyp;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "|")
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

}
