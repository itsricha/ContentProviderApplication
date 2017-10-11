package com.example.rspl_madhavi.contentproviderapplication;

/**
 * Created by rspl-richa on 2/6/17.
 */


import org.json.JSONObject;


public class StockMasterParser {

    public static StockMaster parse(JSONObject jsonArticle) {
        StockMaster stockMaster = new StockMaster();
        stockMaster.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        stockMaster.setPROD_ID(jsonArticle.optString("PROD_ID"));
        stockMaster.setPROD_NAME(jsonArticle.optString("PROD_NM"));
        stockMaster.setBARCODE(jsonArticle.optString("BARCODE"));
        stockMaster.setMRP(jsonArticle.optString("MRP"));
        stockMaster.setS_PRICE(jsonArticle.optString("S_PRICE"));
        stockMaster.setACTIVE(jsonArticle.optString("ACTIVE"));
        stockMaster.setPROFIT_MARGIN(jsonArticle.optString("PROFIT_MARGIN"));
        stockMaster.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        stockMaster.setS_FLAG(jsonArticle.optString("S_FLAG"));
        stockMaster.setIND_NAME(jsonArticle.optString("IND_NM"));
        stockMaster.setPOS_USER(jsonArticle.optString("POS_USER"));
        stockMaster.setM_FLAG(jsonArticle.optString("M_FLAG"));
        stockMaster.setAMOUNT(jsonArticle.optString("AMOUNT"));
        stockMaster.setCON_MUL_QTY(jsonArticle.optString("CON_MUL_QTY"));
        stockMaster.setCONV_MRP(jsonArticle.optString("CONV_MRP"));
        stockMaster.setCONV_SPRICE(jsonArticle.optString("CONV_SPRICE"));
        stockMaster.setCREATED_BY(jsonArticle.optString("CREATED_BY"));
        stockMaster.setCREATED_ON(jsonArticle.optString("CREATED_ON"));
        stockMaster.setPURCHASE_UNIT_CONV(jsonArticle.optString("PURCHASE_UNIT_CONV"));
        stockMaster.setDISCOUNT_PERCENT(jsonArticle.optString("DISCOUNT_PERCENT"));
        stockMaster.setDISCOUNT_PERCENT_AMOUNT(jsonArticle.optString("DISCOUNT_PERCENT_AMOUNT"));
        stockMaster.setFLAG(jsonArticle.optString("FLAG"));
        stockMaster.setFREE_GOODS(jsonArticle.optString("FREE_GOODS"));
        stockMaster.setGRN_ID(jsonArticle.optString("GRN_ID"));
        stockMaster.setINVENTORY_DATE(jsonArticle.optString("INVENTORY_DATE"));
        stockMaster.setMF_DATE(jsonArticle.optString("MF_DATE"));
        stockMaster.setMFG_BATCH_NO(jsonArticle.optString("MFG_BATCH_NO"));
        stockMaster.setMRP(jsonArticle.optString("MRP"));
        stockMaster.setPO_NO(jsonArticle.optString("PO_NO"));
        stockMaster.setPREV_QTY(jsonArticle.optString("PREV_QTY"));
        stockMaster.setPURCHASE_PRICE(jsonArticle.optString("PURCHASE_PRICE"));
        stockMaster.setPURCHASE_UNIT_CONV(jsonArticle.optString("PURCHASE_UNIT_CCONV"));
        stockMaster.setQUANTITY(jsonArticle.optString("QTY"));
        stockMaster.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));
        stockMaster.setEXP_DATE(jsonArticle.optString("EXP_DATE"));

        return stockMaster;
    }
}