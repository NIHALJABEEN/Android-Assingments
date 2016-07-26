package com.jbn.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch(item.getItemId())
        {
            case R.id.action_menu_bookmark:
                Toast.makeText(this,"Bookmark is Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_menu_save:
                Toast.makeText(this,"Save is Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_menu_search:
                Toast.makeText(this,"Search is Selected",Toast.LENGTH_LONG).show();
                return true;
            default:

            return super.onOptionsItemSelected(item);

        }





    }
}
