package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class AdBlinkinglogoMailParser {

    public static AdBlinkinglogoMail parse(JSONObject jsonArticle) {
        AdBlinkinglogoMail adBlinkinglogoMail= new AdBlinkinglogoMail();
        adBlinkinglogoMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        adBlinkinglogoMail.setAD_MAIN_ID(jsonArticle.optString("AD_MAIN_ID"));
        adBlinkinglogoMail.setAD_DESC(jsonArticle.optString("AD_DESC"));
        adBlinkinglogoMail.setAD_STRT_DT(jsonArticle.optString("AD_STRT_DT"));
        adBlinkinglogoMail.setAD_END_DT(jsonArticle.optString("AD_END_DT"));
        adBlinkinglogoMail.setAD_CST_SLB1("AD_CST_SLB1");
        adBlinkinglogoMail.setAD_CST_SLB2("AD_CST_SLB2");
        adBlinkinglogoMail.setAD_CST_SLB3("AD_CST_SLB3");
        adBlinkinglogoMail.setLAST_MODIFIED("LAST_MODIFIED");
        adBlinkinglogoMail.setPOS_USER("POS_USER");
        adBlinkinglogoMail.setFLAG("FLAG");
        adBlinkinglogoMail.setSLAVE_FLAG("S_FLAG");
        adBlinkinglogoMail.setM_FLAG("M_FLAG");
        adBlinkinglogoMail.setSLAVE_FLAG("SLAVE_FLAG");

        return adBlinkinglogoMail;
    }

}
