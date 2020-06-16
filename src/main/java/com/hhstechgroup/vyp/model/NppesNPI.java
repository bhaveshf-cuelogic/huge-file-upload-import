package com.hhstechgroup.vyp.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", skipFirstLine = false)
public class NppesNPI {
    @DataField(pos = 1, required = false)
    public String npi;

    @DataField(pos = 2, required = false)
    public String entity_type_code;

    @DataField(pos = 3, required = false)
    public String replacement_npi;

    @DataField(pos = 4, required = false)
    public String employer_identification_number_ein;

    @DataField(pos = 5, required = false)
    public String provider_organization_name_legal_business_name;

    @DataField(pos = 6, required = false)
    public String provider_last_name_legal_name;

    @DataField(pos = 7, required = false)
    public String provider_first_name;

    @DataField(pos = 8, required = false)
    public String provider_middle_name;

    @DataField(pos = 9, required = false)
    public String provider_name_prefix_text;

    @DataField(pos = 10, required = false)
    public String provider_name_suffix_text;

    @DataField(pos = 11, required = false)
    public String provider_credential_text;

    @DataField(pos = 12, required = false)
    public String provider_other_organization_name;

    @DataField(pos = 13, required = false)
    public String provider_other_organization_name_type_code;

    @DataField(pos = 14, required = false)
    public String provider_other_last_name;

    @DataField(pos = 15, required = false)
    public String provider_other_first_name;

    @DataField(pos = 16, required = false)
    public String provider_other_middle_name;

    @DataField(pos = 17, required = false)
    public String provider_other_name_prefix_text;

    @DataField(pos = 18, required = false)
    public String provider_other_name_suffix_text;

    @DataField(pos = 19, required = false)
    public String provider_other_credential_text;

    @DataField(pos = 20, required = false)
    public String provider_other_last_name_type_code;

    @DataField(pos = 21, required = false)
    public String provider_first_line_business_mailing_address;

    @DataField(pos = 22, required = false)
    public String provider_second_line_business_mailing_address;

    @DataField(pos = 23, required = false)
    public String provider_business_mailing_address_city_name;

    @DataField(pos = 24, required = false)
    public String provider_business_mailing_address_state_name;

    @DataField(pos = 25, required = false)
    public String provider_business_mailing_address_postal_code;

    @DataField(pos = 26, required = false)
    public String provider_business_mailing_address_country_code_if_outside_us;

    @DataField(pos = 27, required = false)
    public String provider_business_mailing_address_telephone_number;

    @DataField(pos = 28, required = false)
    public String provider_business_mailing_address_fax_number;

    @DataField(pos = 29, required = false)
    public String provider_first_line_business_practice_location_address;

    @DataField(pos = 30, required = false)
    public String provider_second_line_business_practice_location_address;

    @DataField(pos = 31, required = false)
    public String provider_business_practice_location_address_city_name;

    @DataField(pos = 32, required = false)
    public String provider_business_practice_location_address_state_name;

    @DataField(pos = 33, required = false)
    public String provider_business_practice_location_address_postal_code;

    @DataField(pos = 34, required = false)
    public String provider_business_practice_location_address_country_code_if_out;

    @DataField(pos = 35, required = false)
    public String provider_business_practice_location_address_telephone_number;

    @DataField(pos = 36, required = false)
    public String provider_business_practice_location_address_fax_number;

    @DataField(pos = 37, required = false)
    public String provider_enumeration_date;

    @DataField(pos = 38, required = false)
    public String last_update_date;

    @DataField(pos = 39, required = false)
    public String npi_deactivation_reason_code;

    @DataField(pos = 40, required = false)
    public String npi_deactivation_date;

    @DataField(pos = 41, required = false)
    public String npi_reactivation_date;

    @DataField(pos = 42, required = false)
    public String provider_gender_code;

    @DataField(pos = 43, required = false)
    public String authorized_official_last_name;

    @DataField(pos = 44, required = false)
    public String authorized_official_first_name;

    @DataField(pos = 45, required = false)
    public String authorized_official_middle_name;

    @DataField(pos = 46, required = false)
    public String authorized_official_title_or_position;

    @DataField(pos = 47, required = false)
    public String authorized_official_telephone_number;

    @DataField(pos = 48, required = false)
    public String healthcare_provider_taxonomy_code_1;

    @DataField(pos = 49, required = false)
    public String provider_license_number_1;

    @DataField(pos = 50, required = false)
    public String provider_license_number_state_code_1;

    @DataField(pos = 51, required = false)
    public String healthcare_provider_primary_taxonomy_switch_1;

    @DataField(pos = 52, required = false)
    public String healthcare_provider_taxonomy_code_2;

    @DataField(pos = 53, required = false)
    public String provider_license_number_2;

    @DataField(pos = 54, required = false)
    public String provider_license_number_state_code_2;

    @DataField(pos = 55, required = false)
    public String healthcare_provider_primary_taxonomy_switch_2;

    @DataField(pos = 56, required = false)
    public String healthcare_provider_taxonomy_code_3;

    @DataField(pos = 57, required = false)
    public String provider_license_number_3;

    @DataField(pos = 58, required = false)
    public String provider_license_number_state_code_3;

    @DataField(pos = 59, required = false)
    public String healthcare_provider_primary_taxonomy_switch_3;

    @DataField(pos = 60, required = false)
    public String healthcare_provider_taxonomy_code_4;

    @DataField(pos = 61, required = false)
    public String provider_license_number_4;

    @DataField(pos = 62, required = false)
    public String provider_license_number_state_code_4;

    @DataField(pos = 63, required = false)
    public String healthcare_provider_primary_taxonomy_switch_4;

    @DataField(pos = 64, required = false)
    public String healthcare_provider_taxonomy_code_5;

    @DataField(pos = 65, required = false)
    public String provider_license_number_5;

    @DataField(pos = 66, required = false)
    public String provider_license_number_state_code_5;

    @DataField(pos = 67, required = false)
    public String healthcare_provider_primary_taxonomy_switch_5;

    @DataField(pos = 68, required = false)
    public String healthcare_provider_taxonomy_code_6;

    @DataField(pos = 69, required = false)
    public String provider_license_number_6;

    @DataField(pos = 70, required = false)
    public String provider_license_number_state_code_6;

    @DataField(pos = 71, required = false)
    public String healthcare_provider_primary_taxonomy_switch_6;

    @DataField(pos = 72, required = false)
    public String healthcare_provider_taxonomy_code_7;

    @DataField(pos = 73, required = false)
    public String provider_license_number_7;

    @DataField(pos = 74, required = false)
    public String provider_license_number_state_code_7;

    @DataField(pos = 75, required = false)
    public String healthcare_provider_primary_taxonomy_switch_7;

    @DataField(pos = 76, required = false)
    public String healthcare_provider_taxonomy_code_8;

    @DataField(pos = 77, required = false)
    public String provider_license_number_8;

    @DataField(pos = 78, required = false)
    public String provider_license_number_state_code_8;

    @DataField(pos = 79, required = false)
    public String healthcare_provider_primary_taxonomy_switch_8;

    @DataField(pos = 80, required = false)
    public String healthcare_provider_taxonomy_code_9;

    @DataField(pos = 81, required = false)
    public String provider_license_number_9;

    @DataField(pos = 82, required = false)
    public String provider_license_number_state_code_9;

    @DataField(pos = 83, required = false)
    public String healthcare_provider_primary_taxonomy_switch_9;

    @DataField(pos = 84, required = false)
    public String healthcare_provider_taxonomy_code_10;

    @DataField(pos = 85, required = false)
    public String provider_license_number_10;

    @DataField(pos = 86, required = false)
    public String provider_license_number_state_code_10;

    @DataField(pos = 87, required = false)
    public String healthcare_provider_primary_taxonomy_switch_10;

    @DataField(pos = 88, required = false)
    public String healthcare_provider_taxonomy_code_11;

    @DataField(pos = 89, required = false)
    public String provider_license_number_11;

    @DataField(pos = 90, required = false)
    public String provider_license_number_state_code_11;

    @DataField(pos = 91, required = false)
    public String healthcare_provider_primary_taxonomy_switch_11;

    @DataField(pos = 92, required = false)
    public String healthcare_provider_taxonomy_code_12;

    @DataField(pos = 93, required = false)
    public String provider_license_number_12;

    @DataField(pos = 94, required = false)
    public String provider_license_number_state_code_12;

    @DataField(pos = 95, required = false)
    public String healthcare_provider_primary_taxonomy_switch_12;

    @DataField(pos = 96, required = false)
    public String healthcare_provider_taxonomy_code_13;

    @DataField(pos = 97, required = false)
    public String provider_license_number_13;

    @DataField(pos = 98, required = false)
    public String provider_license_number_state_code_13;

    @DataField(pos = 99, required = false)
    public String healthcare_provider_primary_taxonomy_switch_13;

    @DataField(pos = 100, required = false)
    public String healthcare_provider_taxonomy_code_14;

    @DataField(pos = 101, required = false)
    public String provider_license_number_14;

    @DataField(pos = 102, required = false)
    public String provider_license_number_state_code_14;

    @DataField(pos = 103, required = false)
    public String healthcare_provider_primary_taxonomy_switch_14;

    @DataField(pos = 104, required = false)
    public String healthcare_provider_taxonomy_code_15;

    @DataField(pos = 105, required = false)
    public String provider_license_number_15;

    @DataField(pos = 106, required = false)
    public String provider_license_number_state_code_15;

    @DataField(pos = 107, required = false)
    public String healthcare_provider_primary_taxonomy_switch_15;

    @DataField(pos = 108, required = false)
    public String other_provider_identifier_1;

    @DataField(pos = 109, required = false)
    public String other_provider_identifier_type_code_1;

    @DataField(pos = 110, required = false)
    public String other_provider_identifier_state_1;

    @DataField(pos = 111, required = false)
    public String other_provider_identifier_issuer_1;

    @DataField(pos = 112, required = false)
    public String other_provider_identifier_2;

    @DataField(pos = 113, required = false)
    public String other_provider_identifier_type_code_2;

    @DataField(pos = 114, required = false)
    public String other_provider_identifier_state_2;

    @DataField(pos = 115, required = false)
    public String other_provider_identifier_issuer_2;

    @DataField(pos = 116, required = false)
    public String other_provider_identifier_3;

    @DataField(pos = 117, required = false)
    public String other_provider_identifier_type_code_3;

    @DataField(pos = 118, required = false)
    public String other_provider_identifier_state_3;

    @DataField(pos = 119, required = false)
    public String other_provider_identifier_issuer_3;

    @DataField(pos = 120, required = false)
    public String other_provider_identifier_4;

    @DataField(pos = 121, required = false)
    public String other_provider_identifier_type_code_4;

    @DataField(pos = 122, required = false)
    public String other_provider_identifier_state_4;

    @DataField(pos = 123, required = false)
    public String other_provider_identifier_issuer_4;

    @DataField(pos = 124, required = false)
    public String other_provider_identifier_5;

    @DataField(pos = 125, required = false)
    public String other_provider_identifier_type_code_5;

    @DataField(pos = 126, required = false)
    public String other_provider_identifier_state_5;

    @DataField(pos = 127, required = false)
    public String other_provider_identifier_issuer_5;

    @DataField(pos = 128, required = false)
    public String other_provider_identifier_6;

    @DataField(pos = 129, required = false)
    public String other_provider_identifier_type_code_6;

    @DataField(pos = 130, required = false)
    public String other_provider_identifier_state_6;

    @DataField(pos = 131, required = false)
    public String other_provider_identifier_issuer_6;

    @DataField(pos = 132, required = false)
    public String other_provider_identifier_7;

    @DataField(pos = 133, required = false)
    public String other_provider_identifier_type_code_7;

    @DataField(pos = 134, required = false)
    public String other_provider_identifier_state_7;

    @DataField(pos = 135, required = false)
    public String other_provider_identifier_issuer_7;

    @DataField(pos = 136, required = false)
    public String other_provider_identifier_8;

    @DataField(pos = 137, required = false)
    public String other_provider_identifier_type_code_8;

    @DataField(pos = 138, required = false)
    public String other_provider_identifier_state_8;

    @DataField(pos = 139, required = false)
    public String other_provider_identifier_issuer_8;

    @DataField(pos = 140, required = false)
    public String other_provider_identifier_9;

    @DataField(pos = 141, required = false)
    public String other_provider_identifier_type_code_9;

    @DataField(pos = 142, required = false)
    public String other_provider_identifier_state_9;

    @DataField(pos = 143, required = false)
    public String other_provider_identifier_issuer_9;

    @DataField(pos = 144, required = false)
    public String other_provider_identifier_10;

    @DataField(pos = 145, required = false)
    public String other_provider_identifier_type_code_10;

    @DataField(pos = 146, required = false)
    public String other_provider_identifier_state_10;

    @DataField(pos = 147, required = false)
    public String other_provider_identifier_issuer_10;

    @DataField(pos = 148, required = false)
    public String other_provider_identifier_11;

    @DataField(pos = 149, required = false)
    public String other_provider_identifier_type_code_11;

    @DataField(pos = 150, required = false)
    public String other_provider_identifier_state_11;

    @DataField(pos = 151, required = false)
    public String other_provider_identifier_issuer_11;

    @DataField(pos = 152, required = false)
    public String other_provider_identifier_12;

    @DataField(pos = 153, required = false)
    public String other_provider_identifier_type_code_12;

    @DataField(pos = 154, required = false)
    public String other_provider_identifier_state_12;

    @DataField(pos = 155, required = false)
    public String other_provider_identifier_issuer_12;

    @DataField(pos = 156, required = false)
    public String other_provider_identifier_13;

    @DataField(pos = 157, required = false)
    public String other_provider_identifier_type_code_13;

    @DataField(pos = 158, required = false)
    public String other_provider_identifier_state_13;

    @DataField(pos = 159, required = false)
    public String other_provider_identifier_issuer_13;

    @DataField(pos = 160, required = false)
    public String other_provider_identifier_14;

    @DataField(pos = 161, required = false)
    public String other_provider_identifier_type_code_14;

    @DataField(pos = 162, required = false)
    public String other_provider_identifier_state_14;

    @DataField(pos = 163, required = false)
    public String other_provider_identifier_issuer_14;

    @DataField(pos = 164, required = false)
    public String other_provider_identifier_15;

    @DataField(pos = 165, required = false)
    public String other_provider_identifier_type_code_15;

    @DataField(pos = 166, required = false)
    public String other_provider_identifier_state_15;

    @DataField(pos = 167, required = false)
    public String other_provider_identifier_issuer_15;

    @DataField(pos = 168, required = false)
    public String other_provider_identifier_16;

    @DataField(pos = 169, required = false)
    public String other_provider_identifier_type_code_16;

    @DataField(pos = 170, required = false)
    public String other_provider_identifier_state_16;

    @DataField(pos = 171, required = false)
    public String other_provider_identifier_issuer_16;

    @DataField(pos = 172, required = false)
    public String other_provider_identifier_17;

    @DataField(pos = 173, required = false)
    public String other_provider_identifier_type_code_17;

    @DataField(pos = 174, required = false)
    public String other_provider_identifier_state_17;

    @DataField(pos = 175, required = false)
    public String other_provider_identifier_issuer_17;

    @DataField(pos = 176, required = false)
    public String other_provider_identifier_18;

    @DataField(pos = 177, required = false)
    public String other_provider_identifier_type_code_18;

    @DataField(pos = 178, required = false)
    public String other_provider_identifier_state_18;

    @DataField(pos = 179, required = false)
    public String other_provider_identifier_issuer_18;

    @DataField(pos = 180, required = false)
    public String other_provider_identifier_19;

    @DataField(pos = 181, required = false)
    public String other_provider_identifier_type_code_19;

    @DataField(pos = 182, required = false)
    public String other_provider_identifier_state_19;

    @DataField(pos = 183, required = false)
    public String other_provider_identifier_issuer_19;

    @DataField(pos = 184, required = false)
    public String other_provider_identifier_20;

    @DataField(pos = 185, required = false)
    public String other_provider_identifier_type_code_20;

    @DataField(pos = 186, required = false)
    public String other_provider_identifier_state_20;

    @DataField(pos = 187, required = false)
    public String other_provider_identifier_issuer_20;

    @DataField(pos = 188, required = false)
    public String other_provider_identifier_21;

    @DataField(pos = 189, required = false)
    public String other_provider_identifier_type_code_21;

    @DataField(pos = 190, required = false)
    public String other_provider_identifier_state_21;

    @DataField(pos = 191, required = false)
    public String other_provider_identifier_issuer_21;

    @DataField(pos = 192, required = false)
    public String other_provider_identifier_22;

    @DataField(pos = 193, required = false)
    public String other_provider_identifier_type_code_22;

    @DataField(pos = 194, required = false)
    public String other_provider_identifier_state_22;

    @DataField(pos = 195, required = false)
    public String other_provider_identifier_issuer_22;

    @DataField(pos = 196, required = false)
    public String other_provider_identifier_23;

    @DataField(pos = 197, required = false)
    public String other_provider_identifier_type_code_23;

    @DataField(pos = 198, required = false)
    public String other_provider_identifier_state_23;

    @DataField(pos = 199, required = false)
    public String other_provider_identifier_issuer_23;

    @DataField(pos = 200, required = false)
    public String other_provider_identifier_24;

    @DataField(pos = 201, required = false)
    public String other_provider_identifier_type_code_24;

    @DataField(pos = 202, required = false)
    public String other_provider_identifier_state_24;

    @DataField(pos = 203, required = false)
    public String other_provider_identifier_issuer_24;

    @DataField(pos = 204, required = false)
    public String other_provider_identifier_25;

    @DataField(pos = 205, required = false)
    public String other_provider_identifier_type_code_25;

    @DataField(pos = 206, required = false)
    public String other_provider_identifier_state_25;

    @DataField(pos = 207, required = false)
    public String other_provider_identifier_issuer_25;

    @DataField(pos = 208, required = false)
    public String other_provider_identifier_26;

