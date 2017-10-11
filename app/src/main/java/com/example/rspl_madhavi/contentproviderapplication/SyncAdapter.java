package com.example.rspl_madhavi.contentproviderapplication;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SyncAdapter extends AbstractThreadedSyncAdapter {
    static final String TAG = "SYNC_ADAPTER";

    HashMap<String,String>hashMaps = new HashMap<>();
    ArrayList<String> storeprodlocal = new ArrayList<>();
    ArrayList<String> salesdetail = new ArrayList<>();
    ArrayList<String> salesmaster = new ArrayList<>();
    ArrayList<String> stockmaster = new ArrayList<>();

    ArrayList<String> retailstore = new ArrayList<>();
    ArrayList<String> dstrpaymentmail = new ArrayList<>();
    ArrayList<String> salesmasterreturn = new ArrayList<>();
    ArrayList<String> salesdetailsreturn = new ArrayList<>();
    ArrayList<String> strdstr = new ArrayList<>();
    ArrayList<String> storeprod = new ArrayList<>();
    ArrayList<String> pomaster = new ArrayList<>();
    ArrayList<String> sendmailpdf = new ArrayList<>();
    ArrayList<String> adtickermain = new ArrayList<>();
    ArrayList<String> topproduct = new ArrayList<>();
    ArrayList<String> employees = new ArrayList<>();
    ArrayList<String> vendreject = new ArrayList<>();
    ArrayList<String> custreject = new ArrayList<>();
    ArrayList<String> vendordetailreturn = new ArrayList<>();
    ArrayList<String> storemaint = new ArrayList<>();
    ArrayList<String> adblinkinglogomail = new ArrayList<>();
    ArrayList<String> adstoremainmail = new ArrayList<>();
    ArrayList<String> adtickermail = new ArrayList<>();
    ArrayList<String> prodcpgmail = new ArrayList<>();
    ArrayList<String> prodlocalcpgmail = new ArrayList<>();
    ArrayList<String> prodlocalmail = new ArrayList<>();
    ArrayList<String> storedecimal = new ArrayList<>();
    ArrayList<String> dayopenclose = new ArrayList<>();
    ArrayList<String> billdisplay = new ArrayList<>();
    ArrayList<String> billvisible = new ArrayList<>();
    ArrayList<String> carddefine = new ArrayList<>();
    ArrayList<String> retailcust = new ArrayList<>();
    ArrayList<String> lineitemdisc = new ArrayList<>();
    ArrayList<String> mediaclick = new ArrayList<>();
    ArrayList<String> billlvldisc = new ArrayList<>();
    ArrayList<String> ruledefine = new ArrayList<>();
    ArrayList<String> salesdetailreturnmail = new ArrayList<>();
    ArrayList<String> stockmastermail = new ArrayList<>();
    ArrayList<String> vendordetailreturnmail = new ArrayList<>();
    ArrayList<String> prodmail = new ArrayList<>();
    ArrayList<String> vendormail = new ArrayList<>();
    ArrayList<String> strdstrmail = new ArrayList<>();
    ArrayList<String> storepodetailmail = new ArrayList<>();
    ArrayList<String> storesalesdetailmail = new ArrayList<>();
    ArrayList<String> tmpvenddstrpayment = new ArrayList<>();
    ArrayList<String> storeprodcom = new ArrayList<>();
    ArrayList<String> creditcust = new ArrayList<>();
    ArrayList<String> storevendor = new ArrayList<>();

    static String STORE_ID;
    ///////////////////////////////////////sales detail////////////////////////////////
    static String TRI_ID;
    static String BARCODE;
    static String PROD_NM;
    static String EXP_DATE;
    static String S_PRICE ;
    static String QTY;
    static String MRP ;
    static String UOM ;
    static String TOTAL;
    static String ITEM_ID;
    static String DISC_PERC ;
    static String DISC_VAL ;
    static String TAX_PER ;
    static String TAX_VALUE;
    static String TAX_PER1;
    static String TAX_VALUE1 ;
    static String PREFIX_ID ;
    static String TAX_PER2;
    static String TAX_VALUE2;
    static String TAX_PER3;
    static String TAX_VALUE3 ;
    static String CONV_FACT;
    static String PROD_ID;
    ////////////////////sales_master/////////////////////////////////////////
    static  String GRAND_TOTAL;
    static String BUSINESS_DATE;
    static String SALE_DATE;
    static String SALE_TIME;
    static String CARD_NO;
    static String TOTAL_POINTS;
    static String SCHEME_POINTS;
    static String CREATED_BY;
    static String  CREATED_ON;
    //LAST_MODIFIED
    static String CUST_ID;
    static String S_FLAG;
    static String POS_USER;
    static String M_FLAG;
    static String EX_TRI_ID;
    static String ORDER_TYPE;
    static String PICK_UP_LOCATION;
    static String DISCOUNT_PERCENT;
    static String LINE_ITEM_DISC;
    static String LINE_DISC;
    static String CUST_NAME;
    static String CUST_CNCT;
    static String DOCT_NAME;
    static String DOCT_SPEC;
    static String LAST_MODIFIED;
    static String FLAG;
    static String BANK_NAME;
    static String CARD_TYPE;
    static String SAVETOTALBILLDISCOUNT;
    static String SAVETOTALBILLAMOUNT;
    static String SAVEFINALBILLAMOUNT;
    static String SAVERECEIVEDBILLAMOUNT;
    static String SAVEEXPECTEDBILLAMOUNT;
    static String SLAVE_FLAG;

    final ContentResolver resolver;

    public SyncAdapter(Context c, boolean autoInit) {
        this(c, autoInit, false);
    }

    public SyncAdapter(Context c, boolean autoInit, boolean parallelSync) {
        super(c, autoInit, parallelSync);
        this.resolver = c.getContentResolver();
    }

    @Override
    public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
        Log.w(TAG, "Starting synchronization...");

        try {
              // Synchronize our news feed
              // syncStrProdLocal(syncResult);//done
              // syncStrSalesDetail(syncResult);//done
              // syncStrSalesMaster(syncResult);//done
             //  syncRetailProdCom(syncResult);//done
           //  syncStrStockMaster(syncResult);
             // syncstoreprodcpg(syncResult);//done
             // syncStoreMaint(syncResult);
             // syncRetailstrdecimal(syncResult);
             // syncStrDistributor(syncResult);//done
             // syncRetailbilldisplay(syncResult);
            //  syncRetailbillvisible(syncResult);
            //  syncRetailStrVendor(syncResult);//done
             // syncRetailcust(syncResult);
             // syncDayopenclose(syncResult);
            //  syncvendreject(syncResult);
             // synccustreject(syncResult);
              synctopproduct(syncResult);
            // Add any other things you may want to sync

        } catch (IOException ex) {
            Log.e(TAG, "Error synchronizing!", ex);
            syncResult.stats.numIoExceptions++;
        } catch (JSONException ex) {
            Log.e(TAG, "Error synchronizing!", ex);
            syncResult.stats.numParseExceptions++;
        } catch (RemoteException |OperationApplicationException ex) {
            Log.e(TAG, "Error synchronizing!", ex);
            syncResult.stats.numAuthExceptions++;
        }

        Log.w(TAG, "Finished synchronization!");
    }

    void syncStrProdLocal(SyncResult syncstrprodlocalResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_store_prod_local.jsp?Store_Id=1493251808";
        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store_prod_local...");
        Map<String, StoreProdLocal> networkEntriesStrProdLocal = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonStrProdLocal = new JSONObject(jsonFeed);
        JSONArray jsonStrProdLocalArticles = jsonStrProdLocal.getJSONArray("Retail_store_prod_local");
        for (int i = 0; i < jsonStrProdLocalArticles.length(); i++) {
            StoreProdLocal tempStrProdLocal = StoreProdLocalParser.parse(jsonStrProdLocalArticles.optJSONObject(i));
            networkEntriesStrProdLocal.put(tempStrProdLocal.getPROD_ID()+tempStrProdLocal.getPROD_NM(),tempStrProdLocal);
            Log.d("TMP_STR_PROD_LOCAL_DATA", tempStrProdLocal.getPROD_ID());
            Log.d("TMP_STR_PROD_LOCAL_DATA", tempStrProdLocal.getPROD_NM());
        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.STRPRODLOCAL.CONTENT_URI_STR_PROD_LOCAL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();

        String STORE_ID;
        String PROD_ID;
        String PROD_NM;
        String BARCODE;
        String MRP;
        String S_PRICE;
        String P_PRICE;
        String TAX_ID;
        String INTERNET_PRICE;
        String IS_PROD_REL_INT;
        String ACTIVE;
        String PROFIT_MARGIN;
        // String LAST_MODIFIED;
        String S_FLAG;
        String IND_NM;
        String POS_USER;
        String M_FLAG;
        String DISCOUNT_PERCENT;
        String SELLING_ORDER_UNIT;
        String DISCOUNT_PERCENT_AMOUNT;

        StoreProdLocal foundtempStrProdLocal;
        JSONArray jsonArray = new JSONArray();
        Log.d("******", String.valueOf(c.getCount()));

        for (int i = 0; i < c.getCount(); i++) {
            syncstrprodlocalResult.stats.numEntries++;
            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.STORE_ID));
            PROD_ID = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.PROD_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.PROD_NM));
            BARCODE = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.BARCODE));
            MRP = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.MRP));
            S_PRICE = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.S_PRICE));
            P_PRICE = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.P_PRICE));
            TAX_ID = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.TAX_ID));
            INTERNET_PRICE = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.INTERNET_PRICE));
            IS_PROD_REL_INT = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.IS_PROD_REL_INT));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.ACTIVE));
            PROFIT_MARGIN = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.PROFIT_MARGIN));
            //  LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.LAST_MODIFIED));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.S_FLAG));
            IND_NM = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.IND_NM));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.M_FLAG));
            DISCOUNT_PERCENT = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.DISCOUNT_PERCENT));
            SELLING_ORDER_UNIT = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.SELLING_ORDER_UNIT));
            DISCOUNT_PERCENT_AMOUNT = c.getString(c.getColumnIndex(ArticleContract.STRPRODLOCAL.DISCOUNT_PERCENT_AMOUNT));


            // Try to retrieve the local entry from network entries
            foundtempStrProdLocal = networkEntriesStrProdLocal.get(PROD_ID+PROD_NM);



            if (foundtempStrProdLocal != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesStrProdLocal.remove(PROD_ID+PROD_NM);

             /*   // Check to see if it needs to be updated
                if (!PROD_NM.equals(foundtempStrProdLocal.getPROD_NM())
                        || !SELLING_ORDER_UNIT.equals(foundtempStrProdLocal.getSELLING_ORDER_UNIT())


                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + PROD_NM);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.STRPRODLOCAL.CONTENT_URI_STR_PROD_LOCAL)
                            .withSelection(ArticleContract.STRPRODLOCAL.PROD_ID + "='" + PROD_ID + "'", null)
                            .withValue(ArticleContract.STRPRODLOCAL.PROD_NM, foundtempStrProdLocal.getPROD_NM())
                            .withValue(ArticleContract.STRPRODLOCAL.SELLING_ORDER_UNIT, foundtempStrProdLocal.getSELLING_ORDER_UNIT())
                            .build());
                    syncstrprodlocalResult.stats.numUpdates++;
                //   }*/

            } else {

                storeprodlocal.add(STORE_ID);
                storeprodlocal.add(PROD_ID);
                storeprodlocal.add(PROD_NM);
                storeprodlocal.add(BARCODE);
                storeprodlocal.add(MRP);
                storeprodlocal.add(S_PRICE);
                storeprodlocal.add(P_PRICE);
                storeprodlocal.add(TAX_ID);
                storeprodlocal.add(INTERNET_PRICE);
                storeprodlocal.add(IS_PROD_REL_INT);
                storeprodlocal.add(ACTIVE);
                storeprodlocal.add(PROFIT_MARGIN);
                // storeprodlocal.add(LAST_MODIFIED);
                storeprodlocal.add(S_FLAG);
                storeprodlocal.add(IND_NM);
                storeprodlocal.add(POS_USER);
                storeprodlocal.add(M_FLAG);
                storeprodlocal.add(DISCOUNT_PERCENT);
                storeprodlocal.add(SELLING_ORDER_UNIT);
                storeprodlocal.add(DISCOUNT_PERCENT_AMOUNT);
                storeprodlocal.add(";");
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempStrProdLocal = new StringBuilder(128);
        for (String value : storeprodlocal) {
            if (sbtempStrProdLocal.length() > 0) {
                sbtempStrProdLocal.append("|");
            }
            sbtempStrProdLocal.append(value);
        }
        sbtempStrProdLocal.insert(0, "|");
        HashMap<String, String> tempstrprodlocal = new HashMap<>();
        tempstrprodlocal.put("Retail_store_prod_local", String.valueOf(sbtempStrProdLocal));
        Log.d("******", String.valueOf(sbtempStrProdLocal));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_store_prod_local_upload.jsp", tempstrprodlocal);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_store_prod_local");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
      /*  for (StoreProdLocal tempStrProdLocal : networkEntriesStrProdLocal.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_store_prod_local...: " + tempStrProdLocal.getINTERNET_PRICE() + tempStrProdLocal.getPROD_NM() + tempStrProdLocal.getPROD_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.STRPRODLOCAL.CONTENT_URI_STR_PROD_LOCAL)
                    .withValue(ArticleContract.STRPRODLOCAL.PROD_ID, tempStrProdLocal.getPROD_ID())
                    .withValue(ArticleContract.STRPRODLOCAL.PROD_NM, tempStrProdLocal.getPROD_NM())
                    .withValue(ArticleContract.STRPRODLOCAL.INTERNET_PRICE, tempStrProdLocal.getINTERNET_PRICE())

                    .build());
            syncstrprodlocalResult.stats.numInserts++; }*/



     /*   // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store_prod_local......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.STRPRODLOCAL.CONTENT_URI_STR_PROD_LOCAL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network*/

