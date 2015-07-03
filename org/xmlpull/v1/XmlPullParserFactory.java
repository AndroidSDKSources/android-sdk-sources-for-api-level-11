/*    */ package org.xmlpull.v1;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class XmlPullParserFactory
/*    */ {
/*    */   public static final String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
/*    */   protected ArrayList parserClasses;
/*    */   protected String classNamesLocation;
/*    */   protected ArrayList serializerClasses;
/*    */   protected HashMap features;
/*    */ 
/*    */   protected XmlPullParserFactory()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void setFeature(String name, boolean state) throws XmlPullParserException { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean getFeature(String name) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isNamespaceAware() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setValidating(boolean validating) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isValidating() { throw new RuntimeException("Stub!"); } 
/* 11 */   public XmlPullParser newPullParser() throws XmlPullParserException { throw new RuntimeException("Stub!"); } 
/* 12 */   public XmlSerializer newSerializer() throws XmlPullParserException { throw new RuntimeException("Stub!"); } 
/* 13 */   public static XmlPullParserFactory newInstance() throws XmlPullParserException { throw new RuntimeException("Stub!"); } 
/* 14 */   public static XmlPullParserFactory newInstance(String classNames, Class context) throws XmlPullParserException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xmlpull.v1.XmlPullParserFactory
 * JD-Core Version:    0.6.0
 */