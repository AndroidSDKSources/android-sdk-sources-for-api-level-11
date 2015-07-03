/*   */ package org.apache.http.impl.client;
/*   */ 
/*   */ import org.apache.http.HttpResponse;
/*   */ import org.apache.http.conn.ConnectionKeepAliveStrategy;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class DefaultConnectionKeepAliveStrategy
/*   */   implements ConnectionKeepAliveStrategy
/*   */ {
/*   */   public DefaultConnectionKeepAliveStrategy()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public long getKeepAliveDuration(HttpResponse response, HttpContext context) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy
 * JD-Core Version:    0.6.0
 */