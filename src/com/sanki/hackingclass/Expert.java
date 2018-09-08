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

public class Expert extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ColorDrawable colorDrawable = new ColorDrawable(
				Color.parseColor("#db7093"));
		getActionBar().setBackgroundDrawable(colorDrawable);

		ActionBar actionBar = getActionBar();

		actionBar.setTitle(Html.fromHtml("<small>Expert...</SMALL>"));

		setContentView(R.layout.activity_expert);

		
		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		final ImageView a = (ImageView) findViewById(R.id.imageView1);
		a.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				a.setImageResource(R.drawable.kali1);
				Intent tutorial = new Intent(getApplicationContext(), Ca.class);
				
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
			
				b.setImageResource(R.drawable.backtrack1);
				Intent tutorial = new Intent(getApplicationContext(), Cb.class);
			
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
				
				c.setImageResource(R.drawable.beingpro1);
				Intent tutorial = new Intent(getApplicationContext(), Cc.class);
				
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
				
				d.setImageResource(R.drawable.hydra1);
				Intent tutorial = new Intent(getApplicationContext(), Cd.class);
				
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
				
				e.setImageResource(R.drawable.metaspoit1);
				Intent tutorial = new Intent(getApplicationContext(), Ce.class);
				
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
				
				f.setImageResource(R.drawable.comd_crsh1);
				Intent tutorial = new Intent(getApplicationContext(), Cf.class);
				
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
				
				g.setImageResource(R.drawable.explor_nmap1);
				Intent tutorial = new Intent(getApplicationContext(), Cg.class);
			
				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		// 

		final ImageView h = (ImageView) findViewById(R.id.imageView8);
		h.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
			
				h.setImageResource(R.drawable.aurora1);
				Intent tutorial = new Intent(getApplicationContext(), Ch.class);
				
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
				
				i.setImageResource(R.drawable.info_gethr1);
				Intent tutorial = new Intent(getApplicationContext(), Ci.class);
				
				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		//

		final ImageView j = (ImageView) findViewById(R.id.imageView10);
		j.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				j.setImageResource(R.drawable.remote_keylogr1);
				Intent tutorial = new Intent(getApplicationContext(), Cj.class);
				
				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		 ///

		final ImageView k = (ImageView) findViewById(R.id.imageView11);
		k.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				k.setImageResource(R.drawable.heartbleed1);
				Intent tutorial = new Intent(getApplicationContext(), Ck.class);
				
				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		// 

		final ImageView l = (ImageView) findViewById(R.id.imageView12);
		l.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				l.setImageResource(R.drawable.disablng_antivirus1);
				Intent tutorial = new Intent(getApplicationContext(), Cl.class);
				
				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();

			}
		});

		final ImageView n = (ImageView) findViewById(R.id.imageView27);
		n.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				n.setImageResource(R.drawable.previous2);
				Intent tutorial = new Intent(getApplicationContext(),
						Skilled.class);
			
				startActivity(tutorial);
				

				overridePendingTransition(R.anim.slidein, R.anim.slideout);
				finish();
			}
		});
		final ImageView o = (ImageView) findViewById(R.id.imageView29);
		o.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				o.setImageResource(R.drawable.rateintxt2);

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
