/*    */ package java.io;
/*    */ 
/*    */ public abstract class FilterWriter extends Writer
/*    */ {
/*    */   protected Writer out;
/*    */ 
/*    */   protected FilterWriter(Writer out)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void write(char[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void write(int oneChar) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void write(String str, int offset, int count) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.FilterWriter
 * JD-Core Version:    0.6.0
 */