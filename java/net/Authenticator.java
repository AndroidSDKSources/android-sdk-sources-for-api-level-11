/*    */ package java.net;
/*    */ 
/*    */ public abstract class Authenticator
/*    */ {
/*    */   public Authenticator()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   protected PasswordAuthentication getPasswordAuthentication() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected final int getRequestingPort() { throw new RuntimeException("Stub!"); } 
/* 12 */   protected final InetAddress getRequestingSite() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected final String getRequestingPrompt() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected final String getRequestingProtocol() { throw new RuntimeException("Stub!"); } 
/* 15 */   protected final String getRequestingScheme() { throw new RuntimeException("Stub!"); } 
/* 16 */   public static synchronized PasswordAuthentication requestPasswordAuthentication(InetAddress rAddr, int rPort, String rProtocol, String rPrompt, String rScheme) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static void setDefault(Authenticator a) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static synchronized PasswordAuthentication requestPasswordAuthentication(String rHost, InetAddress rAddr, int rPort, String rProtocol, String rPrompt, String rScheme) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected final String getRequestingHost() { throw new RuntimeException("Stub!"); } 
/* 20 */   public static PasswordAuthentication requestPasswordAuthentication(String rHost, InetAddress rAddr, int rPort, String rProtocol, String rPrompt, String rScheme, URL rURL, RequestorType reqType) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected URL getRequestingURL() { throw new RuntimeException("Stub!"); } 
/* 22 */   protected RequestorType getRequestorType() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum RequestorType
/*    */   {
/*  6 */     PROXY, 
/*  7 */     SERVER;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.Authenticator
 * JD-Core Version:    0.6.0
 */