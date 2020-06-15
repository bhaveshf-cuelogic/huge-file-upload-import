package com.hhstechgroup.vyp.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", skipFirstLine = true)
public class Clia {

    @DataField(pos = 1, required = false)
    String PRVDR_CTGRY_SBTYP_CD;

    @DataField(pos = 2, required = false)
    String PRVDR_CTGRY_CD;

    @DataField(pos = 3, required = false)
    String CHOW_CNT;

    @DataField(pos = 4, required = false)
    String CHOW_DT;

    @DataField(pos = 5, required = false)
    String CITY_NAME;

    @DataField(pos = 6, required = false)
    String ACPTBL_POC_SW;

    @DataField(pos = 7, required = false)
    String CMPLNC_STUS_CD;

    @DataField(pos = 8, required = false)
    String SSA_CNTY_CD;

    @DataField(pos = 9, required = false)
    String CROSS_REF_PROVIDER_NUMBER;

    @DataField(pos = 10, required = false)
    String CRTFCTN_DT;

    @DataField(pos = 11, required = false)
    String ELGBLTY_SW;

    @DataField(pos = 12, required = false)
    String FAC_NAME;

    @DataField(pos = 13, required = false)
    String INTRMDRY_CARR_CD;

    @DataField(pos = 14, required = false)
    String MDCD_VNDR_NUM;

    @DataField(pos = 15, required = false)
    String ORGNL_PRTCPTN_DT;

    @DataField(pos = 16, required = false)
    String CHOW_PRIOR_DT;

    @DataField(pos = 17, required = false)
    String INTRMDRY_CARR_PRIOR_CD;

    @DataField(pos = 18, required = false)
    String PRVDR_NUM;

    @DataField(pos = 19, required = false)
    String RGN_CD;

    @DataField(pos = 20, required = false)
    String SKLTN_REC_SW;

    @DataField(pos = 21, required = false)
    String STATE_CD;

    @DataField(pos = 22, required = false)
    String SSA_STATE_CD;

    @DataField(pos = 23, required = false)
    String STATE_RGN_CD;

    @DataField(pos = 24, required = false)
    String ST_ADR;

    @DataField(pos = 25, required = false)
    String PHNE_NUM;

    @DataField(pos = 26, required = false)
    String PGM_TRMNTN_CD;

    @DataField(pos = 27, required = false)
    String TRMNTN_EXPRTN_DT;

    @DataField(pos = 28, required = false)
    String CRTFCTN_ACTN_TYPE_CD;

    @DataField(pos = 29, required = false)
    String GNRL_CNTL_TYPE_CD;

    @DataField(pos = 30, required = false)
    String ZIP_CD;

    @DataField(pos = 31, required = false)
    String FIPS_STATE_CD;

    @DataField(pos = 32, required = false)
    String FIPS_CNTY_CD;

    @DataField(pos = 33, required = false)
    String CBSA_URBN_RRL_IND;

    @DataField(pos = 34, required = false)
    String CBSA_CD;

    @DataField(pos = 35, required = false)
    String ADDTNL_ST_ADR;

    @DataField(pos = 36, required = false)
    String AFFILIATED_PROVIDER_NUMBER_1;

    @DataField(pos = 37, required = false)
    String AFFILIATED_PROVIDER_NUMBER_2;

    @DataField(pos = 38, required = false)
    String AFFILIATED_PROVIDER_NUMBER_3;

    @DataField(pos = 39, required = false)
    String AFFILIATED_PROVIDER_NUMBER_4;

    @DataField(pos = 40, required = false)
    String AFFILIATED_PROVIDER_NUMBER_5;

    @DataField(pos = 41, required = false)
    String AFFILIATED_PROVIDER_NUMBER_6;

    @DataField(pos = 42, required = false)
    String AFFILIATED_PROVIDER_NUMBER_7;

    @DataField(pos = 43, required = false)
    String AFFILIATED_PROVIDER_NUMBER_8;

    @DataField(pos = 44, required = false)
    String A2LA_ACRDTD_CD;

    @DataField(pos = 45, required = false)
    String A2LA_ACRDTD_Y_MATCH_DT;

    @DataField(pos = 46, required = false)
    String A2LA_ACRDTD_Y_MATCH_SW;

    @DataField(pos = 47, required = false)
    String AABB_ACRDTD_CD;

    @DataField(pos = 48, required = false)
    String AABB_ACRDTD_Y_MATCH_DT;

    @DataField(pos = 49, required = false)
    String AABB_ACRDTD_Y_MATCH_SW;

    @DataField(pos = 50, required = false)
    String AOA_ACRDTD_CD;

    @DataField(pos = 51, required = false)
    String AOA_ACRDTD_Y_MATCH_DT;

    @DataField(pos = 52, required = false)
    String AOA_ACRDTD_Y_MATCH_SW;

    @DataField(pos = 53, required = false)
    String ASHI_ACRDTD_CD;

    @DataField(pos = 54, required = false)
    String ASHI_ACRDTD_Y_MATCH_DT;

    @DataField(pos = 55, required = false)
    String ASHI_ACRDTD_Y_MATCH_SW;

