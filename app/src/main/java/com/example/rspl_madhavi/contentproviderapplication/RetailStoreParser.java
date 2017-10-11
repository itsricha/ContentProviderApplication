package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 5/7/17.
 */

public class RetailStoreParser {

    public static RetailStore parse(JSONObject jsonArticle) {
        RetailStore retailStore = new RetailStore();

        retailStore.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        retailStore.setSTORE_MEDIA_ID (jsonArticle.optString( "STORE_MEDIA_ID"));
        retailStore.setSTR_NM (jsonArticle.optString(  "STR_NM"));
        retailStore.setADD_1 (jsonArticle.optString( "ADD_1"));
        retailStore.setCTY (jsonArticle.optString("CTY"));
        retailStore.setSTR_CTR (jsonArticle.optString( "STR_CTR"));
        retailStore.setZIP (jsonArticle.optString( "ZIP"));
        retailStore.setSTR_CNTCT_NM (jsonArticle.optString("STR_CNTCT_NM"));
        retailStore.setTELE(jsonArticle.optString( "TELE"));
        retailStore.setTELE_1(jsonArticle.optString("TELE_1"));
        retailStore.setE_MAIL (jsonArticle.optString("E_MAIL"));
        retailStore.setTAN_NUMBER(jsonArticle.optString( "TAN_NUMBER"));
        retailStore.setDSTR_NUMBER(jsonArticle.optString(  "DSTR_NM"));
        retailStore.setFOOTER(jsonArticle.optString( "FOOTER"));
        retailStore.setFLAG(jsonArticle.optString("FLAG"));
        retailStore.setSTR_IND_DESC (jsonArticle.optString("STR_IND_DESC"));
        retailStore.setRET_CLS_ID(jsonArticle.optString( "RET_CLS_ID"));
        retailStore.setTEAM_MEMB(jsonArticle.optString("TEAM_MEMB"));
        retailStore.setSTATUS (jsonArticle.optString(  "STATUS"));
        retailStore.setOTP(jsonArticle.optString(  "OTP"));
        retailStore.setUSER(jsonArticle.optString(  "USER"));
        retailStore.setS_FLAG(jsonArticle.optString( "S_FLAG"));
        retailStore.setS3_FLAG(jsonArticle.optString( "S3_FLAG"));
        retailStore.setPOS_USER(jsonArticle.optString( "POS_USER"));
        retailStore.setM_FLAG(jsonArticle.optString( "M_FLAG"));
        retailStore.setLKR(jsonArticle.optString( "LKr"));



        return retailStore;
    }
}

