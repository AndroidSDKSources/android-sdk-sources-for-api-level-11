/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HeaderIterator;
/*    */ import org.apache.http.HttpMessage;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public abstract class AbstractHttpMessage
/*    */   implements HttpMessage
/*    */ {
/*    */   protected HeaderGroup headergroup;
/*    */   protected HttpParams params;
/*    */ 
/*    */   protected AbstractHttpMessage(HttpParams params)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected AbstractHttpMessage() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean containsHeader(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Header[] getHeaders(String name) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Header getFirstHeader(String name) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Header getLastHeader(String name) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Header[] getAllHeaders() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void addHeader(Header header) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void addHeader(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setHeader(Header header) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setHeader(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setHeaders(Header[] headers) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void removeHeader(Header header) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void removeHeaders(String name) { throw new RuntimeException("Stub!"); } 
/* 19 */   public HeaderIterator headerIterator() { throw new RuntimeException("Stub!"); } 
/* 20 */   public HeaderIterator headerIterator(String name) { throw new RuntimeException("Stub!"); } 
/* 21 */   public HttpParams getParams() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setParams(HttpParams params) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.AbstractHttpMessage
 * JD-Core Version:    0.6.0
 */