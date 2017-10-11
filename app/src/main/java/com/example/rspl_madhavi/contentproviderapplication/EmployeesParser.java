package com.example.rspl_madhavi.contentproviderapplication;

import org.json.JSONObject;

public class EmployeesParser {

    public static Employees parse(JSONObject jsonArticle) {
        Employees employees= new Employees();
        employees.setSTORE_ID("STORE_ID");
        employees.setUSR_NM("USR_NM");
        employees.setFIRST_NAME("FIRST_NAME");
        employees.setLAST_NAME("LAST_NAME");
        employees.setPASSWORD("PASSWORD");
        employees.setCONFIRM_PASSWORD("CONFIRM_PASSWORD");
        employees.setACTIVE("ACTIVE");
        employees.setLAST_MODIFIED("LAST_MODIFIED");
        employees.setSLAVE_FLAG("S_FLAG");
        employees.setPOS_USER("POS_USER");
        employees.setM_FLAG("M_FLAG");
        employees.setSLAVE_FLAG("SLAVE_FLAG");
        return employees;
    }

}
