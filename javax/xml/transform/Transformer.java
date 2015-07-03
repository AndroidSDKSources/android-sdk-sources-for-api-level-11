/*   */ package javax.xml.transform;
/*   */ 
/*   */ import java.util.Properties;
/*   */ 
/*   */ public abstract class Transformer
/*   */ {
/*   */   protected Transformer()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void reset() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void transform(Source paramSource, Result paramResult)
/*   */     throws TransformerException;
/*   */ 
/*   */   public abstract void setParameter(String paramString, Object paramObject);
/*   */ 
/*   */   public abstract Object getParameter(String paramString);
/*   */ 
/*   */   public abstract void clearParameters();
/*   */ 
/*   */   public abstract void setURIResolver(URIResolver paramURIResolver);
/*   */ 
/*   */   public abstract URIResolver getURIResolver();
/*   */ 
/*   */   public abstract void setOutputProperties(Properties paramProperties);
/*   */ 
/*   */   public abstract Properties getOutputProperties();
/*   */ 
/*   */   public abstract void setOutputProperty(String paramString1, String paramString2)
/*   */     throws IllegalArgumentException;
/*   */ 
/*   */   public abstract String getOutputProperty(String paramString)
/*   */     throws IllegalArgumentException;
/*   */ 
/*   */   public abstract void setErrorListener(ErrorListener paramErrorListener)
/*   */     throws IllegalArgumentException;
/*   */ 
/*   */   public abstract ErrorListener getErrorListener();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.Transformer
 * JD-Core Version:    0.6.0
 */