package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;


public class StoreProdCpgMailParser {

    public static StoreProdCpgMail parse(JSONObject jsonArticle) {
        StoreProdCpgMail storeProdCpgMail = new StoreProdCpgMail();
        storeProdCpgMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        storeProdCpgMail.setPROD_NM(jsonArticle.optString("PROD_NM"));
        storeProdCpgMail.setACTIVE(jsonArticle.optString("ACTIVE"));
        storeProdCpgMail.setPOS_USER(jsonArticle.optString("POS_USER"));
        storeProdCpgMail.setFLAG(jsonArticle.optString("FLAG"));
        storeProdCpgMail.setS_FLAG(jsonArticle.optString("S_FLAG"));
        storeProdCpgMail.setM_FLAG(jsonArticle.optString("M_FLAG"));
        storeProdCpgMail.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        storeProdCpgMail.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));

        return storeProdCpgMail;
    }
}