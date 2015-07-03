/*   */ package java.net;
/*   */ 
/*   */ public abstract interface CookiePolicy
/*   */ {
/* 5 */   public static final CookiePolicy ACCEPT_ALL = null;
/* 6 */   public static final CookiePolicy ACCEPT_NONE = null;
/* 7 */   public static final CookiePolicy ACCEPT_ORIGINAL_SERVER = null;
/*   */ 
/*   */   public abstract boolean shouldAccept(URI paramURI, HttpCookie paramHttpCookie);
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.CookiePolicy
 * JD-Core Version:    0.6.0
 */