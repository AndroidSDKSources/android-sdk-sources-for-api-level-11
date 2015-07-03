/*    */ package org.apache.http.entity;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HttpEntity;
/*    */ 
/*    */ public class HttpEntityWrapper
/*    */   implements HttpEntity
/*    */ {
/*    */   protected HttpEntity wrappedEntity;
/*    */ 
/*    */   public HttpEntityWrapper(HttpEntity wrapped)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isChunked() { throw new RuntimeException("Stub!"); } 
/*  8 */   public long getContentLength() { throw new RuntimeException("Stub!"); } 
/*  9 */   public Header getContentType() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Header getContentEncoding() { throw new RuntimeException("Stub!"); } 
/* 11 */   public InputStream getContent() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeTo(OutputStream outstream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isStreaming() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void consumeContent() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.HttpEntityWrapper
 * JD-Core Version:    0.6.0
 */