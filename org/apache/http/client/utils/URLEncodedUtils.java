/*   */ package org.apache.http.client.utils;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.URI;
/*   */ import java.util.List;
/*   */ import java.util.Scanner;
/*   */ import org.apache.http.HttpEntity;
/*   */ import org.apache.http.NameValuePair;
/*   */ 
/*   */ public class URLEncodedUtils
/*   */ {
/*   */   public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
/*   */ 
/*   */   public URLEncodedUtils()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static List<NameValuePair> parse(URI uri, String encoding) { throw new RuntimeException("Stub!"); } 
/* 6 */   public static List<NameValuePair> parse(HttpEntity entity) throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   public static boolean isEncoded(HttpEntity entity) { throw new RuntimeException("Stub!"); } 
/* 8 */   public static void parse(List<NameValuePair> parameters, Scanner scanner, String encoding) { throw new RuntimeException("Stub!"); } 
/* 9 */   public static String format(List<? extends NameValuePair> parameters, String encoding) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.client.utils.URLEncodedUtils
 * JD-Core Version:    0.6.0
 */