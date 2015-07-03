/*    */ package org.apache.http.conn.routing;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ import org.apache.http.HttpHost;
/*    */ 
/*    */ public abstract interface RouteInfo
/*    */ {
/*    */   public abstract HttpHost getTargetHost();
/*    */ 
/*    */   public abstract InetAddress getLocalAddress();
/*    */ 
/*    */   public abstract int getHopCount();
/*    */ 
/*    */   public abstract HttpHost getHopTarget(int paramInt);
/*    */ 
/*    */   public abstract HttpHost getProxyHost();
/*    */ 
/*    */   public abstract TunnelType getTunnelType();
/*    */ 
/*    */   public abstract boolean isTunnelled();
/*    */ 
/*    */   public abstract LayerType getLayerType();
/*    */ 
/*    */   public abstract boolean isLayered();
/*    */ 
/*    */   public abstract boolean isSecure();
/*    */ 
/*    */   public static enum LayerType
/*    */   {
/* 11 */     LAYERED, 
/* 12 */     PLAIN;
/*    */   }
/*    */ 
/*    */   public static enum TunnelType
/*    */   {
/*  6 */     PLAIN, 
/*  7 */     TUNNELLED;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.routing.RouteInfo
 * JD-Core Version:    0.6.0
 */