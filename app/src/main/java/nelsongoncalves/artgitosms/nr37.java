package nelsongoncalves.artgitosms;

import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class nr37 extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr37);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("NR 37");


        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        pdfView = (PDFView) findViewById(R.id.nr37);
        pdfView.fromAsset("NR37.pdf").load();
    }
}