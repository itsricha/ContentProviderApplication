package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class TempVendorPaymentParser {
    public static TempVendorPayment parse(JSONObject jsonArticle) {
        TempVendorPayment tempVendorPayment = new TempVendorPayment();
        tempVendorPayment.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        tempVendorPayment.setPAY_ID(jsonArticle.optString("PAY_ID"));
        tempVendorPayment.setVEND_DSTR_NM(jsonArticle.optString("VEND_DSTR_NM"));
        tempVendorPayment.setAMOUNT(jsonArticle.optString("AMOUNT"));
        tempVendorPayment.setRECEIVED_AMOUNT(jsonArticle.optString("RECEIVED_AMOUNT"));
        tempVendorPayment.setDUE_AMOUNT(jsonArticle.optString("DUE_AMOUNT"));
        tempVendorPayment.setREASON_OF_PAY(jsonArticle.optString("REASON_OF_PAY"));
        tempVendorPayment.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        tempVendorPayment.setBANK_NAME(jsonArticle.optString("BANK_NAME"));
        tempVendorPayment.setCHEQUE_NO(jsonArticle.optString("CHEQUE_NO"));
        tempVendorPayment.setPOS_USER(jsonArticle.optString("POS_USER"));
        tempVendorPayment.setFLAG(jsonArticle.optString("FLAG"));
        tempVendorPayment.setS_FLAG(jsonArticle.optString("S_FLAG"));
        tempVendorPayment.setPAYMENTDATE(jsonArticle.optString("PAYMENTDATE"));
        tempVendorPayment.setM_FLAG(jsonArticle.optString("M_FLAG"));
        return tempVendorPayment;
    }
}














