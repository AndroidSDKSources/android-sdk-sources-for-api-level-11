/*    */ package org.apache.http.impl.client;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.ConnectionReuseStrategy;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpRequestInterceptor;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.HttpResponseInterceptor;
/*    */ import org.apache.http.auth.AuthSchemeRegistry;
/*    */ import org.apache.http.client.AuthenticationHandler;
/*    */ import org.apache.http.client.ClientProtocolException;
/*    */ import org.apache.http.client.CookieStore;
/*    */ import org.apache.http.client.CredentialsProvider;
/*    */ import org.apache.http.client.HttpClient;
/*    */ import org.apache.http.client.HttpRequestRetryHandler;
/*    */ import org.apache.http.client.RedirectHandler;
/*    */ import org.apache.http.client.RequestDirector;
/*    */ import org.apache.http.client.ResponseHandler;
/*    */ import org.apache.http.client.UserTokenHandler;
/*    */ import org.apache.http.client.methods.HttpUriRequest;
/*    */ import org.apache.http.conn.ClientConnectionManager;
/*    */ import org.apache.http.conn.ConnectionKeepAliveStrategy;
/*    */ import org.apache.http.conn.routing.HttpRoutePlanner;
/*    */ import org.apache.http.cookie.CookieSpecRegistry;
/*    */ import org.apache.http.params.HttpParams;
/*    */ import org.apache.http.protocol.BasicHttpProcessor;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ import org.apache.http.protocol.HttpProcessor;
/*    */ import org.apache.http.protocol.HttpRequestExecutor;
/*    */ 
/*    */ public abstract class AbstractHttpClient
/*    */   implements HttpClient
/*    */ {
/*    */   protected AbstractHttpClient(ClientConnectionManager conman, HttpParams params)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract HttpParams createHttpParams();
/*    */ 
/*    */   protected abstract HttpContext createHttpContext();
/*    */ 
/*    */   protected abstract HttpRequestExecutor createRequestExecutor();
/*    */ 
/*    */   protected abstract ClientConnectionManager createClientConnectionManager();
/*    */ 
/*    */   protected abstract AuthSchemeRegistry createAuthSchemeRegistry();
/*    */ 
/*    */   protected abstract CookieSpecRegistry createCookieSpecRegistry();
/*    */ 
/*    */   protected abstract ConnectionReuseStrategy createConnectionReuseStrategy();
/*    */ 
/*    */   protected abstract ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy();
/*    */ 
/*    */   protected abstract BasicHttpProcessor createHttpProcessor();
/*    */ 
/*    */   protected abstract HttpRequestRetryHandler createHttpRequestRetryHandler();
/*    */ 
/*    */   protected abstract RedirectHandler createRedirectHandler();
/*    */ 
/*    */   protected abstract AuthenticationHandler createTargetAuthenticationHandler();
/*    */ 
/*    */   protected abstract AuthenticationHandler createProxyAuthenticationHandler();
/*    */ 
/*    */   protected abstract CookieStore createCookieStore();
/*    */ 
/*    */   protected abstract CredentialsProvider createCredentialsProvider();
/*    */ 
/*    */   protected abstract HttpRoutePlanner createHttpRoutePlanner();
/*    */ 
/*    */   protected abstract UserTokenHandler createUserTokenHandler();
/*    */ 
/* 23 */   public final synchronized HttpParams getParams() { throw new RuntimeException("Stub!"); } 
/* 24 */   public synchronized void setParams(HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 25 */   public final synchronized ClientConnectionManager getConnectionManager() { throw new RuntimeException("Stub!"); } 
/* 26 */   public final synchronized HttpRequestExecutor getRequestExecutor() { throw new RuntimeException("Stub!"); } 
/* 27 */   public final synchronized AuthSchemeRegistry getAuthSchemes() { throw new RuntimeException("Stub!"); } 
/* 28 */   public synchronized void setAuthSchemes(AuthSchemeRegistry authSchemeRegistry) { throw new RuntimeException("Stub!"); } 
/* 29 */   public final synchronized CookieSpecRegistry getCookieSpecs() { throw new RuntimeException("Stub!"); } 
/* 30 */   public synchronized void setCookieSpecs(CookieSpecRegistry cookieSpecRegistry) { throw new RuntimeException("Stub!"); } 
/* 31 */   public final synchronized ConnectionReuseStrategy getConnectionReuseStrategy() { throw new RuntimeException("Stub!"); } 
/* 32 */   public synchronized void setReuseStrategy(ConnectionReuseStrategy reuseStrategy) { throw new RuntimeException("Stub!"); } 
/* 33 */   public final synchronized ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy() { throw new RuntimeException("Stub!"); } 
/* 34 */   public synchronized void setKeepAliveStrategy(ConnectionKeepAliveStrategy keepAliveStrategy) { throw new RuntimeException("Stub!"); } 
/* 35 */   public final synchronized HttpRequestRetryHandler getHttpRequestRetryHandler() { throw new RuntimeException("Stub!"); } 
/* 36 */   public synchronized void setHttpRequestRetryHandler(HttpRequestRetryHandler retryHandler) { throw new RuntimeException("Stub!"); } 
/* 37 */   public final synchronized RedirectHandler getRedirectHandler() { throw new RuntimeException("Stub!"); } 
/* 38 */   public synchronized void setRedirectHandler(RedirectHandler redirectHandler) { throw new RuntimeException("Stub!"); } 
/* 39 */   public final synchronized AuthenticationHandler getTargetAuthenticationHandler() { throw new RuntimeException("Stub!"); } 
/* 40 */   public synchronized void setTargetAuthenticationHandler(AuthenticationHandler targetAuthHandler) { throw new RuntimeException("Stub!"); } 
/* 41 */   public final synchronized AuthenticationHandler getProxyAuthenticationHandler() { throw new RuntimeException("Stub!"); } 
/* 42 */   public synchronized void setProxyAuthenticationHandler(AuthenticationHandler proxyAuthHandler) { throw new RuntimeException("Stub!"); } 
/* 43 */   public final synchronized CookieStore getCookieStore() { throw new RuntimeException("Stub!"); } 
/* 44 */   public synchronized void setCookieStore(CookieStore cookieStore) { throw new RuntimeException("Stub!"); } 
/* 45 */   public final synchronized CredentialsProvider getCredentialsProvider() { throw new RuntimeException("Stub!"); } 
/* 46 */   public synchronized void setCredentialsProvider(CredentialsProvider credsProvider) { throw new RuntimeException("Stub!"); } 
/* 47 */   public final synchronized HttpRoutePlanner getRoutePlanner() { throw new RuntimeException("Stub!"); } 
/* 48 */   public synchronized void setRoutePlanner(HttpRoutePlanner routePlanner) { throw new RuntimeException("Stub!"); } 
/* 49 */   public final synchronized UserTokenHandler getUserTokenHandler() { throw new RuntimeException("Stub!"); } 
/* 50 */   public synchronized void setUserTokenHandler(UserTokenHandler userTokenHandler) { throw new RuntimeException("Stub!"); } 
/* 51 */   protected final synchronized BasicHttpProcessor getHttpProcessor() { throw new RuntimeException("Stub!"); } 
/* 52 */   public synchronized void addResponseInterceptor(HttpResponseInterceptor itcp) { throw new RuntimeException("Stub!"); } 
/* 53 */   public synchronized void addResponseInterceptor(HttpResponseInterceptor itcp, int index) { throw new RuntimeException("Stub!"); } 
/* 54 */   public synchronized HttpResponseInterceptor getResponseInterceptor(int index) { throw new RuntimeException("Stub!"); } 
/* 55 */   public synchronized int getResponseInterceptorCount() { throw new RuntimeException("Stub!"); } 
/* 56 */   public synchronized void clearResponseInterceptors() { throw new RuntimeException("Stub!"); } 
/* 57 */   public void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> clazz) { throw new RuntimeException("Stub!"); } 
/* 58 */   public synchronized void addRequestInterceptor(HttpRequestInterceptor itcp) { throw new RuntimeException("Stub!"); } 
/* 59 */   public synchronized void addRequestInterceptor(HttpRequestInterceptor itcp, int index) { throw new RuntimeException("Stub!"); } 
/* 60 */   public synchronized HttpRequestInterceptor getRequestInterceptor(int index) { throw new RuntimeException("Stub!"); } 
/* 61 */   public synchronized int getRequestInterceptorCount() { throw new RuntimeException("Stub!"); } 
/* 62 */   public synchronized void clearRequestInterceptors() { throw new RuntimeException("Stub!"); } 
/* 63 */   public void removeRequestInterceptorByClass(Class<? extends HttpRequestInterceptor> clazz) { throw new RuntimeException("Stub!"); } 
/* 64 */   public final HttpResponse execute(HttpUriRequest request) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 65 */   public final HttpResponse execute(HttpUriRequest request, HttpContext context) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 66 */   public final HttpResponse execute(HttpHost target, HttpRequest request) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 67 */   public final HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 68 */   protected RequestDirector createClientRequestDirector(HttpRequestExecutor requestExec, ClientConnectionManager conman, ConnectionReuseStrategy reustrat, ConnectionKeepAliveStrategy kastrat, HttpRoutePlanner rouplan, HttpProcessor httpProcessor, HttpRequestRetryHandler retryHandler, RedirectHandler redirectHandler, AuthenticationHandler targetAuthHandler, AuthenticationHandler proxyAuthHandler, UserTokenHandler stateHandler, HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 69 */   protected HttpParams determineParams(HttpRequest req) { throw new RuntimeException("Stub!"); } 
/* 70 */   public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 71 */   public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler, HttpContext context) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 72 */   public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 73 */   public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler, HttpContext context) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.AbstractHttpClient
 * JD-Core Version:    0.6.0
 */