package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount =0;
    private TextView mShowCount;
    private Button btnZero;
    private Button btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnZero =  findViewById(R.id.button_Zero);
        btnCount =  findViewById(R.id.button_count);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view){
        ++mCount;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if(mCount!=0)
            btnZero.setBackgroundColor(Color.RED);

        if((mCount%2)==0)
            btnCount.setBackgroundColor(Color.BLUE);
        else
            btnCount.setBackgroundColor(Color.GREEN);
    }

    public void setZeroCount(View view){
        mCount =0;
        btnZero.setBackgroundColor(Color.DKGRAY);
        mShowCount.setText(Integer.toString(mCount));
    }


}