package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 18/7/17.
 */

public class DayOpenCloseParser {

    public static DayOpenClose parse(JSONObject jsonArticle) {
        DayOpenClose dayOpenClose = new DayOpenClose();

        dayOpenClose.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        dayOpenClose.setTRI_ID(jsonArticle.optString("TRI_ID"));
        dayOpenClose.setBUSINESS_DATE(jsonArticle.optString("BUSINESS_DATE"));
        dayOpenClose.setSTART_DATE (jsonArticle.optString("START_DATE"));
        dayOpenClose.setSTART_CASH(jsonArticle.optString("START_CASH"));
        dayOpenClose.setCBCASH_ONHAND (jsonArticle.optString("CBCASH_ONHAND"));
        dayOpenClose.setSTART_TIME(jsonArticle.optString("START_TIME"));
        dayOpenClose.setSTART_USER_ID (jsonArticle.optString("START_USER_ID"));
        dayOpenClose.setOPCASH_ONHAND (jsonArticle.optString("OPCASH_ONHAND"));
        dayOpenClose.setOP_CUR (jsonArticle.optString("OP_CUR"));
        dayOpenClose.setEND_DATE(jsonArticle.optString("END_DATE"));
        dayOpenClose.setEND_TIME (jsonArticle.optString("END_TIME"));
        dayOpenClose.setEND_USER_ID (jsonArticle.optString("END_USER_ID"));
        dayOpenClose.setCB_CUR (jsonArticle.optString("CB_CUR"));
        dayOpenClose.setSTATUS (jsonArticle.optString("STATUS"));
        dayOpenClose.setREMARKS (jsonArticle.optString("REMARKS"));
        dayOpenClose.setPOS_USER (jsonArticle.optString("POS_USER"));
        dayOpenClose.setFLAG (jsonArticle.optString("FLAG"));
        dayOpenClose.setS_FLAG (jsonArticle.optString("S_FLAG"));
        dayOpenClose.setM_FLAG (jsonArticle.optString("M_FLAG"));




        return dayOpenClose;
    }

}
