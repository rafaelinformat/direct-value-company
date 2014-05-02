package br.com.direct.velue.company.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import br.com.direct.velue.company.R;

public class DirectValueAppSplashScreen extends Activity {
	
	private static int SPLASH_TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_direct_value_splash_screen);
		
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(DirectValueAppSplashScreen.this, DirectValueApp.class);
				startActivity(intent);
				
			}
		}, SPLASH_TIME_OUT);
	}

	
}
