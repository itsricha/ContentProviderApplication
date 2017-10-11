package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 13/7/17.
 */

public class RetailStoredecimalParser {

    public static RetailStoreDecimal parse(JSONObject jsonArticle) {
        RetailStoreDecimal retailStoreDecimal=new RetailStoreDecimal();

        retailStoreDecimal.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailStoreDecimal.setMRP_DECIMAL(jsonArticle.optString("MRP_DECIMAL"));
        retailStoreDecimal.setP_PRICE_DECIMAL(jsonArticle.optString("P_PRICE_DECIMAL"));
        retailStoreDecimal.setS_PRICE_DECIMAL(jsonArticle.optString("S_PRICE_DECIMAL"));
        retailStoreDecimal.setHOLD_PO(jsonArticle.optString("HOLD_PO"));
        retailStoreDecimal.setHOLD_INV(jsonArticle.optString("HOLD_INV"));
        retailStoreDecimal.setHOLD_SALES(jsonArticle.optString("HOLD_SALES"));
        retailStoreDecimal.setS_FLAG (jsonArticle.optString("S_FLAG"));
        retailStoreDecimal.setROUND_OFF (jsonArticle.optString("ROUND_OFF"));
        retailStoreDecimal.setSALES_HOLD_NO(jsonArticle.optString("SALES_HOLD_NO"));
        retailStoreDecimal.setPURCHASE_HOLD_NO (jsonArticle.optString("PURCHASE_HOLD_NO"));
        retailStoreDecimal.setINV_HOLD_NO(jsonArticle.optString("INV_HOLD_NO"));
        retailStoreDecimal.setM_FLAG(jsonArticle.optString("M_FLAG"));
        retailStoreDecimal.setPOS_USER(jsonArticle.optString("POS_USER"));


        return retailStoreDecimal;
    }
}
