package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 18/7/17.
 */

public class RetailCustParser {


    public static RetailCust parse(JSONObject jsonArticle) {
        RetailCust retailCust = new RetailCust();

        retailCust.setCUST_ID(jsonArticle.optString("CUST_ID"));
        retailCust.setNAME(jsonArticle.optString("NAME"));
        retailCust.setE_MAIL(jsonArticle.optString("E_MAIL"));
        retailCust.setMOBILE_NO(jsonArticle.optString("MOBILE_NO"));
        retailCust.setPASSWORD(jsonArticle.optString("PASSWORD"));
        retailCust.setCREDIT_CUST (jsonArticle.optString("CREDIT_CUST"));
        retailCust.setPOS_USER (jsonArticle.optString("POS_USER"));
        retailCust.setSTORE_ID (jsonArticle.optString("STORE_ID"));
        retailCust.setS_FLAG (jsonArticle.optString("S_FLAG"));
        retailCust.setM_FLAG (jsonArticle.optString("M_FLAG"));



        return retailCust;
    }
}
