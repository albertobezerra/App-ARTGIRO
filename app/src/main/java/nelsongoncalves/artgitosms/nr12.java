package nelsongoncalves.artgitosms;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class nr12 extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nr12);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-1234567890/12345678");
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);

        final ListView lista1 = (ListView) findViewById(R.id.lista_nr_12);
        final ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.menu_nr_12, android.R.layout.simple_list_item_1);
        lista1.setAdapter(adapter);

        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), nr12_nr.class);
                    startActivityForResult(myIntent, 0);
                    displayInterstitial();

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo1.class);
                    startActivityForResult(myIntent, 1);
                    displayInterstitial();

                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo2.class);
                    startActivityForResult(myIntent, 2);
                    displayInterstitial();

                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo3.class);
                    startActivityForResult(myIntent, 3);
                    displayInterstitial();

                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo4.class);
                    startActivityForResult(myIntent, 4);
                    displayInterstitial();

                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo5.class);
                    startActivityForResult(myIntent, 5);
                    displayInterstitial();

                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo6.class);
                    startActivityForResult(myIntent, 6);
                    displayInterstitial();

                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo7.class);
                    startActivityForResult(myIntent, 7);
                    displayInterstitial();

                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo8.class);
                    startActivityForResult(myIntent, 8);
                    displayInterstitial();

                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo9.class);
                    startActivityForResult(myIntent, 9);
                    displayInterstitial();

                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo10.class);
                    startActivityForResult(myIntent, 10);
                    displayInterstitial();

                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo11.class);
                    startActivityForResult(myIntent, 11);
                    displayInterstitial();

                }

                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), nr12_anexo12.class);
                    startActivityForResult(myIntent, 12);
                    displayInterstitial();

                }



            }


        });

    }

    public void displayInterstitial(){
        if (interstitialAd.isLoaded()){
            interstitialAd.show();
        }
    }


    @Override
    public void run() {
        displayInterstitial();
        finish();
    }

}