package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class StoreProdCpgParser {

    public static StoreProdCpg parse(JSONObject jsonArticle) {
        StoreProdCpg storeProd = new StoreProdCpg();
        storeProd.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        storeProd.setPROD_ID(jsonArticle.optString("PROD_ID"));
        storeProd.setPROD_NAME(jsonArticle.optString("PROD_NM"));
        storeProd.setBARCODE(jsonArticle.optString("BARCODE"));
        storeProd.setMRP(jsonArticle.optString("MRP"));
        storeProd.setS_PRICE(jsonArticle.optString("S_PRICE"));
        storeProd.setP_PRICE(jsonArticle.optString("P_PRICE"));
        storeProd.setTAX_DESC(jsonArticle.optString("TAX_DESC"));
        storeProd.setPROD_HIER_DESC_3(jsonArticle.optString("PROD_HIER_DESC_3"));
        storeProd.setMFG(jsonArticle.optString("MFG"));
        storeProd.setPACK_UNIT_1(jsonArticle.optString("PACK_UNIT_1"));
        storeProd.setPACK_UNIT_2(jsonArticle.optString("PACK_UNIT_2"));
        storeProd.setSELLING_ORDER_UNIT(jsonArticle.optString("SELLING_ORDER_UNIT"));
        storeProd.setINTERNET_PRICE(jsonArticle.optString("INTERNET_PRICE"));
        storeProd.setIS_PROD_REL_INT(jsonArticle.optString("IS_PROD_REL_INT"));
        storeProd.setACTIVE(jsonArticle.optString("ACTIVE"));
        storeProd.setC_IMG(jsonArticle.optString("C_IMG"));
        storeProd.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        storeProd.setPROFIT_MARGIN(jsonArticle.optString("PROFIT_MARGIN"));
        storeProd.setUSER(jsonArticle.optString("USER"));
        storeProd.setIND_NAME(jsonArticle.optString("IND_NM"));
        storeProd.setPOS_USER(jsonArticle.optString("POS_USER"));
        storeProd.setM_FLAG(jsonArticle.optString("M_FLAG"));
        storeProd.setS_FLAG(jsonArticle.optString("S_FLAG"));
        storeProd.setDISCOUNT_PERCENT(jsonArticle.optString("DISCOUNT_PERCENT"));
        storeProd.setDISCOUNT_PERCENT_AMOUNT(jsonArticle.optString("DISCOUNT_PERCENT_AMOUNT"));
        storeProd.setUSER(jsonArticle.optString("USER"));



        return storeProd;

    }
}












