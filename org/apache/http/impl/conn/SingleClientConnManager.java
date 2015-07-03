/*    */ package org.apache.http.impl.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import org.apache.http.conn.ClientConnectionManager;
/*    */ import org.apache.http.conn.ClientConnectionOperator;
/*    */ import org.apache.http.conn.ClientConnectionRequest;
/*    */ import org.apache.http.conn.ManagedClientConnection;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.conn.scheme.SchemeRegistry;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class SingleClientConnManager
/*    */   implements ClientConnectionManager
/*    */ {
/*    */   public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
/*    */   protected SchemeRegistry schemeRegistry;
/*    */   protected ClientConnectionOperator connOperator;
/*    */   protected PoolEntry uniquePoolEntry;
/*    */   protected ConnAdapter managedConn;
/*    */   protected long lastReleaseTime;
/*    */   protected long connectionExpiresTime;
/*    */   protected boolean alwaysShutDown;
/*    */   protected volatile boolean isShutDown;
/*    */ 
/*    */   public SingleClientConnManager(HttpParams params, SchemeRegistry schreg)
/*    */   {
/* 17 */     throw new RuntimeException("Stub!"); } 
/* 18 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 19 */   public SchemeRegistry getSchemeRegistry() { throw new RuntimeException("Stub!"); } 
/* 20 */   protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schreg) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected final void assertStillUp() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 22 */   public final ClientConnectionRequest requestConnection(HttpRoute route, Object state) { throw new RuntimeException("Stub!"); } 
/* 23 */   public ManagedClientConnection getConnection(HttpRoute route, Object state) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void releaseConnection(ManagedClientConnection conn, long validDuration, TimeUnit timeUnit) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void closeExpiredConnections() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void closeIdleConnections(long idletime, TimeUnit tunit) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 28 */   protected void revokeConnection() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected class ConnAdapter extends AbstractPooledConnAdapter
/*    */   {
/*    */     protected ConnAdapter(SingleClientConnManager.PoolEntry entry, HttpRoute route)
/*    */     {
/* 15 */       super((AbstractPoolEntry)null); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   protected class PoolEntry extends AbstractPoolEntry
/*    */   {
/*    */     protected PoolEntry()
/*    */     {
/*  8 */       super((HttpRoute)null); throw new RuntimeException("Stub!"); } 
/*  9 */     protected void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */     protected void shutdown() throws IOException { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.SingleClientConnManager
 * JD-Core Version:    0.6.0
 */