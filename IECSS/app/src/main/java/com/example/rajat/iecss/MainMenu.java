package com.example.rajat.iecss;

/**
 * Created by rajat on 4/1/16.
 */
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.util.*;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by rajat on 3/15/16.
 */


public class MainMenu extends Activity {
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    ArrayAdapter<CharSequence> adapter;
    ListView list;

    /**  public MainMenu(){
     HashMap<Integer, String> hashMap = new HashMap<>();
     Collection<String> vals = hashMap.values();
     Objects[] array = vals.toArray(new Objects[vals.size()]);
     //  ArrayAdapter<CharSequence> dataAdapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_item,array);
     ArrayAdapter<String> adapter;

     }  */


    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        // Log.d("TAG", "Layout Home");
        setContentView(R.layout.layout_home);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  HashMap<Integer, String> hashMap = new HashMap<>();

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner3 = (Spinner)findViewById(R.id.spinner3);
        list = (ListView)findViewById(R.id.listView);
     //   list.setAdapter(new VivazAdapter(this));







        adapter = ArrayAdapter.createFromResource(this, R.array.array1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        adapter = ArrayAdapter.createFromResource(this, R.array.array2, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

        adapter = ArrayAdapter.createFromResource(this, R.array.array2, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);

        // HashMap Initilaization



        // HashMap<String, HashMap<Float,HashMap<Float, String>>> map = new HashMap<>();

        // map.put("circle", new HashMap<Float, HashMap<Float, String>>());


        final HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, R.array.array1);


        final HashMap<Integer, Integer> hm2 = new HashMap<>();
        hm2.put(0, R.array.array2);
        hm2.put(1, R.array.array3);

        final HashMap<Integer, Integer> hm3 = new HashMap<>();
        hm3.put(0, R.array.array4);
        hm3.put(1, R.array.array5);
        hm3.put(2, R.array.array6);
        hm3.put(3, R.array.array7);


        final HashMap<Integer, Integer> hm4 = new HashMap<>();
        hm4.put(0, R.array.array8);
        hm4.put(1, R.array.array9);
        hm4.put(2, R.array.array10);
        hm4.put(3, R.array.array11);
        hm4.put(4, R.array.array12);





        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int key = (int) parent.getItemIdAtPosition(position);
                switch (key) {
                    case 0:
                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm2.get(key), android.R.layout.simple_spinner_item);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner2.setAdapter(adapter);


                        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                int key = (int) parent.getItemIdAtPosition(position);
                                switch (key) {
                                    case 0:
                                        Log.d("TAG", "case 0");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm3.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;
                                    case 1:
                                        // Log.d("TAG", "case 1");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm3.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;
                                    case 2:
                                        // Log.d("TAG", "case 2");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm3.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;
                                    case 3:
                                        // Log.d("TAG", "case 3");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm3.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;







                                }


                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });


                        break;

                    case 1:
                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm2.get(key), android.R.layout.simple_spinner_item);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner2.setAdapter(adapter);


                        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                int key = (int) parent.getItemIdAtPosition(position);
                                switch (key) {


                                    case 0:
                                        Log.d("TAG", "case 4");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm4.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;
                                    case 1:
                                        Log.d("TAG", "case 5");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm4.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;
                                    case 2:
                                        Log.d("TAG", "case 6");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm4.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;
                                    case 3:
                                        Log.d("TAG", "case 7");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm4.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;

                                    case 4:
                                        Log.d("TAG", "case 8");
                                        adapter = ArrayAdapter.createFromResource(getBaseContext(), hm4.get(key), android.R.layout.simple_spinner_item);
                                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        spinner3.setAdapter(adapter);
                                        break;


                                }


                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });




















                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }


}



