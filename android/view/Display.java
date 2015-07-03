/*    */ package android.view;
/*    */ 
/*    */ import android.util.DisplayMetrics;
/*    */ 
/*    */ public class Display
/*    */ {
/*    */   public static final int DEFAULT_DISPLAY = 0;
/*    */ 
/*    */   Display()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public int getDisplayId() { throw new RuntimeException("Stub!"); } 
/*    */   public native int getWidth();
/*    */ 
/*    */   public native int getHeight();
/*    */ 
/*  8 */   public int getRotation() { throw new RuntimeException("Stub!"); } 
/*    */   public native int getOrientation();
/*    */ 
/* 10 */   public int getPixelFormat() { throw new RuntimeException("Stub!"); } 
/* 11 */   public float getRefreshRate() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void getMetrics(DisplayMetrics outMetrics) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.Display
 * JD-Core Version:    0.6.0
 */