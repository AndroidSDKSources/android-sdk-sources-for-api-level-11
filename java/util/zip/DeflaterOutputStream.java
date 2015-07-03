/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.FilterOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class DeflaterOutputStream extends FilterOutputStream
/*    */ {
/* 14 */   protected byte[] buf = null;
/*    */   protected Deflater def;
/*    */ 
/*    */   public DeflaterOutputStream(OutputStream os, Deflater def)
/*    */   {
/*  5 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public DeflaterOutputStream(OutputStream os) { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public DeflaterOutputStream(OutputStream os, Deflater def, int bsize) { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  8 */   protected void deflate() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void finish() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void write(int i) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void write(byte[] buffer, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void flush() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.zip.DeflaterOutputStream
 * JD-Core Version:    0.6.0
 */