/*   */ package android.text.style;
/*   */ 
/*   */ import android.text.TextPaint;
/*   */ 
/*   */ public abstract class MetricAffectingSpan extends CharacterStyle
/*   */   implements UpdateLayout
/*   */ {
/*   */   public MetricAffectingSpan()
/*   */   {
/* 6 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract void updateMeasureState(TextPaint paramTextPaint);
/*   */ 
/* 8 */   public MetricAffectingSpan getUnderlying() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.MetricAffectingSpan
 * JD-Core Version:    0.6.0
 */