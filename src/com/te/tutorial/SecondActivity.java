
package com.te.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
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
