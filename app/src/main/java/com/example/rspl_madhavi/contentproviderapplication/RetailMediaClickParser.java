package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailMediaClickParser {

    public static RetailMediaClick parse(JSONObject jsonArticle) {
        RetailMediaClick retailMediaClick = new RetailMediaClick();

        retailMediaClick.setAD_PLAY(jsonArticle.optString("AD_PLAY"));
        retailMediaClick.setSTORE_MEDIA_ID(jsonArticle.optString("STORE_MEDIA_ID"));
        retailMediaClick.setMOBILE_NO(jsonArticle.optString("MOBILE_NO"));
        retailMediaClick.setCLICK(jsonArticle.optString("CLICK"));
        retailMediaClick.setS_FLAG(jsonArticle.optString("S_FLAG"));
        retailMediaClick.setPOS_USER(jsonArticle.optString("POS_USER"));
        retailMediaClick.setM_FLAG(jsonArticle.optString("M_FLAG"));


        return retailMediaClick;
    }
    }
