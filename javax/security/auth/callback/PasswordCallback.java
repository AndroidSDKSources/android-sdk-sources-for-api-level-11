/*    */ package javax.security.auth.callback;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class PasswordCallback
/*    */   implements Callback, Serializable
/*    */ {
/*    */   public PasswordCallback(String prompt, boolean echoOn)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getPrompt() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isEchoOn() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setPassword(char[] password) { throw new RuntimeException("Stub!"); } 
/*  9 */   public char[] getPassword() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void clearPassword() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.security.auth.callback.PasswordCallback
 * JD-Core Version:    0.6.0
 */