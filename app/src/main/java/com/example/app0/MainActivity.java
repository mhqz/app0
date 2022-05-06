package com.example.app0;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import ie.equalit.ouinet.Ouinet;
import ie.equalit.ouinet.Config;

public class MainActivity extends AppCompatActivity {
    private Ouinet ouinet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        myWebView.loadUrl("https://censorship.no/en/index.html");

        Config config = new Config.ConfigBuilder(this)
                .setCacheType("bep5-http")
                .setCacheHttpPubKey(BuildConfig.CACHE_PUB_KEY)
                .setInjectorCredentials(BuildConfig.INJECTOR_USERNAME + ":" + BuildConfig.INJECTOR_PASSWORD)
                .setInjectorTlsCert(BuildConfig.INJECTOR_TLS_CERT)
                .setTlsCaCertStorePath("file:///android_asset/cacert.pem")
            .build();

        ouinet = new Ouinet(this, config);
        ouinet.start();
    }
}