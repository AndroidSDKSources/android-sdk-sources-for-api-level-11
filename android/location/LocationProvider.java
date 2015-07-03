/*   */ package android.location;
/*   */ 
/*   */ public abstract class LocationProvider
/*   */ {
/*   */   public static final int OUT_OF_SERVICE = 0;
/*   */   public static final int TEMPORARILY_UNAVAILABLE = 1;
/*   */   public static final int AVAILABLE = 2;
/*   */ 
/*   */   LocationProvider()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean meetsCriteria(Criteria criteria) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract boolean requiresNetwork();
/*   */ 
/*   */   public abstract boolean requiresSatellite();
/*   */ 
/*   */   public abstract boolean requiresCell();
/*   */ 
/*   */   public abstract boolean hasMonetaryCost();
/*   */ 
/*   */   public abstract boolean supportsAltitude();
/*   */ 
/*   */   public abstract boolean supportsSpeed();
/*   */ 
/*   */   public abstract boolean supportsBearing();
/*   */ 
/*   */   public abstract int getPowerRequirement();
/*   */ 
/*   */   public abstract int getAccuracy();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.location.LocationProvider
 * JD-Core Version:    0.6.0
 */