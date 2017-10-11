package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailStrBillLvlDiscParser {

    public static RetailStrBillLvlDisc parse(JSONObject jsonArticle) {
        RetailStrBillLvlDisc retailStrBillLvlDisc = new RetailStrBillLvlDisc();

        retailStrBillLvlDisc.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailStrBillLvlDisc.setBILL_LVL_NAME(jsonArticle.optString("BILL_LVL_NAME"));
        retailStrBillLvlDisc.setDISC_TYPE (jsonArticle.optString("DISC_TYPE"));
        retailStrBillLvlDisc.setS_FLAG (jsonArticle.optString("S_FLAG"));
        retailStrBillLvlDisc.setACTIVE (jsonArticle.optString("ACTIVE"));
        retailStrBillLvlDisc.setPOS_USER (jsonArticle.optString("POS_USER"));
        retailStrBillLvlDisc.setM_FLAG (jsonArticle.optString("M_FLAG"));

        return retailStrBillLvlDisc;
    }
}
