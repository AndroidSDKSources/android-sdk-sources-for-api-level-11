/*    */ package org.apache.http.impl.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.io.HttpTransportMetrics;
/*    */ import org.apache.http.io.SessionInputBuffer;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class LoggingSessionInputBuffer
/*    */   implements SessionInputBuffer
/*    */ {
/*    */   public LoggingSessionInputBuffer(SessionInputBuffer in, Wire wire)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean isDataAvailable(int timeout) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public String readLine() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int readLine(CharArrayBuffer buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.LoggingSessionInputBuffer
 * JD-Core Version:    0.6.0
 */