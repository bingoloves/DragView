package cn.cqs.dragview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.cqs.window.FloatView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatView =  new FloatView(this, R.drawable.ic_debug);
    }
    private FloatView floatView;
    public void showFloatView(View view){
        floatView.show();
    }
    public void hideFloatView(View view){
        floatView.dismiss();
    }
}
