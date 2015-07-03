/*    */ package org.apache.http.impl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.HttpClientConnection;
/*    */ import org.apache.http.HttpConnectionMetrics;
/*    */ import org.apache.http.HttpEntityEnclosingRequest;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.HttpResponseFactory;
/*    */ import org.apache.http.impl.entity.EntityDeserializer;
/*    */ import org.apache.http.impl.entity.EntitySerializer;
/*    */ import org.apache.http.io.HttpMessageParser;
/*    */ import org.apache.http.io.HttpMessageWriter;
/*    */ import org.apache.http.io.SessionInputBuffer;
/*    */ import org.apache.http.io.SessionOutputBuffer;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public abstract class AbstractHttpClientConnection
/*    */   implements HttpClientConnection
/*    */ {
/*    */   public AbstractHttpClientConnection()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void assertOpen() throws IllegalStateException;
/*    */ 
/*  7 */   protected EntityDeserializer createEntityDeserializer() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected EntitySerializer createEntitySerializer() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected HttpResponseFactory createHttpResponseFactory() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected HttpMessageParser createResponseParser(SessionInputBuffer buffer, HttpResponseFactory responseFactory, HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected HttpMessageWriter createRequestWriter(SessionOutputBuffer buffer, HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void init(SessionInputBuffer inbuffer, SessionOutputBuffer outbuffer, HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isResponseAvailable(int timeout) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void sendRequestHeader(HttpRequest request) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void sendRequestEntity(HttpEntityEnclosingRequest request) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void doFlush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public HttpResponse receiveResponseHeader() throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void receiveResponseEntity(HttpResponse response) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isStale() { throw new RuntimeException("Stub!"); } 
/* 21 */   public HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.AbstractHttpClientConnection
 * JD-Core Version:    0.6.0
 */