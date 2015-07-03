/*    */ package android.text.style;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Paint.FontMetricsInt;
/*    */ import android.graphics.drawable.Drawable;
/*    */ 
/*    */ public abstract class DynamicDrawableSpan extends ReplacementSpan
/*    */ {
/*    */   public static final int ALIGN_BOTTOM = 0;
/*    */   public static final int ALIGN_BASELINE = 1;
/*    */   protected final int mVerticalAlignment;
/*    */ 
/*    */   public DynamicDrawableSpan()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected DynamicDrawableSpan(int verticalAlignment) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getVerticalAlignment() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Drawable getDrawable();
/*    */ 
/*  9 */   public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.DynamicDrawableSpan
 * JD-Core Version:    0.6.0
 */