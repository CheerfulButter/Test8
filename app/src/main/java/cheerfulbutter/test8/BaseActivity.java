package cheerfulbutter.test8;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Brian Shih on 2/21/2017.
 */

public class BaseActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {
    protected int layoutId;
    public BaseActivity(){
        layoutId = R.layout.activity_annoucement;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_close, R.string.navigation_drawer_open);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            drawer.openDrawer(GravityCompat.START);
            //super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //This is the settings thing down here.
        //getMenuInflater().inflate(R.menu.main, menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.info) {
            Toast.makeText(this, "Information", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Information.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            finish();
            startActivity(intent);
        } else if (id == R.id.lunch) {
            Toast.makeText(this, "Lunch", Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent( this, Lunch.class);
            // startActivity(intent);
        } else if (id == R.id.coffee_order) {
            Toast.makeText(this, "Coffee Order", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Coffee.class);
            startActivity(intent);
        } else if (id == R.id.tea_info) {
            Toast.makeText(this, "Tea Information", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, TeaOrder.class);
            startActivity(intent);
        } else if (id == R.id.announcement) {
            Toast.makeText(this, "Announcement", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Annoucement.class);
            startActivity(intent);
        } else if (id == R.id.school_calender) {
            Toast.makeText(this, "School Calender", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, SchoolCalender.class);
            startActivity(intent);
        } else if (id == R.id.inbox) {
            Toast.makeText(this, "Inbox", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Inbox.class);
            startActivity(intent);
        } else if (id == R.id.user) {
            Toast.makeText(this, "User Setting", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, UserSettings.class);
            startActivity(intent);
        } else if (id == R.id.setting) {
            Toast.makeText(this, "App Settings", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
