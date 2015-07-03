/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ import android.view.ViewGroup.OnHierarchyChangeListener;
/*    */ 
/*    */ public class TableLayout extends LinearLayout
/*    */ {
/*    */   public TableLayout(Context context)
/*    */   {
/* 17 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 18 */   public TableLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 19 */   public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void requestLayout() { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isShrinkAllColumns() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setShrinkAllColumns(boolean shrinkAllColumns) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isStretchAllColumns() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setStretchAllColumns(boolean stretchAllColumns) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setColumnCollapsed(int columnIndex, boolean isCollapsed) { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean isColumnCollapsed(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setColumnStretchable(int columnIndex, boolean isStretchable) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean isColumnStretchable(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setColumnShrinkable(int columnIndex, boolean isShrinkable) { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean isColumnShrinkable(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void addView(View child) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void addView(View child, int index) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void addView(View child, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 35 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 36 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 37 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 38 */   protected LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 39 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 40 */   protected LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class LayoutParams extends LinearLayout.LayoutParams
/*    */   {
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/*  9 */       super(); throw new RuntimeException("Stub!"); } 
/* 10 */     public LayoutParams(int w, int h) { super(); throw new RuntimeException("Stub!"); } 
/* 11 */     public LayoutParams(int w, int h, float initWeight) { super(); throw new RuntimeException("Stub!"); } 
/* 12 */     public LayoutParams() { super(); throw new RuntimeException("Stub!"); } 
/* 13 */     public LayoutParams(ViewGroup.LayoutParams p) { super(); throw new RuntimeException("Stub!"); } 
/* 14 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 15 */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.TableLayout
 * JD-Core Version:    0.6.0
 */