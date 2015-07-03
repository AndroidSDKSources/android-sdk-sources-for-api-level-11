/*    */ package org.apache.http.impl.cookie;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.cookie.Cookie;
/*    */ import org.apache.http.cookie.CookieOrigin;
/*    */ import org.apache.http.cookie.MalformedCookieException;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class RFC2965Spec extends RFC2109Spec
/*    */ {
/*    */   public RFC2965Spec()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public RFC2965Spec(String[] datepatterns, boolean oneHeader) { throw new RuntimeException("Stub!"); } 
/*  7 */   public List<Cookie> parse(Header header, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean match(Cookie cookie, CookieOrigin origin) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void formatCookieAsVer(CharArrayBuffer buffer, Cookie cookie, int version) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getVersion() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Header getVersionHeader() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.RFC2965Spec
 * JD-Core Version:    0.6.0
 */