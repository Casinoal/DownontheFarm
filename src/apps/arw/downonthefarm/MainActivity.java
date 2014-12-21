package apps.arw.downonthefarm;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends Activity implements OnClickListener{ 
	
		
	MediaPlayer cow;	
	MediaPlayer horse;
	MediaPlayer chick;
	MediaPlayer pig;
	MediaPlayer welcome;
	MediaPlayer duck;
	MediaPlayer sheep;
	ImageButton cowpic;
	ImageButton horsepic;
	ImageButton pigpic;
	ImageButton chickpic;
	ImageButton sheeppic;
	ImageButton duckpic;
	
	Button page2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
				
		cowpic = (ImageButton) findViewById(R.id.cow);
		cowpic.setOnClickListener(this);
		horsepic = (ImageButton) findViewById(R.id.horse);
		horsepic.setOnClickListener(this);
		pigpic = (ImageButton) findViewById(R.id.pig);
		pigpic.setOnClickListener(this);
		chickpic = (ImageButton) findViewById(R.id.chicken);
		chickpic.setOnClickListener(this);
		sheeppic = (ImageButton) findViewById(R.id.sheep);
		sheeppic.setOnClickListener(this);
		duckpic = (ImageButton) findViewById(R.id.duck);
		duckpic.setOnClickListener(this);
		page2 = (Button) findViewById(R.id.page2);
		page2.setOnClickListener(this);
	 
	
	}
	
	
	
	
	public void onClick(View v) {
		switch (v.getId()) {
		
		
		case R.id.cow:
			cow = MediaPlayer.create(this, R.raw.cow);
			cow.start();
			break;
		case R.id.horse:
			horse = MediaPlayer.create(this, R.raw.horse);
			horse.start();
			break;
		case R.id.pig:
			pig = MediaPlayer.create(this, R.raw.pig);
			pig.start();
			break;
		case R.id.chicken:
			chick = MediaPlayer.create(this, R.raw.chicken1);
			chick.start();
			break;
		case R.id.sheep:
			sheep = MediaPlayer.create(this, R.raw.sheep);
			sheep.start();
			break;
		case R.id.duck:
			duck = MediaPlayer.create(this, R.raw.duck);
			duck.start();
			break;
		
		case R.id.page2:
			Intent intent = new Intent(this, Farm2.class);
			startActivity(intent);
			break;
		default:
			break;
		}
		
		    		
		  
		
		
	}

}


