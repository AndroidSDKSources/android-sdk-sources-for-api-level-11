/*    */ package org.apache.http.impl.client;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.ConnectionReuseStrategy;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.ProtocolException;
/*    */ import org.apache.http.client.AuthenticationHandler;
/*    */ import org.apache.http.client.HttpRequestRetryHandler;
/*    */ import org.apache.http.client.RedirectHandler;
/*    */ import org.apache.http.client.RequestDirector;
/*    */ import org.apache.http.client.UserTokenHandler;
/*    */ import org.apache.http.conn.ClientConnectionManager;
/*    */ import org.apache.http.conn.ConnectionKeepAliveStrategy;
/*    */ import org.apache.http.conn.ManagedClientConnection;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.conn.routing.HttpRoutePlanner;
/*    */ import org.apache.http.params.HttpParams;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ import org.apache.http.protocol.HttpProcessor;
/*    */ import org.apache.http.protocol.HttpRequestExecutor;
/*    */ 
/*    */ public class DefaultRequestDirector
/*    */   implements RequestDirector
/*    */ {
/*    */   protected final ClientConnectionManager connManager;
/*    */   protected final HttpRoutePlanner routePlanner;
/*    */   protected final ConnectionReuseStrategy reuseStrategy;
/*    */   protected final ConnectionKeepAliveStrategy keepAliveStrategy;
/*    */   protected final HttpRequestExecutor requestExec;
/*    */   protected final HttpProcessor httpProcessor;
/*    */   protected final HttpRequestRetryHandler retryHandler;
/*    */   protected final RedirectHandler redirectHandler;
/*    */   protected final HttpParams params;
/*    */   protected ManagedClientConnection managedConn;
/*    */ 
/*    */   public DefaultRequestDirector(HttpRequestExecutor requestExec, ClientConnectionManager conman, ConnectionReuseStrategy reustrat, ConnectionKeepAliveStrategy kastrat, HttpRoutePlanner rouplan, HttpProcessor httpProcessor, HttpRequestRetryHandler retryHandler, RedirectHandler redirectHandler, AuthenticationHandler targetAuthHandler, AuthenticationHandler proxyAuthHandler, UserTokenHandler userTokenHandler, HttpParams params)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected void rewriteRequestURI(RequestWrapper request, HttpRoute route) throws ProtocolException { throw new RuntimeException("Stub!"); } 
/*  7 */   public HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void releaseConnection() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context) throws HttpException { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void establishRoute(HttpRoute route, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   protected boolean createTunnelToTarget(HttpRoute route, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   protected boolean createTunnelToProxy(HttpRoute route, int hop, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   protected HttpRequest createConnectRequest(HttpRoute route, HttpContext context) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected RoutedRequest handleResponse(RoutedRequest roureq, HttpResponse response, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.DefaultRequestDirector
 * JD-Core Version:    0.6.0
 */