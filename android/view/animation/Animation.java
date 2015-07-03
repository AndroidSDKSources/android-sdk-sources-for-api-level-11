/*    */ package android.view.animation;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public abstract class Animation
/*    */   implements Cloneable
/*    */ {
/*    */   public static final int INFINITE = -1;
/*    */   public static final int RESTART = 1;
/*    */   public static final int REVERSE = 2;
/*    */   public static final int START_ON_FIRST_FRAME = -1;
/*    */   public static final int ABSOLUTE = 0;
/*    */   public static final int RELATIVE_TO_SELF = 1;
/*    */   public static final int RELATIVE_TO_PARENT = 2;
/*    */   public static final int ZORDER_NORMAL = 0;
/*    */   public static final int ZORDER_TOP = 1;
/*    */   public static final int ZORDER_BOTTOM = -1;
/*    */ 
/*    */   public Animation()
/*    */   {
/* 17 */     throw new RuntimeException("Stub!"); } 
/* 18 */   public Animation(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected Animation clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void reset() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void cancel() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isInitialized() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void initialize(int width, int height, int parentWidth, int parentHeight) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setInterpolator(Context context, int resID) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setInterpolator(Interpolator i) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setStartOffset(long startOffset) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setDuration(long durationMillis) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void restrictDuration(long durationMillis) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void scaleCurrentDuration(float scale) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setStartTime(long startTimeMillis) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void start() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void startNow() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setRepeatMode(int repeatMode) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setRepeatCount(int repeatCount) { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean isFillEnabled() { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setFillEnabled(boolean fillEnabled) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setFillBefore(boolean fillBefore) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setFillAfter(boolean fillAfter) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setZAdjustment(int zAdjustment) { throw new RuntimeException("Stub!"); } 
/* 40 */   protected float getScaleFactor() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setDetachWallpaper(boolean detachWallpaper) { throw new RuntimeException("Stub!"); } 
/* 42 */   public Interpolator getInterpolator() { throw new RuntimeException("Stub!"); } 
/* 43 */   public long getStartTime() { throw new RuntimeException("Stub!"); } 
/* 44 */   public long getDuration() { throw new RuntimeException("Stub!"); } 
/* 45 */   public long getStartOffset() { throw new RuntimeException("Stub!"); } 
/* 46 */   public int getRepeatMode() { throw new RuntimeException("Stub!"); } 
/* 47 */   public int getRepeatCount() { throw new RuntimeException("Stub!"); } 
/* 48 */   public boolean getFillBefore() { throw new RuntimeException("Stub!"); } 
/* 49 */   public boolean getFillAfter() { throw new RuntimeException("Stub!"); } 
/* 50 */   public int getZAdjustment() { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean getDetachWallpaper() { throw new RuntimeException("Stub!"); } 
/* 52 */   public boolean willChangeTransformationMatrix() { throw new RuntimeException("Stub!"); } 
/* 53 */   public boolean willChangeBounds() { throw new RuntimeException("Stub!"); } 
/* 54 */   public void setAnimationListener(AnimationListener listener) { throw new RuntimeException("Stub!"); } 
/* 55 */   protected void ensureInterpolator() { throw new RuntimeException("Stub!"); } 
/* 56 */   public long computeDurationHint() { throw new RuntimeException("Stub!"); } 
/* 57 */   public boolean getTransformation(long currentTime, Transformation outTransformation) { throw new RuntimeException("Stub!"); } 
/* 58 */   public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) { throw new RuntimeException("Stub!"); } 
/* 59 */   public boolean hasStarted() { throw new RuntimeException("Stub!"); } 
/* 60 */   public boolean hasEnded() { throw new RuntimeException("Stub!"); } 
/* 61 */   protected void applyTransformation(float interpolatedTime, Transformation t) { throw new RuntimeException("Stub!"); } 
/* 62 */   protected float resolveSize(int type, float value, int size, int parentSize) { throw new RuntimeException("Stub!"); } 
/* 63 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface AnimationListener
/*    */   {
/*    */     public abstract void onAnimationStart(Animation paramAnimation);
/*    */ 
/*    */     public abstract void onAnimationEnd(Animation paramAnimation);
/*    */ 
/*    */     public abstract void onAnimationRepeat(Animation paramAnimation);
/*    */   }
/*    */ 
/*    */   protected static class Description
/*    */   {
/*    */     public int type;
/*    */     public float value;
/*    */ 
/*    */     protected Description()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.animation.Animation
 * JD-Core Version:    0.6.0
 */