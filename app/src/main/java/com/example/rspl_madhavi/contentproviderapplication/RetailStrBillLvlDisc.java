package com.example.rspl_madhavi.contentproviderapplication;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailStrBillLvlDisc {
    public RetailStrBillLvlDisc(){

    }

    public String getSTORE_ID() {
        return STORE_ID;
    }

    public void setSTORE_ID(String STORE_ID) {
        this.STORE_ID = STORE_ID;
    }

    public String getBILL_LVL_NAME() {
        return BILL_LVL_NAME;
    }

    public void setBILL_LVL_NAME(String BILL_LVL_NAME) {
        this.BILL_LVL_NAME = BILL_LVL_NAME;
    }

    public String getDISC_TYPE() {
        return DISC_TYPE;
    }

    public void setDISC_TYPE(String DISC_TYPE) {
        this.DISC_TYPE = DISC_TYPE;
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

    String STORE_ID = "STORE_ID";
    String BILL_LVL_NAME = "BILL_LVL_NAME" ;
    String DISC_TYPE= "DISC_TYPE" ;
    String S_FLAG= "S_FLAG" ;
    String ACTIVE= "ACTIVE" ;
    String POS_USER= "POS_USER" ;
    String M_FLAG= "M_FLAG" ;
}