    @DataField(pos = 209, required = false)
    public String other_provider_identifier_type_code_26;

    @DataField(pos = 210, required = false)
    public String other_provider_identifier_state_26;

    @DataField(pos = 211, required = false)
    public String other_provider_identifier_issuer_26;

    @DataField(pos = 212, required = false)
    public String other_provider_identifier_27;

    @DataField(pos = 213, required = false)
    public String other_provider_identifier_type_code_27;

    @DataField(pos = 214, required = false)
    public String other_provider_identifier_state_27;

    @DataField(pos = 215, required = false)
    public String other_provider_identifier_issuer_27;

    @DataField(pos = 216, required = false)
    public String other_provider_identifier_28;

    @DataField(pos = 217, required = false)
    public String other_provider_identifier_type_code_28;

    @DataField(pos = 218, required = false)
    public String other_provider_identifier_state_28;

    @DataField(pos = 219, required = false)
    public String other_provider_identifier_issuer_28;

    @DataField(pos = 220, required = false)
    public String other_provider_identifier_29;

    @DataField(pos = 221, required = false)
    public String other_provider_identifier_type_code_29;

    @DataField(pos = 222, required = false)
    public String other_provider_identifier_state_29;

    @DataField(pos = 223, required = false)
    public String other_provider_identifier_issuer_29;

    @DataField(pos = 224, required = false)
    public String other_provider_identifier_30;

    @DataField(pos = 225, required = false)
    public String other_provider_identifier_type_code_30;

    @DataField(pos = 226, required = false)
    public String other_provider_identifier_state_30;

    @DataField(pos = 227, required = false)
    public String other_provider_identifier_issuer_30;

    @DataField(pos = 228, required = false)
    public String other_provider_identifier_31;

    @DataField(pos = 229, required = false)
    public String other_provider_identifier_type_code_31;

    @DataField(pos = 230, required = false)
    public String other_provider_identifier_state_31;

    @DataField(pos = 231, required = false)
    public String other_provider_identifier_issuer_31;

    @DataField(pos = 232, required = false)
    public String other_provider_identifier_32;

    @DataField(pos = 233, required = false)
    public String other_provider_identifier_type_code_32;

    @DataField(pos = 234, required = false)
    public String other_provider_identifier_state_32;

    @DataField(pos = 235, required = false)
    public String other_provider_identifier_issuer_32;

    @DataField(pos = 236, required = false)
    public String other_provider_identifier_33;

    @DataField(pos = 237, required = false)
    public String other_provider_identifier_type_code_33;

    @DataField(pos = 238, required = false)
    public String other_provider_identifier_state_33;

    @DataField(pos = 239, required = false)
    public String other_provider_identifier_issuer_33;

    @DataField(pos = 240, required = false)
    public String other_provider_identifier_34;

    @DataField(pos = 241, required = false)
    public String other_provider_identifier_type_code_34;

    @DataField(pos = 242, required = false)
    public String other_provider_identifier_state_34;

    @DataField(pos = 243, required = false)
    public String other_provider_identifier_issuer_34;

    @DataField(pos = 244, required = false)
    public String other_provider_identifier_35;

    @DataField(pos = 245, required = false)
    public String other_provider_identifier_type_code_35;

    @DataField(pos = 246, required = false)
    public String other_provider_identifier_state_35;

    @DataField(pos = 247, required = false)
    public String other_provider_identifier_issuer_35;

    @DataField(pos = 248, required = false)
    public String other_provider_identifier_36;

    @DataField(pos = 249, required = false)
    public String other_provider_identifier_type_code_36;

    @DataField(pos = 250, required = false)
    public String other_provider_identifier_state_36;

    @DataField(pos = 251, required = false)
    public String other_provider_identifier_issuer_36;

    @DataField(pos = 252, required = false)
    public String other_provider_identifier_37;

    @DataField(pos = 253, required = false)
    public String other_provider_identifier_type_code_37;

    @DataField(pos = 254, required = false)
    public String other_provider_identifier_state_37;

    @DataField(pos = 255, required = false)
    public String other_provider_identifier_issuer_37;

    @DataField(pos = 256, required = false)
    public String other_provider_identifier_38;

    @DataField(pos = 257, required = false)
    public String other_provider_identifier_type_code_38;

    @DataField(pos = 258, required = false)
    public String other_provider_identifier_state_38;

    @DataField(pos = 259, required = false)
    public String other_provider_identifier_issuer_38;

    @DataField(pos = 260, required = false)
    public String other_provider_identifier_39;

    @DataField(pos = 261, required = false)
    public String other_provider_identifier_type_code_39;

    @DataField(pos = 262, required = false)
    public String other_provider_identifier_state_39;

    @DataField(pos = 263, required = false)
    public String other_provider_identifier_issuer_39;

    @DataField(pos = 264, required = false)
    public String other_provider_identifier_40;

    @DataField(pos = 265, required = false)
    public String other_provider_identifier_type_code_40;

    @DataField(pos = 266, required = false)
    public String other_provider_identifier_state_40;

    @DataField(pos = 267, required = false)
    public String other_provider_identifier_issuer_40;

    @DataField(pos = 268, required = false)
    public String other_provider_identifier_41;

    @DataField(pos = 269, required = false)
    public String other_provider_identifier_type_code_41;

    @DataField(pos = 270, required = false)
    public String other_provider_identifier_state_41;

    @DataField(pos = 271, required = false)
    public String other_provider_identifier_issuer_41;

    @DataField(pos = 272, required = false)
    public String other_provider_identifier_42;

    @DataField(pos = 273, required = false)
    public String other_provider_identifier_type_code_42;

    @DataField(pos = 274, required = false)
    public String other_provider_identifier_state_42;

    @DataField(pos = 275, required = false)
    public String other_provider_identifier_issuer_42;

    @DataField(pos = 276, required = false)
    public String other_provider_identifier_43;

    @DataField(pos = 277, required = false)
    public String other_provider_identifier_type_code_43;

    @DataField(pos = 278, required = false)
    public String other_provider_identifier_state_43;

    @DataField(pos = 279, required = false)
    public String other_provider_identifier_issuer_43;

    @DataField(pos = 280, required = false)
    public String other_provider_identifier_44;

    @DataField(pos = 281, required = false)
    public String other_provider_identifier_type_code_44;

    @DataField(pos = 282, required = false)
    public String other_provider_identifier_state_44;

    @DataField(pos = 283, required = false)
    public String other_provider_identifier_issuer_44;

    @DataField(pos = 284, required = false)
    public String other_provider_identifier_45;

    @DataField(pos = 285, required = false)
    public String other_provider_identifier_type_code_45;

    @DataField(pos = 286, required = false)
    public String other_provider_identifier_state_45;

    @DataField(pos = 287, required = false)
    public String other_provider_identifier_issuer_45;

    @DataField(pos = 288, required = false)
    public String other_provider_identifier_46;

    @DataField(pos = 289, required = false)
    public String other_provider_identifier_type_code_46;

    @DataField(pos = 290, required = false)
    public String other_provider_identifier_state_46;

    @DataField(pos = 291, required = false)
    public String other_provider_identifier_issuer_46;

    @DataField(pos = 292, required = false)
    public String other_provider_identifier_47;

    @DataField(pos = 293, required = false)
    public String other_provider_identifier_type_code_47;

    @DataField(pos = 294, required = false)
    public String other_provider_identifier_state_47;

    @DataField(pos = 295, required = false)
    public String other_provider_identifier_issuer_47;

    @DataField(pos = 296, required = false)
    public String other_provider_identifier_48;

    @DataField(pos = 297, required = false)
    public String other_provider_identifier_type_code_48;

    @DataField(pos = 298, required = false)
    public String other_provider_identifier_state_48;

    @DataField(pos = 299, required = false)
    public String other_provider_identifier_issuer_48;

    @DataField(pos = 300, required = false)
    public String other_provider_identifier_49;

    @DataField(pos = 301, required = false)
    public String other_provider_identifier_type_code_49;

    @DataField(pos = 302, required = false)
    public String other_provider_identifier_state_49;

    @DataField(pos = 303, required = false)
    public String other_provider_identifier_issuer_49;

    @DataField(pos = 304, required = false)
    public String other_provider_identifier_50;

    @DataField(pos = 305, required = false)
    public String other_provider_identifier_type_code_50;

    @DataField(pos = 306, required = false)
    public String other_provider_identifier_state_50;

    @DataField(pos = 307, required = false)
    public String other_provider_identifier_issuer_50;

    @DataField(pos = 308, required = false)
    public String is_sole_proprietor;

    @DataField(pos = 309, required = false)
    public String is_organization_subpart;

    @DataField(pos = 310, required = false)
    public String parent_organization_lbn;

    @DataField(pos = 311, required = false)
    public String parent_organization_tin;

    @DataField(pos = 312, required = false)
    public String authorized_official_name_prefix_text;

    @DataField(pos = 313, required = false)
    public String authorized_official_name_suffix_text;

    @DataField(pos = 314, required = false)
    public String authorized_official_credential_text;

    @DataField(pos = 315, required = false)
    public String healthcare_provider_taxonomy_group_1;

    @DataField(pos = 316, required = false)
    public String healthcare_provider_taxonomy_group_2;

    @DataField(pos = 317, required = false)
    public String healthcare_provider_taxonomy_group_3;

    @DataField(pos = 318, required = false)
    public String healthcare_provider_taxonomy_group_4;

    @DataField(pos = 319, required = false)
    public String healthcare_provider_taxonomy_group_5;

    @DataField(pos = 320, required = false)
    public String healthcare_provider_taxonomy_group_6;

    @DataField(pos = 321, required = false)
    public String healthcare_provider_taxonomy_group_7;

    @DataField(pos = 322, required = false)
    public String healthcare_provider_taxonomy_group_8;

    @DataField(pos = 323, required = false)
    public String healthcare_provider_taxonomy_group_9;

    @DataField(pos = 324, required = false)
    public String healthcare_provider_taxonomy_group_10;

    @DataField(pos = 325, required = false)
    public String healthcare_provider_taxonomy_group_11;

    @DataField(pos = 326, required = false)
    public String healthcare_provider_taxonomy_group_12;

    @DataField(pos = 327, required = false)
    public String healthcare_provider_taxonomy_group_13;

    @DataField(pos = 328, required = false)
    public String healthcare_provider_taxonomy_group_14;

    @DataField(pos = 329, required = false)
    public String healthcare_provider_taxonomy_group_15;

    @DataField(pos = 330, required = false)
    public String certification_date;

    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

    public String getEntity_type_code() {
        return entity_type_code;
    }

    public void setEntity_type_code(String entity_type_code) {
        this.entity_type_code = entity_type_code;
    }

    public String getReplacement_npi() {
        return replacement_npi;
    }

    public void setReplacement_npi(String replacement_npi) {
        this.replacement_npi = replacement_npi;
    }

    public String getEmployer_identification_number_ein() {
        return employer_identification_number_ein;
    }

    public void setEmployer_identification_number_ein(String employer_identification_number_ein) {
        this.employer_identification_number_ein = employer_identification_number_ein;
    }

    public String getProvider_organization_name_legal_business_name() {
        return provider_organization_name_legal_business_name;
    }

    public void setProvider_organization_name_legal_business_name(String provider_organization_name_legal_business_name) {
        this.provider_organization_name_legal_business_name = provider_organization_name_legal_business_name;
    }

    public String getProvider_last_name_legal_name() {
        return provider_last_name_legal_name;
    }

    public void setProvider_last_name_legal_name(String provider_last_name_legal_name) {
        this.provider_last_name_legal_name = provider_last_name_legal_name;
    }

    public String getProvider_first_name() {
        return provider_first_name;
    }

    public void setProvider_first_name(String provider_first_name) {
        this.provider_first_name = provider_first_name;
    }

    public String getProvider_middle_name() {
        return provider_middle_name;
    }

    public void setProvider_middle_name(String provider_middle_name) {
        this.provider_middle_name = provider_middle_name;
    }

    public String getProvider_name_prefix_text() {
        return provider_name_prefix_text;
    }

    public void setProvider_name_prefix_text(String provider_name_prefix_text) {
        this.provider_name_prefix_text = provider_name_prefix_text;
    }

    public String getProvider_name_suffix_text() {
        return provider_name_suffix_text;
    }

    public void setProvider_name_suffix_text(String provider_name_suffix_text) {
        this.provider_name_suffix_text = provider_name_suffix_text;
    }

    public String getProvider_credential_text() {
        return provider_credential_text;
    }

    public void setProvider_credential_text(String provider_credential_text) {
        this.provider_credential_text = provider_credential_text;
    }

    public String getProvider_other_organization_name() {
        return provider_other_organization_name;
    }

    public void setProvider_other_organization_name(String provider_other_organization_name) {
        this.provider_other_organization_name = provider_other_organization_name;
    }

    public String getProvider_other_organization_name_type_code() {
        return provider_other_organization_name_type_code;
    }

    public void setProvider_other_organization_name_type_code(String provider_other_organization_name_type_code) {
        this.provider_other_organization_name_type_code = provider_other_organization_name_type_code;
    }

    public String getProvider_other_last_name() {
        return provider_other_last_name;
    }

    public void setProvider_other_last_name(String provider_other_last_name) {
        this.provider_other_last_name = provider_other_last_name;
    }

    public String getProvider_other_first_name() {
        return provider_other_first_name;
    }

    public void setProvider_other_first_name(String provider_other_first_name) {
        this.provider_other_first_name = provider_other_first_name;
    }

    public String getProvider_other_middle_name() {
        return provider_other_middle_name;
    }

    public void setProvider_other_middle_name(String provider_other_middle_name) {
        this.provider_other_middle_name = provider_other_middle_name;
    }

    public String getProvider_other_name_prefix_text() {
        return provider_other_name_prefix_text;
    }

    public void setProvider_other_name_prefix_text(String provider_other_name_prefix_text) {
        this.provider_other_name_prefix_text = provider_other_name_prefix_text;
    }

    public String getProvider_other_name_suffix_text() {
        return provider_other_name_suffix_text;
    }

    public void setProvider_other_name_suffix_text(String provider_other_name_suffix_text) {
        this.provider_other_name_suffix_text = provider_other_name_suffix_text;
    }

    public String getProvider_other_credential_text() {
        return provider_other_credential_text;
    }

    public void setProvider_other_credential_text(String provider_other_credential_text) {
        this.provider_other_credential_text = provider_other_credential_text;
    }

    public String getProvider_other_last_name_type_code() {
        return provider_other_last_name_type_code;
    }

    public void setProvider_other_last_name_type_code(String provider_other_last_name_type_code) {
        this.provider_other_last_name_type_code = provider_other_last_name_type_code;
    }

    public String getProvider_first_line_business_mailing_address() {
        return provider_first_line_business_mailing_address;
    }

    public void setProvider_first_line_business_mailing_address(String provider_first_line_business_mailing_address) {
        this.provider_first_line_business_mailing_address = provider_first_line_business_mailing_address;
    }

    public String getProvider_second_line_business_mailing_address() {
        return provider_second_line_business_mailing_address;
    }

    public void setProvider_second_line_business_mailing_address(String provider_second_line_business_mailing_address) {
        this.provider_second_line_business_mailing_address = provider_second_line_business_mailing_address;
    }

    public String getProvider_business_mailing_address_city_name() {
        return provider_business_mailing_address_city_name;
    }

    public void setProvider_business_mailing_address_city_name(String provider_business_mailing_address_city_name) {
        this.provider_business_mailing_address_city_name = provider_business_mailing_address_city_name;
    }

    public String getProvider_business_mailing_address_state_name() {
        return provider_business_mailing_address_state_name;
    }

    public void setProvider_business_mailing_address_state_name(String provider_business_mailing_address_state_name) {
        this.provider_business_mailing_address_state_name = provider_business_mailing_address_state_name;
    }

    public String getProvider_business_mailing_address_postal_code() {
        return provider_business_mailing_address_postal_code;
    }

    public void setProvider_business_mailing_address_postal_code(String provider_business_mailing_address_postal_code) {
        this.provider_business_mailing_address_postal_code = provider_business_mailing_address_postal_code;
    }

    public String getProvider_business_mailing_address_country_code_if_outside_us() {
        return provider_business_mailing_address_country_code_if_outside_us;
    }

    public void setProvider_business_mailing_address_country_code_if_outside_us(
            String provider_business_mailing_address_country_code_if_outside_us) {
        this.provider_business_mailing_address_country_code_if_outside_us = provider_business_mailing_address_country_code_if_outside_us;
    }

    public String getProvider_business_mailing_address_telephone_number() {
        return provider_business_mailing_address_telephone_number;
    }

    public void setProvider_business_mailing_address_telephone_number(
            String provider_business_mailing_address_telephone_number) {
        this.provider_business_mailing_address_telephone_number = provider_business_mailing_address_telephone_number;
    }

    public String getProvider_business_mailing_address_fax_number() {
        return provider_business_mailing_address_fax_number;
    }

    public void setProvider_business_mailing_address_fax_number(String provider_business_mailing_address_fax_number) {
        this.provider_business_mailing_address_fax_number = provider_business_mailing_address_fax_number;
    }

    public String getProvider_first_line_business_practice_location_address() {
        return provider_first_line_business_practice_location_address;
    }

    public void setProvider_first_line_business_practice_location_address(
            String provider_first_line_business_practice_location_address) {
        this.provider_first_line_business_practice_location_address = provider_first_line_business_practice_location_address;
    }

    public String getProvider_second_line_business_practice_location_address() {
        return provider_second_line_business_practice_location_address;
    }

    public void setProvider_second_line_business_practice_location_address(
            String provider_second_line_business_practice_location_address) {
        this.provider_second_line_business_practice_location_address = provider_second_line_business_practice_location_address;
    }

    public String getProvider_business_practice_location_address_city_name() {
        return provider_business_practice_location_address_city_name;
    }

    public void setProvider_business_practice_location_address_city_name(
            String provider_business_practice_location_address_city_name) {
        this.provider_business_practice_location_address_city_name = provider_business_practice_location_address_city_name;
    }

