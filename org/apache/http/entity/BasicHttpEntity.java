/*    */ package org.apache.http.entity;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class BasicHttpEntity extends AbstractHttpEntity
/*    */ {
/*    */   public BasicHttpEntity()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public long getContentLength() { throw new RuntimeException("Stub!"); } 
/*  7 */   public InputStream getContent() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setContentLength(long len) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setContent(InputStream instream) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeTo(OutputStream outstream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isStreaming() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void consumeContent() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.BasicHttpEntity
 * JD-Core Version:    0.6.0
 */