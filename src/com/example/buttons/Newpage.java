package com.example.buttons;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Newpage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpage);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.buttons, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        
        Log.i("tag", String.format("%d", id));
        if (id == R.id.action_settings) {
            return true;
           
        }
        return super.onOptionsItemSelected(item);
       
    }
    
    public void flickyflob (View view) {
    Button button1 = (Button) findViewById(R.id.button1);
    button1.setOnClickListener (new View.OnClickListener()
    {
        public void onClick(View v)
        {
            setContentView(R.layout.activity_buttons);
        }
    });
}
}



