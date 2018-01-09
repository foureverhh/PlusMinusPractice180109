package com.nackademin.foureverhh.plusminuspractice180109;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int r = 0;
    TextView tvxPlus ;
    TextView tvxResult ;
    Button btnMinus ;
    Button btnQuit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tvxPlus = (TextView)findViewById(R.id.txv_plus);
         tvxResult = (TextView)findViewById(R.id.txv_result);
         btnMinus = (Button) findViewById(R.id.btn_Minus);
         btnQuit =(Button) findViewById(R.id.btn_quit);

        tvxPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnQuit.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_Minus)
        {
            tvxResult.setText(String.valueOf(--r));
        }
        else if(v.getId()==R.id.txv_plus)
        {
            tvxResult.setText(String.valueOf(++r));
        }
        else if(v.getId()==R.id.btn_quit)
        {
            finish();
        }
    }
}
