/*    */ package org.apache.http.protocol;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpRequestInterceptor;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.HttpResponseInterceptor;
/*    */ 
/*    */ public final class BasicHttpProcessor
/*    */   implements HttpProcessor, HttpRequestInterceptorList, HttpResponseInterceptorList, Cloneable
/*    */ {
/*    */   protected List requestInterceptors;
/*    */   protected List responseInterceptors;
/*    */ 
/*    */   public BasicHttpProcessor()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void addRequestInterceptor(HttpRequestInterceptor itcp) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void addRequestInterceptor(HttpRequestInterceptor itcp, int index) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void addResponseInterceptor(HttpResponseInterceptor itcp, int index) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void removeRequestInterceptorByClass(Class clazz) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void removeResponseInterceptorByClass(Class clazz) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void addInterceptor(HttpRequestInterceptor interceptor) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void addInterceptor(HttpRequestInterceptor interceptor, int index) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getRequestInterceptorCount() { throw new RuntimeException("Stub!"); } 
/* 14 */   public HttpRequestInterceptor getRequestInterceptor(int index) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void clearRequestInterceptors() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void addResponseInterceptor(HttpResponseInterceptor itcp) { throw new RuntimeException("Stub!"); } 
/* 17 */   public final void addInterceptor(HttpResponseInterceptor interceptor) { throw new RuntimeException("Stub!"); } 
/* 18 */   public final void addInterceptor(HttpResponseInterceptor interceptor, int index) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getResponseInterceptorCount() { throw new RuntimeException("Stub!"); } 
/* 20 */   public HttpResponseInterceptor getResponseInterceptor(int index) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void clearResponseInterceptors() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setInterceptors(List list) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void clearInterceptors() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void process(HttpRequest request, HttpContext context) throws IOException, HttpException { throw new RuntimeException("Stub!"); } 
/* 25 */   public void process(HttpResponse response, HttpContext context) throws IOException, HttpException { throw new RuntimeException("Stub!"); } 
/* 26 */   protected void copyInterceptors(BasicHttpProcessor target) { throw new RuntimeException("Stub!"); } 
/* 27 */   public BasicHttpProcessor copy() { throw new RuntimeException("Stub!"); } 
/* 28 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.protocol.BasicHttpProcessor
 * JD-Core Version:    0.6.0
 */