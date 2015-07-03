/*    */ package org.apache.http.impl.io;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import org.apache.http.io.HttpTransportMetrics;
/*    */ import org.apache.http.io.SessionOutputBuffer;
/*    */ import org.apache.http.params.HttpParams;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public abstract class AbstractSessionOutputBuffer
/*    */   implements SessionOutputBuffer
/*    */ {
/*    */   public AbstractSessionOutputBuffer()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected void init(OutputStream outstream, int buffersize, HttpParams params) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void flushBuffer() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void write(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeLine(String s) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void writeLine(CharArrayBuffer s) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.AbstractSessionOutputBuffer
 * JD-Core Version:    0.6.0
 */