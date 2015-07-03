/*    */ package org.apache.http.impl.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.conn.ClientConnectionManager;
/*    */ import org.apache.http.conn.OperatedClientConnection;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ import org.apache.http.params.HttpParams;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ 
/*    */ public abstract class AbstractPooledConnAdapter extends AbstractClientConnAdapter
/*    */ {
/*    */   protected volatile AbstractPoolEntry poolEntry;
/*    */ 
/*    */   protected AbstractPooledConnAdapter(ClientConnectionManager manager, AbstractPoolEntry entry)
/*    */   {
/*  5 */     super((ClientConnectionManager)null, (OperatedClientConnection)null); throw new RuntimeException("Stub!"); } 
/*  6 */   protected final void assertAttached() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void detach() { throw new RuntimeException("Stub!"); } 
/*  8 */   public HttpRoute getRoute() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void open(HttpRoute route, HttpContext context, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void tunnelTarget(boolean secure, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void tunnelProxy(HttpHost next, boolean secure, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void layerProtocol(HttpContext context, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void shutdown() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public Object getState() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setState(Object state) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.AbstractPooledConnAdapter
 * JD-Core Version:    0.6.0
 */