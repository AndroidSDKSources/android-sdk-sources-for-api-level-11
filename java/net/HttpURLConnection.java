/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.security.Permission;
/*    */ 
/*    */ public abstract class HttpURLConnection extends URLConnection
/*    */ {
/*    */   protected String method;
/*    */   protected int responseCode;
/*    */   protected String responseMessage;
/*    */   protected boolean instanceFollowRedirects;
/*    */   protected int chunkLength;
/*    */   protected int fixedContentLength;
/*    */   public static final int HTTP_ACCEPTED = 202;
/*    */   public static final int HTTP_BAD_GATEWAY = 502;
/*    */   public static final int HTTP_BAD_METHOD = 405;
/*    */   public static final int HTTP_BAD_REQUEST = 400;
/*    */   public static final int HTTP_CLIENT_TIMEOUT = 408;
/*    */   public static final int HTTP_CONFLICT = 409;
/*    */   public static final int HTTP_CREATED = 201;
/*    */   public static final int HTTP_ENTITY_TOO_LARGE = 413;
/*    */   public static final int HTTP_FORBIDDEN = 403;
/*    */   public static final int HTTP_GATEWAY_TIMEOUT = 504;
/*    */   public static final int HTTP_GONE = 410;
/*    */   public static final int HTTP_INTERNAL_ERROR = 500;
/*    */   public static final int HTTP_LENGTH_REQUIRED = 411;
/*    */   public static final int HTTP_MOVED_PERM = 301;
/*    */   public static final int HTTP_MOVED_TEMP = 302;
/*    */   public static final int HTTP_MULT_CHOICE = 300;
/*    */   public static final int HTTP_NO_CONTENT = 204;
/*    */   public static final int HTTP_NOT_ACCEPTABLE = 406;
/*    */   public static final int HTTP_NOT_AUTHORITATIVE = 203;
/*    */   public static final int HTTP_NOT_FOUND = 404;
/*    */   public static final int HTTP_NOT_IMPLEMENTED = 501;
/*    */   public static final int HTTP_NOT_MODIFIED = 304;
/*    */   public static final int HTTP_OK = 200;
/*    */   public static final int HTTP_PARTIAL = 206;
/*    */   public static final int HTTP_PAYMENT_REQUIRED = 402;
/*    */   public static final int HTTP_PRECON_FAILED = 412;
/*    */   public static final int HTTP_PROXY_AUTH = 407;
/*    */   public static final int HTTP_REQ_TOO_LONG = 414;
/*    */   public static final int HTTP_RESET = 205;
/*    */   public static final int HTTP_SEE_OTHER = 303;
/*    */   public static final int HTTP_SERVER_ERROR = 500;
/*    */   public static final int HTTP_USE_PROXY = 305;
/*    */   public static final int HTTP_UNAUTHORIZED = 401;
/*    */   public static final int HTTP_UNSUPPORTED_TYPE = 415;
/*    */   public static final int HTTP_UNAVAILABLE = 503;
/*    */   public static final int HTTP_VERSION = 505;
/*    */ 
/*    */   protected HttpURLConnection(URL url)
/*    */   {
/*  5 */     super((URL)null); throw new RuntimeException("Stub!"); } 
/*    */   public abstract void disconnect();
/*    */ 
/*  7 */   public InputStream getErrorStream() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static boolean getFollowRedirects() { throw new RuntimeException("Stub!"); } 
/*  9 */   public Permission getPermission() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getRequestMethod() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getResponseCode() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getResponseMessage() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public static void setFollowRedirects(boolean auto) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setRequestMethod(String method) throws ProtocolException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean usingProxy();
/*    */ 
/* 16 */   public String getContentEncoding() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean getInstanceFollowRedirects() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setInstanceFollowRedirects(boolean followRedirects) { throw new RuntimeException("Stub!"); } 
/* 19 */   public long getHeaderFieldDate(String field, long defaultValue) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setFixedLengthStreamingMode(int contentLength) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setChunkedStreamingMode(int chunkLength) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.HttpURLConnection
 * JD-Core Version:    0.6.0
 */