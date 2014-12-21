package apps.arw.downonthefarm;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;



	public class Farm2 extends Activity implements OnClickListener{ 
		
		
		MediaPlayer dog;	
		MediaPlayer cat;
		MediaPlayer owl;
		MediaPlayer rooster;
		
		
		ImageButton dogpic;
		ImageButton catpic;
		ImageButton roosterpic;
		ImageButton owlpic;
		
		Button page1;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.farm2);
			
					
			dogpic = (ImageButton) findViewById(R.id.dog);
			dogpic.setOnClickListener(this);
			catpic = (ImageButton) findViewById(R.id.cat);
			catpic.setOnClickListener(this);
			roosterpic = (ImageButton) findViewById(R.id.rooster);
			roosterpic.setOnClickListener(this);
			owlpic = (ImageButton) findViewById(R.id.owl);
			owlpic.setOnClickListener(this);
			page1 = (Button) findViewById(R.id.page1);
			page1.setOnClickListener(this);
				 
		
		}
		
		
		
		
		public void onClick(View v) {
			switch (v.getId()) {
			
			
			case R.id.dog:
				dog = MediaPlayer.create(this, R.raw.dog);
				dog.start();
				break;
			case R.id.cat:
				cat = MediaPlayer.create(this, R.raw.cat2);
				cat.start();
				break;
			case R.id.rooster:
				rooster = MediaPlayer.create(this, R.raw.rooster);
				rooster.start();
				break;
			case R.id.owl:
				owl = MediaPlayer.create(this, R.raw.owl);
				owl.start();
				break;
						
			case R.id.page1:
				Intent intent = new Intent(this, MainActivity.class);
				startActivity(intent);
				break;
			
			default:
				break;
			}
			
			    		
			  
			
			
		}

	

}
