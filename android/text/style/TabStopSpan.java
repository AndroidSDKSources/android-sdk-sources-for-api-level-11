/*   */ package android.text.style;
/*   */ 
/*   */ public abstract interface TabStopSpan extends ParagraphStyle
/*   */ {
/*   */   public abstract int getTabStop();
/*   */ 
/*   */   public static class Standard
/*   */     implements TabStopSpan
/*   */   {
/*   */     public Standard(int where)
/*   */     {
/* 8 */       throw new RuntimeException("Stub!"); } 
/* 9 */     public int getTabStop() { throw new RuntimeException("Stub!");
/*   */     }
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.TabStopSpan
 * JD-Core Version:    0.6.0
 */