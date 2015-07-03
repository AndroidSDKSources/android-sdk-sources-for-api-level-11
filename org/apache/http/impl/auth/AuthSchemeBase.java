/*   */ package org.apache.http.impl.auth;
/*   */ 
/*   */ import org.apache.http.Header;
/*   */ import org.apache.http.auth.AuthScheme;
/*   */ import org.apache.http.auth.MalformedChallengeException;
/*   */ import org.apache.http.util.CharArrayBuffer;
/*   */ 
/*   */ public abstract class AuthSchemeBase
/*   */   implements AuthScheme
/*   */ {
/*   */   public AuthSchemeBase()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void processChallenge(Header header) throws MalformedChallengeException { throw new RuntimeException("Stub!"); } 
/*   */   protected abstract void parseChallenge(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2) throws MalformedChallengeException;
/*   */ 
/* 8 */   public boolean isProxy() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.auth.AuthSchemeBase
 * JD-Core Version:    0.6.0
 */