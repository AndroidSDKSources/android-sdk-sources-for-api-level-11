/*    */ package javax.security.auth.x500;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.Serializable;
/*    */ import java.security.Principal;
/*    */ import java.util.Map;
/*    */ 
/*    */ public final class X500Principal
/*    */   implements Serializable, Principal
/*    */ {
/*    */   public static final String CANONICAL = "CANONICAL";
/*    */   public static final String RFC1779 = "RFC1779";
/*    */   public static final String RFC2253 = "RFC2253";
/*    */ 
/*    */   public X500Principal(byte[] name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public X500Principal(InputStream in) { throw new RuntimeException("Stub!"); } 
/*  7 */   public X500Principal(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public X500Principal(String name, Map<String, String> keywordMap) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 10 */   public byte[] getEncoded() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getName(String format) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getName(String format, Map<String, String> oidMap) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.security.auth.x500.X500Principal
 * JD-Core Version:    0.6.0
 */