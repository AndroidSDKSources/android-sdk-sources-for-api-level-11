/*    */ package java.nio.charset;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.CharBuffer;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ import java.util.SortedMap;
/*    */ 
/*    */ public abstract class Charset
/*    */   implements Comparable<Charset>
/*    */ {
/*    */   protected Charset(String canonicalName, String[] aliases)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static SortedMap<String, Charset> availableCharsets() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Charset forName(String charsetName) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static boolean isSupported(String charsetName) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean contains(Charset paramCharset);
/*    */ 
/*    */   public abstract CharsetEncoder newEncoder();
/*    */ 
/*    */   public abstract CharsetDecoder newDecoder();
/*    */ 
/* 12 */   public final String name() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final Set<String> aliases() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String displayName() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String displayName(Locale l) { throw new RuntimeException("Stub!"); } 
/* 16 */   public final boolean isRegistered() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean canEncode() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final ByteBuffer encode(CharBuffer buffer) { throw new RuntimeException("Stub!"); } 
/* 19 */   public final ByteBuffer encode(String s) { throw new RuntimeException("Stub!"); } 
/* 20 */   public final CharBuffer decode(ByteBuffer buffer) { throw new RuntimeException("Stub!"); } 
/* 21 */   public final int compareTo(Charset charset) { throw new RuntimeException("Stub!"); } 
/* 22 */   public final boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 23 */   public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 24 */   public final String toString() { throw new RuntimeException("Stub!"); } 
/* 25 */   public static Charset defaultCharset() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.charset.Charset
 * JD-Core Version:    0.6.0
 */