    @DataField(pos = 56, required = false)
    String CAP_ACRDTD_CD;

    @DataField(pos = 57, required = false)
    String CAP_ACRDTD_Y_MATCH_DT;

    @DataField(pos = 58, required = false)
    String CAP_ACRDTD_Y_MATCH_SW;

    @DataField(pos = 59, required = false)
    String COLA_ACRDTD_CD;

    @DataField(pos = 60, required = false)
    String COLA_ACRDTD_Y_MATCH_DT;

    @DataField(pos = 61, required = false)
    String COLA_ACRDTD_Y_MATCH_SW;

    @DataField(pos = 62, required = false)
    String JCAHO_ACRDTD_CD;

    @DataField(pos = 63, required = false)
    String JCAHO_ACRDTD_Y_MATCH_DT;

    @DataField(pos = 64, required = false)
    String JCAHO_ACRDTD_Y_MATCH_SW;

    @DataField(pos = 65, required = false)
    String APLCTN_RCVD_DT;

    @DataField(pos = 66, required = false)
    String APLCTN_TYPE_CD;

    @DataField(pos = 67, required = false)
    String GNRL_FAC_TYPE_CD;

    @DataField(pos = 68, required = false)
    String CRTFCT_EFCTV_DT;

    @DataField(pos = 69, required = false)
    String CRTFCT_MAIL_DT;

    @DataField(pos = 70, required = false)
    String CRTFCT_TYPE_CD;

    @DataField(pos = 71, required = false)
    String CURRENT_CLIA_LAB_CLSFCTN_CD;

