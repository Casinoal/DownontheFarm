package apps.arw.downonthefarm;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.MailTo;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Jungle extends Activity implements OnClickListener {

	private GestureDetector gestureDetector;
	
	ImageButton cow;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
		setContentView(R.layout.activity_jungle);
	
		 gestureDetector = new GestureDetector(
                 new SwipeGestureDetector());
		 
		cow = (ImageButton) findViewById(R.id.cow);
		cow.setOnClickListener(this);
	
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jungle, menu);
		return true;
		
		
	}

	
	@Override
	  public boolean onTouchEvent(MotionEvent event) {
	    if (gestureDetector.onTouchEvent(event)) {
	      return true;
	    }
	    return super.onTouchEvent(event);
	  }

	  private void onLeftSwipe() {
		  Intent launchactivtiy = this.getIntent();
	       launchactivtiy.setClass(this, MainActivity.class);
	       startActivity(launchactivtiy);
		  
		  
		 
	  }

	  private void onRightSwipe() {
		  Intent launchactivity= new Intent(Jungle.this,Plains.class);                               
	    	 startActivity(launchactivity);
	  }


	// Private class for gestures
	  private class SwipeGestureDetector
	          extends SimpleOnGestureListener {
	    // Swipe properties, you can change it to make the swipe
	    // longer or shorter and speed
	    private static final int SWIPE_MIN_DISTANCE = 120;
	    private static final int SWIPE_MAX_OFF_PATH = 200;
	    private static final int SWIPE_THRESHOLD_VELOCITY = 200;

	    @Override
	    public boolean onFling(MotionEvent e1, MotionEvent e2,
	                         float velocityX, float velocityY) {
	      try {
	        float diffAbs = Math.abs(e1.getY() - e2.getY());
	        float diff = e1.getX() - e2.getX();

	        if (diffAbs > SWIPE_MAX_OFF_PATH)
	          return false;
	       
	        // Left swipe
	        if (diff > SWIPE_MIN_DISTANCE
	        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
	        	Jungle.this.onLeftSwipe();

	        // Right swipe
	        } else if (-diff > SWIPE_MIN_DISTANCE
	        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
	        	Jungle.this.onRightSwipe();
	        }
	      } catch (Exception e) {
	        Log.e("YourActivity", "Error on gestures");
	      }
	      return false;
	    }
	  }
	@Override
		
		public void onClick(View v) {
			MediaPlayer cownoise;
			switch (v.getId()) {

			
			case R.id.cow:
				cownoise = MediaPlayer.create(this, R.raw.duck);
				cownoise.start();
				break;
			
			default:
				break;
			}
	}

}
