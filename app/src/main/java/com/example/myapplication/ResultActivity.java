package com.example.myapplication;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.myapplication.ResultActivity;
public class ResultActivity extends AppCompatActivity
{private static final String PARAM_RESULT = "result";



    public static void start(Activity activity, int requestCode, boolean success) {

        Intent starter = new Intent(activity, ResultActivity.class);

        starter.putExtra(PARAM_RESULT, success);

        activity.startActivityForResult(starter, requestCode);
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);

        boolean result = getIntent().getBooleanExtra(PARAM_RESULT, false);

        // 判断是否成功，成功显示Logout，失败不显示

        findViewById(R.id.btnLogout).setVisibility(result ? View.VISIBLE : View.GONE);

        findViewById(R.id.btnLogout).setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                setResult(RESULT_OK);

                finish();

            }

        });



    }



}
