package com.example.rspl_madhavi.contentproviderapplication;

/**
 * Created by rspl-richa on 14/7/17.
 */

public class RetailBillDisplay {

    public RetailBillDisplay(){

    }

    public String getSTORE_ID() {
        return STORE_ID;
    }

    public void setSTORE_ID(String STORE_ID) {
        this.STORE_ID = STORE_ID;
    }

    public String getTOTAL_BILL_VALUE() {
        return TOTAL_BILL_VALUE;
    }

    public void setTOTAL_BILL_VALUE(String TOTAL_BILL_VALUE) {
        this.TOTAL_BILL_VALUE = TOTAL_BILL_VALUE;
    }

    public String getDISCOUNT() {
        return DISCOUNT;
    }

    public void setDISCOUNT(String DISCOUNT) {
        this.DISCOUNT = DISCOUNT;
    }

    public String getNET_BILL_PAYABLE() {
        return NET_BILL_PAYABLE;
    }

    public void setNET_BILL_PAYABLE(String NET_BILL_PAYABLE) {
        this.NET_BILL_PAYABLE = NET_BILL_PAYABLE;
    }

    public String getAMOUNT_RECEIVED() {
        return AMOUNT_RECEIVED;
    }

    public void setAMOUNT_RECEIVED(String AMOUNT_RECEIVED) {
        this.AMOUNT_RECEIVED = AMOUNT_RECEIVED;
    }

    public String getAMOUNT_PAID_BACK() {
        return AMOUNT_PAID_BACK;
    }

    public void setAMOUNT_PAID_BACK(String AMOUNT_PAID_BACK) {
        this.AMOUNT_PAID_BACK = AMOUNT_PAID_BACK;
    }

    public String getFOOTER() {
        return FOOTER;
    }

    public void setFOOTER(String FOOTER) {
        this.FOOTER = FOOTER;
    }

    public String getS_FLAG() {
        return S_FLAG;
    }

    public void setS_FLAG(String s_FLAG) {
        S_FLAG = s_FLAG;
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

    String STORE_ID="STORE_ID" ;
    String TOTAL_BILL_VALUE= "TOTAL_BILL_VALUE" ;
    String DISCOUNT= "DISCOUNT" ;
    String NET_BILL_PAYABLE= "NET_BILL_PAYABLE" ;
    String AMOUNT_RECEIVED= "AMOUNT_RECEIVED" ;
    String AMOUNT_PAID_BACK= "AMOUNT_PAID_BACK" ;
    String FOOTER= "FOOTER" ;
    String S_FLAG= "S_FLAG" ;
    String POS_USER= "POS_USER" ;
    String M_FLAG= "M_FLAG" ;

}
