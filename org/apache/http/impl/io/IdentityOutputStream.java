/*    */ package org.apache.http.impl.io;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import org.apache.http.io.SessionOutputBuffer;
/*    */ 
/*    */ public class IdentityOutputStream extends OutputStream
/*    */ {
/*    */   public IdentityOutputStream(SessionOutputBuffer out)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void write(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.IdentityOutputStream
 * JD-Core Version:    0.6.0
 */