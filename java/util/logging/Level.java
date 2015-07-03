/*    */ package java.util.logging;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class Level
/*    */   implements Serializable
/*    */ {
/* 24 */   public static final Level OFF = null; public static final Level SEVERE = null; public static final Level WARNING = null; public static final Level INFO = null; public static final Level CONFIG = null; public static final Level FINE = null; public static final Level FINER = null; public static final Level FINEST = null; public static final Level ALL = null;
/*    */ 
/*    */   protected Level(String name, int level)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected Level(String name, int level, String resourceBundleName) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Level parse(String name) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getResourceBundleName() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final int intValue() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getLocalizedName() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.logging.Level
 * JD-Core Version:    0.6.0
 */