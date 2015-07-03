/*    */ package org.apache.http.util;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ public class VersionInfo
/*    */ {
/*    */   public static final String UNAVAILABLE = "UNAVAILABLE";
/*    */   public static final String VERSION_PROPERTY_FILE = "version.properties";
/*    */   public static final String PROPERTY_MODULE = "info.module";
/*    */   public static final String PROPERTY_RELEASE = "info.release";
/*    */   public static final String PROPERTY_TIMESTAMP = "info.timestamp";
/*    */ 
/*    */   protected VersionInfo(String pckg, String module, String release, String time, String clsldr)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final String getPackage() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final String getModule() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final String getRelease() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final String getTimestamp() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final String getClassloader() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public static final VersionInfo[] loadVersionInfo(String[] pckgs, ClassLoader clsldr) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static final VersionInfo loadVersionInfo(String pckg, ClassLoader clsldr) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected static final VersionInfo fromMap(String pckg, Map info, ClassLoader clsldr) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.util.VersionInfo
 * JD-Core Version:    0.6.0
 */