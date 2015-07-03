/*    */ package org.apache.http.entity;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HttpEntity;
/*    */ 
/*    */ public abstract class AbstractHttpEntity
/*    */   implements HttpEntity
/*    */ {
/*    */   protected Header contentType;
/*    */   protected Header contentEncoding;
/*    */   protected boolean chunked;
/*    */ 
/*    */   protected AbstractHttpEntity()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Header getContentType() { throw new RuntimeException("Stub!"); } 
/*  7 */   public Header getContentEncoding() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isChunked() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setContentType(Header contentType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setContentType(String ctString) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setContentEncoding(Header contentEncoding) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setContentEncoding(String ceString) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setChunked(boolean b) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void consumeContent() throws IOException, UnsupportedOperationException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.AbstractHttpEntity
 * JD-Core Version:    0.6.0
 */