    public String getProvider_business_practice_location_address_state_name() {
        return provider_business_practice_location_address_state_name;
    }

    public void setProvider_business_practice_location_address_state_name(
            String provider_business_practice_location_address_state_name) {
        this.provider_business_practice_location_address_state_name = provider_business_practice_location_address_state_name;
    }

    public String getProvider_business_practice_location_address_postal_code() {
        return provider_business_practice_location_address_postal_code;
    }

    public void setProvider_business_practice_location_address_postal_code(
            String provider_business_practice_location_address_postal_code) {
        this.provider_business_practice_location_address_postal_code = provider_business_practice_location_address_postal_code;
    }

    public String getProvider_business_practice_location_address_country_code_if_out() {
        return provider_business_practice_location_address_country_code_if_out;
    }

    public void setProvider_business_practice_location_address_country_code_if_out(
            String provider_business_practice_location_address_country_code_if_out) {
        this.provider_business_practice_location_address_country_code_if_out = provider_business_practice_location_address_country_code_if_out;
    }

    public String getProvider_business_practice_location_address_telephone_number() {
        return provider_business_practice_location_address_telephone_number;
    }

    public void setProvider_business_practice_location_address_telephone_number(
            String provider_business_practice_location_address_telephone_number) {
        this.provider_business_practice_location_address_telephone_number = provider_business_practice_location_address_telephone_number;
    }

    public String getProvider_business_practice_location_address_fax_number() {
        return provider_business_practice_location_address_fax_number;
    }

    public void setProvider_business_practice_location_address_fax_number(
            String provider_business_practice_location_address_fax_number) {
        this.provider_business_practice_location_address_fax_number = provider_business_practice_location_address_fax_number;
    }

    public String getProvider_enumeration_date() {
        return provider_enumeration_date;
    }

