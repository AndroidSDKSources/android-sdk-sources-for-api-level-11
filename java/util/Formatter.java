/*    */ package java.util;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.Flushable;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ 
/*    */ public final class Formatter
/*    */   implements Closeable, Flushable
/*    */ {
/*    */   public Formatter()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public Formatter(Appendable a) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Formatter(Locale l) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Formatter(Appendable a, Locale l) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Formatter(String fileName) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 15 */   public Formatter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 16 */   public Formatter(String fileName, String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 17 */   public Formatter(File file) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 18 */   public Formatter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 19 */   public Formatter(File file, String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 20 */   public Formatter(OutputStream os) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Formatter(OutputStream os, String csn) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 22 */   public Formatter(OutputStream os, String csn, Locale l) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 23 */   public Formatter(PrintStream ps) { throw new RuntimeException("Stub!"); } 
/* 24 */   public Locale locale() { throw new RuntimeException("Stub!"); } 
/* 25 */   public Appendable out() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void flush() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 29 */   public IOException ioException() { throw new RuntimeException("Stub!"); } 
/* 30 */   public Formatter format(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 31 */   public Formatter format(Locale l, String format, Object[] args) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum BigDecimalLayoutForm
/*    */   {
/*  7 */     DECIMAL_FLOAT, 
/*  8 */     SCIENTIFIC;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Formatter
 * JD-Core Version:    0.6.0
 */