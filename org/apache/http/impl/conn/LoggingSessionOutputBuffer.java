/*    */ package org.apache.http.impl.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.apache.http.io.HttpTransportMetrics;
/*    */ import org.apache.http.io.SessionOutputBuffer;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class LoggingSessionOutputBuffer
/*    */   implements SessionOutputBuffer
/*    */ {
/*    */   public LoggingSessionOutputBuffer(SessionOutputBuffer out, Wire wire)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void write(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeLine(CharArrayBuffer buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeLine(String s) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.LoggingSessionOutputBuffer
 * JD-Core Version:    0.6.0
 */