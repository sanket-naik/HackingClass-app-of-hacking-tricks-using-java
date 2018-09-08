package com.sanki.hackingclass;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Acc extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ColorDrawable colorDrawable = new ColorDrawable(
				Color.parseColor("#4b4b4b"));
		getActionBar().setBackgroundDrawable(colorDrawable);
		ActionBar actionBar = getActionBar();
		actionBar.setTitle(Html.fromHtml("<small>Patch Tool</SMALL>"));

		setContentView(R.layout.activity_acc);

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		final ImageView a = (ImageView) findViewById(R.id.imageView3);
		a.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				a.setImageResource(R.drawable.previous2);
				Intent tutorial = new Intent(getApplicationContext(), Ab.class);
				
				startActivity(tutorial);
				
				overridePendingTransition(R.anim.slidein, R.anim.slideout);
				finish();
			}
		});
		final ImageView b = (ImageView) findViewById(R.id.imageView5);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
			
				b.setImageResource(R.drawable.rateintxt2);

				final String appPackageName = "com.sanki.hackingclass";
				try {
					startActivity(new Intent(Intent.ACTION_VIEW, Uri
							.parse("market://details?id=" + appPackageName)));

				} catch (android.content.ActivityNotFoundException anfe) {
					startActivity(new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://play.google.com/store/apps/details?id="
									+ appPackageName)));
				}
			}
		});
		final ImageView c = (ImageView) findViewById(R.id.imageView7);
		c.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				c.setImageResource(R.drawable.next2);
				Intent tutorial = new Intent(getApplicationContext(), Ad.class);
				
				startActivity(tutorial);
			
				overridePendingTransition(R.anim.wipeout, R.anim.wipein);
				finish();

			}
		});
	}

	@Override
	public void onBackPressed() {

		Intent strtpg = new Intent(getApplicationContext(),
				BignerActivity.class);
		
		
		startActivity(strtpg);
		
		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		finish();
	}
}
