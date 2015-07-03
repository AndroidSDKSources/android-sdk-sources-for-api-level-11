/*    */ package org.apache.http.impl.conn.tsccm;
/*    */ 
/*    */ import java.util.LinkedList;
/*    */ import java.util.Queue;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ 
/*    */ public class RouteSpecificPool
/*    */ {
/*    */   protected final HttpRoute route;
/*    */   protected final int maxEntries;
/*    */   protected final LinkedList<BasicPoolEntry> freeEntries;
/*    */   protected final Queue<WaitingThread> waitingThreads;
/*    */   protected int numEntries;
/*    */ 
/*    */   public RouteSpecificPool(HttpRoute route, int maxEntries)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final HttpRoute getRoute() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final int getMaxEntries() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isUnused() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getCapacity() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final int getEntryCount() { throw new RuntimeException("Stub!"); } 
/* 10 */   public BasicPoolEntry allocEntry(Object state) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void freeEntry(BasicPoolEntry entry) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void createdEntry(BasicPoolEntry entry) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean deleteEntry(BasicPoolEntry entry) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void dropEntry() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void queueThread(WaitingThread wt) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean hasThread() { throw new RuntimeException("Stub!"); } 
/* 17 */   public WaitingThread nextThread() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void removeThread(WaitingThread wt) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.RouteSpecificPool
 * JD-Core Version:    0.6.0
 */