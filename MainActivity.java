package com.unikom.sholehudin_10116152_if4_uts;

//10116152-Moch Sholehudin Mawardi-IF4-Senin, 20 Mei 2019

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toolbar;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
        public void run() {

            //setelah loading maka akan langsung berpindah ke home activity
            Intent home=new Intent(MainActivity.this, home.class);
            startActivity(home);
            finish();
        }
    }
    ,waktu_loading);
    }

    private void setupViewPager(ViewPager viewPager) {
        MainFragmentPagerAdapter mainFragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());
        mainFragmentPagerAdapter.addFragment(new home(), getString(R.string.Home));
        mainFragmentPagerAdapter.addFragment(new profil(), getString(R.string.Profil));
        mainFragmentPagerAdapter.addFragment(new kontak(), getString(R.string.Kontak));
        mainFragmentPagerAdapter.addFragment(new list(), getString(R.string.List));

        viewPager.setAdapter(mainFragmentPagerAdapter);
    }
}
