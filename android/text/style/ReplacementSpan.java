/*   */ package android.text.style;
/*   */ 
/*   */ import android.graphics.Canvas;
/*   */ import android.graphics.Paint;
/*   */ import android.graphics.Paint.FontMetricsInt;
/*   */ import android.text.TextPaint;
/*   */ 
/*   */ public abstract class ReplacementSpan extends MetricAffectingSpan
/*   */ {
/*   */   public ReplacementSpan()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt);
/*   */ 
/*   */   public abstract void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint);
/*   */ 
/* 8 */   public void updateMeasureState(TextPaint p) { throw new RuntimeException("Stub!"); } 
/* 9 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.ReplacementSpan
 * JD-Core Version:    0.6.0
 */