/*    */ package org.apache.http.impl.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.conn.ClientConnectionOperator;
/*    */ import org.apache.http.conn.OperatedClientConnection;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.conn.routing.RouteTracker;
/*    */ import org.apache.http.params.HttpParams;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ 
/*    */ public abstract class AbstractPoolEntry
/*    */ {
/*    */   protected final ClientConnectionOperator connOperator;
/*    */   protected final OperatedClientConnection connection;
/*    */   protected volatile HttpRoute route;
/*    */   protected volatile Object state;
/*    */   protected volatile RouteTracker tracker;
/*    */ 
/*    */   protected AbstractPoolEntry(ClientConnectionOperator connOperator, HttpRoute route)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Object getState() { throw new RuntimeException("Stub!"); } 
/*  6 */   public void setState(Object state) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void open(HttpRoute route, HttpContext context, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void tunnelTarget(boolean secure, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void tunnelProxy(HttpHost next, boolean secure, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void layerProtocol(HttpContext context, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void shutdownEntry() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.AbstractPoolEntry
 * JD-Core Version:    0.6.0
 */