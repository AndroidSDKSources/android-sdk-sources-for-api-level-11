/*   */ package android.text.style;
/*   */ 
/*   */ import android.text.TextPaint;
/*   */ 
/*   */ public abstract class CharacterStyle
/*   */ {
/*   */   public CharacterStyle()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract void updateDrawState(TextPaint paramTextPaint);
/*   */ 
/* 6 */   public static CharacterStyle wrap(CharacterStyle cs) { throw new RuntimeException("Stub!"); } 
/* 7 */   public CharacterStyle getUnderlying() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.CharacterStyle
 * JD-Core Version:    0.6.0
 */