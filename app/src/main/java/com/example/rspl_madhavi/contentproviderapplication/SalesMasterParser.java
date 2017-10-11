package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-aman on 11/5/17.
 */

public class SalesMasterParser {
    public static SalesMaster parse(JSONObject jsonArticle) {
        SalesMaster salesMaster = new SalesMaster();
        salesMaster.setTRI_ID(jsonArticle.optString("TRI_ID"));
        salesMaster.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        salesMaster.setGRAND_TOTAL(jsonArticle.optString("GRAND_TOTAL"));
        salesMaster.setBUSINESS_DATE(jsonArticle.optString("BUSINESS_DATE"));
        salesMaster.setSALE_DATE(jsonArticle.optString("SALE_DATE"));
        salesMaster.setSALE_TIME(jsonArticle.optString("SALE_TIME"));
        salesMaster.setCARD_NO(jsonArticle.optString("CARD_NO"));
        salesMaster.setTOTAL_POINTS(jsonArticle.optString("TOTAL_POINTS"));
        salesMaster.setSCHEME_POINTS(jsonArticle.optString("SCHEME_POINTS"));
        salesMaster.setFLAG(jsonArticle.optString("FLAG"));
        salesMaster.setCREATED_BY(jsonArticle.optString("CREATED_BY"));
        salesMaster.setCREATED_ON(jsonArticle.optString("CREATED_ON"));
        salesMaster.setCUST_ID(jsonArticle.optString("CUST_ID"));
        salesMaster.setS_FLAG(jsonArticle.optString("S_FLAG"));
        salesMaster.setPOS_USER(jsonArticle.optString("POS_USER"));
        salesMaster.setM_FLAG(jsonArticle.optString("M_FLAG"));
        salesMaster.setEX_TRI_ID(jsonArticle.optString("EX_TRI_ID"));
        salesMaster.setORDER_TYPE(jsonArticle.optString("ORDER_TYPE"));
        salesMaster.setPICK_UP_LOCATION(jsonArticle.optString("PICK_UP_LOCATION"));
        salesMaster.setDISCOUNT_PERCENT(jsonArticle.optString("DISCOUNT_PERCENT"));
        salesMaster.setLINE_ITEM_DISC(jsonArticle.optString("LINE_ITEM_DISC"));
        salesMaster.setLINE_DISC(jsonArticle.optString("LINE_DISC"));
        salesMaster.setCUST_NAME(jsonArticle.optString("CUST_NAME"));
        salesMaster.setCUST_CNCT(jsonArticle.optString("CUST_CNCT"));
        salesMaster.setDOCT_NAME(jsonArticle.optString("DOCT_NAME"));
        salesMaster.setDOCT_SPEC(jsonArticle.optString("DOCT_SPEC"));
        return salesMaster;
    }
}














