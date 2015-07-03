/*    */ package org.apache.http.impl.conn.tsccm;
/*    */ 
/*    */ import java.util.Map;
/*    */ import java.util.Queue;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import java.util.concurrent.locks.Condition;
/*    */ import org.apache.http.conn.ClientConnectionOperator;
/*    */ import org.apache.http.conn.ConnectionPoolTimeoutException;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class ConnPoolByRoute extends AbstractConnPool
/*    */ {
/*    */   protected final ClientConnectionOperator operator;
/*    */   protected Queue<BasicPoolEntry> freeConnections;
/*    */   protected Queue<WaitingThread> waitingThreads;
/*    */   protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
/*    */   protected final int maxTotalConnections;
/*    */ 
/*    */   public ConnPoolByRoute(ClientConnectionOperator operator, HttpParams params)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected Queue<BasicPoolEntry> createFreeConnQueue() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected Queue<WaitingThread> createWaitingThreadQueue() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected RouteSpecificPool newRouteSpecificPool(HttpRoute route) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected WaitingThread newWaitingThread(Condition cond, RouteSpecificPool rospl) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected RouteSpecificPool getRoutePool(HttpRoute route, boolean create) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getConnectionsInPool(HttpRoute route) { throw new RuntimeException("Stub!"); } 
/* 13 */   public PoolEntryRequest requestPoolEntry(HttpRoute route, Object state) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected BasicPoolEntry getEntryBlocking(HttpRoute route, Object state, long timeout, TimeUnit tunit, WaitingThreadAborter aborter) throws ConnectionPoolTimeoutException, InterruptedException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void freeEntry(BasicPoolEntry entry, boolean reusable, long validDuration, TimeUnit timeUnit) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected BasicPoolEntry getFreeEntry(RouteSpecificPool rospl, Object state) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected BasicPoolEntry createEntry(RouteSpecificPool rospl, ClientConnectionOperator op) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void deleteEntry(BasicPoolEntry entry) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void deleteLeastUsedEntry() { throw new RuntimeException("Stub!"); } 
/* 20 */   protected void handleLostEntry(HttpRoute route) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void notifyWaitingThread(RouteSpecificPool rospl) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void deleteClosedConnections() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void shutdown() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.ConnPoolByRoute
 * JD-Core Version:    0.6.0
 */