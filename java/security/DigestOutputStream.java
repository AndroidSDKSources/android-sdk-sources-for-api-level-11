/*    */ package java.security;
/*    */ 
/*    */ import java.io.FilterOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class DigestOutputStream extends FilterOutputStream
/*    */ {
/*    */   protected MessageDigest digest;
/*    */ 
/*    */   public DigestOutputStream(OutputStream stream, MessageDigest digest)
/*    */   {
/*  5 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public MessageDigest getMessageDigest() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setMessageDigest(MessageDigest digest) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void on(boolean on) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.DigestOutputStream
 * JD-Core Version:    0.6.0
 */