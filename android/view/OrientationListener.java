/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.hardware.SensorListener;
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class OrientationListener
/*    */   implements SensorListener
/*    */ {
/*    */   public static final int ORIENTATION_UNKNOWN = -1;
/*    */ 
/*    */   public OrientationListener(Context context)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public OrientationListener(Context context, int rate) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void enable() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void disable() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onAccuracyChanged(int sensor, int accuracy) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onSensorChanged(int sensor, float[] values) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract void onOrientationChanged(int paramInt);
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.OrientationListener
 * JD-Core Version:    0.6.0
 */