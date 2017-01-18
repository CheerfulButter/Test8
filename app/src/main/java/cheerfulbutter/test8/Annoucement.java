package cheerfulbutter.test8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

public class Annoucement extends AppCompatActivity {
    Intent starterIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annoucement);


        WebView view = new WebView(this);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("https://sites.google.com/a/mca.org.tw/hsdailybulletin/");
        setContentView(view);
        starterIntent = getIntent();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //This is the settings thing down here.
        //getMenuInflater().inflate(R.menu.main, menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.refresh_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.refresh)  {
            Toast.makeText(this,"Refresh",Toast.LENGTH_SHORT).show();
            finish(); startActivity(starterIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}
