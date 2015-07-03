/*    */ package android.hardware;
/*    */ 
/*    */ public class Sensor
/*    */ {
/*    */   public static final int TYPE_ACCELEROMETER = 1;
/*    */   public static final int TYPE_MAGNETIC_FIELD = 2;
/*    */   public static final int TYPE_ORIENTATION = 3;
/*    */   public static final int TYPE_GYROSCOPE = 4;
/*    */   public static final int TYPE_LIGHT = 5;
/*    */   public static final int TYPE_PRESSURE = 6;
/*    */   public static final int TYPE_TEMPERATURE = 7;
/*    */   public static final int TYPE_PROXIMITY = 8;
/*    */   public static final int TYPE_GRAVITY = 9;
/*    */   public static final int TYPE_LINEAR_ACCELERATION = 10;
/*    */   public static final int TYPE_ROTATION_VECTOR = 11;
/*    */   public static final int TYPE_ALL = -1;
/*    */ 
/*    */   Sensor()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  6 */   public String getVendor() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getType() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getVersion() { throw new RuntimeException("Stub!"); } 
/*  9 */   public float getMaximumRange() { throw new RuntimeException("Stub!"); } 
/* 10 */   public float getResolution() { throw new RuntimeException("Stub!"); } 
/* 11 */   public float getPower() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getMinDelay() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.hardware.Sensor
 * JD-Core Version:    0.6.0
 */