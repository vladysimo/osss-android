package com.myfristapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button)findViewById(R.id.button);
        
        bt.setOnClickListener(new View.OnClickListener() {
        	
            public void onClick(View v) {
                // Perform action on click
            	
            	//Toast.makeText(getApplicationContext(), "Hello toast!", Toast.LENGTH_LONG).show();
            	
            	Intent intent = new Intent(MainActivity.this, NewActivity.class);
            	startActivity(intent);
            	//finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
    }
    
}
