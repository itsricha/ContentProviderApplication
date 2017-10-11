package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 17/7/17.
 */

public class RetailCardDefineParser {

    public static RetailCardDefine parse(JSONObject jsonArticle) {
        RetailCardDefine retailCardDefine = new RetailCardDefine();

        retailCardDefine.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailCardDefine.setID(jsonArticle.optString("ID"));
        retailCardDefine.setUSER(jsonArticle.optString("USER"));
        retailCardDefine.setCARD_TYPE (jsonArticle.optString("CARD_TYPE"));
        retailCardDefine.setPOINTS_RANGE(jsonArticle.optString("POINTS_RANGE"));
        retailCardDefine.setS_FLAG (jsonArticle.optString("S_FLAG"));
        retailCardDefine.setPOS_USER (jsonArticle.optString("POS_USER"));
        retailCardDefine.setM_FLAG (jsonArticle.optString("M_FLAG"));

        return retailCardDefine;
    }
}
