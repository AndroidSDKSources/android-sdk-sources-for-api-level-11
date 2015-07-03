/*   */ package javax.xml.xpath;
/*   */ 
/*   */ public abstract class XPathFactory
/*   */ {
/*   */   public static final String DEFAULT_PROPERTY_NAME = "javax.xml.xpath.XPathFactory";
/*   */   public static final String DEFAULT_OBJECT_MODEL_URI = "http://java.sun.com/jaxp/xpath/dom";
/*   */ 
/*   */   protected XPathFactory()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static final XPathFactory newInstance() { throw new RuntimeException("Stub!"); } 
/* 6 */   public static final XPathFactory newInstance(String uri) throws XPathFactoryConfigurationException { throw new RuntimeException("Stub!"); } 
/* 7 */   public static XPathFactory newInstance(String uri, String factoryClassName, ClassLoader classLoader) throws XPathFactoryConfigurationException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract boolean isObjectModelSupported(String paramString);
/*   */ 
/*   */   public abstract void setFeature(String paramString, boolean paramBoolean)
/*   */     throws XPathFactoryConfigurationException;
/*   */ 
/*   */   public abstract boolean getFeature(String paramString)
/*   */     throws XPathFactoryConfigurationException;
/*   */ 
/*   */   public abstract void setXPathVariableResolver(XPathVariableResolver paramXPathVariableResolver);
/*   */ 
/*   */   public abstract void setXPathFunctionResolver(XPathFunctionResolver paramXPathFunctionResolver);
/*   */ 
/*   */   public abstract XPath newXPath();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.xpath.XPathFactory
 * JD-Core Version:    0.6.0
 */