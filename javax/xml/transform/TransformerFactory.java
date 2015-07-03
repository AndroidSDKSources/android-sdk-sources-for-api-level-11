/*   */ package javax.xml.transform;
/*   */ 
/*   */ public abstract class TransformerFactory
/*   */ {
/*   */   protected TransformerFactory()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static TransformerFactory newInstance() throws TransformerFactoryConfigurationError { throw new RuntimeException("Stub!"); } 
/* 6 */   public static TransformerFactory newInstance(String factoryClassName, ClassLoader classLoader) throws TransformerFactoryConfigurationError { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Transformer newTransformer(Source paramSource)
/*   */     throws TransformerConfigurationException;
/*   */ 
/*   */   public abstract Transformer newTransformer()
/*   */     throws TransformerConfigurationException;
/*   */ 
/*   */   public abstract Templates newTemplates(Source paramSource)
/*   */     throws TransformerConfigurationException;
/*   */ 
/*   */   public abstract Source getAssociatedStylesheet(Source paramSource, String paramString1, String paramString2, String paramString3)
/*   */     throws TransformerConfigurationException;
/*   */ 
/*   */   public abstract void setURIResolver(URIResolver paramURIResolver);
/*   */ 
/*   */   public abstract URIResolver getURIResolver();
/*   */ 
/*   */   public abstract void setFeature(String paramString, boolean paramBoolean)
/*   */     throws TransformerConfigurationException;
/*   */ 
/*   */   public abstract boolean getFeature(String paramString);
/*   */ 
/*   */   public abstract void setAttribute(String paramString, Object paramObject);
/*   */ 
/*   */   public abstract Object getAttribute(String paramString);
/*   */ 
/*   */   public abstract void setErrorListener(ErrorListener paramErrorListener);
/*   */ 
/*   */   public abstract ErrorListener getErrorListener();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.TransformerFactory
 * JD-Core Version:    0.6.0
 */