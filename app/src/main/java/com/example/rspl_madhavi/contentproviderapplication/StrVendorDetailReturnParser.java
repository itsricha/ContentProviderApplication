package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class StrVendorDetailReturnParser {

    public static StrVendorDetailReturn parse(JSONObject jsonArticle) {
        StrVendorDetailReturn strVendorDetailReturn= new StrVendorDetailReturn();
        strVendorDetailReturn.setVENDOR_RETURN_ID("VENDOR_RETURN_ID");
        strVendorDetailReturn.setPROD_NM("PROD_NM");
        strVendorDetailReturn.setSTORE_ID("STORE_ID");
        strVendorDetailReturn.setVENDOR_NM("VENDOR_NM");
        strVendorDetailReturn.setREASON_OF_RETURN("REASON_OF_RETURN");
        strVendorDetailReturn.setEXP_DATE("EXP_DATE");
        strVendorDetailReturn.setQTY("QTY");
        strVendorDetailReturn.setBATCH_NO("BATCH_NO");
        strVendorDetailReturn.setP_PRICE("P_PRICE");
        strVendorDetailReturn.setUOM("UOM");
        strVendorDetailReturn.setTOTAL("TOTAL");
        strVendorDetailReturn.setLAST_MODIFIED("LAST_MODIFIED");
        strVendorDetailReturn.setMRP("MRP");
        strVendorDetailReturn.setSLAVE_FLAG("S_FLAG");
        strVendorDetailReturn.setPOS_USER("POS_USER");
        strVendorDetailReturn.setRETURN_DATE("RETURN_DATE");
        strVendorDetailReturn.setM_FLAG("M_FLAG");
        strVendorDetailReturn.setSLAVE_FLAG("SLAVE_FLAG");

        return strVendorDetailReturn;
    }

}
