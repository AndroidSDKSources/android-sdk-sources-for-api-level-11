/*   */ package org.apache.http.impl.cookie;
/*   */ 
/*   */ import org.apache.http.cookie.Cookie;
/*   */ import org.apache.http.cookie.CookieAttributeHandler;
/*   */ import org.apache.http.cookie.CookieOrigin;
/*   */ import org.apache.http.cookie.MalformedCookieException;
/*   */ 
/*   */ public abstract class AbstractCookieAttributeHandler
/*   */   implements CookieAttributeHandler
/*   */ {
/*   */   public AbstractCookieAttributeHandler()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/* 7 */   public boolean match(Cookie cookie, CookieOrigin origin) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.AbstractCookieAttributeHandler
 * JD-Core Version:    0.6.0
 */