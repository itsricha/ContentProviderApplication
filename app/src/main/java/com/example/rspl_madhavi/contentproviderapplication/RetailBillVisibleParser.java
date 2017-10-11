package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 13/7/17.
 */

public class RetailBillVisibleParser {

    public static RetailBillVisible parse(JSONObject jsonArticle) {
        RetailBillVisible retailBillVisible=new RetailBillVisible();

        retailBillVisible.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailBillVisible.setSTORE_NAME(jsonArticle.optString("STORE_NAME"));
        retailBillVisible.setSTORE_ADDRESS(jsonArticle.optString("STORE_ADDRESS"));
        retailBillVisible.setCITY(jsonArticle.optString("CITY"));
        retailBillVisible.setSTORE_COUNTRY(jsonArticle.optString("STORE_COUNTRY"));
        retailBillVisible.setZIP(jsonArticle.optString("ZIP"));
        retailBillVisible.setTELE_1(jsonArticle.optString("TELE_1"));
        retailBillVisible.setTELE_2(jsonArticle.optString("TELE_2"));
        retailBillVisible.setMAIN_BODY(jsonArticle.optString("MAIN_BODY"));
        retailBillVisible.setMRP(jsonArticle.optString("MRP"));
        retailBillVisible.setS_PRICE (jsonArticle.optString("S_PRICE"));
        retailBillVisible.setQTY(jsonArticle.optString("QTY"));
        retailBillVisible.setTOTAL(jsonArticle.optString("TOTAL"));
        retailBillVisible.setTOTAL_BILL_VALUE(jsonArticle.optString("TOTAL_BILL_VALUE"));
        retailBillVisible.setDISCOUNT(jsonArticle.optString("DISCOUNT"));
        retailBillVisible.setNET_BILL_PAYABLE(jsonArticle.optString("NET_BILL_PAYABLE"));
        retailBillVisible.setAMOUNT_RECEIVED(jsonArticle.optString("AMOUNT_RECEIVED"));
        retailBillVisible.setAMOUNT_PAID_BACK(jsonArticle.optString("AMOUNT_PAID_BACK"));
        retailBillVisible.setFOOTER(jsonArticle.optString("FOOTER"));
        retailBillVisible.setS_FLAG(jsonArticle.optString("S_FLAG"));
        retailBillVisible.setPOS_USER(jsonArticle.optString("POS_USER"));
        retailBillVisible.setM_FLAG(jsonArticle.optString("M_FLAG"));
        retailBillVisible.setNORMAL_SALES (jsonArticle.optString("NORMAL_SALES"));
        retailBillVisible.setCREDIT_CUSTOMER(jsonArticle.optString("CREDIT_CUSTOMER"));
        retailBillVisible.setRETURNS(jsonArticle.optString("RETURNS"));




        return retailBillVisible;
    }


}
