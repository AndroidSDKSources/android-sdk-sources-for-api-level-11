/*   */ package org.apache.http.impl.cookie;
/*   */ 
/*   */ import org.apache.http.cookie.Cookie;
/*   */ import org.apache.http.cookie.CookieAttributeHandler;
/*   */ import org.apache.http.cookie.CookieOrigin;
/*   */ import org.apache.http.cookie.MalformedCookieException;
/*   */ import org.apache.http.cookie.SetCookie;
/*   */ 
/*   */ public class RFC2965CommentUrlAttributeHandler
/*   */   implements CookieAttributeHandler
/*   */ {
/*   */   public RFC2965CommentUrlAttributeHandler()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void parse(SetCookie cookie, String commenturl) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/* 7 */   public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/* 8 */   public boolean match(Cookie cookie, CookieOrigin origin) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.RFC2965CommentUrlAttributeHandler
 * JD-Core Version:    0.6.0
 */