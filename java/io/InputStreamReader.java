/*    */ package java.io;
/*    */ 
/*    */ import java.nio.charset.Charset;
/*    */ import java.nio.charset.CharsetDecoder;
/*    */ 
/*    */ public class InputStreamReader extends Reader
/*    */ {
/*    */   public InputStreamReader(InputStream in)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public InputStreamReader(InputStream in, String enc) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/*  7 */   public InputStreamReader(InputStream in, CharsetDecoder dec) { throw new RuntimeException("Stub!"); } 
/*  8 */   public InputStreamReader(InputStream in, Charset charset) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getEncoding() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public int read(char[] buffer, int offset, int length) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean ready() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.InputStreamReader
 * JD-Core Version:    0.6.0
 */