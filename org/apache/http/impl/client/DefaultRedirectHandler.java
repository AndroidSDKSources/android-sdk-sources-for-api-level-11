/*   */ package org.apache.http.impl.client;
/*   */ 
/*   */ import java.net.URI;
/*   */ import org.apache.http.HttpResponse;
/*   */ import org.apache.http.ProtocolException;
/*   */ import org.apache.http.client.RedirectHandler;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class DefaultRedirectHandler
/*   */   implements RedirectHandler
/*   */ {
/*   */   public DefaultRedirectHandler()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean isRedirectRequested(HttpResponse response, HttpContext context) { throw new RuntimeException("Stub!"); } 
/* 7 */   public URI getLocationURI(HttpResponse response, HttpContext context) throws ProtocolException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.DefaultRedirectHandler
 * JD-Core Version:    0.6.0
 */