/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewGroup;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ 
/*    */ @Deprecated
/*    */ @RemoteViews.RemoteView
/*    */ public class AbsoluteLayout extends ViewGroup
/*    */ {
/*    */   public AbsoluteLayout(Context context)
/*    */   {
/* 17 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 18 */   public AbsoluteLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 19 */   public AbsoluteLayout(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 23 */   public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 25 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class LayoutParams extends ViewGroup.LayoutParams
/*    */   {
/*    */     public int x;
/*    */     public int y;
/*    */ 
/*    */     public LayoutParams(int width, int height, int x, int y)
/*    */     {
/* 10 */       super(); throw new RuntimeException("Stub!"); } 
/* 11 */     public LayoutParams(Context c, AttributeSet attrs) { super(); throw new RuntimeException("Stub!"); } 
/* 12 */     public LayoutParams(ViewGroup.LayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 13 */     public String debug(String output) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.AbsoluteLayout
 * JD-Core Version:    0.6.0
 */