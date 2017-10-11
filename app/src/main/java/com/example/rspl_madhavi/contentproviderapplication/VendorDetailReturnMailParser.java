package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 17/7/17.
 */

public class VendorDetailReturnMailParser {

    public static VendorDetailReturnMail parse(JSONObject jsonArticle) {
        VendorDetailReturnMail vendorDetailReturnMail = new VendorDetailReturnMail();

        vendorDetailReturnMail.setTICKET_ID(jsonArticle.optString("TICKET_ID"));
        vendorDetailReturnMail.setVENDOR_RETURN_ID(jsonArticle.optString("VENDOR_RETURN_ID"));
        vendorDetailReturnMail.setVENDOR_NM(jsonArticle.optString("VENDOR_NM"));
        vendorDetailReturnMail.setPROD_NM (jsonArticle.optString("PROD_NM"));
        vendorDetailReturnMail.setBATCH_NO(jsonArticle.optString("BATCH_NO"));
        vendorDetailReturnMail.setQTY(jsonArticle.optString("QTY"));
        vendorDetailReturnMail.setREASON_OF_RETURN(jsonArticle.optString("REASON_OF_RETURN"));
        vendorDetailReturnMail.setP_PRICE(jsonArticle.optString("P_PRICE"));
        vendorDetailReturnMail.setTOTAL(jsonArticle.optString("TOTAL"));
        vendorDetailReturnMail.setEXP_DATE(jsonArticle.optString("EXP_DATE"));
        vendorDetailReturnMail.setUOM(jsonArticle.optString("UOM"));
        vendorDetailReturnMail.setPOS_USER (jsonArticle.optString("POS_USER"));
        vendorDetailReturnMail.setFLAG (jsonArticle.optString("FLAG"));
        vendorDetailReturnMail.setS_FLAG (jsonArticle.optString("S_FLAG"));


        return vendorDetailReturnMail;
    }

}
