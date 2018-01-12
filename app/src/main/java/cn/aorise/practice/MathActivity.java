package cn.aorise.practice;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;

import cn.aorise.practice.databinding.ActivityMathBinding;

public class MathActivity extends AppCompatActivity {
    private ActivityMathBinding mBinding;
    private String mMathStr = "<p>\n" +
            "    上标：2<sup>2</sup> + 4<sup>2&nbsp;</sup>= 20，那么 sin60<sup>o&nbsp;</sup>+ cos30<sup>o</sup> = 1\n" +
            "</p>\n" +
            "<p>\n" +
            "    下标：a<sub>1&nbsp;</sub>+ b<sub>2</sub><span style=\"text-decoration: none;\"> = c<sub>3</sub></span>\n" +
            "</p>\n" +
            "<p>\n" +
            "    字体： 我是<span style=\"color: rgb(255, 0, 0);\">红色</span>，<span style=\"color: rgb(0, 0, 0);\"><span style=\"background-color: rgb(0, 176, 80);\">我的背景有颜色</span><span style=\"background-color: rgb(255, 255, 255); color: rgb(0, 0, 0);\">，</span><span style=\"color: rgb(0, 0, 0); background-color: rgb(255, 255, 255);\"><u>下划线</u></span></span>\n" +
            "</p>\n" +
            "<p>\n" +
            "    <span style=\"color: rgb(0, 0, 0);\"><span style=\"color: rgb(0, 0, 0); background-color: rgb(255, 255, 255);\"><u>表情：<img src=\"http://img.baidu.com/hi/jx2/j_0059.gif\"/></u></span></span>\n" +
            "</p>\n" +
            "<p>\n" +
            "    特殊符号：38℃&nbsp;Ⅷ&nbsp;&nbsp;θ&nbsp;Щ&nbsp;ā&nbsp;ú&nbsp;i?&nbsp;ㄓ&nbsp;\n" +
            "</p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_math);

        mBinding.txtQuestion.setText(Html.fromHtml(mMathStr));
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, MathActivity.class);
        // starter.putExtra();
        context.startActivity(starter);
    }
}
