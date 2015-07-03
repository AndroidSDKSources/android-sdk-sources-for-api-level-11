/*    */ package org.apache.http.entity;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class ByteArrayEntity extends AbstractHttpEntity
/*    */   implements Cloneable
/*    */ {
/* 13 */   protected final byte[] content = null;
/*    */ 
/*    */   public ByteArrayEntity(byte[] b)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/*  8 */   public long getContentLength() { throw new RuntimeException("Stub!"); } 
/*  9 */   public InputStream getContent() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeTo(OutputStream outstream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isStreaming() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.ByteArrayEntity
 * JD-Core Version:    0.6.0
 */