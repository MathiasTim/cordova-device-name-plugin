package com.mway.devicename;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class provides the model and manufacturer
 */
public class DeviceName extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getDeviceName")) {
            this.getDeviceName(callbackContext);
            return true;
        }
        return false;
    }

    private void getDeviceName(CallbackContext callbackContext) {
        String model = android.os.Build.MODEL;
        String manufacturer = android.os.Build.MANUFACTURER;
        callbackContext.success(model + " " + manufacturer);
    }
}
