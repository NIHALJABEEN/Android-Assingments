package com.jbn.tabs;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivity extends TabActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost=getTabHost();

        TabHost.TabSpec videospec=tabHost.newTabSpec("Videos");
        videospec.setIndicator("Videos");
        Intent videoIntent=new Intent(this,VideoActivity.class);
        videospec.setContent(videoIntent);

        TabHost.TabSpec photospec=tabHost.newTabSpec("Photos");
        photospec.setIndicator("Photos");
        Intent photoIntent=new Intent(this,PhotoActivity.class);
        photospec.setContent(photoIntent);

        TabHost.TabSpec songspec=tabHost.newTabSpec("Songs");
        songspec.setIndicator("Songs");
        Intent songIntent=new Intent(this,SongActivity.class);
        songspec.setContent(songIntent);

        tabHost.addTab(photospec);
        tabHost.addTab(songspec);
        tabHost.addTab(videospec);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
