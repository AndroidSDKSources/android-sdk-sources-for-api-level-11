/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Region;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewGroup;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class FrameLayout extends ViewGroup
/*    */ {
/*    */   public FrameLayout(Context context)
/*    */   {
/* 16 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 17 */   public FrameLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 18 */   public FrameLayout(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 19 */   public void setForegroundGravity(int foregroundGravity) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 23 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setForeground(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 25 */   public Drawable getForeground() { throw new RuntimeException("Stub!"); } 
/* 26 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean gatherTransparentRegion(Region region) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setMeasureAllChildren(boolean measureAll) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean getConsiderGoneChildrenWhenMeasuring() { throw new RuntimeException("Stub!"); } 
/* 33 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 34 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 35 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class LayoutParams extends ViewGroup.MarginLayoutParams
/*    */   {
/*    */     public int gravity;
/*    */ 
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/*  9 */       super(); throw new RuntimeException("Stub!"); } 
/* 10 */     public LayoutParams(int width, int height) { super(); throw new RuntimeException("Stub!"); } 
/* 11 */     public LayoutParams(int width, int height, int gravity) { super(); throw new RuntimeException("Stub!"); } 
/* 12 */     public LayoutParams(ViewGroup.LayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 13 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super(); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.FrameLayout
 * JD-Core Version:    0.6.0
 */