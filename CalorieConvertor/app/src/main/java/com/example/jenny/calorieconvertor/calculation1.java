package com.example.jenny.calorieconvertor;

import android.content.Context;
import android.content.Intent;
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
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.w3c.dom.Text;


public class calculation1 extends AppCompatActivity {
    String[] order = {"pushup", "situp", "jumping jack", "jogging", "squats", "leg-lift", "plank", "pullup",
                                    "cycling", "walking", "swimming", "stairclimbing"};
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
        setContentView(R.layout.activity_calculation1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button[] replace = {(Button)findViewById(R.id.sup1), (Button)findViewById(R.id.jj1),
                                 (Button)findViewById(R.id.jg1), (Button) findViewById(R.id.sq1),
                                 (Button)findViewById(R.id.ll1), (Button)findViewById(R.id.pk1),
                                 (Button)findViewById(R.id.pp1),(Button)findViewById(R.id.cy1),
                                 (Button)findViewById(R.id.w1),(Button)findViewById(R.id.sw1),
                                 (Button)findViewById(R.id.sc1)};
        final EditText rep = (EditText) findViewById(R.id.reps1);
        final TextView cal = (TextView)findViewById(R.id.calories1);
        final InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);

        rep.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                int number_rep = Integer.parseInt(rep.getText().toString());
                imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    double calburned = number_rep /(ratios.get("pushup"));
                    cal.setText(Math.round(calburned) + " calories burned." );
                    showOthers(calburned, replace, "pushup");
                    return true;
                }
                return false;
            }
        });
    }
    /**
    public void showOthers(double calories) {
        Button push = (Button)findViewById(R.id.sup1);
        push.setText("Situp \n" + Math.round(ratios.get("situp") * calories) + " reps");
        push= (Button)findViewById(R.id.jj1);
        push.setText("Jumping Jacks \n" + Math.round(ratios.get("jumping jack") * calories) + " minutes");
        push = (Button)findViewById(R.id.jg1);
        push.setText("Jogging \n" + (int) Math.round(ratios.get("jogging") * calories) + " minutes");


    }
     **/
    public void showOthers(double calories, Button[] buttons, String current) {
        int buttonTrack = 0;
        for (String exercise: ratios.keySet()) {
            if (!exercise.equals(current)) {
                Button b = buttons[buttonTrack];
                double rate = ratios.get(exercise);
                if (rate < 1) {

                    b.setText(exercise + " "  + Math.round(rate * calories) + " minutes");
                } else {
                    b.setText(exercise + " "  + Math.round(rate * calories) + " reps");
                }
                buttonTrack++;
            }
        }
    }




}
