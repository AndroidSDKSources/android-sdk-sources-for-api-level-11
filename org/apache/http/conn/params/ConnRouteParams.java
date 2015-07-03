/*    */ package org.apache.http.conn.params;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class ConnRouteParams
/*    */   implements ConnRoutePNames
/*    */ {
/* 14 */   public static final HttpHost NO_HOST = null; public static final HttpRoute NO_ROUTE = null;
/*    */ 
/*    */   ConnRouteParams()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static HttpHost getDefaultProxy(HttpParams params) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static void setDefaultProxy(HttpParams params, HttpHost proxy) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static HttpRoute getForcedRoute(HttpParams params) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static void setForcedRoute(HttpParams params, HttpRoute route) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static InetAddress getLocalAddress(HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static void setLocalAddress(HttpParams params, InetAddress local) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.params.ConnRouteParams
 * JD-Core Version:    0.6.0
 */