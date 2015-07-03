/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ 
/*   */ public class HttpRetryException extends IOException
/*   */ {
/*   */   public HttpRetryException(String detail, int code)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public HttpRetryException(String detail, int code, String location) { throw new RuntimeException("Stub!"); } 
/* 7 */   public String getLocation() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getReason() { throw new RuntimeException("Stub!"); } 
/* 9 */   public int responseCode() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.HttpRetryException
 * JD-Core Version:    0.6.0
 */