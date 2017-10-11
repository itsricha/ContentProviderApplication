package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class StrDistributorParser {

    public static StrDistributor parse(JSONObject jsonArticle) {
        StrDistributor strDistributor = new StrDistributor();
        strDistributor.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        strDistributor.setDSTR_ID(jsonArticle.optString("DSTR_ID"));
        strDistributor.setDSTR_NM(jsonArticle.optString("DSTR_NM"));
        strDistributor.setDSTR_CNTCT_NM(jsonArticle.optString("DSTR_CNTCT_NM"));
        strDistributor.setADD_1(jsonArticle.optString("ADD_1"));
        strDistributor.setCITY(jsonArticle.optString("CITY"));
        strDistributor.setCTR_NM(jsonArticle.optString("CTR_NM"));
        strDistributor.setZIP(jsonArticle.optString("ZIP"));
        strDistributor.setTELE(jsonArticle.optString("TELE"));
        strDistributor.setMOBILE(jsonArticle.optString("MOBILE"));
        strDistributor.setDSTR_INV(jsonArticle.optString("DSTR_INV"));
        strDistributor.setACTIVE(jsonArticle.optString("ACTIVE"));
        strDistributor.setEMAIL(jsonArticle.optString("EMAIL"));
        strDistributor.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        strDistributor.setUSER(jsonArticle.optString("USER"));
        strDistributor.setS_FLAG(jsonArticle.optString("S_FLAG"));
        strDistributor.setPOS_USER(jsonArticle.optString("POS_USER"));
        strDistributor.setM_FLAG(jsonArticle.optString("M_FLAG"));

        return strDistributor;

    }
}












