/*    */ package org.apache.http.impl.client;
/*    */ 
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import org.apache.http.client.CookieStore;
/*    */ import org.apache.http.cookie.Cookie;
/*    */ 
/*    */ public class BasicCookieStore
/*    */   implements CookieStore
/*    */ {
/*    */   public BasicCookieStore()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public synchronized void addCookie(Cookie cookie) { throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized void addCookies(Cookie[] cookies) { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized List<Cookie> getCookies() { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized boolean clearExpired(Date date) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized void clear() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.BasicCookieStore
 * JD-Core Version:    0.6.0
 */