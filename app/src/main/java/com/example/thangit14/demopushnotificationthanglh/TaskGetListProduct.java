package com.example.thangit14.demopushnotificationthanglh;

import android.content.Context;

import com.android.volley.Request;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by thangit14 on 8/4/16.
 */
public class TaskGetListProduct extends TaskNetworkBase<ArrayList<ItemProduct>>{

    protected TaskGetListProduct(Context mContext) {
        super(mContext);
    }

    @Override
    protected ArrayList<ItemProduct> genDataFromJSON(String data) throws JSONException, ParseException {
        return null;
    }

    @Override
    public JSONObject genBodyParam() throws JSONException {
        return null;
    }

    @Override
    public String genURL() {
        return null;
    }

    @Override
    public int genMethod() {
        return Request.Method.GET;
    }
}
