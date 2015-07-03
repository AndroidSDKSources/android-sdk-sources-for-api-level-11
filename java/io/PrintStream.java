/*    */ package java.io;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class PrintStream extends FilterOutputStream
/*    */   implements Appendable, Closeable
/*    */ {
/*    */   public PrintStream(OutputStream out)
/*    */   {
/*  6 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public PrintStream(OutputStream out, boolean autoflush) { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public PrintStream(OutputStream out, boolean autoflush, String enc) throws UnsupportedEncodingException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/*  9 */   public PrintStream(File file) throws FileNotFoundException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 10 */   public PrintStream(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 11 */   public PrintStream(String fileName) throws FileNotFoundException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 12 */   public PrintStream(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean checkError() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void clearError() { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized void close() { throw new RuntimeException("Stub!"); } 
/* 16 */   public synchronized void flush() { throw new RuntimeException("Stub!"); } 
/* 17 */   public PrintStream format(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 18 */   public PrintStream format(Locale l, String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 19 */   public PrintStream printf(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 20 */   public PrintStream printf(Locale l, String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void print(char[] charArray) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void print(char ch) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void print(double dnum) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void print(float fnum) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void print(int inum) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void print(long lnum) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void print(Object obj) { throw new RuntimeException("Stub!"); } 
/* 28 */   public synchronized void print(String str) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void print(boolean bool) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void println() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void println(char[] charArray) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void println(char ch) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void println(double dnum) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void println(float fnum) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void println(int inum) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void println(long lnum) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void println(Object obj) { throw new RuntimeException("Stub!"); } 
/* 38 */   public synchronized void println(String str) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void println(boolean bool) { throw new RuntimeException("Stub!"); } 
/* 40 */   protected void setError() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void write(byte[] buffer, int offset, int length) { throw new RuntimeException("Stub!"); } 
/* 42 */   public synchronized void write(int oneByte) { throw new RuntimeException("Stub!"); } 
/* 43 */   public PrintStream append(char c) { throw new RuntimeException("Stub!"); } 
/* 44 */   public PrintStream append(CharSequence csq) { throw new RuntimeException("Stub!"); } 
/* 45 */   public PrintStream append(CharSequence csq, int start, int end) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.PrintStream
 * JD-Core Version:    0.6.0
 */