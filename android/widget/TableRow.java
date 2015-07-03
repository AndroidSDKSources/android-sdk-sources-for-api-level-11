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
/*    */ public class TableRow extends LinearLayout
/*    */ {
/*    */   public TableRow(Context context)
/*    */   {
/* 19 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   public TableRow(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 21 */   public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 24 */   public View getVirtualChildAt(int i) { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getVirtualChildCount() { throw new RuntimeException("Stub!"); } 
/* 26 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 28 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 29 */   protected LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class LayoutParams extends LinearLayout.LayoutParams
/*    */   {
/*    */     public int column;
/*    */     public int span;
/*    */ 
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!"); } 
/*  9 */     public LayoutParams(int w, int h) { super(); throw new RuntimeException("Stub!"); } 
/* 10 */     public LayoutParams(int w, int h, float initWeight) { super(); throw new RuntimeException("Stub!"); } 
/* 11 */     public LayoutParams() { super(); throw new RuntimeException("Stub!"); } 
/* 12 */     public LayoutParams(int column) { super(); throw new RuntimeException("Stub!"); } 
/* 13 */     public LayoutParams(ViewGroup.LayoutParams p) { super(); throw new RuntimeException("Stub!"); } 
/* 14 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 15 */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.TableRow
 * JD-Core Version:    0.6.0
 */