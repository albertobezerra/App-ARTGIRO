package nelsongoncalves.artgitosms;

import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class nr15_anexo5 extends AppCompatActivity {

    private PDFView pdfView
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nr15_anexo5);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anexo 5 - NR 15");

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        pdfView = (PDFView) findViewById(R.id.nr15_anexo5);
        pdfView.fromAsset("NR15_anexo5.pdf").load();
    }
}
