/*   */ package android.text;
/*   */ 
/*   */ public abstract interface Spannable extends Spanned
/*   */ {
/*   */   public abstract void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3);
/*   */ 
/*   */   public abstract void removeSpan(Object paramObject);
/*   */ 
/*   */   public static class Factory
/*   */   {
/*   */     public Factory()
/*   */     {
/* 7 */       throw new RuntimeException("Stub!"); } 
/* 8 */     public static Factory getInstance() { throw new RuntimeException("Stub!"); } 
/* 9 */     public Spannable newSpannable(CharSequence source) { throw new RuntimeException("Stub!");
/*   */     }
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.Spannable
 * JD-Core Version:    0.6.0
 */