//        c.moveToFirst();

    }

    private void syncStrSalesDetail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/RETAIL_STR_SALES_DETAIL.jsp?Store_Id="+STORE_ID;

        // We need to collect all the network items in a hash table
        Calendar cal = Calendar.getInstance();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        cal.setTime(now);
        String start = sdf.format(cal.getTimeInMillis());
        cal.add(Calendar.DAY_OF_YEAR, -3);
        String end = sdf.format(cal.getTimeInMillis());

        Log.e("Start date", start);
        Log.e("End date", end);

        Log.i(TAG, "Fetching server entries..."+end+" to "+start);
        Map<String,SalesDetail>networkEntries = new HashMap<>();
        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("RETAIL_STR_SALES_DETAIL");
        Log.d("Lenght", String.valueOf(jsonArticles.length()));
        for (int k = 0; k < jsonArticles.length(); k++) {
            SalesDetail salesDetail = SalesDetailParser.parse(jsonArticles.optJSONObject(k));
            networkEntries.put(salesDetail.getTRI_ID()+salesDetail.getPROD_NM(),salesDetail);

            /*Log.d("&&&",article.getNo());*/
        }
        Log.d("&&&&& server", String.valueOf(networkEntries.size()));

        Set keys = networkEntries.keySet();
        System.out.println("All keys are: " + keys);

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();


        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        String[] params = new String[1];
        params[0] = start + "%";
        Cursor c = resolver.query(ArticleContract.SalesDetail.CONTENT_URI_DETAIL, null,"SALE_DATE between ? and ?",new String[]{end,start},null);

        assert c != null;
        c.moveToFirst();
        Log.d("&&&&& local", String.valueOf(c.getCount()));

        SalesDetail found;

        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry
            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.STORE_ID));
            TRI_ID= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TRI_ID));
            BARCODE= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.BARCODE));
            PROD_NM= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.PROD_NM));
            EXP_DATE= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.EXP_DATE));
            S_PRICE= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.S_PRICE));
            QTY= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.QTY));
            MRP= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.MRP));
            UOM= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.UOM));
            TOTAL= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TOTAL));
            CARD_NO= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.CARD_NO));
            ITEM_ID=  c.getString(c.getColumnIndex(ArticleContract.SalesDetail.ITEM_ID));
            DISC_PERC= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.DISC_PERC));
            DISC_VAL= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.DISC_VAL));
            TAX_PER= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TAX_PER));
            TAX_VALUE= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TAX_VALUE));
            TAX_PER1= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TAX_PER1));
            TAX_VALUE1= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TAX_VALUE1));
            PREFIX_ID= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.PREFIX_ID));
            TAX_PER2= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TAX_PER2));
            TAX_VALUE2= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TAX_VALUE2));
            TAX_PER3= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TAX_PER3));
            TAX_VALUE3= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.TAX_VALUE3));
            LAST_MODIFIED=c.getString(c.getColumnIndex(ArticleContract.SalesDetail.LAST_MODIFIED));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.S_FLAG));
            SALE_DATE= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.SALE_DATE));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.POS_USER));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.M_FLAG));
            EX_TRI_ID= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.EX_TRI_ID));
            ORDER_TYPE= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.ORDER_TYPE));
            PICK_UP_LOCATION= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.PICK_UP_LOCATION));
            DISCOUNT_PERCENT= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.DISCOUNT_PERCENT));
            LINE_ITEM_DISC= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.LINE_ITEM_DISC));
            LINE_DISC= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.LINE_DISC));
            PROD_ID= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.PROD_ID));
            CARD_TYPE= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.CARD_TYPE));
            BANK_NAME= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.BANK_NAME));
            SLAVE_FLAG= c.getString(c.getColumnIndex(ArticleContract.SalesDetail.SLAVE_FLAG));


            // Try to retrieve the local entry from network entries

            found = networkEntries.get(TRI_ID+PROD_NM);



            //  Log.d("^^^^^^^^",found.setTRI_ID(fruits.toString()));

            //  found = networkEntries.get(TRI_ID);

            if (found!=null)
            {

              /*  Log.d("^^^^^^^", "found is not null");
                // The entry exists, remove from hash table to prevent re-inserting it
                Log.d("Database***", TRI_ID + " " + PROD_NM + " " + BATCH_NO + " " + EXP_DATE);
                Log.d("SERVER****", (found.getTRI_ID()) + " " + found.getPROD_NM() + " " + found.getBATCH_NO() + " " + found.getEXP_DATE());*/
                networkEntries.remove(TRI_ID+PROD_NM);

            } else
            {
                salesdetail.add(STORE_ID);
                salesdetail.add(TRI_ID);
                salesdetail.add(BARCODE);
                salesdetail.add(PROD_NM);
                salesdetail.add(EXP_DATE);
                salesdetail.add(S_PRICE);
                salesdetail.add(QTY);
                salesdetail.add(MRP);
                salesdetail.add(UOM);
                salesdetail.add(TOTAL);
                salesdetail.add(CARD_NO);
                salesdetail.add(ITEM_ID);
                salesdetail.add(DISC_PERC);
                salesdetail.add(DISC_VAL);
                salesdetail.add(TAX_PER);
                salesdetail.add(TAX_VALUE);
                salesdetail.add(TAX_PER1);
                salesdetail.add(TAX_VALUE1);
                salesdetail.add(PREFIX_ID );
                salesdetail.add(TAX_PER2 );
                salesdetail.add(TAX_VALUE2);
                salesdetail.add(TAX_PER3 );
                salesdetail.add(TAX_VALUE3 );
                // salesdetail.add(LAST_MODIFIED);
                salesdetail.add(FLAG );
                salesdetail.add(S_FLAG);
                salesdetail.add(SALE_DATE );
                salesdetail.add(POS_USER );
                salesdetail.add(M_FLAG );
                salesdetail.add(EX_TRI_ID );
                salesdetail.add(ORDER_TYPE );
                salesdetail.add(PICK_UP_LOCATION );
                salesdetail.add(DISCOUNT_PERCENT );
                salesdetail.add(LINE_ITEM_DISC );
                salesdetail.add(LINE_DISC );
                salesdetail.add(PROD_ID );
                salesdetail.add(BANK_NAME );
                salesdetail.add(CARD_TYPE );
                salesdetail.add(SLAVE_FLAG );
                salesdetail.add(";");

            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sb40 = new StringBuilder(128);
        for (String value : salesdetail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>crms =  new HashMap<>();
        crms.put("retail_str_sales_detail",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_str_sales_detail_upload.jsp",crms);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_str_sales_detail");

            }
        }catch (Exception e){e.printStackTrace();}




        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.SalesDetail.CONTENT_URI_DETAIL, // URI where data was modified
                null, false); // IMPORTANT: Do not sync to network
    }

    private void syncStrSalesMaster(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_str_sales_master.jsp?Store_Id=1493251808";
        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String, SalesMaster> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_sales_master");
        for (int i = 0; i < jsonArticles.length(); i++) {
            SalesMaster salesMaster = SalesMasterParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(salesMaster.getTRI_ID(),salesMaster);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();
        Log.d("&&&&& server", String.valueOf(networkEntries.size()));
        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Calendar cal = Calendar.getInstance();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        cal.setTime(now);
        String start = sdf.format(cal.getTimeInMillis());
        cal.add(Calendar.DAY_OF_YEAR, -3);
        String end = sdf.format(cal.getTimeInMillis());

        Log.e("Start date", start);
        Log.e("End date", end);

        Cursor c = resolver.query(ArticleContract.SalesMaster.CONTENT_URI_SALES_MASTER, null, "SALE_DATE between ? and ?",new String[]{end,start}, null);
        assert c != null;
        c.moveToFirst();
        Log.d("&&&&& local", String.valueOf(c.getCount()));

        SalesMaster found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry
            TRI_ID = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.TRANSACTION_ID));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.STORE_ID));
            GRAND_TOTAL = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.GRAND_TOTAL));
            BUSINESS_DATE = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.BUSINESS_DATE));
            SALE_DATE = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SALE_DATE));
            SALE_TIME = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SALE_TIME));
            CARD_NO = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.CARD_NO));
            LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.LAST_MODIFIED));
            TOTAL_POINTS =c.getString(c.getColumnIndex(ArticleContract.SalesMaster.TOTAL_POINTS));
            SCHEME_POINTS = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SCHEME_POINTS));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.FLAG));
            CREATED_BY = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.CREATED_BY));
            CREATED_ON = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.CREATED_ON));
            CUST_ID = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.CUST_ID));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.M_FLAG));
            EX_TRI_ID = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.EX_TRI_ID));
            ORDER_TYPE = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.ORDER_TYPE));
            PICK_UP_LOCATION = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.PICK_UP_LOCATION));
            DISCOUNT_PERCENT = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.DISCOUNT_PERCENT));
            LINE_ITEM_DISC =c.getString(c.getColumnIndex(ArticleContract.SalesMaster.LINE_ITEM_DISC));
            LINE_DISC = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.LINE_DISC));
            CUST_NAME = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.CUST_NAME));
            CUST_CNCT = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.CUST_CNCT));
            DOCT_NAME = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.DOCT_NAME));
            DOCT_SPEC = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.DOCT_SPEC));
            BANK_NAME = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.BANK_NAME));
            CARD_TYPE = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.CARD_TYPE));
            SAVETOTALBILLDISCOUNT = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SAVETOTALBILLDISCOUNT));
            SAVETOTALBILLAMOUNT = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SAVETOTALBILLAMOUNT));
            SAVEFINALBILLAMOUNT = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SAVEFINALBILLAMOUNT));
            SAVERECEIVEDBILLAMOUNT = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SAVERECEIVEDBILLAMOUNT));
            SAVEEXPECTEDBILLAMOUNT= c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SAVEEXPECTEDBILLAMOUNT));
            SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.SalesMaster.SLAVE_FLAG));
            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TRI_ID);
            // Log.d("@@@@@@", TRI_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
               /* Log.d("Database***", TRI_ID);
                Log.d("SERVER****", (found.getTRI_ID()));*/
                networkEntries.remove(TRI_ID);

            } else {

                salesmaster.add(TRI_ID);
                salesmaster.add(STORE_ID);
                salesmaster.add(GRAND_TOTAL);
                salesmaster.add(BUSINESS_DATE);
                salesmaster.add(SALE_DATE);
                salesmaster.add(SALE_TIME);
                salesmaster.add(CARD_NO);
                salesmaster.add(TOTAL_POINTS);
                salesmaster.add(SCHEME_POINTS);
                salesmaster.add(FLAG);
                salesmaster.add(CREATED_BY);
                salesmaster.add(CREATED_ON);
                salesmaster.add(CUST_ID);
                salesmaster.add(S_FLAG);
                salesmaster.add(POS_USER);
                salesmaster.add(M_FLAG);
                salesmaster.add(EX_TRI_ID);
                salesmaster.add(ORDER_TYPE);
                salesmaster.add(PICK_UP_LOCATION);
                salesmaster.add(DISCOUNT_PERCENT);
                salesmaster.add(LINE_ITEM_DISC);
                salesmaster.add(LINE_DISC);
                salesmaster.add(CUST_NAME);
                salesmaster.add(CUST_CNCT);
                salesmaster.add(DOCT_NAME);
                salesmaster.add(DOCT_SPEC);
                salesmaster.add(BANK_NAME);
                salesmaster.add(CARD_TYPE);
                salesmaster.add(SAVETOTALBILLDISCOUNT);
                salesmaster.add(SAVETOTALBILLAMOUNT);
                salesmaster.add(SAVEFINALBILLAMOUNT);
                salesmaster.add(SAVERECEIVEDBILLAMOUNT);
                salesmaster.add(SAVEEXPECTEDBILLAMOUNT);
               // salesmaster.add("1");
                salesmaster.add(SLAVE_FLAG);
                salesmaster.add(";");
                //  Log.d("*******",salesmaster.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : salesmaster) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>salesmaster =  new HashMap<>();
        salesmaster.put("retail_str_sales_master",String.valueOf(sb40));
        Log.d("retail_str_sales_master",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_str_sales_master_upload.jsp",salesmaster);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_sales_master");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.SalesMaster.CONTENT_URI_SALES_MASTER, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }



    void syncStrStockMaster(SyncResult syncstockmasterResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_str_stock_master.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_str_stock_master...");
        Map<String, StockMaster> networkEntriesStockMaster = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonStockMaster = new JSONObject(jsonFeed);
        JSONArray jsonStockMasterArticles = jsonStockMaster.getJSONArray("retail_str_stock_master");
        for (int i = 0; i < jsonStockMasterArticles.length(); i++) {
            StockMaster stockMaster = StockMasterParser.parse(jsonStockMasterArticles.optJSONObject(i));
            networkEntriesStockMaster.put(stockMaster.getPROD_NAME()+stockMaster.getBARCODE()+stockMaster.getPROD_ID(),stockMaster);

          /*  Log.d("STOCK_MASTER_DATA", stockMaster.getPROD_ID());
            Log.d("STOCK_MASTER_DATA", stockMaster.getEXP_DATE());*/

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");

        Calendar cal = Calendar.getInstance();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        cal.setTime(now);
        String start = sdf.format(cal.getTimeInMillis());
        cal.add(Calendar.DAY_OF_YEAR, -3);
        String end = sdf.format(cal.getTimeInMillis());

        Log.e("Start date", start);
        Log.e("End date", end);
        Log.d("Server", String.valueOf(networkEntriesStockMaster.size()));

        Cursor c = resolver.query(ArticleContract.StockMaster.CONTENT_URI_STOCK_MASTER, null,null,null /*"INVENTORY_DATE between ? and ?",new String[]{end,start}*/, null);
        assert c != null;
        c.moveToFirst();
        Log.d("&&&&& local", String.valueOf(c.getCount()));

        String STORE_ID;
        String PROD_ID;
        String PROD_NM;
        String EXP_DATE;
        String QTY;
        String MRP;
        String AMOUNT;
        String UOM;
        String P_PRICE;
        String S_PRICE;
        String BARCODE;
        String FREE_GOODS;
        String MF_DATE;
        String FLAG;
        String CREATED_BY;
        String CREATED_ON;
        String CON_MUL_QTY;
        String GRN_ID;
        String VEND_NM;
        String PO_NO;
        String PROFIT_MARGIN;
        String S_FLAG;
        String IND_NM;
        String CONV_MRP;
        String CONV_SPRICE;
        String PREV_QTY;
        String POS_USER;
        String M_FLAG;
        String INVENTORY_DATE;
        String MFG_BATCH_NO;
        String PURCHASE_UNIT_CONV;
        String VENDOR_INVOICE_NO;
        String VENDOR_INVOICE_DATE;
        String DISCOUNT_PERCENT;
        String DISCOUNT_PERCENT_AMOUNT;
        String ACTIVE;
        String SLAVE_FLAG;

        StockMaster foundstockmaster;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncstockmasterResult.stats.numEntries++;
            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.StockMaster.STORE_ID));
            PROD_ID = c.getString(c.getColumnIndex(ArticleContract.StockMaster.PROD_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.StockMaster.PROD_NAME));
            BARCODE = c.getString(c.getColumnIndex(ArticleContract.StockMaster.BARCODE));
            MRP = c.getString(c.getColumnIndex(ArticleContract.StockMaster.MRP));
            S_PRICE = c.getString(c.getColumnIndex(ArticleContract.StockMaster.S_PRICE));
            EXP_DATE = c.getString(c.getColumnIndex(ArticleContract.StockMaster.EXP_DATE));
            QTY = c.getString(c.getColumnIndex(ArticleContract.StockMaster.QUANTITY));
            AMOUNT= c.getString(c.getColumnIndex(ArticleContract.StockMaster.AMOUNT));
            FREE_GOODS= c.getString(c.getColumnIndex(ArticleContract.StockMaster.FREE_GOODS));
            UOM= c.getString(c.getColumnIndex(ArticleContract.StockMaster.UOM));
           // CONV_FACT= c.getString(c.getColumnIndex(ArticleContract.StockMaster.CONV_FACT));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.StockMaster.FLAG));
            P_PRICE= c.getString(c.getColumnIndex(ArticleContract.StockMaster.PURCHASE_PRICE));
            PURCHASE_UNIT_CONV= c.getString(c.getColumnIndex(ArticleContract.StockMaster.PURCHASE_UNIT_CONV));
            CREATED_BY= c.getString(c.getColumnIndex(ArticleContract.StockMaster.CREATED_BY));
            CREATED_ON= c.getString(c.getColumnIndex(ArticleContract.StockMaster.CREATED_ON));
            CONV_SPRICE= c.getString(c.getColumnIndex(ArticleContract.StockMaster.CONV_SPRICE));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.StockMaster.ACTIVE));
            PROFIT_MARGIN= c.getString(c.getColumnIndex(ArticleContract.StockMaster.PROFIT_MARGIN));
           // LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.StockMaster.LAST_MODIFIED));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.StockMaster.S_FLAG));
            GRN_ID = c.getString(c.getColumnIndex(ArticleContract.StockMaster.GRN_ID));
            CON_MUL_QTY = c.getString(c.getColumnIndex(ArticleContract.StockMaster.CON_MUL_QTY));
            INVENTORY_DATE = c.getString(c.getColumnIndex(ArticleContract.StockMaster.INVENTORY_DATE));
            VENDOR_INVOICE_DATE = c.getString(c.getColumnIndex(ArticleContract.StockMaster.VENDOR_INVOICE_DATE));
            VENDOR_INVOICE_NO = c.getString(c.getColumnIndex(ArticleContract.StockMaster.VENDOR_INVOICE_NO));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.StockMaster.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.StockMaster.M_FLAG));
            CONV_MRP = c.getString(c.getColumnIndex(ArticleContract.StockMaster.CONV_MRP));
            IND_NM = c.getString(c.getColumnIndex(ArticleContract.StockMaster.IND_NAME));
            DISCOUNT_PERCENT = c.getString(c.getColumnIndex(ArticleContract.StockMaster.DISCOUNT_PERCENT));
            DISCOUNT_PERCENT_AMOUNT = c.getString(c.getColumnIndex(ArticleContract.StockMaster.DISCOUNT_PERCENT_AMOUNT));
            MFG_BATCH_NO = c.getString(c.getColumnIndex(ArticleContract.StockMaster.MFG_BATCH_NO));
            SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.StockMaster.SLAVE_FLAG));
            PREV_QTY = c.getString(c.getColumnIndex(ArticleContract.StockMaster.PREV_QTY));
            PO_NO = c.getString(c.getColumnIndex(ArticleContract.StockMaster.PO_NO));
            VEND_NM = c.getString(c.getColumnIndex(ArticleContract.StockMaster.VEND_NAME));
            MF_DATE = c.getString(c.getColumnIndex(ArticleContract.StockMaster.MF_DATE));

            // Try to retrieve the local entry from network entries
            foundstockmaster = networkEntriesStockMaster.get(PROD_NM+BARCODE+PROD_ID);

          //  Log.d("&&&&&&&&&&&&", foundstockmaster.getBARCODE()+foundstockmaster.getMRP()+foundstockmaster.getS_PRICE()+foundstockmaster.getEXP_DATE()+foundstockmaster.getACTIVE()+foundstockmaster.getAMOUNT()+foundstockmaster.getCON_MUL_QTY()+ foundstockmaster.getINVENTORY_DATE()+foundstockmaster.getPURCHASE_PRICE()+foundstockmaster.getUOM()+foundstockmaster.getQUANTITY());
            if (foundstockmaster != null && foundstockmaster.getBARCODE()==BARCODE && foundstockmaster.getMRP()==MRP && foundstockmaster.getS_PRICE()==S_PRICE && foundstockmaster.getEXP_DATE()==EXP_DATE && foundstockmaster.getACTIVE()==ACTIVE && foundstockmaster.getAMOUNT()==AMOUNT && foundstockmaster.getCON_MUL_QTY()==CON_MUL_QTY && foundstockmaster.getINVENTORY_DATE()==INVENTORY_DATE && foundstockmaster.getPURCHASE_PRICE()==P_PRICE && foundstockmaster.getUOM()==UOM && foundstockmaster.getQUANTITY()==QTY) {
                // The entry exists, remove from hash table to prevent re-inserting it

                networkEntriesStockMaster.remove(PROD_NM + BARCODE + PROD_ID);
            } else if(!BARCODE.equals(foundstockmaster.getBARCODE())|| !MRP.equals(foundstockmaster.getMRP())|| !S_PRICE.equals(foundstockmaster.getS_PRICE()) || !EXP_DATE.equals(foundstockmaster.getEXP_DATE()) || !ACTIVE.equals(foundstockmaster.getACTIVE()) || !AMOUNT.equals(foundstockmaster.getAMOUNT()) || !CON_MUL_QTY.equals(foundstockmaster.getCON_MUL_QTY()) || !INVENTORY_DATE.equals(foundstockmaster.getINVENTORY_DATE()) || !P_PRICE.equals(foundstockmaster.getPURCHASE_PRICE()) || foundstockmaster.getUOM()==UOM || foundstockmaster.getQUANTITY()==QTY) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + MRP);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.ProdCom.CONTENT_URI_PROD_COM)
                            .withSelection(ArticleContract.StockMaster.PROD_ID + "='" + PROD_ID + "'", null)
                            .withSelection(ArticleContract.StockMaster.PROD_NAME + "='" + PROD_NM + "'", null)
                            .withSelection(ArticleContract.StockMaster.BARCODE + "='" + BARCODE + "'", null)
                            .withValue(ArticleContract.StockMaster.MRP, foundstockmaster.getMRP())
                            .withValue(ArticleContract.StockMaster.POS_USER, foundstockmaster.getPOS_USER())
                            .withValue(ArticleContract.StockMaster.ACTIVE, foundstockmaster.getACTIVE())
                            .withValue(ArticleContract.StockMaster.S_PRICE, foundstockmaster.getS_PRICE())
                            .withValue(ArticleContract.StockMaster.PURCHASE_PRICE, foundstockmaster.getPURCHASE_PRICE())
                            .withValue(ArticleContract.StockMaster.QUANTITY, foundstockmaster.getQUANTITY())
                            .withValue(ArticleContract.StockMaster.CON_MUL_QTY, foundstockmaster.getCON_MUL_QTY())
                            .withValue(ArticleContract.StockMaster.EXP_DATE, foundstockmaster.getEXP_DATE())
                            .withValue(ArticleContract.StockMaster.INVENTORY_DATE, foundstockmaster.getINVENTORY_DATE())
                            .withValue(ArticleContract.StockMaster.UOM, foundstockmaster.getUOM())
                            .build());
                    syncstockmasterResult.stats.numUpdates++;}

             else {
                stockmaster.add(STORE_ID );
                stockmaster.add(PROD_ID );
                stockmaster.add(PROD_NM);
                stockmaster.add(EXP_DATE);
                stockmaster.add(QTY);
                stockmaster.add(MRP);
                stockmaster.add(AMOUNT);
                stockmaster.add(UOM);
                stockmaster.add(P_PRICE);
                stockmaster.add(S_PRICE);
                stockmaster.add(BARCODE);
                stockmaster.add(FREE_GOODS);
                stockmaster.add(MF_DATE);
                stockmaster.add(FLAG);
                stockmaster.add(CREATED_BY);
                stockmaster.add(CREATED_ON);
                stockmaster.add(CON_MUL_QTY);
                stockmaster.add(GRN_ID);
                stockmaster.add(VEND_NM);
                stockmaster.add(PO_NO);
                stockmaster.add(PROFIT_MARGIN);
                stockmaster.add(S_FLAG);
                stockmaster.add(IND_NM);
                stockmaster.add(CONV_MRP);
                stockmaster.add(CONV_SPRICE);
                stockmaster.add(PREV_QTY);
                stockmaster.add(POS_USER);
                stockmaster.add(M_FLAG);
                stockmaster.add(INVENTORY_DATE);
                stockmaster.add(MFG_BATCH_NO);
                stockmaster.add(PURCHASE_UNIT_CONV);
                stockmaster.add(VENDOR_INVOICE_NO);
                stockmaster.add(VENDOR_INVOICE_DATE);
                stockmaster.add(DISCOUNT_PERCENT);
                stockmaster.add(DISCOUNT_PERCENT_AMOUNT);
                stockmaster.add(ACTIVE);
                stockmaster.add(SLAVE_FLAG);
                stockmaster.add(";");
            }
            c.moveToNext();
        }
        c.close();
        StringBuilder sbstockmaster = new StringBuilder(128);
        for (String value : stockmaster) {
            if (sbstockmaster.length() > 0) {
                sbstockmaster.append("|");
            }
            sbstockmaster.append(value);
        }
        sbstockmaster.insert(0, "|");
        HashMap<String, String> stockmaster = new HashMap<>();
        stockmaster.put("retail_str_stock_master", String.valueOf(sbstockmaster));
        Log.d("******", String.valueOf(sbstockmaster));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_str_stock_master_upload.jsp", stockmaster);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_str_stock_master");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d("(*******", String.valueOf(networkEntriesStockMaster.size()));
        // Add all the new entries
        for (StockMaster article : networkEntriesStockMaster.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_str_stock_master...: " + article.getS_PRICE() + article.getMRP() + article.getPROD_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.StockMaster.CONTENT_URI_STOCK_MASTER)
                    .withValue(ArticleContract.StockMaster.PROD_ID, article.getPROD_ID())
                    .withValue(ArticleContract.StockMaster.MRP, article.getMRP())
                    .withValue(ArticleContract.StockMaster.S_PRICE, article.getS_PRICE())

                    .build());
            syncstockmasterResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_str_stock_master......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.StockMaster.CONTENT_URI_STOCK_MASTER, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network



    }

    void syncRetailStore(SyncResult syncretailstoreResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_Store.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store...");
        Map<String, RetailStore> networkEntriesRetailStore = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonRetailStore = new JSONObject(jsonFeed);
        JSONArray jsonRetailStoreArticles = jsonRetailStore.getJSONArray("Retail_Store");
        for (int i = 0; i < jsonRetailStoreArticles.length(); i++) {
            RetailStore retailStore = RetailStoreParser.parse(jsonRetailStoreArticles.optJSONObject(i));
            // networkEntriesRetailStore.put(stockMaster.getPROD_ID(),stockMaster);
            networkEntriesRetailStore.put(retailStore.getSTORE_ID(),retailStore);


        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.RetailStore.CONTENT_URI_RETAIL_STORE, null, null, null, null, null);
        assert c != null;

        String STORE_ID ;
        String STORE_MEDIA_ID ;
        String STR_NM ;
        String ADD_1 ;
        String CTY ;
        String STR_CTR ;
        String ZIP ;
        String STR_CNTCT_NM ;
        String TELE ;
        String TELE_1 ;
        String E_MAIL ;
        String TAN_NUMBER ;
        String DSTR_NUMBER ;
        String FOOTER ;
        String FLAG ;
        String STR_IND_DESC ;
        String RET_CLS_ID ;
        String TEAM_MEMB ;
        String STATUS ;
        String CURR_STATUS ;
        String CREATION_DATE ;
        String CLOSURE_DATE ;
        String ACTIVATION_DATE ;
        String DE_ACTIVATION_DATE ;
        String OTP ;
        String USER ;
        String S_FLAG ;
        String S3_FLAG ;
        String POS_USER ;
        String M_FLAG ;
        String CURRENCY ;
        String LT ;
        String LO ;

        RetailStore foundretailStore;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncretailstoreResult.stats.numEntries++;
            // Create local article entry
                    STORE_ID = c.getString(c.getColumnIndex(ArticleContract.RetailStore.STORE_ID));
                    STORE_MEDIA_ID = c.getString(c.getColumnIndex(ArticleContract.RetailStore.STORE_MEDIA_ID));
                    STR_NM = c.getString(c.getColumnIndex(ArticleContract.RetailStore.STR_NM));
                    ADD_1 = c.getString(c.getColumnIndex(ArticleContract.RetailStore.ADD_1));
                    CTY = c.getString(c.getColumnIndex(ArticleContract.RetailStore.CTY));
                    STR_CTR = c.getString(c.getColumnIndex(ArticleContract.RetailStore.STR_CTR));
                    ZIP = c.getString(c.getColumnIndex(ArticleContract.RetailStore.ZIP));
                    STR_CNTCT_NM = c.getString(c.getColumnIndex(ArticleContract.RetailStore.STR_CNTCT_NM));
                    TELE = c.getString(c.getColumnIndex(ArticleContract.RetailStore.TELE));
                    TELE_1 = c.getString(c.getColumnIndex(ArticleContract.RetailStore.TELE_1));
                    E_MAIL = c.getString(c.getColumnIndex(ArticleContract.RetailStore.E_MAIL));
                    TAN_NUMBER = c.getString(c.getColumnIndex(ArticleContract.RetailStore.TAN_NUMBER));
                    DSTR_NUMBER = c.getString(c.getColumnIndex(ArticleContract.RetailStore.DSTR_NUMBER));
                    FOOTER = c.getString(c.getColumnIndex(ArticleContract.RetailStore.FOOTER));
                    FLAG = c.getString(c.getColumnIndex(ArticleContract.RetailStore.FLAG));
                    STR_IND_DESC = c.getString(c.getColumnIndex(ArticleContract.RetailStore.STR_IND_DESC));
                    RET_CLS_ID = c.getString(c.getColumnIndex(ArticleContract.RetailStore.RET_CLS_ID));
                    TEAM_MEMB = c.getString(c.getColumnIndex(ArticleContract.RetailStore.TEAM_MEMB));
                    STATUS = c.getString(c.getColumnIndex(ArticleContract.RetailStore.STATUS));
                    CURR_STATUS = c.getString(c.getColumnIndex(ArticleContract.RetailStore.CURR_STATUS));
                    CREATION_DATE = c.getString(c.getColumnIndex(ArticleContract.RetailStore.CREATION_DATE));
                    CLOSURE_DATE = c.getString(c.getColumnIndex(ArticleContract.RetailStore.CLOSURE_DATE));
                    ACTIVATION_DATE = c.getString(c.getColumnIndex(ArticleContract.RetailStore.ACTIVATION_DATE));
                    DE_ACTIVATION_DATE = c.getString(c.getColumnIndex(ArticleContract.RetailStore.DE_ACTIVATION_DATE));
                    OTP = c.getString(c.getColumnIndex(ArticleContract.RetailStore.OTP));
                    USER = c.getString(c.getColumnIndex(ArticleContract.RetailStore.USER));
                    S_FLAG = c.getString(c.getColumnIndex(ArticleContract.RetailStore.S_FLAG));
                    S3_FLAG = c.getString(c.getColumnIndex(ArticleContract.RetailStore.S3_FLAG));
                    POS_USER = c.getString(c.getColumnIndex(ArticleContract.RetailStore.POS_USER));
                    M_FLAG = c.getString(c.getColumnIndex(ArticleContract.RetailStore.M_FLAG));
                    CURRENCY = c.getString(c.getColumnIndex(ArticleContract.RetailStore.CURRENCY));
                    LT = c.getString(c.getColumnIndex(ArticleContract.RetailStore.LT));
                    LO = c.getString(c.getColumnIndex(ArticleContract.RetailStore.LO));

            // Try to retrieve the local entry from network entries
            foundretailStore = networkEntriesRetailStore.get(STORE_MEDIA_ID);


            if (foundretailStore != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesRetailStore.remove(STORE_MEDIA_ID);


                // Check to see if it needs to be updated
                // if (!MRP.equals(found.getMRP())
                if (!DSTR_NUMBER.equals(foundretailStore.getDSTR_NUMBER())
                        // || !S_PRICE.equals(found.getS_PRICE())
                        || !E_MAIL.equals(foundretailStore.getE_MAIL())
                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + DSTR_NUMBER);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.RetailStore.CONTENT_URI_RETAIL_STORE)
                            .withSelection(ArticleContract.RetailStore.STORE_MEDIA_ID + "='" + STORE_MEDIA_ID + "'", null)
                            .withValue(ArticleContract.RetailStore.DSTR_NUMBER, foundretailStore.getDSTR_NUMBER())
                            .withValue(ArticleContract.RetailStore.E_MAIL, foundretailStore.getE_MAIL())
                            .build());
                    syncretailstoreResult.stats.numUpdates++;
                }

            } else {


                retailstore.add(STORE_ID );
                retailstore.add(STORE_MEDIA_ID );
                retailstore.add(STR_NM );
                retailstore.add(ADD_1 );
                retailstore.add(CTY );
                retailstore.add(STR_CTR );
                retailstore.add(ZIP );
                retailstore.add(STR_CNTCT_NM );
                retailstore.add(TELE );
                retailstore.add(TELE_1 );
                retailstore.add(E_MAIL );
                retailstore.add(TAN_NUMBER );
                retailstore.add(DSTR_NUMBER );
                retailstore.add(FOOTER );
                retailstore.add(FLAG );
                retailstore.add(STR_IND_DESC );
                retailstore.add(RET_CLS_ID );
                retailstore.add(TEAM_MEMB );
                retailstore.add(STATUS );
                retailstore.add(CURR_STATUS);
                retailstore.add(CREATION_DATE);
                retailstore.add(CLOSURE_DATE);
                retailstore.add(ACTIVATION_DATE);
                retailstore.add(DE_ACTIVATION_DATE);
                retailstore.add(OTP);
                retailstore.add(USER );
                retailstore.add(S_FLAG );
                retailstore.add(S3_FLAG );
                retailstore.add(POS_USER );
                retailstore.add(M_FLAG );
                retailstore.add(CURRENCY);
                retailstore.add(LT);
                retailstore.add(LO);
                retailstore.add(";");

            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbretailstore = new StringBuilder(128);
        for (String value : retailstore) {
            if (sbretailstore.length() > 0) {
                sbretailstore.append("|");
            }
            sbretailstore.append(value);
        }
        sbretailstore.insert(0, "|");
        HashMap<String, String> retailstore = new HashMap<>();
        retailstore.put("Retail_store", String.valueOf(sbretailstore));
        Log.d("******", String.valueOf(sbretailstore));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_Store_upload.jsp", retailstore);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Response", success + " " + "retail_store");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (RetailStore retailStore : networkEntriesRetailStore.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_store...: " + retailStore.getE_MAIL() + retailStore.getDSTR_NUMBER() + retailStore.getSTORE_MEDIA_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.RetailStore.CONTENT_URI_RETAIL_STORE)
                    .withValue(ArticleContract.RetailStore.STORE_MEDIA_ID, retailStore.getSTORE_MEDIA_ID())
                    .withValue(ArticleContract.RetailStore.DSTR_NUMBER, retailStore.getDSTR_NUMBER())
                    .withValue(ArticleContract.RetailStore.E_MAIL, retailStore.getE_MAIL())

                    .build());
            syncretailstoreResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.RetailStore.CONTENT_URI_RETAIL_STORE, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncVendorPayment(SyncResult syncvendorPaymentResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from tmp_vend_dstr_payment_mail...");
        Map<String, TempVendorPayment> networkEntriesVendorPayment = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonVendorPayment = new JSONObject(jsonFeed);
        JSONArray jsonVendorPaymentArticles = jsonVendorPayment.getJSONArray("tmp_vend_dstr_payment_mail");
        for (int i = 0; i < jsonVendorPaymentArticles.length(); i++) {
            TempVendorPayment tempVendorPayment = TempVendorPaymentParser.parse(jsonVendorPaymentArticles.optJSONObject(i));
//            networkEntriesVendorPayment.put(tempVendorPayment.getSTORE_MEDIA_ID(),retailStore);
            networkEntriesVendorPayment.put(tempVendorPayment.getPAY_ID(),tempVendorPayment);
            Log.d("TEMP_VENDR_PAYMNT_DATA", tempVendorPayment.getPAY_ID());
            // Log.d("TEMP_VENDR_PAYMNT_DATA", tempVendorPayment.getOTP());
            Log.d("TEMP_VENDR_PAYMNT_DATA", tempVendorPayment.getAMOUNT());
        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.TempVendorPayment.CONTENT_URI_TEMP_VENDORPAYMENT, null, null, null, null, null);
        assert c != null;

        String TICKET_ID;
        String PAY_ID;
        String VEND_DSTR_NM;
        String AMOUNT;
        String RECEIVED_AMOUNT;
        String DUE_AMOUNT;
        String REASON_OF_PAY;
        String LAST_MODIFIED;
        String BANK_NAME;
        String CHEQUE_NO;
        String POS_USER;
        String FLAG;
        String S_FLAG;
        String PAYMENTDATE;
        String M_FLAG;

        TempVendorPayment foundtempVendorPayment;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncvendorPaymentResult.stats.numEntries++;
            // Create local article entry
            TICKET_ID = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.TICKET_ID));
            PAY_ID = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.PAY_ID));
            VEND_DSTR_NM = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.VEND_DSTR_NM));
            AMOUNT = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.AMOUNT));
            RECEIVED_AMOUNT = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.RECEIVED_AMOUNT));
            DUE_AMOUNT = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.DUE_AMOUNT));
            REASON_OF_PAY = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.REASON_OF_PAY));
            LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.LAST_MODIFIED));
            BANK_NAME = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.BANK_NAME));
            CHEQUE_NO = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.CHEQUE_NO));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.POS_USER));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.FLAG));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.S_FLAG));
            PAYMENTDATE = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.PAYMENTDATE));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.TempVendorPayment.M_FLAG));


            // Try to retrieve the local entry from network entries
