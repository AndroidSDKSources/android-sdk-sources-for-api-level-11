/*    */ package android.net;
/*    */ 
/*    */ public class ConnectivityManager
/*    */ {
/*    */   public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
/*    */   public static final String EXTRA_NETWORK_INFO = "networkInfo";
/*    */   public static final String EXTRA_IS_FAILOVER = "isFailover";
/*    */   public static final String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
/*    */   public static final String EXTRA_NO_CONNECTIVITY = "noConnectivity";
/*    */   public static final String EXTRA_REASON = "reason";
/*    */   public static final String EXTRA_EXTRA_INFO = "extraInfo";
/*    */   public static final String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";
/*    */   public static final int TYPE_MOBILE = 0;
/*    */   public static final int TYPE_WIFI = 1;
/*    */   public static final int TYPE_MOBILE_MMS = 2;
/*    */   public static final int TYPE_MOBILE_SUPL = 3;
/*    */   public static final int TYPE_MOBILE_DUN = 4;
/*    */   public static final int TYPE_MOBILE_HIPRI = 5;
/*    */   public static final int TYPE_WIMAX = 6;
/*    */   public static final int DEFAULT_NETWORK_PREFERENCE = 1;
/*    */ 
/*    */   ConnectivityManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static boolean isNetworkTypeValid(int networkType) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void setNetworkPreference(int preference) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getNetworkPreference() { throw new RuntimeException("Stub!"); } 
/*  8 */   public NetworkInfo getActiveNetworkInfo() { throw new RuntimeException("Stub!"); } 
/*  9 */   public NetworkInfo getNetworkInfo(int networkType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public NetworkInfo[] getAllNetworkInfo() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int startUsingNetworkFeature(int networkType, String feature) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int stopUsingNetworkFeature(int networkType, String feature) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean requestRouteToHost(int networkType, int hostAddress) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean getBackgroundDataSetting() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.ConnectivityManager
 * JD-Core Version:    0.6.0
 */