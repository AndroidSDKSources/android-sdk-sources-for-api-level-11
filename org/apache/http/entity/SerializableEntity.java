/*    */ package org.apache.http.entity;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class SerializableEntity extends AbstractHttpEntity
/*    */ {
/*    */   public SerializableEntity(Serializable ser, boolean bufferize)
/*    */     throws IOException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public InputStream getContent() throws IOException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  7 */   public long getContentLength() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isStreaming() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeTo(OutputStream outstream) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.SerializableEntity
 * JD-Core Version:    0.6.0
 */