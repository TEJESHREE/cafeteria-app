package com.example.tejeshree.cafetria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    int n = 2;
    int m = 2;
    int z = 2;
    ArrayList<Integer> stack = new ArrayList<Integer>();
    int top=-1;
    int q;
    int total=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class stack extends Vector{

    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);

    }

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    public void more(View view) {
        n = n + 1;
        display1(n);

    }

    public void less(View view) {
        n = n - 1;
        display1(n);
    }

    public void inc(View view) {
        m = m + 1;
        dis(m);

    }

    public void dec(View view) {
        m = m - 1;
        dis(m);
    }

    public void in(View view) {
        z = z + 1;
        disp(z);

    }

    public void de(View view) {
        z = z - 1;
        disp(z);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.qv1);
        quantityTextView.setText("" + number);
    }

    private void display1(int number) {
        TextView quantityView = (TextView) findViewById(R.id.qv2);
        quantityView.setText("" + number);
    }
    private void dis(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.qv3);
        quantityTextView.setText("" + number);
    }

    private void disp(int number) {
        TextView quantityView = (TextView) findViewById(R.id.qv4);
        quantityView.setText("" + number);


    }
    public void push(int item)
    {
        stack.add(item);
        top++;
    }
    public int pop(){
        q=stack.remove(top--);
        return q;

    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


    public void order(View view){
           int t=quantity*30;
           int a=n*50;
           int c=m*60;
           int b=z*100;

        push(b);
        push(c);
        push(a);
        push(t);
        for(int i=top;i>=0;i--)
        {
           total=total+pop();
        }
        displayPrice(total);
    }
}