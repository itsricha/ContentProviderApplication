package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class AdStoreMainMailParser {

    public static AdStoreMainMail parse(JSONObject jsonArticle) {
        AdStoreMainMail adStoreMainMail= new AdStoreMainMail();
        adStoreMainMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        adStoreMainMail.setAD_MAIN_ID(jsonArticle.optString("AD_MAIN_ID"));
        adStoreMainMail.setAD_DESC(jsonArticle.optString("AD_DESC"));
        adStoreMainMail.setAD_CST_SLB1("AD_CST_SLB1");
        adStoreMainMail.setAD_CST_SLB2("AD_CST_SLB2");
        adStoreMainMail.setAD_CST_SLB3("AD_CST_SLB3");
        adStoreMainMail.setSTATUS("STATUS");
        adStoreMainMail.setACTIVE("ACTIVE");
        adStoreMainMail.setPOS_USER("POS_USER");
        adStoreMainMail.setFLAG("FLAG");
        adStoreMainMail.setS_FLAG("S_FLAG");
        adStoreMainMail.setM_FLAG("M_FLAG");
        adStoreMainMail.setSLAVE_FLAG("SLAVE_FLAG");

        return adStoreMainMail;
    }

}
