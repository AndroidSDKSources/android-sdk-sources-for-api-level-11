/*    */ package org.apache.http.entity;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class EntityTemplate extends AbstractHttpEntity
/*    */ {
/*    */   public EntityTemplate(ContentProducer contentproducer)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public long getContentLength() { throw new RuntimeException("Stub!"); } 
/*  7 */   public InputStream getContent() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeTo(OutputStream outstream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isStreaming() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void consumeContent() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.EntityTemplate
 * JD-Core Version:    0.6.0
 */