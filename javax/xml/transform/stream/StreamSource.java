/*    */ package javax.xml.transform.stream;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.InputStream;
/*    */ import java.io.Reader;
/*    */ import javax.xml.transform.Source;
/*    */ 
/*    */ public class StreamSource
/*    */   implements Source
/*    */ {
/*    */   public static final String FEATURE = "http://javax.xml.transform.stream.StreamSource/feature";
/*    */ 
/*    */   public StreamSource()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public StreamSource(InputStream inputStream) { throw new RuntimeException("Stub!"); } 
/*  7 */   public StreamSource(InputStream inputStream, String systemId) { throw new RuntimeException("Stub!"); } 
/*  8 */   public StreamSource(Reader reader) { throw new RuntimeException("Stub!"); } 
/*  9 */   public StreamSource(Reader reader, String systemId) { throw new RuntimeException("Stub!"); } 
/* 10 */   public StreamSource(String systemId) { throw new RuntimeException("Stub!"); } 
/* 11 */   public StreamSource(File f) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setInputStream(InputStream inputStream) { throw new RuntimeException("Stub!"); } 
/* 13 */   public InputStream getInputStream() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setReader(Reader reader) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Reader getReader() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setPublicId(String publicId) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getPublicId() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setSystemId(String systemId) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String getSystemId() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setSystemId(File f) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.stream.StreamSource
 * JD-Core Version:    0.6.0
 */