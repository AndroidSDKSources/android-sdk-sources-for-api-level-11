/*    */ package org.apache.http.conn.routing;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ import org.apache.http.HttpHost;
/*    */ 
/*    */ public final class HttpRoute
/*    */   implements RouteInfo, Cloneable
/*    */ {
/*    */   public HttpRoute(HttpHost target, InetAddress local, HttpHost[] proxies, boolean secure, RouteInfo.TunnelType tunnelled, RouteInfo.LayerType layered)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public HttpRoute(HttpHost target, InetAddress local, HttpHost proxy, boolean secure, RouteInfo.TunnelType tunnelled, RouteInfo.LayerType layered) { throw new RuntimeException("Stub!"); } 
/*  7 */   public HttpRoute(HttpHost target, InetAddress local, boolean secure) { throw new RuntimeException("Stub!"); } 
/*  8 */   public HttpRoute(HttpHost target) { throw new RuntimeException("Stub!"); } 
/*  9 */   public HttpRoute(HttpHost target, InetAddress local, HttpHost proxy, boolean secure) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final HttpHost getTargetHost() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final int getHopCount() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final HttpHost getHopTarget(int hop) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final HttpHost getProxyHost() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final RouteInfo.TunnelType getTunnelType() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final boolean isTunnelled() { throw new RuntimeException("Stub!"); } 
/* 17 */   public final RouteInfo.LayerType getLayerType() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final boolean isLayered() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final boolean isSecure() { throw new RuntimeException("Stub!"); } 
/* 20 */   public final boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 21 */   public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final String toString() { throw new RuntimeException("Stub!"); } 
/* 23 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.routing.HttpRoute
 * JD-Core Version:    0.6.0
 */