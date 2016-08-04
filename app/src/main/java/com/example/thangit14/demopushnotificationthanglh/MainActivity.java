package com.example.thangit14.demopushnotificationthanglh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Response;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvItemProduct;
    AdapterListProduct adapterListProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvItemProduct = (ListView) findViewById(R.id.list_item);

        getDataFormServer();
    }

    private void getDataFormServer() {
        TaskGetListProduct taskGetListProduct = new TaskGetListProduct(this);
        taskGetListProduct.request(new Response.Listener<ArrayList<ItemProduct>>() {
            @Override
            public void onResponse(ArrayList<ItemProduct> response) {
                adapterListProduct = new AdapterListProduct(MainActivity.this, response);
                lvItemProduct.setAdapter(adapterListProduct);
            }
        }, new TaskNetworkBase.ErrorListener() {
            @Override
            public void onErrorListener(int errorCode, String errorMessage) {
                Toast.makeText(MainActivity.this, "errorCode = " + errorCode + " : " + errorMessage, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
