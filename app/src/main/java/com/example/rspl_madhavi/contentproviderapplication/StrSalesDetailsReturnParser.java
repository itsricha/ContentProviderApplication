package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class StrSalesDetailsReturnParser {

    public static StrSalesDetailsReturn parse(JSONObject jsonArticle) {
        StrSalesDetailsReturn strSalesDetailsReturn = new StrSalesDetailsReturn();
        strSalesDetailsReturn.setID(jsonArticle.optString("ID"));
        strSalesDetailsReturn.setTRI_ID(jsonArticle.optString("TRI_ID"));
        strSalesDetailsReturn.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        strSalesDetailsReturn.setPROD_NM(jsonArticle.optString("PROD_NM"));
        strSalesDetailsReturn.setBATCH_NO(jsonArticle.optString("BATCH_NO"));
        strSalesDetailsReturn.setEXP_DATE(jsonArticle.optString("EXP_DATE"));
        strSalesDetailsReturn.setS_PRICE(jsonArticle.optString("S_PRICE"));
        strSalesDetailsReturn.setQTY(jsonArticle.optString("QTY"));
        strSalesDetailsReturn.setMRP(jsonArticle.optString("MRP"));
        strSalesDetailsReturn.setAMOUNT(jsonArticle.optString("AMOUNT"));
        strSalesDetailsReturn.setUOM(jsonArticle.optString("UOM"));
        strSalesDetailsReturn.setTOTAL(jsonArticle.optString("TOTAL"));
        strSalesDetailsReturn.setSTATUS(jsonArticle.optString("STATUS"));
        strSalesDetailsReturn.setCARD_NO(jsonArticle.optString("CARD_NO"));
        strSalesDetailsReturn.setITEM_ID(jsonArticle.optString("ITEM_ID"));
        strSalesDetailsReturn.setDISC_PERC(jsonArticle.optString("DISC_PERC"));
        strSalesDetailsReturn.setDISC_VAL(jsonArticle.optString("DISC_VAL"));
        strSalesDetailsReturn.setTAX_PER(jsonArticle.optString("TAX_PER"));
        strSalesDetailsReturn.setTAX_VALUE(jsonArticle.optString("TAX_VALUE"));
        strSalesDetailsReturn.setTAX_PER1(jsonArticle.optString("TAX_PER1"));
        strSalesDetailsReturn.setTAX_VALUE1(jsonArticle.optString("TAX_VALUE1"));
        strSalesDetailsReturn.setTAX_PER2(jsonArticle.optString("TAX_PER2"));
        strSalesDetailsReturn.setTAX_VALUE2(jsonArticle.optString("TAX_VALUE2"));
        strSalesDetailsReturn.setTAX_PER3(jsonArticle.optString("TAX_PER3"));
        strSalesDetailsReturn.setS_FLAG(jsonArticle.optString("S_FLAG"));
        strSalesDetailsReturn.setFLAG(jsonArticle.optString("FLAG"));
        strSalesDetailsReturn.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        strSalesDetailsReturn.setSALE_DATE(jsonArticle.optString("SALE_DATE"));
        strSalesDetailsReturn.setPOS_USER(jsonArticle.optString("POS_USER"));
        strSalesDetailsReturn.setEX_TRI_ID(jsonArticle.optString("EX_TRI_ID"));
        strSalesDetailsReturn.setM_FLAG(jsonArticle.optString("M_FLAG"));
        strSalesDetailsReturn.setORDER_TYPE(jsonArticle.optString("ORDER_TYPE"));
        strSalesDetailsReturn.setPICK_UP_LOCATION(jsonArticle.optString("PICK_UP_LOCATION"));
        strSalesDetailsReturn.setDISCOUNT_PERCENT(jsonArticle.optString("DISCOUNT_PERCENT"));

        return strSalesDetailsReturn;

    }
}












