/*   */ package org.apache.http.impl.conn;
/*   */ 
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpHost;
/*   */ import org.apache.http.HttpRequest;
/*   */ import org.apache.http.conn.routing.HttpRoute;
/*   */ import org.apache.http.conn.routing.HttpRoutePlanner;
/*   */ import org.apache.http.conn.scheme.SchemeRegistry;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class DefaultHttpRoutePlanner
/*   */   implements HttpRoutePlanner
/*   */ {
/*   */   protected SchemeRegistry schemeRegistry;
/*   */ 
/*   */   public DefaultHttpRoutePlanner(SchemeRegistry schreg)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context) throws HttpException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.DefaultHttpRoutePlanner
 * JD-Core Version:    0.6.0
 */