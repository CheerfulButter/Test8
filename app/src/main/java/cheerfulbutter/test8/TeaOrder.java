package cheerfulbutter.test8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class TeaOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea_order);


        WebView view = new WebView(this);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("https://sites.google.com/a/mca.org.tw/hsdailybulletin/");
        setContentView(view);

    }
}
