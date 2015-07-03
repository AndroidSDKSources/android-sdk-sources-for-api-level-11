/*    */ package android.location;
/*    */ 
/*    */ public final class GpsStatus
/*    */ {
/*    */   public static final int GPS_EVENT_STARTED = 1;
/*    */   public static final int GPS_EVENT_STOPPED = 2;
/*    */   public static final int GPS_EVENT_FIRST_FIX = 3;
/*    */   public static final int GPS_EVENT_SATELLITE_STATUS = 4;
/*    */ 
/*    */   GpsStatus()
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public int getTimeToFirstFix() { throw new RuntimeException("Stub!"); } 
/* 14 */   public Iterable<GpsSatellite> getSatellites() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getMaxSatellites() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface NmeaListener
/*    */   {
/*    */     public abstract void onNmeaReceived(long paramLong, String paramString);
/*    */   }
/*    */ 
/*    */   public static abstract interface Listener
/*    */   {
/*    */     public abstract void onGpsStatusChanged(int paramInt);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.location.GpsStatus
 * JD-Core Version:    0.6.0
 */