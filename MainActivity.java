package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
 TextView result;
 Button zero,one, two, three, four, five, six, seven, eight, nine, add,
subtract, multiply,divide,decimal, equals, ac, c;
 float num1, num2;
 boolean addition, subtraction, multiplication, division;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 result = findViewById(R.id.textView);
 zero = findViewById(R.id.button10);
 one = findViewById(R.id.button);
 two = findViewById(R.id.button2);
 three = findViewById(R.id.button3);
 four = findViewById(R.id.button4);
 five = findViewById(R.id.button5);
 six = findViewById(R.id.button6);
 seven = findViewById(R.id.button7);
 eight = findViewById(R.id.button8);
 nine = findViewById(R.id.button9);
 add = findViewById(R.id.buttonadd);
 subtract = findViewById(R.id.buttonsub);
 multiply = findViewById(R.id.buttonmult);
 divide = findViewById(R.id.buttondiv);
 decimal = findViewById(R.id.buttondec);
 equals = findViewById(R.id.buttoneql);
 ac = findViewById(R.id.buttonac);
 c = findViewById(R.id.buttonc);
 zero.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "0");
 }
 });
 one.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "1");
 }
 });
 two.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "2");
 }
 });
 three.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "3");
 }
 });
 four.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "4");
 }
 });
 five.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "5");
 }
 });
 six.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "6");
 }
 });
 seven.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "7");
 }
 });
 eight.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "8");
 }
 });
 nine.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + "9");
 }
 });
 add.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 if(result == null) {
 result.setText("");
 } else {
 num1 = Float.parseFloat(result.getText() + "");
 addition = true;
result.setText(null);
 }
 }
 });
 subtract.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 num1 = Float.parseFloat(result.getText() + "");
 subtraction = true;
 result.setText(null);
 }
 });
 multiply.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 num1 = Float.parseFloat(result.getText() + "");
 multiplication = true;
 result.setText(null);
 }
 });
 divide.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 num1 = Float.parseFloat(result.getText() + "");
 division = true;
 result.setText(null);
 }
 });
 decimal.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText(result.getText() + ".");
 }
 });
 equals.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 num2 = Float.parseFloat(result.getText() + "");
 if(addition == true) {
 result.setText(num1 + num2 + "");
 addition = false;
 }
 if(subtraction == true) {
 result.setText(num1 - num2 + "");
 subtraction = false;
 }
 if(multiplication == true) {
 result.setText(num1*num2 + "");
 multiplication = false;
 }
 if(division == true) {
 result.setText(num1/num2 + "");
 division = false;
 }
 }
 });
 ac.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText("");
 }
 });
 c.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String str = result.getText().toString();
 if(str.length() >= 1) {
 str = str.substring(0, str.length() - 1);
 result.setText(str);
 } else if (str.length() <= 1) {
 result.setText("0");
 }
 }
 });
 }
}
