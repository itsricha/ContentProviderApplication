package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 19/7/17.
 */

public class StorePoDetailMailParser {

    public static StorePoDetailMail parse(JSONObject jsonArticle) {
        StorePoDetailMail storePoDetailMail = new StorePoDetailMail();

        storePoDetailMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        storePoDetailMail.setPO_NO(jsonArticle.optString("PO_NO"));
        storePoDetailMail.setVENDOR_NM(jsonArticle.optString("VENDOR_NM"));
        storePoDetailMail.setTOTAL (jsonArticle.optString("TOTAL"));
        storePoDetailMail.setQTY(jsonArticle.optString("QTY"));
        storePoDetailMail.setUOM(jsonArticle.optString("UOM"));
        storePoDetailMail.setP_PRICE (jsonArticle.optString("P_PRICE"));
        storePoDetailMail.setPOS_USER (jsonArticle.optString("POS_USER"));
        storePoDetailMail.setFLAG (jsonArticle.optString("FLAG"));
        storePoDetailMail.setS_FLAG (jsonArticle.optString("S_FLAG"));
        storePoDetailMail.setPROD_NM(jsonArticle.optString("PROD_NM"));


        return storePoDetailMail;
    }
}
