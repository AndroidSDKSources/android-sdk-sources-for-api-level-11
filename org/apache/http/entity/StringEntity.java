/*    */ package org.apache.http.entity;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ 
/*    */ public class StringEntity extends AbstractHttpEntity
/*    */   implements Cloneable
/*    */ {
/* 14 */   protected final byte[] content = null;
/*    */ 
/*    */   public StringEntity(String s, String charset)
/*    */     throws UnsupportedEncodingException
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public StringEntity(String s) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/*  9 */   public long getContentLength() { throw new RuntimeException("Stub!"); } 
/* 10 */   public InputStream getContent() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeTo(OutputStream outstream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isStreaming() { throw new RuntimeException("Stub!"); } 
/* 13 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.StringEntity
 * JD-Core Version:    0.6.0
 */