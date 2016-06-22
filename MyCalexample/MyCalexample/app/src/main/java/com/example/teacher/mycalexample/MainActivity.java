package com.example.teacher.mycalexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Additional Imports

public class MainActivity extends Activity {

    public String sign = "";
    public Double tempDouble, tempDouble2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create Event Handling For buttons

        // Buttons 0-9
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        // Buttons Addition, Subtraction, Multiplication, Division
        Button buttonA = (Button) findViewById(R.id.buttonA);
        Button buttonS = (Button) findViewById(R.id.buttonS);
        Button buttonM = (Button) findViewById(R.id.buttonM);
        Button buttonD = (Button) findViewById(R.id.buttonD);

        // Buttons Clear, Equals
        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonE = (Button) findViewById(R.id.buttonE);

        // Button 0
        button0.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("0");
                    }
                }
        );

        // Button 1
        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("1");
                    }
                }
        );

        // Button 2
        button2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("2");
                    }
                }
        );

        // Button 3
        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("3");
                    }
                }
        );

        // Button 4
        button4.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("4");
                    }
                }
        );

        // Button 5
        button5.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("5");
                    }
                }
        );

        // Button 6
        button6.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("6");
                    }
                }
        );

        // Button 7
        button7.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("7");
                    }
                }
        );

        // Button 8
        button8.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("8");
                    }
                }
        );

        // Button 9
        button9.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.append("9");
                    }
                }
        );

        // Button Addition
        buttonA.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "+";
                    }
                }
        );

        // Button Subtraction
        buttonS.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "-";
                    }
                }
        );

        // Button Multiplication
        buttonM.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "*";
                    }
                }
        );

        // Button Division
        buttonD.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "/";
                    }
                }
        );

        // Button Clear
        buttonC.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        output.setText("");
                    }
                }
        );

        // Button Equals
        buttonE.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.outputText);
                        tempDouble2 = Double.parseDouble(output.getText().toString());

                        if (sign == "+") {
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        } else if (sign == "-") {
                            output.setText(Double.toString(tempDouble - tempDouble2));
                        } else if (sign == "*") {
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        } else if (sign == "/") {
                            if (tempDouble2 == 0) {
                                // Cannot Divide By Zero
                                output.setText("Cannot Divide By Zero!");
                            } else {
                                output.setText(Double.toString(tempDouble / tempDouble2));
                            }
                        }

                        // Reset the Sign variable
                        sign = "";
                    }
                }
        );

    }


}

