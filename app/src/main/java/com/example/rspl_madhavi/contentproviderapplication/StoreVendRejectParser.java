package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class StoreVendRejectParser {

    public static StoreVendReject parse(JSONObject jsonArticle) {
        StoreVendReject storeVendReject = new StoreVendReject();
        storeVendReject.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        storeVendReject.setID(jsonArticle.optString("ID"));
        storeVendReject.setREASON_FOR_REJECTION(jsonArticle.optString("REASON_FOR_REJECTION"));
        storeVendReject.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        storeVendReject.setS_FLAG(jsonArticle.optString("S_FLAG"));
        storeVendReject.setACTIVE(jsonArticle.optString("ACTIVE"));
        storeVendReject.setPOS_USER(jsonArticle.optString("POS_USER"));
        storeVendReject.setM_FLAG(jsonArticle.optString("M_FLAG"));
        storeVendReject.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));
        return storeVendReject;

    }
}












