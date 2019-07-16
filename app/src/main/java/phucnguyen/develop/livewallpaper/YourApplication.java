package phucnguyen.develop.livewallpaper;

import android.app.Application;
import android.content.Context;

public class YourApplication extends Application {
    private static Context mAppContext;

    public void onCreate()
    {
        super.onCreate();
        YourApplication.mAppContext = getApplicationContext();
    }

    public static Context getContext()
    {
        return mAppContext;
    }
}
