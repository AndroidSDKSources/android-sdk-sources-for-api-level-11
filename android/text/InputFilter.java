/*    */ package android.text;
/*    */ 
/*    */ public abstract interface InputFilter
/*    */ {
/*    */   public abstract CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4);
/*    */ 
/*    */   public static class LengthFilter
/*    */     implements InputFilter
/*    */   {
/*    */     public LengthFilter(int max)
/*    */     {
/* 13 */       throw new RuntimeException("Stub!"); } 
/* 14 */     public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class AllCaps
/*    */     implements InputFilter
/*    */   {
/*    */     public AllCaps()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.InputFilter
 * JD-Core Version:    0.6.0
 */