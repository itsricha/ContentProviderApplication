package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 19/7/17.
 */

public class RetailStrProdMailParser {
    public static RetailStrProdMail parse(JSONObject jsonArticle) {
        RetailStrProdMail retailStrProdMail = new RetailStrProdMail();

        retailStrProdMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        retailStrProdMail.setPROD_NM(jsonArticle.optString("PROD_NM"));
        retailStrProdMail.setACTIVE(jsonArticle.optString("ACTIVE"));
        retailStrProdMail.setBARCODE(jsonArticle.optString("BARCODE"));
        retailStrProdMail.setMRP(jsonArticle.optString("MRP"));
        retailStrProdMail.setPOS_USER(jsonArticle.optString("POS_USER"));
        retailStrProdMail.setFLAG(jsonArticle.optString("FLAG"));
        retailStrProdMail.setS_FLAG(jsonArticle.optString("S_FLAG"));
        retailStrProdMail.setP_PRICE(jsonArticle.optString("P_PRICE"));
        retailStrProdMail.setS_PRICE(jsonArticle.optString("S_PRICE"));


        return retailStrProdMail;

    }
}
