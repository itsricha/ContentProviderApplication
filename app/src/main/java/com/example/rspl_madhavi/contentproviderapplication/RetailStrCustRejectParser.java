package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailStrCustRejectParser {

    public static RetailStoreCustReject parse(JSONObject jsonArticle) {
        RetailStoreCustReject retailStoreCustReject = new RetailStoreCustReject();

        retailStoreCustReject.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailStoreCustReject.setID(jsonArticle.optString("ID"));
        retailStoreCustReject.setREASON_FOR_REJECTION (jsonArticle.optString("REASON_FOR_REJECTION"));
        retailStoreCustReject.setS_FLAG (jsonArticle.optString("S_FLAG"));
        retailStoreCustReject.setACTIVE (jsonArticle.optString("ACTIVE"));
        retailStoreCustReject.setPOS_USER (jsonArticle.optString("POS_USER"));
        retailStoreCustReject.setM_FLAG (jsonArticle.optString("M_FLAG"));

        return retailStoreCustReject;
    }
}
