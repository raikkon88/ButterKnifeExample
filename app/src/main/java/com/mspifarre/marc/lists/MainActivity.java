package com.mspifarre.marc.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnSeguent)
    Button btnSeguent;

    @BindView(R.id.btnAnterior)
    Button btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSeguent)
    public void btnSeguent(View view){
        Toast.makeText(this, btnSeguent.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.btnAnterior)
    public void btnAnterior(View view){
        Toast.makeText(this, btnAnterior.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
