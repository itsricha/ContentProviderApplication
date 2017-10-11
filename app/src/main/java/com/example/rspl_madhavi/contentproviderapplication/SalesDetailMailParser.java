package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 19/7/17.
 */

public class SalesDetailMailParser {
    public static SalesDetailMail parse(JSONObject jsonArticle) {
        SalesDetailMail salesDetailMail = new SalesDetailMail();

        salesDetailMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        salesDetailMail.setTRI_ID(jsonArticle.optString("TRI_ID"));
        salesDetailMail.setPROD_NM(jsonArticle.optString("PROD_NM"));
        salesDetailMail.setTOTAL(jsonArticle.optString("TOTAL"));
        salesDetailMail.setQTY(jsonArticle.optString("QTY"));
        salesDetailMail.setEXP_DATE(jsonArticle.optString("EXP_DATE"));
        salesDetailMail.setPOS_USER(jsonArticle.optString("POS_USER"));
        salesDetailMail.setFLAG(jsonArticle.optString("FLAG"));
        salesDetailMail.setS_FLAG(jsonArticle.optString("S_FLAG"));
        salesDetailMail.setM_FLAG(jsonArticle.optString("M_FLAG"));
        salesDetailMail.setUOM(jsonArticle.optString("UOM"));
        salesDetailMail.setS_PRICE(jsonArticle.optString("S_PRICE"));
        salesDetailMail.setORDER_TYPE(jsonArticle.optString("ORDER_TYPE"));
        salesDetailMail.setPICK_UP_LOCATION(jsonArticle.optString("PICK_UP_LOCATION"));

        return salesDetailMail;

    }
}
