/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewGroup;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class RelativeLayout extends ViewGroup
/*    */ {
/*    */   public static final int TRUE = -1;
/*    */   public static final int LEFT_OF = 0;
/*    */   public static final int RIGHT_OF = 1;
/*    */   public static final int ABOVE = 2;
/*    */   public static final int BELOW = 3;
/*    */   public static final int ALIGN_BASELINE = 4;
/*    */   public static final int ALIGN_LEFT = 5;
/*    */   public static final int ALIGN_TOP = 6;
/*    */   public static final int ALIGN_RIGHT = 7;
/*    */   public static final int ALIGN_BOTTOM = 8;
/*    */   public static final int ALIGN_PARENT_LEFT = 9;
/*    */   public static final int ALIGN_PARENT_TOP = 10;
/*    */   public static final int ALIGN_PARENT_RIGHT = 11;
/*    */   public static final int ALIGN_PARENT_BOTTOM = 12;
/*    */   public static final int CENTER_IN_PARENT = 13;
/*    */   public static final int CENTER_HORIZONTAL = 14;
/*    */   public static final int CENTER_VERTICAL = 15;
/*    */ 
/*    */   public RelativeLayout(Context context)
/*    */   {
/* 19 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   public RelativeLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 21 */   public RelativeLayout(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 22 */   public void setIgnoreGravity(int viewId) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setHorizontalGravity(int horizontalGravity) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setVerticalGravity(int verticalGravity) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void requestLayout() { throw new RuntimeException("Stub!"); } 
/* 28 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 29 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 30 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 31 */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 32 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 33 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class LayoutParams extends ViewGroup.MarginLayoutParams
/*    */   {
/*    */     public boolean alignWithParent;
/*    */ 
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/*  9 */       super(); throw new RuntimeException("Stub!"); } 
/* 10 */     public LayoutParams(int w, int h) { super(); throw new RuntimeException("Stub!"); } 
/* 11 */     public LayoutParams(ViewGroup.LayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 12 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 13 */     public String debug(String output) { throw new RuntimeException("Stub!"); } 
/* 14 */     public void addRule(int verb) { throw new RuntimeException("Stub!"); } 
/* 15 */     public void addRule(int verb, int anchor) { throw new RuntimeException("Stub!"); } 
/* 16 */     public int[] getRules() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.RelativeLayout
 * JD-Core Version:    0.6.0
 */