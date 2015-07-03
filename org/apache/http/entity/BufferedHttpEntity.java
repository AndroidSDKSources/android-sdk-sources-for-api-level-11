/*    */ package org.apache.http.entity;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import org.apache.http.HttpEntity;
/*    */ 
/*    */ public class BufferedHttpEntity extends HttpEntityWrapper
/*    */ {
/*    */   public BufferedHttpEntity(HttpEntity entity)
/*    */     throws IOException
/*    */   {
/*  5 */     super((HttpEntity)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public long getContentLength() { throw new RuntimeException("Stub!"); } 
/*  7 */   public InputStream getContent() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isChunked() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeTo(OutputStream outstream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isStreaming() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.BufferedHttpEntity
 * JD-Core Version:    0.6.0
 */