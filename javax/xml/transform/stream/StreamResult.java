/*    */ package javax.xml.transform.stream;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.OutputStream;
/*    */ import java.io.Writer;
/*    */ import javax.xml.transform.Result;
/*    */ 
/*    */ public class StreamResult
/*    */   implements Result
/*    */ {
/*    */   public static final String FEATURE = "http://javax.xml.transform.stream.StreamResult/feature";
/*    */ 
/*    */   public StreamResult()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public StreamResult(OutputStream outputStream) { throw new RuntimeException("Stub!"); } 
/*  7 */   public StreamResult(Writer writer) { throw new RuntimeException("Stub!"); } 
/*  8 */   public StreamResult(String systemId) { throw new RuntimeException("Stub!"); } 
/*  9 */   public StreamResult(File f) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setOutputStream(OutputStream outputStream) { throw new RuntimeException("Stub!"); } 
/* 11 */   public OutputStream getOutputStream() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setWriter(Writer writer) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Writer getWriter() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setSystemId(String systemId) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setSystemId(File f) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getSystemId() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.stream.StreamResult
 * JD-Core Version:    0.6.0
 */