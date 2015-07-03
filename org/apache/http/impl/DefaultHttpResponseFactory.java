/*   */ package org.apache.http.impl;
/*   */ 
/*   */ import java.util.Locale;
/*   */ import org.apache.http.HttpResponse;
/*   */ import org.apache.http.HttpResponseFactory;
/*   */ import org.apache.http.ProtocolVersion;
/*   */ import org.apache.http.ReasonPhraseCatalog;
/*   */ import org.apache.http.StatusLine;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class DefaultHttpResponseFactory
/*   */   implements HttpResponseFactory
/*   */ {
/*   */   protected final ReasonPhraseCatalog reasonCatalog;
/*   */ 
/*   */   public DefaultHttpResponseFactory(ReasonPhraseCatalog catalog)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public DefaultHttpResponseFactory() { throw new RuntimeException("Stub!"); } 
/* 7 */   public HttpResponse newHttpResponse(ProtocolVersion ver, int status, HttpContext context) { throw new RuntimeException("Stub!"); } 
/* 8 */   public HttpResponse newHttpResponse(StatusLine statusline, HttpContext context) { throw new RuntimeException("Stub!"); } 
/* 9 */   protected Locale determineLocale(HttpContext context) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.DefaultHttpResponseFactory
 * JD-Core Version:    0.6.0
 */