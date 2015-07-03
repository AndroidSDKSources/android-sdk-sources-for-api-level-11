/*    */ package org.apache.http.impl.auth;
/*    */ 
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.auth.AuthenticationException;
/*    */ import org.apache.http.auth.Credentials;
/*    */ import org.apache.http.auth.MalformedChallengeException;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class NTLMScheme extends AuthSchemeBase
/*    */ {
/*    */   public NTLMScheme(NTLMEngine engine)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getSchemeName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getParameter(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getRealm() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isConnectionBased() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void parseChallenge(CharArrayBuffer buffer, int pos, int len) throws MalformedChallengeException { throw new RuntimeException("Stub!"); } 
/* 11 */   public Header authenticate(Credentials credentials, HttpRequest request) throws AuthenticationException { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isComplete() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.auth.NTLMScheme
 * JD-Core Version:    0.6.0
 */