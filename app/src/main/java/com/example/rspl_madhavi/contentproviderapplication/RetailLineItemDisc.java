package com.example.rspl_madhavi.contentproviderapplication;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailLineItemDisc {
    public RetailLineItemDisc(){

    }

    public String getSTORE_ID() {
        return STORE_ID;
    }

    public void setSTORE_ID(String STORE_ID) {
        this.STORE_ID = STORE_ID;
    }

    public String getLINE_ITEM_NM() {
        return LINE_ITEM_NM;
    }

    public void setLINE_ITEM_NM(String LINE_ITEM_NM) {
        this.LINE_ITEM_NM = LINE_ITEM_NM;
    }

    public String getLINE_ITEM_DISC() {
        return LINE_ITEM_DISC;
    }

    public void setLINE_ITEM_DISC(String LINE_ITEM_DISC) {
        this.LINE_ITEM_DISC = LINE_ITEM_DISC;
    }

    public String getLINE_ITEM_ID() {
        return LINE_ITEM_ID;
    }

    public void setLINE_ITEM_ID(String LINE_ITEM_ID) {
        this.LINE_ITEM_ID = LINE_ITEM_ID;
    }

    public String getS_FLAG() {
        return S_FLAG;
    }

    public void setS_FLAG(String s_FLAG) {
        S_FLAG = s_FLAG;
    }

    public String getACTIVE() {
        return ACTIVE;
    }

    public void setACTIVE(String ACTIVE) {
        this.ACTIVE = ACTIVE;
    }

    public String getPOS_USER() {
        return POS_USER;
    }

    public void setPOS_USER(String POS_USER) {
        this.POS_USER = POS_USER;
    }

    public String getM_FLAG() {
        return M_FLAG;
    }

    public void setM_FLAG(String m_FLAG) {
        M_FLAG = m_FLAG;
    }

    String STORE_ID="STORE_ID";
    String LINE_ITEM_NM= "LINE_ITEM_NM";
    String LINE_ITEM_DISC= "LINE_ITEM_DISC";
    String LINE_ITEM_ID= "LINEITEM_ID";
    String S_FLAG= "S_FLAG";
    String ACTIVE= "ACTIVE";
    String POS_USER= "POS_USER";
    String M_FLAG= "M_FLAG";
}
