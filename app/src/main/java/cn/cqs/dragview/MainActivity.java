package cn.cqs.dragview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cn.cqs.window.FloatView;

public class MainActivity extends AppCompatActivity implements FloatView.OnFloatViewIconClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatView = new FloatView(this, R.drawable.ic_debug);
        floatView.setOnFloatViewIconClickListener(this);
    }
    private FloatView floatView;
    public void showFloatView(View view){
        floatView.show();
    }
    public void hideFloatView(View view){
        floatView.dismiss();
    }
    
    @Override
    public void onFloatViewClick() {
        Toast.makeText(this, "点击了图标", Toast.LENGTH_SHORT).show();
    }
}
