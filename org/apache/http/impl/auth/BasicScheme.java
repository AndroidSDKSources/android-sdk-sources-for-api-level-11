/*    */ package org.apache.http.impl.auth;
/*    */ 
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.auth.AuthenticationException;
/*    */ import org.apache.http.auth.Credentials;
/*    */ import org.apache.http.auth.MalformedChallengeException;
/*    */ 
/*    */ public class BasicScheme extends RFC2617Scheme
/*    */ {
/*    */   public BasicScheme()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getSchemeName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void processChallenge(Header header) throws MalformedChallengeException { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isComplete() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isConnectionBased() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Header authenticate(Credentials credentials, HttpRequest request) throws AuthenticationException { throw new RuntimeException("Stub!"); } 
/* 11 */   public static Header authenticate(Credentials credentials, String charset, boolean proxy) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.auth.BasicScheme
 * JD-Core Version:    0.6.0
 */