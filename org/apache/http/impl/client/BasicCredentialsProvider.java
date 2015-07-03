/*   */ package org.apache.http.impl.client;
/*   */ 
/*   */ import org.apache.http.auth.AuthScope;
/*   */ import org.apache.http.auth.Credentials;
/*   */ import org.apache.http.client.CredentialsProvider;
/*   */ 
/*   */ public class BasicCredentialsProvider
/*   */   implements CredentialsProvider
/*   */ {
/*   */   public BasicCredentialsProvider()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public synchronized void setCredentials(AuthScope authscope, Credentials credentials) { throw new RuntimeException("Stub!"); } 
/* 7 */   public synchronized Credentials getCredentials(AuthScope authscope) { throw new RuntimeException("Stub!"); } 
/* 8 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 9 */   public synchronized void clear() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.BasicCredentialsProvider
 * JD-Core Version:    0.6.0
 */