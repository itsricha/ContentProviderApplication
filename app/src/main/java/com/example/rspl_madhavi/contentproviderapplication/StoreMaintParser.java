package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;


public class StoreMaintParser {

    public static StoreMaint parse(JSONObject jsonArticle) {
        StoreMaint storeMaint = new StoreMaint();
        storeMaint.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        storeMaint.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        storeMaint.setSUBJECT_DESC(jsonArticle.optString("SUBJECT_DESC"));
        storeMaint.setSUPPORT_PRIORITY(jsonArticle.optString("SUPPORT_PRIORITY"));
        storeMaint.setSUPPORT_TICKET_STATUS(jsonArticle.optString("SUPPORT_TICKET_STATUS"));
        storeMaint.setTEAM_GROUP(jsonArticle.optString("TEAM_GROUP"));
        storeMaint.setTEAM_MEMBER(jsonArticle.optString("TEAM_MEMBER"));
        storeMaint.setCOMMENT(jsonArticle.optString("COMMENT"));
        storeMaint.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        storeMaint.setSTATUS(jsonArticle.optString("STATUS"));
        storeMaint.setUSER(jsonArticle.optString("USER"));
        storeMaint.setDATE(jsonArticle.optString("DATE"));
        storeMaint.setS_FLAG(jsonArticle.optString("S_FLAG"));
        storeMaint.setPOS_USER(jsonArticle.optString("POS_USER"));
        storeMaint.setM_FLAG(jsonArticle.optString("M_FLAG"));
        storeMaint.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));
        storeMaint.setEXACT_TIME(jsonArticle.optString("EXACT_TIME"));

        return storeMaint;
    }
}