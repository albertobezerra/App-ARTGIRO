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

public class nr30 extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nr30);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-1234567890/12345678");
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);

        final ListView lista1 = (ListView) findViewById(R.id.lista_nr_30);
        final ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.menu_nr_30, android.R.layout.simple_list_item_1);
        lista1.setAdapter(adapter);

        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), nr30_nr.class);
                    startActivityForResult(myIntent, 0);
                    displayInterstitial();

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), nr30_anexo1.class);
                    startActivityForResult(myIntent, 1);
                    displayInterstitial();

                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), nr30_anexo2.class);
                    startActivityForResult(myIntent, 2);
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