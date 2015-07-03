/*    */ package org.apache.http.impl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.HttpConnectionMetrics;
/*    */ import org.apache.http.HttpEntityEnclosingRequest;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpRequestFactory;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.HttpServerConnection;
/*    */ import org.apache.http.impl.entity.EntityDeserializer;
/*    */ import org.apache.http.impl.entity.EntitySerializer;
/*    */ import org.apache.http.io.HttpMessageParser;
/*    */ import org.apache.http.io.HttpMessageWriter;
/*    */ import org.apache.http.io.SessionInputBuffer;
/*    */ import org.apache.http.io.SessionOutputBuffer;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public abstract class AbstractHttpServerConnection
/*    */   implements HttpServerConnection
/*    */ {
/*    */   public AbstractHttpServerConnection()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void assertOpen() throws IllegalStateException;
/*    */ 
/*  7 */   protected EntityDeserializer createEntityDeserializer() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected EntitySerializer createEntitySerializer() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected HttpRequestFactory createHttpRequestFactory() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected HttpMessageParser createRequestParser(SessionInputBuffer buffer, HttpRequestFactory requestFactory, HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected HttpMessageWriter createResponseWriter(SessionOutputBuffer buffer, HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void init(SessionInputBuffer inbuffer, SessionOutputBuffer outbuffer, HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 13 */   public HttpRequest receiveRequestHeader() throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void receiveRequestEntity(HttpEntityEnclosingRequest request) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void doFlush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void sendResponseHeader(HttpResponse response) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void sendResponseEntity(HttpResponse response) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isStale() { throw new RuntimeException("Stub!"); } 
/* 20 */   public HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.AbstractHttpServerConnection
 * JD-Core Version:    0.6.0
 */