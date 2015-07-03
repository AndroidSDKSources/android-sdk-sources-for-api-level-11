/*    */ package android.location;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.os.Bundle;
/*    */ import android.os.Looper;
/*    */ import java.util.List;
/*    */ 
/*    */ public class LocationManager
/*    */ {
/*    */   public static final String NETWORK_PROVIDER = "network";
/*    */   public static final String GPS_PROVIDER = "gps";
/*    */   public static final String PASSIVE_PROVIDER = "passive";
/*    */   public static final String KEY_PROXIMITY_ENTERING = "entering";
/*    */   public static final String KEY_STATUS_CHANGED = "status";
/*    */   public static final String KEY_PROVIDER_ENABLED = "providerEnabled";
/*    */   public static final String KEY_LOCATION_CHANGED = "location";
/*    */   public static final String PROVIDERS_CHANGED_ACTION = "android.location.PROVIDERS_CHANGED";
/*    */ 
/*    */   LocationManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public List<String> getAllProviders() { throw new RuntimeException("Stub!"); } 
/*  6 */   public List<String> getProviders(boolean enabledOnly) { throw new RuntimeException("Stub!"); } 
/*  7 */   public LocationProvider getProvider(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public List<String> getProviders(Criteria criteria, boolean enabledOnly) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getBestProvider(Criteria criteria, boolean enabledOnly) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void requestLocationUpdates(String provider, long minTime, float minDistance, LocationListener listener) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void requestLocationUpdates(String provider, long minTime, float minDistance, LocationListener listener, Looper looper) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void requestLocationUpdates(long minTime, float minDistance, Criteria criteria, LocationListener listener, Looper looper) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void requestLocationUpdates(String provider, long minTime, float minDistance, PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void requestLocationUpdates(long minTime, float minDistance, Criteria criteria, PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void requestSingleUpdate(String provider, LocationListener listener, Looper looper) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void requestSingleUpdate(Criteria criteria, LocationListener listener, Looper looper) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void requestSingleUpdate(String provider, PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void requestSingleUpdate(Criteria criteria, PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void removeUpdates(LocationListener listener) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void removeUpdates(PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void addProximityAlert(double latitude, double longitude, float radius, long expiration, PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void removeProximityAlert(PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isProviderEnabled(String provider) { throw new RuntimeException("Stub!"); } 
/* 24 */   public Location getLastKnownLocation(String provider) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void addTestProvider(String name, boolean requiresNetwork, boolean requiresSatellite, boolean requiresCell, boolean hasMonetaryCost, boolean supportsAltitude, boolean supportsSpeed, boolean supportsBearing, int powerRequirement, int accuracy) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void removeTestProvider(String provider) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setTestProviderLocation(String provider, Location loc) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void clearTestProviderLocation(String provider) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setTestProviderEnabled(String provider, boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void clearTestProviderEnabled(String provider) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setTestProviderStatus(String provider, int status, Bundle extras, long updateTime) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void clearTestProviderStatus(String provider) { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean addGpsStatusListener(GpsStatus.Listener listener) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void removeGpsStatusListener(GpsStatus.Listener listener) { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean addNmeaListener(GpsStatus.NmeaListener listener) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void removeNmeaListener(GpsStatus.NmeaListener listener) { throw new RuntimeException("Stub!"); } 
/* 37 */   public GpsStatus getGpsStatus(GpsStatus status) { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean sendExtraCommand(String provider, String command, Bundle extras) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.location.LocationManager
 * JD-Core Version:    0.6.0
 */