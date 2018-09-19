package nelsongoncalves.artgitosms;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;

public class estacionario extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estacionario);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-1234567890/12345678");

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        int[] lista = new int[]{

                R.drawable.menu_nr, R.drawable.menu_curso, R.drawable.menu_dds,
                R.drawable.menu_ca, R.drawable.menu_cid, R.drawable.menu_emprego,
                R.drawable.menu_assessoria



        };

        GridView gv = (GridView) findViewById(R.id.grid1);

        gv.setAdapter(new adaptador(this, lista));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), nr_estacionario.class);
                    startActivityForResult(myIntent, 0);
                    displayInterstitial();

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), cursosetreinamentos.class);
                    startActivityForResult(myIntent, 1);
                    displayInterstitial();

                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), dds.class);
                    startActivityForResult(myIntent, 2);
                    displayInterstitial();

                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), consultadeca.class);
                    startActivityForResult(myIntent, 3);
                    displayInterstitial();

                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), cid.class);
                    startActivityForResult(myIntent, 4);
                    displayInterstitial();

                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), emprego.class);
                    startActivityForResult(myIntent, 5);
                    displayInterstitial();

                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), assessoria.class);
                    startActivityForResult(myIntent, 6);
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
