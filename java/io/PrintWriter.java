/*    */ package java.io;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class PrintWriter extends Writer
/*    */ {
/*    */   protected Writer out;
/*    */ 
/*    */   public PrintWriter(OutputStream out)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PrintWriter(OutputStream out, boolean autoflush) { throw new RuntimeException("Stub!"); } 
/*  7 */   public PrintWriter(Writer wr) { throw new RuntimeException("Stub!"); } 
/*  8 */   public PrintWriter(Writer wr, boolean autoflush) { throw new RuntimeException("Stub!"); } 
/*  9 */   public PrintWriter(File file) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 10 */   public PrintWriter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 11 */   public PrintWriter(String fileName) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 12 */   public PrintWriter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean checkError() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void clearError() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void flush() { throw new RuntimeException("Stub!"); } 
/* 17 */   public PrintWriter format(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 18 */   public PrintWriter format(Locale l, String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 19 */   public PrintWriter printf(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 20 */   public PrintWriter printf(Locale l, String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void print(char[] charArray) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void print(char ch) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void print(double dnum) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void print(float fnum) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void print(int inum) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void print(long lnum) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void print(Object obj) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void print(String str) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void print(boolean bool) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void println() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void println(char[] charArray) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void println(char ch) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void println(double dnum) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void println(float fnum) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void println(int inum) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void println(long lnum) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void println(Object obj) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void println(String str) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void println(boolean bool) { throw new RuntimeException("Stub!"); } 
/* 40 */   protected void setError() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void write(char[] buf) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void write(char[] buf, int offset, int count) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void write(int oneChar) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void write(String str) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void write(String str, int offset, int count) { throw new RuntimeException("Stub!"); } 
/* 46 */   public PrintWriter append(char c) { throw new RuntimeException("Stub!"); } 
/* 47 */   public PrintWriter append(CharSequence csq) { throw new RuntimeException("Stub!"); } 
/* 48 */   public PrintWriter append(CharSequence csq, int start, int end) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.PrintWriter
 * JD-Core Version:    0.6.0
 */