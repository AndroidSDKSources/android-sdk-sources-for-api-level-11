/*    */ package org.apache.http.impl.cookie;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.cookie.Cookie;
/*    */ import org.apache.http.cookie.CookieOrigin;
/*    */ import org.apache.http.cookie.MalformedCookieException;
/*    */ 
/*    */ public class BrowserCompatSpec extends CookieSpecBase
/*    */ {
/* 11 */   protected static final String[] DATE_PATTERNS = null;
/*    */ 
/*    */   public BrowserCompatSpec(String[] datepatterns)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public BrowserCompatSpec() { throw new RuntimeException("Stub!"); } 
/*  7 */   public List<Cookie> parse(Header header, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/*  8 */   public List<Header> formatCookies(List<Cookie> cookies) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getVersion() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Header getVersionHeader() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.BrowserCompatSpec
 * JD-Core Version:    0.6.0
 */