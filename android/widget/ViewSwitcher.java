/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ 
/*    */ public class ViewSwitcher extends ViewAnimator
/*    */ {
/*    */   public ViewSwitcher(Context context)
/*    */   {
/*  9 */     super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/* 10 */   public ViewSwitcher(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/* 11 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 12 */   public View getNextView() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setFactory(ViewFactory factory) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void reset() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface ViewFactory
/*    */   {
/*    */     public abstract View makeView();
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.ViewSwitcher
 * JD-Core Version:    0.6.0
 */