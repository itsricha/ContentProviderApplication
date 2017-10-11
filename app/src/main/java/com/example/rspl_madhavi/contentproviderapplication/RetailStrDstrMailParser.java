package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 19/7/17.
 */

public class RetailStrDstrMailParser {

    public static RetailStrDstrMail parse(JSONObject jsonArticle) {
        RetailStrDstrMail retailStrDstrMail = new RetailStrDstrMail();

        retailStrDstrMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        retailStrDstrMail.setDSTR_NM(jsonArticle.optString("DSTR_NM"));
        retailStrDstrMail.setS_FLAG (jsonArticle.optString("S_FLAG"));
        retailStrDstrMail.setACTIVE (jsonArticle.optString("ACTIVE"));
        retailStrDstrMail.setPOS_USER (jsonArticle.optString("POS_USER"));
        retailStrDstrMail.setFLAG (jsonArticle.optString("FLAG"));


        return retailStrDstrMail;
    }
}
