package chandra.devershi.pablohss;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by devershi on 9/11/17.
 */

public class MyFireBaseInstanceIdService extends FirebaseInstanceIdService
{
    private static final String REG_TOKEN = "REG_TOKEN";
    @Override
    public void onTokenRefresh()
    {
        String recent_token = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN, recent_token);
    }
}
