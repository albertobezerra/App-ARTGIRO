package nelsongoncalves.artgitosms;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



        Handler handler = new Handler();
        handler.postDelayed(this, 2000);


    }

    @Override
    public void run() {
        startActivity(new Intent(this, estacionario.class));
        finish();
    }
}