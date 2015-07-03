/*   */ package org.apache.http.impl.client;
/*   */ 
/*   */ import java.util.List;
/*   */ import java.util.Map;
/*   */ import org.apache.http.Header;
/*   */ import org.apache.http.HttpResponse;
/*   */ import org.apache.http.auth.AuthScheme;
/*   */ import org.apache.http.auth.AuthenticationException;
/*   */ import org.apache.http.auth.MalformedChallengeException;
/*   */ import org.apache.http.client.AuthenticationHandler;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public abstract class AbstractAuthenticationHandler
/*   */   implements AuthenticationHandler
/*   */ {
/*   */   public AbstractAuthenticationHandler()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected Map<String, Header> parseChallenges(Header[] headers) throws MalformedChallengeException { throw new RuntimeException("Stub!"); } 
/* 7 */   protected List<String> getAuthPreferences() { throw new RuntimeException("Stub!"); } 
/* 8 */   public AuthScheme selectScheme(Map<String, Header> challenges, HttpResponse response, HttpContext context) throws AuthenticationException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.AbstractAuthenticationHandler
 * JD-Core Version:    0.6.0
 */