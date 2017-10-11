package com.example.rspl_madhavi.contentproviderapplication;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailStoreCustReject {
    public RetailStoreCustReject(){

    }

    public String getSTORE_ID() {
        return STORE_ID;
    }

    public void setSTORE_ID(String STORE_ID) {
        this.STORE_ID = STORE_ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getREASON_FOR_REJECTION() {
        return REASON_FOR_REJECTION;
    }

    public void setREASON_FOR_REJECTION(String REASON_FOR_REJECTION) {
        this.REASON_FOR_REJECTION = REASON_FOR_REJECTION;
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
    String ID= "ID";
    String REASON_FOR_REJECTION= "REASON_FOR_REJECTION";
    String S_FLAG= "S_FLAG";
    String ACTIVE= "ACTIVE";
    String POS_USER= "POS_USER";
    String M_FLAG= "M_FLAG";
}
