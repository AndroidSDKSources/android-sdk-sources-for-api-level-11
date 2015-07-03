/*    */ package android.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.Reader;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import org.xml.sax.ContentHandler;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlSerializer;
/*    */ 
/*    */ public class Xml
/*    */ {
/*    */   public static String FEATURE_RELAXED;
/*    */ 
/*    */   public Xml()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public static void parse(String xml, ContentHandler contentHandler) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 13 */   public static void parse(Reader in, ContentHandler contentHandler) throws IOException, SAXException { throw new RuntimeException("Stub!"); } 
/* 14 */   public static void parse(InputStream in, Encoding encoding, ContentHandler contentHandler) throws IOException, SAXException { throw new RuntimeException("Stub!"); } 
/* 15 */   public static XmlPullParser newPullParser() { throw new RuntimeException("Stub!"); } 
/* 16 */   public static XmlSerializer newSerializer() { throw new RuntimeException("Stub!"); } 
/* 17 */   public static Encoding findEncodingByName(String encodingName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 18 */   public static AttributeSet asAttributeSet(XmlPullParser parser) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Encoding
/*    */   {
/*  6 */     ISO_8859_1, 
/*  7 */     US_ASCII, 
/*  8 */     UTF_16, 
/*  9 */     UTF_8;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.util.Xml
 * JD-Core Version:    0.6.0
 */