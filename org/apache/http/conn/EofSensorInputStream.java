/*    */ package org.apache.http.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class EofSensorInputStream extends InputStream
/*    */   implements ConnectionReleaseTrigger
/*    */ {
/*    */   protected InputStream wrappedStream;
/*    */ 
/*    */   public EofSensorInputStream(InputStream in, EofSensorWatcher watcher)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   protected boolean isReadAllowed() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void checkEOF(int eof) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void checkClose() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void checkAbort() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void releaseConnection() throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void abortConnection() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.EofSensorInputStream
 * JD-Core Version:    0.6.0
 */