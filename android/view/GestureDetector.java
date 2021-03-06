/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Handler;
/*    */ 
/*    */ public class GestureDetector
/*    */ {
/*    */   public GestureDetector(OnGestureListener listener, Handler handler)
/*    */   {
/* 33 */     throw new RuntimeException("Stub!"); } 
/* 34 */   public GestureDetector(OnGestureListener listener) { throw new RuntimeException("Stub!"); } 
/* 35 */   public GestureDetector(Context context, OnGestureListener listener) { throw new RuntimeException("Stub!"); } 
/* 36 */   public GestureDetector(Context context, OnGestureListener listener, Handler handler) { throw new RuntimeException("Stub!"); } 
/* 37 */   public GestureDetector(Context context, OnGestureListener listener, Handler handler, boolean ignoreMultitouch) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setIsLongpressEnabled(boolean isLongpressEnabled) { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean isLongpressEnabled() { throw new RuntimeException("Stub!"); } 
/* 41 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class SimpleOnGestureListener
/*    */     implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener
/*    */   {
/*    */     public SimpleOnGestureListener()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!"); } 
/* 23 */     public boolean onSingleTapUp(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 24 */     public void onLongPress(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 25 */     public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) { throw new RuntimeException("Stub!"); } 
/* 26 */     public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); } 
/* 27 */     public void onShowPress(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 28 */     public boolean onDown(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 29 */     public boolean onDoubleTap(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 30 */     public boolean onDoubleTapEvent(MotionEvent e) { throw new RuntimeException("Stub!"); } 
/* 31 */     public boolean onSingleTapConfirmed(MotionEvent e) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface OnDoubleTapListener
/*    */   {
/*    */     public abstract boolean onSingleTapConfirmed(MotionEvent paramMotionEvent);
/*    */ 
/*    */     public abstract boolean onDoubleTap(MotionEvent paramMotionEvent);
/*    */ 
/*    */     public abstract boolean onDoubleTapEvent(MotionEvent paramMotionEvent);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnGestureListener
/*    */   {
/*    */     public abstract boolean onDown(MotionEvent paramMotionEvent);
/*    */ 
/*    */     public abstract void onShowPress(MotionEvent paramMotionEvent);
/*    */ 
/*    */     public abstract boolean onSingleTapUp(MotionEvent paramMotionEvent);
/*    */ 
/*    */     public abstract boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2);
/*    */ 
/*    */     public abstract void onLongPress(MotionEvent paramMotionEvent);
/*    */ 
/*    */     public abstract boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.GestureDetector
 * JD-Core Version:    0.6.0
 */