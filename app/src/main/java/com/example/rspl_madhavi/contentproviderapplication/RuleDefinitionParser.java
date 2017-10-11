package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RuleDefinitionParser {

    public static RuleDefinition parse(JSONObject jsonArticle) {
        RuleDefinition ruleDefinition = new RuleDefinition();

        ruleDefinition.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        ruleDefinition.setSTORE_ID(jsonArticle.optString("SNO"));
        ruleDefinition.setUSER (jsonArticle.optString("USER" ));
        ruleDefinition.setCARD_TYPE (jsonArticle.optString("CARD_TYPE"));
        ruleDefinition.setBASE_VALUE (jsonArticle.optString("BASE_VALUE"));
        ruleDefinition.setPER_TON_POINTS(jsonArticle.optString("PER_TON_POINTS"));
        ruleDefinition.setS_FLAG(jsonArticle.optString("S_FLAG"));
        ruleDefinition.setPOS_USER (jsonArticle.optString("POS_USER"));
        ruleDefinition.setM_FLAG (jsonArticle.optString("M_FLAG"));

        return ruleDefinition;
    }
}
