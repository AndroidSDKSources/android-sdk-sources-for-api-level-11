/*    */ package android.app;
/*    */ 
/*    */ public class KeyguardManager
/*    */ {
/*    */   KeyguardManager()
/*    */   {
/* 14 */     throw new RuntimeException("Stub!"); } 
/* 15 */   public KeyguardLock newKeyguardLock(String tag) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean inKeyguardRestrictedInputMode() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void exitKeyguardSecurely(OnKeyguardExitResult callback) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnKeyguardExitResult
/*    */   {
/*    */     public abstract void onKeyguardExitResult(boolean paramBoolean);
/*    */   }
/*    */ 
/*    */   public class KeyguardLock
/*    */   {
/*    */     KeyguardLock()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public void disableKeyguard() { throw new RuntimeException("Stub!"); } 
/*  8 */     public void reenableKeyguard() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.KeyguardManager
 * JD-Core Version:    0.6.0
 */