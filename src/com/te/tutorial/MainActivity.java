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
 */

import android.app.Activity;
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
        // get curent method name in Java.
		String method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		String method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onResume() {
		super.onResume();
		String method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onPause() {
		super.onPause();
		String method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onStop() {
		super.onStop();
		String method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		String method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);
	}
    // This was moved from the over-ride in the Action onCreate method
    // in lesson 5.
    public void PressMeButtonClick(View v) {
        TextView tv = (TextView) findViewById(R.id.text_hello);
		String method 
            = Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, TAG + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(TAG, method);

        String current = tv.getText().toString();
        String new_string
            = (current != null 
                    && current.equals(getString(R.string.hello_android))
                ? getString(R.string.hello_world)
                : getString(R.string.hello_android)
                );
        tv.setText(new_string);
    }
}
