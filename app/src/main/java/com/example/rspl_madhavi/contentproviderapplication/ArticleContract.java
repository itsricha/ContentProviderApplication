package com.example.rspl_madhavi.contentproviderapplication;
import android.net.Uri;
public final class ArticleContract {
    // ContentProvider information
    public static final String CONTENT_AUTHORITY = "com.RSPL.POS";
    static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    static final String PATH_STORE= "retail_store";
    static final String PATH_STR_PROD_LOCAL= "retail_store_prod_local";
    static final String PATH_SALES_DETAIL = "retail_str_sales_detail";
    static final String PATH_SALES_MASTER  = "retail_str_sales_master";

    static final String PATH_STOCK_MASTER= "retail_str_stock_master";
    static final String PATH_TEMP_VENDORPAYMENT= "tmp_vend_dstr_payment_mail";
    static final String PATH_SALES_MASTER_RETURN= "retail_str_sales_master_return";
    static final String PATH_SALES_DETAILS_RETURN= "retail_str_sales_details_return";
    static final String PATH_STR_DISTRIBUTOR= "retail_str_dstr";
    static final String PATH_SEND_MAIL_PDF= "retail_send_mail_pdf";
    static final String PATH_AD_TICKER_MAIN= "ad_ticker_main";
    static final String PATH_TOP_PRODUCT= "retail_top_product";
    static final String PATH_EMPLOYEES= "retail_employees";
    static final String PATH_VEND_REJECT= "retail_store_vend_reject";
    static final String PATH_CUST_REJECT= "retail_store_cust_reject";
    static final String PATH_VENDOR_DETAIL_RETURN= "retail_str_vendor_detail_return";
    static final String PATH_STOREMAINTAIN= "retail_store_maint";
    static final String PATH_BLINKINGLOGO_MAIL= "retail_ad_blinkinglogo_mail";
    static final String PATH_ADSTORE_MAIN_MAIL= "retail_ad_store_main_mail";
    static final String PATH_ADTICKER_MAIL= "retail_ad_ticker_mail";
    static final String PATH_PROD_CPG_MAIL= "retail_store_prod_cpg_mail";
    static final String PATH_PROD_LOCAL_CPG_MAIL= "retail_store_prod_local_cpg_mail";
    static final String PATH_PROD_LOCAL_MAIL= "retail_store_prod_local_mail";
    static final String PATH_PROD_COM = "retail_store_prod_com";
    static final String PATH_PROD_CPG = "retail_store_prod_cpg";
    static final String PATH_LOCAL_PROD_CPG = "retail_store_prod_local_cpg";
    static final String PATH_GRN_MASTER= "retail_str_grn_master";

    static final String PATH_RETAIL_STORE_DECIMAL= "retail_store_decimal";
    static final String PATH_DAY_OPEN_CLOSE= "retail_str_day_open_close";
    static final String PATH_RETAIL_BILL_DISPLAY= "retail_bill_display";
    static final String PATH_RETAIL_BILL_VISIBLE= "retail_bill_visible";
    static final String PATH_RETAIL_CARD_DEFINE= "retail_card_define";
    static final String PATH_RETAIL_CUST= "retail_cust";
    static final String PATH_RETAIL_LINE_ITEM_DISC= "retail_str_lineitem_disc";
    static final String PATH_RETAIL_MEDIA_CLICK= "retail_media_click";
    static final String PATH_BILL_LEVEL_DISC= "retail_str_bill_lvl_disc";
    static final String PATH_RULE_DEFINITION= "rule_defination";
    static final String PATH_SALES_DETAIL_RETURN_MAIL= "retail_str_sales_details_return_mail";
    static final String PATH_STOCK_MASTER_MAIL= "retail_str_stock_master_mail";
    static final String PATH_VENDOR_DETAIL_RETURN_MAIL= "retail_str_vendor_detail_return_mail";
    static final String PATH_RETAIL_STR_PROD_MAIL= "retail_str_prod_mail";
    static final String PATH_RETAIL_STR_VENDOR_MAIL= "retail_str_vendor_mail";
    static final String PATH_RETAIL_STR_DSTR_MAIL= "retail_str_dstr_mail";
    static final String PATH_STORE_PO_DETAIL_MAIL= "retail_str_po_detail_mail";
    static final String PATH_SALES_DETAIL_MAIL= "retail_str_sales_detail_mail";
    static final String PATH_TMP_VEND_DSTR_PAYMENT= "tmp_vend_dstr_payment";
    static final String PATH_RETAIL_CREDIT_CUST="retail_credit_cust";
    static final String PATH_RETAIL_STORE_VENDOR="retail_store_vendor";
    // Database information
    static final String DB_NAME = "Db";

    public static abstract class STRPRODLOCAL{
        public static final String TABLENAME_STR_PROD_LOCAL = "retail_store_prod_local";

        public static final String STORE_ID="STORE_ID";
        public static final String PROD_ID = "PROD_ID";
        public static final String PROD_NM="PROD_NM";
        public static final String BARCODE= "BARCODE";
        public static final String MRP="MRP";
        public static final String S_PRICE="S_PRICE";
        public static final String P_PRICE="P_PRICE";
        public static final String TAX_ID="TAX_ID";
        public static final String INTERNET_PRICE="INTERNET_PRICE";
        public static final String IS_PROD_REL_INT="IS_PROD_REL_INT";
        public static final String ACTIVE = "ACTIVE";
        public static final String PROFIT_MARGIN="PROFIT_MARGIN";
        public static final String S_FLAG="S_FLAG";
        public static final String IND_NM="IND_NM";
        public static final String POS_USER="POS_USER";
        public static final String M_FLAG="M_FLAG";
        public static final String DISCOUNT_PERCENT="DISCOUNT_PERCENT";
        public static final String SELLING_ORDER_UNIT="SELLING_ORDER_UNIT";
        //  public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String DISCOUNT_PERCENT_AMOUNT="DISCOUNT_PERCENT_AMOUNT";

