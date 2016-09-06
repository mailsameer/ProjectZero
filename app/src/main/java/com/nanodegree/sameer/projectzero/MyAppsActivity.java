package com.nanodegree.sameer.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAppsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnProject1, btnProject2, btnProject3, btnProject4, btnProject5, btnProject6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_apps);
        getSupportActionBar().setTitle(R.string.title);

        btnProject1 = (Button) findViewById(R.id.btnProject1);
        btnProject2 = (Button) findViewById(R.id.btnProject2);
        btnProject3 = (Button) findViewById(R.id.btnProject3);
        btnProject4 = (Button) findViewById(R.id.btnProject4);
        btnProject5 = (Button) findViewById(R.id.btnProject5);
        btnProject6 = (Button) findViewById(R.id.btnProject6);

        btnProject1.setOnClickListener(this);
        btnProject2.setOnClickListener(this);
        btnProject3.setOnClickListener(this);
        btnProject4.setOnClickListener(this);
        btnProject5.setOnClickListener(this);
        btnProject6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnProject1: {
                showToast(getString(R.string.project_1_message));
                break;
            }
            case R.id.btnProject2: {
                showToast(getString(R.string.project_2_message));
                break;
            }
            case R.id.btnProject3: {
                showToast(getString(R.string.project_3_message));
                break;
            }
            case R.id.btnProject4: {
                showToast(getString(R.string.project_4_message));
                break;
            }
            case R.id.btnProject5: {
                showToast(getString(R.string.project_5_message));
                break;
            }
            case R.id.btnProject6: {
                showToast(getString(R.string.project_6_message));
                break;
            }
            default:
                break;
        }
    }

    private void showToast(String toastMessage) {
        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
    }

}
