package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;


public class StoreProdLocalMailParser {

    public static StoreProdLocalMail parse(JSONObject jsonArticle) {
        StoreProdLocalMail storeProdLocalMail = new StoreProdLocalMail();
        storeProdLocalMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        storeProdLocalMail.setPROD_NM(jsonArticle.optString("PROD_NM"));
        storeProdLocalMail.setACTIVE(jsonArticle.optString("ACTIVE"));
        storeProdLocalMail.setBARCODE(jsonArticle.optString("BARCODE"));
        storeProdLocalMail.setMRP(jsonArticle.optString("MRP"));
        storeProdLocalMail.setP_PRICE(jsonArticle.optString("P_PRICE"));
        storeProdLocalMail.setS_PRICE(jsonArticle.optString("S_PRICE"));
        storeProdLocalMail.setPOS_USER(jsonArticle.optString("POS_USER"));
        storeProdLocalMail.setFLAG(jsonArticle.optString("FLAG"));
        storeProdLocalMail.setS_FLAG(jsonArticle.optString("S_FLAG"));
        storeProdLocalMail.setM_FLAG(jsonArticle.optString("M_FLAG"));
        storeProdLocalMail.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        storeProdLocalMail.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));

        return storeProdLocalMail;
    }
}