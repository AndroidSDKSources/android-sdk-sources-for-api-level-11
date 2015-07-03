/*    */ package org.apache.http.conn.scheme;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.apache.http.HttpHost;
/*    */ 
/*    */ public final class SchemeRegistry
/*    */ {
/*    */   public SchemeRegistry()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final synchronized Scheme getScheme(String name) { throw new RuntimeException("Stub!"); } 
/*  6 */   public final synchronized Scheme getScheme(HttpHost host) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final synchronized Scheme get(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final synchronized Scheme register(Scheme sch) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final synchronized Scheme unregister(String name) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final synchronized List<String> getSchemeNames() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized void setItems(Map<String, Scheme> map) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.scheme.SchemeRegistry
 * JD-Core Version:    0.6.0
 */