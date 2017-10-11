package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class drDiscriptionParser {

    public static drDiscription parse(JSONObject jsonArticle) {
        drDiscription drDiscription= new drDiscription();
        drDiscription.setDR_ID("DR_ID");
        drDiscription.setSTORE_ID("STORE_ID");
        drDiscription.setDR_NAME("DR_NAME");
        drDiscription.setSPECIALITY("SPECIALITY");
        drDiscription.setDR_ADDRESS("DR_ADDRESS");
        drDiscription.setLAST_MODIFIED("LAST_MODIFIED");
        drDiscription.setS_FLAG("S_FLAG");
        drDiscription.setACTIVE("ACTIVE");
        drDiscription.setPOS_USER("POS_USER");
        drDiscription.setM_FLAG("M_FLAG");
        drDiscription.setSLAVE_FLAG("SLAVE_FLAG");

        return drDiscription;
    }

}
