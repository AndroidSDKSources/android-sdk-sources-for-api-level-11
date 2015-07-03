/*   */ package org.apache.http.impl;
/*   */ 
/*   */ import org.apache.http.HttpRequest;
/*   */ import org.apache.http.HttpRequestFactory;
/*   */ import org.apache.http.MethodNotSupportedException;
/*   */ import org.apache.http.RequestLine;
/*   */ 
/*   */ public class DefaultHttpRequestFactory
/*   */   implements HttpRequestFactory
/*   */ {
/*   */   public DefaultHttpRequestFactory()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public HttpRequest newHttpRequest(RequestLine requestline) throws MethodNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 7 */   public HttpRequest newHttpRequest(String method, String uri) throws MethodNotSupportedException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.DefaultHttpRequestFactory
 * JD-Core Version:    0.6.0
 */