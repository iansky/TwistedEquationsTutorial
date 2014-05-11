
package com.te.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {
	private static String intentString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		String method // java code to get current method 
        	= Thread.currentThread().getStackTrace()[2].getMethodName();
		Toast.makeText(this, this.getLocalClassName() + ":"  + method, Toast.LENGTH_SHORT)
			.show();
		Log.i(this.getLocalClassName() + ":", method);
		// When method starts, set the Name string with the value
		// passed via the intent from the MainActivity button that
		// started this action.  If no string, set the string to "--NONE--";
		intentString = getIntent().getStringExtra("PressMeString");
		if(intentString == null) intentString = "--NONE--";
		// Note to self... if you want to access a view element, you
		// first have to create the activity.  i.e. First 
		// setContentView... then get the text view.
        setContentView(R.layout.second_activity);
        ((TextView)findViewById(R.id.textName)).setText(intentString);
    }
    public void addComment (View view) {
        // Set the TextView windows to the new values from the EditText
        // windows.
        final String Name = 
            ((EditText)findViewById(R.id.editName)).getText().toString();
        ((TextView)findViewById(R.id.textName)).setText(Name);
        final String Comment = 
            ((EditText)findViewById(R.id.editComment)).getText().toString();
        ((TextView)findViewById(R.id.textComment)).setText(Comment);
        final String Other = 
            ((EditText)findViewById(R.id.editOther)).getText().toString();
        ((TextView)findViewById(R.id.textOther)).setText(Other);
    }

}
