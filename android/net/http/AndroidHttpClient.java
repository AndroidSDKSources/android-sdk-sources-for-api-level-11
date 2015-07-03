/*    */ package android.net.http;
/*    */ 
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.apache.http.HttpEntity;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.client.ClientProtocolException;
/*    */ import org.apache.http.client.HttpClient;
/*    */ import org.apache.http.client.ResponseHandler;
/*    */ import org.apache.http.client.methods.HttpUriRequest;
/*    */ import org.apache.http.conn.ClientConnectionManager;
/*    */ import org.apache.http.entity.AbstractHttpEntity;
/*    */ import org.apache.http.params.HttpParams;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ 
/*    */ public final class AndroidHttpClient
/*    */   implements HttpClient
/*    */ {
/*    */   public static long DEFAULT_SYNC_MIN_GZIP_BYTES;
/*    */ 
/*    */   AndroidHttpClient()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static AndroidHttpClient newInstance(String userAgent, Context context) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static AndroidHttpClient newInstance(String userAgent) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/*  9 */   public static void modifyRequestToAcceptGzipResponse(HttpRequest request) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static InputStream getUngzippedContent(HttpEntity entity) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 12 */   public HttpParams getParams() { throw new RuntimeException("Stub!"); } 
/* 13 */   public ClientConnectionManager getConnectionManager() { throw new RuntimeException("Stub!"); } 
/* 14 */   public HttpResponse execute(HttpUriRequest request) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public HttpResponse execute(HttpUriRequest request, HttpContext context) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public HttpResponse execute(HttpHost target, HttpRequest request) throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 19 */   public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler, HttpContext context) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 20 */   public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 21 */   public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler, HttpContext context) throws IOException, ClientProtocolException { throw new RuntimeException("Stub!"); } 
/* 22 */   public static AbstractHttpEntity getCompressedEntity(byte[] data, ContentResolver resolver) throws IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   public static long getMinGzipSize(ContentResolver resolver) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void enableCurlLogging(String name, int level) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void disableCurlLogging() { throw new RuntimeException("Stub!"); } 
/* 26 */   public static long parseDate(String dateString) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.http.AndroidHttpClient
 * JD-Core Version:    0.6.0
 */