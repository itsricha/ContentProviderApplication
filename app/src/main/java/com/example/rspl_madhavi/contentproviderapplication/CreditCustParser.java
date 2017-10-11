package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 26/9/17.
 */

public class CreditCustParser {

    public static CreditCust parse(JSONObject jsonArticle) {
        CreditCust creditCust = new CreditCust();

        creditCust.setINVOICE_NO(jsonArticle.optString("INVOICE_NO"));
        creditCust.setPAYMENT_ID(jsonArticle.optString("PAYMENT_ID"));
        creditCust.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        creditCust.setNAME(jsonArticle.optString("NAME"));
        creditCust.setMOBILE_NO(jsonArticle.optString("MOBILE_NO"));
        creditCust.setGRAND_TOTAL(jsonArticle.optString("GRAND_TOTAL"));
        creditCust.setFLAG(jsonArticle.optString("FLAG"));
        creditCust.setS_FLAG (jsonArticle.optString("S_FLAG"));
        creditCust.setACTIVE(jsonArticle.optString("ACTIVE"));
        creditCust.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        creditCust.setRECEIVE_AMOUNT(jsonArticle.optString("RECEIVE_AMOUNT"));
        creditCust.setDUE_AMOUNT(jsonArticle.optString("DUE_AMOUNT"));
        creditCust.setTOTAL(jsonArticle.optString("TOTAL"));
        creditCust.setCREDIT_DATE(jsonArticle.optString("CREDIT_DATE"));
        creditCust.setPOS_USER(jsonArticle.optString("POS_USER"));
        creditCust.setM_FLAG(jsonArticle.optString("M_FLAG"));


        return creditCust;
    }
}
