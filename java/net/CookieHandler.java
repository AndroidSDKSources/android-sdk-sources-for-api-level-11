/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.util.List;
/*   */ import java.util.Map;
/*   */ 
/*   */ public abstract class CookieHandler
/*   */ {
/*   */   public CookieHandler()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static CookieHandler getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public static void setDefault(CookieHandler cHandler) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Map<String, List<String>> get(URI paramURI, Map<String, List<String>> paramMap)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract void put(URI paramURI, Map<String, List<String>> paramMap)
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.CookieHandler
 * JD-Core Version:    0.6.0
 */