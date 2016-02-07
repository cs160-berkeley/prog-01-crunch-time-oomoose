package com.example.jenny.calorieconvertor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class action_selection extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button pushup_button = (Button)findViewById(R.id.pup);
        Button situp_button = (Button)findViewById(R.id.sup);
        Button jj_button = (Button)findViewById(R.id.jj);
        Button jg_button = (Button) findViewById(R.id.jg);
        Button sq_button = (Button) findViewById(R.id.sq);
        Button ll_button = (Button)findViewById(R.id.ll);
        Button pk_button = (Button) findViewById(R.id.pk);
        Button pp_button = (Button) findViewById(R.id.pp);
        Button cy_button = (Button) findViewById(R.id.cy);
        Button w_button = (Button) findViewById(R.id.w);
        Button sw_button = (Button) findViewById(R.id.sw);
        Button sc_button = (Button) findViewById(R.id.sc);

        pushup_button.setOnClickListener(this);
        situp_button.setOnClickListener(this);
        jj_button.setOnClickListener(this);
        jg_button.setOnClickListener(this);
        sq_button.setOnClickListener(this);
        ll_button.setOnClickListener(this);
        pk_button.setOnClickListener(this);
        pp_button.setOnClickListener(this);
        cy_button.setOnClickListener(this);
        w_button.setOnClickListener(this);
        sw_button.setOnClickListener(this);
        sc_button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pup:
                Intent number_in = new Intent(action_selection.this, calculation1.class);
                startActivity(number_in);
                break;

            case R.id.sup:
                Intent number_in2 = new Intent(action_selection.this, calculation2.class);
                startActivity(number_in2);
                break;

            case R.id.jj:
                Intent number_in3= new Intent(action_selection.this, calculation3.class);
                startActivity(number_in3);
                break;
            case R.id.jg:
                Intent number_in4 = new Intent(action_selection.this, calculation4.class);
                startActivity(number_in4);
                break;
            case R.id.sq:
                Intent number_in5 = new Intent(action_selection.this, calculation5.class);
                startActivity(number_in5);
                break;
            case R.id.ll:
                Intent number_in6 = new Intent(action_selection.this, calculation6.class);
                startActivity(number_in6);
                break;
            case R.id.pk:
                Intent number_in7 = new Intent(action_selection.this, calculation7.class);
                startActivity(number_in7);
                break;
            case R.id.pp:
                Intent number_in8 = new Intent(action_selection.this, calculation8.class);
                startActivity(number_in8);
                break;
            case R.id.cy:
                Intent number_in9 = new Intent(action_selection.this, calculation9.class);
                startActivity(number_in9);
                break;
            case R.id.w:
                Intent number_in10 = new Intent(action_selection.this,calculation10.class);
                startActivity(number_in10);
                break;
            case R.id.sw:
                Intent number_in11 = new Intent(action_selection.this, calculation11.class);
                startActivity(number_in11);
                break;
            case R.id.sc:
                Intent number_in12 = new Intent(action_selection.this, calculation12.class);
                startActivity(number_in12);
                break;


        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_action_selection, menu);
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
