package nelsongoncalves.artgitosms;

import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class nr15_anexo13a extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nr15_anexo13a);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anexo 13a - NR 15");

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        pdfView = (PDFView) findViewById(R.id.nr15_anexo13a);
        pdfView.fromAsset("NR15_anexo13.pdf").load();
    }
}
