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

public class BignerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ColorDrawable colorDrawable = new ColorDrawable(
				Color.parseColor("#db7093"));
		getActionBar().setBackgroundDrawable(colorDrawable);

		ActionBar actionBar = getActionBar();

		actionBar.setTitle(Html.fromHtml("<small>Beginner...</SMALL>"));

		setContentView(R.layout.bigner);

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		final ImageView a = (ImageView) findViewById(R.id.imageView1);
		a.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				a.setImageResource(R.drawable.zipbmb1);
				Intent tutorial = new Intent(getApplicationContext(), Aa.class);

				

				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});

		//

		final ImageView b = (ImageView) findViewById(R.id.imageView2);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				b.setImageResource(R.drawable.usb_stealer1);
				Intent tutorial = new Intent(getApplicationContext(), Ab.class);


				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});

		//

		final ImageView c = (ImageView) findViewById(R.id.imageView3);
		c.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				c.setImageResource(R.drawable.patchtool1);
				Intent tutorial = new Intent(getApplicationContext(), Acc.class);

				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		// 

		final ImageView d = (ImageView) findViewById(R.id.imageView4);
		d.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				d.setImageResource(R.drawable.overloadmemory1);
				Intent tutorial = new Intent(getApplicationContext(), Ad.class);
				
				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		// 

		final ImageView e = (ImageView) findViewById(R.id.imageView5);
		e.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
			
				e.setImageResource(R.drawable.memorywipe1);
				Intent tutorial = new Intent(getApplicationContext(), Ae.class);

				startActivity(tutorial);
			
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		//

		final ImageView f = (ImageView) findViewById(R.id.imageView6);
		f.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				f.setImageResource(R.drawable.appflooder1);
				Intent tutorial = new Intent(getApplicationContext(), Af.class);

				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		// 

		final ImageView g = (ImageView) findViewById(R.id.imageView7);
		g.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				g.setImageResource(R.drawable.forkbomb1);
				Intent tutorial = new Intent(getApplicationContext(), Ag.class);

				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		// ////

		final ImageView h = (ImageView) findViewById(R.id.imageView8);
		h.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				h.setImageResource(R.drawable.foldrblst1);
				Intent tutorial = new Intent(getApplicationContext(), Ah.class);

				
				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		//

		final ImageView i = (ImageView) findViewById(R.id.imageView9);
		i.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				i.setImageResource(R.drawable.psing1);
				Intent tutorial = new Intent(getApplicationContext(), Ai.class);


				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});

		final ImageView l = (ImageView) findViewById(R.id.imageView21);
		l.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				l.setImageResource(R.drawable.rateintxt2);

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
		final ImageView m = (ImageView) findViewById(R.id.imageView23);
		m.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				m.setImageResource(R.drawable.next2);
				Intent tutorial = new Intent(getApplicationContext(),
						Skilled.class);
				
				startActivity(tutorial);
				

				overridePendingTransition(R.anim.wipeout, R.anim.wipein);
				finish();

			}
		});
	}

	@Override
	public void onBackPressed() {

		Intent strtpg = new Intent(getApplicationContext(),
				TutorialActivity.class);

		startActivity(strtpg);
		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		finish();

	}
}
