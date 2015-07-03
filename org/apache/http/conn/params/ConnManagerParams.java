/*    */ package org.apache.http.conn.params;
/*    */ 
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public final class ConnManagerParams
/*    */   implements ConnManagerPNames
/*    */ {
/*    */   public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;
/*    */ 
/*    */   public ConnManagerParams()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static long getTimeout(HttpParams params) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static void setTimeout(HttpParams params, long timeout) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static void setMaxConnectionsPerRoute(HttpParams params, ConnPerRoute connPerRoute) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static ConnPerRoute getMaxConnectionsPerRoute(HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static void setMaxTotalConnections(HttpParams params, int maxTotalConnections) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static int getMaxTotalConnections(HttpParams params) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.params.ConnManagerParams
 * JD-Core Version:    0.6.0
 */