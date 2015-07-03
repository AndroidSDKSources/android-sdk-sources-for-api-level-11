/*    */ package org.apache.http.impl.conn.tsccm;
/*    */ 
/*    */ import java.lang.ref.Reference;
/*    */ import java.lang.ref.ReferenceQueue;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import java.util.concurrent.locks.Lock;
/*    */ import org.apache.http.conn.ConnectionPoolTimeoutException;
/*    */ import org.apache.http.conn.OperatedClientConnection;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.impl.conn.IdleConnectionHandler;
/*    */ 
/*    */ public abstract class AbstractConnPool
/*    */   implements RefQueueHandler
/*    */ {
/*    */   protected final Lock poolLock;
/*    */   protected Set<BasicPoolEntryRef> issuedConnections;
/*    */   protected IdleConnectionHandler idleConnHandler;
/*    */   protected int numConnections;
/*    */   protected ReferenceQueue<Object> refQueue;
/*    */   protected volatile boolean isShutDown;
/*    */ 
/*    */   protected AbstractConnPool()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void enableConnectionGC() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  7 */   public final BasicPoolEntry getEntry(HttpRoute route, Object state, long timeout, TimeUnit tunit) throws ConnectionPoolTimeoutException, InterruptedException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract PoolEntryRequest requestPoolEntry(HttpRoute paramHttpRoute, Object paramObject);
/*    */ 
/*    */   public abstract void freeEntry(BasicPoolEntry paramBasicPoolEntry, boolean paramBoolean, long paramLong, TimeUnit paramTimeUnit);
/*    */ 
/* 10 */   public void handleReference(Reference ref) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void handleLostEntry(HttpRoute paramHttpRoute);
/*    */ 
/* 12 */   public void closeIdleConnections(long idletime, TimeUnit tunit) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void closeExpiredConnections() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void deleteClosedConnections();
/*    */ 
/* 15 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void closeConnection(OperatedClientConnection conn) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.AbstractConnPool
 * JD-Core Version:    0.6.0
 */