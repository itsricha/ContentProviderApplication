package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class SendMailPdfParser {

    public static SendMailPdf parse(JSONObject jsonArticle) {
        SendMailPdf sendMailPdf = new SendMailPdf();
        sendMailPdf.setTXN_ID(jsonArticle.optString("TXN_ID"));
        sendMailPdf.setUNIVERSAL_ID(jsonArticle.optString("UNIVERSAL_ID"));
        sendMailPdf.setPREFIX_NM(jsonArticle.optString("PREFIX_NM"));
        sendMailPdf.setFM(jsonArticle.optString("FM"));
        sendMailPdf.setEMAIL_TO(jsonArticle.optString("EMAIL_TO"));
        sendMailPdf.setCC(jsonArticle.optString("CC"));
        sendMailPdf.setSUBJECT(jsonArticle.optString("SUBJECT"));
        sendMailPdf.setBODY(jsonArticle.optString("BODY"));
        sendMailPdf.setFLAG(jsonArticle.optString("FLAG"));
        sendMailPdf.setPO_NO(jsonArticle.optString("PO_NO"));
        sendMailPdf.setVENDOR_NAME(jsonArticle.optString("VENDOR_NAME"));
        sendMailPdf.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        sendMailPdf.setS_FLAG(jsonArticle.optString("S_FLAG"));
        sendMailPdf.setPOS_USER(jsonArticle.optString("POS_USER"));
        sendMailPdf.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        sendMailPdf.setM_FLAG(jsonArticle.optString("M_FLAG"));
        sendMailPdf.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));


        return sendMailPdf;
    }
}

