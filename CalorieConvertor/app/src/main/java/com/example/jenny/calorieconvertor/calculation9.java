package com.example.jenny.calorieconvertor;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class calculation9 extends calculation1 {

    static Map<String, Double> ratios = new LinkedHashMap<String, Double>();
    static {
        ratios.put("pushup", 3.5);
        ratios.put("situp", 2.0);
        ratios.put("jumping jack", 0.1);
        ratios.put("jogging", 0.12);
        ratios.put("squats", 2.25);
        ratios.put("leg-lift", 0.25);
        ratios.put("plank", 0.25);
        ratios.put("pullup", 1.0);
        ratios.put("cycling", 0.12);
        ratios.put("walking", 0.2);
        ratios.put("swimming", 0.13);
        ratios.put("stair-climbing", 0.15);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation9);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button[] replace = {(Button)findViewById(R.id.pup9), (Button)findViewById(R.id.sup9),
                (Button)findViewById(R.id.jj9), (Button) findViewById(R.id.jg9),
                (Button)findViewById(R.id.sq9), (Button)findViewById(R.id.ll9),
                (Button)findViewById(R.id.pk9),(Button)findViewById(R.id.pp9),
                (Button)findViewById(R.id.w9),(Button)findViewById(R.id.sw9),
                (Button)findViewById(R.id.sc9)};
        final EditText rep = (EditText) findViewById(R.id.reps9);
        final TextView cal = (TextView)findViewById(R.id.calories9);
        final InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        rep.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                int number_rep = Integer.parseInt(rep.getText().toString());
                imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    double calburned = number_rep / (ratios.get("cycling"));
                    cal.setText(Math.round(calburned) + " calories burned.");
                    showOthers(calburned, replace, "cycling");
                    return true;
                }
                return false;
            }
        });
    }

}
