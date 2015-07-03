/*    */ package android.os;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class MemoryFile
/*    */ {
/*    */   public MemoryFile(String name, int length)
/*    */     throws IOException
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void close() { throw new RuntimeException("Stub!"); } 
/*  6 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int length() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isPurgingAllowed() { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized boolean allowPurging(boolean allowPurging) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public InputStream getInputStream() { throw new RuntimeException("Stub!"); } 
/* 11 */   public OutputStream getOutputStream() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int readBytes(byte[] buffer, int srcOffset, int destOffset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void writeBytes(byte[] buffer, int srcOffset, int destOffset, int count) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.MemoryFile
 * JD-Core Version:    0.6.0
 */