package com.example.mythirdaplication;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class EncuentrosActivity extends TabActivity {
    @Override
    public void onCreate(Bundle savedInsteanceState){
        super.onCreate(savedInsteanceState);
        TabHost host = getTabHost();
        host.addTab(host.newTabSpec("tab_1").setIndicator("Grupos").setContent(new Intent(this, Tab1Activity.class)));
        host.addTab(host.newTabSpec("tab_2").setIndicator("Favoritos").setContent(new Intent(this, Tab2Activity.class)));
        host.addTab(host.newTabSpec("tab_3").setIndicator("Posiciones").setContent(new Intent(this, Tab3Activity.class)));
    }
}
