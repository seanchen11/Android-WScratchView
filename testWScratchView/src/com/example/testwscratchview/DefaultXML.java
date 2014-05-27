package com.example.testwscratchview;

import com.winsontan520.WScratchView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class DefaultXML extends Activity {
	private WScratchView scratchView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.default_xml);

		scratchView = (WScratchView) findViewById(R.id.scratch_view);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClickHandler(View view){
		switch(view.getId()){
		case R.id.reset_button:
			scratchView.resetView();
			break;
		}
	}
}
