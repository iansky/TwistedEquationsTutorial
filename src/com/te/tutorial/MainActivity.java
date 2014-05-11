package com.te.tutorial;
/*
 * this code was developed using the TwistedEquations tutorials on
 * youTube.  The initial code was developed during lessons 1-4.
 * lesson 5:
 *    1) moved the "Press Me" on click listener from the 
 *       MainAction.onCreate method to the PressMeButtonClick method.
 *       This involved adding "android:onClick="PressMeButtonClick"
 *       to the button's declaration in main_activity.xml.
 *    2) Changed layout button and text from center_horizontal to 
 *       center.  Also changed from Relative layout I initially used
 *       to Linear Vertical layout.
 *    3) add two new res/layout directories: layout-land and layout-port
 *       Copy the mainActivity.xml file into each of these folders and 
 *       change the one in the land (landscape) directory to use 
 *       LinearLayout horizontal.  When you change the device orientation
 *       now, the system uses the layout-land xml for landscape mode
 *       and layout-port for portrait mode.  Watch the 'Toast' messages
 *       when you do this and you will see that the action is totally 
 *       rebuilt.
 *    4) added code to trace the activity state.  Look for tag:MainActivity:
 *       There are also 'Toast' messages to show this same data.
 * lesson 6:
 *       Added a second activity.  Its layout has a button, 3 text views
 *       and 3 edit views.  The second activity button code is written so
 *       contents of the edit text views will be copied into the associated
 *       text views when it is clicked.
 *       
 *       "Press me" button code has been removed.  Next lesson this will be
 *       used to launch the second activity.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
        // in tutorial 5 this was moved to PressMeButtonClick.
	}

	@Override
	protected void onStart() {
		super.onStart();
        // get current method name in Java.
		String method // java code to get current method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		String method // java code to get current method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onResume() {
		super.onResume();
		String method // java code to get current method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onPause() {
		super.onPause();
		String method // java code to get current method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onStop() {
		super.onStop();
		String method // java code to get current method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		String method // java code to get current method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}
    // This was moved from the over-ride in the Action onCreate method
    // in lesson 5.
    public void PressMeButtonClick(View v) {
		String method // java code to get current method 
        	= Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		String seeMe = ((TextView)findViewById(R.id.see_me)).getText().toString();
    	Intent intent = new Intent(MainActivity.this, SecondActivity.class);
    	intent.putExtra("PressMeString", seeMe);
    	startActivity(intent);
    }
}
