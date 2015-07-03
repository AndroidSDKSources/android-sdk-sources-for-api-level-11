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
/*    */ public class RadioGroup extends LinearLayout
/*    */ {
/*    */   public RadioGroup(Context context)
/*    */   {
/* 19 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   public RadioGroup(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 21 */   public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void check(int id) { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getCheckedRadioButtonId() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void clearCheck() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setOnCheckedChangeListener(OnCheckedChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 28 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 29 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 30 */   protected LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnCheckedChangeListener
/*    */   {
/*    */     public abstract void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt);
/*    */   }
/*    */ 
/*    */   public static class LayoutParams extends LinearLayout.LayoutParams
/*    */   {
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!"); } 
/*  9 */     public LayoutParams(int w, int h) { super(); throw new RuntimeException("Stub!"); } 
/* 10 */     public LayoutParams(int w, int h, float initWeight) { super(); throw new RuntimeException("Stub!"); } 
/* 11 */     public LayoutParams(ViewGroup.LayoutParams p) { super(); throw new RuntimeException("Stub!"); } 
/* 12 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 13 */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.RadioGroup
 * JD-Core Version:    0.6.0
 */