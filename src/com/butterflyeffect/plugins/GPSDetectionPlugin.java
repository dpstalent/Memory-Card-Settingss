package com.butterflyeffect.plugins;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.apache.cordova.api.PluginResult.Status;
import org.json.JSONArray;

import android.content.Intent;
import android.location.LocationManager;
import android.provider.Settings;

public class GPSDetectionPlugin extends CordovaPlugin {

	@Override
    public boolean execute(String action, final JSONArray args, CallbackContext callbackContext) {
    	
    	PluginResult result = null;
        boolean gpsEnabled = false;
        String GPSDetectionAction = "gpsDetection";
        
        if (action.equals(GPSDetectionAction)) {
        	android.content.ContentResolver contentResolver = cordova.getActivity().getApplicationContext().getContentResolver();
        	gpsEnabled = Settings.Secure.isLocationProviderEnabled(contentResolver, LocationManager.GPS_PROVIDER);
       // cordova.startActivityForResult(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS), 0);
        cordova.startActivityForResult(null,new Intent(android.provider.Settings.ACTION_MEMORY_CARD_SETTINGS), 0);
       // cordova.startActivityForResult(null,new Intent(android.provider.Settings.ACTION_DATE_SETTINGS), 0);
        	result = new PluginResult(Status.OK, gpsEnabled);
        }
        else {
            result = new PluginResult(Status.INVALID_ACTION);
        }
        
        callbackContext.sendPluginResult(result);
        
        return true;
    }
}