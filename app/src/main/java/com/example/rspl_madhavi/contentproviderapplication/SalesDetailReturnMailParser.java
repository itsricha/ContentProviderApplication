package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 17/7/17.
 */

public class SalesDetailReturnMailParser {

    public static SalesDetailReturnMail parse(JSONObject jsonArticle) {
        SalesDetailReturnMail salesDetailReturnMail = new SalesDetailReturnMail();

        salesDetailReturnMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        salesDetailReturnMail.setTRI_ID(jsonArticle.optString("TRI_ID"));
        salesDetailReturnMail.setPROD_NM(jsonArticle.optString("PROD_NM"));
        salesDetailReturnMail.setTOTAL (jsonArticle.optString("TOTAL"));
        salesDetailReturnMail.setQTY(jsonArticle.optString("QTY"));
        salesDetailReturnMail.setSALE_DATE (jsonArticle.optString("SALE_DATE"));
        salesDetailReturnMail.setPOS_USER (jsonArticle.optString("POS_USER"));
        salesDetailReturnMail.setFLAG (jsonArticle.optString("FLAG"));
        salesDetailReturnMail.setS_FLAG (jsonArticle.optString("S_FLAG"));
        salesDetailReturnMail.setM_FLAG (jsonArticle.optString("M_FLAG"));
        salesDetailReturnMail.setDISCOUNT_PERCENT (jsonArticle.optString("DISCOUNT_PERCENT"));


        return salesDetailReturnMail;
    }
}
