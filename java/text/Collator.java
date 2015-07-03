/*    */ package java.text;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public abstract class Collator
/*    */   implements Comparator<Object>, Cloneable
/*    */ {
/*    */   public static final int NO_DECOMPOSITION = 0;
/*    */   public static final int CANONICAL_DECOMPOSITION = 1;
/*    */   public static final int FULL_DECOMPOSITION = 2;
/*    */   public static final int PRIMARY = 0;
/*    */   public static final int SECONDARY = 1;
/*    */   public static final int TERTIARY = 2;
/*    */   public static final int IDENTICAL = 3;
/*    */ 
/*    */   protected Collator()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int compare(Object object1, Object object2) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int compare(String paramString1, String paramString2);
/*    */ 
/*  9 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean equals(String string1, String string2) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract CollationKey getCollationKey(String paramString);
/*    */ 
/* 13 */   public int getDecomposition() { throw new RuntimeException("Stub!"); } 
/* 14 */   public static Collator getInstance() { throw new RuntimeException("Stub!"); } 
/* 15 */   public static Collator getInstance(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getStrength() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int hashCode();
/*    */ 
/* 18 */   public void setDecomposition(int value) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setStrength(int value) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.Collator
 * JD-Core Version:    0.6.0
 */