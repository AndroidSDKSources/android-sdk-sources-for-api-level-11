/*   */ package org.apache.http.impl.cookie;
/*   */ 
/*   */ import org.apache.http.cookie.Cookie;
/*   */ import org.apache.http.cookie.CookieAttributeHandler;
/*   */ import org.apache.http.cookie.CookieOrigin;
/*   */ import org.apache.http.cookie.MalformedCookieException;
/*   */ import org.apache.http.cookie.SetCookie;
/*   */ 
/*   */ public class RFC2965DomainAttributeHandler
/*   */   implements CookieAttributeHandler
/*   */ {
/*   */   public RFC2965DomainAttributeHandler()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void parse(SetCookie cookie, String domain) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/* 7 */   public boolean domainMatch(String host, String domain) { throw new RuntimeException("Stub!"); } 
/* 8 */   public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/* 9 */   public boolean match(Cookie cookie, CookieOrigin origin) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.RFC2965DomainAttributeHandler
 * JD-Core Version:    0.6.0
 */