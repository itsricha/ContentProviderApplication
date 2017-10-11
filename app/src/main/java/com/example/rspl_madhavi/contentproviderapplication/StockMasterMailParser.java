package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 17/7/17.
 */

public class StockMasterMailParser {

    public static StockMasterMail parse(JSONObject jsonArticle) {
        StockMasterMail stockMasterMail = new StockMasterMail();


        stockMasterMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        stockMasterMail.setPROD_ID(jsonArticle.optString("PROD_ID"));
        stockMasterMail.setPROD_NM(jsonArticle.optString("PROD_NM"));
        stockMasterMail.setBATCH_NO(jsonArticle.optString("BATCH_NO"));
        stockMasterMail.setQTY(jsonArticle.optString("QTY"));
        stockMasterMail.setEXP_DATE(jsonArticle.optString("EXP_DATE"));
        stockMasterMail.setPOS_USER(jsonArticle.optString("POS_USER"));
        stockMasterMail.setFLAG(jsonArticle.optString("FLAG"));
        stockMasterMail.setS_FLAG(jsonArticle.optString("S_FLAG"));
        stockMasterMail.setM_FLAG(jsonArticle.optString("M_FLAG"));

        return stockMasterMail;

    }
}
