package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

/**
 * Created by rspl-richa on 15/6/17.
 */

public class Grn_MasterParser {

    public static Grn_Master parse(JSONObject jsonArticle) {
        Grn_Master grnMaster= new Grn_Master();
        grnMaster.setSTORE_ID(jsonArticle.optString("STORE_ID"));
        grnMaster.setLAST_MODIFIED(jsonArticle.optString("LAST_MODIFIED"));
        grnMaster.setS_FLAG(jsonArticle.optString("S_FLAG"));
        grnMaster.setPOS_USER(jsonArticle.optString("POS_USER"));
        grnMaster.setM_FLAG(jsonArticle.optString("M_FLAG"));
        grnMaster.setFLAG("FLAG");
        grnMaster.setGRN_ID("GRN_ID");
        grnMaster.setPO_NO("PO_NO");
        grnMaster.setSLAVE_FLAG("SLAVE_FLAG");
        grnMaster.setVEND_NM("VEND_NM");
        grnMaster.setGRAND_AMOUNT("GRAND_AMOUNT");
        grnMaster.setAD_MAIN_ID("AD_MAIN_ID");
        grnMaster.setUSER("USER");
        grnMaster.setAD_DESC("AD_DESC");
        grnMaster.setAD_FILE("AD_FILE");
        grnMaster.setAD_STRT_DT("AD_STRT_DT");
        grnMaster.setAD_END_DT("AD_END_DT");
        grnMaster.setSTATUS("STATUS");

        return grnMaster;
    }

}
