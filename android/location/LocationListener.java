package android.location;

import android.os.Bundle;

public abstract interface LocationListener
{
  public abstract void onLocationChanged(Location paramLocation);

  public abstract void onStatusChanged(String paramString, int paramInt, Bundle paramBundle);

  public abstract void onProviderEnabled(String paramString);

  public abstract void onProviderDisabled(String paramString);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.location.LocationListener
 * JD-Core Version:    0.6.0
 */