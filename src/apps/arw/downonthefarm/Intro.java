package apps.arw.downonthefarm;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Intro extends Activity  {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intro);


		MediaPlayer hi = MediaPlayer.create(this, R.raw.welcome);
		hi.start();

	}
	//this starts the main game
	public void begin(View view) { 
		Intent launchactivity= new Intent(this,MainActivity.class);                               
		startActivity(launchactivity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intro, menu);
		return true;
	}



}
