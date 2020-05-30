package com.MehndiDesigns2020;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Toast;

public class HomeAdActivity extends AppCompatActivity {


    private CardView handsCard , armCard, feetCard;
    private InterstitialAd mInterstitialAd;
    Context context;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ad);
        context = HomeAdActivity.this;

        // Create the next level button, which tries to show an interstitial when clicked.
        handsCard = findViewById(R.id.handsCard);
        armCard = findViewById(R.id.armCard);
        feetCard = findViewById(R.id.feetCard);

        // Create the InterstitialAd and set the adUnitId (defined in values/strings.xml).
        mInterstitialAd = newInterstitialAd();
        loadInterstitial();

        events();
        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


    }
     int status = 0;
     public void events(){
         handsCard.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 showInterstitial();
               int images[] = new int[]{
                       R.drawable.mehndidesigns12,
                       R.drawable.mehndidesigns25,
                       R.drawable.mehndidesigns29,
                       R.drawable.mehndidesigns5,
                       R.drawable.mehndidesigns2,
                       R.drawable.mehndidesigns3,
                       R.drawable.mehndidesigns4,
                       R.drawable.mehndidesigns8,
                       R.drawable.mehndidesigns9,
                       R.drawable.mehndidesigns6,
                       R.drawable.mehndidesigns7,
                       R.drawable.mehndidesigns97,
                       R.drawable.mehndidesigns98,
                       R.drawable.mehndidesigns99,
                       R.drawable.mehndidesigns93,
                       R.drawable.mehndidesigns94,
                       R.drawable.mehndidesigns95,
                       R.drawable.mehndidesigns96,
                       R.drawable.mehndidesigns90,
                       R.drawable.mehndidesigns91,
                       R.drawable.mehndidesigns92,
                       R.drawable.mehndidesigns86,
                       R.drawable.mehndidesigns87,
                       R.drawable.mehndidesigns88,
                       R.drawable.mehndidesigns89,
                       R.drawable.mehndidesigns82,
                       R.drawable.mehndidesigns83,
                       R.drawable.mehndidesigns84,
                       R.drawable.mehndidesigns85,
                       R.drawable.mehndidesigns80,
                       R.drawable.mehndidesigns81,
                       R.drawable.mehndidesigns79,
                       R.drawable.mehndidesigns75,
                       R.drawable.mehndidesigns76,
                       R.drawable.mehndidesigns77,
                       R.drawable.mehndidesigns78,
                       R.drawable.mehndidesigns71,
                       R.drawable.mehndidesigns72,
                       R.drawable.mehndidesigns73,
                       R.drawable.mehndidesigns74,
                       R.drawable.mehndidesigns70,
                       R.drawable.mehndidesigns68,
                       R.drawable.mehndidesigns69,
                       R.drawable.mehndidesigns64,
                       R.drawable.mehndidesigns65,
                       R.drawable.mehndidesigns66,
                       R.drawable.mehndidesigns67,
                       R.drawable.mehndidesigns60,
                       R.drawable.mehndidesigns61,
                       R.drawable.mehndidesigns62,
                       R.drawable.mehndidesigns63,
                       R.drawable.mehndidesigns57,
                       R.drawable.mehndidesigns58,
                       R.drawable.mehndidesigns59,
                       R.drawable.mehndidesigns53,
                       R.drawable.mehndidesigns54,
                       R.drawable.mehndidesigns55,
                       R.drawable.mehndidesigns56,
                       R.drawable.mehndidesigns50,
                       R.drawable.mehndidesigns51,
                       R.drawable.mehndidesigns52,
                       R.drawable.mehndidesigns46,
                       R.drawable.mehndidesigns47,

                       R.drawable.mehndidesigns48,
                       R.drawable.mehndidesigns49,
                       R.drawable.mehndidesigns42,
                       R.drawable.mehndidesigns43,
                       R.drawable.mehndidesigns44,
                       R.drawable.mehndidesigns45,
                       R.drawable.mehndidesigns40,
                       R.drawable.mehndidesigns41,
                       R.drawable.mehndidesigns39,
                       R.drawable.mehndidesigns35,

                       R.drawable.mehndidesigns36,
                       R.drawable.mehndidesigns37,
                       R.drawable.mehndidesigns38,
                       R.drawable.mehndidesigns31,
                       R.drawable.mehndidesigns1,
                       R.drawable.mehndidesigns32,
                       R.drawable.mehndidesigns33,
                       R.drawable.mehndidesigns100,
                       R.drawable.mehndidesigns34,
                       R.drawable.mehndidesigns30,

                       R.drawable.mehndidesigns28,

                       R.drawable.mehndidesigns24,

                       R.drawable.mehndidesigns26,
                       R.drawable.mehndidesigns27,
                       R.drawable.mehndidesigns20,
                       R.drawable.mehndidesigns21,
                       R.drawable.mehndidesigns22,
                       R.drawable.mehndidesigns110,

                       R.drawable.mehndidesigns23,
                       R.drawable.mehndidesigns111,
                       R.drawable.mehndidesigns101,
                       R.drawable.mehndidesigns102,
                       R.drawable.mehndidesigns103,
                       R.drawable.mehndidesigns104,
                       R.drawable.mehndidesigns105,
                       R.drawable.mehndidesigns106,
                       R.drawable.mehndidesigns107,
                       R.drawable.mehndidesigns108,

                       R.drawable.mehndidesigns109,
                       R.drawable.mehndidesigns17,
                       R.drawable.mehndidesigns18,
                       R.drawable.mehndidesigns19,
                       R.drawable.mehndidesigns13,
                       R.drawable.mehndidesigns14,
                       R.drawable.mehndidesigns15,
                       R.drawable.mehndidesigns16,
                       R.drawable.mehndidesigns10,
                       R.drawable.mehndidesigns11,

                       R.drawable.mehndidesigns112,
                       R.drawable.mehndidesigns113,
                       R.drawable.mehndidesigns114,
                       R.drawable.mehndidesigns115,
                       R.drawable.mehndidesigns116,
                       R.drawable.mehndidesigns117,
                       R.drawable.mehndidesigns118

               };
               Intent intent = new Intent(HomeAdActivity.this, DesignsActivity.class);
               intent.putExtra("images", images);
               startActivity(intent);

             }
         });
         armCard.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 showInterstitial();
                 int images[] = new int[]{
                         R.drawable.arms3,
                         R.drawable.arms2,
                         R.drawable.arms8,



                         R.drawable.arms4,
                         R.drawable.arms5,
                         R.drawable.arms9,

                         R.drawable.arms7,
                         R.drawable.arms1,
                         R.drawable.arms6,
                         R.drawable.arms10,
                         R.drawable.arms11,
                         R.drawable.arms12,
                         R.drawable.arms13,
                         R.drawable.arms14,
                         R.drawable.arms15,
                         R.drawable.arms16,
                         R.drawable.arms17,
                         R.drawable.arms18,
                         R.drawable.arms19,
                         R.drawable.arms20,
                         R.drawable.arms21,
                         R.drawable.arms22,
                         R.drawable.arms23,
                         R.drawable.arms24,
                         R.drawable.arms25,
                         R.drawable.arms26,
                         R.drawable.arms27,
                         R.drawable.arms28,
                         R.drawable.arms29,
                         R.drawable.arms30,
                         R.drawable.arms31,
                         R.drawable.arms32,
                         R.drawable.arms33,
                         R.drawable.arms34,
                         R.drawable.arms35,
                         R.drawable.arms36,
                         R.drawable.arms37,
                         R.drawable.arms38

                 };
                 Intent intent = new Intent(HomeAdActivity.this, DesignsActivity.class);
                 intent.putExtra("images", images);
                 startActivity(intent);
                 status = 2;
             }
         });
         feetCard.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 showInterstitial();
                 int images[] = new int[]{
                         R.drawable.feets24,
                         R.drawable.feets25,
                         R.drawable.feets17,
                         R.drawable.feets6,
                         R.drawable.feets11,
                         R.drawable.feets2,
                         R.drawable.feets9,
                         R.drawable.feets3,
                         R.drawable.feets4,
                         R.drawable.feets5,
                         R.drawable.feets7,
                         R.drawable.feets8,
                         R.drawable.feets10,
                         R.drawable.feets12,
                         R.drawable.feets13,
                         R.drawable.feets14,
                         R.drawable.feets15,
                         R.drawable.feets16,
                         R.drawable.feets18,
                         R.drawable.feets19,
                         R.drawable.feets20,
                         R.drawable.feets21,
                         R.drawable.feets22,
                         R.drawable.feets23,
                         R.drawable.feets26,
                         R.drawable.feets27,
                         R.drawable.feets28,
                         R.drawable.feets29,
                         R.drawable.feets30,

                 };
                 Intent intent = new Intent(HomeAdActivity.this, DesignsActivity.class);
                 intent.putExtra("images", images);
                 startActivity(intent);
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
