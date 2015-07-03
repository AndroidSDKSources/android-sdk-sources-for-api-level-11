/*    */ package javax.xml.parsers;
/*    */ 
/*    */ import javax.xml.validation.Schema;
/*    */ 
/*    */ public abstract class DocumentBuilderFactory
/*    */ {
/*    */   protected DocumentBuilderFactory()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static DocumentBuilderFactory newInstance() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static DocumentBuilderFactory newInstance(String factoryClassName, ClassLoader classLoader) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract DocumentBuilder newDocumentBuilder() throws ParserConfigurationException;
/*    */ 
/*  8 */   public void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setValidating(boolean validating) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setIgnoringElementContentWhitespace(boolean whitespace) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setExpandEntityReferences(boolean expandEntityRef) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setIgnoringComments(boolean ignoreComments) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setCoalescing(boolean coalescing) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isNamespaceAware() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isValidating() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean isIgnoringElementContentWhitespace() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isExpandEntityReferences() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isIgnoringComments() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isCoalescing() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void setAttribute(String paramString, Object paramObject) throws IllegalArgumentException;
/*    */ 
/*    */   public abstract Object getAttribute(String paramString) throws IllegalArgumentException;
/*    */ 
/*    */   public abstract void setFeature(String paramString, boolean paramBoolean) throws ParserConfigurationException;
/*    */ 
/*    */   public abstract boolean getFeature(String paramString) throws ParserConfigurationException;
/*    */ 
/* 24 */   public Schema getSchema() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setSchema(Schema schema) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setXIncludeAware(boolean state) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isXIncludeAware() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.parsers.DocumentBuilderFactory
 * JD-Core Version:    0.6.0
 */