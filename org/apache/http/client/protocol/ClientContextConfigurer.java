/*    */ package org.apache.http.client.protocol;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.apache.http.auth.AuthSchemeRegistry;
/*    */ import org.apache.http.client.CookieStore;
/*    */ import org.apache.http.client.CredentialsProvider;
/*    */ import org.apache.http.cookie.CookieSpecRegistry;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ 
/*    */ public class ClientContextConfigurer
/*    */   implements ClientContext
/*    */ {
/*    */   public ClientContextConfigurer(HttpContext context)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setCookieSpecRegistry(CookieSpecRegistry registry) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setAuthSchemeRegistry(AuthSchemeRegistry registry) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setCookieStore(CookieStore store) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setCredentialsProvider(CredentialsProvider provider) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setAuthSchemePref(List<String> list) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.client.protocol.ClientContextConfigurer
 * JD-Core Version:    0.6.0
 */