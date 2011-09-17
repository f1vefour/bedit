package com.gmail.altakey.dawne;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

		View view = View.inflate(this, R.layout.main, null);
        setContentView(view);

		TextView textView = (TextView)view.findViewById(R.id.textview);
		TextViewStyler.create(textView).style();
    }
}
