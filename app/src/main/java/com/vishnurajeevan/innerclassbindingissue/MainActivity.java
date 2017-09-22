package com.vishnurajeevan.innerclassbindingissue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivityViewHolder holder = new MainActivityViewHolder();
        ButterKnife.bind(holder, this);

        holder.byeWorld.setText("lolnope");
    }

    static final class MainActivityViewHolder {
        @BindView(R.id.hello_world) TextView helloWorld;
        @BindView(R.id.bye_world) TextView byeWorld;
    }
}
