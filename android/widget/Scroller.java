/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.animation.Interpolator;
/*    */ 
/*    */ public class Scroller
/*    */ {
/*    */   public Scroller(Context context)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Scroller(Context context, Interpolator interpolator) { throw new RuntimeException("Stub!"); } 
/*  6 */   public Scroller(Context context, Interpolator interpolator, boolean flywheel) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final void setFriction(float friction) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final boolean isFinished() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final void forceFinished(boolean finished) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final int getDuration() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int getCurrX() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final int getCurrY() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final int getStartX() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final int getStartY() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final int getFinalX() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final int getFinalY() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean computeScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void startScroll(int startX, int startY, int dx, int dy) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void startScroll(int startX, int startY, int dx, int dy, int duration) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void abortAnimation() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void extendDuration(int extend) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int timePassed() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setFinalX(int newX) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setFinalY(int newY) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.Scroller
 * JD-Core Version:    0.6.0
 */