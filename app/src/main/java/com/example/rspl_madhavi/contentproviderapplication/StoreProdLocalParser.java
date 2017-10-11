package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class StoreProdLocalParser {

    public static StoreProdLocal parse(JSONObject jsonArticle) {
        StoreProdLocal storeProdLocal = new StoreProdLocal();
        storeProdLocal.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        storeProdLocal.setPROD_ID(jsonArticle.optString("PROD_ID"));
        storeProdLocal.setPROD_NM(jsonArticle.optString("PROD_NM"));
        storeProdLocal.setBARCODE(jsonArticle.optString("BARCODE"));
        storeProdLocal.setMRP(jsonArticle.optString("MRP"));
        storeProdLocal.setS_PRICE(jsonArticle.optString("S_PRICE"));
        storeProdLocal.setP_PRICE(jsonArticle.optString("P_PRICE"));
        storeProdLocal.setTAX_ID(jsonArticle.optString("TAX_ID"));
        storeProdLocal.setINTERNET_PRICE(jsonArticle.optString("INTERNET_PRICE"));
        storeProdLocal.setIS_PROD_REL_INT(jsonArticle.optString("IS_PROD_REL_INT"));
        storeProdLocal.setACTIVE(jsonArticle.optString("ACTIVE"));
        storeProdLocal.setCONV_FACT(jsonArticle.optString("CONV_FACT"));
        storeProdLocal.setPROFIT_MARGIN(jsonArticle.optString("PROFIT_MARGIN"));
        storeProdLocal.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        storeProdLocal.setS_FLAG(jsonArticle.optString("S_FLAG"));
        storeProdLocal.setIND_NM(jsonArticle.optString("IND_NM"));
        storeProdLocal.setPOS_USER(jsonArticle.optString("POS_USER"));
        storeProdLocal.setM_FLAG(jsonArticle.optString("M_FLAG"));
        storeProdLocal.setPURCHASE_UNIT_CONV(jsonArticle.optString("PURCHASE_UNIT_CONV"));
        storeProdLocal.setDISCOUNT_PERCENT(jsonArticle.optString("DISCOUNT_PERCENT"));
        storeProdLocal.setSELLING_ORDER_UNIT(jsonArticle.optString("SELLING_ORDER_UNIT"));

        return storeProdLocal;

    }
}












