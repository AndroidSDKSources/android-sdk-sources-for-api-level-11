/*    */ package org.apache.http.protocol;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.ConnectionReuseStrategy;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.HttpResponseFactory;
/*    */ import org.apache.http.HttpServerConnection;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class HttpService
/*    */ {
/*    */   public HttpService(HttpProcessor proc, ConnectionReuseStrategy connStrategy, HttpResponseFactory responseFactory)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void setHttpProcessor(HttpProcessor processor) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void setConnReuseStrategy(ConnectionReuseStrategy connStrategy) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setResponseFactory(HttpResponseFactory responseFactory) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setHandlerResolver(HttpRequestHandlerResolver handlerResolver) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setExpectationVerifier(HttpExpectationVerifier expectationVerifier) { throw new RuntimeException("Stub!"); } 
/* 10 */   public HttpParams getParams() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setParams(HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void handleRequest(HttpServerConnection conn, HttpContext context) throws IOException, HttpException { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void handleException(HttpException ex, HttpResponse response) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void doService(HttpRequest request, HttpResponse response, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.protocol.HttpService
 * JD-Core Version:    0.6.0
 */