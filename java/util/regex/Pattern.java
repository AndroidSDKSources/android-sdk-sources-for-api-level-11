/*    */ package java.util.regex;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public final class Pattern
/*    */   implements Serializable
/*    */ {
/*    */   public static final int UNIX_LINES = 1;
/*    */   public static final int CASE_INSENSITIVE = 2;
/*    */   public static final int COMMENTS = 4;
/*    */   public static final int MULTILINE = 8;
/*    */   public static final int LITERAL = 16;
/*    */   public static final int DOTALL = 32;
/*    */   public static final int UNICODE_CASE = 64;
/*    */   public static final int CANON_EQ = 128;
/*    */ 
/*    */   Pattern()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Matcher matcher(CharSequence input) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String[] split(CharSequence input, int limit) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String[] split(CharSequence input) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String pattern() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int flags() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static Pattern compile(String regularExpression, int flags) throws PatternSyntaxException { throw new RuntimeException("Stub!"); } 
/* 13 */   public static Pattern compile(String pattern) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static boolean matches(String regularExpression, CharSequence input) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static String quote(String string) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.regex.Pattern
 * JD-Core Version:    0.6.0
 */