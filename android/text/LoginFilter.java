/*    */ package android.text;
/*    */ 
/*    */ public abstract class LoginFilter
/*    */   implements InputFilter
/*    */ {
/*    */   LoginFilter()
/*    */   {
/* 26 */     throw new RuntimeException("Stub!"); } 
/* 27 */   public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void onStart() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void onInvalidCharacter(char c) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void onStop() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract boolean isAllowed(char paramChar);
/*    */ 
/*    */   public static class PasswordFilterGMail extends LoginFilter
/*    */   {
/*    */     public PasswordFilterGMail()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!"); } 
/* 23 */     public PasswordFilterGMail(boolean appendInvalid) { throw new RuntimeException("Stub!"); } 
/* 24 */     public boolean isAllowed(char c) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class UsernameFilterGeneric extends LoginFilter
/*    */   {
/*    */     public UsernameFilterGeneric()
/*    */     {
/* 15 */       throw new RuntimeException("Stub!"); } 
/* 16 */     public UsernameFilterGeneric(boolean appendInvalid) { throw new RuntimeException("Stub!"); } 
/* 17 */     public boolean isAllowed(char c) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class UsernameFilterGMail extends LoginFilter
/*    */   {
/*    */     public UsernameFilterGMail()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public UsernameFilterGMail(boolean appendInvalid) { throw new RuntimeException("Stub!"); } 
/* 10 */     public boolean isAllowed(char c) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.LoginFilter
 * JD-Core Version:    0.6.0
 */