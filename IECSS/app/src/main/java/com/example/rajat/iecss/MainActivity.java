package com.example.rajat.iecss;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    EditText user_name;
    EditText pass;
    Button sub;
    Button cle;
    String TAG = "com.example.rajat.login";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        user_name = (EditText) findViewById(R.id.editText1);
        pass = (EditText) findViewById(R.id.editText2);
        sub = (Button) findViewById(R.id.button1);
        cle = (Button) findViewById(R.id.button2);


    }

    public void onSubmit(View v) {

            String userName = user_name.getText().toString();
            String passWord = pass.getText().toString();
            Log.d(TAG, "User Name : " + userName + " Password : " + passWord);

            if (userName.equals("a") && passWord.equals("a")) {


                Intent i = new Intent(this, MainMenu.class);
                startActivity(i);
            } else {
                user_name.setText("");
                pass.setText("");
                user_name.requestFocus();
                Log.d(TAG, "Layout Home1");
                Intent j = new Intent(this, Pop.class);
                startActivity(j);
            }


    }

    public void onClear(View v){

        user_name.setText("");
        pass.setText("");
        user_name.requestFocus();

    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
