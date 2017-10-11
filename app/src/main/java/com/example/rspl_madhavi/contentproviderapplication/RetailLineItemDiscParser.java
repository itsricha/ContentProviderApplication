package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailLineItemDiscParser {

    public static RetailLineItemDisc parse(JSONObject jsonArticle) {
        RetailLineItemDisc retailLineItemDisc = new RetailLineItemDisc();


        retailLineItemDisc.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailLineItemDisc.setLINE_ITEM_NM(jsonArticle.optString("LINE_ITEM_NM"));
        retailLineItemDisc.setLINE_ITEM_DISC(jsonArticle.optString("LINE_ITEM_DISC"));
        retailLineItemDisc.setLINE_ITEM_ID(jsonArticle.optString("LINE_ITEM_ID"));
        retailLineItemDisc.setS_FLAG (jsonArticle.optString("S_FLAG"));
        retailLineItemDisc.setACTIVE (jsonArticle.optString("ACTIVE"));
        retailLineItemDisc.setPOS_USER (jsonArticle.optString("POS_USER"));
        retailLineItemDisc.setM_FLAG (jsonArticle.optString("M_FLAG"));


        return retailLineItemDisc;
    }
}
