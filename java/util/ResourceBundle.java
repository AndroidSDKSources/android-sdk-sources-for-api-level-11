/*    */ package java.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public abstract class ResourceBundle
/*    */ {
/*    */   protected ResourceBundle parent;
/*    */ 
/*    */   public ResourceBundle()
/*    */   {
/* 25 */     throw new RuntimeException("Stub!"); } 
/* 26 */   public static ResourceBundle getBundle(String bundleName) throws MissingResourceException { throw new RuntimeException("Stub!"); } 
/* 27 */   public static ResourceBundle getBundle(String bundleName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 28 */   public static ResourceBundle getBundle(String bundleName, Locale locale, ClassLoader loader) throws MissingResourceException { throw new RuntimeException("Stub!"); } 
/* 29 */   public static ResourceBundle getBundle(String baseName, Control control) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static ResourceBundle getBundle(String baseName, Locale targetLocale, Control control) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static ResourceBundle getBundle(String baseName, Locale targetLocale, ClassLoader loader, Control control) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Enumeration<String> getKeys();
/*    */ 
/* 33 */   public Locale getLocale() { throw new RuntimeException("Stub!"); } 
/* 34 */   public final Object getObject(String key) { throw new RuntimeException("Stub!"); } 
/* 35 */   public final String getString(String key) { throw new RuntimeException("Stub!"); } 
/* 36 */   public final String[] getStringArray(String key) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract Object handleGetObject(String paramString);
/*    */ 
/* 38 */   protected void setParent(ResourceBundle bundle) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static void clearCache() { throw new RuntimeException("Stub!"); } 
/* 40 */   public static void clearCache(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/* 41 */   public boolean containsKey(String key) { throw new RuntimeException("Stub!"); } 
/* 42 */   public Set<String> keySet() { throw new RuntimeException("Stub!"); } 
/* 43 */   protected Set<String> handleKeySet() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Control
/*    */   {
/* 23 */     public static final List<String> FORMAT_DEFAULT = null; public static final List<String> FORMAT_CLASS = null; public static final List<String> FORMAT_PROPERTIES = null;
/*    */     public static final long TTL_DONT_CACHE = -1L;
/*    */     public static final long TTL_NO_EXPIRATION_CONTROL = -2L;
/*    */ 
/*    */     protected Control()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public static Control getControl(List<String> formats) { throw new RuntimeException("Stub!"); } 
/*  9 */     public static Control getNoFallbackControl(List<String> formats) { throw new RuntimeException("Stub!"); } 
/* 10 */     public List<Locale> getCandidateLocales(String baseName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 11 */     public List<String> getFormats(String baseName) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Locale getFallbackLocale(String baseName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 13 */     public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException { throw new RuntimeException("Stub!"); } 
/* 14 */     public long getTimeToLive(String baseName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 15 */     public boolean needsReload(String baseName, Locale locale, String format, ClassLoader loader, ResourceBundle bundle, long loadTime) { throw new RuntimeException("Stub!"); } 
/* 16 */     public String toBundleName(String baseName, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 17 */     public final String toResourceName(String bundleName, String suffix) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.ResourceBundle
 * JD-Core Version:    0.6.0
 */