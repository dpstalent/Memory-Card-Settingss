package your.gpsD.namespace;

import org.apache.cordova.DroidGap;
import android.os.Bundle;
import android.content.Intent;
public class GPSDetectorActivity extends DroidGap {
    /** Called when the activity is first created. */
	//public StartScreen mc;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  super.init();
        
        //mc = new StartScreen();
       // appView.addJavascriptInterface(mc, "MyCls");
        super.loadUrl("file:///android_asset/www/index.html");
        

      
     
       
       
    }
   
	
}
