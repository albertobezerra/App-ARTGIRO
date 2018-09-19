package nelsongoncalves.artgitosms;

import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class nr12_anexo9 extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nr12_anexo9);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        pdfView = (PDFView) findViewById(R.id.nr12_anexo9);
        pdfView.fromAsset("NR12_anexo9.pdf").load();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("NR 12 - Anexo 9");
    }
}
