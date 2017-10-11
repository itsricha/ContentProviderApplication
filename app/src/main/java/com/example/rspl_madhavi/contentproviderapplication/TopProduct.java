package com.example.rspl_madhavi.contentproviderapplication;

public class TopProduct {

    public TopProduct(){

    }

    private String STORE_ID= "STORE_ID";
    private String PROD_ID = "PROD_ID";
    private String PROD_NM =  "PROD_NM";
    private String PROD_SHORT_NM = "PROD_SHORT_NM";
    private String LAST_MODIFIED ="LAST_MODIFIED";
    private String S_FLAG = "S_FLAG";
    private String ACTIVE = "ACTIVE";
    private String POS_USER ="POS_USER";
    private String M_FLAG= "M_FLAG";
    private String SLAVE_FLAG= "SLAVE_FLAG";

    public String getSTORE_ID() {
        return STORE_ID;
    }

    public void setSTORE_ID(String STORE_ID) {
        this.STORE_ID = STORE_ID;
    }

    public String getPROD_ID() {
        return PROD_ID;
    }

    public void setPROD_ID(String PROD_ID) {
        this.PROD_ID = PROD_ID;
    }

    public String getPROD_NM() {
        return PROD_NM;
    }

    public void setPROD_NM(String PROD_NM) {
        this.PROD_NM = PROD_NM;
    }

    public String getPROD_SHORT_NM() {
        return PROD_SHORT_NM;
    }

    public void setPROD_SHORT_NM(String PROD_SHORT_NM) {
        this.PROD_SHORT_NM = PROD_SHORT_NM;
    }

    public String getLAST_MODIFIED() {
        return LAST_MODIFIED;
    }

    public void setLAST_MODIFIED(String LAST_MODIFIED) {
        this.LAST_MODIFIED = LAST_MODIFIED;
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

    public String getSLAVE_FLAG() {
        return SLAVE_FLAG;
    }

    public void setSLAVE_FLAG(String SLAVE_FLAG) {
        this.SLAVE_FLAG = SLAVE_FLAG;
    }

}
