package com.virtualshop;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Map<String, String> params = new HashMap<String, String>();
		ServerConnection.sharedInstance().getRequest("/list/", params, new JsonHttpResponseHandler()
		        {
				 	public void onSuccess(int code, Header[] h, JSONArray json)
		            {
				 		super.onSuccess(code, json);
				 		for(int i = 0; i < json.length(); i++) {
                            JSONObject jsonElem;
							try {
								jsonElem = (JSONObject) json.get(i);
								 System.out.println(jsonElem.toString());
							} catch (JSONException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                           
                            }
				
			        }
		        });
		        

		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
