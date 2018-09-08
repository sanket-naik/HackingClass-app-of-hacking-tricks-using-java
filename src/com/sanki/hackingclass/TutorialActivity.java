package com.sanki.hackingclass;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class TutorialActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	

		ColorDrawable colorDrawable = new ColorDrawable(
				Color.parseColor("#db7093"));
		getActionBar().setBackgroundDrawable(colorDrawable);

		ActionBar actionBar = getActionBar();

		actionBar.setTitle(Html.fromHtml("<small>So Lets Start</SMALL>"));

		setContentView(R.layout.activity_tutorial);

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		final ImageView a = (ImageView) findViewById(R.id.imageView2);
		
		a.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				a.setImageResource(R.drawable.begnr2);
				Toast.makeText(getApplicationContext(), "coooool",
						Toast.LENGTH_SHORT).show();

				Intent t = new Intent(getApplicationContext(),
						BignerActivity.class);

				
				startActivity(t);
				

				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
				

			}

		});

		final ImageView b = (ImageView) findViewById(R.id.imageView4);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				b.setImageResource(R.drawable.skilled2);
				Intent g = new Intent(getApplicationContext(), Skilled.class);

				
				startActivity(g);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();

			}

		});

		final ImageView c = (ImageView) findViewById(R.id.imageView6);
		c.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				c.setImageResource(R.drawable.expert2);
				Intent f = new Intent(getApplicationContext(), Expert.class);

				
				startActivity(f);
			
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}

		});

	}

	@Override
	public void onBackPressed() {

		Intent strtpg = new Intent(getApplicationContext(), MainActivity.class);

		

		startActivity(strtpg);
		

		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		finish();
	}
}
