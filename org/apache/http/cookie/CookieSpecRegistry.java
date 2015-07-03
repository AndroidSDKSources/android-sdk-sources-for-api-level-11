/*    */ package org.apache.http.cookie;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public final class CookieSpecRegistry
/*    */ {
/*    */   public CookieSpecRegistry()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public synchronized void register(String name, CookieSpecFactory factory) { throw new RuntimeException("Stub!"); } 
/*  6 */   public synchronized void unregister(String id) { throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized CookieSpec getCookieSpec(String name, HttpParams params) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized CookieSpec getCookieSpec(String name) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized List<String> getSpecNames() { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized void setItems(Map<String, CookieSpecFactory> map) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.cookie.CookieSpecRegistry
 * JD-Core Version:    0.6.0
 */