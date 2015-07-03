/*    */ package javax.xml.transform.sax;
/*    */ 
/*    */ import javax.xml.transform.Source;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.XMLReader;
/*    */ 
/*    */ public class SAXSource
/*    */   implements Source
/*    */ {
/*    */   public static final String FEATURE = "http://javax.xml.transform.sax.SAXSource/feature";
/*    */ 
/*    */   public SAXSource()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SAXSource(XMLReader reader, InputSource inputSource) { throw new RuntimeException("Stub!"); } 
/*  7 */   public SAXSource(InputSource inputSource) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setXMLReader(XMLReader reader) { throw new RuntimeException("Stub!"); } 
/*  9 */   public XMLReader getXMLReader() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setInputSource(InputSource inputSource) { throw new RuntimeException("Stub!"); } 
/* 11 */   public InputSource getInputSource() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setSystemId(String systemId) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getSystemId() { throw new RuntimeException("Stub!"); } 
/* 14 */   public static InputSource sourceToInputSource(Source source) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.sax.SAXSource
 * JD-Core Version:    0.6.0
 */