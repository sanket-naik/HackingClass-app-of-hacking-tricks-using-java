package com.sanki.hackingclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Flash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_flash);

		
		Thread timThread = new Thread() {

			@Override
			public void run() {
				try {
					sleep(3000);

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					Intent abc = new Intent(Flash.this, MainActivity.class);
					startActivity(abc);

				}

			
			}

		};
		timThread.start();

	}

	@Override
	protected void onPause() {
		super.onPause();
		finish();

	}

}
