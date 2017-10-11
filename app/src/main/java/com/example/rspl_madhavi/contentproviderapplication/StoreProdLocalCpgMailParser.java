package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;


public class StoreProdLocalCpgMailParser {

    public static StoreProdLocalCpgMail parse(JSONObject jsonArticle) {
        StoreProdLocalCpgMail storeProdLocalCpgMail = new StoreProdLocalCpgMail();
        storeProdLocalCpgMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        storeProdLocalCpgMail.setPROD_NM(jsonArticle.optString("PROD_NM"));
        storeProdLocalCpgMail.setACTIVE(jsonArticle.optString("ACTIVE"));
        storeProdLocalCpgMail.setPOS_USER(jsonArticle.optString("POS_USER"));
        storeProdLocalCpgMail.setFLAG(jsonArticle.optString("FLAG"));
        storeProdLocalCpgMail.setS_FLAG(jsonArticle.optString("S_FLAG"));
        storeProdLocalCpgMail.setM_FLAG(jsonArticle.optString("M_FLAG"));
        storeProdLocalCpgMail.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        storeProdLocalCpgMail.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));

        return storeProdLocalCpgMail;
    }
}