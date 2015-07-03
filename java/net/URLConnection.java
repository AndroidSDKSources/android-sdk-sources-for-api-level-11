/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.security.Permission;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public abstract class URLConnection
/*    */ {
/*    */   protected URL url;
/*    */   protected long ifModifiedSince;
/*    */   protected boolean useCaches;
/*    */   protected boolean connected;
/*    */   protected boolean doOutput;
/*    */   protected boolean doInput;
/*    */   protected boolean allowUserInteraction;
/*    */ 
/*    */   protected URLConnection(URL url)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void connect() throws IOException;
/*    */ 
/*  6 */   public boolean getAllowUserInteraction() { throw new RuntimeException("Stub!"); } 
/*  7 */   public Object getContent() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Object getContent(Class[] types) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getContentEncoding() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getContentLength() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getContentType() { throw new RuntimeException("Stub!"); } 
/* 12 */   public long getDate() { throw new RuntimeException("Stub!"); } 
/* 13 */   public static boolean getDefaultAllowUserInteraction() { throw new RuntimeException("Stub!"); } 
/* 14 */   public static String getDefaultRequestProperty(String field) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean getDefaultUseCaches() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean getDoInput() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean getDoOutput() { throw new RuntimeException("Stub!"); } 
/* 18 */   public long getExpiration() { throw new RuntimeException("Stub!"); } 
/* 19 */   public static FileNameMap getFileNameMap() { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getHeaderField(int pos) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Map<String, List<String>> getHeaderFields() { throw new RuntimeException("Stub!"); } 
/* 22 */   public Map<String, List<String>> getRequestProperties() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void addRequestProperty(String field, String newValue) { throw new RuntimeException("Stub!"); } 
/* 24 */   public String getHeaderField(String key) { throw new RuntimeException("Stub!"); } 
/* 25 */   public long getHeaderFieldDate(String field, long defaultValue) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getHeaderFieldInt(String field, int defaultValue) { throw new RuntimeException("Stub!"); } 
/* 27 */   public String getHeaderFieldKey(int posn) { throw new RuntimeException("Stub!"); } 
/* 28 */   public long getIfModifiedSince() { throw new RuntimeException("Stub!"); } 
/* 29 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 30 */   public long getLastModified() { throw new RuntimeException("Stub!"); } 
/* 31 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 32 */   public Permission getPermission() throws IOException { throw new RuntimeException("Stub!"); } 
/* 33 */   public String getRequestProperty(String field) { throw new RuntimeException("Stub!"); } 
/* 34 */   public URL getURL() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean getUseCaches() { throw new RuntimeException("Stub!"); } 
/* 36 */   public static String guessContentTypeFromName(String url) { throw new RuntimeException("Stub!"); } 
/* 37 */   public static String guessContentTypeFromStream(InputStream is) throws IOException { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setAllowUserInteraction(boolean newValue) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static synchronized void setContentHandlerFactory(ContentHandlerFactory contentFactory) { throw new RuntimeException("Stub!"); } 
/* 40 */   public static void setDefaultAllowUserInteraction(boolean allows) { throw new RuntimeException("Stub!"); } 
/* 41 */   public static void setDefaultRequestProperty(String field, String value) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void setDefaultUseCaches(boolean newValue) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void setDoInput(boolean newValue) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void setDoOutput(boolean newValue) { throw new RuntimeException("Stub!"); } 
/* 45 */   public static void setFileNameMap(FileNameMap map) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void setIfModifiedSince(long newValue) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void setRequestProperty(String field, String newValue) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void setUseCaches(boolean newValue) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void setConnectTimeout(int timeout) { throw new RuntimeException("Stub!"); } 
/* 50 */   public int getConnectTimeout() { throw new RuntimeException("Stub!"); } 
/* 51 */   public void setReadTimeout(int timeout) { throw new RuntimeException("Stub!"); } 
/* 52 */   public int getReadTimeout() { throw new RuntimeException("Stub!"); } 
/* 53 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.URLConnection
 * JD-Core Version:    0.6.0
 */