    @DataField(pos = 72, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_1;

    @DataField(pos = 73, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_10;

    @DataField(pos = 74, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_2;

    @DataField(pos = 75, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_3;

    @DataField(pos = 76, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_4;

    @DataField(pos = 77, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_5;

    @DataField(pos = 78, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_6;

    @DataField(pos = 79, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_7;

    @DataField(pos = 80, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_8;

    @DataField(pos = 81, required = false)
    String CLIA_LAB_CLASSIFICATION_CD_9;

    @DataField(pos = 82, required = false)
    String CLIA_MDCR_NUM;

    @DataField(pos = 83, required = false)
    String CLIA_TRMNTN_CD;

    @DataField(pos = 84, required = false)
    String ACRDTN_SCHDL_CD;

    @DataField(pos = 85, required = false)
    String FORM_116_ACRDTD_TEST_VOL_CNT;

    @DataField(pos = 86, required = false)
    String FORM_116_TEST_VOL_CNT;

    @DataField(pos = 87, required = false)
    String DRCTLY_AFLTD_LAB_CNT;

    @DataField(pos = 88, required = false)
    String FAX_PHNE_NUM;

    @DataField(pos = 89, required = false)
    String FY_END_MO_DAY_CD;

    @DataField(pos = 90, required = false)
    String MLT_SITE_EXCPTN_SW;

    @DataField(pos = 91, required = false)
    String HOSP_LAB_EXCPTN_SW;

    @DataField(pos = 92, required = false)
    String NON_PRFT_EXCPTN_SW;

    @DataField(pos = 93, required = false)
    String LAB_TEMP_TSTG_SITE_SW;

    @DataField(pos = 94, required = false)
    String LAB_SITE_CNT;

    @DataField(pos = 95, required = false)
    String PPMP_TEST_VOL_CNT;

    @DataField(pos = 96, required = false)
    String ADDTNL_FAC_NAME;

    @DataField(pos = 97, required = false)
    String RELATED_PROVIDER_NUMBER;

    @DataField(pos = 98, required = false)
    String SHR_LAB_SW;

    @DataField(pos = 99, required = false)
    String SHARED_LAB_XREF_NUMBER;

    @DataField(pos = 100, required = false)
    String FORM_1557_CRTFCT_SCHDL_CD;

    @DataField(pos = 101, required = false)
    String FORM_1557_CMPLNC_SCHDL_CD;

    @DataField(pos = 102, required = false)
    String FORM_1557_TEST_VOL_CNT;

    @DataField(pos = 103, required = false)
    String WVD_TEST_VOL_CNT;

    public String getPRVDR_CTGRY_SBTYP_CD() {
        return PRVDR_CTGRY_SBTYP_CD;
    }

    public void setPRVDR_CTGRY_SBTYP_CD(String pRVDR_CTGRY_SBTYP_CD) {
        PRVDR_CTGRY_SBTYP_CD = pRVDR_CTGRY_SBTYP_CD;
    }

    public String getPRVDR_CTGRY_CD() {
        return PRVDR_CTGRY_CD;
    }

    public void setPRVDR_CTGRY_CD(String pRVDR_CTGRY_CD) {
        PRVDR_CTGRY_CD = pRVDR_CTGRY_CD;
    }

    public String getCHOW_CNT() {
        return CHOW_CNT;
    }

    public void setCHOW_CNT(String cHOW_CNT) {
        CHOW_CNT = cHOW_CNT;
    }

    public String getCHOW_DT() {
        return CHOW_DT;
    }

    public void setCHOW_DT(String cHOW_DT) {
        CHOW_DT = cHOW_DT;
    }

    public String getCITY_NAME() {
        return CITY_NAME;
    }

    public void setCITY_NAME(String cITY_NAME) {
        CITY_NAME = cITY_NAME;
    }

    public String getACPTBL_POC_SW() {
        return ACPTBL_POC_SW;
    }

    public void setACPTBL_POC_SW(String aCPTBL_POC_SW) {
        ACPTBL_POC_SW = aCPTBL_POC_SW;
    }

    public String getCMPLNC_STUS_CD() {
        return CMPLNC_STUS_CD;
    }

    public void setCMPLNC_STUS_CD(String cMPLNC_STUS_CD) {
        CMPLNC_STUS_CD = cMPLNC_STUS_CD;
    }

    public String getSSA_CNTY_CD() {
        return SSA_CNTY_CD;
    }

    public void setSSA_CNTY_CD(String sSA_CNTY_CD) {
        SSA_CNTY_CD = sSA_CNTY_CD;
    }

    public String getCROSS_REF_PROVIDER_NUMBER() {
        return CROSS_REF_PROVIDER_NUMBER;
    }

    public void setCROSS_REF_PROVIDER_NUMBER(String cROSS_REF_PROVIDER_NUMBER) {
        CROSS_REF_PROVIDER_NUMBER = cROSS_REF_PROVIDER_NUMBER;
    }

    public String getCRTFCTN_DT() {
        return CRTFCTN_DT;
    }

    public void setCRTFCTN_DT(String cRTFCTN_DT) {
        CRTFCTN_DT = cRTFCTN_DT;
    }

    public String getELGBLTY_SW() {
        return ELGBLTY_SW;
    }

    public void setELGBLTY_SW(String eLGBLTY_SW) {
        ELGBLTY_SW = eLGBLTY_SW;
    }

    public String getFAC_NAME() {
        return FAC_NAME;
    }

    public void setFAC_NAME(String fAC_NAME) {
        FAC_NAME = fAC_NAME;
    }

    public String getINTRMDRY_CARR_CD() {
        return INTRMDRY_CARR_CD;
    }

    public void setINTRMDRY_CARR_CD(String iNTRMDRY_CARR_CD) {
        INTRMDRY_CARR_CD = iNTRMDRY_CARR_CD;
    }

    public String getMDCD_VNDR_NUM() {
        return MDCD_VNDR_NUM;
    }

    public void setMDCD_VNDR_NUM(String mDCD_VNDR_NUM) {
        MDCD_VNDR_NUM = mDCD_VNDR_NUM;
    }

    public String getORGNL_PRTCPTN_DT() {
        return ORGNL_PRTCPTN_DT;
    }

    public void setORGNL_PRTCPTN_DT(String oRGNL_PRTCPTN_DT) {
        ORGNL_PRTCPTN_DT = oRGNL_PRTCPTN_DT;
    }

    public String getCHOW_PRIOR_DT() {
        return CHOW_PRIOR_DT;
    }

    public void setCHOW_PRIOR_DT(String cHOW_PRIOR_DT) {
        CHOW_PRIOR_DT = cHOW_PRIOR_DT;
    }

    public String getINTRMDRY_CARR_PRIOR_CD() {
        return INTRMDRY_CARR_PRIOR_CD;
    }

    public void setINTRMDRY_CARR_PRIOR_CD(String iNTRMDRY_CARR_PRIOR_CD) {
        INTRMDRY_CARR_PRIOR_CD = iNTRMDRY_CARR_PRIOR_CD;
    }

    public String getPRVDR_NUM() {
        return PRVDR_NUM;
    }

    public void setPRVDR_NUM(String pRVDR_NUM) {
        PRVDR_NUM = pRVDR_NUM;
    }

    public String getRGN_CD() {
        return RGN_CD;
    }

    public void setRGN_CD(String rGN_CD) {
        RGN_CD = rGN_CD;
    }

    public String getSKLTN_REC_SW() {
        return SKLTN_REC_SW;
    }

    public void setSKLTN_REC_SW(String sKLTN_REC_SW) {
        SKLTN_REC_SW = sKLTN_REC_SW;
    }

    public String getSTATE_CD() {
        return STATE_CD;
    }

    public void setSTATE_CD(String sTATE_CD) {
        STATE_CD = sTATE_CD;
    }

    public String getSSA_STATE_CD() {
        return SSA_STATE_CD;
    }

    public void setSSA_STATE_CD(String sSA_STATE_CD) {
        SSA_STATE_CD = sSA_STATE_CD;
    }

    public String getSTATE_RGN_CD() {
        return STATE_RGN_CD;
    }

    public void setSTATE_RGN_CD(String sTATE_RGN_CD) {
        STATE_RGN_CD = sTATE_RGN_CD;
    }

    public String getST_ADR() {
        return ST_ADR;
    }

    public void setST_ADR(String sT_ADR) {
        ST_ADR = sT_ADR;
    }

    public String getPHNE_NUM() {
        return PHNE_NUM;
    }

    public void setPHNE_NUM(String pHNE_NUM) {
        PHNE_NUM = pHNE_NUM;
    }

    public String getPGM_TRMNTN_CD() {
        return PGM_TRMNTN_CD;
    }

    public void setPGM_TRMNTN_CD(String pGM_TRMNTN_CD) {
        PGM_TRMNTN_CD = pGM_TRMNTN_CD;
    }

    public String getTRMNTN_EXPRTN_DT() {
        return TRMNTN_EXPRTN_DT;
    }

    public void setTRMNTN_EXPRTN_DT(String tRMNTN_EXPRTN_DT) {
        TRMNTN_EXPRTN_DT = tRMNTN_EXPRTN_DT;
    }

    public String getCRTFCTN_ACTN_TYPE_CD() {
        return CRTFCTN_ACTN_TYPE_CD;
    }

    public void setCRTFCTN_ACTN_TYPE_CD(String cRTFCTN_ACTN_TYPE_CD) {
        CRTFCTN_ACTN_TYPE_CD = cRTFCTN_ACTN_TYPE_CD;
    }

    public String getGNRL_CNTL_TYPE_CD() {
        return GNRL_CNTL_TYPE_CD;
    }

    public void setGNRL_CNTL_TYPE_CD(String gNRL_CNTL_TYPE_CD) {
        GNRL_CNTL_TYPE_CD = gNRL_CNTL_TYPE_CD;
    }

    public String getZIP_CD() {
        return ZIP_CD;
    }

    public void setZIP_CD(String zIP_CD) {
        ZIP_CD = zIP_CD;
    }

    public String getFIPS_STATE_CD() {
        return FIPS_STATE_CD;
    }

    public void setFIPS_STATE_CD(String fIPS_STATE_CD) {
        FIPS_STATE_CD = fIPS_STATE_CD;
    }

    public String getFIPS_CNTY_CD() {
        return FIPS_CNTY_CD;
    }

    public void setFIPS_CNTY_CD(String fIPS_CNTY_CD) {
        FIPS_CNTY_CD = fIPS_CNTY_CD;
    }

    public String getCBSA_URBN_RRL_IND() {
        return CBSA_URBN_RRL_IND;
    }

    public void setCBSA_URBN_RRL_IND(String cBSA_URBN_RRL_IND) {
        CBSA_URBN_RRL_IND = cBSA_URBN_RRL_IND;
    }

    public String getCBSA_CD() {
        return CBSA_CD;
    }

    public void setCBSA_CD(String cBSA_CD) {
        CBSA_CD = cBSA_CD;
    }

    public String getADDTNL_ST_ADR() {
        return ADDTNL_ST_ADR;
    }

    public void setADDTNL_ST_ADR(String aDDTNL_ST_ADR) {
        ADDTNL_ST_ADR = aDDTNL_ST_ADR;
    }

    public String getAFFILIATED_PROVIDER_NUMBER_1() {
        return AFFILIATED_PROVIDER_NUMBER_1;
    }

    public void setAFFILIATED_PROVIDER_NUMBER_1(String aFFILIATED_PROVIDER_NUMBER_1) {
        AFFILIATED_PROVIDER_NUMBER_1 = aFFILIATED_PROVIDER_NUMBER_1;
    }

    public String getAFFILIATED_PROVIDER_NUMBER_2() {
        return AFFILIATED_PROVIDER_NUMBER_2;
    }

    public void setAFFILIATED_PROVIDER_NUMBER_2(String aFFILIATED_PROVIDER_NUMBER_2) {
        AFFILIATED_PROVIDER_NUMBER_2 = aFFILIATED_PROVIDER_NUMBER_2;
    }

    public String getAFFILIATED_PROVIDER_NUMBER_3() {
        return AFFILIATED_PROVIDER_NUMBER_3;
    }

    public void setAFFILIATED_PROVIDER_NUMBER_3(String aFFILIATED_PROVIDER_NUMBER_3) {
        AFFILIATED_PROVIDER_NUMBER_3 = aFFILIATED_PROVIDER_NUMBER_3;
    }

    public String getAFFILIATED_PROVIDER_NUMBER_4() {
        return AFFILIATED_PROVIDER_NUMBER_4;
    }

    public void setAFFILIATED_PROVIDER_NUMBER_4(String aFFILIATED_PROVIDER_NUMBER_4) {
        AFFILIATED_PROVIDER_NUMBER_4 = aFFILIATED_PROVIDER_NUMBER_4;
    }

    public String getAFFILIATED_PROVIDER_NUMBER_5() {
        return AFFILIATED_PROVIDER_NUMBER_5;
    }

    public void setAFFILIATED_PROVIDER_NUMBER_5(String aFFILIATED_PROVIDER_NUMBER_5) {
        AFFILIATED_PROVIDER_NUMBER_5 = aFFILIATED_PROVIDER_NUMBER_5;
    }

    public String getAFFILIATED_PROVIDER_NUMBER_6() {
        return AFFILIATED_PROVIDER_NUMBER_6;
    }

    public void setAFFILIATED_PROVIDER_NUMBER_6(String aFFILIATED_PROVIDER_NUMBER_6) {
        AFFILIATED_PROVIDER_NUMBER_6 = aFFILIATED_PROVIDER_NUMBER_6;
    }

    public String getAFFILIATED_PROVIDER_NUMBER_7() {
        return AFFILIATED_PROVIDER_NUMBER_7;
    }

    public void setAFFILIATED_PROVIDER_NUMBER_7(String aFFILIATED_PROVIDER_NUMBER_7) {
        AFFILIATED_PROVIDER_NUMBER_7 = aFFILIATED_PROVIDER_NUMBER_7;
    }

    public String getAFFILIATED_PROVIDER_NUMBER_8() {
        return AFFILIATED_PROVIDER_NUMBER_8;
    }

    public void setAFFILIATED_PROVIDER_NUMBER_8(String aFFILIATED_PROVIDER_NUMBER_8) {
        AFFILIATED_PROVIDER_NUMBER_8 = aFFILIATED_PROVIDER_NUMBER_8;
    }

    public String getA2LA_ACRDTD_CD() {
        return A2LA_ACRDTD_CD;
    }

    public void setA2LA_ACRDTD_CD(String a2la_ACRDTD_CD) {
        A2LA_ACRDTD_CD = a2la_ACRDTD_CD;
    }

    public String getA2LA_ACRDTD_Y_MATCH_DT() {
        return A2LA_ACRDTD_Y_MATCH_DT;
    }

    public void setA2LA_ACRDTD_Y_MATCH_DT(String a2la_ACRDTD_Y_MATCH_DT) {
        A2LA_ACRDTD_Y_MATCH_DT = a2la_ACRDTD_Y_MATCH_DT;
    }

    public String getA2LA_ACRDTD_Y_MATCH_SW() {
        return A2LA_ACRDTD_Y_MATCH_SW;
    }

    public void setA2LA_ACRDTD_Y_MATCH_SW(String a2la_ACRDTD_Y_MATCH_SW) {
        A2LA_ACRDTD_Y_MATCH_SW = a2la_ACRDTD_Y_MATCH_SW;
    }

    public String getAABB_ACRDTD_CD() {
        return AABB_ACRDTD_CD;
    }

    public void setAABB_ACRDTD_CD(String aABB_ACRDTD_CD) {
        AABB_ACRDTD_CD = aABB_ACRDTD_CD;
    }

    public String getAABB_ACRDTD_Y_MATCH_DT() {
        return AABB_ACRDTD_Y_MATCH_DT;
    }

    public void setAABB_ACRDTD_Y_MATCH_DT(String aABB_ACRDTD_Y_MATCH_DT) {
        AABB_ACRDTD_Y_MATCH_DT = aABB_ACRDTD_Y_MATCH_DT;
    }

    public String getAABB_ACRDTD_Y_MATCH_SW() {
        return AABB_ACRDTD_Y_MATCH_SW;
    }

    public void setAABB_ACRDTD_Y_MATCH_SW(String aABB_ACRDTD_Y_MATCH_SW) {
        AABB_ACRDTD_Y_MATCH_SW = aABB_ACRDTD_Y_MATCH_SW;
    }

    public String getAOA_ACRDTD_CD() {
        return AOA_ACRDTD_CD;
    }

    public void setAOA_ACRDTD_CD(String aOA_ACRDTD_CD) {
        AOA_ACRDTD_CD = aOA_ACRDTD_CD;
    }

    public String getAOA_ACRDTD_Y_MATCH_DT() {
        return AOA_ACRDTD_Y_MATCH_DT;
    }

    public void setAOA_ACRDTD_Y_MATCH_DT(String aOA_ACRDTD_Y_MATCH_DT) {
        AOA_ACRDTD_Y_MATCH_DT = aOA_ACRDTD_Y_MATCH_DT;
    }

    public String getAOA_ACRDTD_Y_MATCH_SW() {
        return AOA_ACRDTD_Y_MATCH_SW;
    }

    public void setAOA_ACRDTD_Y_MATCH_SW(String aOA_ACRDTD_Y_MATCH_SW) {
        AOA_ACRDTD_Y_MATCH_SW = aOA_ACRDTD_Y_MATCH_SW;
    }

    public String getASHI_ACRDTD_CD() {
        return ASHI_ACRDTD_CD;
    }

    public void setASHI_ACRDTD_CD(String aSHI_ACRDTD_CD) {
        ASHI_ACRDTD_CD = aSHI_ACRDTD_CD;
    }

    public String getASHI_ACRDTD_Y_MATCH_DT() {
        return ASHI_ACRDTD_Y_MATCH_DT;
    }

    public void setASHI_ACRDTD_Y_MATCH_DT(String aSHI_ACRDTD_Y_MATCH_DT) {
        ASHI_ACRDTD_Y_MATCH_DT = aSHI_ACRDTD_Y_MATCH_DT;
    }

    public String getASHI_ACRDTD_Y_MATCH_SW() {
        return ASHI_ACRDTD_Y_MATCH_SW;
    }

    public void setASHI_ACRDTD_Y_MATCH_SW(String aSHI_ACRDTD_Y_MATCH_SW) {
        ASHI_ACRDTD_Y_MATCH_SW = aSHI_ACRDTD_Y_MATCH_SW;
    }

    public String getCAP_ACRDTD_CD() {
        return CAP_ACRDTD_CD;
    }

    public void setCAP_ACRDTD_CD(String cAP_ACRDTD_CD) {
        CAP_ACRDTD_CD = cAP_ACRDTD_CD;
    }

    public String getCAP_ACRDTD_Y_MATCH_DT() {
        return CAP_ACRDTD_Y_MATCH_DT;
    }

    public void setCAP_ACRDTD_Y_MATCH_DT(String cAP_ACRDTD_Y_MATCH_DT) {
        CAP_ACRDTD_Y_MATCH_DT = cAP_ACRDTD_Y_MATCH_DT;
    }

    public String getCAP_ACRDTD_Y_MATCH_SW() {
        return CAP_ACRDTD_Y_MATCH_SW;
    }

    public void setCAP_ACRDTD_Y_MATCH_SW(String cAP_ACRDTD_Y_MATCH_SW) {
        CAP_ACRDTD_Y_MATCH_SW = cAP_ACRDTD_Y_MATCH_SW;
    }

    public String getCOLA_ACRDTD_CD() {
        return COLA_ACRDTD_CD;
    }

    public void setCOLA_ACRDTD_CD(String cOLA_ACRDTD_CD) {
        COLA_ACRDTD_CD = cOLA_ACRDTD_CD;
    }

    public String getCOLA_ACRDTD_Y_MATCH_DT() {
        return COLA_ACRDTD_Y_MATCH_DT;
    }

    public void setCOLA_ACRDTD_Y_MATCH_DT(String cOLA_ACRDTD_Y_MATCH_DT) {
        COLA_ACRDTD_Y_MATCH_DT = cOLA_ACRDTD_Y_MATCH_DT;
    }

    public String getCOLA_ACRDTD_Y_MATCH_SW() {
        return COLA_ACRDTD_Y_MATCH_SW;
    }

    public void setCOLA_ACRDTD_Y_MATCH_SW(String cOLA_ACRDTD_Y_MATCH_SW) {
        COLA_ACRDTD_Y_MATCH_SW = cOLA_ACRDTD_Y_MATCH_SW;
    }

    public String getJCAHO_ACRDTD_CD() {
        return JCAHO_ACRDTD_CD;
    }

    public void setJCAHO_ACRDTD_CD(String jCAHO_ACRDTD_CD) {
        JCAHO_ACRDTD_CD = jCAHO_ACRDTD_CD;
    }

    public String getJCAHO_ACRDTD_Y_MATCH_DT() {
        return JCAHO_ACRDTD_Y_MATCH_DT;
    }

    public void setJCAHO_ACRDTD_Y_MATCH_DT(String jCAHO_ACRDTD_Y_MATCH_DT) {
        JCAHO_ACRDTD_Y_MATCH_DT = jCAHO_ACRDTD_Y_MATCH_DT;
    }

    public String getJCAHO_ACRDTD_Y_MATCH_SW() {
        return JCAHO_ACRDTD_Y_MATCH_SW;
    }

    public void setJCAHO_ACRDTD_Y_MATCH_SW(String jCAHO_ACRDTD_Y_MATCH_SW) {
        JCAHO_ACRDTD_Y_MATCH_SW = jCAHO_ACRDTD_Y_MATCH_SW;
    }

    public String getAPLCTN_RCVD_DT() {
        return APLCTN_RCVD_DT;
    }

    public void setAPLCTN_RCVD_DT(String aPLCTN_RCVD_DT) {
        APLCTN_RCVD_DT = aPLCTN_RCVD_DT;
    }

    public String getAPLCTN_TYPE_CD() {
        return APLCTN_TYPE_CD;
    }

    public void setAPLCTN_TYPE_CD(String aPLCTN_TYPE_CD) {
        APLCTN_TYPE_CD = aPLCTN_TYPE_CD;
    }

    public String getGNRL_FAC_TYPE_CD() {
        return GNRL_FAC_TYPE_CD;
    }

    public void setGNRL_FAC_TYPE_CD(String gNRL_FAC_TYPE_CD) {
        GNRL_FAC_TYPE_CD = gNRL_FAC_TYPE_CD;
    }

    public String getCRTFCT_EFCTV_DT() {
        return CRTFCT_EFCTV_DT;
    }

    public void setCRTFCT_EFCTV_DT(String cRTFCT_EFCTV_DT) {
        CRTFCT_EFCTV_DT = cRTFCT_EFCTV_DT;
    }

    public String getCRTFCT_MAIL_DT() {
        return CRTFCT_MAIL_DT;
    }

    public void setCRTFCT_MAIL_DT(String cRTFCT_MAIL_DT) {
        CRTFCT_MAIL_DT = cRTFCT_MAIL_DT;
    }

    public String getCRTFCT_TYPE_CD() {
        return CRTFCT_TYPE_CD;
    }

    public void setCRTFCT_TYPE_CD(String cRTFCT_TYPE_CD) {
        CRTFCT_TYPE_CD = cRTFCT_TYPE_CD;
    }

    public String getCURRENT_CLIA_LAB_CLSFCTN_CD() {
        return CURRENT_CLIA_LAB_CLSFCTN_CD;
    }

    public void setCURRENT_CLIA_LAB_CLSFCTN_CD(String cURRENT_CLIA_LAB_CLSFCTN_CD) {
        CURRENT_CLIA_LAB_CLSFCTN_CD = cURRENT_CLIA_LAB_CLSFCTN_CD;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_1() {
        return CLIA_LAB_CLASSIFICATION_CD_1;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_1(String cLIA_LAB_CLASSIFICATION_CD_1) {
        CLIA_LAB_CLASSIFICATION_CD_1 = cLIA_LAB_CLASSIFICATION_CD_1;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_10() {
        return CLIA_LAB_CLASSIFICATION_CD_10;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_10(String cLIA_LAB_CLASSIFICATION_CD_10) {
        CLIA_LAB_CLASSIFICATION_CD_10 = cLIA_LAB_CLASSIFICATION_CD_10;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_2() {
        return CLIA_LAB_CLASSIFICATION_CD_2;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_2(String cLIA_LAB_CLASSIFICATION_CD_2) {
        CLIA_LAB_CLASSIFICATION_CD_2 = cLIA_LAB_CLASSIFICATION_CD_2;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_3() {
        return CLIA_LAB_CLASSIFICATION_CD_3;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_3(String cLIA_LAB_CLASSIFICATION_CD_3) {
        CLIA_LAB_CLASSIFICATION_CD_3 = cLIA_LAB_CLASSIFICATION_CD_3;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_4() {
        return CLIA_LAB_CLASSIFICATION_CD_4;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_4(String cLIA_LAB_CLASSIFICATION_CD_4) {
        CLIA_LAB_CLASSIFICATION_CD_4 = cLIA_LAB_CLASSIFICATION_CD_4;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_5() {
        return CLIA_LAB_CLASSIFICATION_CD_5;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_5(String cLIA_LAB_CLASSIFICATION_CD_5) {
        CLIA_LAB_CLASSIFICATION_CD_5 = cLIA_LAB_CLASSIFICATION_CD_5;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_6() {
        return CLIA_LAB_CLASSIFICATION_CD_6;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_6(String cLIA_LAB_CLASSIFICATION_CD_6) {
        CLIA_LAB_CLASSIFICATION_CD_6 = cLIA_LAB_CLASSIFICATION_CD_6;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_7() {
        return CLIA_LAB_CLASSIFICATION_CD_7;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_7(String cLIA_LAB_CLASSIFICATION_CD_7) {
        CLIA_LAB_CLASSIFICATION_CD_7 = cLIA_LAB_CLASSIFICATION_CD_7;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_8() {
        return CLIA_LAB_CLASSIFICATION_CD_8;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_8(String cLIA_LAB_CLASSIFICATION_CD_8) {
        CLIA_LAB_CLASSIFICATION_CD_8 = cLIA_LAB_CLASSIFICATION_CD_8;
    }

    public String getCLIA_LAB_CLASSIFICATION_CD_9() {
        return CLIA_LAB_CLASSIFICATION_CD_9;
    }

    public void setCLIA_LAB_CLASSIFICATION_CD_9(String cLIA_LAB_CLASSIFICATION_CD_9) {
        CLIA_LAB_CLASSIFICATION_CD_9 = cLIA_LAB_CLASSIFICATION_CD_9;
    }

    public String getCLIA_MDCR_NUM() {
        return CLIA_MDCR_NUM;
    }

    public void setCLIA_MDCR_NUM(String cLIA_MDCR_NUM) {
        CLIA_MDCR_NUM = cLIA_MDCR_NUM;
    }

    public String getCLIA_TRMNTN_CD() {
        return CLIA_TRMNTN_CD;
    }

    public void setCLIA_TRMNTN_CD(String cLIA_TRMNTN_CD) {
        CLIA_TRMNTN_CD = cLIA_TRMNTN_CD;
    }

    public String getACRDTN_SCHDL_CD() {
        return ACRDTN_SCHDL_CD;
    }

    public void setACRDTN_SCHDL_CD(String aCRDTN_SCHDL_CD) {
        ACRDTN_SCHDL_CD = aCRDTN_SCHDL_CD;
    }

    public String getFORM_116_ACRDTD_TEST_VOL_CNT() {
        return FORM_116_ACRDTD_TEST_VOL_CNT;
    }

    public void setFORM_116_ACRDTD_TEST_VOL_CNT(String fORM_116_ACRDTD_TEST_VOL_CNT) {
        FORM_116_ACRDTD_TEST_VOL_CNT = fORM_116_ACRDTD_TEST_VOL_CNT;
    }

    public String getFORM_116_TEST_VOL_CNT() {
        return FORM_116_TEST_VOL_CNT;
    }

    public void setFORM_116_TEST_VOL_CNT(String fORM_116_TEST_VOL_CNT) {
        FORM_116_TEST_VOL_CNT = fORM_116_TEST_VOL_CNT;
    }

    public String getDRCTLY_AFLTD_LAB_CNT() {
        return DRCTLY_AFLTD_LAB_CNT;
    }

    public void setDRCTLY_AFLTD_LAB_CNT(String dRCTLY_AFLTD_LAB_CNT) {
        DRCTLY_AFLTD_LAB_CNT = dRCTLY_AFLTD_LAB_CNT;
    }

    public String getFAX_PHNE_NUM() {
        return FAX_PHNE_NUM;
    }

    public void setFAX_PHNE_NUM(String fAX_PHNE_NUM) {
        FAX_PHNE_NUM = fAX_PHNE_NUM;
    }

    public String getFY_END_MO_DAY_CD() {
        return FY_END_MO_DAY_CD;
    }

    public void setFY_END_MO_DAY_CD(String fY_END_MO_DAY_CD) {
        FY_END_MO_DAY_CD = fY_END_MO_DAY_CD;
    }

    public String getMLT_SITE_EXCPTN_SW() {
        return MLT_SITE_EXCPTN_SW;
    }

    public void setMLT_SITE_EXCPTN_SW(String mLT_SITE_EXCPTN_SW) {
        MLT_SITE_EXCPTN_SW = mLT_SITE_EXCPTN_SW;
    }

    public String getHOSP_LAB_EXCPTN_SW() {
        return HOSP_LAB_EXCPTN_SW;
    }

    public void setHOSP_LAB_EXCPTN_SW(String hOSP_LAB_EXCPTN_SW) {
        HOSP_LAB_EXCPTN_SW = hOSP_LAB_EXCPTN_SW;
    }

    public String getNON_PRFT_EXCPTN_SW() {
        return NON_PRFT_EXCPTN_SW;
    }

    public void setNON_PRFT_EXCPTN_SW(String nON_PRFT_EXCPTN_SW) {
        NON_PRFT_EXCPTN_SW = nON_PRFT_EXCPTN_SW;
    }

    public String getLAB_TEMP_TSTG_SITE_SW() {
        return LAB_TEMP_TSTG_SITE_SW;
    }

    public void setLAB_TEMP_TSTG_SITE_SW(String lAB_TEMP_TSTG_SITE_SW) {
        LAB_TEMP_TSTG_SITE_SW = lAB_TEMP_TSTG_SITE_SW;
    }

    public String getLAB_SITE_CNT() {
        return LAB_SITE_CNT;
    }

    public void setLAB_SITE_CNT(String lAB_SITE_CNT) {
        LAB_SITE_CNT = lAB_SITE_CNT;
    }

    public String getPPMP_TEST_VOL_CNT() {
        return PPMP_TEST_VOL_CNT;
    }

    public void setPPMP_TEST_VOL_CNT(String pPMP_TEST_VOL_CNT) {
        PPMP_TEST_VOL_CNT = pPMP_TEST_VOL_CNT;
    }

    public String getADDTNL_FAC_NAME() {
        return ADDTNL_FAC_NAME;
    }

    public void setADDTNL_FAC_NAME(String aDDTNL_FAC_NAME) {
        ADDTNL_FAC_NAME = aDDTNL_FAC_NAME;
    }

    public String getRELATED_PROVIDER_NUMBER() {
        return RELATED_PROVIDER_NUMBER;
    }

    public void setRELATED_PROVIDER_NUMBER(String rELATED_PROVIDER_NUMBER) {
        RELATED_PROVIDER_NUMBER = rELATED_PROVIDER_NUMBER;
    }

    public String getSHR_LAB_SW() {
        return SHR_LAB_SW;
    }

    public void setSHR_LAB_SW(String sHR_LAB_SW) {
        SHR_LAB_SW = sHR_LAB_SW;
    }

    public String getSHARED_LAB_XREF_NUMBER() {
        return SHARED_LAB_XREF_NUMBER;
    }

    public void setSHARED_LAB_XREF_NUMBER(String sHARED_LAB_XREF_NUMBER) {
        SHARED_LAB_XREF_NUMBER = sHARED_LAB_XREF_NUMBER;
    }

    public String getFORM_1557_CRTFCT_SCHDL_CD() {
        return FORM_1557_CRTFCT_SCHDL_CD;
    }

    public void setFORM_1557_CRTFCT_SCHDL_CD(String fORM_1557_CRTFCT_SCHDL_CD) {
        FORM_1557_CRTFCT_SCHDL_CD = fORM_1557_CRTFCT_SCHDL_CD;
    }

    public String getFORM_1557_CMPLNC_SCHDL_CD() {
        return FORM_1557_CMPLNC_SCHDL_CD;
    }

    public void setFORM_1557_CMPLNC_SCHDL_CD(String fORM_1557_CMPLNC_SCHDL_CD) {
        FORM_1557_CMPLNC_SCHDL_CD = fORM_1557_CMPLNC_SCHDL_CD;
    }

    public String getFORM_1557_TEST_VOL_CNT() {
        return FORM_1557_TEST_VOL_CNT;
    }

    public void setFORM_1557_TEST_VOL_CNT(String fORM_1557_TEST_VOL_CNT) {
        FORM_1557_TEST_VOL_CNT = fORM_1557_TEST_VOL_CNT;
    }

    public String getWVD_TEST_VOL_CNT() {
        return WVD_TEST_VOL_CNT;
    }

    public void setWVD_TEST_VOL_CNT(String wVD_TEST_VOL_CNT) {
        WVD_TEST_VOL_CNT = wVD_TEST_VOL_CNT;
    }

}
