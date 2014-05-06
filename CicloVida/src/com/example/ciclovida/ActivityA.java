package com.example.ciclovida;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class ActivityA extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a);
		
		Log.d("ALAIN", "ARRANCADO");
	}

	public void startActivityB (View v) {
		Log.d("ALAIN","startActivityB");
		
		Intent intent = new Intent(this, ActivityB.class);
		startActivity(intent);
		
	}

	public void startActivityC (View v) {
		Log.d("ALAIN","startActivityC");

		Intent intent = new Intent(this, ActivityC.class);
		startActivity(intent);
	}

	public void close (View v) {
		Log.d("ALAIN","Close");

		finish();
	}
	
}
