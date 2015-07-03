/*   */ package java.security;
/*   */ 
/*   */ import javax.security.auth.Subject;
/*   */ import javax.security.auth.callback.CallbackHandler;
/*   */ import javax.security.auth.login.LoginException;
/*   */ 
/*   */ public abstract class AuthProvider extends Provider
/*   */ {
/*   */   protected AuthProvider(String name, double version, String info)
/*   */   {
/* 5 */     super((String)null, 0.0D, (String)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void login(Subject paramSubject, CallbackHandler paramCallbackHandler)
/*   */     throws LoginException;
/*   */ 
/*   */   public abstract void logout()
/*   */     throws LoginException;
/*   */ 
/*   */   public abstract void setCallbackHandler(CallbackHandler paramCallbackHandler);
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.AuthProvider
 * JD-Core Version:    0.6.0
 */