/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.FilterOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class InflaterOutputStream extends FilterOutputStream
/*    */ {
/*    */   protected final Inflater inf;
/* 14 */   protected final byte[] buf = null;
/*    */ 
/*    */   public InflaterOutputStream(OutputStream out)
/*    */   {
/*  5 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public InflaterOutputStream(OutputStream out, Inflater inf) { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public InflaterOutputStream(OutputStream out, Inflater inf, int bufferSize) { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void finish() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void write(int b) throws IOException, ZipException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void write(byte[] bytes, int offset, int byteCount) throws IOException, ZipException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.zip.InflaterOutputStream
 * JD-Core Version:    0.6.0
 */