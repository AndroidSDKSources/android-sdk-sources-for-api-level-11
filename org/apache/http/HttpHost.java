/*    */ package org.apache.http;
/*    */ 
/*    */ public final class HttpHost
/*    */   implements Cloneable
/*    */ {
/*    */   public static final String DEFAULT_SCHEME_NAME = "http";
/*    */   protected final String hostname;
/*    */   protected final String lcHostname;
/*    */   protected final int port;
/*    */   protected final String schemeName;
/*    */ 
/*    */   public HttpHost(String hostname, int port, String scheme)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public HttpHost(String hostname, int port) { throw new RuntimeException("Stub!"); } 
/*  7 */   public HttpHost(String hostname) { throw new RuntimeException("Stub!"); } 
/*  8 */   public HttpHost(HttpHost httphost) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getHostName() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getPort() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getSchemeName() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String toURI() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toHostString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 17 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.HttpHost
 * JD-Core Version:    0.6.0
 */