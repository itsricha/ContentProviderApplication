package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailBillDisplayParser {

    public static RetailBillDisplay parse(JSONObject jsonArticle) {
        RetailBillDisplay retailBillDisplay = new RetailBillDisplay();

        retailBillDisplay.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailBillDisplay.setTOTAL_BILL_VALUE(jsonArticle.optString("TOTAL_BILL_VALUE"));
        retailBillDisplay.setDISCOUNT(jsonArticle.optString("DISCOUNT"));
        retailBillDisplay.setNET_BILL_PAYABLE(jsonArticle.optString("NET_BILL_PAYABLE"));
        retailBillDisplay.setAMOUNT_RECEIVED(jsonArticle.optString("AMOUNT_RECEIVED"));
        retailBillDisplay.setAMOUNT_PAID_BACK(jsonArticle.optString("AMOUNT_PAID_BACK"));
        retailBillDisplay.setFOOTER(jsonArticle.optString("FOOTER"));
        retailBillDisplay.setS_FLAG(jsonArticle.optString("S_FLAG"));
        retailBillDisplay.setPOS_USER(jsonArticle.optString("POS_USER"));
        retailBillDisplay.setM_FLAG(jsonArticle.optString("M_FLAG"));


        return retailBillDisplay;
    }
    }
