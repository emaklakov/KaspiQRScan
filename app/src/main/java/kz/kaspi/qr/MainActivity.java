package kz.kaspi.qr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String URL_QR        = "https://kaspi.kz/qr";
    private static final String URL_TRANSFERS  = "https://l.kaspi.kz/nra4iI0BrUs";
    private static final String ACTION_TRANSFERS = "kz.kaspi.qr.ACTION_OPEN_TRANSFERS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String url = ACTION_TRANSFERS.equals(getIntent().getAction())
                ? URL_TRANSFERS
                : URL_QR;

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        finish();
    }
}
