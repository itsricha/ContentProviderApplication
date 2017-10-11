package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-aman on 5/6/17.
 */

public class SalesDetailParser {
    public static SalesDetail parse(JSONObject jsonArticle) {
        SalesDetail salesDetail = new SalesDetail();
        salesDetail.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        salesDetail.setTRI_ID(jsonArticle.optString("TRI_ID"));
        salesDetail.setPROD_NM(jsonArticle.optString("PROD_NM"));
        salesDetail.setBATCH_NO(jsonArticle.optString("BATCH_NO"));
        salesDetail.setEXP_DATE(jsonArticle.optString("EXP_DATE"));
        salesDetail.setS_PRICE(jsonArticle.optString("S_PRICE"));
        salesDetail.setQTY(jsonArticle.optString("QTY"));
        salesDetail.setMRP(jsonArticle.optString("MRP"));
        salesDetail.setUOM(jsonArticle.optString("UOM"));
        salesDetail.setTOTAL(jsonArticle.optString("TOTAL"));
        salesDetail.setCARD_NO(jsonArticle.optString("CARD_NO"));
        salesDetail.setITEM_ID(jsonArticle.optString("ITEM_ID"));
        salesDetail.setDISC_PERC(jsonArticle.optString("DISC_PERC"));
        salesDetail.setDISC_VAL(jsonArticle.optString("DISC_VAL"));
        salesDetail.setTAX_PER(jsonArticle.optString("TAX_PER"));
        salesDetail.setTAX_VALUE(jsonArticle.optString("TAX_VALUE"));
        salesDetail.setTAX_PER1(jsonArticle.optString("TAX_PER1"));
        salesDetail.setTAX_VALUE1(jsonArticle.optString("TAX_VALUE1"));
        salesDetail.setTAX_PER2(jsonArticle.optString("TAX_PER2"));
        salesDetail.setTAX_VALUE2(jsonArticle.optString("TAX_VALUE2"));
        salesDetail.setTAX_PER3(jsonArticle.optString("TAX_PER3"));
        salesDetail.setTAX_VALUE3(jsonArticle.optString("TAX_VALUE3"));
        salesDetail.setPREFIX_ID(jsonArticle.optString("PREFIX_ID"));
        salesDetail.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        salesDetail.setFLAG(jsonArticle.optString("FLAG"));
        salesDetail.setS_FLAG(jsonArticle.optString("S_FLAG"));
        salesDetail.setCONV_FACT(jsonArticle.optString("CONV_FACT"));
        salesDetail.setSALE_DATE(jsonArticle.optString("SALE_DATE"));
        salesDetail.setPOS_USER(jsonArticle.optString("POS_USER"));
        salesDetail.setM_FLAG(jsonArticle.optString("M_FLAG"));
        salesDetail.setEX_TRI_ID(jsonArticle.optString("EX_TRI_ID"));
        salesDetail.setORDER_TYPE(jsonArticle.optString("ORDER_TYPE"));
        salesDetail.setPICK_UP_LOCATION(jsonArticle.optString("PICK_UP_LOCATION"));
        salesDetail.setDISCOUNT_PERCENT(jsonArticle.optString("DISCOUNT_PERCENT"));
        salesDetail.setLINE_ITEM_DISC(jsonArticle.optString("LINE_ITEM_DISC"));
        salesDetail.setLINE_DISC(jsonArticle.optString("LINE_DISC"));
        salesDetail.setPROD_ID(jsonArticle.optString("PROD_ID"));
        salesDetail.setBANK_NAME(jsonArticle.optString("BANK_NAME"));
        salesDetail.setCARD_TYPE(jsonArticle.optString("CARD_TYPE"));
        salesDetail.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));


        return salesDetail;
    }
}

