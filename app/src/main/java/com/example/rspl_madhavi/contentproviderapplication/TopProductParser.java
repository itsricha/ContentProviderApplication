package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class TopProductParser {

    public static TopProduct parse(JSONObject jsonArticle) {
        TopProduct topProduct = new TopProduct();
        topProduct.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        topProduct.setPROD_ID(jsonArticle.optString("PROD_ID"));
        topProduct.setPROD_NM(jsonArticle.optString("PROD_NM"));
        topProduct.setPROD_SHORT_NM(jsonArticle.optString("PROD_SHORT_NM"));
        topProduct.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        topProduct.setS_FLAG(jsonArticle.optString("S_FLAG"));
        topProduct.setACTIVE(jsonArticle.optString("ACTIVE"));
        topProduct.setPOS_USER(jsonArticle.optString("POS_USER"));
        topProduct.setM_FLAG(jsonArticle.optString("M_FLAG"));
        topProduct.setSLAVE_FLAG(jsonArticle.optString("SLAVE_FLAG"));

        return topProduct;
    }
}