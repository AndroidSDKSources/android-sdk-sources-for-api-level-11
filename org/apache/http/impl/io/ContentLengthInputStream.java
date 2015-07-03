/*    */ package org.apache.http.impl.io;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.apache.http.io.SessionInputBuffer;
/*    */ 
/*    */ public class ContentLengthInputStream extends InputStream
/*    */ {
/*    */   public ContentLengthInputStream(SessionInputBuffer in, long contentLength)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.ContentLengthInputStream
 * JD-Core Version:    0.6.0
 */