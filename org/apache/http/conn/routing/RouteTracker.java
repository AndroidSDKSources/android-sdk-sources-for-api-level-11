/*    */ package org.apache.http.conn.routing;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ import org.apache.http.HttpHost;
/*    */ 
/*    */ public final class RouteTracker
/*    */   implements RouteInfo, Cloneable
/*    */ {
/*    */   public RouteTracker(HttpHost target, InetAddress local)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public RouteTracker(HttpRoute route) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final void connectTarget(boolean secure) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final void connectProxy(HttpHost proxy, boolean secure) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final void tunnelTarget(boolean secure) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void tunnelProxy(HttpHost proxy, boolean secure) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void layerProtocol(boolean secure) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final HttpHost getTargetHost() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final int getHopCount() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final HttpHost getHopTarget(int hop) { throw new RuntimeException("Stub!"); } 
/* 16 */   public final HttpHost getProxyHost() { throw new RuntimeException("Stub!"); } 
/* 17 */   public final boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final RouteInfo.TunnelType getTunnelType() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final boolean isTunnelled() { throw new RuntimeException("Stub!"); } 
/* 20 */   public final RouteInfo.LayerType getLayerType() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final boolean isLayered() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final boolean isSecure() { throw new RuntimeException("Stub!"); } 
/* 23 */   public final HttpRoute toRoute() { throw new RuntimeException("Stub!"); } 
/* 24 */   public final boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 25 */   public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 26 */   public final String toString() { throw new RuntimeException("Stub!"); } 
/* 27 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.routing.RouteTracker
 * JD-Core Version:    0.6.0
 */