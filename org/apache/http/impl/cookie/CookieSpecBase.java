/*    */ package org.apache.http.impl.cookie;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.apache.http.HeaderElement;
/*    */ import org.apache.http.cookie.Cookie;
/*    */ import org.apache.http.cookie.CookieOrigin;
/*    */ import org.apache.http.cookie.MalformedCookieException;
/*    */ 
/*    */ public abstract class CookieSpecBase extends AbstractCookieSpec
/*    */ {
/*    */   public CookieSpecBase()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected static String getDefaultPath(CookieOrigin origin) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected static String getDefaultDomain(CookieOrigin origin) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected List<Cookie> parse(HeaderElement[] elems, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean match(Cookie cookie, CookieOrigin origin) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.CookieSpecBase
 * JD-Core Version:    0.6.0
 */