package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class StrPoMasterParser {

    public static StrPoMaster parse(JSONObject jsonArticle) {
        StrPoMaster strPoMaster = new StrPoMaster();
        strPoMaster.setPO_NO(jsonArticle.optString("PO_NO"));
        strPoMaster.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        strPoMaster.setPO_DATE(jsonArticle.optString("PO_DATE"));
        strPoMaster.setGRAND_TOTAL(jsonArticle.optString("GRAND_TOTAL"));
        strPoMaster.setVENDOR_NM(jsonArticle.optString("VENDOR_NM"));
        strPoMaster.setPO_NO1(jsonArticle.optString("PO_NO1"));
        strPoMaster.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        strPoMaster.setPAY_TO_NAME(jsonArticle.optString("PAY_TO_NAME"));
        strPoMaster.setPAY_TO_NAME2(jsonArticle.optString("PAY_TO_NAME2"));
        strPoMaster.setPAY_TO_ADDRESS(jsonArticle.optString("PAY_TO_ADDRESS"));
        strPoMaster.setPAY_TO_ADDRESS2(jsonArticle.optString("PAY_TO_ADDRESS2"));
        strPoMaster.setPAY_TO_CITY(jsonArticle.optString("PAY_TO_CITY"));
        strPoMaster.setPAY_TO_CONTACT(jsonArticle.optString("PAY_TO_CONTACT"));
        strPoMaster.setTRI_ID(jsonArticle.optString("TRI_ID"));
        strPoMaster.setYOUR_REFERENCE(jsonArticle.optString("YOUR_REFERENCE"));
        strPoMaster.setSHIP_TO_CODE(jsonArticle.optString("SHIP_TO_CODE"));
        strPoMaster.setSHIP_TO_NAME(jsonArticle.optString("SHIP_TO_NAME"));
        strPoMaster.setSHIP_TO_NAME2(jsonArticle.optString("SHIP_TO_NAME2"));
        strPoMaster.setSHIP_TO_ADDRESS(jsonArticle.optString("SHIP_TO_ADDRESS"));
        strPoMaster.setSHIP_TO_ADDRESS2(jsonArticle.optString("SHIP_TO_ADDRESS2"));
        strPoMaster.setSHIP_TO_CITY(jsonArticle.optString("SHIP_TO_CITY"));
        strPoMaster.setSHIP_TO_CONTACT(jsonArticle.optString("SHIP_TO_CONTACT"));
        strPoMaster.setORDER_DATE(jsonArticle.optString("ORDER_DATE"));
        strPoMaster.setPOSTING_DATE(jsonArticle.optString("POSTING_DATE"));
        strPoMaster.setEXPECTED_RECEIPT_DATE(jsonArticle.optString("EXPECTED_RECEIPT_DATE"));
        strPoMaster.setVAT_REGISTRATION_NO(jsonArticle.optString("VAT_REGISTRATION_NO"));
        strPoMaster.setFLAG(jsonArticle.optString("FLAG"));
        strPoMaster.setCREATED_BY(jsonArticle.optString("CREATED_BY"));
        strPoMaster.setCREATED_ON(jsonArticle.optString("CREATED_ON"));
        strPoMaster.setS_FLAG(jsonArticle.optString("S_FLAG"));
        strPoMaster.setPOS_USER(jsonArticle.optString("POS_USER"));
        strPoMaster.setPURCHASEDATE(jsonArticle.optString("PURCHASEDATE"));
        strPoMaster.setM_FLAG(jsonArticle.optString("M_FLAG"));

        return strPoMaster;

    }
}












