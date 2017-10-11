package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class adTickerMainParser {

    public static adTickerMain parse(JSONObject jsonArticle) {
        adTickerMain adtickermain= new adTickerMain();
        adtickermain.setAD_MAIN_ID(jsonArticle.optString("AD_MAIN_ID"));
        adtickermain.setUSER(jsonArticle.optString("USER"));
        adtickermain.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        adtickermain.setAD_DESC(jsonArticle.optString("AD_DESC"));
        adtickermain.setAD_TEXT(jsonArticle.optString("AD_TEXT"));
        adtickermain.setAD_STRT_DT("AD_STRT_DT");
        adtickermain.setAD_END_DT("AD_END_DT");
        adtickermain.setSTATUS("STATUS");
        adtickermain.setLAST_MODIFIED("LAST_MODIFIED");
        adtickermain.setS_FLAG("S_FLAG");
        adtickermain.setPOS_USER("POS_USER");
        adtickermain.setM_FLAG("M_FLAG");
        adtickermain.setSLAVE_FLAG("SLAVE_FLAG");
        adtickermain.setSTORE_MEDIA_ID("STORE_MEDIA_ID");

        return adtickermain;
    }

}
