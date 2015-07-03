/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewGroup;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class LinearLayout extends ViewGroup
/*    */ {
/*    */   public static final int HORIZONTAL = 0;
/*    */   public static final int VERTICAL = 1;
/*    */   public static final int SHOW_DIVIDER_NONE = 0;
/*    */   public static final int SHOW_DIVIDER_BEGINNING = 1;
/*    */   public static final int SHOW_DIVIDER_MIDDLE = 2;
/*    */   public static final int SHOW_DIVIDER_END = 4;
/*    */ 
/*    */   public LinearLayout(Context context)
/*    */   {
/* 18 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 19 */   public LinearLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   public LinearLayout(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 21 */   public void setShowDividers(int showDividers) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getShowDividers() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setDividerDrawable(Drawable divider) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean isBaselineAligned() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setBaselineAligned(boolean baselineAligned) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isMeasureWithLargestChildEnabled() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setMeasureWithLargestChildEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getBaselineAlignedChildIndex() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setBaselineAlignedChildIndex(int i) { throw new RuntimeException("Stub!"); } 
/* 32 */   public float getWeightSum() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setWeightSum(float weightSum) { throw new RuntimeException("Stub!"); } 
/* 34 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 35 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setOrientation(int orientation) { throw new RuntimeException("Stub!"); } 
/* 37 */   public int getOrientation() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setHorizontalGravity(int horizontalGravity) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void setVerticalGravity(int verticalGravity) { throw new RuntimeException("Stub!"); } 
/* 41 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 42 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 43 */   protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 44 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class LayoutParams extends ViewGroup.MarginLayoutParams
/*    */   {
/*    */     public float weight;
/*    */     public int gravity;
/*    */ 
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/*  9 */       super(); throw new RuntimeException("Stub!"); } 
/* 10 */     public LayoutParams(int width, int height) { super(); throw new RuntimeException("Stub!"); } 
/* 11 */     public LayoutParams(int width, int height, float weight) { super(); throw new RuntimeException("Stub!"); } 
/* 12 */     public LayoutParams(ViewGroup.LayoutParams p) { super(); throw new RuntimeException("Stub!"); } 
/* 13 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 14 */     public String debug(String output) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.LinearLayout
 * JD-Core Version:    0.6.0
 */