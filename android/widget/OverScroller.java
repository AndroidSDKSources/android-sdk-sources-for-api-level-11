/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.animation.Interpolator;
/*    */ 
/*    */ public class OverScroller
/*    */ {
/*    */   public OverScroller(Context context)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public OverScroller(Context context, Interpolator interpolator) { throw new RuntimeException("Stub!"); } 
/*  6 */   public OverScroller(Context context, Interpolator interpolator, float bounceCoefficientX, float bounceCoefficientY) { throw new RuntimeException("Stub!"); } 
/*  7 */   public OverScroller(Context context, Interpolator interpolator, float bounceCoefficientX, float bounceCoefficientY, boolean flywheel) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final void setFriction(float friction) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final boolean isFinished() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void forceFinished(boolean finished) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int getCurrX() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final int getCurrY() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final int getStartX() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final int getStartY() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final int getFinalX() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final int getFinalY() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean computeScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void startScroll(int startX, int startY, int dx, int dy) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void startScroll(int startX, int startY, int dx, int dy, int duration) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean springBack(int startX, int startY, int minX, int maxX, int minY, int maxY) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY, int overX, int overY) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void notifyHorizontalEdgeReached(int startX, int finalX, int overX) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void notifyVerticalEdgeReached(int startY, int finalY, int overY) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean isOverScrolled() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void abortAnimation() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.OverScroller
 * JD-Core Version:    0.6.0
 */