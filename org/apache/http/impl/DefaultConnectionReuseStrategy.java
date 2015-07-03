/*   */ package org.apache.http.impl;
/*   */ 
/*   */ import org.apache.http.ConnectionReuseStrategy;
/*   */ import org.apache.http.HeaderIterator;
/*   */ import org.apache.http.HttpResponse;
/*   */ import org.apache.http.TokenIterator;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class DefaultConnectionReuseStrategy
/*   */   implements ConnectionReuseStrategy
/*   */ {
/*   */   public DefaultConnectionReuseStrategy()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean keepAlive(HttpResponse response, HttpContext context) { throw new RuntimeException("Stub!"); } 
/* 7 */   protected TokenIterator createTokenIterator(HeaderIterator hit) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.DefaultConnectionReuseStrategy
 * JD-Core Version:    0.6.0
 */