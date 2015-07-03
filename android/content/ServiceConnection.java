package android.content;

import android.os.IBinder;

public abstract interface ServiceConnection
{
  public abstract void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder);

  public abstract void onServiceDisconnected(ComponentName paramComponentName);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ServiceConnection
 * JD-Core Version:    0.6.0
 */