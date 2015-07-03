/*    */ package org.apache.http.impl.cookie;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.cookie.Cookie;
/*    */ import org.apache.http.cookie.CookieOrigin;
/*    */ import org.apache.http.cookie.MalformedCookieException;
/*    */ 
/*    */ public class NetscapeDraftSpec extends CookieSpecBase
/*    */ {
/*    */   protected static final String EXPIRES_PATTERN = "EEE, dd-MMM-yyyy HH:mm:ss z";
/*    */ 
/*    */   public NetscapeDraftSpec(String[] datepatterns)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public NetscapeDraftSpec() { throw new RuntimeException("Stub!"); } 
/*  7 */   public List<Cookie> parse(Header header, CookieOrigin origin) throws MalformedCookieException { throw new RuntimeException("Stub!"); } 
/*  8 */   public List<Header> formatCookies(List<Cookie> cookies) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getVersion() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Header getVersionHeader() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.NetscapeDraftSpec
 * JD-Core Version:    0.6.0
 */