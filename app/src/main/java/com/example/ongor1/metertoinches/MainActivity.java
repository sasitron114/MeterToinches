package com.example.ongor1.metertoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    I meter to Incher = 39.37
     */

    private EditText enterMeter;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeter = (EditText)findViewById(R.id.metereditText);
        resultTextView = (TextView)findViewById(R.id.resutextView);
        convertButton = (Button)findViewById(R.id.convertbutton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double mul = 39.37;
                double result = 0.0;
                /*
                double netervalue = Double.parseDouble(enterMeter.getText().toString());
                result = netervalue*mul;

                resultTextView.setText(String.format("0.21",result)+"Inches");
                */
                  if (enterMeter.getText().toString().equals("")){

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                }
                else {
                    double netervalue = Double.parseDouble(enterMeter.getText().toString());
                    result = netervalue*mul;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText(String.format("0.21",result)+"Inches");
                }
            }
        });
    }
}
