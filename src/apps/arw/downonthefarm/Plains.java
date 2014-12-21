package apps.arw.downonthefarm;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;



public class Plains extends Activity implements OnClickListener {

		private GestureDetector gestureDetector;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
		setContentView(R.layout.activity_plains);
		
		
		 gestureDetector = new GestureDetector(
                 new SwipeGestureDetector());
	}

	
	@Override
	  public boolean onTouchEvent(MotionEvent event) {
	    if (gestureDetector.onTouchEvent(event)) {
	      return true;
	    }
	    return super.onTouchEvent(event);
	  }	

	  private void onLeftSwipe() {
		  Intent launchactivity= new Intent(Plains.this,Jungle.class);                               
	    	 startActivity(launchactivity);
	  }

	  private void onRightSwipe() {
		  Intent launchactivity= new Intent(Plains.this,MainActivity.class);                               
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
	        	Plains.this.onLeftSwipe();

	        // Right swipe
	        } else if (-diff > SWIPE_MIN_DISTANCE
	        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
	        	Plains.this.onRightSwipe();
	        }
	      } catch (Exception e) {
	        Log.e("YourActivity", "Error on gestures");
	      }
	      return false;
	    }
	  }
	
	
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
