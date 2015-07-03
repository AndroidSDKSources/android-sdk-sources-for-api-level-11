/*    */ package org.apache.http.impl.conn;
/*    */ 
/*    */ import java.net.InetSocketAddress;
/*    */ import java.net.Proxy;
/*    */ import java.net.ProxySelector;
/*    */ import java.util.List;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.conn.routing.HttpRoutePlanner;
/*    */ import org.apache.http.conn.scheme.SchemeRegistry;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ 
/*    */ public class ProxySelectorRoutePlanner
/*    */   implements HttpRoutePlanner
/*    */ {
/*    */   protected SchemeRegistry schemeRegistry;
/*    */   protected ProxySelector proxySelector;
/*    */ 
/*    */   public ProxySelectorRoutePlanner(SchemeRegistry schreg, ProxySelector prosel)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ProxySelector getProxySelector() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setProxySelector(ProxySelector prosel) { throw new RuntimeException("Stub!"); } 
/*  8 */   public HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context) throws HttpException { throw new RuntimeException("Stub!"); } 
/*  9 */   protected HttpHost determineProxy(HttpHost target, HttpRequest request, HttpContext context) throws HttpException { throw new RuntimeException("Stub!"); } 
/* 10 */   protected String getHost(InetSocketAddress isa) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected Proxy chooseProxy(List<Proxy> proxies, HttpHost target, HttpRequest request, HttpContext context) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.ProxySelectorRoutePlanner
 * JD-Core Version:    0.6.0
 */