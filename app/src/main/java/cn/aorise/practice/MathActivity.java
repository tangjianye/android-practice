package cn.aorise.practice;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.aorise.practice.databinding.ActivityMathBinding;

public class MathActivity extends AppCompatActivity {
    private ActivityMathBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_math);
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, MathActivity.class);
        // starter.putExtra();
        context.startActivity(starter);
    }
}
