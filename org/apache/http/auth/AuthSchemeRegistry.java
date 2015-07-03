/*   */ package org.apache.http.auth;
/*   */ 
/*   */ import java.util.List;
/*   */ import java.util.Map;
/*   */ import org.apache.http.params.HttpParams;
/*   */ 
/*   */ public final class AuthSchemeRegistry
/*   */ {
/*   */   public AuthSchemeRegistry()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public synchronized void register(String name, AuthSchemeFactory factory) { throw new RuntimeException("Stub!"); } 
/* 6 */   public synchronized void unregister(String name) { throw new RuntimeException("Stub!"); } 
/* 7 */   public synchronized AuthScheme getAuthScheme(String name, HttpParams params) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 8 */   public synchronized List<String> getSchemeNames() { throw new RuntimeException("Stub!"); } 
/* 9 */   public synchronized void setItems(Map<String, AuthSchemeFactory> map) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.auth.AuthSchemeRegistry
 * JD-Core Version:    0.6.0
 */