//            foundtempVendorPayment = networkEntriesVendorPayment.get(STORE_MEDIA_ID);
            foundtempVendorPayment = networkEntriesVendorPayment.get(PAY_ID);


            if (foundtempVendorPayment != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesVendorPayment.remove(PAY_ID);


                // Check to see if it needs to be updated
//                if (!DSTR_NUMBER.equals(foundtempVendorPayment.getDSTR_NUMBER())
                if (!VEND_DSTR_NM.equals(foundtempVendorPayment.getVEND_DSTR_NM())
//                        || !E_MAIL.equals(foundtempVendorPayment.getE_MAIL())
                        || !CHEQUE_NO.equals(foundtempVendorPayment.getCHEQUE_NO())
                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + VEND_DSTR_NM);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.TempVendorPayment.CONTENT_URI_TEMP_VENDORPAYMENT)
                            .withSelection(ArticleContract.TempVendorPayment.PAY_ID + "='" + PAY_ID + "'", null)
                            .withValue(ArticleContract.TempVendorPayment.VEND_DSTR_NM, foundtempVendorPayment.getVEND_DSTR_NM())
                            .withValue(ArticleContract.TempVendorPayment.CHEQUE_NO, foundtempVendorPayment.getCHEQUE_NO())
                            .build());
                    syncvendorPaymentResult.stats.numUpdates++;
                }

            } else {

                dstrpaymentmail.add(TICKET_ID);
                dstrpaymentmail.add(PAY_ID);
                dstrpaymentmail.add(VEND_DSTR_NM);
                dstrpaymentmail.add(AMOUNT);
                dstrpaymentmail.add(RECEIVED_AMOUNT);
                dstrpaymentmail.add(DUE_AMOUNT);
                dstrpaymentmail.add(REASON_OF_PAY);
                dstrpaymentmail.add(LAST_MODIFIED);
                dstrpaymentmail.add(BANK_NAME);
                dstrpaymentmail.add(CHEQUE_NO);
                dstrpaymentmail.add(POS_USER);
                dstrpaymentmail.add(FLAG);
                dstrpaymentmail.add(S_FLAG);
                dstrpaymentmail.add(PAYMENTDATE);
                dstrpaymentmail.add(M_FLAG);

            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempVendorPayment = new StringBuilder(128);
        for (String value : dstrpaymentmail) {
            if (sbtempVendorPayment.length() > 0) {
                sbtempVendorPayment.append("|");
            }
            sbtempVendorPayment.append(value);
        }
        sbtempVendorPayment.insert(0, "|");
        HashMap<String, String> tempvendorpayment = new HashMap<>();
        tempvendorpayment.put("tmp_vend_dstr_payment_mail", String.valueOf(sbtempVendorPayment));
        Log.d("******", String.valueOf(sbtempVendorPayment));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempvendorpayment);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "tmp_vend_dstr_payment_mail");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (TempVendorPayment tempVendorPayment : networkEntriesVendorPayment.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from tmp_vend_dstr_payment_mail...: " + tempVendorPayment.getCHEQUE_NO() + tempVendorPayment.getVEND_DSTR_NM() + tempVendorPayment.getPAY_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.TempVendorPayment.CONTENT_URI_TEMP_VENDORPAYMENT)
                    .withValue(ArticleContract.TempVendorPayment.PAY_ID, tempVendorPayment.getPAY_ID())
                    .withValue(ArticleContract.TempVendorPayment.VEND_DSTR_NM, tempVendorPayment.getVEND_DSTR_NM())
                    .withValue(ArticleContract.TempVendorPayment.CHEQUE_NO, tempVendorPayment.getCHEQUE_NO())

                    .build());
            syncvendorPaymentResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from tmp_vend_dstr_payment_mail......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.TempVendorPayment.CONTENT_URI_TEMP_VENDORPAYMENT, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncSalesMasterReturn(SyncResult syncsalesmasterreturnResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_str_sales_master_return.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_str_sales_master_return...");
        Map<String, StrSalesMasterReturn> networkEntriesSalesMasterReturn = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonSalesMasterReturn = new JSONObject(jsonFeed);
        JSONArray jsonSalesMasterReturnArticles = jsonSalesMasterReturn.getJSONArray("retail_str_sales_master_return");
        for (int i = 0; i < jsonSalesMasterReturnArticles.length(); i++) {
            StrSalesMasterReturn tempSalesMasterReturn = StrSalesMasterReturnParser.parse(jsonSalesMasterReturnArticles.optJSONObject(i));

            networkEntriesSalesMasterReturn.put(tempSalesMasterReturn.getTRI_ID(),tempSalesMasterReturn);


        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.SALESMASTERRETURN.CONTENT_URI_SALES_MASTER_RETURN, null, null, null, null, null);
        assert c != null;

        String ID;
        String STORE_ID;
        String TRI_ID;
        String GRAND_TOTAL;
        String REASON_OF_RETURN;
        String BUSINESS_DATE;
        String SALE_DATE;
        String SALE_TIME;
        String CARD_NO;
        String TOTAL_POINTS;
        String SCHEME_POINTS;
        String FLAG;
        String CREATED_BY;
        String CREATED_ON;
        String LAST_MODIFIED;
        String S_FLAG;
        String POS_USER;
        String M_FLAG;
        String EX_TRI_ID;
        String ORDER_TYPE;
        String PICK_UP_LOCATION;
        String DISCOUNT_PERCENT;
        String LINE_ITEM_DISC;
        String LINE_DISC;

        StrSalesMasterReturn foundtempSalesMasterReturn;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncsalesmasterreturnResult.stats.numEntries++;
            // Create local article entry
            ID = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.ID));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.STORE_ID));
            TRI_ID = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.TRI_ID));
            GRAND_TOTAL = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.GRAND_TOTAL));
            REASON_OF_RETURN = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.REASON_OF_RETURN));
            BUSINESS_DATE = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.BUSINESS_DATE));
            SALE_DATE = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.SALE_DATE));
            SALE_TIME = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.SALE_TIME));
            CARD_NO = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.CARD_NO));
            TOTAL_POINTS = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.TOTAL_POINTS));
            SCHEME_POINTS = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.SCHEME_POINTS));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.FLAG));
            CREATED_BY = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.CREATED_BY));
            CREATED_ON = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.CREATED_ON));
            LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.LAST_MODIFIED));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.M_FLAG));
            EX_TRI_ID = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.EX_TRI_ID));
            ORDER_TYPE = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.ORDER_TYPE));
            PICK_UP_LOCATION = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.PICK_UP_LOCATION));
            DISCOUNT_PERCENT = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.DISCOUNT_PERCENT));
            LINE_ITEM_DISC = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.LINE_ITEM_DISC));
            LINE_DISC = c.getString(c.getColumnIndex(ArticleContract.SALESMASTERRETURN.LINE_DISC));

            // Try to retrieve the local entry from network entries
            foundtempSalesMasterReturn = networkEntriesSalesMasterReturn.get(TRI_ID);


            if (foundtempSalesMasterReturn != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesSalesMasterReturn.remove(TRI_ID);


                // Check to see if it needs to be updated
//                if (!VEND_DSTR_NM.equals(foundtempSalesMasterReturn.getVEND_DSTR_NM())
                if (!EX_TRI_ID.equals(foundtempSalesMasterReturn.getEX_TRI_ID())

//                        || !CHEQUE_NO.equals(foundtempSalesMasterReturn.getCHEQUE_NO())
                        || !CARD_NO.equals(foundtempSalesMasterReturn.getCARD_NO())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + EX_TRI_ID);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.SALESMASTERRETURN.CONTENT_URI_SALES_MASTER_RETURN)
                            .withSelection(ArticleContract.SALESMASTERRETURN.TRI_ID + "='" + TRI_ID + "'", null)
                            .withValue(ArticleContract.SALESMASTERRETURN.EX_TRI_ID, foundtempSalesMasterReturn.getEX_TRI_ID())
                            .withValue(ArticleContract.SALESMASTERRETURN.CARD_NO, foundtempSalesMasterReturn.getCARD_NO())
                            .build());
                    syncsalesmasterreturnResult.stats.numUpdates++;
                }

            } else {

                salesmasterreturn.add(ID);
                salesmasterreturn.add(STORE_ID);
                salesmasterreturn.add(TRI_ID);
                salesmasterreturn.add(GRAND_TOTAL);
                salesmasterreturn.add(REASON_OF_RETURN);
                salesmasterreturn.add(BUSINESS_DATE);
                salesmasterreturn.add(SALE_DATE);
                salesmasterreturn.add(SALE_TIME);
                salesmasterreturn.add(CARD_NO);
                salesmasterreturn.add(TOTAL_POINTS);
                salesmasterreturn.add(SCHEME_POINTS);
                salesmasterreturn.add(FLAG);
                salesmasterreturn.add(CREATED_BY);
                salesmasterreturn.add(CREATED_ON);
                salesmasterreturn.add(LAST_MODIFIED);
                salesmasterreturn.add(S_FLAG);
                salesmasterreturn.add(POS_USER);
                salesmasterreturn.add(M_FLAG);
                salesmasterreturn.add(EX_TRI_ID);
                salesmasterreturn.add(ORDER_TYPE);
                salesmasterreturn.add(PICK_UP_LOCATION);
                salesmasterreturn.add(DISCOUNT_PERCENT);
                salesmasterreturn.add(LINE_ITEM_DISC);
                salesmasterreturn.add(LINE_DISC);

            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempSalesMasterReturn = new StringBuilder(128);
        for (String value : salesmasterreturn) {
            if (sbtempSalesMasterReturn.length() > 0) {
                sbtempSalesMasterReturn.append("|");
            }
            sbtempSalesMasterReturn.append(value);
        }
        sbtempSalesMasterReturn.insert(0, "|");
        HashMap<String, String> tempsalesmasterreturn = new HashMap<>();
        tempsalesmasterreturn.put("retail_str_sales_master_return", String.valueOf(sbtempSalesMasterReturn));
        Log.d("******", String.valueOf(sbtempSalesMasterReturn));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_str_sales_master_return_upload.jsp", tempsalesmasterreturn);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_str_sales_master_return");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (StrSalesMasterReturn tempSalesMasterReturn : networkEntriesSalesMasterReturn.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_str_sales_master_return...: " + tempSalesMasterReturn.getCARD_NO() + tempSalesMasterReturn.getEX_TRI_ID() + tempSalesMasterReturn.getTRI_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.SALESMASTERRETURN.CONTENT_URI_SALES_MASTER_RETURN)
                    .withValue(ArticleContract.SALESMASTERRETURN.TRI_ID, tempSalesMasterReturn.getTRI_ID())
                    .withValue(ArticleContract.SALESMASTERRETURN.EX_TRI_ID, tempSalesMasterReturn.getEX_TRI_ID())
                    .withValue(ArticleContract.SALESMASTERRETURN.CARD_NO, tempSalesMasterReturn.getCARD_NO())

                    .build());
            syncsalesmasterreturnResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_str_sales_master_return......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.SALESMASTERRETURN.CONTENT_URI_SALES_MASTER_RETURN, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncSalesDetailsReturn(SyncResult syncsalesdetailsreturnResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_str_sales_details_return...");
        Map<String, StrSalesDetailsReturn> networkEntriesSalesDetailsReturn = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonSalesDetailsReturn = new JSONObject(jsonFeed);
        JSONArray jsonSalesDetailsReturnArticles = jsonSalesDetailsReturn.getJSONArray("retail_str_sales_details_return");
        for (int i = 0; i < jsonSalesDetailsReturnArticles.length(); i++) {
            StrSalesDetailsReturn tempSalesDetailsReturn = StrSalesDetailsReturnParser.parse(jsonSalesDetailsReturnArticles.optJSONObject(i));
            networkEntriesSalesDetailsReturn.put(tempSalesDetailsReturn.getTRI_ID(),tempSalesDetailsReturn);
            Log.d("TMP_SLES_DTLS_RTRN_DATA", tempSalesDetailsReturn.getTRI_ID());
            Log.d("TMP_SLES_DTLS_RTRN_DATA", tempSalesDetailsReturn.getCARD_NO());


        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.SALESDETAILSRETURN.CONTENT_URI_SALES_DETAILS_RETURN, null, null, null, null, null);
        assert c != null;

        String ID;
        String TRI_ID;
        String STORE_ID;
        String PROD_NM;
        String BATCH_NO;
        String EXP_DATE;
        String S_PRICE;
        String QTY;
        String MRP;
        String AMOUNT;
        String UOM;
        String TOTAL;
        String STATUS;
        String CARD_NO;
        String ITEM_ID;
        String DISC_PERC;
        String DISC_VAL;
        String TAX_PER;
        String TAX_VALUE;
        String TAX_PER1;
        String TAX_VALUE1;
        String TAX_PER2;
        String TAX_VALUE2;
        String TAX_PER3;
        String S_FLAG;
        String FLAG;
        String LAST_MODIFIED;
        String SALE_DATE;
        String POS_USER;
        String M_FLAG;
        String EX_TRI_ID;
        String ORDER_TYPE;
        String PICK_UP_LOCATION;
        String DISCOUNT_PERCENT;

        StrSalesDetailsReturn foundtempSalesDetailsReturn;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncsalesdetailsreturnResult.stats.numEntries++;
            // Create local article entry
            ID = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.ID));
            TRI_ID = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TRI_ID));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.STORE_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.PROD_NM));
            BATCH_NO = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.BATCH_NO));
            EXP_DATE = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.EXP_DATE));
            S_PRICE = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.S_PRICE));
            QTY = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.QTY));
            MRP = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.MRP));
            AMOUNT = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.AMOUNT));
            UOM = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.UOM));
            TOTAL = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TOTAL));
            STATUS = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.STATUS));
            CARD_NO = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.CARD_NO));
            ITEM_ID = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.ITEM_ID));
            DISC_PERC = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.DISC_PERC));
            DISC_VAL = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.DISC_VAL));
            TAX_PER = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TAX_PER));
            TAX_VALUE = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TAX_VALUE));
            TAX_PER1 = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TAX_PER1));
            TAX_VALUE1 = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TAX_VALUE1));
            TAX_PER2 = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TAX_PER2));
            TAX_VALUE2 = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TAX_VALUE2));
            TAX_PER3 = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.TAX_PER3));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.S_FLAG));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.FLAG));
            LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.LAST_MODIFIED));
            SALE_DATE = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.SALE_DATE));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.M_FLAG));
            EX_TRI_ID = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.EX_TRI_ID));
            ORDER_TYPE = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.ORDER_TYPE));
            PICK_UP_LOCATION = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.PICK_UP_LOCATION));
            DISCOUNT_PERCENT = c.getString(c.getColumnIndex(ArticleContract.SALESDETAILSRETURN.DISCOUNT_PERCENT));

            // Try to retrieve the local entry from network entries
            foundtempSalesDetailsReturn = networkEntriesSalesDetailsReturn.get(TRI_ID);

            if (foundtempSalesDetailsReturn != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesSalesDetailsReturn.remove(TRI_ID);

                // Check to see if it needs to be updated
                if (!EX_TRI_ID.equals(foundtempSalesDetailsReturn.getEX_TRI_ID())

//                        || !CHEQUE_NO.equals(foundtempSalesMasterReturn.getCHEQUE_NO())
                        || !CARD_NO.equals(foundtempSalesDetailsReturn.getCARD_NO())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + EX_TRI_ID);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.SALESDETAILSRETURN.CONTENT_URI_SALES_DETAILS_RETURN)
                            .withSelection(ArticleContract.SALESDETAILSRETURN.TRI_ID + "='" + TRI_ID + "'", null)
                            .withValue(ArticleContract.SALESDETAILSRETURN.EX_TRI_ID, foundtempSalesDetailsReturn.getEX_TRI_ID())
                            .withValue(ArticleContract.SALESDETAILSRETURN.CARD_NO, foundtempSalesDetailsReturn.getCARD_NO())
                            .build());
                    syncsalesdetailsreturnResult.stats.numUpdates++;
                }

            } else {

                salesdetailsreturn.add(TRI_ID);
                salesdetailsreturn.add(STORE_ID);
                salesdetailsreturn.add(PROD_NM);
                salesdetailsreturn.add(BATCH_NO);
                salesdetailsreturn.add(EXP_DATE);
                salesdetailsreturn.add(S_PRICE);
                salesdetailsreturn.add(QTY);
                salesdetailsreturn.add(MRP);
                salesdetailsreturn.add(AMOUNT);
                salesdetailsreturn.add(UOM);
                salesdetailsreturn.add(TOTAL);
                salesdetailsreturn.add(STATUS);
                salesdetailsreturn.add(CARD_NO);
                salesdetailsreturn.add(ITEM_ID);
                salesdetailsreturn.add(DISC_PERC);
                salesdetailsreturn.add(DISC_VAL);
                salesdetailsreturn.add(TAX_PER);
                salesdetailsreturn.add(TAX_VALUE);
                salesdetailsreturn.add(TAX_PER1);
                salesdetailsreturn.add(TAX_VALUE1);
                salesdetailsreturn.add(TAX_PER2);
                salesdetailsreturn.add(TAX_VALUE2);
                salesdetailsreturn.add(TAX_PER3);
                salesdetailsreturn.add(S_FLAG);
                salesdetailsreturn.add(FLAG);
                salesdetailsreturn.add(LAST_MODIFIED);
                salesdetailsreturn.add(SALE_DATE);
                salesdetailsreturn.add(POS_USER);
                salesdetailsreturn.add(M_FLAG);
                salesdetailsreturn.add(EX_TRI_ID);
                salesdetailsreturn.add(ORDER_TYPE);
                salesdetailsreturn.add(PICK_UP_LOCATION);
                salesdetailsreturn.add(DISCOUNT_PERCENT);

            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempSalesDetailsReturn = new StringBuilder(128);
        for (String value : salesmasterreturn) {
            if (sbtempSalesDetailsReturn.length() > 0) {
                sbtempSalesDetailsReturn.append("|");
            }
            sbtempSalesDetailsReturn.append(value);
        }
        sbtempSalesDetailsReturn.insert(0, "|");
        HashMap<String, String> tempsalesdetailsreturn = new HashMap<>();
        tempsalesdetailsreturn.put("retail_str_sales_details_return", String.valueOf(sbtempSalesDetailsReturn));
        Log.d("******", String.valueOf(sbtempSalesDetailsReturn));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://47.88.152.247:8080/FMCG/retail_str_sales_details_return_upload.jsp", tempsalesdetailsreturn);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_str_sales_details_return");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (StrSalesDetailsReturn tempSalesDetailsReturn : networkEntriesSalesDetailsReturn.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_str_sales_details_return...: " + tempSalesDetailsReturn.getCARD_NO() + tempSalesDetailsReturn.getEX_TRI_ID() + tempSalesDetailsReturn.getTRI_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.SALESDETAILSRETURN.CONTENT_URI_SALES_DETAILS_RETURN)
                    .withValue(ArticleContract.SALESDETAILSRETURN.TRI_ID, tempSalesDetailsReturn.getTRI_ID())
                    .withValue(ArticleContract.SALESDETAILSRETURN.EX_TRI_ID, tempSalesDetailsReturn.getEX_TRI_ID())
                    .withValue(ArticleContract.SALESDETAILSRETURN.CARD_NO, tempSalesDetailsReturn.getCARD_NO())

                    .build());
            syncsalesdetailsreturnResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_str_sales_details_return......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.SALESDETAILSRETURN.CONTENT_URI_SALES_DETAILS_RETURN, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncStrDistributor(SyncResult syncstrdistributorResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_str_dstr.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_str_dstr...");
        Map<String, StrDistributor> networkEntriesStrDistributor = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonStrDistributor = new JSONObject(jsonFeed);
        JSONArray jsonStrDistributorArticles = jsonStrDistributor.getJSONArray("Retail_str_dstr");
        for (int i = 0; i < jsonStrDistributorArticles.length(); i++) {
            StrDistributor strDistributor = StrDistributorParser.parse(jsonStrDistributorArticles.optJSONObject(i));
            networkEntriesStrDistributor.put(strDistributor.getSTORE_ID(),strDistributor);


        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.STRDISTRIBUTOR.CONTENT_URI_STR_DISTRIBUTOR, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();

        String STORE_ID;
        String DSTR_ID;
        String DSTR_NM;
        String DSTR_CNTCT_NM;
        String ADD_1;
        String CITY;
        String CTR_NM;
        String ZIP;
        String TELE;
        String MOBILE;
        String DSTR_INV;
        String ACTIVE;
        String EMAIL;
        String LAST_MODIFIED;
        String USER;
        String S_FLAG;
        String POS_USER;
        String M_FLAG;

        StrDistributor found;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncstrdistributorResult.stats.numEntries++;
            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.STORE_ID));
            DSTR_ID = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.DSTR_ID));
            DSTR_NM = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.DSTR_NM));
            DSTR_CNTCT_NM = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.DSTR_CNTCT_NM));
            ADD_1 = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.ADD_1));
            CITY = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.CITY));
            CTR_NM = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.CTR_NM));
            ZIP = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.ZIP));
            TELE = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.TELE));
            MOBILE = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.MOBILE));
            DSTR_INV = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.DSTR_INV));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.ACTIVE));
            EMAIL = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.EMAIL));
            //LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.LAST_MODIFIED));
            USER = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.USER));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.STRDISTRIBUTOR.M_FLAG));

            // Try to retrieve the local entry from network entries
            found = networkEntriesStrDistributor.get(STORE_ID+DSTR_ID);
            if (found != null && M_FLAG==null ) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesStrDistributor.remove(STORE_ID+DSTR_ID);
            } else{

                strdstr.add( STORE_ID );
                strdstr.add( DSTR_ID );
                strdstr.add( DSTR_NM );
                strdstr.add( DSTR_CNTCT_NM );
                strdstr.add( ADD_1 );
                strdstr.add( CITY );
                strdstr.add( CTR_NM );
                strdstr.add( ZIP );
                strdstr.add( TELE );
                strdstr.add( MOBILE );
                strdstr.add( DSTR_INV );
                strdstr.add( ACTIVE );
                strdstr.add( EMAIL );
               // strdstr.add( LAST_MODIFIED );
                strdstr.add( USER );
                strdstr.add( S_FLAG );
                strdstr.add( POS_USER );
                strdstr.add( M_FLAG );
                strdstr.add(";");

            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbstrdistributor = new StringBuilder(128);
        for (String value : strdstr) {
            if (sbstrdistributor.length() > 0) {
                sbstrdistributor.append("|");
            }
            sbstrdistributor.append(value);
        }
        sbstrdistributor.insert(0, "|");
        HashMap<String, String> tempsalesdetailsreturn = new HashMap<>();
        tempsalesdetailsreturn.put("Retail_str_dstr", String.valueOf(sbstrdistributor));
        Log.d("******", String.valueOf(sbstrdistributor));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_str_dstr_upload.jsp", tempsalesdetailsreturn);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_dstr");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
      /*  for (StrDistributor tempStrDistributor : networkEntriesStrDistributor.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_str_dstr...: " + tempStrDistributor.getDSTR_CNTCT_NM() + tempStrDistributor.getDSTR_NM() + tempStrDistributor.getDSTR_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.STRDISTRIBUTOR.CONTENT_URI_STR_DISTRIBUTOR)
                    .withValue(ArticleContract.STRDISTRIBUTOR.DSTR_ID, tempStrDistributor.getDSTR_ID())
                    .withValue(ArticleContract.STRDISTRIBUTOR.DSTR_NM, tempStrDistributor.getDSTR_NM())
                    .withValue(ArticleContract.STRDISTRIBUTOR.DSTR_CNTCT_NM, tempStrDistributor.getDSTR_CNTCT_NM())

                    .build());
            syncstrdistributorResult.stats.numInserts++;
        }
*/
        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_str_dstr......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.STRDISTRIBUTOR.CONTENT_URI_STR_DISTRIBUTOR, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network



    }

    void syncstoreprodcpg(SyncResult syncstoreprodResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_store_prod_cpg.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store_prod_cpg...");
        Map<String, StoreProdCpg> networkEntriesStoreProd = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonStoreProd = new JSONObject(jsonFeed);
        JSONArray jsonStoreProdArticles = jsonStoreProd.getJSONArray("retail_store_prod_cpg");
        for (int i = 0; i < jsonStoreProdArticles.length(); i++) {
            StoreProdCpg prodCpg = StoreProdCpgParser.parse(jsonStoreProdArticles.optJSONObject(i));
            networkEntriesStoreProd.put(prodCpg.getPROD_ID(),prodCpg);



        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.ProdCPG.CONTENT_URI_PROD_CPG, null, null, null, null, null);
        assert c != null;

        c.moveToFirst();


        String STORE_ID;
        String PROD_ID;
        String PROD_NM;
        String BARCODE;
        String MRP;
        String S_PRICE;
        String P_PRICE;
        String TAX_DESC;
        String PROD_HIER_DESC_3;
        String PACK_UNIT_1;
        String PACK_UNIT_2;
        String MFG;
        String SELLING_ORDER_UNIT;
        String INTERNET_PRICE;
        String IS_PROD_REL_INT;
        String ACTIVE;
        String C_IMG;
        String LAST_MODIFIED;
        String PROFIT_MARGIN;
        String USER;
        String S_FLAG;
        String IND_NM;
        String POS_USER;
        String M_FLAG;
        String DISCOUNT_PERCENT;
        String DISCOUNT_PERCENT_AMOUNT;

        StoreProdCpg found;


        for (int i = 0; i < c.getCount(); i++) {
            syncstoreprodResult.stats.numEntries++;
            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.STORE_ID));
            PROD_ID = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.PROD_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.PROD_NAME));
            BARCODE = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.BARCODE));
            MRP = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.MRP));
            S_PRICE = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.S_PRICE));
            P_PRICE = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.P_PRICE));
            TAX_DESC = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.TAX_DESC));
            PROD_HIER_DESC_3 = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.PROD_HIER_DESC_3));
            MFG = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.MFG));
            SELLING_ORDER_UNIT = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.SELLING_ORDER_UNIT));
            INTERNET_PRICE = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.INTERNET_PRICE));
            IS_PROD_REL_INT = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.IS_PROD_REL_INT));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.ACTIVE));
            C_IMG = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.C_IMG));
            LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.LAST_MODIFIED));
            PACK_UNIT_1= c.getString(c.getColumnIndex(ArticleContract.ProdCPG.PACK_UNIT_1));
            PACK_UNIT_2= c.getString(c.getColumnIndex(ArticleContract.ProdCPG.PACK_UNIT_2));
            PROFIT_MARGIN = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.PROFIT_MARGIN));
            USER = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.USER));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.S_FLAG));
            IND_NM = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.IND_NAME));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.M_FLAG));
            DISCOUNT_PERCENT = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.DISCOUNT_PERCENT));
            DISCOUNT_PERCENT_AMOUNT = c.getString(c.getColumnIndex(ArticleContract.ProdCPG.DISCOUNT_PERCENT_AMOUNT));

            // Try to retrieve the local entry from network entries
            found = networkEntriesStoreProd.get(PROD_ID);
           /* Log.d("Database***", BARCODE);
            Log.d("SERVER****", (found.getBARCODE()));*/


            // if(found != null && (found.getBARCODE().equals(BARCODE)||found.getACTIVE().equals(ACTIVE) ||found.getP_PRICE().equals(P_PRICE) ||found.getS_PRICE().equals(S_PRICE) ||found.getDISCOUNT_PERCENT().equals(DISCOUNT_PERCENT)||found.getMRP().equals(MRP) ||found.getSELLING_ORDER_UNIT().equals(SELLING_ORDER_UNIT))||found.getPOS_USER().equals(POS_USER)) {
            if(found!=null&&found.getACTIVE().equals(ACTIVE)&&found.getP_PRICE().equals(P_PRICE)&&found.getS_PRICE().equals(S_PRICE) &&found.getDISCOUNT_PERCENT().equals(DISCOUNT_PERCENT)&&found.getMRP().equals(MRP) &&found.getSELLING_ORDER_UNIT().equals(SELLING_ORDER_UNIT)&&found.getPOS_USER().equals(POS_USER)){
                   /* Log.d("Database***", BARCODE  + MRP  + ACTIVE  + P_PRICE  + S_PRICE  + DISCOUNT_PERCENT +  SELLING_ORDER_UNIT  +POS_USER);
                    Log.d("SERVER****", (found.getBARCODE()));*/
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesStoreProd.remove(PROD_ID);


            } else {

                storeprod.add(STORE_ID);
                storeprod.add(PROD_ID);
                storeprod.add(PROD_NM);
                storeprod.add(BARCODE);
                storeprod.add(MRP);
                storeprod.add(S_PRICE);
                storeprod.add(P_PRICE);
                storeprod.add(SELLING_ORDER_UNIT);
                storeprod.add(INTERNET_PRICE);
                storeprod.add(IS_PROD_REL_INT);
                storeprod.add(TAX_DESC);
                storeprod.add(PROD_HIER_DESC_3);
                storeprod.add(PACK_UNIT_1);
                storeprod.add(PACK_UNIT_2);
                storeprod.add(MFG);
                storeprod.add(ACTIVE);
                storeprod.add(C_IMG);
                storeprod.add(PROFIT_MARGIN);
                storeprod.add(LAST_MODIFIED);
                storeprod.add(USER);
                storeprod.add(S_FLAG);
                storeprod.add(IND_NM);
                storeprod.add(POS_USER);
                storeprod.add(M_FLAG);
                storeprod.add(DISCOUNT_PERCENT);
                storeprod.add(DISCOUNT_PERCENT_AMOUNT);
                storeprod.add(";");


            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempStoreProd = new StringBuilder(128);
        for (String value : storeprod) {
            if (sbtempStoreProd.length() > 0) {
                sbtempStoreProd.append("|");
            }
            sbtempStoreProd.append(value);
        }
        sbtempStoreProd.insert(0, "|");
        HashMap<String, String> tempstoreprod = new HashMap<>();
        tempstoreprod.put("retail_store_prod_cpg", String.valueOf(sbtempStoreProd));
        Log.d("******", String.valueOf(sbtempStoreProd));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_store_prod_cpg_upload.jsp", tempstoreprod);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Response", success + " " + "retail_store_prod_cpg");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store_prod_cpg......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.ProdCPG.CONTENT_URI_PROD_CPG, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network


    }


    void syncsendmailpdf(SyncResult syncsendmailpdfResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_send_mail_pdf...");
        Map<String, SendMailPdf> networkEntriesSendMailPdf= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonSendMailPdf = new JSONObject(jsonFeed);
        JSONArray jsonSendMailPdfArticles = jsonSendMailPdf.getJSONArray("retail_send_mail_pdf");
        for (int i = 0; i < jsonSendMailPdfArticles.length(); i++) {
            SendMailPdf tempSendMailPdf = SendMailPdfParser.parse(jsonSendMailPdfArticles.optJSONObject(i));
            networkEntriesSendMailPdf.put(tempSendMailPdf.getTXN_ID(),tempSendMailPdf);
            Log.d("TMP_SEND_MAIL_PDF_DATA", tempSendMailPdf.getTXN_ID());
            Log.d("TMP_SEND_MAIL_PDF_DATA", tempSendMailPdf.getPREFIX_NM());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.SENDMAILPDF.CONTENT_URI_SEND_MAIL_PDF, null, null, null, null, null);
        assert c != null;

        String TXN_ID;
        String UNIVERSAL_ID;
        String PREFIX_NM;
        String FM;
        String EMAIL_TO;
        String CC;
        String SUBJECT;
        String BODY;
        String FLAG;
        String PO_NO;
        String VENDOR_NAME;
        String LAST_MODIFIED;
        String S_FLAG;
        String POS_USER;
        String STORE_ID;
        String M_FLAG;
        String SLAVE_FLAG;

        SendMailPdf foundtempSendMailPdf;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncsendmailpdfResult.stats.numEntries++;
            // Create local article entry
            TXN_ID = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.STORE_ID));
            UNIVERSAL_ID = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.UNIVERSAL_ID));
            PREFIX_NM = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.PREFIX_NM));
            FM = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.FM));
            EMAIL_TO = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.EMAIL_TO));
            CC = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.CC));
            SUBJECT = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.SUBJECT));
            BODY = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.BODY));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.FLAG));
            PO_NO = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.PO_NO));
            VENDOR_NAME = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.VENDOR_NAME));
            LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.LAST_MODIFIED));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.POS_USER));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.STORE_ID));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.M_FLAG));
            SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.SENDMAILPDF.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempSendMailPdf = networkEntriesSendMailPdf.get(TXN_ID);

            if (foundtempSendMailPdf != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesSendMailPdf.remove(TXN_ID);

                // Check to see if it needs to be updated
                if (!VENDOR_NAME.equals(foundtempSendMailPdf.getVENDOR_NAME())
                        || !PO_NO.equals(foundtempSendMailPdf.getPO_NO())


                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + VENDOR_NAME);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.SENDMAILPDF.CONTENT_URI_SEND_MAIL_PDF)
                            .withSelection(ArticleContract.SENDMAILPDF.TXN_ID + "='" + TXN_ID + "'", null)
                            .withValue(ArticleContract.SENDMAILPDF.VENDOR_NAME, foundtempSendMailPdf.getVENDOR_NAME())
                            .withValue(ArticleContract.SENDMAILPDF.PO_NO, foundtempSendMailPdf.getPO_NO())
                            .build());
                    syncsendmailpdfResult.stats.numUpdates++;
                }

            } else {

                sendmailpdf.add(TXN_ID);
                sendmailpdf.add(UNIVERSAL_ID);
                sendmailpdf.add(PREFIX_NM);
                sendmailpdf.add(FM);
                sendmailpdf.add(EMAIL_TO);
                sendmailpdf.add(CC);
                sendmailpdf.add(SUBJECT);
                sendmailpdf.add(BODY);
                sendmailpdf.add(FLAG);
                sendmailpdf.add(PO_NO);
                sendmailpdf.add(VENDOR_NAME);
                sendmailpdf.add(LAST_MODIFIED);
                sendmailpdf.add(S_FLAG);
                sendmailpdf.add(POS_USER);
                sendmailpdf.add(STORE_ID);
                sendmailpdf.add(M_FLAG);
                sendmailpdf.add(SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempSendMailPdf = new StringBuilder(128);
        for (String value : storeprod) {
            if (sbtempSendMailPdf.length() > 0) {
                sbtempSendMailPdf.append("|");
            }
            sbtempSendMailPdf.append(value);
        }
        sbtempSendMailPdf.insert(0, "|");
        HashMap<String, String> tempsendmailpdf = new HashMap<>();
        tempsendmailpdf.put("retail_send_mail_pdf", String.valueOf(sbtempSendMailPdf));
        Log.d("******", String.valueOf(sbtempSendMailPdf));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempsendmailpdf);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_send_mail_pdf");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (SendMailPdf tempSendMailPdf : networkEntriesSendMailPdf.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_send_mail_pdf...: " + tempSendMailPdf.getPO_NO() + tempSendMailPdf.getVENDOR_NAME() + tempSendMailPdf.getTXN_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.SENDMAILPDF.CONTENT_URI_SEND_MAIL_PDF)
                    .withValue(ArticleContract.SENDMAILPDF.TXN_ID, tempSendMailPdf.getTXN_ID())
                    .withValue(ArticleContract.SENDMAILPDF.VENDOR_NAME, tempSendMailPdf.getVENDOR_NAME())
                    .withValue(ArticleContract.SENDMAILPDF.PO_NO, tempSendMailPdf.getPO_NO())

                    .build());
            syncsendmailpdfResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_send_mail_pdf......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.SENDMAILPDF.CONTENT_URI_SEND_MAIL_PDF, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncadtickermain(SyncResult syncadtickermainResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from ad_ticker_main...");
        Map<String, adTickerMain> networkEntriesAdTickerMain= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonAdTickerMain = new JSONObject(jsonFeed);
        JSONArray jsonAdTickerMainArticles = jsonAdTickerMain.getJSONArray("ad_ticker_main");
        for (int i = 0; i < jsonAdTickerMainArticles.length(); i++) {
            adTickerMain tempAdTickerMain = adTickerMainParser.parse(jsonAdTickerMainArticles.optJSONObject(i));
            networkEntriesAdTickerMain.put(tempAdTickerMain.getAD_MAIN_ID(),tempAdTickerMain);
            Log.d("TMP_AD_TICKER_MAIN_DATA", tempAdTickerMain.getAD_MAIN_ID());
            Log.d("TMP_AD_TICKER_MAIN_DATA", tempAdTickerMain.getAD_TEXT());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.ADTICKERMAIN.CONTENT_URI_AD_TICKER_MAIN, null, null, null, null, null);
        assert c != null;

        String AD_MAIN_ID;
        String USER;
        String STORE_ID;
        String AD_DESC;
        String AD_TEXT;
        String AD_STRT_DT;
        String AD_END_DT;
        String STATUS;
        String LAST_MODIFIED;
        String S_FLAG;
        String POS_USER;
        String M_FLAG;
        String SLAVE_FLAG;
        String STORE_MEDIA_ID;

        adTickerMain foundtempAdTickerMain;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncadtickermainResult.stats.numEntries++;
            // Create local article entry
            AD_MAIN_ID = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.AD_MAIN_ID));
            USER = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.USER));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.STORE_ID));
            AD_DESC = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.AD_DESC));
            AD_TEXT = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.AD_TEXT));
            AD_STRT_DT = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.AD_STRT_DT));
            AD_END_DT = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.AD_END_DT));
            STATUS = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.STATUS));
            //LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.LAST_MODIFIED));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.M_FLAG));
            //SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.SLAVE_FLAG));
           // STORE_MEDIA_ID = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.STORE_MEDIA_ID));

            // Try to retrieve the local entry from network entries
            foundtempAdTickerMain = networkEntriesAdTickerMain.get(AD_MAIN_ID);

            if (foundtempAdTickerMain != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesAdTickerMain.remove(AD_MAIN_ID);

                // Check to see if it needs to be updated
                if (!AD_MAIN_ID.equals(foundtempAdTickerMain.getSTORE_MEDIA_ID())
                        || !AD_DESC.equals(foundtempAdTickerMain.getAD_DESC())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + AD_MAIN_ID);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.ADTICKERMAIN.CONTENT_URI_AD_TICKER_MAIN)
                            .withSelection(ArticleContract.ADTICKERMAIN.AD_MAIN_ID + "='" + AD_MAIN_ID + "'", null)
                            .withValue(ArticleContract.ADTICKERMAIN.AD_DESC, foundtempAdTickerMain.getAD_DESC())
                            .build());
                    syncadtickermainResult.stats.numUpdates++;
                }

            } else {

                adtickermain.add( AD_MAIN_ID);
                adtickermain.add( USER);
                adtickermain.add( STORE_ID);
                adtickermain.add( AD_DESC);
                adtickermain.add( AD_TEXT);
                adtickermain.add( AD_STRT_DT);
                adtickermain.add( AD_END_DT);
                adtickermain.add( STATUS);
               // adtickermain.add( LAST_MODIFIED);
                adtickermain.add( S_FLAG);
                adtickermain.add( POS_USER);
                adtickermain.add( M_FLAG);
                //adtickermain.add( SLAVE_FLAG);
                //adtickermain.add( STORE_MEDIA_ID);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempAdTickerMain = new StringBuilder(128);
        for (String value : adtickermain) {
            if (sbtempAdTickerMain.length() > 0) {
                sbtempAdTickerMain.append("|");
            }
            sbtempAdTickerMain.append(value);
        }
        sbtempAdTickerMain.insert(0, "|");
        HashMap<String, String> tempadtickermain = new HashMap<>();
        tempadtickermain.put("ad_ticker_main", String.valueOf(sbtempAdTickerMain));
        Log.d("******", String.valueOf(sbtempAdTickerMain));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempadtickermain);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "ad_ticker_main");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (adTickerMain tempAdTickerMain : networkEntriesAdTickerMain.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from ad_ticker_main...: " + tempAdTickerMain.getAD_DESC() + tempAdTickerMain.getSTORE_MEDIA_ID() + tempAdTickerMain.getAD_MAIN_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.ADTICKERMAIN.CONTENT_URI_AD_TICKER_MAIN)
                    .withValue(ArticleContract.ADTICKERMAIN.AD_MAIN_ID, tempAdTickerMain.getAD_MAIN_ID())
                    //.withValue(ArticleContract.ADTICKERMAIN.STORE_MEDIA_ID, tempAdTickerMain.getSTORE_MEDIA_ID())
                    .withValue(ArticleContract.ADTICKERMAIN.AD_DESC, tempAdTickerMain.getAD_DESC())

                    .build());
            syncadtickermainResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from ad_ticker_main......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.ADTICKERMAIN.CONTENT_URI_AD_TICKER_MAIN, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void synctopproduct(SyncResult synctopproductResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_top_product.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_top_product...");
        Map<String, TopProduct> networkEntriesTopProduct= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonTopProduct = new JSONObject(jsonFeed);
        JSONArray jsonTopProductArticles = jsonTopProduct.getJSONArray("Retail_top_product");
        for (int i = 0; i < jsonTopProductArticles.length(); i++) {
            TopProduct tempTopProduct = TopProductParser.parse(jsonTopProductArticles.optJSONObject(i));
            networkEntriesTopProduct.put(tempTopProduct.getPROD_ID(),tempTopProduct);


        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.TOPPRODUCT.CONTENT_URI_TOP_PRODUCT, null, null, null, null, null);
        assert c != null;

        c.moveToFirst();

        String STORE_ID;
        String PROD_ID;
        String PROD_NM;
        String PROD_SHORT_NM;
        String LAST_MODIFIED;
        String S_FLAG;
        String ACTIVE;
        String POS_USER;
        String M_FLAG;
        String SLAVE_FLAG;

        TopProduct foundtempTopProduct;

        for (int i = 0; i < c.getCount(); i++) {
            synctopproductResult.stats.numEntries++;
            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.STORE_ID));
            PROD_ID = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.PROD_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.PROD_NM));
            PROD_SHORT_NM = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.PROD_SHORT_NM));
           // LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.LAST_MODIFIED));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.S_FLAG));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.ACTIVE));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.TOPPRODUCT.M_FLAG));
           // SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIN.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempTopProduct = networkEntriesTopProduct.get(STORE_ID);

            if (foundtempTopProduct != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesTopProduct.remove(STORE_ID);



            } else {

                topproduct.add( STORE_ID);
                topproduct.add( PROD_ID);
                topproduct.add( PROD_NM);
                topproduct.add( PROD_SHORT_NM);
               // topproduct.add( LAST_MODIFIED);
                topproduct.add( S_FLAG);
                topproduct.add( ACTIVE);
                topproduct.add( POS_USER);
                topproduct.add( M_FLAG);
               // topproduct.add( SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempTopProduct = new StringBuilder(128);
        for (String value : topproduct) {
            if (sbtempTopProduct.length() > 0) {
                sbtempTopProduct.append("|");
            }
            sbtempTopProduct.append(value);
        }
        sbtempTopProduct.insert(0, "|");
        HashMap<String, String> temptopproduct = new HashMap<>();
        temptopproduct.put("retail_top_product", String.valueOf(sbtempTopProduct));
        Log.d("******", String.valueOf(sbtempTopProduct));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_top_product_upload.jsp", temptopproduct);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_top_product");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_top_product......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.TOPPRODUCT.CONTENT_URI_TOP_PRODUCT, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network


    }

    void syncemployees(SyncResult syncemployeesResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_employees.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_employees...");
        Map<String, Employees> networkEntriesEmployees= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonEmployees = new JSONObject(jsonFeed);
        JSONArray jsonEmployeesArticles = jsonEmployees.getJSONArray("Retail_employees");
        for (int i = 0; i < jsonEmployeesArticles.length(); i++) {
            Employees tempEmployees = EmployeesParser.parse(jsonEmployeesArticles.optJSONObject(i));
            networkEntriesEmployees.put(tempEmployees.getLAST_NAME(),tempEmployees);

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.EMPLOYEES.CONTENT_URI_EMPLOYEES, null, null, null, null, null);
        assert c != null;

        String STORE_ID;
        String USR_NM;
        String FIRST_NAME;
        String LAST_NAME;
        String PASSWORD;
        String CONFIRM_PASSWORD;
        String ACTIVE;
        String LAST_MODIFIED;
        String S_FLAG;
        String POS_USER;
        String M_FLAG;
        String SLAVE_FLAG;

        Employees foundtempEmployees;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncemployeesResult.stats.numEntries++;
            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.STORE_ID));
            USR_NM = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.USR_NM));
            FIRST_NAME = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.FIRST_NAME));
            LAST_NAME = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.LAST_NAME));
            PASSWORD = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.PASSWORD));
            CONFIRM_PASSWORD = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.CONFIRM_PASSWORD));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.ACTIVE));
           // LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.LAST_MODIFIED));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.M_FLAG));
           // SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.EMPLOYEES.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempEmployees = networkEntriesEmployees.get(LAST_NAME);

            if (foundtempEmployees != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesEmployees.remove(LAST_NAME);

                // Check to see if it needs to be updated
                if (!FIRST_NAME.equals(foundtempEmployees.getFIRST_NAME())
                        || !USR_NM.equals(foundtempEmployees.getUSR_NM())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + FIRST_NAME);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.EMPLOYEES.CONTENT_URI_EMPLOYEES)
                            .withSelection(ArticleContract.EMPLOYEES.LAST_NAME + "='" + LAST_NAME + "'", null)
                            .withValue(ArticleContract.EMPLOYEES.FIRST_NAME, foundtempEmployees.getFIRST_NAME())
                            .withValue(ArticleContract.EMPLOYEES.USR_NM, foundtempEmployees.getUSR_NM())
                            .build());
                    syncemployeesResult.stats.numUpdates++;
                }

            } else {

                employees.add(  STORE_ID);
                employees.add(  USR_NM);
                employees.add(  FIRST_NAME);
                employees.add(  LAST_NAME);
                employees.add(  PASSWORD);
                employees.add(  CONFIRM_PASSWORD);
                employees.add(  ACTIVE);
               // employees.add(  LAST_MODIFIED);
                employees.add(  S_FLAG);
                employees.add(  POS_USER);
                employees.add(  M_FLAG);
               // employees.add(  SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempEmployees = new StringBuilder(128);
        for (String value : employees) {
            if (sbtempEmployees.length() > 0) {
                sbtempEmployees.append("|");
            }
            sbtempEmployees.append(value);
        }
        sbtempEmployees.insert(0, "|");
        HashMap<String, String> tempemployees = new HashMap<>();
        tempemployees.put("retail_employees", String.valueOf(sbtempEmployees));
        Log.d("******", String.valueOf(sbtempEmployees));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempemployees);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_employees");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (Employees tempEmployees : networkEntriesEmployees.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_employees...: " + tempEmployees.getUSR_NM() + tempEmployees.getFIRST_NAME() + tempEmployees.getLAST_NAME());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.EMPLOYEES.CONTENT_URI_EMPLOYEES)
                    .withValue(ArticleContract.EMPLOYEES.LAST_NAME, tempEmployees.getLAST_NAME())
                    .withValue(ArticleContract.EMPLOYEES.FIRST_NAME, tempEmployees.getFIRST_NAME())
                    .withValue(ArticleContract.EMPLOYEES.USR_NM, tempEmployees.getUSR_NM())

                    .build());
            syncemployeesResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_employees......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.EMPLOYEES.CONTENT_URI_EMPLOYEES, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void synccustreject(SyncResult synccustrejectResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_store_cust_reject.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store_cust_reject...");
        Map<String, RetailStoreCustReject> networkEntriesCustReject= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonCustReject = new JSONObject(jsonFeed);
        JSONArray jsonCustRejectArticles = jsonCustReject.getJSONArray("Retail_store_cust_reject");
        for (int i = 0; i < jsonCustRejectArticles.length(); i++) {
            RetailStoreCustReject tempCustReject = RetailStrCustRejectParser.parse(jsonCustRejectArticles.optJSONObject(i));
            networkEntriesCustReject.put(tempCustReject.getSTORE_ID(),tempCustReject);


        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_store_cust_reject.CONTENT_URI_CUST_REJECT, null, null, null, null, null);
        assert c != null;

        c.moveToFirst();

        String STORE_ID;
        String ID;
        String REASON_FOR_REJECTION;
        String LAST_MODIFIED;
        String S_FLAG;
        String ACTIVE;
        String POS_USER;
        String M_FLAG;
        String SLAVE_FLAG;

        RetailStoreCustReject found;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            synccustrejectResult.stats.numEntries++;
            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.Retail_store_cust_reject.STORE_ID));
            ID = c.getString(c.getColumnIndex(ArticleContract.Retail_store_cust_reject.ID));
            REASON_FOR_REJECTION = c.getString(c.getColumnIndex(ArticleContract.Retail_store_cust_reject.REASON_FOR_REJECTION));

            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_store_cust_reject.S_FLAG));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.Retail_store_cust_reject.ACTIVE));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.Retail_store_cust_reject.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_store_cust_reject.M_FLAG));


            found = networkEntriesCustReject.get(STORE_ID);

            if (found != null) {

                networkEntriesCustReject.remove(STORE_ID);



            } else {

                custreject.add(STORE_ID);
                custreject.add(ID);
                custreject.add(REASON_FOR_REJECTION);
                //  vendreject.add(LAST_MODIFIED);
                custreject.add(S_FLAG);
                custreject.add(ACTIVE);
                custreject.add(POS_USER);
                custreject.add(M_FLAG);
                custreject.add(";");
                // vendreject.add(SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempCustReject = new StringBuilder(128);
        for (String value : custreject) {
            if (sbtempCustReject.length() > 0) {
                sbtempCustReject.append("|");
            }
            sbtempCustReject.append(value);
        }
        sbtempCustReject.insert(0, "|");
        HashMap<String, String> tempvendreject = new HashMap<>();
        tempvendreject.put("retail_store_cust_reject", String.valueOf(sbtempCustReject));
        Log.d("******", String.valueOf(sbtempCustReject));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_store_cust_reject_upload.jsp", tempvendreject);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_store_cust_reject");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store_cust_reject......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_store_cust_reject.CONTENT_URI_CUST_REJECT, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

    }

    void syncvendreject(SyncResult syncvendrejectResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_store_vend_reject.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store_vend_reject...");
        Map<String, StoreVendReject> networkEntriesVendReject= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonVendReject = new JSONObject(jsonFeed);
        JSONArray jsonVendRejectArticles = jsonVendReject.getJSONArray("retail_store_vend_reject");
        for (int i = 0; i < jsonVendRejectArticles.length(); i++) {
            StoreVendReject tempVendReject = StoreVendRejectParser.parse(jsonVendRejectArticles.optJSONObject(i));
            networkEntriesVendReject.put(tempVendReject.getSTORE_ID(),tempVendReject);


        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.VENDREJECT.CONTENT_URI_VEND_REJECT, null, null, null, null, null);
        assert c != null;

        c.moveToFirst();

        String STORE_ID;
        String ID;
        String REASON_FOR_REJECTION;
        String LAST_MODIFIED;
        String S_FLAG;
        String ACTIVE;
        String POS_USER;
        String M_FLAG;
        String SLAVE_FLAG;

        StoreVendReject found;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncvendrejectResult.stats.numEntries++;
            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.STORE_ID));
            ID = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.ID));
            REASON_FOR_REJECTION = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.REASON_FOR_REJECTION));
           // LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.LAST_MODIFIED));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.S_FLAG));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.ACTIVE));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.M_FLAG));
           // SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.VENDREJECT.SLAVE_FLAG));

       found = networkEntriesVendReject.get(STORE_ID);

            if (found != null) {

                networkEntriesVendReject.remove(STORE_ID);



            } else {

                vendreject.add(STORE_ID);
                vendreject.add(ID);
                vendreject.add(REASON_FOR_REJECTION);
              //  vendreject.add(LAST_MODIFIED);
                vendreject.add(S_FLAG);
                vendreject.add(ACTIVE);
                vendreject.add(POS_USER);
                vendreject.add(M_FLAG);
                vendreject.add(";");
               // vendreject.add(SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempVendReject = new StringBuilder(128);
        for (String value : vendreject) {
            if (sbtempVendReject.length() > 0) {
                sbtempVendReject.append("|");
            }
            sbtempVendReject.append(value);
        }
        sbtempVendReject.insert(0, "|");
        HashMap<String, String> tempvendreject = new HashMap<>();
        tempvendreject.put("retail_store_vend_reject", String.valueOf(sbtempVendReject));
        Log.d("******", String.valueOf(sbtempVendReject));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_store_vend_reject_upload.jsp", tempvendreject);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_store_vend_reject");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store_vend_reject......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.VENDREJECT.CONTENT_URI_VEND_REJECT, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

    }

    void syncvendordetailreturn(SyncResult syncvendordetailreturnResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_str_vendor_detail_return...");
        Map<String, StrVendorDetailReturn> networkEntriesVendorDetailReturn= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonVendorDetailReturn = new JSONObject(jsonFeed);
        JSONArray jsonVendorDetailReturnArticles = jsonVendorDetailReturn.getJSONArray("retail_str_vendor_detail_return");
        for (int i = 0; i < jsonVendorDetailReturnArticles.length(); i++) {
            StrVendorDetailReturn tempVendorDetailReturn = StrVendorDetailReturnParser.parse(jsonVendorDetailReturnArticles.optJSONObject(i));
            networkEntriesVendorDetailReturn.put(tempVendorDetailReturn.getVENDOR_RETURN_ID(),tempVendorDetailReturn);
            Log.d("TMP_VNDR_DETL_RTRN_DATA", tempVendorDetailReturn.getVENDOR_RETURN_ID());
            Log.d("TMP_VNDR_DETL_RTRN_DATA", tempVendorDetailReturn.getBATCH_NO());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.VENDORDETAILRETURN.CONTENT_URI_VENDOR_DETAIL_RETURN, null, null, null, null, null);
        assert c != null;

        String VENDOR_RETURN_ID;
        String PROD_NM;
        String STORE_ID;
        String VENDOR_NM;
        String REASON_OF_RETURN;
        String EXP_DATE;
        String QTY;
        String BATCH_NO;
        String P_PRICE;
        String UOM;
        String TOTAL;
        String LAST_MODIFIED;
        String MRP;
        String S_FLAG;
        String POS_USER;
        String RETURN_DATE;
        String M_FLAG;
        String SLAVE_FLAG;

        StrVendorDetailReturn foundtempVendorDetailReturn;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncvendordetailreturnResult.stats.numEntries++;
            // Create local article entry
            VENDOR_RETURN_ID = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.VENDOR_RETURN_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.PROD_NM));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.STORE_ID));
            VENDOR_NM = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.VENDOR_NM));
            REASON_OF_RETURN = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.REASON_OF_RETURN));
            EXP_DATE = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.EXP_DATE));
            QTY = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.QTY));
           // BATCH_NO = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.BATCH_NO));
            P_PRICE = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.P_PRICE));
            UOM = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.UOM));
            TOTAL = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.TOTAL));
           // LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.LAST_MODIFIED));
            MRP = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.MRP));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.POS_USER));
            RETURN_DATE = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.RETURN_DATE));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.M_FLAG));
           // SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.VENDORDETAILRETURN.SLAVE_FLAG));


            // Try to retrieve the local entry from network entries
            foundtempVendorDetailReturn = networkEntriesVendorDetailReturn.get(VENDOR_RETURN_ID);

            if (foundtempVendorDetailReturn != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesVendorDetailReturn.remove(VENDOR_RETURN_ID);

                // Check to see if it needs to be updated
                if (!PROD_NM.equals(foundtempVendorDetailReturn.getPROD_NM())
                        || !VENDOR_NM.equals(foundtempVendorDetailReturn.getVENDOR_NM())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + PROD_NM);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.VENDORDETAILRETURN.CONTENT_URI_VENDOR_DETAIL_RETURN)
                            .withSelection(ArticleContract.VENDORDETAILRETURN.VENDOR_RETURN_ID + "='" + VENDOR_RETURN_ID + "'", null)
                            .withValue(ArticleContract.VENDORDETAILRETURN.PROD_NM, foundtempVendorDetailReturn.getPROD_NM())
                            .withValue(ArticleContract.VENDORDETAILRETURN.VENDOR_NM, foundtempVendorDetailReturn.getVENDOR_NM())
                            .build());
                    syncvendordetailreturnResult.stats.numUpdates++;
                }

            } else {

                vendordetailreturn.add(STORE_ID);
                vendordetailreturn.add(VENDOR_RETURN_ID);
                vendordetailreturn.add(PROD_NM);
                vendordetailreturn.add(STORE_ID);
                vendordetailreturn.add(VENDOR_NM);
                vendordetailreturn.add(REASON_OF_RETURN);
                vendordetailreturn.add(EXP_DATE);
                vendordetailreturn.add(QTY);
               // vendordetailreturn.add(BATCH_NO);
                vendordetailreturn.add(P_PRICE);
                vendordetailreturn.add(UOM);
                vendordetailreturn.add(TOTAL);
               // vendordetailreturn.add(LAST_MODIFIED);
                vendordetailreturn.add(MRP);
                vendordetailreturn.add(S_FLAG);
                vendordetailreturn.add(POS_USER);
                vendordetailreturn.add(RETURN_DATE);
                vendordetailreturn.add(M_FLAG);
               // vendordetailreturn.add(SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempVendorDetailReturn = new StringBuilder(128);
        for (String value : vendordetailreturn) {
            if (sbtempVendorDetailReturn.length() > 0) {
                sbtempVendorDetailReturn.append("|");
            }
            sbtempVendorDetailReturn.append(value);
        }
        sbtempVendorDetailReturn.insert(0, "|");
        HashMap<String, String> tempvendordetailreturn = new HashMap<>();
        tempvendordetailreturn.put("retail_str_vendor_detail_return", String.valueOf(sbtempVendorDetailReturn));
        Log.d("******", String.valueOf(sbtempVendorDetailReturn));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempvendordetailreturn);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_str_vendor_detail_return");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (StrVendorDetailReturn tempVendorDetailReturn : networkEntriesVendorDetailReturn.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_str_vendor_detail_return...: " + tempVendorDetailReturn.getVENDOR_NM() + tempVendorDetailReturn.getPROD_NM() + tempVendorDetailReturn.getVENDOR_RETURN_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.VENDORDETAILRETURN.CONTENT_URI_VENDOR_DETAIL_RETURN)
                    .withValue(ArticleContract.VENDORDETAILRETURN.VENDOR_RETURN_ID, tempVendorDetailReturn.getVENDOR_RETURN_ID())
                    .withValue(ArticleContract.VENDORDETAILRETURN.PROD_NM, tempVendorDetailReturn.getPROD_NM())
                    .withValue(ArticleContract.VENDORDETAILRETURN.VENDOR_NM, tempVendorDetailReturn.getVENDOR_NM())

                    .build());
            syncvendordetailreturnResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_str_vendor_detail_return......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.VENDORDETAILRETURN.CONTENT_URI_VENDOR_DETAIL_RETURN, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncStoreMaint(SyncResult syncstoremaintResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_store_maint.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store_maint...");
        Map<String, StoreMaint> networkEntriesStoreMaint= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonStoreMaint = new JSONObject(jsonFeed);
        JSONArray jsonStoreMaintArticles = jsonStoreMaint.getJSONArray("Retail_store_maint");
        for (int i = 0; i < jsonStoreMaintArticles.length(); i++) {
            StoreMaint tempStoreMaint = StoreMaintParser.parse(jsonStoreMaintArticles.optJSONObject(i));
            networkEntriesStoreMaint.put(tempStoreMaint.getSTORE_ID(),tempStoreMaint);
            Log.d("TMP_STORE_MAINTAIN_DATA", tempStoreMaint.getTICKET_ID());
            Log.d("TMP_STORE_MAINTAIN_DATA", tempStoreMaint.getSUBJECT_DESC());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.STOREMAINTAIN.CONTENT_URI_STOREMAINTAIN, null, null, null, null, null);
        assert c != null;

        c.moveToFirst();

        String TICKET_ID;
        String STORE_ID;
        String SUBJECT_DESC;
        String SUPPORT_PRIORITY;
        String SUPPORT_TICKET_STATUS;
        String TEAM_GROUP;
        String TEAM_MEMBER;
        String COMMENT;
       // String LAST_MODIFIED;
        String STATUS;
        String USER;
        String DATE;
        String S_FLAG;
        String POS_USER;
        String M_FLAG;
        //String SLAVE_FLAG;
       // String EXACT_TIME;



        StoreMaint foundtempStoreMaint;

        for (int i = 0; i < c.getCount(); i++) {
            syncstoremaintResult.stats.numEntries++;
            // Create local article entry
            TICKET_ID = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.TICKET_ID));
            SUPPORT_TICKET_STATUS = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.SUPPORT_TICKET_STATUS));
            TEAM_GROUP = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.TEAM_GROUP));
            TEAM_MEMBER = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.TEAM_MEMBER));
            COMMENT = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.COMMENT));
            STATUS = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.STATUS));
            USER = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.USER));
            DATE = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.DATE));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.POS_USER));
           // LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.LAST_MODIFIED));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.M_FLAG));
            //SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.SLAVE_FLAG));
           // EXACT_TIME = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.EXACT_TIME));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.STORE_ID));
            SUBJECT_DESC = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.SUBJECT_DESC));
            SUPPORT_PRIORITY = c.getString(c.getColumnIndex(ArticleContract.STOREMAINTAIN.SUPPORT_PRIORITY));


            // Try to retrieve the local entry from network entries
            foundtempStoreMaint = networkEntriesStoreMaint.get(STORE_ID);

            if (foundtempStoreMaint != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesStoreMaint.remove(STORE_ID);

                // Check to see if it needs to be updated
               /* if (!TEAM_GROUP.equals(foundtempStoreMaint.getTEAM_GROUP())
                        || !TEAM_MEMBER.equals(foundtempStoreMaint.getTEAM_MEMBER())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + TEAM_GROUP);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.STOREMAINTAIN.CONTENT_URI_STOREMAINTAIN)
                            .withSelection(ArticleContract.STOREMAINTAIN.TICKET_ID + "='" + TICKET_ID + "'", null)
                            .withValue(ArticleContract.STOREMAINTAIN.TEAM_GROUP, foundtempStoreMaint.getTEAM_GROUP())
                            .withValue(ArticleContract.STOREMAINTAIN.TEAM_MEMBER, foundtempStoreMaint.getTEAM_MEMBER())
                            .build());
                    syncstoremaintResult.stats.numUpdates++;
                }*/

            } else {

                storemaint.add( TICKET_ID);
                storemaint.add( STORE_ID);
                storemaint.add( SUBJECT_DESC);
                storemaint.add( SUPPORT_PRIORITY);
                storemaint.add( SUPPORT_TICKET_STATUS);
                storemaint.add( TEAM_GROUP);
                storemaint.add( TEAM_MEMBER);
                storemaint.add( COMMENT);
               // storemaint.add( LAST_MODIFIED);
                storemaint.add( STATUS);
                storemaint.add( USER);
                storemaint.add( DATE);
                storemaint.add( "1");
                storemaint.add( POS_USER);
                storemaint.add( M_FLAG);

                storemaint.add(";");
                //storemaint.add( SLAVE_FLAG);
                //storemaint.add( EXACT_TIME);


            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempStoreMaint = new StringBuilder(128);
        for (String value : storemaint) {
            if (sbtempStoreMaint.length() > 0) {
                sbtempStoreMaint.append("|");
            }
            sbtempStoreMaint.append(value);
        }
        sbtempStoreMaint.insert(0, "|");
        HashMap<String, String> tempstoremaint = new HashMap<>();
        tempstoremaint.put("Retail_store_maint", String.valueOf(sbtempStoreMaint));
        Log.d("******", String.valueOf(sbtempStoreMaint));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_store_maint_upload.jsp", tempstoremaint);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_store_maint");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
       /* for (StoreMaint tempStoreMaint : networkEntriesStoreMaint.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_store_maint...: " + tempStoreMaint.getTEAM_MEMBER() + tempStoreMaint.getTEAM_GROUP() + tempStoreMaint.getTICKET_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.STOREMAINTAIN.CONTENT_URI_STOREMAINTAIN)
                    .withValue(ArticleContract.STOREMAINTAIN.TICKET_ID, tempStoreMaint.getTICKET_ID())
                    .withValue(ArticleContract.STOREMAINTAIN.TEAM_GROUP, tempStoreMaint.getTEAM_GROUP())
                    .withValue(ArticleContract.STOREMAINTAIN.TEAM_MEMBER, tempStoreMaint.getTEAM_MEMBER())

                    .build());
            syncstoremaintResult.stats.numInserts++;
        }
*/
        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store_maint......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.STOREMAINTAIN.CONTENT_URI_STOREMAINTAIN, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

    }

    void syncAdBlinkinglogoMail(SyncResult syncadblinkinglogomailResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_ad_blinkinglogo_mail...");
        Map<String, AdBlinkinglogoMail> networkEntriesAdBlinkinglogoMail= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonAdBlinkinglogoMail = new JSONObject(jsonFeed);
        JSONArray jsonAdBlinkinglogoMailArticles = jsonAdBlinkinglogoMail.getJSONArray("retail_ad_blinkinglogo_mail");
        for (int i = 0; i < jsonAdBlinkinglogoMailArticles.length(); i++) {
            AdBlinkinglogoMail tempAdBlinkinglogoMail = AdBlinkinglogoMailParser.parse(jsonAdBlinkinglogoMailArticles.optJSONObject(i));
            networkEntriesAdBlinkinglogoMail.put(tempAdBlinkinglogoMail.getTICKET_ID(),tempAdBlinkinglogoMail);
            Log.d("TMP_BLINKINGLOGO_DATA", tempAdBlinkinglogoMail.getTICKET_ID());
            Log.d("TMP_BLINKINGLOGO_DATA", tempAdBlinkinglogoMail.getAD_STRT_DT());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.BLINKINGLOGOMAIL.CONTENT_URI_BLINKINGLOGO_MAIL, null, null, null, null, null);
        assert c != null;

        String TICKET_ID;
        String AD_MAIN_ID;
        String AD_DESC;
        String AD_STRT_DT;
        String AD_END_DT;
        String AD_CST_SLB1;
        String AD_CST_SLB2;
        String AD_CST_SLB3;
        String LAST_MODIFIED;
        String POS_USER;
        String FLAG;
        String S_FLAG;
        String M_FLAG;
        String SLAVE_FLAG;

        AdBlinkinglogoMail foundtempAdBlinkinglogoMail;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncadblinkinglogomailResult.stats.numEntries++;
            // Create local article entry
            TICKET_ID = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.TICKET_ID));
            AD_MAIN_ID = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.AD_MAIN_ID));
            AD_DESC = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.AD_DESC));
            AD_STRT_DT = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.AD_STRT_DT));
            AD_END_DT = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.AD_END_DT));
            AD_CST_SLB1 = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.AD_CST_SLB1));
            AD_CST_SLB2 = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.AD_CST_SLB2));
            AD_CST_SLB3 = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.AD_CST_SLB3));
            LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.LAST_MODIFIED));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.POS_USER));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.FLAG));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.S_FLAG));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.M_FLAG));
            SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.BLINKINGLOGOMAIL.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempAdBlinkinglogoMail = networkEntriesAdBlinkinglogoMail.get(TICKET_ID);

            if (foundtempAdBlinkinglogoMail != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesAdBlinkinglogoMail.remove(TICKET_ID);

                // Check to see if it needs to be updated
                if (!AD_MAIN_ID.equals(foundtempAdBlinkinglogoMail.getAD_MAIN_ID())
                        || !AD_DESC.equals(foundtempAdBlinkinglogoMail.getAD_DESC())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + AD_MAIN_ID);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.BLINKINGLOGOMAIL.CONTENT_URI_BLINKINGLOGO_MAIL)
                            .withSelection(ArticleContract.BLINKINGLOGOMAIL.TICKET_ID + "='" + TICKET_ID + "'", null)
                            .withValue(ArticleContract.BLINKINGLOGOMAIL.AD_MAIN_ID, foundtempAdBlinkinglogoMail.getAD_MAIN_ID())
                            .withValue(ArticleContract.BLINKINGLOGOMAIL.AD_DESC, foundtempAdBlinkinglogoMail.getAD_DESC())
                            .build());
                    syncadblinkinglogomailResult.stats.numUpdates++;
                }

            } else {

                adblinkinglogomail.add( TICKET_ID);
                adblinkinglogomail.add( AD_MAIN_ID);
                adblinkinglogomail.add( AD_DESC);
                adblinkinglogomail.add( AD_STRT_DT);
                adblinkinglogomail.add( AD_END_DT);
                adblinkinglogomail.add( AD_CST_SLB1);
                adblinkinglogomail.add( AD_CST_SLB2);
                adblinkinglogomail.add( AD_CST_SLB3);
                adblinkinglogomail.add( LAST_MODIFIED);
                adblinkinglogomail.add( POS_USER);
                adblinkinglogomail.add( FLAG);
                adblinkinglogomail.add( S_FLAG);
                adblinkinglogomail.add( M_FLAG);
                adblinkinglogomail.add( SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempAdBlinkinglogoMail = new StringBuilder(128);
        for (String value : adblinkinglogomail) {
            if (sbtempAdBlinkinglogoMail.length() > 0) {
                sbtempAdBlinkinglogoMail.append("|");
            }
            sbtempAdBlinkinglogoMail.append(value);
        }
        sbtempAdBlinkinglogoMail.insert(0, "|");
        HashMap<String, String> tempadblinkinglogomail = new HashMap<>();
        tempadblinkinglogomail.put("retail_ad_blinkinglogo_mail", String.valueOf(sbtempAdBlinkinglogoMail));
        Log.d("******", String.valueOf(sbtempAdBlinkinglogoMail));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempadblinkinglogomail);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_ad_blinkinglogo_mail");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (AdBlinkinglogoMail tempAdBlinkinglogoMail : networkEntriesAdBlinkinglogoMail.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_ad_blinkinglogo_mail...: " + tempAdBlinkinglogoMail.getAD_DESC() + tempAdBlinkinglogoMail.getAD_MAIN_ID() + tempAdBlinkinglogoMail.getTICKET_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.BLINKINGLOGOMAIL.CONTENT_URI_BLINKINGLOGO_MAIL)
                    .withValue(ArticleContract.BLINKINGLOGOMAIL.TICKET_ID, tempAdBlinkinglogoMail.getTICKET_ID())
                    .withValue(ArticleContract.BLINKINGLOGOMAIL.AD_MAIN_ID, tempAdBlinkinglogoMail.getAD_MAIN_ID())
                    .withValue(ArticleContract.BLINKINGLOGOMAIL.AD_DESC, tempAdBlinkinglogoMail.getAD_DESC())

                    .build());
            syncadblinkinglogomailResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_ad_blinkinglogo_mail......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.BLINKINGLOGOMAIL.CONTENT_URI_BLINKINGLOGO_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncAdStoreMainMail(SyncResult syncadstoremainmailResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_ad_blinkinglogo_mail...");
        Map<String, AdStoreMainMail> networkEntriesAdStoreMainMail= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonAdStoreMainMail = new JSONObject(jsonFeed);
        JSONArray jsonAdStoreMainMailArticles = jsonAdStoreMainMail.getJSONArray("retail_ad_blinkinglogo_mail");
        for (int i = 0; i < jsonAdStoreMainMailArticles.length(); i++) {
            AdStoreMainMail tempAdStoreMainMail = AdStoreMainMailParser.parse(jsonAdStoreMainMailArticles.optJSONObject(i));
            networkEntriesAdStoreMainMail.put(tempAdStoreMainMail.getTICKET_ID(),tempAdStoreMainMail);
            Log.d("TMP_BLINKINGLOGO_DATA", tempAdStoreMainMail.getTICKET_ID());
            Log.d("TMP_BLINKINGLOGO_DATA", tempAdStoreMainMail.getACTIVE());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.ADSTOREMAINMAIL.CONTENT_URI_ADSTORE_MAIN_MAIL, null, null, null, null, null);
        assert c != null;

        String TICKET_ID;
        String AD_MAIN_ID;
        String AD_DESC;
        String AD_CST_SLB1;
        String AD_CST_SLB2;
        String AD_CST_SLB3;
        String STATUS;
        String ACTIVE;
        String POS_USER;
        String FLAG;
        String S_FLAG;
        String M_FLAG;
        String SLAVE_FLAG;

        AdStoreMainMail foundtempAdStoreMainMail;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncadstoremainmailResult.stats.numEntries++;
            // Create local article entry
            TICKET_ID = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.TICKET_ID));
            AD_MAIN_ID = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.AD_MAIN_ID));
            AD_DESC = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.AD_DESC));
            AD_CST_SLB1 = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.AD_CST_SLB1));
            AD_CST_SLB2 = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.AD_CST_SLB2));
            AD_CST_SLB3 = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.AD_CST_SLB3));
            STATUS = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.STATUS));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.ACTIVE));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.POS_USER));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.FLAG));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.S_FLAG));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.M_FLAG));
            SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADSTOREMAINMAIL.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempAdStoreMainMail = networkEntriesAdStoreMainMail.get(TICKET_ID);

            if (foundtempAdStoreMainMail != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesAdStoreMainMail.remove(TICKET_ID);

                // Check to see if it needs to be updated
                if (!AD_MAIN_ID.equals(foundtempAdStoreMainMail.getAD_MAIN_ID())
                        || !AD_DESC.equals(foundtempAdStoreMainMail.getAD_DESC())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + AD_MAIN_ID);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.ADSTOREMAINMAIL.CONTENT_URI_ADSTORE_MAIN_MAIL)
                            .withSelection(ArticleContract.ADSTOREMAINMAIL.TICKET_ID + "='" + TICKET_ID + "'", null)
                            .withValue(ArticleContract.ADSTOREMAINMAIL.AD_MAIN_ID, foundtempAdStoreMainMail.getAD_MAIN_ID())
                            .withValue(ArticleContract.ADSTOREMAINMAIL.AD_DESC, foundtempAdStoreMainMail.getAD_DESC())
                            .build());
                    syncadstoremainmailResult.stats.numUpdates++;
                }

            } else {

                adstoremainmail.add( TICKET_ID);
                adstoremainmail.add( AD_MAIN_ID);
                adstoremainmail.add( AD_DESC);
                adstoremainmail.add( AD_CST_SLB1);
                adstoremainmail.add( AD_CST_SLB2);
                adstoremainmail.add( AD_CST_SLB3);
                adstoremainmail.add( STATUS);
                adstoremainmail.add( ACTIVE);
                adstoremainmail.add( POS_USER);
                adstoremainmail.add( FLAG);
                adstoremainmail.add( S_FLAG);
                adstoremainmail.add( M_FLAG);
                adstoremainmail.add( SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempAdStoreMainMail = new StringBuilder(128);
        for (String value : adstoremainmail) {
            if (sbtempAdStoreMainMail.length() > 0) {
                sbtempAdStoreMainMail.append("|");
            }
            sbtempAdStoreMainMail.append(value);
        }
        sbtempAdStoreMainMail.insert(0, "|");
        HashMap<String, String> tempadstoremainmail = new HashMap<>();
        tempadstoremainmail.put("retail_ad_blinkinglogo_mail", String.valueOf(sbtempAdStoreMainMail));
        Log.d("******", String.valueOf(sbtempAdStoreMainMail));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempadstoremainmail);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_ad_blinkinglogo_mail");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (AdStoreMainMail tempAdStoreMainMail : networkEntriesAdStoreMainMail.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_ad_blinkinglogo_mail...: " + tempAdStoreMainMail.getAD_DESC() + tempAdStoreMainMail.getAD_MAIN_ID() + tempAdStoreMainMail.getTICKET_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.ADSTOREMAINMAIL.CONTENT_URI_ADSTORE_MAIN_MAIL)
                    .withValue(ArticleContract.ADSTOREMAINMAIL.TICKET_ID, tempAdStoreMainMail.getTICKET_ID())
                    .withValue(ArticleContract.ADSTOREMAINMAIL.AD_MAIN_ID, tempAdStoreMainMail.getAD_MAIN_ID())
                    .withValue(ArticleContract.ADSTOREMAINMAIL.AD_DESC, tempAdStoreMainMail.getAD_DESC())

                    .build());
            syncadstoremainmailResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_ad_blinkinglogo_mail......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.ADSTOREMAINMAIL.CONTENT_URI_ADSTORE_MAIN_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncAdTickerMail(SyncResult syncadtickermailResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_ad_ticker_mail...");
        Map<String, AdTickerMail> networkEntriesAdTickerMail= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonAdTickerMail = new JSONObject(jsonFeed);
        JSONArray jsonAdTickerMailArticles = jsonAdTickerMail.getJSONArray("retail_ad_ticker_mail");
        for (int i = 0; i < jsonAdTickerMailArticles.length(); i++) {
            AdTickerMail tempAdTickerMail = AdTickerMailParser.parse(jsonAdTickerMailArticles.optJSONObject(i));
            networkEntriesAdTickerMail.put(tempAdTickerMail.getTICKET_ID(),tempAdTickerMail);
            Log.d("TMP_ADTICKER_MAIL_DATA", tempAdTickerMail.getTICKET_ID());
            Log.d("TMP_ADTICKER_MAIL_DATA", tempAdTickerMail.getAD_CST_SLB1());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.ADTICKERMAIL.CONTENT_URI_ADTICKER_MAIL, null, null, null, null, null);
        assert c != null;

        String TICKET_ID;
        String AD_MAIN_ID;
        String AD_TEXT;
        String AD_CST_SLB1;
        String LAST_MODIFIED;
        String POS_USER;
        String FLAG;
        String S_FLAG;
        String M_FLAG;
        String SLAVE_FLAG;

        AdTickerMail foundtempAdTickerMail;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncadtickermailResult.stats.numEntries++;
            // Create local article entry
            TICKET_ID = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.TICKET_ID));
            AD_MAIN_ID = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.AD_MAIN_ID));
            AD_TEXT = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.AD_TEXT));
            AD_CST_SLB1 = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.AD_CST_SLB1));
           // LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.LAST_MODIFIED));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.POS_USER));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.FLAG));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.S_FLAG));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.M_FLAG));
           // SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.ADTICKERMAIL.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempAdTickerMail = networkEntriesAdTickerMail.get(TICKET_ID);

            if (foundtempAdTickerMail != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesAdTickerMail.remove(TICKET_ID);

                // Check to see if it needs to be updated
                if (!AD_MAIN_ID.equals(foundtempAdTickerMail.getAD_MAIN_ID())
                        || !AD_TEXT.equals(foundtempAdTickerMail.getAD_TEXT())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + AD_MAIN_ID);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.ADTICKERMAIL.CONTENT_URI_ADTICKER_MAIL)
                            .withSelection(ArticleContract.ADTICKERMAIL.TICKET_ID + "='" + TICKET_ID + "'", null)
                            .withValue(ArticleContract.ADTICKERMAIL.AD_MAIN_ID, foundtempAdTickerMail.getAD_MAIN_ID())
                            .withValue(ArticleContract.ADTICKERMAIL.AD_TEXT, foundtempAdTickerMail.getAD_TEXT())
                            .build());
                    syncadtickermailResult.stats.numUpdates++;
                }

            } else {

                adtickermail.add( TICKET_ID);
                adtickermail.add( AD_MAIN_ID);
                adtickermail.add( AD_TEXT);
                adtickermail.add( AD_CST_SLB1);
                //adtickermail.add( LAST_MODIFIED);
                adtickermail.add( POS_USER);
                adtickermail.add( FLAG);
                adtickermail.add( S_FLAG);
                adtickermail.add( M_FLAG);
                //adtickermail.add( SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempAdTickerMail = new StringBuilder(128);
        for (String value : adtickermail) {
            if (sbtempAdTickerMail.length() > 0) {
                sbtempAdTickerMail.append("|");
            }
            sbtempAdTickerMail.append(value);
        }
        sbtempAdTickerMail.insert(0, "|");
        HashMap<String, String> tempadtickermail = new HashMap<>();
        tempadtickermail.put("retail_ad_ticker_mail", String.valueOf(sbtempAdTickerMail));
        Log.d("******", String.valueOf(sbtempAdTickerMail));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempadtickermail);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_ad_ticker_mail");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (AdTickerMail tempAdTickerMail : networkEntriesAdTickerMail.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_ad_ticker_mail...: " + tempAdTickerMail.getAD_TEXT() + tempAdTickerMail.getAD_MAIN_ID() + tempAdTickerMail.getTICKET_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.ADTICKERMAIL.CONTENT_URI_ADTICKER_MAIL)
                    .withValue(ArticleContract.ADTICKERMAIL.TICKET_ID, tempAdTickerMail.getTICKET_ID())
                    .withValue(ArticleContract.ADTICKERMAIL.AD_MAIN_ID, tempAdTickerMail.getAD_MAIN_ID())
                    .withValue(ArticleContract.ADTICKERMAIL.AD_TEXT, tempAdTickerMail.getAD_TEXT())

                    .build());
            syncadtickermailResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_ad_ticker_mail......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.ADTICKERMAIL.CONTENT_URI_ADTICKER_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncAdProdCpgMail(SyncResult syncadadprodcpgmailResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store_prod_cpg_mail...");
        Map<String, StoreProdCpgMail> networkEntriesAdProdCpgMail= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonAdProdCpgMail = new JSONObject(jsonFeed);
        JSONArray jsonAdProdCpgMailArticles = jsonAdProdCpgMail.getJSONArray("retail_store_prod_cpg_mail");
        for (int i = 0; i < jsonAdProdCpgMailArticles.length(); i++) {
            StoreProdCpgMail tempAdProdCpgMail = StoreProdCpgMailParser.parse(jsonAdProdCpgMailArticles.optJSONObject(i));
            networkEntriesAdProdCpgMail.put(tempAdProdCpgMail.getTICKET_ID(),tempAdProdCpgMail);
            Log.d("TMP_PRODCPG_MAIL_DATA", tempAdProdCpgMail.getTICKET_ID());
            Log.d("TMP_PRODCPG_MAIL_DATA", tempAdProdCpgMail.getFLAG());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.PRODCPGMAIL.CONTENT_URI_PROD_CPG_MAIL, null, null, null, null, null);
        assert c != null;

        String TICKET_ID;
        String PROD_NM;
        String ACTIVE;
        String POS_USER;
        String FLAG;
        String S_FLAG;
        String M_FLAG;
        String STORE_ID;
        String SLAVE_FLAG;

        StoreProdCpgMail foundtempAdProdCpgMail;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncadadprodcpgmailResult.stats.numEntries++;
            // Create local article entry
            TICKET_ID = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.TICKET_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.PROD_NM));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.ACTIVE));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.POS_USER));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.FLAG));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.S_FLAG));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.M_FLAG));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.STORE_ID));
            SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODCPGMAIL.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempAdProdCpgMail = networkEntriesAdProdCpgMail.get(TICKET_ID);

            if (foundtempAdProdCpgMail != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesAdProdCpgMail.remove(TICKET_ID);

                // Check to see if it needs to be updated
                if (!PROD_NM.equals(foundtempAdProdCpgMail.getPROD_NM())
                        || !ACTIVE.equals(foundtempAdProdCpgMail.getACTIVE())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + PROD_NM);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.PRODCPGMAIL.CONTENT_URI_PROD_CPG_MAIL)
                            .withSelection(ArticleContract.PRODCPGMAIL.TICKET_ID + "='" + TICKET_ID + "'", null)
                            .withValue(ArticleContract.PRODCPGMAIL.PROD_NM, foundtempAdProdCpgMail.getPROD_NM())
                            .withValue(ArticleContract.PRODCPGMAIL.ACTIVE, foundtempAdProdCpgMail.getACTIVE())
                            .build());
                    syncadadprodcpgmailResult.stats.numUpdates++;
                }

            } else {

                prodcpgmail.add(TICKET_ID);
                prodcpgmail.add(PROD_NM);
                prodcpgmail.add(ACTIVE);
                prodcpgmail.add(POS_USER);
                prodcpgmail.add(FLAG);
                prodcpgmail.add(S_FLAG);
                prodcpgmail.add(M_FLAG);
                prodcpgmail.add(STORE_ID);
                prodcpgmail.add(SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempAdProdCpgMail = new StringBuilder(128);
        for (String value : prodcpgmail) {
            if (sbtempAdProdCpgMail.length() > 0) {
                sbtempAdProdCpgMail.append("|");
            }
            sbtempAdProdCpgMail.append(value);
        }
        sbtempAdProdCpgMail.insert(0, "|");
        HashMap<String, String> tempadprodcpgmail = new HashMap<>();
        tempadprodcpgmail.put("retail_store_prod_cpg_mail", String.valueOf(sbtempAdProdCpgMail));
        Log.d("******", String.valueOf(sbtempAdProdCpgMail));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempadprodcpgmail);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_store_prod_cpg_mail");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (StoreProdCpgMail tempAdProdCpgMail : networkEntriesAdProdCpgMail.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_store_prod_cpg_mail...: " + tempAdProdCpgMail.getACTIVE() + tempAdProdCpgMail.getPROD_NM() + tempAdProdCpgMail.getTICKET_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.PRODCPGMAIL.CONTENT_URI_PROD_CPG_MAIL)
                    .withValue(ArticleContract.PRODCPGMAIL.TICKET_ID, tempAdProdCpgMail.getTICKET_ID())
                    .withValue(ArticleContract.PRODCPGMAIL.PROD_NM, tempAdProdCpgMail.getPROD_NM())
                    .withValue(ArticleContract.PRODCPGMAIL.ACTIVE, tempAdProdCpgMail.getACTIVE())

                    .build());
            syncadadprodcpgmailResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store_prod_cpg_mail......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.PRODCPGMAIL.CONTENT_URI_PROD_CPG_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncAdProdLocalCpgMail(SyncResult syncadprodlocalcpgmailResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store_prod_local_cpg_mail...");
        Map<String, StoreProdLocalCpgMail> networkEntriesAdProdLocalCpgMail= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonAdProdLocalCpgMail= new JSONObject(jsonFeed);
        JSONArray jsonAdProdLocalCpgMailArticles = jsonAdProdLocalCpgMail.getJSONArray("retail_store_prod_local_cpg_mail");
        for (int i = 0; i < jsonAdProdLocalCpgMailArticles.length(); i++) {
            StoreProdLocalCpgMail tempAdProdLocalCpgMail = StoreProdLocalCpgMailParser.parse(jsonAdProdLocalCpgMailArticles.optJSONObject(i));
            networkEntriesAdProdLocalCpgMail.put(tempAdProdLocalCpgMail.getTICKET_ID(),tempAdProdLocalCpgMail);
            Log.d("TMP_LOCLCPG_MAIL_DATA", tempAdProdLocalCpgMail.getTICKET_ID());
            Log.d("TMP_LOCLCPG_MAIL_DATA", tempAdProdLocalCpgMail.getACTIVE());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.PRODLOCALCPGMAIL.CONTENT_URI_PROD_LOCAL_CPG_MAIL, null, null, null, null, null);
        assert c != null;

        String TICKET_ID;
        String PROD_NM;
        String ACTIVE;
        String POS_USER;
        String FLAG;
        String S_FLAG;
        String M_FLAG;
        String STORE_ID;
        String SLAVE_FLAG;

        StoreProdLocalCpgMail foundtempAdProdLocalCpgMail;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncadprodlocalcpgmailResult.stats.numEntries++;
            // Create local article entry
            TICKET_ID = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.TICKET_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.PROD_NM));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.ACTIVE));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.POS_USER));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.FLAG));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.S_FLAG));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.M_FLAG));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.STORE_ID));
            SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALCPGMAIL.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempAdProdLocalCpgMail = networkEntriesAdProdLocalCpgMail.get(TICKET_ID);


            if (foundtempAdProdLocalCpgMail != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesAdProdLocalCpgMail.remove(TICKET_ID);

                // Check to see if it needs to be updated
                if (!PROD_NM.equals(foundtempAdProdLocalCpgMail.getPROD_NM())
                        || !ACTIVE.equals(foundtempAdProdLocalCpgMail.getACTIVE())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + PROD_NM);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.PRODLOCALCPGMAIL.CONTENT_URI_PROD_LOCAL_CPG_MAIL)
                            .withSelection(ArticleContract.PRODLOCALCPGMAIL.TICKET_ID + "='" + TICKET_ID + "'", null)
                            .withValue(ArticleContract.PRODLOCALCPGMAIL.PROD_NM, foundtempAdProdLocalCpgMail.getPROD_NM())
                            .withValue(ArticleContract.PRODLOCALCPGMAIL.ACTIVE, foundtempAdProdLocalCpgMail.getACTIVE())
                            .build());
                    syncadprodlocalcpgmailResult.stats.numUpdates++;
                }

            } else {

                prodlocalcpgmail.add(TICKET_ID);
                prodlocalcpgmail.add(PROD_NM);
                prodlocalcpgmail.add(ACTIVE);
                prodlocalcpgmail.add(POS_USER);
                prodlocalcpgmail.add(FLAG);
                prodlocalcpgmail.add(S_FLAG);
                prodlocalcpgmail.add(M_FLAG);
                prodlocalcpgmail.add(STORE_ID);
                prodlocalcpgmail.add(SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempAdProdLocalCpgMail = new StringBuilder(128);
        for (String value : prodlocalcpgmail) {
            if (sbtempAdProdLocalCpgMail.length() > 0) {
                sbtempAdProdLocalCpgMail.append("|");
            }
            sbtempAdProdLocalCpgMail.append(value);
        }
        sbtempAdProdLocalCpgMail.insert(0, "|");
        HashMap<String, String> tempadprodlocalcpgmail = new HashMap<>();
        tempadprodlocalcpgmail.put("retail_store_prod_local_cpg_mail", String.valueOf(sbtempAdProdLocalCpgMail));
        Log.d("******", String.valueOf(sbtempAdProdLocalCpgMail));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempadprodlocalcpgmail);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_store_prod_local_cpg_mail");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (StoreProdLocalCpgMail tempAdProdLocalCpgMail : networkEntriesAdProdLocalCpgMail.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_store_prod_local_cpg_mail...: " + tempAdProdLocalCpgMail.getACTIVE() + tempAdProdLocalCpgMail.getPROD_NM() + tempAdProdLocalCpgMail.getTICKET_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.PRODLOCALCPGMAIL.CONTENT_URI_PROD_LOCAL_CPG_MAIL)
                    .withValue(ArticleContract.PRODLOCALCPGMAIL.TICKET_ID, tempAdProdLocalCpgMail.getTICKET_ID())
                    .withValue(ArticleContract.PRODCPGMAIL.PROD_NM, tempAdProdLocalCpgMail.getPROD_NM())
                    .withValue(ArticleContract.PRODCPGMAIL.ACTIVE, tempAdProdLocalCpgMail.getACTIVE())

                    .build());
            syncadprodlocalcpgmailResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store_prod_local_cpg_mail......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.PRODLOCALCPGMAIL.CONTENT_URI_PROD_LOCAL_CPG_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    void syncProdLocalMail(SyncResult syncprodlocalmailResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://crmfrdev.eu-gb.mybluemix.net/JSP/D_Retail_Store_Prod_Cpg.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries from retail_store_prod_local_cpg_mail...");
        Map<String, StoreProdLocalMail> networkEntriesProdLocalMail= new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonProdLocalMail = new JSONObject(jsonFeed);
        JSONArray jsonProdLocalMailArticles = jsonProdLocalMail.getJSONArray("retail_store_prod_local_mail");
        for (int i = 0; i < jsonProdLocalMailArticles.length(); i++) {
            StoreProdLocalMail tempProdLocalMail = StoreProdLocalMailParser.parse(jsonProdLocalMailArticles.optJSONObject(i));
            networkEntriesProdLocalMail.put(tempProdLocalMail.getTICKET_ID(),tempProdLocalMail);
            Log.d("TMP_LOCAL_MAIL_DATA", tempProdLocalMail.getTICKET_ID());
            Log.d("TMP_LOCAL_MAIL_DATA", tempProdLocalMail.getACTIVE());

        }
        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.PRODLOCALMAIL.CONTENT_URI_PROD_LOCAL_MAIL, null, null, null, null, null);
        assert c != null;

        String TICKET_ID;
        String PROD_NM;
        String ACTIVE;
        String BARCODE;
        String MRP;
        String P_PRICE;
        String S_PRICE;
        String POS_USER;
        String FLAG;
        String S_FLAG;
        String M_FLAG;
        String STORE_ID;
        String SLAVE_FLAG;

        StoreProdLocalMail foundtempProdLocalMail;
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < c.getCount(); i++) {
            syncprodlocalmailResult.stats.numEntries++;
            // Create local article entry
            TICKET_ID = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.TICKET_ID));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.PROD_NM));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.ACTIVE));
            BARCODE = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.BARCODE));
            MRP = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.MRP));
            P_PRICE = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.P_PRICE));
            S_PRICE = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.S_PRICE));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.POS_USER));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.FLAG));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.S_FLAG));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.M_FLAG));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.STORE_ID));
            SLAVE_FLAG = c.getString(c.getColumnIndex(ArticleContract.PRODLOCALMAIL.SLAVE_FLAG));

            // Try to retrieve the local entry from network entries
            foundtempProdLocalMail = networkEntriesProdLocalMail.get(TICKET_ID);


            if (foundtempProdLocalMail != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntriesProdLocalMail.remove(TICKET_ID);

                // Check to see if it needs to be updated
                if (!PROD_NM.equals(foundtempProdLocalMail.getPROD_NM())
                        || !ACTIVE.equals(foundtempProdLocalMail.getACTIVE())

                        ) {
                    // Batch an update for the existing record
                    Log.i(TAG, "Scheduling update: " + PROD_NM);
                    batch.add(ContentProviderOperation.newUpdate(ArticleContract.PRODLOCALMAIL.CONTENT_URI_PROD_LOCAL_MAIL)
                            .withSelection(ArticleContract.PRODLOCALMAIL.TICKET_ID + "='" + TICKET_ID + "'", null)
                            .withValue(ArticleContract.PRODLOCALMAIL.PROD_NM, foundtempProdLocalMail.getPROD_NM())
                            .withValue(ArticleContract.PRODLOCALMAIL.ACTIVE, foundtempProdLocalMail.getACTIVE())
                            .build());
                    syncprodlocalmailResult.stats.numUpdates++;
                }

            } else {

                prodlocalmail.add(TICKET_ID);
                prodlocalmail.add(PROD_NM);
                prodlocalmail.add(ACTIVE);
                prodlocalmail.add(BARCODE);
                prodlocalmail.add(MRP);
                prodlocalmail.add(P_PRICE);
                prodlocalmail.add(S_PRICE);
                prodlocalmail.add(POS_USER);
                prodlocalmail.add(FLAG);
                prodlocalmail.add(S_FLAG);
                prodlocalmail.add(M_FLAG);
                prodlocalmail.add(STORE_ID);
                prodlocalmail.add(SLAVE_FLAG);
            }
            c.moveToNext();

        }
        c.close();
        StringBuilder sbtempProdLocalMail = new StringBuilder(128);
        for (String value : prodlocalmail) {
            if (sbtempProdLocalMail.length() > 0) {
                sbtempProdLocalMail.append("|");
            }
            sbtempProdLocalMail.append(value);
        }
        sbtempProdLocalMail.insert(0, "|");
        HashMap<String, String> tempprodlocalmail = new HashMap<>();
        tempprodlocalmail.put("retail_store_prod_local_mail", String.valueOf(sbtempProdLocalMail));
        Log.d("******", String.valueOf(sbtempProdLocalMail));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest(" http://schedular.eu-gb.mybluemix.net/Retail_Str_Stock_Master.jsp", tempprodlocalmail);
        try {
            String success = s.getString("success");
            if (success.equals("1")) {
                Log.d("Resposnse", success + " " + "retail_store_prod_local_mail");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add all the new entries
        for (StoreProdLocalMail tempProdLocalMail : networkEntriesProdLocalMail.values()) {
            Log.i(TAG, "Scheduling insert for article Fetching server entries from retail_store_prod_local_mail...: " + tempProdLocalMail.getACTIVE() + tempProdLocalMail.getPROD_NM() + tempProdLocalMail.getTICKET_ID());
            batch.add(ContentProviderOperation.newInsert(ArticleContract.PRODLOCALMAIL.CONTENT_URI_PROD_LOCAL_MAIL)
                    .withValue(ArticleContract.PRODLOCALMAIL.TICKET_ID, tempProdLocalMail.getTICKET_ID())
                    .withValue(ArticleContract.PRODLOCALMAIL.PROD_NM, tempProdLocalMail.getPROD_NM())
                    .withValue(ArticleContract.PRODLOCALMAIL.ACTIVE, tempProdLocalMail.getACTIVE())

                    .build());
            syncprodlocalmailResult.stats.numInserts++;
        }

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update Fetching server entries from retail_store_prod_local_mail......");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.PRODLOCALMAIL.CONTENT_URI_PROD_LOCAL_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network

        c.moveToFirst();

    }

    private void syncRetailstrdecimal(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_store_decimal.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailStoreDecimal> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("Retail_store_decimal");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailStoreDecimal retailStoreDecimal = RetailStoredecimalParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailStoreDecimal.getSTORE_ID(), retailStoreDecimal);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_store_decimal.CONTENT_URI_RETAIL_STORE_DECIMAL, null, null, null, null);
        assert c != null;
        c.moveToFirst();

        String STORE_ID ;
        String MRP_DECIMAL ;
        String P_PRICE_DECIMAL;
        String S_PRICE_DECIMAL ;
        String HOLD_PO ;
        String HOLD_INV ;
        String HOLD_SALES;
        String S_FLAG ;
        String ROUND_OFF ;
        String SALES_HOLD_NO ;
        String PURCHASE_HOLD_NO ;
        String INV_HOLD_NO ;
        String POS_USER;
        String M_FLAG;


        RetailStoreDecimal found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.STORE_ID));
            MRP_DECIMAL = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.MRP_DECIMAL));
            P_PRICE_DECIMAL = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.P_PRICE_DECIMAL));
            S_PRICE_DECIMAL = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.S_PRICE_DECIMAL));
            HOLD_PO = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.HOLD_PO));
            HOLD_INV = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.HOLD_INV));
            HOLD_SALES = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.HOLD_SALES));
            S_FLAG =c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.S_FLAG));
            ROUND_OFF = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.ROUND_OFF));
            SALES_HOLD_NO = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.SALES_HOLD_NO));
            PURCHASE_HOLD_NO = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.PURCHASE_HOLD_NO));
            INV_HOLD_NO = c.getString(c.getColumnIndex(ArticleContract.Retail_store_decimal.INV_HOLD_NO));
            M_FLAG = null;
            POS_USER= "User1";


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

           /* if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {*/


                storedecimal.add(STORE_ID);
                storedecimal.add(MRP_DECIMAL);
                storedecimal.add(P_PRICE_DECIMAL);
                storedecimal.add(S_PRICE_DECIMAL);
                storedecimal.add(HOLD_PO);
                storedecimal.add(HOLD_INV);
                storedecimal.add(HOLD_SALES);
                storedecimal.add("1");
                storedecimal.add(ROUND_OFF);
                storedecimal.add(SALES_HOLD_NO);
                storedecimal.add(PURCHASE_HOLD_NO);
                storedecimal.add(INV_HOLD_NO);
                storedecimal.add(POS_USER);
                storedecimal.add(M_FLAG);
                storedecimal.add(";");

               // Log.d("*******",storedecimal.toString());

           // }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : storedecimal) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("Retail_store_decimal",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_store_decimal_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_store_decimal");

            }
            else{
                Log.d("Resonse",s.toString());
            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_store_decimal.CONTENT_URI_RETAIL_STORE_DECIMAL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
       // c.moveToFirst();
    }
    private void syncDayopenclose(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_str_day_open_close.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,DayOpenClose> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("Retail_str_day_open_close");
        for (int i = 0; i < jsonArticles.length(); i++) {
            DayOpenClose dayOpenClose = DayOpenCloseParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(dayOpenClose.getSTORE_ID(), dayOpenClose);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.DayOpenClose.CONTENT_URI_DAY_OPEN_CLOSE, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String TRI_ID;
        String STORE_ID;
        String BUSINESS_DATE ;
        String START_DATE ;
        String START_CASH ;
        String CBCASH_ONHAND ;
        String START_TIME ;
        String START_USER_ID ;
        String OPCASH_ONHAND ;
        String OP_CUR ;
        String END_DATE ;
        String END_TIME ;
        String END_USER_ID ;
        String CB_CUR ;
        String STATUS ;
        String REMARKS ;
        String FLAG ;
        String S_FLAG ;
        String POS_USER;
        String M_FLAG;


        DayOpenClose found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry
            TRI_ID = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.TRI_ID));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.STORE_ID));
            BUSINESS_DATE= c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.BUSINESS_DATE));
            START_DATE = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.START_DATE));
            START_CASH = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.START_CASH));
            START_TIME = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.START_TIME));
            CBCASH_ONHAND = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.CBCASH_ONHAND));
            START_USER_ID = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.START_USER_ID));
            OPCASH_ONHAND = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.OPCASH_ONHAND));
            OP_CUR = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.OP_CUR));
            END_TIME = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.END_TIME));
            END_DATE = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.END_DATE));
            END_USER_ID = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.END_USER_ID));
            CB_CUR = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.CB_CUR));
            STATUS =c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.STATUS));
            REMARKS = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.REMARKS));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.FLAG));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.DayOpenClose.M_FLAG));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {

                dayopenclose.add(TRI_ID);
                dayopenclose.add(STORE_ID);
                dayopenclose.add(BUSINESS_DATE);
                dayopenclose.add(START_DATE);
                dayopenclose.add(START_CASH);
                dayopenclose.add(CBCASH_ONHAND);
                dayopenclose.add(START_TIME);
                dayopenclose.add(START_USER_ID);
                dayopenclose.add(OPCASH_ONHAND);
                dayopenclose.add(OP_CUR);
                dayopenclose.add(END_DATE);
                dayopenclose.add(END_TIME);
                dayopenclose.add(END_USER_ID);
                dayopenclose.add(CB_CUR);
                dayopenclose.add(STATUS);
                dayopenclose.add(REMARKS);
                dayopenclose.add(FLAG);
                dayopenclose.add(S_FLAG);
                dayopenclose.add(POS_USER);
                dayopenclose.add(M_FLAG);
                dayopenclose.add(";");


               // Log.d("*******",dayopenclose.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : dayopenclose) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("Retail_str_day_open_close",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_str_day_open_close_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_day_open_close");
            }else {
                Log.d("Response error", success + " " + "retail_str_day_open_close");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.DayOpenClose.CONTENT_URI_DAY_OPEN_CLOSE, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncRetailbilldisplay(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_bill_display.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailBillDisplay> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_bill_display");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailBillDisplay retailBillDisplay = RetailBillDisplayParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailBillDisplay.getSTORE_ID(),retailBillDisplay);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_bill_display.CONTENT_URI_RETAIL_BILL_DISPLAY, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String STORE_ID ;
        String TOTAL_BILL_VALUE ;
        String DISCOUNT ;
        String NET_BILL_PAYABLE ;
        String AMOUNT_RECEIVED ;
        String AMOUNT_PAID_BACK ;
        String FOOTER ;
        String S_FLAG ;
        String POS_USER ;
        String M_FLAG ;

        RetailBillDisplay found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.STORE_ID));
            TOTAL_BILL_VALUE= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.TOTAL_BILL_VALUE));
            DISCOUNT = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.DISCOUNT));
            NET_BILL_PAYABLE = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.NET_BILL_PAYABLE));
            AMOUNT_RECEIVED = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.AMOUNT_RECEIVED));
            AMOUNT_PAID_BACK = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.AMOUNT_PAID_BACK));
            FOOTER = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.FOOTER));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_bill_display.M_FLAG));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {


                billdisplay.add( STORE_ID);
                billdisplay.add( TOTAL_BILL_VALUE);
                billdisplay.add( DISCOUNT);
                billdisplay.add( NET_BILL_PAYABLE);
                billdisplay.add( AMOUNT_RECEIVED);
                billdisplay.add( AMOUNT_PAID_BACK);
                billdisplay.add( FOOTER);
                billdisplay.add( S_FLAG);
                billdisplay.add( POS_USER);
                billdisplay.add( M_FLAG);
                billdisplay.add( ";");


                // Log.d("*******",billdisplay.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : billdisplay) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_bill_display",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_bill_display_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_bill_display");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_bill_display.CONTENT_URI_RETAIL_BILL_DISPLAY, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncRetailbillvisible(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_bill_visible.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailBillVisible> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_bill_visible");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailBillVisible retailBillVisible = RetailBillVisibleParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailBillVisible.getSTORE_ID(), retailBillVisible);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_bill_visible.CONTENT_URI_RETAIL_BILL_VISIBLE, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String STORE_ID ;
        String STORE_NAME ;
        String STORE_ADDRESS ;
        String CITY ;
        String STORE_COUNTRY ;
        String  ZIP ;
        String TELE_1 ;
        String TELE_2 ;
        String MAIN_BODY ;
        String MRP ;
        String S_PRICE ;
        String QTY ;
        String TOTAL ;
        String TOTAL_BILL_VALUE ;
        String DISCOUNT ;
        String NET_BILL_PAYABLE ;
        String AMOUNT_RECEIVED ;
        String AMOUNT_PAID_BACK ;
        String FOOTER ;
        String S_FLAG ;
        String POS_USER ;
        String M_FLAG ;
        String NORMAL_SALES ;
        String CREDIT_CUSTOMER ;
        String RETURNS ;
        String SLAVE_FLAG ;
        String MARGIN ;
        String FREE_GOODS ;
        String INV_PRINT ;
        String OTP_CHECK ;
        String BARCODE_VISIBLE ;
        String LOYALITY ;
        String CARD_MACHINE ;
        String M_CASH ;


        RetailBillVisible found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.STORE_ID));
            STORE_NAME= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.STORE_NAME));
            STORE_ADDRESS= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.STORE_ADDRESS));
            CITY= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.CITY));
            STORE_COUNTRY= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.STORE_COUNTRY));
            ZIP= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.ZIP));
            TELE_1= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.TELE_1));
            TELE_2= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.TELE_2));
            MAIN_BODY= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.MAIN_BODY));
            MRP= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.MRP));
            S_PRICE= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.S_PRICE));
            QTY= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.QTY));
            TOTAL= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.TOTAL));
            TOTAL_BILL_VALUE= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.TOTAL_BILL_VALUE));
            DISCOUNT= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.DISCOUNT));
            NET_BILL_PAYABLE= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.NET_BILL_PAYABLE));
            AMOUNT_RECEIVED= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.AMOUNT_RECEIVED));
            AMOUNT_PAID_BACK= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.AMOUNT_PAID_BACK));
            FOOTER= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.FOOTER));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.S_FLAG));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.POS_USER));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.M_FLAG));
            NORMAL_SALES= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.NORMAL_SALES));
            CREDIT_CUSTOMER= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.CREDIT_CUSTOMER));
            RETURNS= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.RETURNS));
            SLAVE_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.SLAVE_FLAG));
            MARGIN= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.MARGIN));
            FREE_GOODS= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.FREE_GOODS));
            INV_PRINT= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.INV_PRINT));
            OTP_CHECK= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.OTP_CHECK));
            BARCODE_VISIBLE= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.BARCODE_VISIBLE));
            LOYALITY= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.LOYALITY));
            CARD_MACHINE= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.CARD_MACHINE));
            M_CASH= c.getString(c.getColumnIndex(ArticleContract.Retail_bill_visible.M_CASH));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {

                billvisible.add(STORE_ID);
                billvisible.add(STORE_NAME);
                billvisible.add(STORE_ADDRESS);
                billvisible.add(CITY);
                billvisible.add(STORE_COUNTRY);
                billvisible.add( ZIP);
                billvisible.add(TELE_1);
                billvisible.add(TELE_2);
                billvisible.add(MAIN_BODY);
                billvisible.add(MRP);
                billvisible.add(S_PRICE);
                billvisible.add(QTY);
                billvisible.add(TOTAL);
                billvisible.add(TOTAL_BILL_VALUE);
                billvisible.add(DISCOUNT);
                billvisible.add(NET_BILL_PAYABLE);
                billvisible.add(AMOUNT_RECEIVED);
                billvisible.add(AMOUNT_PAID_BACK);
                billvisible.add(FOOTER);
                billvisible.add(S_FLAG);
                billvisible.add(POS_USER);
                billvisible.add(M_FLAG);
                billvisible.add(NORMAL_SALES);
                billvisible.add(CREDIT_CUSTOMER);
                billvisible.add(RETURNS);
                billvisible.add(SLAVE_FLAG);
                billvisible.add(MARGIN);
                billvisible.add(FREE_GOODS);
                billvisible.add(INV_PRINT);
                billvisible.add(OTP_CHECK);
                billvisible.add(BARCODE_VISIBLE);
                billvisible.add(LOYALITY) ;
                billvisible.add(CARD_MACHINE) ;
                billvisible.add(M_CASH );
                billvisible.add(";");

               // Log.d("*******",billvisible.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : billvisible) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("Retail_bill_visible",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_bill_visible_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_bill_visible");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_bill_visible.CONTENT_URI_RETAIL_BILL_VISIBLE, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncRetailcarddefine(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_card_define_mfg.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailCardDefine> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_card_define");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailCardDefine retailCardDefine = RetailCardDefineParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailCardDefine.getSTORE_ID(), retailCardDefine);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_card_define.CONTENT_URI_RETAIL_CARD_DEFINE, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String STORE_ID;
        String ID ;
        String USER ;
        String CARD_TYPE ;
        String POINTS_RANGE ;
        String S_FLAG ;
        String POS_USER ;
        String M_FLAG ;


        RetailCardDefine found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_card_define.STORE_ID));
            ID = c.getString(c.getColumnIndex(ArticleContract.Retail_card_define.ID));
            USER = c.getString(c.getColumnIndex(ArticleContract.Retail_card_define.USER));
            CARD_TYPE = c.getString(c.getColumnIndex(ArticleContract.Retail_card_define.CARD_TYPE));
            POINTS_RANGE = c.getString(c.getColumnIndex(ArticleContract.Retail_card_define.POINTS_RANGE));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_card_define.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.Retail_card_define.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_card_define.M_FLAG));

            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {

                carddefine.add(STORE_ID);
                carddefine.add(ID );
                carddefine.add(USER );
                carddefine.add(CARD_TYPE );
                carddefine.add(POINTS_RANGE );
                carddefine.add(S_FLAG );
                carddefine.add(POS_USER );
                carddefine.add(M_FLAG );
                carddefine.add(";" );


                // Log.d("*******",carddefine.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : carddefine) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_card_define",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_card_define_mfg_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_card_define");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_card_define.CONTENT_URI_RETAIL_CARD_DEFINE, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncRetailcust(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_cust.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailCust> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("Retail_cust");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailCust retailCust = RetailCustParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailCust.getSTORE_ID(), retailCust);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Cust.CONTENT_URI_RETAIL_CUST, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String CUST_ID;
        String NAME ;
        String E_MAIL;
        String MOBILE_NO;
        String PASSWORD;
        String CREDIT_CUST ;
        String S_FLAG ;
        String STORE_ID ;
        String POS_USER ;
        String M_FLAG ;



        RetailCust found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            CUST_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.CUST_ID));
            NAME = c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.NAME));
            E_MAIL= c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.E_MAIL));
            MOBILE_NO= c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.MOBILE_NO));
            PASSWORD= c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.PASSWORD));
            CREDIT_CUST = c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.CREDIT_CUST));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.S_FLAG));
            STORE_ID = c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.STORE_ID));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_Cust.M_FLAG));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {

                retailcust.add(CUST_ID);
                retailcust.add(NAME );
                retailcust.add(E_MAIL);
                retailcust.add(MOBILE_NO);
                retailcust.add(PASSWORD);
                retailcust.add(CREDIT_CUST );
                retailcust.add(S_FLAG );
                retailcust.add(STORE_ID );
                retailcust.add(POS_USER );
                retailcust.add(M_FLAG );

                retailcust.add(";");


                //Log.d("*******",retailcust.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : retailcust) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("Retail_cust",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_cust_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_cust");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Cust.CONTENT_URI_RETAIL_CUST, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }
    private void syncRetailLineItemDisc(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailLineItemDisc> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_lineitem_disc");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailLineItemDisc retailLineItemDisc = RetailLineItemDiscParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailLineItemDisc.getSTORE_ID(), retailLineItemDisc);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Line_Item_Disc.CONTENT_URI_RETAIL_LINE_ITEM_DISC, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String STORE_ID ;
        String LINE_ITEM_NM ;
        String LINE_ITEM_DISC ;
        String LINE_ITEM_ID ;
        String S_FLAG ;
        String ACTIVE ;
        String POS_USER ;
        String M_FLAG ;




        RetailLineItemDisc found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Line_Item_Disc.STORE_ID));
            LINE_ITEM_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_Line_Item_Disc.LINE_ITEM_NM));
            LINE_ITEM_DISC= c.getString(c.getColumnIndex(ArticleContract.Retail_Line_Item_Disc.LINE_ITEM_DISC));
            LINE_ITEM_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Line_Item_Disc.LINE_ITEM_ID));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Line_Item_Disc.S_FLAG));
            ACTIVE= c.getString(c.getColumnIndex(ArticleContract.Retail_Line_Item_Disc.ACTIVE));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_Line_Item_Disc.POS_USER));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Line_Item_Disc.M_FLAG));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {

                lineitemdisc.add(STORE_ID);
                lineitemdisc.add(LINE_ITEM_NM);
                lineitemdisc.add(LINE_ITEM_DISC);
                lineitemdisc.add(LINE_ITEM_ID);
                lineitemdisc.add(S_FLAG);
                lineitemdisc.add(ACTIVE);
                lineitemdisc.add(POS_USER);
                lineitemdisc.add(M_FLAG);



                // Log.d("*******",lineitemdisc.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : lineitemdisc) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_cust",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_lineitem_disc");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Line_Item_Disc.CONTENT_URI_RETAIL_LINE_ITEM_DISC, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncRetailmediaclick(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailMediaClick> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_media_click");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailMediaClick retailMediaClick = RetailMediaClickParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailMediaClick.getSTORE_MEDIA_ID(), retailMediaClick);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Media_Click.CONTENT_URI_RETAIL_MEDIA_CLICK, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String AD_PLAY;
        String STORE_MEDIA_ID;
        String MOBILE_NO ;
        String CLICK ;
        String S_FLAG ;
        String POS_USER;
        String M_FLAG;




        RetailMediaClick found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            AD_PLAY= c.getString(c.getColumnIndex(ArticleContract.Retail_Media_Click.AD_PLAY));
            STORE_MEDIA_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Media_Click.STORE_MEDIA_ID));
            MOBILE_NO = c.getString(c.getColumnIndex(ArticleContract.Retail_Media_Click.MOBILE_NO));
            CLICK = c.getString(c.getColumnIndex(ArticleContract.Retail_Media_Click.CLICK));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_Media_Click.S_FLAG));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_Media_Click.POS_USER));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Media_Click.M_FLAG));



            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_MEDIA_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_MEDIA_ID);


            } else {

                mediaclick.add(AD_PLAY);
                mediaclick.add(STORE_MEDIA_ID);
                mediaclick.add(MOBILE_NO );
                mediaclick.add(CLICK );
                mediaclick.add(S_FLAG );
                mediaclick.add(POS_USER);
                mediaclick.add(M_FLAG);


               // Log.d("*******",mediaclick.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : mediaclick) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_media_click",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_media_click");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Media_Click.CONTENT_URI_RETAIL_MEDIA_CLICK, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }



    private void syncRetailstrbilllvldisc(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailStrBillLvlDisc> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_media_click");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailStrBillLvlDisc retailStrBillLvlDisc = RetailStrBillLvlDiscParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailStrBillLvlDisc.getSTORE_ID(), retailStrBillLvlDisc);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Str_Bill_Lvl_Disc.CONTENT_URI_RETAIL_STR_BILL_LVL_DISC, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String STORE_ID;
        String BILL_LVL_NAME ;
        String DISC_TYPE ;
        String S_FLAG ;
        String ACTIVE ;
        String POS_USER ;
        String M_FLAG ;




        RetailStrBillLvlDisc found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Bill_Lvl_Disc.STORE_ID));
            BILL_LVL_NAME= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Bill_Lvl_Disc.BILL_LVL_NAME));
            DISC_TYPE = c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Bill_Lvl_Disc.DISC_TYPE));
            ACTIVE = c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Bill_Lvl_Disc.ACTIVE));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Bill_Lvl_Disc.S_FLAG));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Bill_Lvl_Disc.POS_USER));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Bill_Lvl_Disc.M_FLAG));



            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {


                billlvldisc.add(STORE_ID);
                billlvldisc.add(BILL_LVL_NAME );
                billlvldisc.add(DISC_TYPE );
                billlvldisc.add(S_FLAG );
                billlvldisc.add(ACTIVE );
                billlvldisc.add(POS_USER );
                billlvldisc.add(M_FLAG );



               // Log.d("*******",billlvldisc.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : billlvldisc) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_str_bill_lvl_disc ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_bill_lvl_disc ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Str_Bill_Lvl_Disc.CONTENT_URI_RETAIL_STR_BILL_LVL_DISC, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    private void syncRuleDefinition(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RuleDefinition> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("rule_defination");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RuleDefinition ruleDefinition = RuleDefinitionParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(ruleDefinition.getSTORE_ID(), ruleDefinition);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Rule_Definition.CONTENT_URI_RULE_DEFINITION, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String STORE_ID ;
        String SNO ;
        String USER ;
        String CARD_TYPE ;
        String BASE_VALUE ;
        String PER_TON_POINTS ;
        String S_FLAG ;
        String POS_USER ;
        String M_FLAG ;




        RuleDefinition found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.STORE_ID));
            SNO= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.SNO));
            USER= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.USER));
            CARD_TYPE= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.CARD_TYPE));
            BASE_VALUE= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.BASE_VALUE));
            PER_TON_POINTS= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.PER_TON_POINTS));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.S_FLAG));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.POS_USER));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Rule_Definition.M_FLAG));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {


                ruledefine.add(STORE_ID);
                ruledefine.add(SNO);
                ruledefine.add(USER);
                ruledefine.add(CARD_TYPE);
                ruledefine.add(BASE_VALUE);
                ruledefine.add(PER_TON_POINTS);
                ruledefine.add(S_FLAG);
                ruledefine.add(POS_USER);
                ruledefine.add(M_FLAG);



               // Log.d("*******",ruledefine.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : ruledefine) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("rule_defination ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "rule_defination ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Rule_Definition.CONTENT_URI_RULE_DEFINITION, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncSalesDetailReturnmail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,SalesDetailReturnMail> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_sales_details_return_mail");
        for (int i = 0; i < jsonArticles.length(); i++) {
            SalesDetailReturnMail salesDetailReturnMail = SalesDetailReturnMailParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(salesDetailReturnMail.getTRI_ID(), salesDetailReturnMail);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Sales_Detail_Return_Mail.CONTENT_URI_SALES_DETAIL_RETURN_MAIL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String TICKET_ID ;
        String TRI_ID ;
        String PROD_NM ;
        String TOTAL ;
        String QTY ;
        String SALE_DATE ;
        String POS_USER ;
        String FLAG ;
        String S_FLAG ;
        String M_FLAG ;
        String DISCOUNT_PERCENT ;




        SalesDetailReturnMail found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry


            TICKET_ID= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.TICKET_ID));
            TRI_ID= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.TRI_ID));
            PROD_NM= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.PROD_NM));
            TOTAL= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.TOTAL));
            QTY= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.QTY));
            SALE_DATE= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.SALE_DATE));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.S_FLAG));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.M_FLAG));
            DISCOUNT_PERCENT= c.getString(c.getColumnIndex(ArticleContract.Sales_Detail_Return_Mail.DISCOUNT_PERCENT));





            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TRI_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(TRI_ID);


            } else {

                salesdetailreturnmail.add(TICKET_ID);
                salesdetailreturnmail.add(TRI_ID);
                salesdetailreturnmail.add(PROD_NM);
                salesdetailreturnmail.add(TOTAL);
                salesdetailreturnmail.add(QTY);
                salesdetailreturnmail.add(SALE_DATE);
                salesdetailreturnmail.add(POS_USER);
                salesdetailreturnmail.add(FLAG);
                salesdetailreturnmail.add(S_FLAG);
                salesdetailreturnmail.add(M_FLAG);
                salesdetailreturnmail.add(DISCOUNT_PERCENT);


                //Log.d("*******",salesdetailreturnmail.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : salesdetailreturnmail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_str_sales_details_return_mail ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_sales_details_return_mail ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Sales_Detail_Return_Mail.CONTENT_URI_SALES_DETAIL_RETURN_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    private void syncStockMasterMail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,StockMasterMail> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_stock_master_mail");
        for (int i = 0; i < jsonArticles.length(); i++) {
            StockMasterMail stockMasterMail = StockMasterMailParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(stockMasterMail.getTICKET_ID(), stockMasterMail);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Stock_Master_Mail.CONTENT_URI_STOCK_MASTER_MAIL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String TICKET_ID;
        String PROD_ID;
        String PROD_NM;
        String BATCH_NO;
        String EXP_DATE;
        String QTY;
        String POS_USER;
        String FLAG;
        String S_FLAG;
        String M_FLAG;




        StockMasterMail found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry


            TICKET_ID= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.TICKET_ID));
            PROD_ID= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.PROD_ID));
            PROD_NM= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.PROD_NM));
            BATCH_NO= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.BATCH_NO));
            EXP_DATE= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.EXP_DATE));
            QTY= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.QTY));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.S_FLAG));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Stock_Master_Mail.M_FLAG));





            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TICKET_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(TICKET_ID);


            } else {

                stockmastermail.add(TICKET_ID);
                stockmastermail.add(PROD_ID);
                stockmastermail.add(PROD_NM);
                stockmastermail.add(BATCH_NO);
                stockmastermail.add(EXP_DATE);
                stockmastermail.add(QTY);
                stockmastermail.add(POS_USER);
                stockmastermail.add(FLAG);
                stockmastermail.add(S_FLAG);
                stockmastermail.add(M_FLAG);


                // Log.d("*******",stockmastermail.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : stockmastermail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_str_stock_master_mail ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_stock_master_mail ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Stock_Master_Mail.CONTENT_URI_STOCK_MASTER_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    private void syncVendorDetailReturnMail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,VendorDetailReturnMail> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_vendor_detail_return_mail");
        for (int i = 0; i < jsonArticles.length(); i++) {
            VendorDetailReturnMail vendorDetailReturnMail = VendorDetailReturnMailParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(vendorDetailReturnMail.getTICKET_ID(), vendorDetailReturnMail);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Vendor_Detail_Return_Mail.CONTENT_URI_VENDOR_DETAIL_RETURN_MAIL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String TICKET_ID;
        String VENDOR_RETURN_ID;
        String VENDOR_NM;
        String PROD_NM;
        String BATCH_NO;
        String EXP_DATE;
        String REASON_OF_RETURN;
        String QTY;
        String P_PRICE;
        String TOTAL;
        String UOM;
        String POS_USER;
        String FLAG;
        String S_FLAG;




        VendorDetailReturnMail found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry


            TICKET_ID= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.TICKET_ID));
            VENDOR_RETURN_ID= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.VENDOR_RETURN_ID));
            VENDOR_NM= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.VENDOR_NM));
            PROD_NM= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.PROD_NM));
            BATCH_NO= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.BATCH_NO));
            EXP_DATE= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.EXP_DATE));
            REASON_OF_RETURN= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.REASON_OF_RETURN));
            QTY= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.QTY));
            P_PRICE= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.P_PRICE));
            TOTAL= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.TOTAL));
            UOM= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.UOM));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Vendor_Detail_Return_Mail.S_FLAG));





            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TICKET_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(TICKET_ID);


            } else {

                vendordetailreturnmail.add(TICKET_ID);
                vendordetailreturnmail.add(VENDOR_RETURN_ID);
                vendordetailreturnmail.add(VENDOR_NM);
                vendordetailreturnmail.add(PROD_NM);
                vendordetailreturnmail.add(BATCH_NO);
                vendordetailreturnmail.add(EXP_DATE);
                vendordetailreturnmail.add(REASON_OF_RETURN);
                vendordetailreturnmail.add(QTY);
                vendordetailreturnmail.add(P_PRICE);
                vendordetailreturnmail.add(TOTAL);
                vendordetailreturnmail.add(UOM);
                vendordetailreturnmail.add(POS_USER);
                vendordetailreturnmail.add(FLAG);
                vendordetailreturnmail.add(S_FLAG);

                // Log.d("*******",vendordetailreturnmail.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : vendordetailreturnmail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_str_vendor_detail_return_mail ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_vendor_detail_return_mail ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Vendor_Detail_Return_Mail.CONTENT_URI_VENDOR_DETAIL_RETURN_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    private void syncRetailstrProdMail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailStrProdMail> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_vendor_detail_return_mail");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailStrProdMail retailStrProdMail = RetailStrProdMailParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailStrProdMail.getTICKET_ID(),retailStrProdMail);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Store_Prod_Mail.CONTENT_URI_RETAIL_STR_PROD_MAIL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String TICKET_ID ;
        String PROD_NM ;
        String ACTIVE ;
        String BARCODE ;
        String MRP ;
        String S_PRICE ;
        String P_PRICE ;
        String POS_USER ;
        String FLAG ;
        String S_FLAG ;




        RetailStrProdMail found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry


            TICKET_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.TICKET_ID));
            PROD_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.PROD_NM));
            ACTIVE= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.ACTIVE));
            BARCODE= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.BARCODE));
            MRP= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.MRP));
            S_PRICE= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.S_PRICE));
            P_PRICE= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.P_PRICE));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Store_Prod_Mail.S_FLAG));




            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TICKET_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(TICKET_ID);


            } else {

                prodmail.add(TICKET_ID);
                prodmail.add(PROD_NM);
                prodmail.add(ACTIVE);
                prodmail.add(BARCODE);
                prodmail.add(MRP);
                prodmail.add(S_PRICE);
                prodmail.add(P_PRICE);
                prodmail.add(POS_USER);
                prodmail.add(FLAG);
                prodmail.add(S_FLAG);


                //Log.d("*******",prodmail.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : prodmail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_store_prod_mail ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_store_prod_mail ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Store_Prod_Mail.CONTENT_URI_RETAIL_STR_PROD_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    private void syncRetailstrVendorMail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailStrVendorMail> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_store_vendor_mail");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailStrVendorMail retailStrVendorMail = RetailStrVendorMailParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailStrVendorMail.getTICKET_ID(),retailStrVendorMail);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Str_Vendor_Mail.CONTENT_URI_RETAIL_STR_VENDOR_MAIL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String TICKET_ID ;
        String VEND_NM ;
        String ACTIVE ;
        String POS_USER ;
        String FLAG ;
        String S_FLAG ;





        RetailStrVendorMail found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry


            TICKET_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Vendor_Mail.TICKET_ID));
            VEND_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Vendor_Mail.VEND_NM));
            ACTIVE= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Vendor_Mail.ACTIVE));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Vendor_Mail.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Vendor_Mail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Vendor_Mail.S_FLAG));




            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TICKET_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(TICKET_ID);


            } else {

                vendormail.add(TICKET_ID);
                vendormail.add(VEND_NM);
                vendormail.add(ACTIVE);
                vendormail.add(POS_USER);
                vendormail.add(FLAG);
                vendormail.add(S_FLAG);


              //  Log.d("*******",vendormail.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : vendormail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_store_vendor_mail ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_store_vendor_mail ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Str_Vendor_Mail.CONTENT_URI_RETAIL_STR_VENDOR_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncRetailstrDstrMail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailStrDstrMail> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_dstr_mail");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailStrDstrMail retailStrDstrMail = RetailStrDstrMailParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(retailStrDstrMail.getTICKET_ID(),retailStrDstrMail);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Str_Dstr_Mail.CONTENT_URI_RETAIL_STR_DSTR_MAIL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String TICKET_ID ;
        String DSTR_NM ;
        String ACTIVE ;
        String POS_USER ;
        String FLAG ;
        String S_FLAG ;





        RetailStrDstrMail found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry


            TICKET_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Dstr_Mail.TICKET_ID));
            DSTR_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Dstr_Mail.DSTR_NM));
            ACTIVE= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Dstr_Mail.ACTIVE));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Dstr_Mail.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Dstr_Mail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Dstr_Mail.S_FLAG));




            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TICKET_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(TICKET_ID);


            } else {

                strdstrmail.add(TICKET_ID);
                strdstrmail.add(DSTR_NM);
                strdstrmail.add(ACTIVE);
                strdstrmail.add(POS_USER);
                strdstrmail.add(FLAG);
                strdstrmail.add(S_FLAG);


               // Log.d("*******",strdstrmail.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : strdstrmail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_str_dstr_mail ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_dstr_mail ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Str_Dstr_Mail.CONTENT_URI_RETAIL_STR_DSTR_MAIL, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }
    private void syncRetailstrPoDetailMail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,StorePoDetailMail> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_po_detail_mail");
        for (int i = 0; i < jsonArticles.length(); i++) {
            StorePoDetailMail storePoDetailMail = StorePoDetailMailParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(storePoDetailMail.getTICKET_ID(),storePoDetailMail);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Str_Po_Detail_Mail.CONTENT_URI_STORE_PO_DETAIL_MAIL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();



        String TICKET_ID ;
        String PO_NO ;
        String VENDOR_NM ;
        String TOTAL ;
        String PROD_NM ;
        String P_PRICE ;
        String QTY ;
        String UOM ;
        String POS_USER ;
        String FLAG ;
        String S_FLAG ;





        StorePoDetailMail found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry


            TICKET_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.TICKET_ID));
            PO_NO= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.PO_NO));
            VENDOR_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.VENDOR_NM));
            TOTAL= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.TOTAL));
            PROD_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.PROD_NM));
            P_PRICE= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.P_PRICE));
            QTY= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.QTY));
            UOM= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.UOM));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Str_Po_Detail_Mail.S_FLAG));





            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TICKET_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(TICKET_ID);


            } else {

                storepodetailmail.add(TICKET_ID);
                storepodetailmail.add(PO_NO);
                storepodetailmail.add(VENDOR_NM);
                storepodetailmail.add(TOTAL);
                storepodetailmail.add(PROD_NM);
                storepodetailmail.add(P_PRICE);
                storepodetailmail.add(QTY);
                storepodetailmail.add(UOM);
                storepodetailmail.add(POS_USER);
                storepodetailmail.add(FLAG);
                storepodetailmail.add(S_FLAG);



               // Log.d("*******",storepodetailmail.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : storepodetailmail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_str_po_detail_mail ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_po_detail_mail ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Str_Po_Detail_Mail.CONTENT_URI_STORE_PO_DETAIL_MAIL , // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncRetailstrSalesDetailMail(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,SalesDetailMail> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_str_po_detail_mail");
        for (int i = 0; i < jsonArticles.length(); i++) {
            SalesDetailMail salesDetailMail = SalesDetailMailParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(salesDetailMail.getTICKET_ID(),salesDetailMail);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_Sales_Detail_Mail.CONTENT_URI_SALES_DETAIL_MAIL, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String TICKET_ID ;
        String TRI_ID ;
        String TOTAL ;
        String UOM ;
        String PROD_NM ;
        String EXP_DATE ;
        String S_PRICE ;
        String QTY ;
        String POS_USER ;
        String FLAG ;
        String S_FLAG ;
        String M_FLAG ;
        String ORDER_TYPE ;
        String PICK_UP_LOCATION ;




        SalesDetailMail found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            TICKET_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.TICKET_ID));
            TRI_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.TRI_ID));
            TOTAL= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.TOTAL));
            UOM= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.UOM));
            PROD_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.PROD_NM));
            EXP_DATE= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.EXP_DATE));
            S_PRICE= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.S_PRICE));
            QTY= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.QTY));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.FLAG));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.S_FLAG));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.M_FLAG));
            ORDER_TYPE= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.ORDER_TYPE));
            PICK_UP_LOCATION= c.getString(c.getColumnIndex(ArticleContract.Retail_Sales_Detail_Mail.PICK_UP_LOCATION));





            // Try to retrieve the local entry from network entries
            found = networkEntries.get(TICKET_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(TICKET_ID);


            } else {

                storesalesdetailmail.add(TICKET_ID);
                storesalesdetailmail.add(TRI_ID);
                storesalesdetailmail.add(TOTAL);
                storesalesdetailmail.add(UOM);
                storesalesdetailmail.add(PROD_NM);
                storesalesdetailmail.add(EXP_DATE);
                storesalesdetailmail.add(S_PRICE);
                storesalesdetailmail.add(QTY);
                storesalesdetailmail.add(POS_USER);
                storesalesdetailmail.add(FLAG);
                storesalesdetailmail.add(S_FLAG);
                storesalesdetailmail.add(M_FLAG);
                storesalesdetailmail.add(ORDER_TYPE);
                storesalesdetailmail.add(PICK_UP_LOCATION);



               // Log.d("*******",storesalesdetailmail.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : storesalesdetailmail) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_str_sales_detail_mail ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_str_sales_detail_mail ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_Sales_Detail_Mail.CONTENT_URI_SALES_DETAIL_MAIL , // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    private void syncTempVendDstrPayment(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://schedular.eu-gb.mybluemix.net/Testing_Aman.jsp";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,TmpVendDstrPayment> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("tmp_vend_dstr_payment");
        for (int i = 0; i < jsonArticles.length(); i++) {
            TmpVendDstrPayment tmpVendDstrPayment = TmpVendDstrPaymentParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(tmpVendDstrPayment.getSTORE_ID(),tmpVendDstrPayment);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Tmp_Vend_Dstr_Payment.CONTENT_URI_TMP_VEND_DSTR_PAYMENT, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String PAYMENT_ID ;
        String PAY_ID ;
        String VEND_DSTR_NM ;
        String REASON_OF_PAY ;
        String AMOUNT ;
        String RECEIVED_AMOUNT ;
        String DUE_AMOUNT ;
        String BANK_NAME ;
        String CHEQUE_NO ;
        String S_FLAG ;
        String POS_USER ;
        String FLAG ;
        String STORE_ID ;
        String PAYMENT_DATE ;
        String M_FLAG ;





        TmpVendDstrPayment found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            PAYMENT_ID= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.PAYMENT_ID));
            PAY_ID= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.PAY_ID));
            VEND_DSTR_NM= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.VEND_DSTR_NM));
            REASON_OF_PAY= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.REASON_OF_PAY));
            AMOUNT= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.AMOUNT));
            RECEIVED_AMOUNT= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.RECEIVED_AMOUNT));
            DUE_AMOUNT= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.DUE_AMOUNT));
            BANK_NAME= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.BANK_NAME));
            CHEQUE_NO= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.CHEQUE_NO));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.S_FLAG));
            POS_USER= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.POS_USER));
            FLAG= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.FLAG));
            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.STORE_ID));
            PAYMENT_DATE= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.PAYMENT_DATE));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Tmp_Vend_Dstr_Payment.M_FLAG));





            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {

                tmpvenddstrpayment.add(PAYMENT_ID);
                tmpvenddstrpayment.add(PAY_ID);
                tmpvenddstrpayment.add(VEND_DSTR_NM);
                tmpvenddstrpayment.add(REASON_OF_PAY);
                tmpvenddstrpayment.add(AMOUNT);
                tmpvenddstrpayment.add(RECEIVED_AMOUNT);
                tmpvenddstrpayment.add(DUE_AMOUNT);
                tmpvenddstrpayment.add(BANK_NAME);
                tmpvenddstrpayment.add(CHEQUE_NO);
                tmpvenddstrpayment.add(S_FLAG);
                tmpvenddstrpayment.add(POS_USER);
                tmpvenddstrpayment.add(FLAG);
                tmpvenddstrpayment.add(STORE_ID);
                tmpvenddstrpayment.add(PAYMENT_DATE);
                tmpvenddstrpayment.add(M_FLAG);

               // Log.d("*******",tmpvenddstrpayment.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : tmpvenddstrpayment) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("tmp_vend_dstr_payment ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://schedular.eu-gb.mybluemix.net/CRM_RETURN_PIPE.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "tmp_vend_dstr_payment ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Tmp_Vend_Dstr_Payment.CONTENT_URI_TMP_VEND_DSTR_PAYMENT , // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }

    private void syncRetailcreditcust(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_credit_cust.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,CreditCust> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("Retail_credit_cust");
        for (int i = 0; i < jsonArticles.length(); i++) {
            CreditCust creditCust = CreditCustParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(creditCust.getSTORE_ID(), creditCust);
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_credit_cust.CONTENT_URI_RETAIL_CREDIT_CUST, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String INVOICE_NO ;
        String PAYMENT_ID ;
        String STORE_ID ;
        String NAME ;
        String MOBILE_NO ;
        String GRAND_TOTAL ;
        String FLAG ;
        String S_FLAG ;
        String ACTIVE ;
        String LAST_MODIFIED ;
        String RECEIVE_AMOUNT ;
        String DUE_AMOUNT ;
        String TOTAL ;
        String CREDIT_DATE ;
        String POS_USER ;
        String M_FLAG ;



        CreditCust found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            INVOICE_NO = c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.INVOICE_NO ));
            PAYMENT_ID = c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.PAYMENT_ID ));
            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.STORE_ID ));
            NAME= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.NAME ));
            MOBILE_NO= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.MOBILE_NO ));
            GRAND_TOTAL= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.GRAND_TOTAL ));
            FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.FLAG ));
            S_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.S_FLAG ));
            ACTIVE= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.ACTIVE ));
            LAST_MODIFIED= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.LAST_MODIFIED ));
            RECEIVE_AMOUNT= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.RECEIVE_AMOUNT ));
            DUE_AMOUNT = c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.DUE_AMOUNT ));
            TOTAL = c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.TOTAL ));
            CREDIT_DATE= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.CREDIT_DATE ));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.POS_USER ));
            M_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_credit_cust.M_FLAG ));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);

            if (found != null) {
                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);


            } else {

                creditcust.add(INVOICE_NO);
                creditcust.add(PAYMENT_ID);
                creditcust.add(STORE_ID);
                creditcust.add(NAME);
                creditcust.add(MOBILE_NO);
                creditcust.add(GRAND_TOTAL);
                creditcust.add(FLAG);
                creditcust.add(S_FLAG);
                creditcust.add(ACTIVE);
                creditcust.add(LAST_MODIFIED);
                creditcust.add(RECEIVE_AMOUNT);
                creditcust.add(DUE_AMOUNT);
                creditcust.add(TOTAL);
                creditcust.add(CREDIT_DATE);
                creditcust.add(POS_USER);
                creditcust.add(M_FLAG);
                creditcust.add(";");


                //Log.d("*******",retailcust.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : creditcust) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("Retail_credit_cust",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_credit_cust_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "retail_credit_cust");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_credit_cust.CONTENT_URI_RETAIL_CREDIT_CUST, // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    private void syncRetailProdCom(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/Retail_store_prod_com.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailStoreProdCom> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("Retail_store_prod_com");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailStoreProdCom prodCom = RetailStoreProdComParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(prodCom.getPROD_ID(),prodCom);
            //Log.d("&&&&&&&",prodCom.getPROD_ID());
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.ProdCom.CONTENT_URI_PROD_COM, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String STORE_ID;
        String DSTR_NM;
        String IND_NM;
        String ACTIVE;
        String P_PRICE;
        String DISCOUNT_PERCENT_AMOUNT;
        String BARCODE;
        String MRP;
        String IS_PROD_REL_INT;
        String S_PRICE ;
        String SELLING_ORDER_UNIT;
        String INTERNET_PRICE ;
        String PROD_ID ;
        String DISCOUNT_PERCENT;
        String PROD_NM ;
        String S_FLAG ;
        String POS_USER ;
        String M_FLAG ;
        String PROFIT_MARGIN ;
        String SLAVEFLAG ;
        String LASTMODIFIED;
        String MAXSTOCK ;






        RetailStoreProdCom found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry

            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.ProdCom.STORE_ID));
            DSTR_NM= c.getString(c.getColumnIndex(ArticleContract.ProdCom.DSTR_NM));
            IND_NM= c.getString(c.getColumnIndex(ArticleContract.ProdCom.IND_NAME));
            ACTIVE= c.getString(c.getColumnIndex(ArticleContract.ProdCom.ACTIVE));
            P_PRICE= c.getString(c.getColumnIndex(ArticleContract.ProdCom.P_PRICE));
            DISCOUNT_PERCENT_AMOUNT= c.getString(c.getColumnIndex(ArticleContract.ProdCom.DISCOUNT_PERCENT_AMOUNT));
            BARCODE= c.getString(c.getColumnIndex(ArticleContract.ProdCom.BARCODE));
            MRP= c.getString(c.getColumnIndex(ArticleContract.ProdCom.MRP));
            IS_PROD_REL_INT= c.getString(c.getColumnIndex(ArticleContract.ProdCom.IS_PROD_REL_INT));
            S_PRICE = c.getString(c.getColumnIndex(ArticleContract.ProdCom.S_PRICE));
            SELLING_ORDER_UNIT= c.getString(c.getColumnIndex(ArticleContract.ProdCom.SELLING_ORDER_UNIT));
            INTERNET_PRICE = c.getString(c.getColumnIndex(ArticleContract.ProdCom.INTERNET_PRICE));
            PROD_ID = c.getString(c.getColumnIndex(ArticleContract.ProdCom.PROD_ID));
            DISCOUNT_PERCENT= c.getString(c.getColumnIndex(ArticleContract.ProdCom.DISCOUNT_PERCENT));
            PROD_NM = c.getString(c.getColumnIndex(ArticleContract.ProdCom.PROD_NAME));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.ProdCom.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.ProdCom.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.ProdCom.M_FLAG));
            PROFIT_MARGIN = c.getString(c.getColumnIndex(ArticleContract.ProdCom.PROFIT_MARGIN));
           // MAXSTOCK=c.getString(c.getColumnIndex(ArticleContract.ProdCom.MAX_STOCK));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(PROD_ID);
           /* Log.d("Database***", BARCODE);
            Log.d("SERVER****", (found.getBARCODE()));*/




               // if(found != null && (found.getBARCODE().equals(BARCODE)||found.getACTIVE().equals(ACTIVE) ||found.getP_PRICE().equals(P_PRICE) ||found.getS_PRICE().equals(S_PRICE) ||found.getDISCOUNT_PERCENT().equals(DISCOUNT_PERCENT)||found.getMRP().equals(MRP) ||found.getSELLING_ORDER_UNIT().equals(SELLING_ORDER_UNIT))||found.getPOS_USER().equals(POS_USER)) {
                  if(found!=null&&found.getACTIVE().equals(ACTIVE)&&found.getP_PRICE().equals(P_PRICE)&&found.getS_PRICE().equals(S_PRICE) &&found.getDISCOUNT_PERCENT().equals(DISCOUNT_PERCENT)&&found.getMRP().equals(MRP) &&found.getSELLING_ORDER_UNIT().equals(SELLING_ORDER_UNIT)&&found.getPOS_USER().equals(POS_USER)){
                   /* Log.d("Database***", BARCODE  + MRP  + ACTIVE  + P_PRICE  + S_PRICE  + DISCOUNT_PERCENT +  SELLING_ORDER_UNIT  +POS_USER);
                    Log.d("SERVER****", (found.getBARCODE()));*/
                    // The entry exists, remove from hash table to prevent re-inserting it
                    networkEntries.remove(PROD_ID);
                }


             else {

                storeprodcom.add(DSTR_NM);
                storeprodcom.add(IND_NM);
                storeprodcom.add(ACTIVE);
                storeprodcom.add(S_FLAG);
                storeprodcom.add(P_PRICE);
                storeprodcom.add(DISCOUNT_PERCENT_AMOUNT);
                storeprodcom.add(BARCODE);
                storeprodcom.add(MRP);
                storeprodcom.add(IS_PROD_REL_INT);
                storeprodcom.add(S_PRICE);
                storeprodcom.add(SELLING_ORDER_UNIT);
                storeprodcom.add(INTERNET_PRICE);
                storeprodcom.add(STORE_ID);
                storeprodcom.add(POS_USER);
                storeprodcom.add(PROD_ID);
                storeprodcom.add(DISCOUNT_PERCENT);
                storeprodcom.add(PROD_NM);
                storeprodcom.add(M_FLAG);
                storeprodcom.add(PROFIT_MARGIN);
                //storeprodcom.add(MAXSTOCK);
                storeprodcom.add(";");

              //  Log.d("*******",storeprodcom.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : storeprodcom) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("Retail_store_prod_com ",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/Retail_store_prod_com_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "Retail_store_prod_com ");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.ProdCom.CONTENT_URI_PROD_COM , // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    private void syncRetailStrVendor(SyncResult syncResult) throws IOException, JSONException, RemoteException, OperationApplicationException {
        final String rssFeedEndpoint = "http://35.194.196.229:8080/FMCG_SYNC/STR/retail_store_vendor.jsp?Store_Id=1493251808";

        // We need to collect all the network items in a hash table
        Log.i(TAG, "Fetching server entries...");
        Map<String,RetailStrVendor> networkEntries = new HashMap<>();

        // Parse the pretend json news feed
        String jsonFeed = download(rssFeedEndpoint);

        JSONObject jsonObject37 = new JSONObject(jsonFeed);
        JSONArray jsonArticles = jsonObject37.getJSONArray("retail_store_vendor");
        for (int i = 0; i < jsonArticles.length(); i++) {
            RetailStrVendor strVendor = RetailStrVendorParser.parse(jsonArticles.optJSONObject(i));
            networkEntries.put(strVendor.getSTORE_ID(),strVendor);
            //Log.d("&&&&&&&",prodCom.getPROD_ID());
        }

        // Create list for batching ContentProvider transactions
        ArrayList<ContentProviderOperation> batch = new ArrayList<>();

        // Compare the hash table of network entries to all the local entries
        Log.i(TAG, "Fetching local entries...");
        Cursor c = resolver.query(ArticleContract.Retail_store_vendor.CONTENT_URI_RETAIL_STORE_VENDOR, null, null, null, null, null);
        assert c != null;
        c.moveToFirst();


        String STORE_ID ;
        String VEND_ID ;
        String VEND_NM ;
        String VEND_CNTCT_NM ;
        String ADD_1 ;
        String CITY ;
        String CTR_DESC ;
        String ZIP ;
        String TELE;
        String MOBILE;
        String EMAIL ;
        String VEND_INV;
        String ACTIVE ;
        String LAST_MODIFIED ;
        String S_FLAG ;
        String POS_USER ;
        String M_FLAG ;
        String SLAVE_FLAG ;


        RetailStrVendor found;
        for (int i = 0; i < c.getCount(); i++) {
            syncResult.stats.numEntries++;

            // Create local article entry
            STORE_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.STORE_ID ));
            VEND_ID= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.VEND_ID ));
            VEND_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.VEND_NM ));
            VEND_CNTCT_NM= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.VEND_CNTCT_NM ));
            ADD_1= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.ADD_1 ));
            CITY= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.CITY));
            CTR_DESC= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.CTR_DESC));
            ZIP= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.ZIP ));
            TELE= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.TELE ));
            MOBILE= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.MOBILE ));
            EMAIL = c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.EMAIL ));
            VEND_INV = c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.VEND_INV ));
            ACTIVE= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.ACTIVE ));
            LAST_MODIFIED = c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.LAST_MODIFIED ));
            S_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.S_FLAG));
            POS_USER = c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.POS_USER));
            M_FLAG = c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.M_FLAG));
           // SLAVE_FLAG= c.getString(c.getColumnIndex(ArticleContract.Retail_store_vendor.SLAVE_FLAG));


            // Try to retrieve the local entry from network entries
            found = networkEntries.get(STORE_ID);


            if(found!=null&&found.getACTIVE().equals(ACTIVE)&& found.getPOS_USER().equals(POS_USER) && found.getVEND_NM().equals(VEND_NM) && found.getVEND_CNTCT_NM().equals(VEND_CNTCT_NM) && found.getMOBILE().equals(MOBILE) && found.getEMAIL().equals(EMAIL) && found.getVEND_INV().equals(VEND_INV)){

                // The entry exists, remove from hash table to prevent re-inserting it
                networkEntries.remove(STORE_ID);
            }


            else {

                storevendor.add(STORE_ID);
                storevendor.add(VEND_ID);
                storevendor.add(VEND_NM);
                storevendor.add(VEND_CNTCT_NM);
                storevendor.add(ADD_1);
                storevendor.add(CITY);
                storevendor.add(CTR_DESC);
                storevendor.add(ZIP);
                storevendor.add(TELE);
                storevendor.add(MOBILE);
                storevendor.add(EMAIL);
                storevendor.add(VEND_INV);
                storevendor.add(ACTIVE);
               // storevendor.add(LAST_MODIFIED);
                storevendor.add(S_FLAG);
                storevendor.add(POS_USER);
                storevendor.add(M_FLAG);
                //storevendor.add(SLAVE_FLAG);
                storevendor.add(";");
                //  Log.d("*******",storeprodcom.toString());

            }
            c.moveToNext();
        }
        c.close();

        StringBuilder sb40 = new StringBuilder(128);
        for (String value : storevendor) {
            if (sb40.length() > 0) {
                sb40.append("|");
            }
            sb40.append(value);
        }
        sb40.insert(0, "|");
        HashMap<String,String>nets =  new HashMap<>();
        nets.put("retail_store_vendor",String.valueOf(sb40));
        Log.d("******",String.valueOf(sb40));
        JSONParserSync jsonParserSync = new JSONParserSync();
        JSONObject s = jsonParserSync.sendPostRequest("http://35.194.196.229:8080/FMCG_SYNC/WOCONN/retail_store_vendor_upload.jsp",nets);
        try {
            String success = s.getString("success");
            if(success.equals("1")) {
                Log.d("Response", success + " " + "Retail_store_vendor");

            }
        }catch (Exception e){e.printStackTrace();}

        // Synchronize by performing batch update
        Log.i(TAG, "Merge solution ready, applying batch update...");
        resolver.applyBatch(ArticleContract.CONTENT_AUTHORITY, batch);
        resolver.notifyChange(ArticleContract.Retail_store_vendor.CONTENT_URI_RETAIL_STORE_VENDOR , // URI where data was modified
                null, // No local observer
                false); // IMPORTANT: Do not sync to network
    }


    @NonNull
    String download(String url) throws IOException {
        // Ensure we ALWAYS close these!
        HttpURLConnection client = null;
        InputStream is = null;

        try {
            // Connect to the server using GET protocol
            URL server = new URL(url);
            client = (HttpURLConnection)server.openConnection();
            client.connect();

            // Check for valid response code from the server
            int status = client.getResponseCode();
            is = (status == HttpURLConnection.HTTP_OK)
                    ? client.getInputStream() : client.getErrorStream();

            // Build the response or error as a string
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();
            for (String temp; ((temp = br.readLine()) != null);) {
                sb.append(temp);
            }

            return sb.toString();
        } finally {
            if (is != null) { is.close(); }
            if (client != null) { client.disconnect(); }
        }
    }

    /**
     * Manual force Android to perform a sync with our SyncAdapter.
     */
    public static void performSync() {
        Bundle b = new Bundle();
        b.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
        b.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true);
        ContentResolver.requestSync(AccountGeneral.getAccount(),
                ArticleContract.CONTENT_AUTHORITY, b);
    }

}
