import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Sreeraj M on 10/30/2016.
 */
public class UserSession {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    Context context;

    public  UserSession(Context ctx){
        this.context = ctx;
        preferences = context.getSharedPreferences("myapp",Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public void setLoggedIn(boolean loggedIn){
        editor.putBoolean("loggedInmode",loggedIn);
        editor.commit();
    }

    public boolean loggedIn(){
        return preferences.getBoolean("loggedInmode",false);

    }
}