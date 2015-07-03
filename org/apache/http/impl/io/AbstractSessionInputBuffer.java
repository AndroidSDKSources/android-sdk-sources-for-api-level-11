/*    */ package org.apache.http.impl.io;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.apache.http.io.HttpTransportMetrics;
/*    */ import org.apache.http.io.SessionInputBuffer;
/*    */ import org.apache.http.params.HttpParams;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public abstract class AbstractSessionInputBuffer
/*    */   implements SessionInputBuffer
/*    */ {
/*    */   public AbstractSessionInputBuffer()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected void init(InputStream instream, int buffersize, HttpParams params) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected int fillBuffer() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   protected boolean hasBufferedData() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public int readLine(CharArrayBuffer charbuffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public String readLine() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.AbstractSessionInputBuffer
 * JD-Core Version:    0.6.0
 */