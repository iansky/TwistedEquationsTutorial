package com.te.tutorial;
/*
 * BaseActivity was added so all activities will see the same action bar
 * and menus.  We then extend the other activites from this class.  This
 * class is never 'seen' i.e. has no UI but supplies the onCreateOptionsMenu
 * and onOptionsMenuSelected methods for MainActivity and SecondActivity. 
 */

import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class BaseActivity extends Activity {
	
	// Default menu.  Unless a class implements its own onCreateOptionsMenu
	// method, it gets menu items defined in the menu/base_activity
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.base_activity, menu);
		return true;
	}
	// Default menu hendler.  As long as a menu item has an ID here, it
	// gets handled here.
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
            case R.id.twitter:
            	// Do stuff here...
                break;
            case R.id.facebook:
            	// Do stuff here...
                break;
            case R.id.refresh:
            	// Do stuff here...
                break;
            default:
                // Currently nested menu items aren't caught in switch above
            	// and show up here.
            	Toast.makeText(this, "menu item: \""
                    + item.getTitle().toString() 
                    + "\" not in switch"
                    , Toast.LENGTH_SHORT)
                    .show();
                return super.onOptionsItemSelected(item);
		}
        Toast.makeText(this, "menu:" + item.getTitle(), Toast.LENGTH_SHORT)
            .show();
        return true;
	}
}
