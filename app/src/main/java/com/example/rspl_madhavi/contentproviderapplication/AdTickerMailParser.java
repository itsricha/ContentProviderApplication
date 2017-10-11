package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class AdTickerMailParser {

    public static AdTickerMail parse(JSONObject jsonArticle) {

        AdTickerMail adTickerMail= new AdTickerMail();
        adTickerMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        adTickerMail.setAD_MAIN_ID(jsonArticle.optString("AD_MAIN_ID"));
        adTickerMail.setAD_TEXT(jsonArticle.optString("AD_TEXT"));
        adTickerMail.setAD_CST_SLB1(jsonArticle.optString("AD_CST_SLB1"));
        adTickerMail.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        adTickerMail.setPOS_USER("POS_USER");
        adTickerMail.setFLAG("FLAG");
        adTickerMail.setSLAVE_FLAG("S_FLAG");
        adTickerMail.setM_FLAG("M_FLAG");
        adTickerMail.setSLAVE_FLAG("SLAVE_FLAG");

        return adTickerMail;
    }

}