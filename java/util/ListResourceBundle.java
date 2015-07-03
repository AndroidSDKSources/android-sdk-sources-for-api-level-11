/*   */ package java.util;
/*   */ 
/*   */ public abstract class ListResourceBundle extends ResourceBundle
/*   */ {
/*   */   public ListResourceBundle()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/*   */   protected abstract Object[][] getContents();
/*   */ 
/* 7 */   public Enumeration<String> getKeys() { throw new RuntimeException("Stub!"); } 
/* 8 */   public final Object handleGetObject(String key) { throw new RuntimeException("Stub!"); } 
/* 9 */   protected Set<String> handleKeySet() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.ListResourceBundle
 * JD-Core Version:    0.6.0
 */