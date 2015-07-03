/*    */ package org.apache.http.impl.client;
/*    */ 
/*    */ import org.apache.http.ConnectionReuseStrategy;
/*    */ import org.apache.http.auth.AuthSchemeRegistry;
/*    */ import org.apache.http.client.AuthenticationHandler;
/*    */ import org.apache.http.client.CookieStore;
/*    */ import org.apache.http.client.CredentialsProvider;
/*    */ import org.apache.http.client.HttpRequestRetryHandler;
/*    */ import org.apache.http.client.RedirectHandler;
/*    */ import org.apache.http.client.UserTokenHandler;
/*    */ import org.apache.http.conn.ClientConnectionManager;
/*    */ import org.apache.http.conn.ConnectionKeepAliveStrategy;
/*    */ import org.apache.http.conn.routing.HttpRoutePlanner;
/*    */ import org.apache.http.cookie.CookieSpecRegistry;
/*    */ import org.apache.http.params.HttpParams;
/*    */ import org.apache.http.protocol.BasicHttpProcessor;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ import org.apache.http.protocol.HttpRequestExecutor;
/*    */ 
/*    */ public class DefaultHttpClient extends AbstractHttpClient
/*    */ {
/*    */   public DefaultHttpClient(ClientConnectionManager conman, HttpParams params)
/*    */   {
/*  5 */     super((ClientConnectionManager)null, (HttpParams)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public DefaultHttpClient(HttpParams params) { super((ClientConnectionManager)null, (HttpParams)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public DefaultHttpClient() { super((ClientConnectionManager)null, (HttpParams)null); throw new RuntimeException("Stub!"); } 
/*  8 */   protected HttpParams createHttpParams() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected HttpRequestExecutor createRequestExecutor() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected ClientConnectionManager createClientConnectionManager() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected HttpContext createHttpContext() { throw new RuntimeException("Stub!"); } 
/* 12 */   protected ConnectionReuseStrategy createConnectionReuseStrategy() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected AuthSchemeRegistry createAuthSchemeRegistry() { throw new RuntimeException("Stub!"); } 
/* 15 */   protected CookieSpecRegistry createCookieSpecRegistry() { throw new RuntimeException("Stub!"); } 
/* 16 */   protected BasicHttpProcessor createHttpProcessor() { throw new RuntimeException("Stub!"); } 
/* 17 */   protected HttpRequestRetryHandler createHttpRequestRetryHandler() { throw new RuntimeException("Stub!"); } 
/* 18 */   protected RedirectHandler createRedirectHandler() { throw new RuntimeException("Stub!"); } 
/* 19 */   protected AuthenticationHandler createTargetAuthenticationHandler() { throw new RuntimeException("Stub!"); } 
/* 20 */   protected AuthenticationHandler createProxyAuthenticationHandler() { throw new RuntimeException("Stub!"); } 
/* 21 */   protected CookieStore createCookieStore() { throw new RuntimeException("Stub!"); } 
/* 22 */   protected CredentialsProvider createCredentialsProvider() { throw new RuntimeException("Stub!"); } 
/* 23 */   protected HttpRoutePlanner createHttpRoutePlanner() { throw new RuntimeException("Stub!"); } 
/* 24 */   protected UserTokenHandler createUserTokenHandler() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.DefaultHttpClient
 * JD-Core Version:    0.6.0
 */