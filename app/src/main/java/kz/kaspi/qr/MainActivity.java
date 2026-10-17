package kz.kaspi.qr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String URL_QR              = "https://kaspi.kz/qr";
    private static final String URL_TRANSFERS        = "https://l.kaspi.kz/nra4iI0BrUs";
    private static final String URL_GOV_SERVICES     = "https://l.kaspi.kz/CZE9s42d1a1";

    private static final String ACTION_TRANSFERS    = "kz.kaspi.qr.ACTION_OPEN_TRANSFERS";
    private static final String ACTION_GOV_SERVICES = "kz.kaspi.qr.ACTION_OPEN_GOV_SERVICES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String action = getIntent().getAction();
        String url;
        if (ACTION_TRANSFERS.equals(action)) {
            url = URL_TRANSFERS;
        } else if (ACTION_GOV_SERVICES.equals(action)) {
            url = URL_GOV_SERVICES;
        } else {
            url = URL_QR;
        }

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        finish();
    }
}
