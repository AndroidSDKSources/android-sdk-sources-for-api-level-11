/*    */ package org.apache.http.protocol;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.HttpClientConnection;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpResponse;
/*    */ 
/*    */ public class HttpRequestExecutor
/*    */ {
/*    */   public HttpRequestExecutor()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   protected boolean canResponseHaveBody(HttpRequest request, HttpResponse response) { throw new RuntimeException("Stub!"); } 
/*  6 */   public HttpResponse execute(HttpRequest request, HttpClientConnection conn, HttpContext context) throws IOException, HttpException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void preProcess(HttpRequest request, HttpProcessor processor, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   protected HttpResponse doSendRequest(HttpRequest request, HttpClientConnection conn, HttpContext context) throws IOException, HttpException { throw new RuntimeException("Stub!"); } 
/*  9 */   protected HttpResponse doReceiveResponse(HttpRequest request, HttpClientConnection conn, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void postProcess(HttpResponse response, HttpProcessor processor, HttpContext context) throws HttpException, IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.protocol.HttpRequestExecutor
 * JD-Core Version:    0.6.0
 */