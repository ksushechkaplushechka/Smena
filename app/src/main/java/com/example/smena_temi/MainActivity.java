package com.example.smena_temi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String krest, nol;
    TextView textView, humanPoints, pcPoints;
    int pointsOfHuman, pointsOfPC;
    SharedPreferences settings;
    SharedPreferences.Editor editor;
    ImageButton switchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
        humanPoints = findViewById(R.id.humanPoints);
        pcPoints = findViewById(R.id.pcPionts);

        krest = "X";
        nol = "O";
        textView.setText("");

        //тут начинается смена темы
        settings = getSharedPreferences("SETTINGS", MODE_PRIVATE);

        if (settings.contains("MODE_NIGHT_ON")){
            getCurrentTheme();
        }else{
            editor = settings.edit();
            editor.putBoolean("MODE_NIGHT_ON", false);
            editor.apply();
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            Toast.makeText(this, "Salam, brat", Toast.LENGTH_SHORT).show();

        }

        setContentView(R.layout.activity_main);

        switchButton = findViewById(R.id.switch_button);

        if(settings.getBoolean("MODE_NIGHT_ON", false)){
            switchButton.setImageResource((R.drawable.ic_day));
        }else{
            switchButton.setImageResource((R.drawable.ic_night));
        }

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor = settings.edit();

                if(settings.getBoolean("MODE_NIGHT_ON", false)){

                    editor.putBoolean("MODE_NIGHT_ON", false);

                }else{

                    editor.putBoolean("MODE_NIGHT_ON", true);

                }
                editor.apply();

                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });


    }

    private void getCurrentTheme() {
        if(settings.getBoolean("MODE_NIGHT_ON", false)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }

    //тут все для хо
    public void clcBtn1 (View view) {
        if (button1.getText() == "" && textView.getText() == "")  {
        button1.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }

    public void clcBtn2 (View view) {
        if (button2.getText() == "" && textView.getText() == "")  {
        button2.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn3 (View view) {
        if (button3.getText() == "" && textView.getText() == "")  {
        button3.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn4 (View view) {
        if (button4.getText() == "" && textView.getText() == "")  {
        button4.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn5 (View view) {
        if (button5.getText() == "" && textView.getText() == "")  {
        button5.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn6 (View view) {
        if (button6.getText() == "" && textView.getText() == "")  {
        button6.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn7 (View view) {
        if (button7.getText()==""&& textView.getText() == "")  {
        button7.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn8 (View view) {
        if (button8.getText() == "" && textView.getText() == "")  {
            button8.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn9 (View view) {
        if (button9.getText() == "" && textView.getText() == "")  {
            button9.setText(krest);
            isPlayerWinner();
            if(textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void isPlayerWinner () {
        if (button1.getText() == krest && button2.getText() == krest && button3.getText() == krest) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
        } else
        if (button4.getText() == krest && button5.getText() == krest && button6.getText() == krest) {
            textView.setText(R.string.winner_message);
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
        }else
        if (button7.getText() == krest && button8.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
        }else
        if (button1.getText() == krest && button4.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
        }else
        if (button2.getText() == krest && button5.getText() == krest && button8.getText() == krest) {
            textView.setText(R.string.winner_message);
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
        }else
        if (button3.getText() == krest && button6.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
        }else
        if (button1.getText() == krest && button5.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
        }else
        if (button3.getText() == krest && button5.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.winner_message);
            button3.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
        }else
        if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" && button4.getText() != "" && button5.getText() != "" && button6.getText() != "" && button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            textView.setText(R.string.draw_message);

        }
    }
    public void isPCWinner () {
        if (button1.getText() == nol && button2.getText() == nol && button3.getText() == nol) {
            textView.setText(R.string.pc_winner_message);
            button1.setBackgroundColor(Color.RED);
            button2.setBackgroundColor(Color.RED);
            button3.setBackgroundColor(Color.RED);
            pointsOfPC++;
            pcPoints.setText("" + pointsOfPC);
        }else
        if (button4.getText() == nol && button5.getText() == nol && button6.getText() == nol) {
            textView.setText(R.string.pc_winner_message);
            button4.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button6.setBackgroundColor(Color.RED);
            pointsOfPC++;
            pcPoints.setText("" + pointsOfPC);
        }else
        if (button7.getText() == nol && button8.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.pc_winner_message);
            button7.setBackgroundColor(Color.RED);
            button8.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            pointsOfPC++;
            pcPoints.setText("" + pointsOfPC);
        }else
        if (button1.getText() == nol && button4.getText() == nol && button7.getText() == nol) {
            textView.setText(R.string.pc_winner_message);
            button1.setBackgroundColor(Color.RED);
            button4.setBackgroundColor(Color.RED);
            button7.setBackgroundColor(Color.RED);
            pointsOfPC++;
            pcPoints.setText("" + pointsOfPC);
        }else
        if (button2.getText() == nol && button5.getText() == nol && button6.getText() == nol) {
            textView.setText(R.string.pc_winner_message);
            button2.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button8.setBackgroundColor(Color.RED);
            pointsOfPC++;
            pcPoints.setText("" + pointsOfPC);
        }else
        if (button3.getText() == nol && button6.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.pc_winner_message);
            button3.setBackgroundColor(Color.RED);
            button6.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            pointsOfPC++;
            pcPoints.setText("" + pointsOfPC);
        }else
        if (button1.getText() == nol && button5.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.pc_winner_message);
            button1.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            pointsOfPC++;
            pcPoints.setText("" + pointsOfPC);
        }else
        if (button3.getText() == nol && button5.getText() == nol && button7.getText() == nol) {
            textView.setText(R.string.pc_winner_message);
            button3.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button7.setBackgroundColor(Color.RED);
            pointsOfPC++;
            pcPoints.setText("" + pointsOfPC);
        }
    }
    private void hodPC() {
        Random random = new Random();
        int buttonPcClick = 1 + random.nextInt(9);
        Log.i("hodPc","buttonPcClick - " + buttonPcClick);
        switch(buttonPcClick){
            case(1): if(button1.getText() == ""){
                button1.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
            case(2): if(button2.getText() == ""){
                button2.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
            case(3): if(button3.getText() == ""){
                button3.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
            case(4): if(button4.getText() == ""){
                button4.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
            case(5): if(button5.getText() == ""){
                button5.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
            case(6): if(button6.getText() == ""){
                button6.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
            case(7): if(button7.getText() == ""){
                button7.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
            case(8): if(button8.getText() == ""){
                button8.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
            case(9): if(button9.getText() == ""){
                button9.setText(nol);
                isPCWinner();
            }else{hodPC();}
                break;
        }
    }
    public void clickRestart(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");

        button1.setBackgroundColor(Color.BLUE);
        button2.setBackgroundColor(Color.BLUE);
        button3.setBackgroundColor(Color.BLUE);
        button4.setBackgroundColor(Color.BLUE);
        button5.setBackgroundColor(Color.BLUE);
        button6.setBackgroundColor(Color.BLUE);
        button7.setBackgroundColor(Color.BLUE);
        button8.setBackgroundColor(Color.BLUE);
        button9.setBackgroundColor(Color.BLUE);
    }
}