    public void setProvider_enumeration_date(String provider_enumeration_date) {
        this.provider_enumeration_date = provider_enumeration_date;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public String getNpi_deactivation_reason_code() {
        return npi_deactivation_reason_code;
    }

    public void setNpi_deactivation_reason_code(String npi_deactivation_reason_code) {
        this.npi_deactivation_reason_code = npi_deactivation_reason_code;
    }

    public String getNpi_deactivation_date() {
        return npi_deactivation_date;
    }

    public void setNpi_deactivation_date(String npi_deactivation_date) {
        this.npi_deactivation_date = npi_deactivation_date;
    }

    public String getNpi_reactivation_date() {
        return npi_reactivation_date;
    }

    public void setNpi_reactivation_date(String npi_reactivation_date) {
        this.npi_reactivation_date = npi_reactivation_date;
    }

    public String getProvider_gender_code() {
        return provider_gender_code;
    }

    public void setProvider_gender_code(String provider_gender_code) {
        this.provider_gender_code = provider_gender_code;
    }

    public String getAuthorized_official_last_name() {
        return authorized_official_last_name;
    }

    public void setAuthorized_official_last_name(String authorized_official_last_name) {
        this.authorized_official_last_name = authorized_official_last_name;
    }

    public String getAuthorized_official_first_name() {
        return authorized_official_first_name;
    }

    public void setAuthorized_official_first_name(String authorized_official_first_name) {
        this.authorized_official_first_name = authorized_official_first_name;
    }

    public String getAuthorized_official_middle_name() {
        return authorized_official_middle_name;
    }

    public void setAuthorized_official_middle_name(String authorized_official_middle_name) {
        this.authorized_official_middle_name = authorized_official_middle_name;
    }

    public String getAuthorized_official_title_or_position() {
        return authorized_official_title_or_position;
    }

    public void setAuthorized_official_title_or_position(String authorized_official_title_or_position) {
        this.authorized_official_title_or_position = authorized_official_title_or_position;
    }

    public String getAuthorized_official_telephone_number() {
        return authorized_official_telephone_number;
    }

    public void setAuthorized_official_telephone_number(String authorized_official_telephone_number) {
        this.authorized_official_telephone_number = authorized_official_telephone_number;
    }

    public String getHealthcare_provider_taxonomy_code_1() {
        return healthcare_provider_taxonomy_code_1;
    }

    public void setHealthcare_provider_taxonomy_code_1(String healthcare_provider_taxonomy_code_1) {
        this.healthcare_provider_taxonomy_code_1 = healthcare_provider_taxonomy_code_1;
    }

    public String getProvider_license_number_1() {
        return provider_license_number_1;
    }

    public void setProvider_license_number_1(String provider_license_number_1) {
        this.provider_license_number_1 = provider_license_number_1;
    }

    public String getProvider_license_number_state_code_1() {
        return provider_license_number_state_code_1;
    }

    public void setProvider_license_number_state_code_1(String provider_license_number_state_code_1) {
        this.provider_license_number_state_code_1 = provider_license_number_state_code_1;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_1() {
        return healthcare_provider_primary_taxonomy_switch_1;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_1(String healthcare_provider_primary_taxonomy_switch_1) {
        this.healthcare_provider_primary_taxonomy_switch_1 = healthcare_provider_primary_taxonomy_switch_1;
    }

    public String getHealthcare_provider_taxonomy_code_2() {
        return healthcare_provider_taxonomy_code_2;
    }

    public void setHealthcare_provider_taxonomy_code_2(String healthcare_provider_taxonomy_code_2) {
        this.healthcare_provider_taxonomy_code_2 = healthcare_provider_taxonomy_code_2;
    }

    public String getProvider_license_number_2() {
        return provider_license_number_2;
    }

    public void setProvider_license_number_2(String provider_license_number_2) {
        this.provider_license_number_2 = provider_license_number_2;
    }

    public String getProvider_license_number_state_code_2() {
        return provider_license_number_state_code_2;
    }

    public void setProvider_license_number_state_code_2(String provider_license_number_state_code_2) {
        this.provider_license_number_state_code_2 = provider_license_number_state_code_2;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_2() {
        return healthcare_provider_primary_taxonomy_switch_2;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_2(String healthcare_provider_primary_taxonomy_switch_2) {
        this.healthcare_provider_primary_taxonomy_switch_2 = healthcare_provider_primary_taxonomy_switch_2;
    }

    public String getHealthcare_provider_taxonomy_code_3() {
        return healthcare_provider_taxonomy_code_3;
    }

    public void setHealthcare_provider_taxonomy_code_3(String healthcare_provider_taxonomy_code_3) {
        this.healthcare_provider_taxonomy_code_3 = healthcare_provider_taxonomy_code_3;
    }

    public String getProvider_license_number_3() {
        return provider_license_number_3;
    }

    public void setProvider_license_number_3(String provider_license_number_3) {
        this.provider_license_number_3 = provider_license_number_3;
    }

    public String getProvider_license_number_state_code_3() {
        return provider_license_number_state_code_3;
    }

    public void setProvider_license_number_state_code_3(String provider_license_number_state_code_3) {
        this.provider_license_number_state_code_3 = provider_license_number_state_code_3;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_3() {
        return healthcare_provider_primary_taxonomy_switch_3;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_3(String healthcare_provider_primary_taxonomy_switch_3) {
        this.healthcare_provider_primary_taxonomy_switch_3 = healthcare_provider_primary_taxonomy_switch_3;
    }

    public String getHealthcare_provider_taxonomy_code_4() {
        return healthcare_provider_taxonomy_code_4;
    }

    public void setHealthcare_provider_taxonomy_code_4(String healthcare_provider_taxonomy_code_4) {
        this.healthcare_provider_taxonomy_code_4 = healthcare_provider_taxonomy_code_4;
    }

    public String getProvider_license_number_4() {
        return provider_license_number_4;
    }

    public void setProvider_license_number_4(String provider_license_number_4) {
        this.provider_license_number_4 = provider_license_number_4;
    }

    public String getProvider_license_number_state_code_4() {
        return provider_license_number_state_code_4;
    }

    public void setProvider_license_number_state_code_4(String provider_license_number_state_code_4) {
        this.provider_license_number_state_code_4 = provider_license_number_state_code_4;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_4() {
        return healthcare_provider_primary_taxonomy_switch_4;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_4(String healthcare_provider_primary_taxonomy_switch_4) {
        this.healthcare_provider_primary_taxonomy_switch_4 = healthcare_provider_primary_taxonomy_switch_4;
    }

    public String getHealthcare_provider_taxonomy_code_5() {
        return healthcare_provider_taxonomy_code_5;
    }

    public void setHealthcare_provider_taxonomy_code_5(String healthcare_provider_taxonomy_code_5) {
        this.healthcare_provider_taxonomy_code_5 = healthcare_provider_taxonomy_code_5;
    }

    public String getProvider_license_number_5() {
        return provider_license_number_5;
    }

    public void setProvider_license_number_5(String provider_license_number_5) {
        this.provider_license_number_5 = provider_license_number_5;
    }

    public String getProvider_license_number_state_code_5() {
        return provider_license_number_state_code_5;
    }

    public void setProvider_license_number_state_code_5(String provider_license_number_state_code_5) {
        this.provider_license_number_state_code_5 = provider_license_number_state_code_5;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_5() {
        return healthcare_provider_primary_taxonomy_switch_5;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_5(String healthcare_provider_primary_taxonomy_switch_5) {
        this.healthcare_provider_primary_taxonomy_switch_5 = healthcare_provider_primary_taxonomy_switch_5;
    }

    public String getHealthcare_provider_taxonomy_code_6() {
        return healthcare_provider_taxonomy_code_6;
    }

    public void setHealthcare_provider_taxonomy_code_6(String healthcare_provider_taxonomy_code_6) {
        this.healthcare_provider_taxonomy_code_6 = healthcare_provider_taxonomy_code_6;
    }

    public String getProvider_license_number_6() {
        return provider_license_number_6;
    }

    public void setProvider_license_number_6(String provider_license_number_6) {
        this.provider_license_number_6 = provider_license_number_6;
    }

    public String getProvider_license_number_state_code_6() {
        return provider_license_number_state_code_6;
    }

    public void setProvider_license_number_state_code_6(String provider_license_number_state_code_6) {
        this.provider_license_number_state_code_6 = provider_license_number_state_code_6;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_6() {
        return healthcare_provider_primary_taxonomy_switch_6;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_6(String healthcare_provider_primary_taxonomy_switch_6) {
        this.healthcare_provider_primary_taxonomy_switch_6 = healthcare_provider_primary_taxonomy_switch_6;
    }

    public String getHealthcare_provider_taxonomy_code_7() {
        return healthcare_provider_taxonomy_code_7;
    }

    public void setHealthcare_provider_taxonomy_code_7(String healthcare_provider_taxonomy_code_7) {
        this.healthcare_provider_taxonomy_code_7 = healthcare_provider_taxonomy_code_7;
    }

    public String getProvider_license_number_7() {
        return provider_license_number_7;
    }

    public void setProvider_license_number_7(String provider_license_number_7) {
        this.provider_license_number_7 = provider_license_number_7;
    }

    public String getProvider_license_number_state_code_7() {
        return provider_license_number_state_code_7;
    }

    public void setProvider_license_number_state_code_7(String provider_license_number_state_code_7) {
        this.provider_license_number_state_code_7 = provider_license_number_state_code_7;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_7() {
        return healthcare_provider_primary_taxonomy_switch_7;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_7(String healthcare_provider_primary_taxonomy_switch_7) {
        this.healthcare_provider_primary_taxonomy_switch_7 = healthcare_provider_primary_taxonomy_switch_7;
    }

    public String getHealthcare_provider_taxonomy_code_8() {
        return healthcare_provider_taxonomy_code_8;
    }

    public void setHealthcare_provider_taxonomy_code_8(String healthcare_provider_taxonomy_code_8) {
        this.healthcare_provider_taxonomy_code_8 = healthcare_provider_taxonomy_code_8;
    }

    public String getProvider_license_number_8() {
        return provider_license_number_8;
    }

    public void setProvider_license_number_8(String provider_license_number_8) {
        this.provider_license_number_8 = provider_license_number_8;
    }

    public String getProvider_license_number_state_code_8() {
        return provider_license_number_state_code_8;
    }

    public void setProvider_license_number_state_code_8(String provider_license_number_state_code_8) {
        this.provider_license_number_state_code_8 = provider_license_number_state_code_8;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_8() {
        return healthcare_provider_primary_taxonomy_switch_8;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_8(String healthcare_provider_primary_taxonomy_switch_8) {
        this.healthcare_provider_primary_taxonomy_switch_8 = healthcare_provider_primary_taxonomy_switch_8;
    }

    public String getHealthcare_provider_taxonomy_code_9() {
        return healthcare_provider_taxonomy_code_9;
    }

    public void setHealthcare_provider_taxonomy_code_9(String healthcare_provider_taxonomy_code_9) {
        this.healthcare_provider_taxonomy_code_9 = healthcare_provider_taxonomy_code_9;
    }

    public String getProvider_license_number_9() {
        return provider_license_number_9;
    }

    public void setProvider_license_number_9(String provider_license_number_9) {
        this.provider_license_number_9 = provider_license_number_9;
    }

    public String getProvider_license_number_state_code_9() {
        return provider_license_number_state_code_9;
    }

    public void setProvider_license_number_state_code_9(String provider_license_number_state_code_9) {
        this.provider_license_number_state_code_9 = provider_license_number_state_code_9;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_9() {
        return healthcare_provider_primary_taxonomy_switch_9;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_9(String healthcare_provider_primary_taxonomy_switch_9) {
        this.healthcare_provider_primary_taxonomy_switch_9 = healthcare_provider_primary_taxonomy_switch_9;
    }

    public String getHealthcare_provider_taxonomy_code_10() {
        return healthcare_provider_taxonomy_code_10;
    }

    public void setHealthcare_provider_taxonomy_code_10(String healthcare_provider_taxonomy_code_10) {
        this.healthcare_provider_taxonomy_code_10 = healthcare_provider_taxonomy_code_10;
    }

    public String getProvider_license_number_10() {
        return provider_license_number_10;
    }

    public void setProvider_license_number_10(String provider_license_number_10) {
        this.provider_license_number_10 = provider_license_number_10;
    }

    public String getProvider_license_number_state_code_10() {
        return provider_license_number_state_code_10;
    }

    public void setProvider_license_number_state_code_10(String provider_license_number_state_code_10) {
        this.provider_license_number_state_code_10 = provider_license_number_state_code_10;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_10() {
        return healthcare_provider_primary_taxonomy_switch_10;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_10(String healthcare_provider_primary_taxonomy_switch_10) {
        this.healthcare_provider_primary_taxonomy_switch_10 = healthcare_provider_primary_taxonomy_switch_10;
    }

    public String getHealthcare_provider_taxonomy_code_11() {
        return healthcare_provider_taxonomy_code_11;
    }

    public void setHealthcare_provider_taxonomy_code_11(String healthcare_provider_taxonomy_code_11) {
        this.healthcare_provider_taxonomy_code_11 = healthcare_provider_taxonomy_code_11;
    }

    public String getProvider_license_number_11() {
        return provider_license_number_11;
    }

    public void setProvider_license_number_11(String provider_license_number_11) {
        this.provider_license_number_11 = provider_license_number_11;
    }

    public String getProvider_license_number_state_code_11() {
        return provider_license_number_state_code_11;
    }

    public void setProvider_license_number_state_code_11(String provider_license_number_state_code_11) {
        this.provider_license_number_state_code_11 = provider_license_number_state_code_11;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_11() {
        return healthcare_provider_primary_taxonomy_switch_11;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_11(String healthcare_provider_primary_taxonomy_switch_11) {
        this.healthcare_provider_primary_taxonomy_switch_11 = healthcare_provider_primary_taxonomy_switch_11;
    }

    public String getHealthcare_provider_taxonomy_code_12() {
        return healthcare_provider_taxonomy_code_12;
    }

    public void setHealthcare_provider_taxonomy_code_12(String healthcare_provider_taxonomy_code_12) {
        this.healthcare_provider_taxonomy_code_12 = healthcare_provider_taxonomy_code_12;
    }

    public String getProvider_license_number_12() {
        return provider_license_number_12;
    }

    public void setProvider_license_number_12(String provider_license_number_12) {
        this.provider_license_number_12 = provider_license_number_12;
    }

    public String getProvider_license_number_state_code_12() {
        return provider_license_number_state_code_12;
    }

    public void setProvider_license_number_state_code_12(String provider_license_number_state_code_12) {
        this.provider_license_number_state_code_12 = provider_license_number_state_code_12;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_12() {
        return healthcare_provider_primary_taxonomy_switch_12;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_12(String healthcare_provider_primary_taxonomy_switch_12) {
        this.healthcare_provider_primary_taxonomy_switch_12 = healthcare_provider_primary_taxonomy_switch_12;
    }

    public String getHealthcare_provider_taxonomy_code_13() {
        return healthcare_provider_taxonomy_code_13;
    }

    public void setHealthcare_provider_taxonomy_code_13(String healthcare_provider_taxonomy_code_13) {
        this.healthcare_provider_taxonomy_code_13 = healthcare_provider_taxonomy_code_13;
    }

    public String getProvider_license_number_13() {
        return provider_license_number_13;
    }

    public void setProvider_license_number_13(String provider_license_number_13) {
        this.provider_license_number_13 = provider_license_number_13;
    }

    public String getProvider_license_number_state_code_13() {
        return provider_license_number_state_code_13;
    }

    public void setProvider_license_number_state_code_13(String provider_license_number_state_code_13) {
        this.provider_license_number_state_code_13 = provider_license_number_state_code_13;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_13() {
        return healthcare_provider_primary_taxonomy_switch_13;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_13(String healthcare_provider_primary_taxonomy_switch_13) {
        this.healthcare_provider_primary_taxonomy_switch_13 = healthcare_provider_primary_taxonomy_switch_13;
    }

    public String getHealthcare_provider_taxonomy_code_14() {
        return healthcare_provider_taxonomy_code_14;
    }

    public void setHealthcare_provider_taxonomy_code_14(String healthcare_provider_taxonomy_code_14) {
        this.healthcare_provider_taxonomy_code_14 = healthcare_provider_taxonomy_code_14;
    }

    public String getProvider_license_number_14() {
        return provider_license_number_14;
    }

    public void setProvider_license_number_14(String provider_license_number_14) {
        this.provider_license_number_14 = provider_license_number_14;
    }

    public String getProvider_license_number_state_code_14() {
        return provider_license_number_state_code_14;
    }

    public void setProvider_license_number_state_code_14(String provider_license_number_state_code_14) {
        this.provider_license_number_state_code_14 = provider_license_number_state_code_14;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_14() {
        return healthcare_provider_primary_taxonomy_switch_14;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_14(String healthcare_provider_primary_taxonomy_switch_14) {
        this.healthcare_provider_primary_taxonomy_switch_14 = healthcare_provider_primary_taxonomy_switch_14;
    }

    public String getHealthcare_provider_taxonomy_code_15() {
        return healthcare_provider_taxonomy_code_15;
    }

    public void setHealthcare_provider_taxonomy_code_15(String healthcare_provider_taxonomy_code_15) {
        this.healthcare_provider_taxonomy_code_15 = healthcare_provider_taxonomy_code_15;
    }

    public String getProvider_license_number_15() {
        return provider_license_number_15;
    }

    public void setProvider_license_number_15(String provider_license_number_15) {
        this.provider_license_number_15 = provider_license_number_15;
    }

    public String getProvider_license_number_state_code_15() {
        return provider_license_number_state_code_15;
    }

    public void setProvider_license_number_state_code_15(String provider_license_number_state_code_15) {
        this.provider_license_number_state_code_15 = provider_license_number_state_code_15;
    }

    public String getHealthcare_provider_primary_taxonomy_switch_15() {
        return healthcare_provider_primary_taxonomy_switch_15;
    }

    public void setHealthcare_provider_primary_taxonomy_switch_15(String healthcare_provider_primary_taxonomy_switch_15) {
        this.healthcare_provider_primary_taxonomy_switch_15 = healthcare_provider_primary_taxonomy_switch_15;
    }

    public String getOther_provider_identifier_1() {
        return other_provider_identifier_1;
    }

    public void setOther_provider_identifier_1(String other_provider_identifier_1) {
        this.other_provider_identifier_1 = other_provider_identifier_1;
    }

    public String getOther_provider_identifier_type_code_1() {
        return other_provider_identifier_type_code_1;
    }

    public void setOther_provider_identifier_type_code_1(String other_provider_identifier_type_code_1) {
        this.other_provider_identifier_type_code_1 = other_provider_identifier_type_code_1;
    }

    public String getOther_provider_identifier_state_1() {
        return other_provider_identifier_state_1;
    }

    public void setOther_provider_identifier_state_1(String other_provider_identifier_state_1) {
        this.other_provider_identifier_state_1 = other_provider_identifier_state_1;
    }

    public String getOther_provider_identifier_issuer_1() {
        return other_provider_identifier_issuer_1;
    }

    public void setOther_provider_identifier_issuer_1(String other_provider_identifier_issuer_1) {
        this.other_provider_identifier_issuer_1 = other_provider_identifier_issuer_1;
    }

    public String getOther_provider_identifier_2() {
        return other_provider_identifier_2;
    }

    public void setOther_provider_identifier_2(String other_provider_identifier_2) {
        this.other_provider_identifier_2 = other_provider_identifier_2;
    }

    public String getOther_provider_identifier_type_code_2() {
        return other_provider_identifier_type_code_2;
    }

    public void setOther_provider_identifier_type_code_2(String other_provider_identifier_type_code_2) {
        this.other_provider_identifier_type_code_2 = other_provider_identifier_type_code_2;
    }

    public String getOther_provider_identifier_state_2() {
        return other_provider_identifier_state_2;
    }

    public void setOther_provider_identifier_state_2(String other_provider_identifier_state_2) {
        this.other_provider_identifier_state_2 = other_provider_identifier_state_2;
    }

    public String getOther_provider_identifier_issuer_2() {
        return other_provider_identifier_issuer_2;
    }

    public void setOther_provider_identifier_issuer_2(String other_provider_identifier_issuer_2) {
        this.other_provider_identifier_issuer_2 = other_provider_identifier_issuer_2;
    }

    public String getOther_provider_identifier_3() {
        return other_provider_identifier_3;
    }

    public void setOther_provider_identifier_3(String other_provider_identifier_3) {
        this.other_provider_identifier_3 = other_provider_identifier_3;
    }

    public String getOther_provider_identifier_type_code_3() {
        return other_provider_identifier_type_code_3;
    }

    public void setOther_provider_identifier_type_code_3(String other_provider_identifier_type_code_3) {
        this.other_provider_identifier_type_code_3 = other_provider_identifier_type_code_3;
    }

    public String getOther_provider_identifier_state_3() {
        return other_provider_identifier_state_3;
    }

    public void setOther_provider_identifier_state_3(String other_provider_identifier_state_3) {
        this.other_provider_identifier_state_3 = other_provider_identifier_state_3;
    }

    public String getOther_provider_identifier_issuer_3() {
        return other_provider_identifier_issuer_3;
    }

    public void setOther_provider_identifier_issuer_3(String other_provider_identifier_issuer_3) {
        this.other_provider_identifier_issuer_3 = other_provider_identifier_issuer_3;
    }

    public String getOther_provider_identifier_4() {
        return other_provider_identifier_4;
    }

    public void setOther_provider_identifier_4(String other_provider_identifier_4) {
        this.other_provider_identifier_4 = other_provider_identifier_4;
    }

    public String getOther_provider_identifier_type_code_4() {
        return other_provider_identifier_type_code_4;
    }

    public void setOther_provider_identifier_type_code_4(String other_provider_identifier_type_code_4) {
        this.other_provider_identifier_type_code_4 = other_provider_identifier_type_code_4;
    }

    public String getOther_provider_identifier_state_4() {
        return other_provider_identifier_state_4;
    }

    public void setOther_provider_identifier_state_4(String other_provider_identifier_state_4) {
        this.other_provider_identifier_state_4 = other_provider_identifier_state_4;
    }

    public String getOther_provider_identifier_issuer_4() {
        return other_provider_identifier_issuer_4;
    }

    public void setOther_provider_identifier_issuer_4(String other_provider_identifier_issuer_4) {
        this.other_provider_identifier_issuer_4 = other_provider_identifier_issuer_4;
    }

    public String getOther_provider_identifier_5() {
        return other_provider_identifier_5;
    }

    public void setOther_provider_identifier_5(String other_provider_identifier_5) {
        this.other_provider_identifier_5 = other_provider_identifier_5;
    }

    public String getOther_provider_identifier_type_code_5() {
        return other_provider_identifier_type_code_5;
    }

    public void setOther_provider_identifier_type_code_5(String other_provider_identifier_type_code_5) {
        this.other_provider_identifier_type_code_5 = other_provider_identifier_type_code_5;
    }

    public String getOther_provider_identifier_state_5() {
        return other_provider_identifier_state_5;
    }

    public void setOther_provider_identifier_state_5(String other_provider_identifier_state_5) {
        this.other_provider_identifier_state_5 = other_provider_identifier_state_5;
    }

    public String getOther_provider_identifier_issuer_5() {
        return other_provider_identifier_issuer_5;
    }

    public void setOther_provider_identifier_issuer_5(String other_provider_identifier_issuer_5) {
        this.other_provider_identifier_issuer_5 = other_provider_identifier_issuer_5;
    }

    public String getOther_provider_identifier_6() {
        return other_provider_identifier_6;
    }

    public void setOther_provider_identifier_6(String other_provider_identifier_6) {
        this.other_provider_identifier_6 = other_provider_identifier_6;
    }

    public String getOther_provider_identifier_type_code_6() {
        return other_provider_identifier_type_code_6;
    }

    public void setOther_provider_identifier_type_code_6(String other_provider_identifier_type_code_6) {
        this.other_provider_identifier_type_code_6 = other_provider_identifier_type_code_6;
    }

    public String getOther_provider_identifier_state_6() {
        return other_provider_identifier_state_6;
    }

    public void setOther_provider_identifier_state_6(String other_provider_identifier_state_6) {
        this.other_provider_identifier_state_6 = other_provider_identifier_state_6;
    }

    public String getOther_provider_identifier_issuer_6() {
        return other_provider_identifier_issuer_6;
    }

    public void setOther_provider_identifier_issuer_6(String other_provider_identifier_issuer_6) {
        this.other_provider_identifier_issuer_6 = other_provider_identifier_issuer_6;
    }

    public String getOther_provider_identifier_7() {
        return other_provider_identifier_7;
    }

    public void setOther_provider_identifier_7(String other_provider_identifier_7) {
        this.other_provider_identifier_7 = other_provider_identifier_7;
    }

    public String getOther_provider_identifier_type_code_7() {
        return other_provider_identifier_type_code_7;
    }

    public void setOther_provider_identifier_type_code_7(String other_provider_identifier_type_code_7) {
        this.other_provider_identifier_type_code_7 = other_provider_identifier_type_code_7;
    }

    public String getOther_provider_identifier_state_7() {
        return other_provider_identifier_state_7;
    }

    public void setOther_provider_identifier_state_7(String other_provider_identifier_state_7) {
        this.other_provider_identifier_state_7 = other_provider_identifier_state_7;
    }

    public String getOther_provider_identifier_issuer_7() {
        return other_provider_identifier_issuer_7;
    }

    public void setOther_provider_identifier_issuer_7(String other_provider_identifier_issuer_7) {
        this.other_provider_identifier_issuer_7 = other_provider_identifier_issuer_7;
    }

    public String getOther_provider_identifier_8() {
        return other_provider_identifier_8;
    }

    public void setOther_provider_identifier_8(String other_provider_identifier_8) {
        this.other_provider_identifier_8 = other_provider_identifier_8;
    }

    public String getOther_provider_identifier_type_code_8() {
        return other_provider_identifier_type_code_8;
    }

    public void setOther_provider_identifier_type_code_8(String other_provider_identifier_type_code_8) {
        this.other_provider_identifier_type_code_8 = other_provider_identifier_type_code_8;
    }

    public String getOther_provider_identifier_state_8() {
        return other_provider_identifier_state_8;
    }

    public void setOther_provider_identifier_state_8(String other_provider_identifier_state_8) {
        this.other_provider_identifier_state_8 = other_provider_identifier_state_8;
    }

    public String getOther_provider_identifier_issuer_8() {
        return other_provider_identifier_issuer_8;
    }

    public void setOther_provider_identifier_issuer_8(String other_provider_identifier_issuer_8) {
        this.other_provider_identifier_issuer_8 = other_provider_identifier_issuer_8;
    }

    public String getOther_provider_identifier_9() {
        return other_provider_identifier_9;
    }

    public void setOther_provider_identifier_9(String other_provider_identifier_9) {
        this.other_provider_identifier_9 = other_provider_identifier_9;
    }

    public String getOther_provider_identifier_type_code_9() {
        return other_provider_identifier_type_code_9;
    }

    public void setOther_provider_identifier_type_code_9(String other_provider_identifier_type_code_9) {
        this.other_provider_identifier_type_code_9 = other_provider_identifier_type_code_9;
    }

    public String getOther_provider_identifier_state_9() {
        return other_provider_identifier_state_9;
    }

    public void setOther_provider_identifier_state_9(String other_provider_identifier_state_9) {
        this.other_provider_identifier_state_9 = other_provider_identifier_state_9;
    }

    public String getOther_provider_identifier_issuer_9() {
        return other_provider_identifier_issuer_9;
    }

    public void setOther_provider_identifier_issuer_9(String other_provider_identifier_issuer_9) {
        this.other_provider_identifier_issuer_9 = other_provider_identifier_issuer_9;
    }

    public String getOther_provider_identifier_10() {
        return other_provider_identifier_10;
    }

    public void setOther_provider_identifier_10(String other_provider_identifier_10) {
        this.other_provider_identifier_10 = other_provider_identifier_10;
    }

    public String getOther_provider_identifier_type_code_10() {
        return other_provider_identifier_type_code_10;
    }

    public void setOther_provider_identifier_type_code_10(String other_provider_identifier_type_code_10) {
        this.other_provider_identifier_type_code_10 = other_provider_identifier_type_code_10;
    }

    public String getOther_provider_identifier_state_10() {
        return other_provider_identifier_state_10;
    }

    public void setOther_provider_identifier_state_10(String other_provider_identifier_state_10) {
        this.other_provider_identifier_state_10 = other_provider_identifier_state_10;
    }

    public String getOther_provider_identifier_issuer_10() {
        return other_provider_identifier_issuer_10;
    }

    public void setOther_provider_identifier_issuer_10(String other_provider_identifier_issuer_10) {
        this.other_provider_identifier_issuer_10 = other_provider_identifier_issuer_10;
    }

    public String getOther_provider_identifier_11() {
        return other_provider_identifier_11;
    }

    public void setOther_provider_identifier_11(String other_provider_identifier_11) {
        this.other_provider_identifier_11 = other_provider_identifier_11;
    }

    public String getOther_provider_identifier_type_code_11() {
        return other_provider_identifier_type_code_11;
    }

    public void setOther_provider_identifier_type_code_11(String other_provider_identifier_type_code_11) {
        this.other_provider_identifier_type_code_11 = other_provider_identifier_type_code_11;
    }

    public String getOther_provider_identifier_state_11() {
        return other_provider_identifier_state_11;
    }

    public void setOther_provider_identifier_state_11(String other_provider_identifier_state_11) {
        this.other_provider_identifier_state_11 = other_provider_identifier_state_11;
    }

    public String getOther_provider_identifier_issuer_11() {
        return other_provider_identifier_issuer_11;
    }

    public void setOther_provider_identifier_issuer_11(String other_provider_identifier_issuer_11) {
        this.other_provider_identifier_issuer_11 = other_provider_identifier_issuer_11;
    }

    public String getOther_provider_identifier_12() {
        return other_provider_identifier_12;
    }

    public void setOther_provider_identifier_12(String other_provider_identifier_12) {
        this.other_provider_identifier_12 = other_provider_identifier_12;
    }

    public String getOther_provider_identifier_type_code_12() {
        return other_provider_identifier_type_code_12;
    }

    public void setOther_provider_identifier_type_code_12(String other_provider_identifier_type_code_12) {
        this.other_provider_identifier_type_code_12 = other_provider_identifier_type_code_12;
    }

    public String getOther_provider_identifier_state_12() {
        return other_provider_identifier_state_12;
    }

    public void setOther_provider_identifier_state_12(String other_provider_identifier_state_12) {
        this.other_provider_identifier_state_12 = other_provider_identifier_state_12;
    }

    public String getOther_provider_identifier_issuer_12() {
        return other_provider_identifier_issuer_12;
    }

    public void setOther_provider_identifier_issuer_12(String other_provider_identifier_issuer_12) {
        this.other_provider_identifier_issuer_12 = other_provider_identifier_issuer_12;
    }

    public String getOther_provider_identifier_13() {
        return other_provider_identifier_13;
    }

    public void setOther_provider_identifier_13(String other_provider_identifier_13) {
        this.other_provider_identifier_13 = other_provider_identifier_13;
    }

    public String getOther_provider_identifier_type_code_13() {
        return other_provider_identifier_type_code_13;
    }

    public void setOther_provider_identifier_type_code_13(String other_provider_identifier_type_code_13) {
        this.other_provider_identifier_type_code_13 = other_provider_identifier_type_code_13;
    }

    public String getOther_provider_identifier_state_13() {
        return other_provider_identifier_state_13;
    }

    public void setOther_provider_identifier_state_13(String other_provider_identifier_state_13) {
        this.other_provider_identifier_state_13 = other_provider_identifier_state_13;
    }

    public String getOther_provider_identifier_issuer_13() {
        return other_provider_identifier_issuer_13;
    }

    public void setOther_provider_identifier_issuer_13(String other_provider_identifier_issuer_13) {
        this.other_provider_identifier_issuer_13 = other_provider_identifier_issuer_13;
    }

    public String getOther_provider_identifier_14() {
        return other_provider_identifier_14;
    }

    public void setOther_provider_identifier_14(String other_provider_identifier_14) {
        this.other_provider_identifier_14 = other_provider_identifier_14;
    }

    public String getOther_provider_identifier_type_code_14() {
        return other_provider_identifier_type_code_14;
    }

    public void setOther_provider_identifier_type_code_14(String other_provider_identifier_type_code_14) {
        this.other_provider_identifier_type_code_14 = other_provider_identifier_type_code_14;
    }

    public String getOther_provider_identifier_state_14() {
        return other_provider_identifier_state_14;
    }

    public void setOther_provider_identifier_state_14(String other_provider_identifier_state_14) {
        this.other_provider_identifier_state_14 = other_provider_identifier_state_14;
    }

    public String getOther_provider_identifier_issuer_14() {
        return other_provider_identifier_issuer_14;
    }

    public void setOther_provider_identifier_issuer_14(String other_provider_identifier_issuer_14) {
        this.other_provider_identifier_issuer_14 = other_provider_identifier_issuer_14;
    }

    public String getOther_provider_identifier_15() {
        return other_provider_identifier_15;
    }

    public void setOther_provider_identifier_15(String other_provider_identifier_15) {
        this.other_provider_identifier_15 = other_provider_identifier_15;
    }

    public String getOther_provider_identifier_type_code_15() {
        return other_provider_identifier_type_code_15;
    }

    public void setOther_provider_identifier_type_code_15(String other_provider_identifier_type_code_15) {
        this.other_provider_identifier_type_code_15 = other_provider_identifier_type_code_15;
    }

    public String getOther_provider_identifier_state_15() {
        return other_provider_identifier_state_15;
    }

    public void setOther_provider_identifier_state_15(String other_provider_identifier_state_15) {
        this.other_provider_identifier_state_15 = other_provider_identifier_state_15;
    }

    public String getOther_provider_identifier_issuer_15() {
        return other_provider_identifier_issuer_15;
    }

    public void setOther_provider_identifier_issuer_15(String other_provider_identifier_issuer_15) {
        this.other_provider_identifier_issuer_15 = other_provider_identifier_issuer_15;
    }

    public String getOther_provider_identifier_16() {
        return other_provider_identifier_16;
    }

    public void setOther_provider_identifier_16(String other_provider_identifier_16) {
        this.other_provider_identifier_16 = other_provider_identifier_16;
    }

    public String getOther_provider_identifier_type_code_16() {
        return other_provider_identifier_type_code_16;
    }

    public void setOther_provider_identifier_type_code_16(String other_provider_identifier_type_code_16) {
        this.other_provider_identifier_type_code_16 = other_provider_identifier_type_code_16;
    }

    public String getOther_provider_identifier_state_16() {
        return other_provider_identifier_state_16;
    }

    public void setOther_provider_identifier_state_16(String other_provider_identifier_state_16) {
        this.other_provider_identifier_state_16 = other_provider_identifier_state_16;
    }

    public String getOther_provider_identifier_issuer_16() {
        return other_provider_identifier_issuer_16;
    }

    public void setOther_provider_identifier_issuer_16(String other_provider_identifier_issuer_16) {
        this.other_provider_identifier_issuer_16 = other_provider_identifier_issuer_16;
    }

    public String getOther_provider_identifier_17() {
        return other_provider_identifier_17;
    }

    public void setOther_provider_identifier_17(String other_provider_identifier_17) {
        this.other_provider_identifier_17 = other_provider_identifier_17;
    }

    public String getOther_provider_identifier_type_code_17() {
        return other_provider_identifier_type_code_17;
    }

    public void setOther_provider_identifier_type_code_17(String other_provider_identifier_type_code_17) {
        this.other_provider_identifier_type_code_17 = other_provider_identifier_type_code_17;
    }

    public String getOther_provider_identifier_state_17() {
        return other_provider_identifier_state_17;
    }

    public void setOther_provider_identifier_state_17(String other_provider_identifier_state_17) {
        this.other_provider_identifier_state_17 = other_provider_identifier_state_17;
    }

    public String getOther_provider_identifier_issuer_17() {
        return other_provider_identifier_issuer_17;
    }

    public void setOther_provider_identifier_issuer_17(String other_provider_identifier_issuer_17) {
        this.other_provider_identifier_issuer_17 = other_provider_identifier_issuer_17;
    }

    public String getOther_provider_identifier_18() {
        return other_provider_identifier_18;
    }

    public void setOther_provider_identifier_18(String other_provider_identifier_18) {
        this.other_provider_identifier_18 = other_provider_identifier_18;
    }

    public String getOther_provider_identifier_type_code_18() {
        return other_provider_identifier_type_code_18;
    }

    public void setOther_provider_identifier_type_code_18(String other_provider_identifier_type_code_18) {
        this.other_provider_identifier_type_code_18 = other_provider_identifier_type_code_18;
    }

    public String getOther_provider_identifier_state_18() {
        return other_provider_identifier_state_18;
    }

    public void setOther_provider_identifier_state_18(String other_provider_identifier_state_18) {
        this.other_provider_identifier_state_18 = other_provider_identifier_state_18;
    }

    public String getOther_provider_identifier_issuer_18() {
        return other_provider_identifier_issuer_18;
    }

    public void setOther_provider_identifier_issuer_18(String other_provider_identifier_issuer_18) {
        this.other_provider_identifier_issuer_18 = other_provider_identifier_issuer_18;
    }

    public String getOther_provider_identifier_19() {
        return other_provider_identifier_19;
    }

    public void setOther_provider_identifier_19(String other_provider_identifier_19) {
        this.other_provider_identifier_19 = other_provider_identifier_19;
    }

    public String getOther_provider_identifier_type_code_19() {
        return other_provider_identifier_type_code_19;
    }

    public void setOther_provider_identifier_type_code_19(String other_provider_identifier_type_code_19) {
        this.other_provider_identifier_type_code_19 = other_provider_identifier_type_code_19;
    }

    public String getOther_provider_identifier_state_19() {
        return other_provider_identifier_state_19;
    }

    public void setOther_provider_identifier_state_19(String other_provider_identifier_state_19) {
        this.other_provider_identifier_state_19 = other_provider_identifier_state_19;
    }

    public String getOther_provider_identifier_issuer_19() {
        return other_provider_identifier_issuer_19;
    }

    public void setOther_provider_identifier_issuer_19(String other_provider_identifier_issuer_19) {
        this.other_provider_identifier_issuer_19 = other_provider_identifier_issuer_19;
    }

    public String getOther_provider_identifier_20() {
        return other_provider_identifier_20;
    }

    public void setOther_provider_identifier_20(String other_provider_identifier_20) {
        this.other_provider_identifier_20 = other_provider_identifier_20;
    }

    public String getOther_provider_identifier_type_code_20() {
        return other_provider_identifier_type_code_20;
    }

    public void setOther_provider_identifier_type_code_20(String other_provider_identifier_type_code_20) {
        this.other_provider_identifier_type_code_20 = other_provider_identifier_type_code_20;
    }

    public String getOther_provider_identifier_state_20() {
        return other_provider_identifier_state_20;
    }

    public void setOther_provider_identifier_state_20(String other_provider_identifier_state_20) {
        this.other_provider_identifier_state_20 = other_provider_identifier_state_20;
    }

    public String getOther_provider_identifier_issuer_20() {
        return other_provider_identifier_issuer_20;
    }

    public void setOther_provider_identifier_issuer_20(String other_provider_identifier_issuer_20) {
        this.other_provider_identifier_issuer_20 = other_provider_identifier_issuer_20;
    }

    public String getOther_provider_identifier_21() {
        return other_provider_identifier_21;
    }

    public void setOther_provider_identifier_21(String other_provider_identifier_21) {
        this.other_provider_identifier_21 = other_provider_identifier_21;
    }

    public String getOther_provider_identifier_type_code_21() {
        return other_provider_identifier_type_code_21;
    }

    public void setOther_provider_identifier_type_code_21(String other_provider_identifier_type_code_21) {
        this.other_provider_identifier_type_code_21 = other_provider_identifier_type_code_21;
    }

    public String getOther_provider_identifier_state_21() {
        return other_provider_identifier_state_21;
    }

    public void setOther_provider_identifier_state_21(String other_provider_identifier_state_21) {
        this.other_provider_identifier_state_21 = other_provider_identifier_state_21;
    }

    public String getOther_provider_identifier_issuer_21() {
        return other_provider_identifier_issuer_21;
    }

    public void setOther_provider_identifier_issuer_21(String other_provider_identifier_issuer_21) {
        this.other_provider_identifier_issuer_21 = other_provider_identifier_issuer_21;
    }

    public String getOther_provider_identifier_22() {
        return other_provider_identifier_22;
    }

    public void setOther_provider_identifier_22(String other_provider_identifier_22) {
        this.other_provider_identifier_22 = other_provider_identifier_22;
    }

    public String getOther_provider_identifier_type_code_22() {
        return other_provider_identifier_type_code_22;
    }

    public void setOther_provider_identifier_type_code_22(String other_provider_identifier_type_code_22) {
        this.other_provider_identifier_type_code_22 = other_provider_identifier_type_code_22;
    }

    public String getOther_provider_identifier_state_22() {
        return other_provider_identifier_state_22;
    }

    public void setOther_provider_identifier_state_22(String other_provider_identifier_state_22) {
        this.other_provider_identifier_state_22 = other_provider_identifier_state_22;
    }

    public String getOther_provider_identifier_issuer_22() {
        return other_provider_identifier_issuer_22;
    }

    public void setOther_provider_identifier_issuer_22(String other_provider_identifier_issuer_22) {
        this.other_provider_identifier_issuer_22 = other_provider_identifier_issuer_22;
    }

    public String getOther_provider_identifier_23() {
        return other_provider_identifier_23;
    }

    public void setOther_provider_identifier_23(String other_provider_identifier_23) {
        this.other_provider_identifier_23 = other_provider_identifier_23;
    }

    public String getOther_provider_identifier_type_code_23() {
        return other_provider_identifier_type_code_23;
    }

    public void setOther_provider_identifier_type_code_23(String other_provider_identifier_type_code_23) {
        this.other_provider_identifier_type_code_23 = other_provider_identifier_type_code_23;
    }

    public String getOther_provider_identifier_state_23() {
        return other_provider_identifier_state_23;
    }

    public void setOther_provider_identifier_state_23(String other_provider_identifier_state_23) {
        this.other_provider_identifier_state_23 = other_provider_identifier_state_23;
    }

    public String getOther_provider_identifier_issuer_23() {
        return other_provider_identifier_issuer_23;
    }

    public void setOther_provider_identifier_issuer_23(String other_provider_identifier_issuer_23) {
        this.other_provider_identifier_issuer_23 = other_provider_identifier_issuer_23;
    }

    public String getOther_provider_identifier_24() {
        return other_provider_identifier_24;
    }

    public void setOther_provider_identifier_24(String other_provider_identifier_24) {
        this.other_provider_identifier_24 = other_provider_identifier_24;
    }

    public String getOther_provider_identifier_type_code_24() {
        return other_provider_identifier_type_code_24;
    }

    public void setOther_provider_identifier_type_code_24(String other_provider_identifier_type_code_24) {
        this.other_provider_identifier_type_code_24 = other_provider_identifier_type_code_24;
    }

    public String getOther_provider_identifier_state_24() {
        return other_provider_identifier_state_24;
    }

    public void setOther_provider_identifier_state_24(String other_provider_identifier_state_24) {
        this.other_provider_identifier_state_24 = other_provider_identifier_state_24;
    }

    public String getOther_provider_identifier_issuer_24() {
        return other_provider_identifier_issuer_24;
    }

    public void setOther_provider_identifier_issuer_24(String other_provider_identifier_issuer_24) {
        this.other_provider_identifier_issuer_24 = other_provider_identifier_issuer_24;
    }

    public String getOther_provider_identifier_25() {
        return other_provider_identifier_25;
    }

    public void setOther_provider_identifier_25(String other_provider_identifier_25) {
        this.other_provider_identifier_25 = other_provider_identifier_25;
    }

    public String getOther_provider_identifier_type_code_25() {
        return other_provider_identifier_type_code_25;
    }

    public void setOther_provider_identifier_type_code_25(String other_provider_identifier_type_code_25) {
        this.other_provider_identifier_type_code_25 = other_provider_identifier_type_code_25;
    }

    public String getOther_provider_identifier_state_25() {
        return other_provider_identifier_state_25;
    }

    public void setOther_provider_identifier_state_25(String other_provider_identifier_state_25) {
        this.other_provider_identifier_state_25 = other_provider_identifier_state_25;
    }

    public String getOther_provider_identifier_issuer_25() {
        return other_provider_identifier_issuer_25;
    }

    public void setOther_provider_identifier_issuer_25(String other_provider_identifier_issuer_25) {
        this.other_provider_identifier_issuer_25 = other_provider_identifier_issuer_25;
    }

    public String getOther_provider_identifier_26() {
        return other_provider_identifier_26;
    }

    public void setOther_provider_identifier_26(String other_provider_identifier_26) {
        this.other_provider_identifier_26 = other_provider_identifier_26;
    }

    public String getOther_provider_identifier_type_code_26() {
        return other_provider_identifier_type_code_26;
    }

    public void setOther_provider_identifier_type_code_26(String other_provider_identifier_type_code_26) {
        this.other_provider_identifier_type_code_26 = other_provider_identifier_type_code_26;
    }

    public String getOther_provider_identifier_state_26() {
        return other_provider_identifier_state_26;
    }

    public void setOther_provider_identifier_state_26(String other_provider_identifier_state_26) {
        this.other_provider_identifier_state_26 = other_provider_identifier_state_26;
    }

    public String getOther_provider_identifier_issuer_26() {
        return other_provider_identifier_issuer_26;
    }

    public void setOther_provider_identifier_issuer_26(String other_provider_identifier_issuer_26) {
        this.other_provider_identifier_issuer_26 = other_provider_identifier_issuer_26;
    }

    public String getOther_provider_identifier_27() {
        return other_provider_identifier_27;
    }

    public void setOther_provider_identifier_27(String other_provider_identifier_27) {
        this.other_provider_identifier_27 = other_provider_identifier_27;
    }

    public String getOther_provider_identifier_type_code_27() {
        return other_provider_identifier_type_code_27;
    }

    public void setOther_provider_identifier_type_code_27(String other_provider_identifier_type_code_27) {
        this.other_provider_identifier_type_code_27 = other_provider_identifier_type_code_27;
    }

    public String getOther_provider_identifier_state_27() {
        return other_provider_identifier_state_27;
    }

    public void setOther_provider_identifier_state_27(String other_provider_identifier_state_27) {
        this.other_provider_identifier_state_27 = other_provider_identifier_state_27;
    }

    public String getOther_provider_identifier_issuer_27() {
        return other_provider_identifier_issuer_27;
    }

    public void setOther_provider_identifier_issuer_27(String other_provider_identifier_issuer_27) {
        this.other_provider_identifier_issuer_27 = other_provider_identifier_issuer_27;
    }

    public String getOther_provider_identifier_28() {
        return other_provider_identifier_28;
    }

    public void setOther_provider_identifier_28(String other_provider_identifier_28) {
        this.other_provider_identifier_28 = other_provider_identifier_28;
    }

    public String getOther_provider_identifier_type_code_28() {
        return other_provider_identifier_type_code_28;
    }

    public void setOther_provider_identifier_type_code_28(String other_provider_identifier_type_code_28) {
        this.other_provider_identifier_type_code_28 = other_provider_identifier_type_code_28;
    }

    public String getOther_provider_identifier_state_28() {
        return other_provider_identifier_state_28;
    }

    public void setOther_provider_identifier_state_28(String other_provider_identifier_state_28) {
        this.other_provider_identifier_state_28 = other_provider_identifier_state_28;
    }

    public String getOther_provider_identifier_issuer_28() {
        return other_provider_identifier_issuer_28;
    }

    public void setOther_provider_identifier_issuer_28(String other_provider_identifier_issuer_28) {
        this.other_provider_identifier_issuer_28 = other_provider_identifier_issuer_28;
    }

    public String getOther_provider_identifier_29() {
        return other_provider_identifier_29;
    }

    public void setOther_provider_identifier_29(String other_provider_identifier_29) {
        this.other_provider_identifier_29 = other_provider_identifier_29;
    }

    public String getOther_provider_identifier_type_code_29() {
        return other_provider_identifier_type_code_29;
    }

    public void setOther_provider_identifier_type_code_29(String other_provider_identifier_type_code_29) {
        this.other_provider_identifier_type_code_29 = other_provider_identifier_type_code_29;
    }

    public String getOther_provider_identifier_state_29() {
        return other_provider_identifier_state_29;
    }

    public void setOther_provider_identifier_state_29(String other_provider_identifier_state_29) {
        this.other_provider_identifier_state_29 = other_provider_identifier_state_29;
    }

    public String getOther_provider_identifier_issuer_29() {
        return other_provider_identifier_issuer_29;
    }

    public void setOther_provider_identifier_issuer_29(String other_provider_identifier_issuer_29) {
        this.other_provider_identifier_issuer_29 = other_provider_identifier_issuer_29;
    }

    public String getOther_provider_identifier_30() {
        return other_provider_identifier_30;
    }

    public void setOther_provider_identifier_30(String other_provider_identifier_30) {
        this.other_provider_identifier_30 = other_provider_identifier_30;
    }

    public String getOther_provider_identifier_type_code_30() {
        return other_provider_identifier_type_code_30;
    }

    public void setOther_provider_identifier_type_code_30(String other_provider_identifier_type_code_30) {
        this.other_provider_identifier_type_code_30 = other_provider_identifier_type_code_30;
    }

    public String getOther_provider_identifier_state_30() {
        return other_provider_identifier_state_30;
    }

    public void setOther_provider_identifier_state_30(String other_provider_identifier_state_30) {
        this.other_provider_identifier_state_30 = other_provider_identifier_state_30;
    }

    public String getOther_provider_identifier_issuer_30() {
        return other_provider_identifier_issuer_30;
    }

    public void setOther_provider_identifier_issuer_30(String other_provider_identifier_issuer_30) {
        this.other_provider_identifier_issuer_30 = other_provider_identifier_issuer_30;
    }

    public String getOther_provider_identifier_31() {
        return other_provider_identifier_31;
    }

    public void setOther_provider_identifier_31(String other_provider_identifier_31) {
        this.other_provider_identifier_31 = other_provider_identifier_31;
    }

    public String getOther_provider_identifier_type_code_31() {
        return other_provider_identifier_type_code_31;
    }

    public void setOther_provider_identifier_type_code_31(String other_provider_identifier_type_code_31) {
        this.other_provider_identifier_type_code_31 = other_provider_identifier_type_code_31;
    }

    public String getOther_provider_identifier_state_31() {
        return other_provider_identifier_state_31;
    }

    public void setOther_provider_identifier_state_31(String other_provider_identifier_state_31) {
        this.other_provider_identifier_state_31 = other_provider_identifier_state_31;
    }

    public String getOther_provider_identifier_issuer_31() {
        return other_provider_identifier_issuer_31;
    }

    public void setOther_provider_identifier_issuer_31(String other_provider_identifier_issuer_31) {
        this.other_provider_identifier_issuer_31 = other_provider_identifier_issuer_31;
    }

    public String getOther_provider_identifier_32() {
        return other_provider_identifier_32;
    }

    public void setOther_provider_identifier_32(String other_provider_identifier_32) {
        this.other_provider_identifier_32 = other_provider_identifier_32;
    }

    public String getOther_provider_identifier_type_code_32() {
        return other_provider_identifier_type_code_32;
    }

    public void setOther_provider_identifier_type_code_32(String other_provider_identifier_type_code_32) {
        this.other_provider_identifier_type_code_32 = other_provider_identifier_type_code_32;
    }

    public String getOther_provider_identifier_state_32() {
        return other_provider_identifier_state_32;
    }

    public void setOther_provider_identifier_state_32(String other_provider_identifier_state_32) {
        this.other_provider_identifier_state_32 = other_provider_identifier_state_32;
    }

    public String getOther_provider_identifier_issuer_32() {
        return other_provider_identifier_issuer_32;
    }

    public void setOther_provider_identifier_issuer_32(String other_provider_identifier_issuer_32) {
        this.other_provider_identifier_issuer_32 = other_provider_identifier_issuer_32;
    }

    public String getOther_provider_identifier_33() {
        return other_provider_identifier_33;
    }

    public void setOther_provider_identifier_33(String other_provider_identifier_33) {
        this.other_provider_identifier_33 = other_provider_identifier_33;
    }

    public String getOther_provider_identifier_type_code_33() {
        return other_provider_identifier_type_code_33;
    }

    public void setOther_provider_identifier_type_code_33(String other_provider_identifier_type_code_33) {
        this.other_provider_identifier_type_code_33 = other_provider_identifier_type_code_33;
    }

    public String getOther_provider_identifier_state_33() {
        return other_provider_identifier_state_33;
    }

    public void setOther_provider_identifier_state_33(String other_provider_identifier_state_33) {
        this.other_provider_identifier_state_33 = other_provider_identifier_state_33;
    }

    public String getOther_provider_identifier_issuer_33() {
        return other_provider_identifier_issuer_33;
    }

    public void setOther_provider_identifier_issuer_33(String other_provider_identifier_issuer_33) {
        this.other_provider_identifier_issuer_33 = other_provider_identifier_issuer_33;
    }

    public String getOther_provider_identifier_34() {
        return other_provider_identifier_34;
    }

    public void setOther_provider_identifier_34(String other_provider_identifier_34) {
        this.other_provider_identifier_34 = other_provider_identifier_34;
    }

    public String getOther_provider_identifier_type_code_34() {
        return other_provider_identifier_type_code_34;
    }

    public void setOther_provider_identifier_type_code_34(String other_provider_identifier_type_code_34) {
        this.other_provider_identifier_type_code_34 = other_provider_identifier_type_code_34;
    }

    public String getOther_provider_identifier_state_34() {
        return other_provider_identifier_state_34;
    }

    public void setOther_provider_identifier_state_34(String other_provider_identifier_state_34) {
        this.other_provider_identifier_state_34 = other_provider_identifier_state_34;
    }

    public String getOther_provider_identifier_issuer_34() {
        return other_provider_identifier_issuer_34;
    }

    public void setOther_provider_identifier_issuer_34(String other_provider_identifier_issuer_34) {
        this.other_provider_identifier_issuer_34 = other_provider_identifier_issuer_34;
    }

    public String getOther_provider_identifier_35() {
        return other_provider_identifier_35;
    }

    public void setOther_provider_identifier_35(String other_provider_identifier_35) {
        this.other_provider_identifier_35 = other_provider_identifier_35;
    }

    public String getOther_provider_identifier_type_code_35() {
        return other_provider_identifier_type_code_35;
    }

    public void setOther_provider_identifier_type_code_35(String other_provider_identifier_type_code_35) {
        this.other_provider_identifier_type_code_35 = other_provider_identifier_type_code_35;
    }

    public String getOther_provider_identifier_state_35() {
        return other_provider_identifier_state_35;
    }

    public void setOther_provider_identifier_state_35(String other_provider_identifier_state_35) {
        this.other_provider_identifier_state_35 = other_provider_identifier_state_35;
    }

    public String getOther_provider_identifier_issuer_35() {
        return other_provider_identifier_issuer_35;
    }

    public void setOther_provider_identifier_issuer_35(String other_provider_identifier_issuer_35) {
        this.other_provider_identifier_issuer_35 = other_provider_identifier_issuer_35;
    }

    public String getOther_provider_identifier_36() {
        return other_provider_identifier_36;
    }

    public void setOther_provider_identifier_36(String other_provider_identifier_36) {
        this.other_provider_identifier_36 = other_provider_identifier_36;
    }

    public String getOther_provider_identifier_type_code_36() {
        return other_provider_identifier_type_code_36;
    }

    public void setOther_provider_identifier_type_code_36(String other_provider_identifier_type_code_36) {
        this.other_provider_identifier_type_code_36 = other_provider_identifier_type_code_36;
    }

    public String getOther_provider_identifier_state_36() {
        return other_provider_identifier_state_36;
    }

    public void setOther_provider_identifier_state_36(String other_provider_identifier_state_36) {
        this.other_provider_identifier_state_36 = other_provider_identifier_state_36;
    }

    public String getOther_provider_identifier_issuer_36() {
        return other_provider_identifier_issuer_36;
    }

    public void setOther_provider_identifier_issuer_36(String other_provider_identifier_issuer_36) {
        this.other_provider_identifier_issuer_36 = other_provider_identifier_issuer_36;
    }

    public String getOther_provider_identifier_37() {
        return other_provider_identifier_37;
    }

    public void setOther_provider_identifier_37(String other_provider_identifier_37) {
        this.other_provider_identifier_37 = other_provider_identifier_37;
    }

    public String getOther_provider_identifier_type_code_37() {
        return other_provider_identifier_type_code_37;
    }

    public void setOther_provider_identifier_type_code_37(String other_provider_identifier_type_code_37) {
        this.other_provider_identifier_type_code_37 = other_provider_identifier_type_code_37;
    }

    public String getOther_provider_identifier_state_37() {
        return other_provider_identifier_state_37;
    }

    public void setOther_provider_identifier_state_37(String other_provider_identifier_state_37) {
        this.other_provider_identifier_state_37 = other_provider_identifier_state_37;
    }

    public String getOther_provider_identifier_issuer_37() {
        return other_provider_identifier_issuer_37;
    }

    public void setOther_provider_identifier_issuer_37(String other_provider_identifier_issuer_37) {
        this.other_provider_identifier_issuer_37 = other_provider_identifier_issuer_37;
    }

    public String getOther_provider_identifier_38() {
        return other_provider_identifier_38;
    }

    public void setOther_provider_identifier_38(String other_provider_identifier_38) {
        this.other_provider_identifier_38 = other_provider_identifier_38;
    }

    public String getOther_provider_identifier_type_code_38() {
        return other_provider_identifier_type_code_38;
    }

    public void setOther_provider_identifier_type_code_38(String other_provider_identifier_type_code_38) {
        this.other_provider_identifier_type_code_38 = other_provider_identifier_type_code_38;
    }

    public String getOther_provider_identifier_state_38() {
        return other_provider_identifier_state_38;
    }

    public void setOther_provider_identifier_state_38(String other_provider_identifier_state_38) {
        this.other_provider_identifier_state_38 = other_provider_identifier_state_38;
    }

    public String getOther_provider_identifier_issuer_38() {
        return other_provider_identifier_issuer_38;
    }

    public void setOther_provider_identifier_issuer_38(String other_provider_identifier_issuer_38) {
        this.other_provider_identifier_issuer_38 = other_provider_identifier_issuer_38;
    }

    public String getOther_provider_identifier_39() {
        return other_provider_identifier_39;
    }

    public void setOther_provider_identifier_39(String other_provider_identifier_39) {
        this.other_provider_identifier_39 = other_provider_identifier_39;
    }

    public String getOther_provider_identifier_type_code_39() {
        return other_provider_identifier_type_code_39;
    }

    public void setOther_provider_identifier_type_code_39(String other_provider_identifier_type_code_39) {
        this.other_provider_identifier_type_code_39 = other_provider_identifier_type_code_39;
    }

    public String getOther_provider_identifier_state_39() {
        return other_provider_identifier_state_39;
    }

    public void setOther_provider_identifier_state_39(String other_provider_identifier_state_39) {
        this.other_provider_identifier_state_39 = other_provider_identifier_state_39;
    }

    public String getOther_provider_identifier_issuer_39() {
        return other_provider_identifier_issuer_39;
    }

    public void setOther_provider_identifier_issuer_39(String other_provider_identifier_issuer_39) {
        this.other_provider_identifier_issuer_39 = other_provider_identifier_issuer_39;
    }

    public String getOther_provider_identifier_40() {
        return other_provider_identifier_40;
    }

    public void setOther_provider_identifier_40(String other_provider_identifier_40) {
        this.other_provider_identifier_40 = other_provider_identifier_40;
    }

    public String getOther_provider_identifier_type_code_40() {
        return other_provider_identifier_type_code_40;
    }

    public void setOther_provider_identifier_type_code_40(String other_provider_identifier_type_code_40) {
        this.other_provider_identifier_type_code_40 = other_provider_identifier_type_code_40;
    }

    public String getOther_provider_identifier_state_40() {
        return other_provider_identifier_state_40;
    }

    public void setOther_provider_identifier_state_40(String other_provider_identifier_state_40) {
        this.other_provider_identifier_state_40 = other_provider_identifier_state_40;
    }

    public String getOther_provider_identifier_issuer_40() {
        return other_provider_identifier_issuer_40;
    }

    public void setOther_provider_identifier_issuer_40(String other_provider_identifier_issuer_40) {
        this.other_provider_identifier_issuer_40 = other_provider_identifier_issuer_40;
    }

    public String getOther_provider_identifier_41() {
        return other_provider_identifier_41;
    }

    public void setOther_provider_identifier_41(String other_provider_identifier_41) {
        this.other_provider_identifier_41 = other_provider_identifier_41;
    }

    public String getOther_provider_identifier_type_code_41() {
        return other_provider_identifier_type_code_41;
    }

    public void setOther_provider_identifier_type_code_41(String other_provider_identifier_type_code_41) {
        this.other_provider_identifier_type_code_41 = other_provider_identifier_type_code_41;
    }

    public String getOther_provider_identifier_state_41() {
        return other_provider_identifier_state_41;
    }

    public void setOther_provider_identifier_state_41(String other_provider_identifier_state_41) {
        this.other_provider_identifier_state_41 = other_provider_identifier_state_41;
    }

    public String getOther_provider_identifier_issuer_41() {
        return other_provider_identifier_issuer_41;
    }

    public void setOther_provider_identifier_issuer_41(String other_provider_identifier_issuer_41) {
        this.other_provider_identifier_issuer_41 = other_provider_identifier_issuer_41;
    }

    public String getOther_provider_identifier_42() {
        return other_provider_identifier_42;
    }

    public void setOther_provider_identifier_42(String other_provider_identifier_42) {
        this.other_provider_identifier_42 = other_provider_identifier_42;
    }

    public String getOther_provider_identifier_type_code_42() {
        return other_provider_identifier_type_code_42;
    }

    public void setOther_provider_identifier_type_code_42(String other_provider_identifier_type_code_42) {
        this.other_provider_identifier_type_code_42 = other_provider_identifier_type_code_42;
    }

    public String getOther_provider_identifier_state_42() {
        return other_provider_identifier_state_42;
    }

    public void setOther_provider_identifier_state_42(String other_provider_identifier_state_42) {
        this.other_provider_identifier_state_42 = other_provider_identifier_state_42;
    }

    public String getOther_provider_identifier_issuer_42() {
        return other_provider_identifier_issuer_42;
    }

    public void setOther_provider_identifier_issuer_42(String other_provider_identifier_issuer_42) {
        this.other_provider_identifier_issuer_42 = other_provider_identifier_issuer_42;
    }

    public String getOther_provider_identifier_43() {
        return other_provider_identifier_43;
    }

    public void setOther_provider_identifier_43(String other_provider_identifier_43) {
        this.other_provider_identifier_43 = other_provider_identifier_43;
    }

    public String getOther_provider_identifier_type_code_43() {
        return other_provider_identifier_type_code_43;
    }

    public void setOther_provider_identifier_type_code_43(String other_provider_identifier_type_code_43) {
        this.other_provider_identifier_type_code_43 = other_provider_identifier_type_code_43;
    }

    public String getOther_provider_identifier_state_43() {
        return other_provider_identifier_state_43;
    }

    public void setOther_provider_identifier_state_43(String other_provider_identifier_state_43) {
        this.other_provider_identifier_state_43 = other_provider_identifier_state_43;
    }

    public String getOther_provider_identifier_issuer_43() {
        return other_provider_identifier_issuer_43;
    }

    public void setOther_provider_identifier_issuer_43(String other_provider_identifier_issuer_43) {
        this.other_provider_identifier_issuer_43 = other_provider_identifier_issuer_43;
    }

    public String getOther_provider_identifier_44() {
        return other_provider_identifier_44;
    }

    public void setOther_provider_identifier_44(String other_provider_identifier_44) {
        this.other_provider_identifier_44 = other_provider_identifier_44;
    }

    public String getOther_provider_identifier_type_code_44() {
        return other_provider_identifier_type_code_44;
    }

    public void setOther_provider_identifier_type_code_44(String other_provider_identifier_type_code_44) {
        this.other_provider_identifier_type_code_44 = other_provider_identifier_type_code_44;
    }

    public String getOther_provider_identifier_state_44() {
        return other_provider_identifier_state_44;
    }

    public void setOther_provider_identifier_state_44(String other_provider_identifier_state_44) {
        this.other_provider_identifier_state_44 = other_provider_identifier_state_44;
    }

    public String getOther_provider_identifier_issuer_44() {
        return other_provider_identifier_issuer_44;
    }

    public void setOther_provider_identifier_issuer_44(String other_provider_identifier_issuer_44) {
        this.other_provider_identifier_issuer_44 = other_provider_identifier_issuer_44;
    }

    public String getOther_provider_identifier_45() {
        return other_provider_identifier_45;
    }

    public void setOther_provider_identifier_45(String other_provider_identifier_45) {
        this.other_provider_identifier_45 = other_provider_identifier_45;
    }

    public String getOther_provider_identifier_type_code_45() {
        return other_provider_identifier_type_code_45;
    }

    public void setOther_provider_identifier_type_code_45(String other_provider_identifier_type_code_45) {
        this.other_provider_identifier_type_code_45 = other_provider_identifier_type_code_45;
    }

    public String getOther_provider_identifier_state_45() {
        return other_provider_identifier_state_45;
    }

    public void setOther_provider_identifier_state_45(String other_provider_identifier_state_45) {
        this.other_provider_identifier_state_45 = other_provider_identifier_state_45;
    }

    public String getOther_provider_identifier_issuer_45() {
        return other_provider_identifier_issuer_45;
    }

    public void setOther_provider_identifier_issuer_45(String other_provider_identifier_issuer_45) {
        this.other_provider_identifier_issuer_45 = other_provider_identifier_issuer_45;
    }

    public String getOther_provider_identifier_46() {
        return other_provider_identifier_46;
    }

    public void setOther_provider_identifier_46(String other_provider_identifier_46) {
        this.other_provider_identifier_46 = other_provider_identifier_46;
    }

    public String getOther_provider_identifier_type_code_46() {
        return other_provider_identifier_type_code_46;
    }

    public void setOther_provider_identifier_type_code_46(String other_provider_identifier_type_code_46) {
        this.other_provider_identifier_type_code_46 = other_provider_identifier_type_code_46;
    }

    public String getOther_provider_identifier_state_46() {
        return other_provider_identifier_state_46;
    }

    public void setOther_provider_identifier_state_46(String other_provider_identifier_state_46) {
        this.other_provider_identifier_state_46 = other_provider_identifier_state_46;
    }

    public String getOther_provider_identifier_issuer_46() {
        return other_provider_identifier_issuer_46;
    }

    public void setOther_provider_identifier_issuer_46(String other_provider_identifier_issuer_46) {
        this.other_provider_identifier_issuer_46 = other_provider_identifier_issuer_46;
    }

    public String getOther_provider_identifier_47() {
        return other_provider_identifier_47;
    }

    public void setOther_provider_identifier_47(String other_provider_identifier_47) {
        this.other_provider_identifier_47 = other_provider_identifier_47;
    }

    public String getOther_provider_identifier_type_code_47() {
        return other_provider_identifier_type_code_47;
    }

    public void setOther_provider_identifier_type_code_47(String other_provider_identifier_type_code_47) {
        this.other_provider_identifier_type_code_47 = other_provider_identifier_type_code_47;
    }

    public String getOther_provider_identifier_state_47() {
        return other_provider_identifier_state_47;
    }

    public void setOther_provider_identifier_state_47(String other_provider_identifier_state_47) {
        this.other_provider_identifier_state_47 = other_provider_identifier_state_47;
    }

    public String getOther_provider_identifier_issuer_47() {
        return other_provider_identifier_issuer_47;
    }

    public void setOther_provider_identifier_issuer_47(String other_provider_identifier_issuer_47) {
        this.other_provider_identifier_issuer_47 = other_provider_identifier_issuer_47;
    }

    public String getOther_provider_identifier_48() {
        return other_provider_identifier_48;
    }

    public void setOther_provider_identifier_48(String other_provider_identifier_48) {
        this.other_provider_identifier_48 = other_provider_identifier_48;
    }

    public String getOther_provider_identifier_type_code_48() {
        return other_provider_identifier_type_code_48;
    }

    public void setOther_provider_identifier_type_code_48(String other_provider_identifier_type_code_48) {
        this.other_provider_identifier_type_code_48 = other_provider_identifier_type_code_48;
    }

    public String getOther_provider_identifier_state_48() {
        return other_provider_identifier_state_48;
    }

    public void setOther_provider_identifier_state_48(String other_provider_identifier_state_48) {
        this.other_provider_identifier_state_48 = other_provider_identifier_state_48;
    }

    public String getOther_provider_identifier_issuer_48() {
        return other_provider_identifier_issuer_48;
    }

    public void setOther_provider_identifier_issuer_48(String other_provider_identifier_issuer_48) {
        this.other_provider_identifier_issuer_48 = other_provider_identifier_issuer_48;
    }

    public String getOther_provider_identifier_49() {
        return other_provider_identifier_49;
    }

    public void setOther_provider_identifier_49(String other_provider_identifier_49) {
        this.other_provider_identifier_49 = other_provider_identifier_49;
    }

    public String getOther_provider_identifier_type_code_49() {
        return other_provider_identifier_type_code_49;
    }

    public void setOther_provider_identifier_type_code_49(String other_provider_identifier_type_code_49) {
        this.other_provider_identifier_type_code_49 = other_provider_identifier_type_code_49;
    }

    public String getOther_provider_identifier_state_49() {
        return other_provider_identifier_state_49;
    }

    public void setOther_provider_identifier_state_49(String other_provider_identifier_state_49) {
        this.other_provider_identifier_state_49 = other_provider_identifier_state_49;
    }

    public String getOther_provider_identifier_issuer_49() {
        return other_provider_identifier_issuer_49;
    }

    public void setOther_provider_identifier_issuer_49(String other_provider_identifier_issuer_49) {
        this.other_provider_identifier_issuer_49 = other_provider_identifier_issuer_49;
    }

    public String getOther_provider_identifier_50() {
        return other_provider_identifier_50;
    }

    public void setOther_provider_identifier_50(String other_provider_identifier_50) {
        this.other_provider_identifier_50 = other_provider_identifier_50;
    }

    public String getOther_provider_identifier_type_code_50() {
        return other_provider_identifier_type_code_50;
    }

    public void setOther_provider_identifier_type_code_50(String other_provider_identifier_type_code_50) {
        this.other_provider_identifier_type_code_50 = other_provider_identifier_type_code_50;
    }

    public String getOther_provider_identifier_state_50() {
        return other_provider_identifier_state_50;
    }

    public void setOther_provider_identifier_state_50(String other_provider_identifier_state_50) {
        this.other_provider_identifier_state_50 = other_provider_identifier_state_50;
    }

    public String getOther_provider_identifier_issuer_50() {
        return other_provider_identifier_issuer_50;
    }

    public void setOther_provider_identifier_issuer_50(String other_provider_identifier_issuer_50) {
        this.other_provider_identifier_issuer_50 = other_provider_identifier_issuer_50;
    }

    public String getIs_sole_proprietor() {
        return is_sole_proprietor;
    }

    public void setIs_sole_proprietor(String is_sole_proprietor) {
        this.is_sole_proprietor = is_sole_proprietor;
    }

    public String getIs_organization_subpart() {
        return is_organization_subpart;
    }

    public void setIs_organization_subpart(String is_organization_subpart) {
        this.is_organization_subpart = is_organization_subpart;
    }

    public String getParent_organization_lbn() {
        return parent_organization_lbn;
    }

    public void setParent_organization_lbn(String parent_organization_lbn) {
        this.parent_organization_lbn = parent_organization_lbn;
    }

    public String getParent_organization_tin() {
        return parent_organization_tin;
    }

    public void setParent_organization_tin(String parent_organization_tin) {
        this.parent_organization_tin = parent_organization_tin;
    }

    public String getAuthorized_official_name_prefix_text() {
        return authorized_official_name_prefix_text;
    }

    public void setAuthorized_official_name_prefix_text(String authorized_official_name_prefix_text) {
        this.authorized_official_name_prefix_text = authorized_official_name_prefix_text;
    }

    public String getAuthorized_official_name_suffix_text() {
        return authorized_official_name_suffix_text;
    }

    public void setAuthorized_official_name_suffix_text(String authorized_official_name_suffix_text) {
        this.authorized_official_name_suffix_text = authorized_official_name_suffix_text;
    }

    public String getAuthorized_official_credential_text() {
        return authorized_official_credential_text;
    }

    public void setAuthorized_official_credential_text(String authorized_official_credential_text) {
        this.authorized_official_credential_text = authorized_official_credential_text;
    }

    public String getHealthcare_provider_taxonomy_group_1() {
        return healthcare_provider_taxonomy_group_1;
    }

    public void setHealthcare_provider_taxonomy_group_1(String healthcare_provider_taxonomy_group_1) {
        this.healthcare_provider_taxonomy_group_1 = healthcare_provider_taxonomy_group_1;
    }

    public String getHealthcare_provider_taxonomy_group_2() {
        return healthcare_provider_taxonomy_group_2;
    }

    public void setHealthcare_provider_taxonomy_group_2(String healthcare_provider_taxonomy_group_2) {
        this.healthcare_provider_taxonomy_group_2 = healthcare_provider_taxonomy_group_2;
    }

    public String getHealthcare_provider_taxonomy_group_3() {
        return healthcare_provider_taxonomy_group_3;
    }

    public void setHealthcare_provider_taxonomy_group_3(String healthcare_provider_taxonomy_group_3) {
        this.healthcare_provider_taxonomy_group_3 = healthcare_provider_taxonomy_group_3;
    }

    public String getHealthcare_provider_taxonomy_group_4() {
        return healthcare_provider_taxonomy_group_4;
    }

    public void setHealthcare_provider_taxonomy_group_4(String healthcare_provider_taxonomy_group_4) {
        this.healthcare_provider_taxonomy_group_4 = healthcare_provider_taxonomy_group_4;
    }

    public String getHealthcare_provider_taxonomy_group_5() {
        return healthcare_provider_taxonomy_group_5;
    }

    public void setHealthcare_provider_taxonomy_group_5(String healthcare_provider_taxonomy_group_5) {
        this.healthcare_provider_taxonomy_group_5 = healthcare_provider_taxonomy_group_5;
    }

    public String getHealthcare_provider_taxonomy_group_6() {
        return healthcare_provider_taxonomy_group_6;
    }

    public void setHealthcare_provider_taxonomy_group_6(String healthcare_provider_taxonomy_group_6) {
        this.healthcare_provider_taxonomy_group_6 = healthcare_provider_taxonomy_group_6;
    }

    public String getHealthcare_provider_taxonomy_group_7() {
        return healthcare_provider_taxonomy_group_7;
    }

    public void setHealthcare_provider_taxonomy_group_7(String healthcare_provider_taxonomy_group_7) {
        this.healthcare_provider_taxonomy_group_7 = healthcare_provider_taxonomy_group_7;
    }

    public String getHealthcare_provider_taxonomy_group_8() {
        return healthcare_provider_taxonomy_group_8;
    }

    public void setHealthcare_provider_taxonomy_group_8(String healthcare_provider_taxonomy_group_8) {
        this.healthcare_provider_taxonomy_group_8 = healthcare_provider_taxonomy_group_8;
    }

    public String getHealthcare_provider_taxonomy_group_9() {
        return healthcare_provider_taxonomy_group_9;
    }

    public void setHealthcare_provider_taxonomy_group_9(String healthcare_provider_taxonomy_group_9) {
        this.healthcare_provider_taxonomy_group_9 = healthcare_provider_taxonomy_group_9;
    }

    public String getHealthcare_provider_taxonomy_group_10() {
        return healthcare_provider_taxonomy_group_10;
    }

    public void setHealthcare_provider_taxonomy_group_10(String healthcare_provider_taxonomy_group_10) {
        this.healthcare_provider_taxonomy_group_10 = healthcare_provider_taxonomy_group_10;
    }

    public String getHealthcare_provider_taxonomy_group_11() {
        return healthcare_provider_taxonomy_group_11;
    }

    public void setHealthcare_provider_taxonomy_group_11(String healthcare_provider_taxonomy_group_11) {
        this.healthcare_provider_taxonomy_group_11 = healthcare_provider_taxonomy_group_11;
    }

    public String getHealthcare_provider_taxonomy_group_12() {
        return healthcare_provider_taxonomy_group_12;
    }

    public void setHealthcare_provider_taxonomy_group_12(String healthcare_provider_taxonomy_group_12) {
        this.healthcare_provider_taxonomy_group_12 = healthcare_provider_taxonomy_group_12;
    }

    public String getHealthcare_provider_taxonomy_group_13() {
        return healthcare_provider_taxonomy_group_13;
    }

    public void setHealthcare_provider_taxonomy_group_13(String healthcare_provider_taxonomy_group_13) {
        this.healthcare_provider_taxonomy_group_13 = healthcare_provider_taxonomy_group_13;
    }

    public String getHealthcare_provider_taxonomy_group_14() {
        return healthcare_provider_taxonomy_group_14;
    }

    public void setHealthcare_provider_taxonomy_group_14(String healthcare_provider_taxonomy_group_14) {
        this.healthcare_provider_taxonomy_group_14 = healthcare_provider_taxonomy_group_14;
    }

    public String getHealthcare_provider_taxonomy_group_15() {
        return healthcare_provider_taxonomy_group_15;
    }

    public void setHealthcare_provider_taxonomy_group_15(String healthcare_provider_taxonomy_group_15) {
        this.healthcare_provider_taxonomy_group_15 = healthcare_provider_taxonomy_group_15;
    }

    public String getCertification_date() {
        return certification_date;
    }

    public void setCertification_date(String certification_date) {
        this.certification_date = certification_date;
    }

    @Override
    public String toString() {
        return "NppesNPI [npi=" + npi + ", entity_type_code=" + entity_type_code + ", replacement_npi="
                + replacement_npi + ", employer_identification_number_ein=" + employer_identification_number_ein
                + ", provider_organization_name_legal_business_name=" + provider_organization_name_legal_business_name
                + ", provider_last_name_legal_name=" + provider_last_name_legal_name + ", provider_first_name="
                + provider_first_name + ", provider_middle_name=" + provider_middle_name
                + ", provider_name_prefix_text=" + provider_name_prefix_text + ", provider_name_suffix_text="
                + provider_name_suffix_text + ", provider_credential_text=" + provider_credential_text
                + ", provider_other_organization_name=" + provider_other_organization_name
                + ", provider_other_organization_name_type_code=" + provider_other_organization_name_type_code
                + ", provider_other_last_name=" + provider_other_last_name + ", provider_other_first_name="
                + provider_other_first_name + ", provider_other_middle_name=" + provider_other_middle_name
                + ", provider_other_name_prefix_text=" + provider_other_name_prefix_text
                + ", provider_other_name_suffix_text=" + provider_other_name_suffix_text
                + ", provider_other_credential_text=" + provider_other_credential_text
                + ", provider_other_last_name_type_code=" + provider_other_last_name_type_code
                + ", provider_first_line_business_mailing_address=" + provider_first_line_business_mailing_address
                + ", provider_second_line_business_mailing_address=" + provider_second_line_business_mailing_address
                + ", provider_business_mailing_address_city_name=" + provider_business_mailing_address_city_name
                + ", provider_business_mailing_address_state_name=" + provider_business_mailing_address_state_name
                + ", provider_business_mailing_address_postal_code=" + provider_business_mailing_address_postal_code
                + ", provider_business_mailing_address_country_code_if_outside_us="
                + provider_business_mailing_address_country_code_if_outside_us
                + ", provider_business_mailing_address_telephone_number="
                + provider_business_mailing_address_telephone_number + ", provider_business_mailing_address_fax_number="
                + provider_business_mailing_address_fax_number
                + ", provider_first_line_business_practice_location_address="
                + provider_first_line_business_practice_location_address
                + ", provider_second_line_business_practice_location_address="
                + provider_second_line_business_practice_location_address
                + ", provider_business_practice_location_address_city_name="
                + provider_business_practice_location_address_city_name
                + ", provider_business_practice_location_address_state_name="
                + provider_business_practice_location_address_state_name
                + ", provider_business_practice_location_address_postal_code="
                + provider_business_practice_location_address_postal_code
                + ", provider_business_practice_location_address_country_code_if_out="
                + provider_business_practice_location_address_country_code_if_out
                + ", provider_business_practice_location_address_telephone_number="
                + provider_business_practice_location_address_telephone_number
                + ", provider_business_practice_location_address_fax_number="
                + provider_business_practice_location_address_fax_number + ", provider_enumeration_date="
                + provider_enumeration_date + ", last_update_date=" + last_update_date
                + ", npi_deactivation_reason_code=" + npi_deactivation_reason_code + ", npi_deactivation_date="
                + npi_deactivation_date + ", npi_reactivation_date=" + npi_reactivation_date + ", provider_gender_code="
                + provider_gender_code + ", authorized_official_last_name=" + authorized_official_last_name
                + ", authorized_official_first_name=" + authorized_official_first_name
                + ", authorized_official_middle_name=" + authorized_official_middle_name
                + ", authorized_official_title_or_position=" + authorized_official_title_or_position
                + ", authorized_official_telephone_number=" + authorized_official_telephone_number
                + ", healthcare_provider_taxonomy_code_1=" + healthcare_provider_taxonomy_code_1
                + ", provider_license_number_1=" + provider_license_number_1 + ", provider_license_number_state_code_1="
                + provider_license_number_state_code_1 + ", healthcare_provider_primary_taxonomy_switch_1="
                + healthcare_provider_primary_taxonomy_switch_1 + ", healthcare_provider_taxonomy_code_2="
                + healthcare_provider_taxonomy_code_2 + ", provider_license_number_2=" + provider_license_number_2
                + ", provider_license_number_state_code_2=" + provider_license_number_state_code_2
                + ", healthcare_provider_primary_taxonomy_switch_2=" + healthcare_provider_primary_taxonomy_switch_2
                + ", healthcare_provider_taxonomy_code_3=" + healthcare_provider_taxonomy_code_3
                + ", provider_license_number_3=" + provider_license_number_3 + ", provider_license_number_state_code_3="
                + provider_license_number_state_code_3 + ", healthcare_provider_primary_taxonomy_switch_3="
                + healthcare_provider_primary_taxonomy_switch_3 + ", healthcare_provider_taxonomy_code_4="
                + healthcare_provider_taxonomy_code_4 + ", provider_license_number_4=" + provider_license_number_4
                + ", provider_license_number_state_code_4=" + provider_license_number_state_code_4
                + ", healthcare_provider_primary_taxonomy_switch_4=" + healthcare_provider_primary_taxonomy_switch_4
                + ", healthcare_provider_taxonomy_code_5=" + healthcare_provider_taxonomy_code_5
                + ", provider_license_number_5=" + provider_license_number_5 + ", provider_license_number_state_code_5="
                + provider_license_number_state_code_5 + ", healthcare_provider_primary_taxonomy_switch_5="
                + healthcare_provider_primary_taxonomy_switch_5 + ", healthcare_provider_taxonomy_code_6="
                + healthcare_provider_taxonomy_code_6 + ", provider_license_number_6=" + provider_license_number_6
                + ", provider_license_number_state_code_6=" + provider_license_number_state_code_6
                + ", healthcare_provider_primary_taxonomy_switch_6=" + healthcare_provider_primary_taxonomy_switch_6
                + ", healthcare_provider_taxonomy_code_7=" + healthcare_provider_taxonomy_code_7
                + ", provider_license_number_7=" + provider_license_number_7 + ", provider_license_number_state_code_7="
                + provider_license_number_state_code_7 + ", healthcare_provider_primary_taxonomy_switch_7="
                + healthcare_provider_primary_taxonomy_switch_7 + ", healthcare_provider_taxonomy_code_8="
                + healthcare_provider_taxonomy_code_8 + ", provider_license_number_8=" + provider_license_number_8
                + ", provider_license_number_state_code_8=" + provider_license_number_state_code_8
                + ", healthcare_provider_primary_taxonomy_switch_8=" + healthcare_provider_primary_taxonomy_switch_8
                + ", healthcare_provider_taxonomy_code_9=" + healthcare_provider_taxonomy_code_9
                + ", provider_license_number_9=" + provider_license_number_9 + ", provider_license_number_state_code_9="
                + provider_license_number_state_code_9 + ", healthcare_provider_primary_taxonomy_switch_9="
                + healthcare_provider_primary_taxonomy_switch_9 + ", healthcare_provider_taxonomy_code_10="
                + healthcare_provider_taxonomy_code_10 + ", provider_license_number_10=" + provider_license_number_10
                + ", provider_license_number_state_code_10=" + provider_license_number_state_code_10
                + ", healthcare_provider_primary_taxonomy_switch_10=" + healthcare_provider_primary_taxonomy_switch_10
                + ", healthcare_provider_taxonomy_code_11=" + healthcare_provider_taxonomy_code_11
                + ", provider_license_number_11=" + provider_license_number_11
                + ", provider_license_number_state_code_11=" + provider_license_number_state_code_11
                + ", healthcare_provider_primary_taxonomy_switch_11=" + healthcare_provider_primary_taxonomy_switch_11
                + ", healthcare_provider_taxonomy_code_12=" + healthcare_provider_taxonomy_code_12
                + ", provider_license_number_12=" + provider_license_number_12
                + ", provider_license_number_state_code_12=" + provider_license_number_state_code_12
                + ", healthcare_provider_primary_taxonomy_switch_12=" + healthcare_provider_primary_taxonomy_switch_12
                + ", healthcare_provider_taxonomy_code_13=" + healthcare_provider_taxonomy_code_13
                + ", provider_license_number_13=" + provider_license_number_13
                + ", provider_license_number_state_code_13=" + provider_license_number_state_code_13
                + ", healthcare_provider_primary_taxonomy_switch_13=" + healthcare_provider_primary_taxonomy_switch_13
                + ", healthcare_provider_taxonomy_code_14=" + healthcare_provider_taxonomy_code_14
                + ", provider_license_number_14=" + provider_license_number_14
                + ", provider_license_number_state_code_14=" + provider_license_number_state_code_14
                + ", healthcare_provider_primary_taxonomy_switch_14=" + healthcare_provider_primary_taxonomy_switch_14
                + ", healthcare_provider_taxonomy_code_15=" + healthcare_provider_taxonomy_code_15
                + ", provider_license_number_15=" + provider_license_number_15
                + ", provider_license_number_state_code_15=" + provider_license_number_state_code_15
                + ", healthcare_provider_primary_taxonomy_switch_15=" + healthcare_provider_primary_taxonomy_switch_15
                + ", other_provider_identifier_1=" + other_provider_identifier_1
                + ", other_provider_identifier_type_code_1=" + other_provider_identifier_type_code_1
                + ", other_provider_identifier_state_1=" + other_provider_identifier_state_1
                + ", other_provider_identifier_issuer_1=" + other_provider_identifier_issuer_1
                + ", other_provider_identifier_2=" + other_provider_identifier_2
                + ", other_provider_identifier_type_code_2=" + other_provider_identifier_type_code_2
                + ", other_provider_identifier_state_2=" + other_provider_identifier_state_2
                + ", other_provider_identifier_issuer_2=" + other_provider_identifier_issuer_2
                + ", other_provider_identifier_3=" + other_provider_identifier_3
                + ", other_provider_identifier_type_code_3=" + other_provider_identifier_type_code_3
                + ", other_provider_identifier_state_3=" + other_provider_identifier_state_3
                + ", other_provider_identifier_issuer_3=" + other_provider_identifier_issuer_3
                + ", other_provider_identifier_4=" + other_provider_identifier_4
                + ", other_provider_identifier_type_code_4=" + other_provider_identifier_type_code_4
                + ", other_provider_identifier_state_4=" + other_provider_identifier_state_4
                + ", other_provider_identifier_issuer_4=" + other_provider_identifier_issuer_4
                + ", other_provider_identifier_5=" + other_provider_identifier_5
                + ", other_provider_identifier_type_code_5=" + other_provider_identifier_type_code_5
                + ", other_provider_identifier_state_5=" + other_provider_identifier_state_5
                + ", other_provider_identifier_issuer_5=" + other_provider_identifier_issuer_5
                + ", other_provider_identifier_6=" + other_provider_identifier_6
                + ", other_provider_identifier_type_code_6=" + other_provider_identifier_type_code_6
                + ", other_provider_identifier_state_6=" + other_provider_identifier_state_6
                + ", other_provider_identifier_issuer_6=" + other_provider_identifier_issuer_6
                + ", other_provider_identifier_7=" + other_provider_identifier_7
                + ", other_provider_identifier_type_code_7=" + other_provider_identifier_type_code_7
                + ", other_provider_identifier_state_7=" + other_provider_identifier_state_7
                + ", other_provider_identifier_issuer_7=" + other_provider_identifier_issuer_7
                + ", other_provider_identifier_8=" + other_provider_identifier_8
                + ", other_provider_identifier_type_code_8=" + other_provider_identifier_type_code_8
                + ", other_provider_identifier_state_8=" + other_provider_identifier_state_8
                + ", other_provider_identifier_issuer_8=" + other_provider_identifier_issuer_8
                + ", other_provider_identifier_9=" + other_provider_identifier_9
                + ", other_provider_identifier_type_code_9=" + other_provider_identifier_type_code_9
                + ", other_provider_identifier_state_9=" + other_provider_identifier_state_9
                + ", other_provider_identifier_issuer_9=" + other_provider_identifier_issuer_9
                + ", other_provider_identifier_10=" + other_provider_identifier_10
                + ", other_provider_identifier_type_code_10=" + other_provider_identifier_type_code_10
                + ", other_provider_identifier_state_10=" + other_provider_identifier_state_10
                + ", other_provider_identifier_issuer_10=" + other_provider_identifier_issuer_10
                + ", other_provider_identifier_11=" + other_provider_identifier_11
                + ", other_provider_identifier_type_code_11=" + other_provider_identifier_type_code_11
                + ", other_provider_identifier_state_11=" + other_provider_identifier_state_11
                + ", other_provider_identifier_issuer_11=" + other_provider_identifier_issuer_11
                + ", other_provider_identifier_12=" + other_provider_identifier_12
                + ", other_provider_identifier_type_code_12=" + other_provider_identifier_type_code_12
                + ", other_provider_identifier_state_12=" + other_provider_identifier_state_12
                + ", other_provider_identifier_issuer_12=" + other_provider_identifier_issuer_12
                + ", other_provider_identifier_13=" + other_provider_identifier_13
                + ", other_provider_identifier_type_code_13=" + other_provider_identifier_type_code_13
                + ", other_provider_identifier_state_13=" + other_provider_identifier_state_13
                + ", other_provider_identifier_issuer_13=" + other_provider_identifier_issuer_13
                + ", other_provider_identifier_14=" + other_provider_identifier_14
                + ", other_provider_identifier_type_code_14=" + other_provider_identifier_type_code_14
                + ", other_provider_identifier_state_14=" + other_provider_identifier_state_14
                + ", other_provider_identifier_issuer_14=" + other_provider_identifier_issuer_14
                + ", other_provider_identifier_15=" + other_provider_identifier_15
                + ", other_provider_identifier_type_code_15=" + other_provider_identifier_type_code_15
                + ", other_provider_identifier_state_15=" + other_provider_identifier_state_15
                + ", other_provider_identifier_issuer_15=" + other_provider_identifier_issuer_15
                + ", other_provider_identifier_16=" + other_provider_identifier_16
                + ", other_provider_identifier_type_code_16=" + other_provider_identifier_type_code_16
                + ", other_provider_identifier_state_16=" + other_provider_identifier_state_16
                + ", other_provider_identifier_issuer_16=" + other_provider_identifier_issuer_16
                + ", other_provider_identifier_17=" + other_provider_identifier_17
                + ", other_provider_identifier_type_code_17=" + other_provider_identifier_type_code_17
                + ", other_provider_identifier_state_17=" + other_provider_identifier_state_17
                + ", other_provider_identifier_issuer_17=" + other_provider_identifier_issuer_17
                + ", other_provider_identifier_18=" + other_provider_identifier_18
                + ", other_provider_identifier_type_code_18=" + other_provider_identifier_type_code_18
                + ", other_provider_identifier_state_18=" + other_provider_identifier_state_18
                + ", other_provider_identifier_issuer_18=" + other_provider_identifier_issuer_18
                + ", other_provider_identifier_19=" + other_provider_identifier_19
                + ", other_provider_identifier_type_code_19=" + other_provider_identifier_type_code_19
                + ", other_provider_identifier_state_19=" + other_provider_identifier_state_19
                + ", other_provider_identifier_issuer_19=" + other_provider_identifier_issuer_19
                + ", other_provider_identifier_20=" + other_provider_identifier_20
                + ", other_provider_identifier_type_code_20=" + other_provider_identifier_type_code_20
                + ", other_provider_identifier_state_20=" + other_provider_identifier_state_20
                + ", other_provider_identifier_issuer_20=" + other_provider_identifier_issuer_20
                + ", other_provider_identifier_21=" + other_provider_identifier_21
                + ", other_provider_identifier_type_code_21=" + other_provider_identifier_type_code_21
                + ", other_provider_identifier_state_21=" + other_provider_identifier_state_21
                + ", other_provider_identifier_issuer_21=" + other_provider_identifier_issuer_21
                + ", other_provider_identifier_22=" + other_provider_identifier_22
                + ", other_provider_identifier_type_code_22=" + other_provider_identifier_type_code_22
                + ", other_provider_identifier_state_22=" + other_provider_identifier_state_22
                + ", other_provider_identifier_issuer_22=" + other_provider_identifier_issuer_22
                + ", other_provider_identifier_23=" + other_provider_identifier_23
                + ", other_provider_identifier_type_code_23=" + other_provider_identifier_type_code_23
                + ", other_provider_identifier_state_23=" + other_provider_identifier_state_23
                + ", other_provider_identifier_issuer_23=" + other_provider_identifier_issuer_23
                + ", other_provider_identifier_24=" + other_provider_identifier_24
                + ", other_provider_identifier_type_code_24=" + other_provider_identifier_type_code_24
                + ", other_provider_identifier_state_24=" + other_provider_identifier_state_24
                + ", other_provider_identifier_issuer_24=" + other_provider_identifier_issuer_24
                + ", other_provider_identifier_25=" + other_provider_identifier_25
                + ", other_provider_identifier_type_code_25=" + other_provider_identifier_type_code_25
                + ", other_provider_identifier_state_25=" + other_provider_identifier_state_25
                + ", other_provider_identifier_issuer_25=" + other_provider_identifier_issuer_25
                + ", other_provider_identifier_26=" + other_provider_identifier_26
                + ", other_provider_identifier_type_code_26=" + other_provider_identifier_type_code_26
                + ", other_provider_identifier_state_26=" + other_provider_identifier_state_26
                + ", other_provider_identifier_issuer_26=" + other_provider_identifier_issuer_26
                + ", other_provider_identifier_27=" + other_provider_identifier_27
                + ", other_provider_identifier_type_code_27=" + other_provider_identifier_type_code_27
                + ", other_provider_identifier_state_27=" + other_provider_identifier_state_27
                + ", other_provider_identifier_issuer_27=" + other_provider_identifier_issuer_27
                + ", other_provider_identifier_28=" + other_provider_identifier_28
                + ", other_provider_identifier_type_code_28=" + other_provider_identifier_type_code_28
                + ", other_provider_identifier_state_28=" + other_provider_identifier_state_28
                + ", other_provider_identifier_issuer_28=" + other_provider_identifier_issuer_28
                + ", other_provider_identifier_29=" + other_provider_identifier_29
                + ", other_provider_identifier_type_code_29=" + other_provider_identifier_type_code_29
                + ", other_provider_identifier_state_29=" + other_provider_identifier_state_29
                + ", other_provider_identifier_issuer_29=" + other_provider_identifier_issuer_29
                + ", other_provider_identifier_30=" + other_provider_identifier_30
                + ", other_provider_identifier_type_code_30=" + other_provider_identifier_type_code_30
                + ", other_provider_identifier_state_30=" + other_provider_identifier_state_30
                + ", other_provider_identifier_issuer_30=" + other_provider_identifier_issuer_30
                + ", other_provider_identifier_31=" + other_provider_identifier_31
                + ", other_provider_identifier_type_code_31=" + other_provider_identifier_type_code_31
                + ", other_provider_identifier_state_31=" + other_provider_identifier_state_31
                + ", other_provider_identifier_issuer_31=" + other_provider_identifier_issuer_31
                + ", other_provider_identifier_32=" + other_provider_identifier_32
                + ", other_provider_identifier_type_code_32=" + other_provider_identifier_type_code_32
                + ", other_provider_identifier_state_32=" + other_provider_identifier_state_32
                + ", other_provider_identifier_issuer_32=" + other_provider_identifier_issuer_32
                + ", other_provider_identifier_33=" + other_provider_identifier_33
                + ", other_provider_identifier_type_code_33=" + other_provider_identifier_type_code_33
                + ", other_provider_identifier_state_33=" + other_provider_identifier_state_33
                + ", other_provider_identifier_issuer_33=" + other_provider_identifier_issuer_33
                + ", other_provider_identifier_34=" + other_provider_identifier_34
                + ", other_provider_identifier_type_code_34=" + other_provider_identifier_type_code_34
                + ", other_provider_identifier_state_34=" + other_provider_identifier_state_34
                + ", other_provider_identifier_issuer_34=" + other_provider_identifier_issuer_34
                + ", other_provider_identifier_35=" + other_provider_identifier_35
                + ", other_provider_identifier_type_code_35=" + other_provider_identifier_type_code_35
                + ", other_provider_identifier_state_35=" + other_provider_identifier_state_35
                + ", other_provider_identifier_issuer_35=" + other_provider_identifier_issuer_35
                + ", other_provider_identifier_36=" + other_provider_identifier_36
                + ", other_provider_identifier_type_code_36=" + other_provider_identifier_type_code_36
                + ", other_provider_identifier_state_36=" + other_provider_identifier_state_36
                + ", other_provider_identifier_issuer_36=" + other_provider_identifier_issuer_36
                + ", other_provider_identifier_37=" + other_provider_identifier_37
                + ", other_provider_identifier_type_code_37=" + other_provider_identifier_type_code_37
                + ", other_provider_identifier_state_37=" + other_provider_identifier_state_37
                + ", other_provider_identifier_issuer_37=" + other_provider_identifier_issuer_37
                + ", other_provider_identifier_38=" + other_provider_identifier_38
                + ", other_provider_identifier_type_code_38=" + other_provider_identifier_type_code_38
                + ", other_provider_identifier_state_38=" + other_provider_identifier_state_38
                + ", other_provider_identifier_issuer_38=" + other_provider_identifier_issuer_38
                + ", other_provider_identifier_39=" + other_provider_identifier_39
                + ", other_provider_identifier_type_code_39=" + other_provider_identifier_type_code_39
                + ", other_provider_identifier_state_39=" + other_provider_identifier_state_39
                + ", other_provider_identifier_issuer_39=" + other_provider_identifier_issuer_39
                + ", other_provider_identifier_40=" + other_provider_identifier_40
                + ", other_provider_identifier_type_code_40=" + other_provider_identifier_type_code_40
                + ", other_provider_identifier_state_40=" + other_provider_identifier_state_40
                + ", other_provider_identifier_issuer_40=" + other_provider_identifier_issuer_40
                + ", other_provider_identifier_41=" + other_provider_identifier_41
                + ", other_provider_identifier_type_code_41=" + other_provider_identifier_type_code_41
                + ", other_provider_identifier_state_41=" + other_provider_identifier_state_41
                + ", other_provider_identifier_issuer_41=" + other_provider_identifier_issuer_41
                + ", other_provider_identifier_42=" + other_provider_identifier_42
                + ", other_provider_identifier_type_code_42=" + other_provider_identifier_type_code_42
                + ", other_provider_identifier_state_42=" + other_provider_identifier_state_42
                + ", other_provider_identifier_issuer_42=" + other_provider_identifier_issuer_42
                + ", other_provider_identifier_43=" + other_provider_identifier_43
                + ", other_provider_identifier_type_code_43=" + other_provider_identifier_type_code_43
                + ", other_provider_identifier_state_43=" + other_provider_identifier_state_43
                + ", other_provider_identifier_issuer_43=" + other_provider_identifier_issuer_43
                + ", other_provider_identifier_44=" + other_provider_identifier_44
                + ", other_provider_identifier_type_code_44=" + other_provider_identifier_type_code_44
                + ", other_provider_identifier_state_44=" + other_provider_identifier_state_44
                + ", other_provider_identifier_issuer_44=" + other_provider_identifier_issuer_44
                + ", other_provider_identifier_45=" + other_provider_identifier_45
                + ", other_provider_identifier_type_code_45=" + other_provider_identifier_type_code_45
                + ", other_provider_identifier_state_45=" + other_provider_identifier_state_45
                + ", other_provider_identifier_issuer_45=" + other_provider_identifier_issuer_45
                + ", other_provider_identifier_46=" + other_provider_identifier_46
                + ", other_provider_identifier_type_code_46=" + other_provider_identifier_type_code_46
                + ", other_provider_identifier_state_46=" + other_provider_identifier_state_46
                + ", other_provider_identifier_issuer_46=" + other_provider_identifier_issuer_46
                + ", other_provider_identifier_47=" + other_provider_identifier_47
                + ", other_provider_identifier_type_code_47=" + other_provider_identifier_type_code_47
                + ", other_provider_identifier_state_47=" + other_provider_identifier_state_47
                + ", other_provider_identifier_issuer_47=" + other_provider_identifier_issuer_47
                + ", other_provider_identifier_48=" + other_provider_identifier_48
                + ", other_provider_identifier_type_code_48=" + other_provider_identifier_type_code_48
                + ", other_provider_identifier_state_48=" + other_provider_identifier_state_48
                + ", other_provider_identifier_issuer_48=" + other_provider_identifier_issuer_48
                + ", other_provider_identifier_49=" + other_provider_identifier_49
                + ", other_provider_identifier_type_code_49=" + other_provider_identifier_type_code_49
                + ", other_provider_identifier_state_49=" + other_provider_identifier_state_49
                + ", other_provider_identifier_issuer_49=" + other_provider_identifier_issuer_49
                + ", other_provider_identifier_50=" + other_provider_identifier_50
                + ", other_provider_identifier_type_code_50=" + other_provider_identifier_type_code_50
                + ", other_provider_identifier_state_50=" + other_provider_identifier_state_50
                + ", other_provider_identifier_issuer_50=" + other_provider_identifier_issuer_50
                + ", is_sole_proprietor=" + is_sole_proprietor + ", is_organization_subpart=" + is_organization_subpart
                + ", parent_organization_lbn=" + parent_organization_lbn + ", parent_organization_tin="
                + parent_organization_tin + ", authorized_official_name_prefix_text="
                + authorized_official_name_prefix_text + ", authorized_official_name_suffix_text="
                + authorized_official_name_suffix_text + ", authorized_official_credential_text="
                + authorized_official_credential_text + ", healthcare_provider_taxonomy_group_1="
                + healthcare_provider_taxonomy_group_1 + ", healthcare_provider_taxonomy_group_2="
                + healthcare_provider_taxonomy_group_2 + ", healthcare_provider_taxonomy_group_3="
                + healthcare_provider_taxonomy_group_3 + ", healthcare_provider_taxonomy_group_4="
                + healthcare_provider_taxonomy_group_4 + ", healthcare_provider_taxonomy_group_5="
                + healthcare_provider_taxonomy_group_5 + ", healthcare_provider_taxonomy_group_6="
                + healthcare_provider_taxonomy_group_6 + ", healthcare_provider_taxonomy_group_7="
                + healthcare_provider_taxonomy_group_7 + ", healthcare_provider_taxonomy_group_8="
                + healthcare_provider_taxonomy_group_8 + ", healthcare_provider_taxonomy_group_9="
                + healthcare_provider_taxonomy_group_9 + ", healthcare_provider_taxonomy_group_10="
                + healthcare_provider_taxonomy_group_10 + ", healthcare_provider_taxonomy_group_11="
                + healthcare_provider_taxonomy_group_11 + ", healthcare_provider_taxonomy_group_12="
                + healthcare_provider_taxonomy_group_12 + ", healthcare_provider_taxonomy_group_13="
                + healthcare_provider_taxonomy_group_13 + ", healthcare_provider_taxonomy_group_14="
                + healthcare_provider_taxonomy_group_14 + ", healthcare_provider_taxonomy_group_15="
                + healthcare_provider_taxonomy_group_15 + ", certification_date=" + certification_date + "]";
    }



}
