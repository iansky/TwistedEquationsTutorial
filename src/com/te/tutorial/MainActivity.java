package com.te.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private final static String TAG = "MainActivity:";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		Log.i(TAG, "onCreate");
		Toast.makeText(this, TAG + "onCreate", Toast.LENGTH_SHORT)
			.show();
		// Use button to toggle text between 'Hello Android' and 'Hello World'
		Button pressMe = (Button) findViewById(R.id.press_me);
		pressMe.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				TextView tv = (TextView) findViewById(R.id.text_hello);
				String current = tv.getText().toString();
				String new_string
					= (current != null && current.equals(getString(R.string.hello_android))
						? getString(R.string.hello_world)
						: getString(R.string.hello_android)
						);
				tv.setText(new_string);
			}
		});
		

	}

	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, TAG + "onShow", Toast.LENGTH_SHORT)
			.show();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(this, TAG + "onRestart", Toast.LENGTH_SHORT)
			.show();
	}

	@Override
	protected void onResume() {
		super.onResume();
		Toast.makeText(this, TAG + "onResume", Toast.LENGTH_SHORT)
			.show();
	}

	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, TAG + "onPause", Toast.LENGTH_SHORT)
			.show();
	}

	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(this, TAG + "onStop", Toast.LENGTH_SHORT)
			.show();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, TAG + "onDestroy", Toast.LENGTH_SHORT)
			.show();
	}



}
