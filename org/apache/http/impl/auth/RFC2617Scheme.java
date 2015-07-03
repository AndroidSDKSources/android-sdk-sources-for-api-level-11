/*   */ package org.apache.http.impl.auth;
/*   */ 
/*   */ import java.util.Map;
/*   */ import org.apache.http.auth.MalformedChallengeException;
/*   */ import org.apache.http.util.CharArrayBuffer;
/*   */ 
/*   */ public abstract class RFC2617Scheme extends AuthSchemeBase
/*   */ {
/*   */   public RFC2617Scheme()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected void parseChallenge(CharArrayBuffer buffer, int pos, int len) throws MalformedChallengeException { throw new RuntimeException("Stub!"); } 
/* 7 */   protected Map<String, String> getParameters() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getParameter(String name) { throw new RuntimeException("Stub!"); } 
/* 9 */   public String getRealm() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.auth.RFC2617Scheme
 * JD-Core Version:    0.6.0
 */