        // ContentProvider information for articles
        public static final Uri CONTENT_URI_STR_PROD_LOCAL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_STR_PROD_LOCAL).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_STR_PROD_LOCAL + "/" + PATH_STR_PROD_LOCAL;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_STR_PROD_LOCAL + "/" + PATH_STR_PROD_LOCAL;
    }

    public static abstract class Retail_credit_cust{
        public static final String TABLENAME_RETAIL_CREDIT_CUST ="retail_credit_cust";

        public static final String INVOICE_NO= "INVOICE_NO" ;
        public static final String PAYMENT_ID= "PAYMENT_ID" ;
        public static final String STORE_ID= "STORE_ID" ;
        public static final String NAME= "NAME" ;
        public static final String MOBILE_NO= "MOBILE_NO" ;
        public static final String GRAND_TOTAL= "GRAND_TOTAL" ;
        public static final String FLAG= "FLAG" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String ACTIVE= "ACTIVE" ;
        public static final String LAST_MODIFIED= "LAST_MODIFIED" ;
        public static final String RECEIVE_AMOUNT= "RECEIVE_AMOUNT" ;
        public static final String DUE_AMOUNT= "DUE_AMOUNT" ;
        public static final String TOTAL= "TOTAL" ;
        public static final String CREDIT_DATE= "CREDIT_DATE" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String M_FLAG= "M_FLAG" ;

        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_CREDIT_CUST  =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_CREDIT_CUST ).build();
        public static final String CONTENT_TYPE_RETAIL_CREDIT_CUST =
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_CREDIT_CUST  + "/" + PATH_RETAIL_CREDIT_CUST ;
        public static final String CONTENT_ITEM_TYPE_RETAIL_CREDIT_CUST  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_CREDIT_CUST + "/" + PATH_RETAIL_CREDIT_CUST ;
    }

    public static abstract class Retail_store_cust_reject{
        public static final String TABLENAME_CUST_REJECT ="retail_store_cust_reject";

        public static final String STORE_ID="STORE_ID";
        public static final String ID= "ID";
        public static final String REASON_FOR_REJECTION= "REASON_FOR_REJECTION";
        public static final String S_FLAG= "S_FLAG";
        public static final String ACTIVE= "ACTIVE";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG= "M_FLAG";

        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_CUST_REJECT  =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_CUST_REJECT ).build();
        public static final String CONTENT_TYPE_CUST_REJECT =
                "vnd.android.cursor.dir/" + CONTENT_URI_CUST_REJECT  + "/" + PATH_CUST_REJECT ;
        public static final String CONTENT_ITEM_TYPE_CUST_REJECT  =
                "vnd.android.cursor.item/" + CONTENT_URI_CUST_REJECT + "/" + PATH_CUST_REJECT ;
    }

    public static abstract class SalesDetail{
        public static final String NAME_DETAIL = "retail_str_sales_detail";
        public static final String STORE_ID = "STORE_ID";
        public static final String TRI_ID = "TRI_ID";
        public static final String BARCODE= "BARCODE";
        public static final String PROD_NM= "PROD_NM";
        public static final String EXP_DATE= "EXP_DATE";
        public static final String S_PRICE= "S_PRICE";
        public static final String QTY= "QTY";
        public static final String MRP= "MRP";
        public static final String UOM= "UOM";
        public static final String TOTAL= "TOTAL";
        public static final String CARD_NO= "CARD_NO";
        public static final String ITEM_ID= "ITEM_ID";
        public static final String DISC_PERC= "DISC_PERC";
        public static final String DISC_VAL= "DISC_VAL";
        public static final String TAX_PER= "TAX_PER";
        public static final String TAX_VALUE= "TAX_VALUE";
        public static final String TAX_PER1= "TAX_PER1";
        public static final String TAX_VALUE1= "TAX_VALUE1";
        public static final String PREFIX_ID= "PREFIX_ID";
        public static final String TAX_PER2= "TAX_PER2";
        public static final String TAX_VALUE2= "TAX_VALUE2";
        public static final String TAX_PER3= "TAX_PER3";
        public static final String TAX_VALUE3= "TAX_VALUE3";
        public static final String LAST_MODIFIED= "LAST_MODIFIED";
        public static final String FLAG= "FLAG";
        public static final String S_FLAG= "S_FLAG";
        public static final String CONV_FACT= "CONV_FACT";
        public static final String SALE_DATE= "SALE_DATE";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG= "M_FLAG";
        public static final String EX_TRI_ID= "EX_TRI_ID";
        public static final String ORDER_TYPE= "ORDER_TYPE";
        public static final String PICK_UP_LOCATION= "PICK_UP_LOCATION";
        public static final String DISCOUNT_PERCENT= "DISCOUNT_PERCENT";
        public static final String LINE_ITEM_DISC = "LINE_ITEM_DISC";
        public static final String LINE_DISC= "LINE_DISC";
        public static final String PROD_ID= "PROD_ID";
        public static final String BANK_NAME= "BANK_NAME";
        public static final String CARD_TYPE= "CARD_TYPE";
        public static final String SLAVE_FLAG= "SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_DETAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_SALES_DETAIL).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_DETAIL + "/" + PATH_SALES_DETAIL;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_DETAIL + "/" + PATH_SALES_DETAIL;
    }

    public static abstract class StockMaster {
        public static final String TABLENAME_STOCK_MASTER="retail_str_stock_master";
        public static final String STORE_ID  ="STORE_ID";
        public static final String PROD_ID = "PROD_ID";
        public static final String PROD_NAME = "PROD_NM";
        public static final String EXP_DATE = "EXP_DATE";
        public static final String QUANTITY = "QTY";
        public static final String MRP = "MRP";
        public static final String AMOUNT = "AMOUNT";
        public static final String UOM = "UOM";
        public static final String PURCHASE_PRICE = "P_PRICE";
        public static final String S_PRICE = "S_PRICE";
        public static final String BARCODE = "BARCODE";
        public static final String FREE_GOODS = "FREE_GOODS";
        // public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String MF_DATE= "MF_DATE";
        public static final String FLAG = "FLAG";
        public static final String CREATED_BY = "CREATED_BY";
        public static final String CREATED_ON = "CREATED_ON";
        public static final String CON_MUL_QTY= "CON_MUL_QTY";
        public static final String GRN_ID = "GRN_ID";
        public static final String VEND_NAME = "VEND_NM";
        public static final String PO_NO = "PO_NO";
        public static final String PROFIT_MARGIN = "PROFIT_MARGIN";
        public static final String S_FLAG = "S_FLAG";
        public static final String IND_NAME = "IND_NM";
        public static final String CONV_MRP = "CONV_MRP";
        public static final String CONV_SPRICE = "CONV_SPRICE";
        public static final String PREV_QTY = "PREV_QTY";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG = "M_FLAG";
        public static final String INVENTORY_DATE = "INVENTORY_DATE";
        public static final String MFG_BATCH_NO = "MFG_BATCH_NO";
        public static final String PURCHASE_UNIT_CONV="PURCHASE_UNIT_CONV";
        public static final String VENDOR_INVOICE_NO = "VENDOR_INVOICE_NO";
        public static final String VENDOR_INVOICE_DATE = "VENDOR_INVOICE_DATE";
        public static final String DISCOUNT_PERCENT="DISCOUNT_PERCENT";
        public static final String DISCOUNT_PERCENT_AMOUNT="DISCOUNT_PERCENT_AMOUNT";
        public static final String ACTIVE= "ACTIVE";
        public static final String SLAVE_FLAG= "SLAVE_FLAG";
        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_STOCK_MASTER =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_STOCK_MASTER).build();
        public static final String CONTENT_TYPE_STOCK_MASTER =
                "vnd.android.cursor.dir/" + CONTENT_URI_STOCK_MASTER + "/" + PATH_STOCK_MASTER;
        public static final String CONTENT_ITEM_TYPE_STOCK_MASTER =
                "vnd.android.cursor.item/" + CONTENT_URI_STOCK_MASTER + "/" + PATH_STOCK_MASTER;
    }
    public static abstract class RetailStore{
        public static final String TABLENAME_RETAIL_STORE = "retail_store";
        public static final String STORE_ID="STORE_ID";
        public static final String STORE_MEDIA_ID="STORE_MEDIA_ID";
        public static final String STR_NM="STR_NM";
        public static final String ADD_1="ADD_1";
        public static final String CTY ="CTY";
        public static final String STR_CTR ="STR_CTR";
        public static final String ZIP="ZIP" ;
        public static final String STR_CNTCT_NM="STR_CNTCT_NM" ;
        public static final String TELE="TELE" ;
        public static final String TELE_1="TELE_1";
        public static final String E_MAIL="E_MAIL" ;
        public static final String TAN_NUMBER="TAN_NUMBER" ;
        public static final String DSTR_NUMBER="DSTR_NUMBER" ;
        public static final String FOOTER="FOOTER" ;
        public static final String FLAG="FLAG" ;
        public static final String STR_IND_DESC="STR_IND_DESC" ;
        public static final String RET_CLS_ID="RET_CLS_ID" ;
        public static final String TEAM_MEMB="TEAM_MEMB" ;
        public static final String STATUS="STATUS" ;
        public static final String CURR_STATUS="CURR_STATUS" ;
        public static final String CREATION_DATE="CREATION_DATE" ;
        public static final String CLOSURE_DATE="CLOSURE_DATE" ;
        public static final String ACTIVATION_DATE ="ACTIVATION_DATE";
        public static final String DE_ACTIVATION_DATE="DE_ACTIVATION_DATE" ;
        public static final String OTP="OTP" ;
        public static final String USER="USER" ;
        public static final String S_FLAG ="S_FLAG";
        public static final String S3_FLAG="S3_FLAG" ;
        public static final String POS_USER="POS_USER";
        public static final String M_FLAG="M_FLAG" ;
        public static final String CURRENCY="CURRENCY" ;
        public static final String LT ="LT";
        public static final String LO="LO" ;


        // ContentProvider information for articles
        public static final Uri CONTENT_URI_RETAIL_STORE =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_STORE).build();
        public static final String CONTENT_TYPE_RETAIL_STORE =
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_STORE + "/" + PATH_STORE;
        public static final String CONTENT_ITEM_TYPE_RETAIL_STORE =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_STORE + "/" + PATH_STORE;
    }

    public static abstract class TempVendorPayment{

        public static final String TABLENAME_TEMP_VENDORPAYMENT = "tmp_vend_dstr_payment_mail";
        public static final String TICKET_ID = "TICKET_ID";
        public static final String PAY_ID="PAY_ID";
        public static final String VEND_DSTR_NM= "VEND_DSTR_NM";
        public static final String AMOUNT= "AMOUNT";
        public static final String RECEIVED_AMOUNT=  "RECEIVED_AMOUNT";
        public static final String DUE_AMOUNT= "DUE_AMOUNT";
        public static final String REASON_OF_PAY = "REASON_OF_PAY";
        public static final String LAST_MODIFIED =  "LAST_MODIFIED";
        public static final String BANK_NAME= "BANK_NAME";
        public static final String CHEQUE_NO="CHEQUE_NO";
        public static final String POS_USER = "POS_USER";
        public static final String FLAG = "FLAG";
        public static final String S_FLAG=  "S_FLAG";
        public static final String PAYMENTDATE= "PAYMENTDATE";
        public static final String M_FLAG="M_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_TEMP_VENDORPAYMENT =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_TEMP_VENDORPAYMENT).build();
        public static final String CONTENT_TYPE_TEMP_VENDORPAYMENT =
                "vnd.android.cursor.dir/" + CONTENT_URI_TEMP_VENDORPAYMENT + "/" + PATH_TEMP_VENDORPAYMENT;
        public static final String CONTENT_ITEM_TYPE_TEMP_VENDORPAYMENT =
                "vnd.android.cursor.item/" + CONTENT_URI_TEMP_VENDORPAYMENT + "/" + PATH_TEMP_VENDORPAYMENT;
    }

    public static abstract class SALESMASTERRETURN{
        public static final String TABLENAME_SALES_MASTER_RETURN = "retail_str_sales_master_return";
        public static final String ID = "ID";
        public static final String STORE_ID= "STORE_ID";
        public static final String TRI_ID="TRI_ID";
        public static final String GRAND_TOTAL = "GRAND_TOTAL";
        public static final String REASON_OF_RETURN= "REASON_OF_RETURN";
        public static final String BUSINESS_DATE = "BUSINESS_DATE";
        public static final String SALE_DATE=  "SALE_DATE";
        public static final String SALE_TIME=  "SALE_TIME";
        public static final String CARD_NO=  "CARD_NO";
        public static final String TOTAL_POINTS=  "TOTAL_POINTS";
        public static final String SCHEME_POINTS=  "SCHEME_POINTS";
        public static final String FLAG=  "FLAG";
        public static final String CREATED_BY =  "CREATED_BY";
        public static final String CREATED_ON =  "CREATED_ON";
        public static final String LAST_MODIFIED =  "LAST_MODIFIED";
        public static final String S_FLAG= "S_FLAG";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG="M_FLAG";
        public static final String EX_TRI_ID="EX_TRI_ID";
        public static final String ORDER_TYPE="ORDER_TYPE";
        public static final String PICK_UP_LOCATION="PICK_UP_LOCATION";
        public static final String DISCOUNT_PERCENT="DISCOUNT_PERCENT";
        public static final String LINE_ITEM_DISC= "LINE_ITEM_DISC";
        public static final String LINE_DISC= "LINE_DISC";


        // ContentProvider information for articles
        public static final Uri CONTENT_URI_SALES_MASTER_RETURN =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_SALES_MASTER_RETURN).build();
        public static final String CONTENT_TYPE_SALES_MASTER_RETURN =
                "vnd.android.cursor.dir/" + CONTENT_URI_SALES_MASTER_RETURN + "/" + PATH_SALES_MASTER_RETURN;
        public static final String CONTENT_ITEM_TYPE_SALES_MASTER_RETURN =
                "vnd.android.cursor.item/" + CONTENT_URI_SALES_MASTER_RETURN + "/" + PATH_SALES_MASTER_RETURN;
    }
    public static abstract class SALESDETAILSRETURN{
        public static final String TABLENAME_SALES_DETAIL_RETURN = "retail_str_sales_detail_return";
        public static final String ID = "ID";
        public static final String TRI_ID="TRI_ID";
        public static final String STORE_ID= "STORE_ID";
        public static final String PROD_NM="PROD_NM";
        public static final String BATCH_NO="BATCH_NO";
        public static final String EXP_DATE="EXP_DATE";
        public static final String S_PRICE="S_PRICE";
        public static final String QTY="QTY";
        public static final String MRP="MRP";
        public static final String AMOUNT="AMOUNT";
        public static final String UOM = "UOM";
        public static final String TOTAL= "TOTAL";
        public static final String STATUS = "STATUS";
        public static final String CARD_NO=  "CARD_NO";
        public static final String ITEM_ID=  "ITEM_ID";
        public static final String DISC_PERC=  "DISC_PERC";
        public static final String DISC_VAL=  "DISC_VAL";
        public static final String TAX_PER =  "TAX_PER";
        public static final String TAX_VALUE =  "TAX_VALUE";
        public static final String TAX_PER1 =  "TAX_PER1";
        public static final String TAX_VALUE1= "TAX_VALUE1";
        public static final String TAX_PER2= "TAX_PER2";
        public static final String TAX_VALUE2="TAX_VALUE2";
        public static final String TAX_PER3="TAX_PER3";
        public static final String S_FLAG="S_FLAG";
        public static final String FLAG="FLAG";
        public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String SALE_DATE="SALE_DATE";
        public static final String POS_USER="POS_USER";
        public static final String M_FLAG="M_FLAG";
        public static final String EX_TRI_ID="EX_TRI_ID";
        public static final String ORDER_TYPE="ORDER_TYPE";
        public static final String PICK_UP_LOCATION="PICK_UP_LOCATION";
        public static final String DISCOUNT_PERCENT="DISCOUNT_PERCENT";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_SALES_DETAILS_RETURN =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_SALES_DETAILS_RETURN).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_SALES_DETAILS_RETURN + "/" + PATH_SALES_DETAILS_RETURN;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_SALES_DETAILS_RETURN + "/" + PATH_SALES_DETAILS_RETURN;
    }
    public static abstract class STRDISTRIBUTOR{
        public static final String TABLENAME_STR_DISTRIBUTOR = "retail_str_dstr";
        public static final String STORE_ID="STORE_ID";
        public static final String DSTR_ID = "DSTR_ID";
        public static final String DSTR_NM="DSTR_NM";
        public static final String DSTR_CNTCT_NM= "DSTR_CNTCT_NM";
        public static final String ADD_1="ADD_1";
        public static final String CITY="CITY";
        public static final String CTR_NM="CTR_NM";
        public static final String ZIP="ZIP";
        public static final String TELE="TELE";
        public static final String MOBILE="MOBILE";
        public static final String DSTR_INV="DSTR_INV";
        public static final String ACTIVE = "ACTIVE";
        public static final String EMAIL= "EMAIL";
        //public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String USER="USER";
        public static final String S_FLAG="S_FLAG";
        public static final String POS_USER="POS_USER";
        public static final String M_FLAG="M_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_STR_DISTRIBUTOR =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_STR_DISTRIBUTOR).build();
        public static final String CONTENT_TYPE_STR_DISTRIBUTOR =
                "vnd.android.cursor.dir/" + CONTENT_URI_STR_DISTRIBUTOR + "/" + PATH_STR_DISTRIBUTOR;
        public static final String CONTENT_ITEM_TYPE_STR_DISTRIBUTOR =
                "vnd.android.cursor.item/" + CONTENT_URI_STR_DISTRIBUTOR + "/" + PATH_STR_DISTRIBUTOR;
    }


    public static abstract class SENDMAILPDF{
        public static final String TABLENAME_SEND_MAIL_PDF= "retail_send_mail_pdf";
        public static final String TXN_ID  ="TXN_ID";
        public static final String UNIVERSAL_ID = "UNIVERSAL_ID";
        public static final String PREFIX_NM = "PREFIX_NM";
        public static final String FM = "FM";
        public static final String EMAIL_TO = "EMAIL_TO";
        public static final String CC = "CC";
        public static final String SUBJECT = "SUBJECT";
        public static final String BODY= "BODY";
        public static final String FLAG="FLAG";
        public static final String PO_NO="PO_NO";
        public static final String VENDOR_NAME = "VENDOR_NAME";
        public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String S_FLAG= "S_FLAG";
        public static final String POS_USER= "POS_USER";
        public static final String STORE_ID = "STORE_ID";
        public static final String M_FLAG = "M_FLAG";
        public static final String SLAVE_FLAG="SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_SEND_MAIL_PDF =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_SEND_MAIL_PDF).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_SEND_MAIL_PDF + "/" + PATH_SEND_MAIL_PDF;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_SEND_MAIL_PDF + "/" + PATH_SEND_MAIL_PDF;
    }

    public static abstract class ADTICKERMAIN{
        public static final String TABLENAME_AD_TICKER_MAIN= "ad_ticker_main";
        public static final String AD_MAIN_ID= "AD_MAIN_ID";
        public static final String USER = "USER";
        public static final String STORE_ID =  "STORE_ID";
        public static final String AD_DESC = "AD_DESC";
        public static final String AD_TEXT ="AD_TEXT";
        public static final String AD_STRT_DT = "AD_STRT_DT";
        public static final String AD_END_DT = "AD_END_DT";
        public static final String STATUS =  "STATUS";
       // public static final String LAST_MODIFIED ="LAST_MODIFIED";
        public static final String S_FLAG= "S_FLAG";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG= "M_FLAG";
       // public static final String SLAVE_FLAG= "SLAVE_FLAG";
       // public static final String STORE_MEDIA_ID="STORE_MEDIA_ID";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_AD_TICKER_MAIN =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_AD_TICKER_MAIN).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_AD_TICKER_MAIN + "/" + PATH_AD_TICKER_MAIN;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_AD_TICKER_MAIN + "/" + PATH_AD_TICKER_MAIN;
    }
    public static abstract class TOPPRODUCT{
        public static final String TABLENAME_TOP_PRODUCT= "retail_top_product";
        public static final String STORE_ID= "STORE_ID";
        public static final String PROD_ID = "PROD_ID";
        public static final String PROD_NM =  "PROD_NM";
        public static final String PROD_SHORT_NM = "PROD_SHORT_NM";
        public static final String LAST_MODIFIED ="LAST_MODIFIED";
        public static final String S_FLAG = "S_FLAG";
        public static final String ACTIVE = "ACTIVE";
        public static final String POS_USER ="POS_USER";
        public static final String M_FLAG= "M_FLAG";
       // public static final String SLAVE_FLAG= "SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_TOP_PRODUCT =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_TOP_PRODUCT).build();
        public static final String CONTENT_TYPE_TOP_PRODUCT =
                "vnd.android.cursor.dir/" + CONTENT_URI_TOP_PRODUCT + "/" + PATH_TOP_PRODUCT;
        public static final String CONTENT_ITEM_TYPE_TOP_PRODUCT =
                "vnd.android.cursor.item/" + CONTENT_URI_TOP_PRODUCT + "/" + PATH_TOP_PRODUCT;
    }
    public static abstract class EMPLOYEES{
        public static final String TABLENAME_EMPLOYEES= "retail_employees";
        public static final String STORE_ID= "STORE_ID";
        public static final String USR_NM = "USR_NM";
        public static final String FIRST_NAME =  "FIRST_NAME";
        public static final String LAST_NAME = "LAST_NAME";
        public static final String PASSWORD ="PASSWORD";
        public static final String CONFIRM_PASSWORD = "CONFIRM_PASSWORD";
        public static final String ACTIVE = "ACTIVE";
       // public static final String LAST_MODIFIED ="LAST_MODIFIED";
        public static final String S_FLAG= "S_FLAG";
        public static final String POS_USER="POS_USER";
        public static final String M_FLAG ="M_FLAG";
       // public static final String SLAVE_FLAG= "SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_EMPLOYEES =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_EMPLOYEES).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_EMPLOYEES + "/" + PATH_EMPLOYEES;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_EMPLOYEES + "/" + PATH_EMPLOYEES;
    }
    public static abstract class VENDREJECT{
        public static final String TABLENAME_VEND_REJECT= "retail_store_vend_reject";
        public static final String STORE_ID= "STORE_ID";
        public static final String ID = "ID";
        public static final String REASON_FOR_REJECTION =  "REASON_FOR_REJECTION";
       // public static final String LAST_MODIFIED = "LAST_MODIFIED";
        public static final String S_FLAG ="S_FLAG";
        public static final String ACTIVE = "ACTIVE";
        public static final String POS_USER = "POS_USER";
        public static final String M_FLAG = "M_FLAG";
       // public static final String SLAVE_FLAG = "SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_VEND_REJECT =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_VEND_REJECT).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_VEND_REJECT + "/" + PATH_VEND_REJECT;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_VEND_REJECT + "/" + PATH_VEND_REJECT;
    }
    public static abstract class VENDORDETAILRETURN{
        public static final String TABLENAME_VENDOR_DETAIL_RETURN= "retail_str_vendor_detail_return";
        public static final String VENDOR_RETURN_ID= "VENDOR_RETURN_ID";
        public static final String PROD_NM = "PROD_NM";
        public static final String STORE_ID =  "STORE_ID";
        public static final String VENDOR_NM = "VENDOR_NM";
        public static final String REASON_OF_RETURN ="REASON_OF_RETURN";
        public static final String EXP_DATE = "EXP_DATE";
        public static final String QTY = "QTY";
       // public static final String BATCH_NO =  "BATCH_NO";
        public static final String P_PRICE ="P_PRICE";
        public static final String UOM= "UOM";
        public static final String TOTAL= "TOTAL";
      //  public static final String LAST_MODIFIED= "LAST_MODIFIED";
        public static final String MRP= "MRP";
        public static final String S_FLAG="S_FLAG";
        public static final String POS_USER="POS_USER";
        public static final String RETURN_DATE="RETURN_DATE";
        public static final String M_FLAG= "M_FLAG";
       // public static final String SLAVE_FLAG= "SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_VENDOR_DETAIL_RETURN =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_VENDOR_DETAIL_RETURN).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_VENDOR_DETAIL_RETURN + "/" + PATH_VENDOR_DETAIL_RETURN;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_VENDOR_DETAIL_RETURN + "/" + PATH_VENDOR_DETAIL_RETURN;
    }
    public static abstract class STOREMAINTAIN{
        public static final String TABLENAME_STOREMAINTAIN= "retail_store_maint";

        public static final String TICKET_ID  ="TICKET_ID";
        public static final String STORE_ID = "STORE_ID";
        public static final String SUBJECT_DESC = "SUBJECT_DESC";
        public static final String SUPPORT_PRIORITY = "SUPPORT_PRIORITY";
        public static final String SUPPORT_TICKET_STATUS = "SUPPORT_TICKET_STATUS";
        public static final String TEAM_GROUP = "TEAM_GROUP";
        public static final String TEAM_MEMBER = "TEAM_MEMBER";
        public static final String COMMENT = "COMMENT";
        //public static final String LAST_MODIFIED = "LAST_MODIFIED";
        public static final String STATUS = "STATUS";
        public static final String USER = "USER";
        public static final String DATE = "DATE";
        public static final String S_FLAG="S_FLAG";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG = "M_FLAG";
       // public static final String SLAVE_FLAG = "SLAVE_FLAG";
       // public static final String EXACT_TIME = "EXACT_TIME";

        // ContentProvider information for articles
        public static final Uri CONTENT_URI_STOREMAINTAIN =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_STOREMAINTAIN).build();
        public static final String CONTENT_TYPE_STOREMAINTAIN =
                "vnd.android.cursor.dir/" + CONTENT_URI_STOREMAINTAIN + "/" + PATH_STOREMAINTAIN;
        public static final String CONTENT_ITEM_TYPE_STOREMAINTAIN =
                "vnd.android.cursor.item/" + CONTENT_URI_STOREMAINTAIN + "/" + PATH_STOREMAINTAIN;
    }
    public static abstract class BLINKINGLOGOMAIL{
        public static final String TABLENAME_BLINKINGLOGO_MAIL= "retail_ad_blinkinglogo_mail";
        public static final String TICKET_ID  ="TICKET_ID";
        public static final String AD_MAIN_ID = "AD_MAIN_ID";
        public static final String AD_DESC = "AD_DESC";
        public static final String AD_STRT_DT = "AD_STRT_DT";
        public static final String AD_END_DT = "AD_END_DT";
        public static final String AD_CST_SLB1 = "AD_CST_SLB1";
        public static final String AD_CST_SLB2 = "AD_CST_SLB2";
        public static final String AD_CST_SLB3 = "AD_CST_SLB3";
        public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String POS_USER = "POS_USER";
        public static final String FLAG = "FLAG";
        public static final String S_FLAG = "S_FLAG";
        public static final String M_FLAG = "M_FLAG";
        public static final String SLAVE_FLAG = "SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_BLINKINGLOGO_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_BLINKINGLOGO_MAIL).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_BLINKINGLOGO_MAIL + "/" + PATH_BLINKINGLOGO_MAIL;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_BLINKINGLOGO_MAIL + "/" + PATH_BLINKINGLOGO_MAIL;
    }
    public static abstract class ADSTOREMAINMAIL{
        public static final String TABLENAME_ADSTORE_MAIN_MAIL= "retail_ad_store_main_mail";
        public static final String TICKET_ID  ="TICKET_ID";
        public static final String AD_MAIN_ID = "AD_MAIN_ID";
        public static final String AD_DESC = "AD_DESC";
        public static final String AD_CST_SLB1 = "AD_CST_SLB1";
        public static final String AD_CST_SLB2 = "AD_CST_SLB2";
        public static final String AD_CST_SLB3 = "AD_CST_SLB3";
        public static final String STATUS="STATUS";
        public static final String ACTIVE = "ACTIVE";
        public static final String POS_USER = "POS_USER";
        public static final String FLAG = "FLAG";
        public static final String S_FLAG = "S_FLAG";
        public static final String M_FLAG = "M_FLAG";
        public static final String SLAVE_FLAG = "SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_ADSTORE_MAIN_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_ADSTORE_MAIN_MAIL).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_ADSTORE_MAIN_MAIL + "/" + PATH_ADSTORE_MAIN_MAIL;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_ADSTORE_MAIN_MAIL + "/" + PATH_ADSTORE_MAIN_MAIL;
    }
    public static abstract class ADTICKERMAIL{
        public static final String TABLENAME_ADTICKER_MAIL= "retail_ad_ticker_mail";
        public static final String TICKET_ID="TICKET_ID";
        public static final  String AD_MAIN_ID="AD_MAIN_ID";
        public static final String AD_TEXT="AD_TEXT";
        public static final String AD_CST_SLB1="AD_CST_SLB1";
       // public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String POS_USER="POS_USER";
        public static final String FLAG="FLAG";
        public static final String S_FLAG="S_FLAG";
        public static final String M_FLAG="m_FLAG";
       // public static final String SLAVE_FLAG="SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_ADTICKER_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_ADTICKER_MAIL).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_ADTICKER_MAIL + "/" + PATH_ADTICKER_MAIL;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_ADTICKER_MAIL + "/" + PATH_ADTICKER_MAIL;
    }
    public static abstract class PRODCPGMAIL{
        public static final String TABLENAME_PROD_CPG_MAIL= "retail_store_prod_cpg_mail";
        public static final String TICKET_ID = "TICKET_ID";
        public static final String PROD_NM="PROD_NM";
        public static final String ACTIVE = "ACTIVE";
        public static final String POS_USER="POS_USER";
        public static final String FLAG="FLAG";
        public static final String S_FLAG="S_FLAG";
        public static final String M_FLAG="M_FLAG";
        public static final String STORE_ID="STORE_ID";
        public static final String SLAVE_FLAG="SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_PROD_CPG_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_PROD_CPG_MAIL).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_PROD_CPG_MAIL + "/" + PATH_PROD_CPG_MAIL;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_PROD_CPG_MAIL + "/" + PATH_PROD_CPG_MAIL;
    }
    public static abstract class PRODLOCALCPGMAIL{
        public static final String TABLENAME_PROD_LOCAL_CPG_MAIL= "retail_store_prod_local_cpg_mail";
        public static final String TICKET_ID = "TICKET_ID";
        public static final String PROD_NM="PROD_NM";
        public static final String ACTIVE = "ACTIVE";
        public static final String POS_USER="POS_USER";
        public static final String FLAG="FLAG";
        public static final String S_FLAG="S_FLAG";
        public static final String M_FLAG="M_FLAG";
        public static final String STORE_ID="STORE_ID";
        public static final String SLAVE_FLAG="SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_PROD_LOCAL_CPG_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_PROD_LOCAL_CPG_MAIL).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_PROD_LOCAL_CPG_MAIL + "/" + PATH_PROD_LOCAL_CPG_MAIL;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_PROD_LOCAL_CPG_MAIL + "/" + PATH_PROD_LOCAL_CPG_MAIL;
    }
    public static abstract class PRODLOCALMAIL{
        public static final String TABLENAME_PROD_LOCAL_MAIL= "retail_store_prod_local_mail";
        public static final String TICKET_ID="TICKET_ID";
        public static final String PROD_NM="PROD_NM";
        public static final String ACTIVE="ACTIVE";
        public static final String BARCODE="BARCODE";
        public static final String MRP="MRP";
        public static final String P_PRICE="P_PRICE";
        public static final String S_PRICE="S_PRICE";
        public static final String POS_USER="POS_USER";
        public static final String FLAG="FLAG";
        public static final String S_FLAG="S_FLAG";
        public static final String M_FLAG="M_FLAG";
        public static final String STORE_ID="STORE_ID";
        public static final String SLAVE_FLAG="SLAVE_FLAG";
        // ContentProvider information for articles
        public static final Uri CONTENT_URI_PROD_LOCAL_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_PROD_LOCAL_MAIL).build();
        public static final String CONTENT_TYPE_DETAIL =
                "vnd.android.cursor.dir/" + CONTENT_URI_PROD_LOCAL_MAIL + "/" + PATH_PROD_LOCAL_MAIL;
        public static final String CONTENT_ITEM_TYPE_DETAIL =
                "vnd.android.cursor.item/" + CONTENT_URI_PROD_LOCAL_MAIL + "/" + PATH_PROD_LOCAL_MAIL;
    }
    public static abstract class SalesMaster {
        public static final String TABLENAME_SALES_MASTER = "retail_str_sales_master";
        public static final String TRANSACTION_ID ="TRI_ID";
        public static final String STORE_ID  ="STORE_ID";
        public static final String GRAND_TOTAL = "GRAND_TOTAL";
        public static final String BUSINESS_DATE = "BUSINESS_DATE";
        public static final String SALE_DATE = "SALE_DATE";
        public static final String SALE_TIME = "SALE_TIME";
        public static final String CARD_NO = "CARD_NO";
        public static final String TOTAL_POINTS = "TOTAL_POINTS";
        public static final String SCHEME_POINTS= "SCHEME_POINTS";
        public static final String FLAG="FLAG";
        public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String CREATED_BY="CREATED_BY";
        public static final String CREATED_ON = "CREATED_ON";
        public static final String CUST_ID="CUST_ID";
        public static final String S_FLAG= "S_FLAG";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG = "M_FLAG";
        public static final String EX_TRI_ID = "EX_TRI_ID";
        public static final String ORDER_TYPE="ORDER_TYPE";
        public static final String PICK_UP_LOCATION="PICK_UP_LOCATION";
        public static final String DISCOUNT_PERCENT="DISCOUNT_PERCENT";
        public static final String LINE_ITEM_DISC= "LINE_ITEM_DISC";
        public static final String LINE_DISC ="LINE_DISC";
        public static final String CUST_NAME ="CUST_NAME";
        public static final String CUST_CNCT ="CUST_CNCT";
        public static final String DOCT_NAME= "DOCT_NAME";
        public static final String DOCT_SPEC="DOCT_SPEC";
        public static final String BANK_NAME="BANK_NAME";
        public static final String CARD_TYPE="CARD_TYPE";
        public static final String SAVETOTALBILLDISCOUNT="SAVETOTALBILLDISCOUNT";
        public static final String SAVETOTALBILLAMOUNT="SAVETOTALBILLAMOUNT";
        public static final String SAVEFINALBILLAMOUNT="SAVEFINALBILLAMOUNT";
        public static final String SAVERECEIVEDBILLAMOUNT="SAVERECEIVEDBILLAMOUNT";
        public static final String SAVEEXPECTEDBILLAMOUNT="SAVEEXPECTEDBILLAMOUNT";
        public static final String SLAVE_FLAG="SLAVE_FLAG";
        // ContentProvider information for articles..........
        public static final Uri CONTENT_URI_SALES_MASTER =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_SALES_MASTER).build();
        public static final String CONTENT_TYPE_MASTER =
                "vnd.android.cursor.dir/" + CONTENT_URI_SALES_MASTER + "/" +PATH_SALES_MASTER;
        public static final String CONTENT_ITEM_TYPE_MASTER =
                "vnd.android.cursor.item/" + CONTENT_URI_SALES_MASTER + "/" + PATH_SALES_MASTER;
    }
    public static abstract class ProdCom {
        public static final String TABLE_PROD_COM="retail_store_prod_com";
        public static final String STORE_ID  ="STORE_ID";
        public static final String PROD_ID = "PROD_ID";
        public static final String PROD_NAME = "PROD_NM";
        public static final String BARCODE = "BARCODE";
        public static final String MRP = "MRP";
        public static final String S_PRICE = "S_PRICE";
        public static final String P_PRICE = "P_PRICE";
        public static final String SELLING_ORDER_UNIT = "SELLING_ORDER_UNIT";
        public static final String INTERNET_PRICE= "INTERNET_PRICE";
        public static final String IS_PROD_REL_INT="IS_PROD_REL_INT";
        public static final String ACTIVE="ACTIVE";
        public static final String PROFIT_MARGIN = "PROFIT_MARGIN";
        //public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String S_FLAG= "S_FLAG";
        public static final String IND_NAME = "IND_NM";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG = "M_FLAG";
        public static final String DISCOUNT_PERCENT="DISCOUNT_PERCENT";
        public static final String DISCOUNT_PERCENT_AMOUNT="DISCOUNT_PERCENT_AMOUNT";
        public static final String DSTR_NM="DSTR_NM";
        //public static final String SLAVE_FLAG="SLAVE_FLAG";
       // public static final String MAX_STOCK="MAX_STOCK";



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_PROD_COM =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_PROD_COM).build();
        public static final String CONTENT_TYPE_PROD =
                "vnd.android.cursor.dir/" + CONTENT_URI_PROD_COM + "/" + PATH_PROD_COM;
        public static final String CONTENT_ITEM_TYPE_PROD =
                "vnd.android.cursor.item/" + CONTENT_URI_PROD_COM + "/" + PATH_PROD_COM;
    }
    public static abstract class ProdCPG {

        public static final String TABLENAME_PROD_CPG="retail_store_prod_cpg";

        public static final String STORE_ID  ="STORE_ID";
        public static final String PROD_ID = "PROD_ID";
        public static final String PROD_NAME = "PROD_NM";
        public static final String BARCODE = "BARCODE";
        public static final String MRP = "MRP";
        public static final String S_PRICE = "S_PRICE";
        public static final String P_PRICE = "P_PRICE";
        public static final String SELLING_ORDER_UNIT = "SELLING_ORDER_UNIT";
        public static final String INTERNET_PRICE= "INTERNET_PRICE";
        public static final String IS_PROD_REL_INT="IS_PROD_REL_INT";
        public static final String TAX_DESC = "TAX_DESC";
        public static final String PROD_HIER_DESC_3 = "PROD_HIER_DESC_3";
        public static final String PACK_UNIT_1 = "PACK_UNIT_1";
        public static final String PACK_UNIT_2 = "PACK_UNIT_2";
        public static final String MFG = "MFG";
        public static final String ACTIVE="ACTIVE";
        public static final String C_IMG = "C_IMG";
        public static final String PROFIT_MARGIN = "PROFIT_MARGIN";
        public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String USER = "USER";
        public static final String S_FLAG= "S_FLAG";
        public static final String IND_NAME = "IND_NM";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG = "M_FLAG";
        public static final String DISCOUNT_PERCENT = "DISCOUNT_PERCENT";
        public static final String DISCOUNT_PERCENT_AMOUNT ="DISCOUNT_PERCENT_AMOUNT";


        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_PROD_CPG =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_PROD_CPG).build();
        public static final String CONTENT_TYPE_PROD_CPG =
                "vnd.android.cursor.dir/" + CONTENT_URI_PROD_CPG + "/" + PATH_PROD_CPG;
        public static final String CONTENT_ITEM_TYPE_PROD_CPG =
                "vnd.android.cursor.item/" + CONTENT_URI_PROD_CPG + "/" + PATH_PROD_CPG;
    }
    public static abstract class LocalProdCPG {
        public static final String TABLENAME_LOCAL_PROD_CPG="retail_store_prod_local_cpg";
        public static final String STORE_ID  ="STORE_ID";
        public static final String PROD_ID = "PROD_ID";
        public static final String PROD_NAME = "PROD_NM";
        public static final String BARCODE = "BARCODE";
        public static final String MRP = "MRP";
        public static final String S_PRICE = "S_PRICE";
        public static final String P_PRICE = "P_PRICE";
        public static final String TAX_ID = "TAX_ID";
        public static final String INTERNET_PRICE= "INTERNET_PRICE";
        public static final String IS_PROD_REL_INT="IS_PROD_REL_INT";
        public static final String ACTIVE="ACTIVE";
        public static final String PROFIT_MARGIN = "PROFIT_MARGIN";
        public static final String LAST_MODIFIED="LAST_MODIFIED";
        public static final String S_FLAG= "S_FLAG";
        public static final String IND_NAME = "IND_NM";
        public static final String CONV_FACT="CONV_FACT";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG = "M_FLAG";
        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_LOCAL_PROD_CPG =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_LOCAL_PROD_CPG).build();
        public static final String CONTENT_TYPE_LOCAL_PROD_CPG =
                "vnd.android.cursor.dir/" + CONTENT_URI_LOCAL_PROD_CPG + "/" + PATH_LOCAL_PROD_CPG;
        public static final String CONTENT_ITEM_TYPE_LOCAL_PROD_CPG =
                "vnd.android.cursor.item/" + CONTENT_URI_LOCAL_PROD_CPG + "/" + PATH_LOCAL_PROD_CPG;
    }
    public static abstract class Grn_Master {
        public static final String TABLENAME_GRN_MASTER="retail_str_grn_master";
        public static final String STORE_ID ="STORE_ID";
       // public static final String MRP = "MRP";
        public static final String GRN_ID ="GRN_ID";
        public static final String PO_NO ="PO_NO";
        public static final String VEND_NM ="VEND_NM";
        public static final String GRAND_AMOUNT ="GRAND_AMOUNT";
        public static final String FLAG="FLAG";
        public static final String S_FLAG ="S_FLAG";

       // public static final String LAST_MODIFIED ="LAST_MODIFIED";
        public static final String POS_USER ="POS_USER";
        public static final String M_FLAG ="M_FLAG";
       // public static final String SLAVE_FLAG ="SLAVE_FLAG";
        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_GRN_MASTER =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_GRN_MASTER).build();
        public static final String CONTENT_TYPE_STOCK_MASTER =
                "vnd.android.cursor.dir/" + CONTENT_URI_GRN_MASTER + "/" + PATH_GRN_MASTER;
        public static final String CONTENT_ITEM_TYPE_STOCK_MASTER =
                "vnd.android.cursor.item/" + CONTENT_URI_GRN_MASTER + "/" + PATH_GRN_MASTER;
    }

    public static abstract class Retail_store_decimal {

        public static final String TABLENAME_RETAIL_STORE ="retail_store_decimal";
        public static final String STORE_ID = "STORE_ID";
        public static final String MRP_DECIMAL ="MRP_DECIMAL";
        public static final String P_PRICE_DECIMAL ="P_PRICE_DECIMAL";
        public static final String S_PRICE_DECIMAL= "S_PRICE_DECIMAL";
        public static final String HOLD_PO="HOLD_PO";
        public static final String HOLD_INV="HOLD_INV";
        public static final String HOLD_SALES="HOLD_SALES";
        public static final String S_FLAG="S_FLAG";
        public static final String ROUND_OFF="ROUND_OFF";
        public static final String SALES_HOLD_NO="SALES_HOLD_NO";
        public static final String PURCHASE_HOLD_NO="PURCHASE_HOLD_NO";
        public static final String INV_HOLD_NO="INV_HOLD_NO";
        public static final String POS_USER="POS_USER";
        public static final String M_FLAG="M_FLAG";

        // ContentProvider information for articles..............

        public static final Uri
                CONTENT_URI_RETAIL_STORE_DECIMAL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_STORE_DECIMAL).build();
        public static final String CONTENT_TYPE_RETAIL_STORE_DECIMAL =
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_STORE_DECIMAL + "/" + PATH_RETAIL_STORE_DECIMAL;
        public static final String CONTENT_ITEM_TYPE_RETAIL_STORE_DECIMAL =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_STORE_DECIMAL + "/" + PATH_RETAIL_STORE_DECIMAL;

    }


    public static abstract class DayOpenClose {

        public static final String  TABLENAME_DAY_OPEN_CLOSE ="retail_str_day_open_close";

        public static final String  TRI_ID= "TRI_ID" ;
        public static final String  STORE_ID= "STORE_ID" ;
        public static final String  BUSINESS_DATE= "BUSINESS_DATE" ;
        public static final String  START_DATE= "START_DATE" ;
        public static final String  START_CASH= "START_CASH" ;
        public static final String  CBCASH_ONHAND= "CBCASH_ONHAND" ;
        public static final String  START_TIME= "START_TIME" ;
        public static final String  START_USER_ID= "START_USER_ID" ;
        public static final String  OPCASH_ONHAND= "OPCASH_ONHAND" ;
        public static final String  OP_CUR= "OP_CUR" ;
        public static final String  END_DATE= "END_DATE" ;
        public static final String  END_TIME= "END_TIME" ;
        public static final String  END_USER_ID= "END_USER_ID" ;
        public static final String  CB_CUR= "CB_CUR" ;
        public static final String  STATUS= "STATUS" ;
        public static final String  REMARKS= "REMARKS" ;
        public static final String  FLAG= "FLAG" ;
        public static final String  S_FLAG= "S_FLAG" ;
        public static final String  POS_USER= "POS_USER" ;
        public static final String  M_FLAG= "M_FLAG" ;

        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_DAY_OPEN_CLOSE =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_DAY_OPEN_CLOSE).build();
        public static final String  CONTENT_TYPE_DAY_OPEN_CLOSE =
                "vnd.android.cursor.dir/" + CONTENT_URI_DAY_OPEN_CLOSE + "/" + PATH_DAY_OPEN_CLOSE;
        public static final String  CONTENT_ITEM_TYPE_DAY_OPEN_CLOSE =
                "vnd.android.cursor.item/" + CONTENT_URI_DAY_OPEN_CLOSE + "/" + PATH_DAY_OPEN_CLOSE;
    }


    public static abstract class Retail_bill_display {

        public static final String TABLENAME_RETAIL_BILL_DISPLAY ="retail_bill_display";
        public static final String STORE_ID="STORE_ID" ;
        public static final String TOTAL_BILL_VALUE= "TOTAL_BILL_VALUE" ;
        public static final String DISCOUNT= "DISCOUNT" ;
        public static final String NET_BILL_PAYABLE= "NET_BILL_PAYABLE" ;
        public static final String AMOUNT_RECEIVED= "AMOUNT_RECEIVED" ;
        public static final String AMOUNT_PAID_BACK= "AMOUNT_PAID_BACK" ;
        public static final String FOOTER= "FOOTER" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String M_FLAG= "M_FLAG" ;

        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_BILL_DISPLAY =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_BILL_DISPLAY).build();
        public static final String CONTENT_TYPE_RETAIL_BILL_DISPLAY=
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_BILL_DISPLAY + "/" + PATH_RETAIL_BILL_DISPLAY;
        public static final String CONTENT_ITEM_TYPE_RETAIL_BILL_DISPLAY =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_BILL_DISPLAY + "/" + PATH_RETAIL_BILL_DISPLAY;
    }


    public static abstract class Retail_bill_visible {

        public static final String TABLENAME_RETAIL_BILL_VISIBLE="retail_bill_visible";
        public static final String STORE_ID="STORE_ID";
        public static final String STORE_NAME="STORE_NAME";
        public static final String STORE_ADDRESS="STORE_ADDRESS";
        public static final String CITY="CITY";
        public static final String STORE_COUNTRY="STORE_COUNTRY";
        public static final String  ZIP= "ZIP";
        public static final String TELE_1= "TELE_1";
        public static final String TELE_2= "TELE_2";
        public static final String MAIN_BODY= "MAIN_BODY";
        public static final String MRP= "MRP";
        public static final String S_PRICE="S_PRICE";
        public static final String QTY="QTY";
        public static final String TOTAL="TOTAL";
        public static final String TOTAL_BILL_VALUE= "TOTAL_BILL_VALUE";
        public static final String DISCOUNT= "DISCOUNT";
        public static final String NET_BILL_PAYABLE= "NET_BILL_PAYABLE";
        public static final String AMOUNT_RECEIVED= "AMOUNT_RECEIVED";
        public static final String AMOUNT_PAID_BACK= "AMOUNT_PAID_BACK";
        public static final String FOOTER= "FOOTER";
        public static final String S_FLAG= "S_FLAG";
        public static final String POS_USER= "POS_USER";
        public static final String M_FLAG= "M_FLAG";
        public static final String NORMAL_SALES= "NORMAL_SALES";
        public static final String CREDIT_CUSTOMER= "CREDIT_CUSTOMER";
        public static final String RETURNS= "RETURNS";
        public static final String SLAVE_FLAG= "SLAVE_FLAG";
        public static final String MARGIN= "MARGIN";
        public static final String FREE_GOODS= "FREE_GOODS";
        public static final String INV_PRINT= "INV_PRINT";
        public static final String OTP_CHECK=  "OTP_CHECK";
        public static final String BARCODE_VISIBLE= "BARCODE_VISIBLE";
        public static final String LOYALITY= "LOYALITY";
        public static final String CARD_MACHINE= "CARD_MACHINE";
        public static final String M_CASH= "M_CASH";

        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_BILL_VISIBLE =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_BILL_VISIBLE).build();
        public static final String CONTENT_TYPE_RETAIL_BILL_VISIBLE=
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_BILL_VISIBLE + "/" + PATH_RETAIL_BILL_VISIBLE;
        public static final String CONTENT_ITEM_TYPE_RETAIL_BILL_VISIBLE =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_BILL_VISIBLE + "/" + PATH_RETAIL_BILL_VISIBLE;
    }


    public static abstract class Retail_card_define{

        public static final String TABLENAME_RETAIL_CARD_DEFINE ="retail_Card_define";
        public static final String STORE_ID= "STORE_ID" ;
        public static final String ID = "ID" ;
        public static final String USER= "USER" ;
        public static final String CARD_TYPE= "CARD_TYPE" ;
        public static final String POINTS_RANGE= "POINTS_RANGE" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String M_FLAG="M_FLAG" ;
        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_CARD_DEFINE =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_CARD_DEFINE).build();
        public static final String CONTENT_TYPE_RETAIL_CARD_DEFINE=
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_CARD_DEFINE + "/" + PATH_RETAIL_CARD_DEFINE;
        public static final String CONTENT_ITEM_TYPE_RETAIL_CARD_DEFINE =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_CARD_DEFINE+ "/" + PATH_RETAIL_CARD_DEFINE;
    }

    public static abstract class Retail_Cust{

        public static final String TABLENAME_RETAIL_CUST ="retail_cust";
        public static final String CUST_ID= "CUST_ID" ;
        public static final String NAME= "NAME" ;
        public static final String E_MAIL= "E_MAIL" ;
        public static final String MOBILE_NO= "MOBILE_NO" ;
        public static final String PASSWORD= "PASSWORD" ;
        public static final String CREDIT_CUST= "CREDIT_CUST" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String STORE_ID= "STORE_ID" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String M_FLAG= "M_FLAG" ;
        public static final String CUST_ADD= "CUST_ADD" ;

        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_CUST  =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_CUST ).build();
        public static final String CONTENT_TYPE_RETAIL_CUST =
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_CUST  + "/" + PATH_RETAIL_CUST ;
        public static final String CONTENT_ITEM_TYPE_RETAIL_CUST  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_CUST + "/" + PATH_RETAIL_CUST ;
    }

    public static abstract class Retail_Line_Item_Disc{

        public static final String TABLENAME_RETAIL_LINE_ITEM_DISC ="retail_str_lineitem_disc";
        public static final String  STORE_ID="STORE_ID";
        public static final String  LINE_ITEM_NM= "LINE_ITEM_NM";
        public static final String  LINE_ITEM_DISC= "LINE_ITEM_DISC";
        public static final String  LINE_ITEM_ID= "LINEITEM_ID";
        public static final String  S_FLAG= "S_FLAG";
        public static final String  ACTIVE= "ACTIVE";
        public static final String  POS_USER= "POS_USER";
        public static final String  M_FLAG= "M_FLAG";


        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_LINE_ITEM_DISC  =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_LINE_ITEM_DISC ).build();
        public static final String CONTENT_TYPE_RETAIL_LINE_ITEM_DISC =
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_LINE_ITEM_DISC  + "/" + PATH_RETAIL_LINE_ITEM_DISC ;
        public static final String CONTENT_ITEM_TYPE_RETAIL_LINE_ITEM_DISC  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_LINE_ITEM_DISC + "/" + PATH_RETAIL_LINE_ITEM_DISC ;
    }



    public static abstract class Retail_Media_Click{

        public static final String TABLENAME_RETAIL_MEDIA_CLICK ="retail_media_click";
        public static final String AD_PLAY = "AD_PLAY" ;
        public static final String STORE_MEDIA_ID = "STORE_MEDIA_ID" ;
        public static final String MOBILE_NO = "MOBILE_NO" ;
        public static final String CLICK = "CLICK" ;
        public static final String S_FLAG = "S_FLAG" ;
        public static final String POS_USER = "POS_USER" ;
        public static final String M_FLAG = "M_FLAG" ;
        public static final String CUSTOMER_NM = "CUSTOMER_NM" ;
        public static final String AD_PLAY_NAME = "AD_PLAY_NAME" ;
        public static final String VIDEO_MAIL_FLAG = "VIDEO_MAIL_FLAG" ;


        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_MEDIA_CLICK  =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_MEDIA_CLICK ).build();
        public static final String CONTENT_TYPE_RETAIL_MEDIA_CLICK =
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_MEDIA_CLICK  + "/" + PATH_RETAIL_MEDIA_CLICK;
        public static final String CONTENT_ITEM_TYPE_RETAIL_MEDIA_CLICK  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_MEDIA_CLICK + "/" + PATH_RETAIL_MEDIA_CLICK ;
    }

    public static abstract class Retail_Str_Bill_Lvl_Disc{

        public static final String TABLENAME_RETAIL_STR_BILL_LVL_DISC ="retail_str_bill_lvl_disc ";
        public static final String STORE_ID = "STORE_ID";
        public static final String BILL_LVL_NAME = "BILL_LVL_NAME" ;
        public static final String DISC_TYPE= "DISC_TYPE" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String ACTIVE= "ACTIVE" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String M_FLAG= "M_FLAG" ;



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_STR_BILL_LVL_DISC  =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_BILL_LEVEL_DISC ).build();
        public static final String CONTENT_TYPE_RETAIL_STR_BILL_LVL_DISC=
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_STR_BILL_LVL_DISC  + "/" + PATH_BILL_LEVEL_DISC;
        public static final String CONTENT_ITEM_TYPE_RETAIL_STR_BILL_LVL_DISC  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_STR_BILL_LVL_DISC + "/" + PATH_BILL_LEVEL_DISC ;
    }

    public static abstract class Rule_Definition{

        public static final String TABLENAME_RULE_DEFINITION ="rule_defination";
        public static final String STORE_ID="STORE_ID" ;
        public static final String SNO = "SNO" ;
        public static final String USER= "USER" ;
        public static final String CARD_TYPE= "CARD_TYPE" ;
        public static final String BASE_VALUE= "BASE_VALUE" ;
        public static final String PER_TON_POINTS= "PER_TON_POINTS" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String M_FLAG="M_FLAG" ;



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RULE_DEFINITION =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RULE_DEFINITION ).build();
        public static final String CONTENT_TYPE_RULE_DEFINITION=
                "vnd.android.cursor.dir/" + CONTENT_URI_RULE_DEFINITION  + "/" + PATH_RULE_DEFINITION;
        public static final String CONTENT_ITEM_TYPE_RULE_DEFINITION  =
                "vnd.android.cursor.item/" + CONTENT_URI_RULE_DEFINITION + "/" + PATH_RULE_DEFINITION ;
    }


    public static abstract class Sales_Detail_Return_Mail{

        public static final String TABLENAME_SALES_DETAIL_RETURN_MAIL="retail_str_sales_detail_return_mail";
        public static final String TICKET_ID= "TICKET_ID" ;
        public static final String TRI_ID= "TRI_ID" ;
        public static final String PROD_NM= "PROD_NM" ;
        public static final String TOTAL= "TOTAL" ;
        public static final String QTY= "QTY" ;
        public static final String SALE_DATE= "SALE_DATE" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String FLAG= "FLAG" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String M_FLAG= "M_FLAG" ;
        public static final String DISCOUNT_PERCENT= "DISCOUNT_PERCENT" ;



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_SALES_DETAIL_RETURN_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_SALES_DETAIL_RETURN_MAIL ).build();
        public static final String CONTENT_TYPE_SALES_DETAIL_RETURN_MAIL=
                "vnd.android.cursor.dir/" + CONTENT_URI_SALES_DETAIL_RETURN_MAIL  + "/" + PATH_SALES_DETAIL_RETURN_MAIL;
        public static final String CONTENT_ITEM_TYPE_RULE_DEFINITION  =
                "vnd.android.cursor.item/" + CONTENT_URI_SALES_DETAIL_RETURN_MAIL + "/" + PATH_SALES_DETAIL_RETURN_MAIL ;
    }

    public static abstract class Stock_Master_Mail{

        public static final String TABLENAME_STOCK_MASTER_MAIL="retail_str_stock_master_mail";
        public static final String TICKET_ID= "TICKET_ID" ;
        public static final String PROD_ID= "PROD_ID" ;
        public static final String PROD_NM= "PROD_NM" ;
        public static final String BATCH_NO= "BATCH_NO" ;
        public static final String EXP_DATE= "EXP_DATE";
        public static final String QTY= "QTY" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String FLAG= "FLAG" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String M_FLAG= "M_FLAG" ;



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_STOCK_MASTER_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_STOCK_MASTER_MAIL ).build();
        public static final String CONTENT_TYPE_STOCK_MASTER_MAIL=
                "vnd.android.cursor.dir/" + CONTENT_URI_STOCK_MASTER_MAIL  + "/" + PATH_STOCK_MASTER_MAIL;
        public static final String CONTENT_ITEM_TYPE_STOCK_MASTER_MAIL  =
                "vnd.android.cursor.item/" + CONTENT_URI_STOCK_MASTER_MAIL + "/" + PATH_STOCK_MASTER_MAIL ;
    }


    public static abstract class Vendor_Detail_Return_Mail{

        public static final String TABLENAME_VENDOR_DETAIL_RETURN_MAIL="retail_str_vendor_detail_return_mail";
        public static final String TICKET_ID= "TICKET_ID";
        public static final String VENDOR_RETURN_ID= "VENDOR_RETURN_ID";
        public static final String VENDOR_NM= "VENDOR_NM";
        public static final String PROD_NM= "PROD_NM";
        public static final String BATCH_NO= "BATCH_NO";
        public static final String EXP_DATE= "EXP_DATE";
        public static final String REASON_OF_RETURN= "REASON_OF_RETURN";
        public static final String QTY= "QTY";
        public static final String P_PRICE= "P_PRICE";
        public static final String TOTAL= "TOTAL";
        public static final String UOM= "UOM";
        public static final String POS_USER= "POS_USER";
        public static final String FLAG= "FLAG";
        public static final String S_FLAG= "S_FLAG";



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_VENDOR_DETAIL_RETURN_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_VENDOR_DETAIL_RETURN_MAIL ).build();
        public static final String CONTENT_TYPE_VENDOR_DETAIL_RETURN_MAIL=
                "vnd.android.cursor.dir/" + CONTENT_URI_VENDOR_DETAIL_RETURN_MAIL  + "/" + PATH_VENDOR_DETAIL_RETURN_MAIL;
        public static final String CONTENT_ITEM_TYPE_VENDOR_DETAIL_RETURN_MAIL  =
                "vnd.android.cursor.item/" + CONTENT_URI_VENDOR_DETAIL_RETURN_MAIL + "/" + PATH_VENDOR_DETAIL_RETURN_MAIL ;
    }


    public static abstract class Retail_Store_Prod_Mail{

        public static final String TABLENAME_RETAIL_STR_PROD_MAIL="retail_store_prod_mail";
        public static final String TICKET_ID= "TICKET_ID" ;
        public static final String PROD_NM= "PROD_NM" ;
        public static final String ACTIVE= "ACTIVE" ;
        public static final String BARCODE= "BARCODE" ;
        public static final String MRP= "MRP" ;
        public static final String S_PRICE= "S_PRICE" ;
        public static final String P_PRICE= "P_PRICE" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String FLAG= "FLAG" ;
        public static final String S_FLAG= "S_FLAG" ;



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_STR_PROD_MAIL=
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_STR_PROD_MAIL ).build();
        public static final String CONTENT_TYPE_RETAIL_STR_PROD_MAIL=
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_STR_PROD_MAIL  + "/" + PATH_RETAIL_STR_PROD_MAIL;
        public static final String CONTENT_ITEM_TYPE_RETAIL_STR_PROD_MAIL  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_STR_PROD_MAIL + "/" + PATH_RETAIL_STR_PROD_MAIL ;
    }

    public static abstract class Retail_Str_Vendor_Mail{

        public static final String TABLENAME_RETAIL_STR_VENDOR_MAIL="retail_store_vendor_mail";
        public static final String TICKET_ID= "TICKET_ID" ;
        public static final String VEND_NM= "VEND_NM" ;
        public static final String ACTIVE= "ACTIVE" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String FLAG= "FLAG" ;
        public static final String S_FLAG= "S_FLAG" ;



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_STR_VENDOR_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_STR_VENDOR_MAIL ).build();
        public static final String CONTENT_TYPE_RETAIL_STR_VENDOR_MAIL=
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_STR_VENDOR_MAIL  + "/" + PATH_RETAIL_STR_VENDOR_MAIL;
        public static final String CONTENT_ITEM_TYPE_RETAIL_STR_VENDOR_MAIL  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_STR_VENDOR_MAIL + "/" + PATH_RETAIL_STR_VENDOR_MAIL ;
    }

    public static abstract class Retail_Str_Dstr_Mail{

        public static final String TABLENAME_RETAIL_STR_DSTR_MAIL="retail_str_dstr_mail";
        public static final String TICKET_ID= "TICKET_ID" ;
        public static final String DSTR_NM= "DSTR_NM" ;
        public static final String ACTIVE= "ACTIVE" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String FLAG= "FLAG" ;
        public static final String S_FLAG= "S_FLAG" ;



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_STR_DSTR_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_STR_DSTR_MAIL).build();
        public static final String CONTENT_TYPE_RETAIL_STR_DSTR_MAIL=
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_STR_DSTR_MAIL  + "/" + PATH_RETAIL_STR_DSTR_MAIL;
        public static final String CONTENT_ITEM_TYPE_RETAIL_STR_DSTR_MAIL  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_STR_DSTR_MAIL + "/" + PATH_RETAIL_STR_DSTR_MAIL ;
    }

    public static abstract class Retail_Str_Po_Detail_Mail{

        public static final String TABLENAME_STORE_PO_DETAIL_MAIL="retail_str_po_detail_mail";
        public static final String TICKET_ID= "TICKET_ID" ;
        public static final String PO_NO = "PO_NO" ;
        public static final String VENDOR_NM= "VENDOR_NM" ;
        public static final String TOTAL= "TOTAL" ;
        public static final String PROD_NM= "PROD_NM" ;
        public static final String P_PRICE= "P_PRICE" ;
        public static final String QTY="QTY" ;
        public static final String UOM= "UOM" ;
        public static final String POS_USER="POS_USER" ;
        public static final String FLAG= "FLAG" ;
        public static final String S_FLAG="S_FLAG" ;



        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_STORE_PO_DETAIL_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_STORE_PO_DETAIL_MAIL).build();
        public static final String CONTENT_TYPE_STORE_PO_DETAIL_MAIL=
                "vnd.android.cursor.dir/" + CONTENT_URI_STORE_PO_DETAIL_MAIL + "/" + PATH_STORE_PO_DETAIL_MAIL;
        public static final String CONTENT_ITEM_TYPE_STORE_PO_DETAIL_MAIL  =
                "vnd.android.cursor.item/" + CONTENT_URI_STORE_PO_DETAIL_MAIL + "/" + PATH_STORE_PO_DETAIL_MAIL ;
    }

    public static abstract class Retail_Sales_Detail_Mail{

        public static final String TABLENAME_SALES_DETAIL_MAIL="retail_str_sales_detail_mail";
        public static final String TICKET_ID= "TICKET_ID" ;
        public static final String TRI_ID= "TRI_ID" ;
        public static final String TOTAL= "TOTAL" ;
        public static final String UOM= "UOM" ;
        public static final String PROD_NM= "PROD_NM" ;
        public static final String EXP_DATE= "EXP_DATE" ;
        public static final String S_PRICE= "S_PRICE" ;
        public static final String QTY= "QTY" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String FLAG= "FLAG" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String M_FLAG= "M_FLAG" ;
        public static final String ORDER_TYPE= "ORDER_TYPE" ;
        public static final String PICK_UP_LOCATION= "PICK_UP_LOCATION" ;




        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_SALES_DETAIL_MAIL =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_SALES_DETAIL_MAIL).build();
        public static final String CONTENT_TYPE_SALES_DETAIL_MAIL=
                "vnd.android.cursor.dir/" + CONTENT_URI_SALES_DETAIL_MAIL + "/" + PATH_SALES_DETAIL_MAIL;
        public static final String CONTENT_ITEM_TYPE_SALES_DETAIL_MAIL  =
                "vnd.android.cursor.item/" + CONTENT_URI_SALES_DETAIL_MAIL + "/" + PATH_SALES_DETAIL_MAIL ;
    }


    public static abstract class Tmp_Vend_Dstr_Payment{

        public static final String TABLENAME_TMP_VEND_DSTR_PAYMENT="tmp_vend_dstr_payment";
        public static final String PAYMENT_ID= "PAYMENT_ID" ;
        public static final String PAY_ID= "PAY_ID" ;
        public static final String VEND_DSTR_NM= "VEND_DSTR_NM" ;
        public static final String REASON_OF_PAY= "REASON_OF_PAY" ;
        public static final String AMOUNT= "AMOUNT" ;
        public static final String RECEIVED_AMOUNT= "RECEIVED_AMOUNT" ;
        public static final String DUE_AMOUNT= "DUE_AMOUNT" ;
        public static final String BANK_NAME= "BANK_NAME" ;
        public static final String CHEQUE_NO= "CHEQUE_NO" ;
        public static final String S_FLAG= "S_FLAG" ;
        public static final String POS_USER= "POS_USER" ;
        public static final String FLAG= "FLAG" ;
        public static final String STORE_ID= "STORE_ID" ;
        public static final String PAYMENT_DATE= "PAYMENT_DATE" ;
        public static final String M_FLAG= "M_FLAG" ;


        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_TMP_VEND_DSTR_PAYMENT =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_TMP_VEND_DSTR_PAYMENT).build();
        public static final String CONTENT_TYPE_TMP_VEND_DSTR_PAYMENT=
                "vnd.android.cursor.dir/" + CONTENT_URI_TMP_VEND_DSTR_PAYMENT + "/" + PATH_TMP_VEND_DSTR_PAYMENT;
        public static final String CONTENT_ITEM_TYPE_TMP_VEND_DSTR_PAYMENT  =
                "vnd.android.cursor.item/" + CONTENT_URI_TMP_VEND_DSTR_PAYMENT + "/" + PATH_TMP_VEND_DSTR_PAYMENT ;
    }

    public static abstract class Retail_store_vendor{

        public static final String TABLENAME_RETAIL_STORE_VENDOR="retail_store_vendor";

        public static final String STORE_ID="STORE_ID";
        public static final String VEND_ID="VEND_ID" ;
        public static final String VEND_NM="VEND_NM" ;
        public static final String VEND_CNTCT_NM="VEND_CNTCT_NM" ;
        public static final String ADD_1="ADD_1" ;
        public static final String CITY="CITY";
        public static final String CTR_DESC="CTR_DESC" ;
        public static final String ZIP="ZIP" ;
        public static final String TELE="TELE" ;
        public static final String MOBILE="MOBILE";
        public static final String EMAIL="EMAIL" ;
        public static final String VEND_INV="VEND_INV";
        public static final String ACTIVE="ACTIVE" ;
        public static final String LAST_MODIFIED="LAST_MODIFIED" ;
        public static final String S_FLAG="S_FLAG" ;
        public static final String POS_USER="POS_USER";
        public static final String M_FLAG="M_FLAG";
        public static final String SLAVE_FLAG="SLAVE_FLAG";


        // ContentProvider information for articles..............
        public static final Uri CONTENT_URI_RETAIL_STORE_VENDOR =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RETAIL_STORE_VENDOR).build();
        public static final String CONTENT_TYPE_RETAIL_STORE_VENDOR=
                "vnd.android.cursor.dir/" + CONTENT_URI_RETAIL_STORE_VENDOR + "/" + PATH_RETAIL_STORE_VENDOR;
        public static final String CONTENT_ITEM_TYPE_RETAIL_STORE_VENDOR  =
                "vnd.android.cursor.item/" + CONTENT_URI_RETAIL_STORE_VENDOR + "/" + PATH_RETAIL_STORE_VENDOR ;
    }




}