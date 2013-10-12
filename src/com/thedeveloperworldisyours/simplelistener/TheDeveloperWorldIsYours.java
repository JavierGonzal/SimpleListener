package com.thedeveloperworldisyours.simplelistener;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class TheDeveloperWorldIsYours extends Activity implements MyListener.Listener{

	private TextView mTextView;
	private MyListener mListener;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_the_developer_world_is_yours);
		
		mTextView = (TextView) findViewById(R.id.tvTheDeveloperWorldIsYours);
		mListener = new MyListener();
		mListener.registerListener(this);
		mListener.doYourWork();
	}
	@Override
	public void onStateChange(boolean state) {

		if (state) {
			mTextView.setText("on");
        } else {
        	mTextView.setText("off");
        }
		
	}


}
