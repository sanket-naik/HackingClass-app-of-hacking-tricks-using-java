package com.sanki.hackingclass;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		ColorDrawable colorDrawable = new ColorDrawable(
				Color.parseColor("#000000"));
		getActionBar().setBackgroundDrawable(colorDrawable);

		ActionBar actionBar = getActionBar();

		actionBar.setTitle(Html
				.fromHtml("<small>Welcome to Hacking Tutorial</SMALL>"));

		setContentView(R.layout.activity_main);

		final ImageView a = (ImageView) findViewById(R.id.imageView1);
		a.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				a.setImageResource(R.drawable.tutorial2);

				Toast.makeText(getApplicationContext(), "Start Tutorial",
						Toast.LENGTH_SHORT).show();

				Intent tutorial = new Intent(getApplicationContext(),
						TutorialActivity.class);
				

				startActivity(tutorial);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}

		});
		final ImageView b = (ImageView) findViewById(R.id.imageView2);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				b.setImageResource(R.drawable.hack2);
				Toast.makeText(getApplicationContext(), "What is Hacking?",
						Toast.LENGTH_SHORT).show();

				Intent hack = new Intent(getApplicationContext(), Hacking.class);
				
				startActivity(hack);
			
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		final ImageView c = (ImageView) findViewById(R.id.imageView3);
		c.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				c.setImageResource(R.drawable.rules2);
				Toast.makeText(getApplicationContext(), "Rules Of Hacking",
						Toast.LENGTH_SHORT).show();
				Intent rules = new Intent(getApplicationContext(), Rules.class);
				
				startActivity(rules);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		final ImageView d = (ImageView) findViewById(R.id.imageView4);
		d.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				d.setImageResource(R.drawable.types2);
				Toast.makeText(getApplicationContext(), "Types Of Hacker",
						Toast.LENGTH_SHORT).show();
				Intent types = new Intent(getApplicationContext(), Types.class);
				
				startActivity(types);
				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				finish();
			}
		});
		final ImageView e = (ImageView) findViewById(R.id.imageView5);
		e.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				
				Toast.makeText(getApplicationContext(), "About",
						Toast.LENGTH_SHORT).show();
				final Dialog b1 = new Dialog(context);
				b1.setContentView(R.layout.about);
				b1.setTitle("About");
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);

				final ImageView dilobtn = (ImageView) b1
						.findViewById(R.id.imageView25);
				dilobtn.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						

						Intent strtpg = new Intent(getApplicationContext(),
								MainActivity.class);
						
						startActivity(strtpg);
						
						overridePendingTransition(R.anim.fadein, R.anim.fadeout);
						finish();
					}
				});
				b1.show();

			}
		});
		final ImageView f = (ImageView) findViewById(R.id.imageView6);
		f.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Toast.makeText(getApplicationContext(),
						"Rate Me if you are satisfied", Toast.LENGTH_SHORT)
						.show();

			// ////
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

				
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);
			}

		});

	}

	@Override
	public void onBackPressed() {

		overridePendingTransition(R.anim.fadein, R.anim.fadeout);

		AlertDialog ab = new AlertDialog.Builder(this).create();
		ab.setTitle("Quit?");
		ab.setMessage("Are you sure want to quit");
		ab.setButton("Yes", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				finish();
			}
		});

		ab.setButton2("no", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				Intent strtpg = new Intent(getApplicationContext(),
						MainActivity.class);

				strtpg.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
						| Intent.FLAG_ACTIVITY_CLEAR_TASK);
				startActivity(strtpg);
				overridePendingTransition(R.anim.fadein, R.anim.fadeout);

			}
		});
		ab.show();
	}
}
