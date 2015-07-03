/*   */ package android.view;
/*   */ 
/*   */ import android.content.Context;
/*   */ 
/*   */ public abstract class OrientationEventListener
/*   */ {
/*   */   public static final int ORIENTATION_UNKNOWN = -1;
/*   */ 
/*   */   public OrientationEventListener(Context context)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public OrientationEventListener(Context context, int rate) { throw new RuntimeException("Stub!"); } 
/* 6 */   public void enable() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void disable() { throw new RuntimeException("Stub!"); } 
/* 8 */   public boolean canDetectOrientation() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void onOrientationChanged(int paramInt);
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.OrientationEventListener
 * JD-Core Version:    0.6.0
 */