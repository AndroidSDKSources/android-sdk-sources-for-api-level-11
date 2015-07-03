/*   */ package android.text.style;
/*   */ 
/*   */ import android.graphics.Canvas;
/*   */ import android.graphics.Paint;
/*   */ import android.graphics.Paint.FontMetricsInt;
/*   */ import android.graphics.drawable.Drawable;
/*   */ import android.text.Layout;
/*   */ 
/*   */ public class DrawableMarginSpan
/*   */   implements LeadingMarginSpan, LineHeightSpan
/*   */ {
/*   */   public DrawableMarginSpan(Drawable b)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public DrawableMarginSpan(Drawable b, int pad) { throw new RuntimeException("Stub!"); } 
/* 7 */   public int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); } 
/* 8 */   public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) { throw new RuntimeException("Stub!"); } 
/* 9 */   public void chooseHeight(CharSequence text, int start, int end, int istartv, int v, Paint.FontMetricsInt fm) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.DrawableMarginSpan
 * JD-Core Version:    0.6.0
 */