/*    */ package org.apache.http.impl.conn.tsccm;
/*    */ 
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import org.apache.http.conn.ClientConnectionManager;
/*    */ import org.apache.http.conn.ClientConnectionOperator;
/*    */ import org.apache.http.conn.ClientConnectionRequest;
/*    */ import org.apache.http.conn.ManagedClientConnection;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.conn.scheme.SchemeRegistry;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class ThreadSafeClientConnManager
/*    */   implements ClientConnectionManager
/*    */ {
/*    */   protected SchemeRegistry schemeRegistry;
/*    */   protected final AbstractConnPool connectionPool;
/*    */   protected ClientConnectionOperator connOperator;
/*    */ 
/*    */   public ThreadSafeClientConnManager(HttpParams params, SchemeRegistry schreg)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/*  7 */   protected AbstractConnPool createConnectionPool(HttpParams params) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schreg) { throw new RuntimeException("Stub!"); } 
/*  9 */   public SchemeRegistry getSchemeRegistry() { throw new RuntimeException("Stub!"); } 
/* 10 */   public ClientConnectionRequest requestConnection(HttpRoute route, Object state) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void releaseConnection(ManagedClientConnection conn, long validDuration, TimeUnit timeUnit) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getConnectionsInPool(HttpRoute route) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getConnectionsInPool() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void closeIdleConnections(long idleTimeout, TimeUnit tunit) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void closeExpiredConnections() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager
 * JD-Core Version:    0.6.0
 */