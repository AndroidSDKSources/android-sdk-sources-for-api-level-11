/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ 
/*    */ public class ScrollView extends FrameLayout
/*    */ {
/*    */   public ScrollView(Context context)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  6 */   public ScrollView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public ScrollView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   protected float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getMaxScrollAmount() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void addView(View child) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void addView(View child, int index) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void addView(View child, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isFillViewport() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setFillViewport(boolean fillViewport) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isSmoothScrollingEnabled() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean executeKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean onInterceptTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean pageScroll(int direction) { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean fullScroll(int direction) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean arrowScroll(int direction) { throw new RuntimeException("Stub!"); } 
/* 28 */   public final void smoothScrollBy(int dx, int dy) { throw new RuntimeException("Stub!"); } 
/* 29 */   public final void smoothScrollTo(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 30 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 31 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 32 */   protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 33 */   protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void computeScroll() { throw new RuntimeException("Stub!"); } 
/* 35 */   protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void requestChildFocus(View child, View focused) { throw new RuntimeException("Stub!"); } 
/* 37 */   protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void requestLayout() { throw new RuntimeException("Stub!"); } 
/* 40 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 41 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 42 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void fling(int velocityY) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void scrollTo(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.ScrollView
 * JD-Core Version:    0.6.0
 */