package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 19/7/17.
 */

public class RetailStrVendorMailParser {
    public static RetailStrVendorMail parse(JSONObject jsonArticle) {
        RetailStrVendorMail retailStrVendorMail = new RetailStrVendorMail();

        retailStrVendorMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        retailStrVendorMail.setVEND_NM(jsonArticle.optString("VEND_NM"));
        retailStrVendorMail.setS_FLAG (jsonArticle.optString("S_FLAG"));
        retailStrVendorMail.setACTIVE (jsonArticle.optString("ACTIVE"));
        retailStrVendorMail.setPOS_USER (jsonArticle.optString("POS_USER"));
        retailStrVendorMail.setFLAG (jsonArticle.optString("FLAG"));


        return retailStrVendorMail;
    }
}
