package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class StrSalesMasterReturnParser {

    public static StrSalesMasterReturn parse(JSONObject jsonArticle) {
        StrSalesMasterReturn strSalesMasterReturn = new StrSalesMasterReturn();
        strSalesMasterReturn.setID(jsonArticle.optString("ID"));
        strSalesMasterReturn.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        strSalesMasterReturn.setTRI_ID(jsonArticle.optString("TRI_ID"));
        strSalesMasterReturn.setGRAND_TOTAL(jsonArticle.optString("GRAND_TOTAL"));
        strSalesMasterReturn.setREASON_OF_RETURN(jsonArticle.optString("REASON_OF_RETURN"));
        strSalesMasterReturn.setBUSINESS_DATE(jsonArticle.optString("BUSINESS_DATE"));
        strSalesMasterReturn.setSALE_DATE(jsonArticle.optString("SALE_DATE"));
        strSalesMasterReturn.setSALE_TIME(jsonArticle.optString("SALE_TIME"));
        strSalesMasterReturn.setCARD_NO(jsonArticle.optString("CARD_NO"));
        strSalesMasterReturn.setTOTAL_POINTS(jsonArticle.optString("TOTAL_POINTS"));
        strSalesMasterReturn.setSCHEME_POINTS(jsonArticle.optString("SCHEME_POINTS"));
        strSalesMasterReturn.setFLAG(jsonArticle.optString("FLAG"));
        strSalesMasterReturn.setCREATED_BY(jsonArticle.optString("CREATED_BY"));
        strSalesMasterReturn.setCREATED_ON(jsonArticle.optString("CREATED_ON"));
        strSalesMasterReturn.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        strSalesMasterReturn.setS_FLAG(jsonArticle.optString("S_FLAG"));
        strSalesMasterReturn.setPOS_USER(jsonArticle.optString("POS_USER"));
        strSalesMasterReturn.setM_FLAG(jsonArticle.optString("M_FLAG"));
        strSalesMasterReturn.setEX_TRI_ID(jsonArticle.optString("EX_TRI_ID"));
        strSalesMasterReturn.setORDER_TYPE(jsonArticle.optString("ORDER_TYPE"));
        strSalesMasterReturn.setPICK_UP_LOCATION(jsonArticle.optString("PICK_UP_LOCATION"));
        strSalesMasterReturn.setDISCOUNT_PERCENT(jsonArticle.optString("DISCOUNT_PERCENT"));

        return strSalesMasterReturn;

    }
}












