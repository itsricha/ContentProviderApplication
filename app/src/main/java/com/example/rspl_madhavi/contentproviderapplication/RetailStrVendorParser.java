package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 6/10/17.
 */

public class RetailStrVendorParser {
    public static RetailStrVendor parse(JSONObject jsonArticle) {
        RetailStrVendor retailStrVendor = new RetailStrVendor();

        retailStrVendor.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailStrVendor.setVEND_ID(jsonArticle.optString("VEND_ID")) ;
        retailStrVendor.setVEND_NM(jsonArticle.optString("VEND_NM")) ;
        retailStrVendor.setVEND_CNTCT_NM(jsonArticle.optString("VEND_CNTCT_NM")); ;
        retailStrVendor.setADD_1(jsonArticle.optString("ADD_1"));
        retailStrVendor.setCITY(jsonArticle.optString("CITY"));
        retailStrVendor.setCTR_DESC(jsonArticle.optString("CTR_DESC"));
        retailStrVendor.setZIP(jsonArticle.optString("ZIP"));
        retailStrVendor.setTELE(jsonArticle.optString("TELE"));
        retailStrVendor.setMOBILE(jsonArticle.optString("MOBILE"));
        retailStrVendor.setEMAIL(jsonArticle.optString("EMAIL")); ;
        retailStrVendor.setVEND_INV(jsonArticle.optString("VEND_INV"));
        retailStrVendor.setACTIVE(jsonArticle.optString("ACTIVE")); ;
        retailStrVendor.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED")); ;
        retailStrVendor.setS_FLAG(jsonArticle.optString("S_FLAG")); ;
        retailStrVendor.setPOS_USER(jsonArticle.optString("POS_USER"));
        retailStrVendor.setM_FLAG(jsonArticle.optString("M_FLAG"));
        retailStrVendor.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));


        return retailStrVendor;
    }
}
