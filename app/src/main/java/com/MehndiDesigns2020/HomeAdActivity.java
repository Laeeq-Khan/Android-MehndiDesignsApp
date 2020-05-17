package com.MehndiDesigns2020;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Toast;

public class HomeAdActivity extends AppCompatActivity {


    private CardView handsCard , armCard, feetCard;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ad);

        // Create the next level button, which tries to show an interstitial when clicked.
        handsCard = findViewById(R.id.handsCard);
        armCard = findViewById(R.id.armCard);
        feetCard = findViewById(R.id.feetCard);

        // Create the InterstitialAd and set the adUnitId (defined in values/strings.xml).
        mInterstitialAd = newInterstitialAd();
        loadInterstitial();

        events();
        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.
     }
     int status = 0;
     public void events(){
         handsCard.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 showInterstitial();
                 status = 1;
             }
         });
         armCard.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 showInterstitial();
                 status = 2;
             }
         });
         feetCard.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 showInterstitial();
                 status=3;
             }
         });
     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_ad, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private InterstitialAd newInterstitialAd() {
        InterstitialAd interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
              //  mNextLevelButton.setEnabled(true);
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                //mNextLevelButton.setEnabled(true);
                goToNextLevel();

            }

            @Override
            public void onAdClosed() {
                // Proceed to the next level.
                goToNextLevel();
                newActivity();

            }
        });
        return interstitialAd;
    }

    public void newActivity(){
        Intent intent = new Intent(HomeAdActivity.this, DesignsActivity.class);
        intent.putExtra("status", status);
        startActivity(intent);
    }

    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and reload the ad.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Toast.makeText(this, "Connect with Internet or Wait 2 Seconds  \nThanks", Toast.LENGTH_SHORT).show();
            goToNextLevel();
            newActivity();
        }
    }

    private void loadInterstitial() {
        // Disable the next level button and load the ad.
       // mNextLevelButton.setEnabled(false);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        mInterstitialAd.loadAd(adRequest);
    }

    private void goToNextLevel() {
        mInterstitialAd = newInterstitialAd();
        loadInterstitial();
    }
}
