package org.apache.cordova.health;

import android.app.Activity;
import android.os.Bundle;
import android.util.Patterns;
import android.webkit.WebView;

public class PermissionsRationaleActivity extends Activity {

    /**
     * URL that will be opened when the activity starts
     */
    private String url ="file:///android_asset/public/privacypolicy.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(getApplicationContext());
        setContentView(myWebView);

        url = getString(getResources().getIdentifier( "privacy_policy_url", "string", getPackageName()));

        myWebView.loadUrl(url);
    }
}