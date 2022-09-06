package com.example.proyecto_calculadora_pf;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Horizontal horizontal = new Horizontal();
        Vertical vertical = new Vertical();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // In landscape

            ft.replace(R.id.fragplaceholder,horizontal);
            ft.commit();
        }
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {                      // In portrait
            ft.replace(R.id.fragplaceholder,vertical);
            ft.commit();
        }
    }
}