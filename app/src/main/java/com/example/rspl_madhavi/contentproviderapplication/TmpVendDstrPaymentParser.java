package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 19/7/17.
 */

public class TmpVendDstrPaymentParser {

    public static TmpVendDstrPayment parse(JSONObject jsonArticle) {
        TmpVendDstrPayment tmpVendDstrPayment = new TmpVendDstrPayment();

        tmpVendDstrPayment.setPAYMENT_ID(jsonArticle.optString("PAYMENT_ID"));
        tmpVendDstrPayment.setPAY_ID(jsonArticle.optString("PAY_ID"));
        tmpVendDstrPayment.setVEND_DSTR_NM(jsonArticle.optString("VEND_DSTR_NM"));
        tmpVendDstrPayment.setREASON_OF_PAY(jsonArticle.optString("REASON_OF_PAY"));
        tmpVendDstrPayment.setAMOUNT(jsonArticle.optString("AMOUNT"));
        tmpVendDstrPayment.setRECEIVED_AMOUNT(jsonArticle.optString("RECEIVED_AMOUNT"));
        tmpVendDstrPayment.setDUE_AMOUNT(jsonArticle.optString("DUE_AMOUNT"));
        tmpVendDstrPayment.setBANK_NAME(jsonArticle.optString("BANK_NAME"));
        tmpVendDstrPayment.setCHEQUE_NO(jsonArticle.optString("CHEQUE_NO"));
        tmpVendDstrPayment.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        tmpVendDstrPayment.setPAYMENT_DATE(jsonArticle.optString("PAYMENT_DATE"));
        tmpVendDstrPayment.setPOS_USER(jsonArticle.optString("POS_USER"));
        tmpVendDstrPayment.setFLAG(jsonArticle.optString("FLAG"));
        tmpVendDstrPayment.setS_FLAG(jsonArticle.optString("S_FLAG"));
        tmpVendDstrPayment.setM_FLAG(jsonArticle.optString("M_FLAG"));


        return tmpVendDstrPayment;

    }
}
