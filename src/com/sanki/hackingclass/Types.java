package com.sanki.hackingclass;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Types extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ColorDrawable colorDrawable = new ColorDrawable(
				Color.parseColor("#4b4b4b"));
		getActionBar().setBackgroundDrawable(colorDrawable);
		ActionBar actionBar = getActionBar();
		actionBar.setTitle(Html.fromHtml("<small>Types</SMALL>"));

		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		setContentView(R.layout.activity_types);

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
	}

	@Override
	public void onBackPressed() {

		Intent strtpg = new Intent(getApplicationContext(), MainActivity.class);
		
		startActivity(strtpg);
		
		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		finish();

	}
}
