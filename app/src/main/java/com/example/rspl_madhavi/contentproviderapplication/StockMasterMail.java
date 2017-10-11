package com.example.rspl_madhavi.contentproviderapplication;

/**
 * Created by rspl-richa on 17/7/17.
 */

public class StockMasterMail {

    public String getTICKET_ID() {
        return TICKET_ID;
    }

    public void setTICKET_ID(String TICKET_ID) {
        this.TICKET_ID = TICKET_ID;
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

    public String getBATCH_NO() {
        return BATCH_NO;
    }

    public void setBATCH_NO(String BATCH_NO) {
        this.BATCH_NO = BATCH_NO;
    }

    public String getEXP_DATE() {
        return EXP_DATE;
    }

    public void setEXP_DATE(String EXP_DATE) {
        this.EXP_DATE = EXP_DATE;
    }

    public String getQTY() {
        return QTY;
    }

    public void setQTY(String QTY) {
        this.QTY = QTY;
    }

    public String getPOS_USER() {
        return POS_USER;
    }

    public void setPOS_USER(String POS_USER) {
        this.POS_USER = POS_USER;
    }

    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    public String getS_FLAG() {
        return S_FLAG;
    }

    public void setS_FLAG(String s_FLAG) {
        S_FLAG = s_FLAG;
    }

    public String getM_FLAG() {
        return M_FLAG;
    }

    public void setM_FLAG(String m_FLAG) {
        M_FLAG = m_FLAG;
    }

    String TICKET_ID= "TICKET_ID" ;
    String PROD_ID= "PROD_ID" ;
    String PROD_NM= "PROD_NM" ;
    String BATCH_NO= "BATCH_NO" ;
    String EXP_DATE= "EXP_DATE";
    String QTY= "QTY" ;
    String POS_USER= "POS_USER" ;
    String FLAG= "FLAG" ;
    String S_FLAG= "S_FLAG" ;
    String M_FLAG= "M_FLAG" ;
}
