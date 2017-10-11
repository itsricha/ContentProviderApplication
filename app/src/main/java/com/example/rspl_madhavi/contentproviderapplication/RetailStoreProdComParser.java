package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 31/8/17.
 */

public class RetailStoreProdComParser {

    public static RetailStoreProdCom parse(JSONObject jsonArticle) {
        RetailStoreProdCom retailStoreProdCom = new RetailStoreProdCom();

        retailStoreProdCom.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailStoreProdCom.setDSTR_NM(jsonArticle.optString("DSTR_NM"));
        retailStoreProdCom.setIND_NM(jsonArticle.optString("IND_NM"));
        retailStoreProdCom.setACTIVE(jsonArticle.optString("ACTIVE"));
        retailStoreProdCom.setS_PRICE(jsonArticle.optString("S_PRICE"));
        retailStoreProdCom.setP_PRICE(jsonArticle.optString("P_PRICE"));
        retailStoreProdCom.setDISCOUNT_PERCENT(jsonArticle.optString("DISCOUNT_PERCENT"));
        retailStoreProdCom.setDISCOUNT_PERCENT_AMOUNT(jsonArticle.optString("DISCOUNT_PERCENT_AMOUNT"));
        retailStoreProdCom.setBARCODE(jsonArticle.optString("BARCODE"));
        retailStoreProdCom.setMRP(jsonArticle.optString("MRP"));
        retailStoreProdCom.setINTERNET_PRICE(jsonArticle.optString("INTERNET_PRICE"));
        retailStoreProdCom.setIS_PROD_REL_INT(jsonArticle.optString("IS_PROD_REL_INT"));
        retailStoreProdCom.setPOS_USER(jsonArticle.optString("POS_USER"));
        retailStoreProdCom.setSELLING_ORDER_UNIT(jsonArticle.optString("SELLING_ORDER_UNIT"));
        retailStoreProdCom.setS_FLAG(jsonArticle.optString("S_FLAG"));
        retailStoreProdCom.setM_FLAG(jsonArticle.optString("M_FLAG"));
        retailStoreProdCom.setPROD_NM(jsonArticle.optString("PROD_NM"));
        retailStoreProdCom.setPROD_ID(jsonArticle.optString("PROD_ID"));
        retailStoreProdCom.setPROFIT_MARGIN(jsonArticle.optString("PROFIT_MARGIN"));

        return retailStoreProdCom;
    }
}